package com.xyly.repository;

import com.xyly.entity.ScenicEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by daichao on 2018/1/16.
 */
public interface ScenicKeywordRepository extends JpaRepository<ScenicEntity,Long> {

    Page<ScenicEntity> findAll(Pageable pageable);
    Page<ScenicEntity> findByNameLike(Pageable pageable);
}
