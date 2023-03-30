package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@DS("target23jan")

public interface Target23FebOrderService extends IService<order> {
    // @Autowired
     @Transactional
     void InsertBatchColumn(List<order> orderList);
    //List<order> select2();

}
