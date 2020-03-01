package com.jiker.keju;

import java.io.*;

public class AppRunner {
    private String readFile(String testDataFile) {
        StringBuilder receipt = new StringBuilder();
        try { BufferedReader br = new BufferedReader(
                new FileReader("./src/main/resources/"+testDataFile));
            String line;
            while ((line = br.readLine())!=null){ ReadPara readPara = new ReadPara(line);
                Taxi taxi = new Taxi(readPara.getDistance(),readPara.getWaitTime());
                receipt.append(taxi.getReceipt()).append("\n"); }
        } catch (Exception e) {e.printStackTrace(); }
        return receipt.toString();
    }

    public static void main(String[] args) {

        String testDataFile = args[0];
        String receipt = "";
        AppRunner appRunner = new AppRunner();
        receipt = appRunner.readFile(testDataFile);
        System.out.println(receipt);
    }
}
