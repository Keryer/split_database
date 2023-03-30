package org.example.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.SourceOrderDao;

import org.example.entity.order;
import org.example.service.SourceOrderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@DS("sourcedb")
@Service
@Component
public class SourceOrderServiceImpl extends ServiceImpl<SourceOrderDao, order> implements SourceOrderService {
}
