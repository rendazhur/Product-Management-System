package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 单元测试
 * @ProjectName driver-analyse-improve
 * @Author cx
 * @date 2020/1/14
 */

@Service
@Transactional
public class ProductServiceImpl implements IProductService {


    @Autowired
    private IProductDao productDao;


    @Override
    public void save(Product product) throws Exception{
        productDao.save(product);
    }



    @Override
    public List<Product> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page, size);
        return productDao.findAll();
    }




}
