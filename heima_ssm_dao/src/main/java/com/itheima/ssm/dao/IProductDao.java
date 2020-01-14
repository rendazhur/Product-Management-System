package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: 单元测试
 * @ProjectName driver-analyse-improve
 * @Author cx
 * @date 2020/1/14
 */
public interface IProductDao {

    @Select("select * from product")
    public List<Product> findAll() throws Exception;
}
