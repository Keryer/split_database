package org.example;

import java.io.*;

public class TaskRecord {

    public int ReadCurrentLog(String PrivatePath) throws IOException {              //读取私有log中的已取出（占有）任务
        File PrivateLogFile = new File(PrivatePath);
        FileReader PrivateFileOut = new FileReader(PrivateLogFile);
        int PrivateReading = PrivateFileOut.read();
        int PrivateData= 0 ;
        while (PrivateReading != -1) {
            if(PrivateReading>47&PrivateReading<58){               //判断读出的是数字
                PrivateData *= 10;
                PrivateData = PrivateData+PrivateReading-48;
            }
            PrivateReading = PrivateFileOut.read();
        }
        PrivateFileOut.close();
        return PrivateData;
    }

    public void WriteCurrentLog(String PrivatePath, int record) throws IOException {        //输出
        File PrivateLogFile = new File(PrivatePath);
        FileWriter PrivateFileOut = new FileWriter(PrivateLogFile, false);
        PrintWriter PrivateOut = new PrintWriter(PrivateFileOut);
        PrivateOut.println(record+"\n");
        PrivateOut.close();
    }

    public boolean IsDoubleRecord(String PrivatePath) throws IOException {
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(PrivatePath));
        lineNumberReader.skip(Long.MAX_VALUE);
        int lineNumber = lineNumberReader.getLineNumber();
        if (lineNumber == 1)
            return false;
        else
            return true;
    }


}
