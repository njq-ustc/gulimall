package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author njq
 * @email 596638515@qq.com
 * @date 2020-11-29 22:19:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
