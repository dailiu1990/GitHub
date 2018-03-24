package com.xyly.service;

import com.xyly.entity.Menu;
import com.xyly.entity.TreeModel;
import com.xyly.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by daichao on 2018/1/24.
 */
@Service
@CacheConfig(cacheNames = "menus")
public class MenuServiceImpl {

    @Autowired
    private MenuRepository menuRepository;
    @PersistenceContext
    private EntityManager em;

    @Cacheable(value = "user-nav-menu")
    public List<Menu> getNavMenus(int uid) {
        List<Menu> list = null;
       /* if (SecurityUtil.isRoot()) {
            list = menuRepository.list();
        } else {*/
            list = menuRepository.findNavMenuByUserId(uid);
        //}
        List<Menu> menuList= (List<Menu>) TreeModel.buildTree(list);
        return menuList;
    }

    /*cache操作相关的注解中key都是spel表达式，字符串需要用''*/
    @Caching(put = @CachePut(key = "#menu.id"),
            evict = {@CacheEvict(key = "'list'"),
                    @CacheEvict(value = "user-nav-menu", allEntries = true)})
    public Menu insert(Menu menu){
        menuRepository.save(menu);
        return  menu;
    }

    @Caching(put = @CachePut(key = "#menu.id"),
            evict = {@CacheEvict(key = "'list'"),
                    @CacheEvict(value = "user-nav-menu", allEntries = true)})
    @Transactional
    public Menu update(Menu menu) {
        em.merge(menu);
        return menu;
    }

    @Caching(evict = {@CacheEvict(key = "'list'"),
                     @CacheEvict(value = "user-nav-menu", allEntries = true)})
    public void delete(Menu menu){
        menuRepository.delete(menu);
    }
}
