package com.xyly.repository;

import com.xyly.entity.HotelEntity;
import com.xyly.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by daichao on 2018/1/24.
 */
public interface MenuRepository extends JpaRepository<Menu,Long> {
    @Query(value = "SELECT * from menu where id in(" +
            "select menu_id from role_menu where role_id in (" +
            "select role_id from user_role where user_id = :id))",nativeQuery = true)
    List<Menu> findNavMenuByUserId(@Param("id")int uId);



}
