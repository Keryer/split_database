package org.example.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.order;


@DS("sourcedb")
public interface SourceOrderService extends IService<order> {

}
