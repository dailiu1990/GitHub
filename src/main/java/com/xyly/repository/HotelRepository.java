package com.xyly.repository;

import com.xyly.entity.HotelEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by daichao on 2018/1/16.
 */
public interface HotelRepository extends JpaRepository<HotelEntity,Long> {

    Page<HotelEntity> findAll(Pageable pageable);
    void deleteById(int id);
    Page<HotelEntity> findByNameLike(String name,Pageable pageable);
}
