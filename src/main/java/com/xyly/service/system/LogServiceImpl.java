package com.xyly.service.system;

import com.xyly.entity.system.LogEntity;
import com.xyly.repository.system.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by admin on 2018/3/14.
 */
@Service
public class LogServiceImpl {

    @Autowired
    LogRepository logRepository;
    @PersistenceContext
    private EntityManager em;

    public void save(LogEntity foodEntity){
        logRepository.save(foodEntity);
    }

    @Transactional
    public void merge(LogEntity foodEntity){
        em.merge(foodEntity);
    }

    public void deleteById(int id){
        logRepository.deleteById(id);
    }

    public Page<LogEntity> findAll(Pageable pageable){
        return  logRepository.findAll(pageable);
    }

    public Page<LogEntity> findByNameLike(String name, Pageable pageable){
        return  logRepository.findByUsernameLike(name,pageable);
    }
}
