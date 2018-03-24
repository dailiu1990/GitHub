package com.xyly.service;

import com.xyly.entity.FoodEntity;
import com.xyly.entity.ScenicEntity;
import com.xyly.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by daichao on 2018/1/17.
 */
@Service
public class FoodServiceImpl {

    @Autowired
    FoodRepository foodRepository;
    @PersistenceContext
    private EntityManager em;

    public void save(FoodEntity foodEntity){
        foodRepository.save(foodEntity);
    }

    @Transactional
    public void merge(FoodEntity foodEntity){
        em.merge(foodEntity);
    }
    public void deleteById(int id){
        foodRepository.deleteById(id);
    }
    public Page<FoodEntity> findAll(Pageable pageable){
        return  foodRepository.findAll(pageable);
    }

    public Page<FoodEntity> findByNameLike(String name,Pageable pageable){
        return  foodRepository.findByNameLike(name,pageable);
    }
}
