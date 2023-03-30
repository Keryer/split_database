package org.example.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.dynamicDataSource.DynamicDataSourceContextHolder;
import org.example.entity.order;
import org.example.service.SourceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@DS("sourcedb")
public class SourceOrderController {
    @Autowired
    private SourceOrderService sourceService;

    @RequestMapping("/select")
  //@Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = 20)
    public int select(@RequestParam(value = "source")String source) {
        String CurrentStartTime = "";
        String CurrentEndTime = "";
        switch (source) {
            case "2023Jan":
                DynamicDataSourceContextHolder.setDataSourceType("target23jan");
                CurrentStartTime = "2023-01-01 00:00:00";
                CurrentEndTime = "2023-01-31 23:59:59";
                break;
            case "2023Feb":
                DynamicDataSourceContextHolder.setDataSourceType("target23feb");
                CurrentStartTime = "2023-02-01 00:00:00";
                CurrentEndTime = "2023-02-28 23:59:59";
                break;
            case "2023Mar":
                DynamicDataSourceContextHolder.setDataSourceType("target23mar");
                CurrentStartTime = "2023-03-01 00:00:00";
                CurrentEndTime = "2023-03-31 23:59:59";
                break;
            case "2023Apr":
                DynamicDataSourceContextHolder.setDataSourceType("target23apr");
                CurrentStartTime = "2023-04-01 00:00:00";
                CurrentEndTime = "2023-04-30 23:59:59";
                break;
            case "2023May":
                DynamicDataSourceContextHolder.setDataSourceType("target23may");
                CurrentStartTime = "2023-05-01 00:00:00";
                CurrentEndTime = "2023-05-31 23:59:59";
                break;
            case "2023Jun":
                DynamicDataSourceContextHolder.setDataSourceType("target23jun");
                CurrentStartTime = "2023-06-01 00:00:00";
                CurrentEndTime = "2023-06-30 23:59:59";
                break;
            case "2023Jul":
                DynamicDataSourceContextHolder.setDataSourceType("target23jul");
                CurrentStartTime = "2023-07-01 00:00:00";
                CurrentEndTime = "2023-07-31 23:59:59";
                break;
            case "2023Aug":
                DynamicDataSourceContextHolder.setDataSourceType("target23aug");
                CurrentStartTime = "2023-08-01 00:00:00";
                CurrentEndTime = "2023-08-31 23:59:59";
                break;
            case "2023Sep":
                DynamicDataSourceContextHolder.setDataSourceType("target23sep");
                CurrentStartTime = "2023-09-01 00:00:00";
                CurrentEndTime = "2023-09-30 23:59:59";
                break;
            case "2023Oct":
                DynamicDataSourceContextHolder.setDataSourceType("target23oct");
                CurrentStartTime = "2023-10-01 00:00:00";
                CurrentEndTime = "2023-10-31 23:59:59";
                break;
            case "2023Nov":
                DynamicDataSourceContextHolder.setDataSourceType("target23nov");
                CurrentStartTime = "2023-11-01 00:00:00";
                CurrentEndTime = "2023-11-30 23:59:59";
                break;
            case "2023Dec":
                DynamicDataSourceContextHolder.setDataSourceType("target23dec");
                CurrentStartTime = "2023-12-01 00:00:00";
                CurrentEndTime = "2023-12-31 23:59:59";
                break;
            case "2022Jan":
                DynamicDataSourceContextHolder.setDataSourceType("target22jan");
                CurrentStartTime = "2022-01-01 00:00:00";
                CurrentEndTime = "2022-01-31 23:59:59";
                break;
            case "2022Feb":
                DynamicDataSourceContextHolder.setDataSourceType("target22feb");
                CurrentStartTime = "2022-02-01 00:00:00";
                CurrentEndTime = "2022-02-28 23:59:59";
                break;
            case "2022Mar":
                DynamicDataSourceContextHolder.setDataSourceType("target22mar");
                CurrentStartTime = "2022-03-01 00:00:00";
                CurrentEndTime = "2022-03-31 23:59:59";
                break;
            case "2022Apr":
                DynamicDataSourceContextHolder.setDataSourceType("target22apr");
                CurrentStartTime = "2022-04-01 00:00:00";
                CurrentEndTime = "2022-04-30 23:59:59";
                break;
            case "2022May":
                DynamicDataSourceContextHolder.setDataSourceType("target22may");
                CurrentStartTime = "2022-05-01 00:00:00";
                CurrentEndTime = "2022-05-31 23:59:59";
                break;
            case "2022Jun":
                DynamicDataSourceContextHolder.setDataSourceType("target22jun");
                CurrentStartTime = "2022-06-01 00:00:00";
                CurrentEndTime = "2022-06-30 23:59:59";
                break;
            case "2022Jul":
                DynamicDataSourceContextHolder.setDataSourceType("target22jul");
                CurrentStartTime = "2022-07-01 00:00:00";
                CurrentEndTime = "2022-07-31 23:59:59";
                break;
            case "2022Aug":
                DynamicDataSourceContextHolder.setDataSourceType("target22aug");
                CurrentStartTime = "2022-08-01 00:00:00";
                CurrentEndTime = "2022-08-31 23:59:59";
                break;
            case "2022Sep":
                DynamicDataSourceContextHolder.setDataSourceType("target22sep");
                CurrentStartTime = "2022-09-01 00:00:00";
                CurrentEndTime = "2022-09-30 23:59:59";
                break;
            case "2022Oct":
                DynamicDataSourceContextHolder.setDataSourceType("target22oct");
                CurrentStartTime = "2022-10-01 00:00:00";
                CurrentEndTime = "2022-10-31 23:59:59";
                break;
            case "2022Nov":
                DynamicDataSourceContextHolder.setDataSourceType("target22nov");
                CurrentStartTime = "2022-11-01 00:00:00";
                CurrentEndTime = "2022-11-30 23:59:59";
                break;
            case "2022Dec":
                DynamicDataSourceContextHolder.setDataSourceType("target22dec");
                CurrentStartTime = "2022-12-01 00:00:00";
                CurrentEndTime = "2022-12-31 23:59:59";
                break;
        }   //设置查询起止日期和数据源
        QueryWrapper qw = new QueryWrapper();                   //创建新的查询
        Date date = new Date();                                 //新建日期对象
        Page<order> page = new Page<> (1,50);       //查询第1页，每页50条数据
        SimpleDateFormat start = new SimpleDateFormat(CurrentStartTime);   //查询限定开始时间
        SimpleDateFormat end = new SimpleDateFormat(CurrentEndTime);     //查询限定结束时间
        String StartFormat = start.format(date);                //把上面产生的开始日期转换为字符串
        String EndFormat = end.format(date);                    //把上面产生的结束日期转换为字符串
        qw.ge("create_time",StartFormat);                //限定查询时间
        qw.le("create_time",EndFormat);
        sourceService.getBaseMapper().selectPage(page, qw);      //按条件分页查询
        long totalTarget = page.getTotal();
        DynamicDataSourceContextHolder.setDataSourceType("sourcedb");
        sourceService.getBaseMapper().selectPage(page, qw);      //按条件分页查询
        long sourceTotal = page.getTotal();
        return (int) (totalTarget*100/sourceTotal);              //直接返回百分比
    }
}