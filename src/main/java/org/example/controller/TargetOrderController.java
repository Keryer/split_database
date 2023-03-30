package org.example.controller;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.FileOperation;
import org.example.TaskRecord;
import org.example.dynamicDataSource.DataSource;
import org.example.dynamicDataSource.DataSourceType;
import org.example.dynamicDataSource.DynamicDataSourceContextHolder;
import org.example.entity.order;
import org.example.service.impl.SourceOrderServiceImpl;
import org.example.service.impl.TargetOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@DS("target23jan")
@Component
@ComponentScan
public class TargetOrderController {
    @Autowired
    public SourceOrderServiceImpl sourceService;
    @Autowired
    public TargetOrderServiceImpl targetService ;
    static public TargetOrderController targetOrderController;
    @PostConstruct
    public void init() {
        targetOrderController = this;
    }
    public void orderInsert(order order0){
        targetOrderController.targetService.getBaseMapper().insert(order0);
    }

    @Scheduled(cron = "0 0 0 2 * ?")
    @DataSource(value = DataSourceType.sourcedb)
    public void Trans() throws InterruptedException, IOException {
        DynamicDataSourceContextHolder.setDataSourceType("sourcedb");
        String []Year = new String[]{"2022","2023"};
        String []Month = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String CurrentStartTime = "";
        String CurrentEndTime = "";
        for(String currentYear : Year){
            for (String currentMonth : Month) {             //轮询年月
                switch (currentYear + currentMonth) {
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
                String CurrentDataSource = DynamicDataSourceContextHolder.getDataSourceType();  //存储当前设定的数据源
                FileOperation fileOperation = new FileOperation();
//                TaskRecord taskRecord = new TaskRecord();                                     //创建一个新的日志读取对象
//
                //获取当前任务的log路径
                String CurrentPath = "./";
                CurrentPath = CurrentPath + currentYear + currentMonth + ".log";
//                //在目录下寻找并打开日志文件
//                File file = new File(CurrentPath);
//                //文件不存在则创建文件
//                if (!file.exists()) {
//                    boolean f = file.createNewFile();
//                    FileOutputStream outStream = null;
//                    outStream = new FileOutputStream(file, true);
//                    outStream.write("0".getBytes());
//                }
//                //将文件中的记录数读取到CurrentRecord中
                int CurrentRecord = fileOperation.fileOperation(CurrentPath);
                //将当前开始页数设置为记录数/1000（每页1000条）
                int CurrentPage = CurrentRecord / 1000 + 1;


                QueryWrapper qw = new QueryWrapper();                       //创建查找规则对象
                Date date = new Date();                                     //创建日期对象
                Page<order> page=new Page<>(CurrentPage, 1000);        //决定当前页
                //设置当前的查找规则的起止日期
                SimpleDateFormat start = new SimpleDateFormat(CurrentStartTime);
                SimpleDateFormat end = new SimpleDateFormat(CurrentEndTime);
                //将日期形式的日期转化为字符串形式
                String startformat = start.format(date);
                String endformat = end.format(date);
                //设置规则为晚于开始日期，早于截至日期
                qw.ge("create_time", startformat);
                qw.le("create_time", endformat);

                boolean hasNextPage = true;             //标记是否还有下一页，默认为有
                long hasTransferred = 0;                //已完成转移记录数
                while (hasNextPage) {
                    DynamicDataSourceContextHolder.setDataSourceType("sourcedb");               //设置当前数据源为总库
                    Page<order> ipage = targetOrderController.sourceService.getBaseMapper().selectPage(page, qw);     //分页查找
                    if(ipage.getTotal() == 0){                                                  //判断总库中是否有这个月的数据
                        hasNextPage = false;                                                    //如果没有则没有下一页
                        continue;                                                               //结束循环，进入到下一个月
                    }

                    List<order> orderList = ipage.getRecords();                                 //将当前页的数据输出到一个list里
                    hasTransferred = (CurrentPage - 1) * 1000;                                  //更新已经转移的数据量为这一页之前的所有数据之和
                    boolean singleInsert = false;                                               //建立一个需要单条插入的标记
                    boolean insertIsRequired = false;                                           //建立一个当前页需要插入的标记


                    for (order order3 : orderList) {                                            //冲突检测
                        QueryWrapper qw1 = new QueryWrapper();
                        Long id = order3.getid();
                        qw1.eq("id", id);

                        DynamicDataSourceContextHolder.setDataSourceType(CurrentDataSource);
                        List selectOrderList = targetOrderController.targetService.getBaseMapper().selectList(qw1);

                        if (!selectOrderList.isEmpty()) {
                            singleInsert = true;
                            hasTransferred++;
                        } else {
                            insertIsRequired = true;
                            if (singleInsert && insertIsRequired)
                                break;
                        }
                    }                                                                           //冲突检查结束


                    if (singleInsert && insertIsRequired) {                                     //如果必要，进行单条记录插入
                        System.out.println("single");
                        for (order order3 : orderList) {
                            QueryWrapper qw1 = new QueryWrapper();
                            Long id = order3.getid();
                            qw1.eq("id", id);
                            DynamicDataSourceContextHolder.setDataSourceType(CurrentDataSource);
                            List<order> selectOrderList = targetOrderController.targetService.getBaseMapper().selectList(qw1);
                            if (selectOrderList.isEmpty()) {
                                orderInsert(order3);
                            }
                        }
                    } else if (!singleInsert) {                                                 //进行批量插入
                        DynamicDataSourceContextHolder.setDataSourceType(CurrentDataSource);
                        targetOrderController.targetService.InsertBatchColumn(orderList);
                        hasTransferred += 1000;
                    }

                    if (page.getCurrent()==page.getPages())                                     //检查是否还有下一页
                        hasNextPage = false;

                    CurrentPage++;
                    page.setCurrent(CurrentPage);                                               //当前页码+1

                    if (hasTransferred > page.getTotal())
                        hasTransferred = page.getTotal();
                    TaskRecord taskRecord = new TaskRecord();
                    taskRecord.WriteCurrentLog(CurrentPath, (int) hasTransferred);              //把已完成的任务数量写入日志
                }

                if (hasTransferred == page.getTotal())                                          //判断任务是否已经完成
                    System.out.println("\n"+currentYear+currentMonth+"任务已完成");
            }
        }
    }
}