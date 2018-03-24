package com.xyly.service;

import com.xyly.entity.ScenicEntity;
import com.xyly.repository.ScenicRepository;
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
public class ScenicKeywordRepository {
    @Autowired
    ScenicRepository scenicRepository;
    @PersistenceContext
    private EntityManager em;

    public void deleteById(int id){
        scenicRepository.deleteById(id);
    }
    public void save(ScenicEntity scenicEntity){
        scenicRepository.save(scenicEntity);
    }
    @Transactional
    public void merge(ScenicEntity scenicEntity){
        em.merge(scenicEntity);
    }
    public Page<ScenicEntity> findAll(Pageable pageable){
        return  scenicRepository.findAll(pageable);
    }

}
