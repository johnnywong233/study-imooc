package com.myimooc.mydatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myimooc.mydatalog.domain.Product;

/**
 * @author zc
 * @version 1.0 2017-09-13
 * @title 产品DAO类
 * @describe 产品相关数据访问
 */
public interface ProductDao extends JpaRepository<Product, Long> {

    public Product findById(Long id);

}
