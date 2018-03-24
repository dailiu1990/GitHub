package com.xyly.repository;

import com.xyly.entity.TourismEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by daichao on 2018/1/16.
 */
public interface TourismRepository extends JpaRepository<TourismEntity,Long> {

    Page<TourismEntity> findAll(Pageable pageable);
    void deleteById(int id);
    Page<TourismEntity> findByNameLike(String name,Pageable pageable);
}
