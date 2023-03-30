package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.order;

@Mapper
public interface BatchMapper extends TargetOrderMapper<order> {

}
