package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
//@DS("target23jan")
public interface TargetOrderMapper<T> extends BaseMapper<T> {
    Integer insertBatchSomeColumn(List<T> entityList);

}