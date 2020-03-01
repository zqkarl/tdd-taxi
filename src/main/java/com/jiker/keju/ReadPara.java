package com.jiker.keju;

public class ReadPara {
    private String line;

    public ReadPara(String line) {
        this.line = line;
    }

    public int getDistance() {
        String a = line.split("公")[0];
        return Integer.valueOf(a);
    }
    public int getWaitTime() {
        return Integer.valueOf(line.split("待")[1].split("分")[0]);
    }
}
