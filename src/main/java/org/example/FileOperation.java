package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    TaskRecord taskRecord = new TaskRecord();
    void fileIsExist(String CurrentPath) throws IOException {
        //在目录下寻找并打开日志文件
        File file = new File(CurrentPath);
        //文件不存在则创建文件
        if (!file.exists()) {
            boolean f = file.createNewFile();
            FileOutputStream outStream = null;
            outStream = new FileOutputStream(file, true);
            outStream.write("0".getBytes());
        }
    }

    int getCurrentProgress(String CurrentPath) throws IOException {
        taskRecord.ReadCurrentLog(CurrentPath);
        return 0;
    }

    public int fileOperation(String CurrentPath) throws IOException {
        fileIsExist(CurrentPath);
        return getCurrentProgress(CurrentPath);
    }
}
