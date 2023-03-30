package org.example.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.order;


@DS("sourcedb")
@Mapper
public interface SourceOrderDao extends BaseMapper<order> {

}
