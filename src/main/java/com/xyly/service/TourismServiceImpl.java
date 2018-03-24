package com.xyly.service;

import com.xyly.entity.FoodEntity;
import com.xyly.entity.TourismEntity;
import com.xyly.repository.TourismRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by daichao on 2018/1/17.
 */

public class TourismServiceImpl {
    @Autowired
    TourismRepository tourismRepository;

    @PersistenceContext
    private EntityManager em;

    public void deleteById(int id){
        tourismRepository.deleteById(id);
    }
    public void save(TourismEntity tourismEntity){
        tourismRepository.save(tourismEntity);
    }
    @Transactional
    public void merge(TourismEntity tourismEntity){
        em.merge(tourismEntity);
    }
    public Page<TourismEntity> findAll(Pageable pageable){
        return  tourismRepository.findAll(pageable);
    }

}

