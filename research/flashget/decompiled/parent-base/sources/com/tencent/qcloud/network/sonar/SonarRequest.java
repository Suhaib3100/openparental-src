package com.tencent.qcloud.network.sonar;

/* loaded from: classes7.dex */
public class SonarRequest {
    private String host;
    private String ip;
    private boolean isNetworkAvailable;

    public SonarRequest(String str) {
        this.host = str;
    }

    public String getHost() {
        return this.host;
    }

    public String getIp() {
        return this.ip;
    }

    public boolean isNetworkAvailable() {
        return this.isNetworkAvailable;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setNetworkAvailable(boolean z4) {
        this.isNetworkAvailable = z4;
    }

    public SonarRequest(String str, String str2) {
        this.host = str;
        this.ip = str2;
    }
}
