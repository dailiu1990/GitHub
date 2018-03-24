package com.xyly.repository;

import com.xyly.entity.FoodEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by daichao on 2018/1/16.
 */
public interface FoodRepository extends JpaRepository<FoodEntity,Long> {

    Page<FoodEntity> findAll(Pageable pageable);
    void deleteById(int id);
    Page<FoodEntity> findByNameLike(String name,Pageable pageable);
}
