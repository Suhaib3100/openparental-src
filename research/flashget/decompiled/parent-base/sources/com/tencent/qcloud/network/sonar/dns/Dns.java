package com.tencent.qcloud.network.sonar.dns;

import android.annotation.SuppressLint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"MissingPermission"})
/* loaded from: classes7.dex */
public class Dns {
    public static List<String> getLocalHost() {
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ProtectedSandApp.s("嫴\u0001")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return arrayList;
    }
}
