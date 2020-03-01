package com.jiker.keju;

import java.io.*;

public class AppRunner {
    private String readFile(String testDataFile) {
        String receipt = "";
        try {
            System.out.println(System.getProperty("user.dir"));
            InputStreamReader isr = new InputStreamReader(new FileInputStream("./src/main/resources/"+testDataFile), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine())!=null){
                ReadPara readPara = new ReadPara(line);
                Taxi taxi = new Taxi(readPara.getDistance(),readPara.getWaitTime());
                receipt += taxi.getReceipt() + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return receipt;
    }

    public static void main(String[] args) {
        /*TODO
          1. args[0]为resources下的测试数据文件名，例如传入的args[0]值为"testData.txt"，注意并不包含文件路径。
          2. 你写的程序将把testDataFile作为参数加载此文件并读取文件内的测试数据，并对每条测试数据计算结果。
          3. 将所有计费结果拼接并使用\n分割，然后保存到receipt变量中。
         */
        String testDataFile = args[0];
        String receipt = "";
        AppRunner appRunner = new AppRunner();
        receipt = appRunner.readFile(testDataFile);
        System.out.println(receipt);
    }
}
