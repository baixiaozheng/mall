package com.xb.mall.product.repository;

import com.xb.mall.product.entity.Product;
import com.xb.mall.product.enums.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author baixiaozheng
 * @date 2020/6/4 19:15
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * 根据id查询商品
     * @param id 商品id
     * @return 商品信息
     */
    @Override
    Optional<Product> findById(Long id);

    /**
     * 根据状态查询商品
     * @param status 状态
     * @return 商品列表
     */
    List<Product> findByProductStatus(ProductStatus status);

    /**
     * 根据id列表查询商品信息
     * @param ids id的列表
     * @return 商品列表
     */
    List<Product> findByIdIn(List<Long> ids);


}
