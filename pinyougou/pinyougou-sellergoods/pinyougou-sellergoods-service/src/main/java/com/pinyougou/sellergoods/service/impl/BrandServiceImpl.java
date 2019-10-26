package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.pojo.TbBrand;

/**
 * 注意：该Service注解是alibaba的，不是spring的
 */
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> queryAll() {

        return brandMapper.queryAll();
    }

}
