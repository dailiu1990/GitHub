package com.xyly.service.system;

import com.xyly.entity.system.BlackListEntity;
import com.xyly.repository.system.BlackListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by admin on 2018/3/14.
 */
@Service
public class BlackListServiceImpl {
    @Autowired
    BlackListRepository blackListRepository;

    @PersistenceContext
    private EntityManager em;

    public void save(BlackListEntity blackListEntity){
        blackListRepository.save(blackListEntity);
    }

    @Transactional
    public void merge(BlackListEntity blackListEntity){
        em.merge(blackListEntity);
    }
    public void deleteById(int id){
        blackListRepository.deleteById(id);
    }
    public Page<BlackListEntity> findAll(Pageable pageable){
        return  blackListRepository.findAll(pageable);
    }

    public Page<BlackListEntity> findByNameLike(String name,Pageable pageable){
        return  blackListRepository.findByOperationLike(name,pageable);
    }



}
