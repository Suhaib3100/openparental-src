package com.tencent.qcloud.network.sonar.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
public class Utils {
    public static void closeAllCloseable(Closeable... closeableArr) {
        if (closeableArr == null || closeableArr.length <= 0) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ProtectedSandApp.s("孎\u0001"));
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3)) {
                if (!networkCapabilities.hasTransport(2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
