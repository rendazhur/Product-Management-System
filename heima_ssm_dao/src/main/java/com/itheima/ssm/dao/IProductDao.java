package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: 单元测试
 * @ProjectName driver-analyse-improve
 * @Author cx
 * @date 2020/1/14
 */
public interface IProductDao {
    //根据id查询产品
    @Select("select * from product where id = #{id}")
    public Product findById(String id);

    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus)values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product) throws Exception;
}
