package com.tencent.qcloud.network.sonar.ping;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PingResult {
    public float avg;
    public int count;
    public int dropped;
    public final String host;
    public final int interval;
    public final String ip;
    public float max;
    public float min;
    public final String result;
    public int sent;
    public final int size;
    public float stddev;
    public long timeConsuming;
    private final String lastLinePrefix = ProtectedSandApp.s("嬉\u0001");
    private final String packetWords = ProtectedSandApp.s("嬊\u0001");
    private final String receivedWords = ProtectedSandApp.s("嬋\u0001");

    PingResult(String str, String str2, String str3, int i4, int i5) {
        this.result = str;
        this.ip = str3;
        this.size = i4;
        this.interval = i5;
        this.host = str2;
        parseResult();
    }

    private void parsePacketLine(String str) {
        String[] split = str.split(ProtectedSandApp.s("嬌\u0001"));
        if (split.length != 4) {
            return;
        }
        if (split[0].length() > 20) {
            String str2 = split[0];
            this.count = Integer.parseInt(str2.substring(0, str2.length() - 20));
        }
        if (split[1].length() > 9) {
            String str3 = split[1];
            this.sent = Integer.parseInt(str3.substring(0, str3.length() - 9).trim());
        }
        this.dropped = this.count - this.sent;
    }

    private void parseResult() {
        try {
            for (String str : this.result.split(ProtectedSandApp.s("嬍\u0001"))) {
                if (str.contains(ProtectedSandApp.s("嬊\u0001"))) {
                    parsePacketLine(str);
                } else if (str.contains(ProtectedSandApp.s("嬉\u0001"))) {
                    parseRttLine(str);
                }
            }
        } catch (Exception e4) {
            if (SonarLog.openLog) {
                e4.printStackTrace();
            }
        }
    }

    private void parseRttLine(String str) {
        String[] split = str.substring(23, str.length() - 3).split(ProtectedSandApp.s("嬎\u0001"));
        if (split.length != 4) {
            return;
        }
        this.min = Float.parseFloat(trimNoneDigital(split[0]));
        this.avg = Float.parseFloat(trimNoneDigital(split[1]));
        this.max = Float.parseFloat(trimNoneDigital(split[2]));
        this.stddev = Float.parseFloat(trimNoneDigital(split[3]));
    }

    static String trimNoneDigital(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length];
        int i4 = 0;
        for (char c5 : charArray) {
            if ((c5 >= '0' && c5 <= '9') || c5 == '.') {
                cArr[i4] = c5;
                i4++;
            }
        }
        return new String(cArr, 0, i4);
    }

    public String encode() {
        String s4 = ProtectedSandApp.s("嬏\u0001");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("嬐\u0001"), ProtectedSandApp.s("嬑\u0001"));
            jSONObject.put(ProtectedSandApp.s("嬒\u0001"), this.ip);
            jSONObject.put(ProtectedSandApp.s("嬓\u0001"), this.host);
            jSONObject.put(ProtectedSandApp.s("嬔\u0001"), String.format(s4, Float.valueOf(this.max)));
            jSONObject.put(ProtectedSandApp.s("嬕\u0001"), String.format(s4, Float.valueOf(this.min)));
            jSONObject.put(ProtectedSandApp.s("嬖\u0001"), String.format(s4, Float.valueOf(this.avg)));
            jSONObject.put(ProtectedSandApp.s("嬗\u0001"), String.format(s4, Float.valueOf(this.stddev)));
            int i4 = this.count;
            String s5 = ProtectedSandApp.s("嬘\u0001");
            if (i4 == 0) {
                jSONObject.put(s5, ProtectedSandApp.s("嬙\u0001"));
            } else {
                jSONObject.put(s5, String.format(s4, Float.valueOf(this.dropped / this.count)));
            }
            jSONObject.put(ProtectedSandApp.s("嬚\u0001"), this.count);
            jSONObject.put(ProtectedSandApp.s("嬛\u0001"), this.size);
            jSONObject.put(ProtectedSandApp.s("嬜\u0001"), this.sent);
            jSONObject.put(ProtectedSandApp.s("嬝\u0001"), this.interval);
            jSONObject.put(ProtectedSandApp.s("嬞\u0001"), System.currentTimeMillis() / 1000);
            jSONObject.put(ProtectedSandApp.s("嬟\u0001"), this.timeConsuming);
            return jSONObject.toString();
        } catch (JSONException e4) {
            if (!SonarLog.openLog) {
                return null;
            }
            e4.printStackTrace();
            return null;
        }
    }

    public float getLoss() {
        int i4 = this.count;
        if (i4 == 0) {
            return 1.0f;
        }
        return this.dropped / i4;
    }

    public int getResponseNum() {
        return this.sent;
    }

    public String toString() {
        return encode();
    }
}
