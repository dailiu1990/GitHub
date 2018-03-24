package com.xyly.service;

import com.xyly.entity.FoodEntity;
import com.xyly.entity.HotelEntity;
import com.xyly.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by daichao on 2018/1/17.
 */
@Service
public class HotelServiceImpl {
    @Autowired
    HotelRepository hotelRepository;
    @PersistenceContext
    private EntityManager em;

    public void save(HotelEntity hotelEntity){
        hotelRepository.save(hotelEntity);
    }

    public void deleteById(int id){
        hotelRepository.deleteById(id);
    }

    public  void merge(HotelEntity hotelEntity){
        em.merge(hotelEntity);
    }

    public Page<HotelEntity> findAll(Pageable pageable){
        return  hotelRepository.findAll(pageable);
    }

    public Page<HotelEntity> findByNameLike(String name,Pageable pageable){
        return  hotelRepository.findByNameLike(name,pageable);
    }
}
