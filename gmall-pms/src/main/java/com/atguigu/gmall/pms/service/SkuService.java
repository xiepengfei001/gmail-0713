package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SkuEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xiepengfei
 * @email xiepengfei1994@163.com
 * @date 2022-11-20 20:51:40
 */
public interface SkuService extends IService<SkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

