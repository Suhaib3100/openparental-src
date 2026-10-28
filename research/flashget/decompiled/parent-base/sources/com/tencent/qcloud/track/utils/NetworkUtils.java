package com.tencent.qcloud.track.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* loaded from: classes7.dex */
public class NetworkUtils {
    public static String getLocalMachineIP() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return null;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLinkLocalAddress() && nextElement2.getHostAddress() != null) {
                            String hostAddress = nextElement2.getHostAddress();
                            if (!hostAddress.equals(ProtectedSandApp.s("宎\u0001")) && isIPAddr(hostAddress)) {
                                return hostAddress;
                            }
                        }
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    public static String getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(ProtectedSandApp.s("宏\u0001"))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return ProtectedSandApp.s("宖\u0001");
        }
        if (activeNetworkInfo.getType() == 1) {
            return ProtectedSandApp.s("宐\u0001");
        }
        int type = activeNetworkInfo.getType();
        String s4 = ProtectedSandApp.s("宑\u0001");
        if (type != 0) {
            return s4;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return ProtectedSandApp.s("宕\u0001");
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return ProtectedSandApp.s("宔\u0001");
            case 13:
            case 18:
            case 19:
                return ProtectedSandApp.s("宓\u0001");
            case 20:
                return ProtectedSandApp.s("宒\u0001");
            default:
                return s4;
        }
    }

    public static boolean isIPAddr(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String[] split = str.split(ProtectedSandApp.s("宗\u0001"));
                if (split.length != 4) {
                    return false;
                }
                for (String str2 : split) {
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt < 0 || parseInt > 255) {
                        return false;
                    }
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean isProxy() {
        String property = System.getProperty(ProtectedSandApp.s("官\u0001"));
        String property2 = System.getProperty(ProtectedSandApp.s("宙\u0001"));
        if (property2 == null) {
            property2 = ProtectedSandApp.s("定\u0001");
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }
}
