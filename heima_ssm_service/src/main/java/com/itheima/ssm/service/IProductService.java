package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * @Description: 单元测试
 * @ProjectName driver-analyse-improve
 * @Author cx
 * @date 2020/1/14
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;


}
