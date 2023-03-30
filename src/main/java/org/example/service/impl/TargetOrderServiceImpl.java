package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.BatchMapper;
import org.example.entity.order;
import org.example.service.Target23FebOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@DS("target23jan")
@Service
@Component
public  class TargetOrderServiceImpl extends ServiceImpl<BatchMapper,order> implements Target23FebOrderService {
    //@DataSource(value = DataSourceType.target23jan)
    @Autowired
    private BatchMapper batchMapper;
   // @Autowired
    @Override
    @Transactional
    public void InsertBatchColumn(List<order> orderList){
        batchMapper.insertBatchSomeColumn(orderList);
    }

}
