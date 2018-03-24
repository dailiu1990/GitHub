package com.xyly.repository.system;

import com.xyly.entity.system.LogEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2018/3/14.
 */
public interface LogRepository extends JpaRepository<LogEntity,Long> {

    Page<LogEntity> findAll(Pageable pageable);
    void deleteById(int id);
    Page<LogEntity> findByUsernameLike(String name,Pageable pageable);
}