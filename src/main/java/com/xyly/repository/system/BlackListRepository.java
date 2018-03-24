package com.xyly.repository.system;

import com.xyly.entity.system.BlackListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2018/3/14.
 */
public interface BlackListRepository extends JpaRepository<BlackListEntity, Long> {

    Page<BlackListEntity> findAll(Pageable pageable);

    void deleteById(int id);

  //  Page<BlackListEntity>
  Page<BlackListEntity> findByOperationLike(String name, Pageable pageable);
}

