package com.tencent.liteav.base.system;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class LiteavSystemInfo {
    private static final int APP_SYSTEM_METHOD_DEFAULT_GET_INTERVAL_MS = 1000;
    private static final int NETWORK_TYPE_2G = 4;
    private static final int NETWORK_TYPE_3G = 3;
    private static final int NETWORK_TYPE_4G = 2;
    private static final int NETWORK_TYPE_5G = 6;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = 1;
    private static final int NETWORK_TYPE_WIRED = 5;
    private static final String EXT_KEY_BUILD_VERSION_INT = ProtectedSandApp.s("匧\u0001");
    private static final String EXT_KEY_BUILD_BRAND = ProtectedSandApp.s("匨\u0001");
    private static final String EXT_KEY_BUILD_MANUFACTURER = ProtectedSandApp.s("匩\u0001");
    private static final String EXT_KEY_APP_NAME = ProtectedSandApp.s("匪\u0001");
    private static final String EXT_KEY_APP_BACKGROUND = ProtectedSandApp.s("匫\u0001");
    private static final String EXT_KEY_BUILD_HARDWARE = ProtectedSandApp.s("匬\u0001");
    private static final String EXT_KEY_APP_PACKAGE_NAME = ProtectedSandApp.s("匭\u0001");
    private static final String TAG = ProtectedSandApp.s("匮\u0001");
    private static final String EXT_KEY_APP_VERSION = ProtectedSandApp.s("匯\u0001");
    private static final String EXT_KEY_BUILD_BOARD = ProtectedSandApp.s("匰\u0001");
    private static final String EXT_KEY_BUILD_VERSION = ProtectedSandApp.s("匱\u0001");
    private static final String EXT_KEY_BUILD_MODEL = ProtectedSandApp.s("匲\u0001");
    private static final com.tencent.liteav.base.util.p<String> sModel = new com.tencent.liteav.base.util.p<>(h.a());
    private static final com.tencent.liteav.base.util.p<String> sBrand = new com.tencent.liteav.base.util.p<>(i.a());
    private static final com.tencent.liteav.base.util.p<String> sManufacturer = new com.tencent.liteav.base.util.p<>(j.a());
    private static final com.tencent.liteav.base.util.p<String> sHardware = new com.tencent.liteav.base.util.p<>(k.a());
    private static final com.tencent.liteav.base.util.p<String> sSystemOSVersion = new com.tencent.liteav.base.util.p<>(l.a());
    private static final com.tencent.liteav.base.util.p<Integer> sSystemOSVersionInt = new com.tencent.liteav.base.util.p<>(m.a());
    private static final com.tencent.liteav.base.util.p<String> sBoard = new com.tencent.liteav.base.util.p<>(n.a());
    private static final com.tencent.liteav.base.util.p<String> sAppPackageName = new com.tencent.liteav.base.util.p<>(o.a());
    private static final com.tencent.liteav.base.util.p<String> sAppName = new com.tencent.liteav.base.util.p<>(d.a());
    private static final com.tencent.liteav.base.util.p<String> sAppVersion = new com.tencent.liteav.base.util.p<>(e.a());
    private static final com.tencent.liteav.base.util.p<String> sUUID = new com.tencent.liteav.base.util.p<>(f.a());
    private static final com.tencent.liteav.base.util.p<String[]> sCpuABIs = new com.tencent.liteav.base.util.p<>(g.a());
    private static int sLastNetworkType = 0;
    private static final com.tencent.liteav.base.b.a sNetworkTypeThrottler = new com.tencent.liteav.base.b.a(1000);
    private static int sLastGateway = 0;
    private static final com.tencent.liteav.base.b.a sGatewayThrottler = new com.tencent.liteav.base.b.a(1000);
    private static boolean sLastMicPermission = false;
    private static final com.tencent.liteav.base.b.a sMicPermissionThrottler = new com.tencent.liteav.base.b.a(1000);

    public static synchronized int getAppBackgroundState() {
        boolean b5;
        synchronized (LiteavSystemInfo.class) {
            b5 = com.tencent.liteav.base.util.i.a().b();
        }
        return b5 ? 1 : 0;
    }

    public static String getAppName() {
        return sAppName.a();
    }

    public static String getAppPackageName() {
        return sAppPackageName.a();
    }

    public static synchronized int getAppThreadSize() {
        int activeCount;
        synchronized (LiteavSystemInfo.class) {
            try {
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                while (threadGroup.getParent() != null) {
                    threadGroup = threadGroup.getParent();
                }
                activeCount = threadGroup.activeCount();
            } catch (Throwable th) {
                throw th;
            }
        }
        return activeCount;
    }

    public static String getAppVersion() {
        return sAppVersion.a();
    }

    public static synchronized boolean getAudioRecordPermission() {
        boolean z4;
        synchronized (LiteavSystemInfo.class) {
            try {
                if (sMicPermissionThrottler.a()) {
                    sLastMicPermission = getAudioRecordPermissionFromSystem();
                }
                z4 = sLastMicPermission;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    private static boolean getAudioRecordPermissionFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        return applicationContext.checkPermission(ProtectedSandApp.s("匳\u0001"), Process.myPid(), Process.myUid()) == 0;
    }

    public static String getBoard() {
        return sBoard.a();
    }

    public static String getBrand() {
        return sBrand.a();
    }

    public static String getDeviceUuid() {
        return sUUID.a();
    }

    public static synchronized int getGateway() {
        int i4;
        synchronized (LiteavSystemInfo.class) {
            try {
                if (sGatewayThrottler.a()) {
                    sLastGateway = getGatewayFromSystem();
                }
                i4 = sLastGateway;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    private static int getGatewayFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            return ((WifiManager) applicationContext.getSystemService(ProtectedSandApp.s("匴\u0001"))).getDhcpInfo().gateway;
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("匮\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("匵\u0001"))), new Object[0]);
            return 0;
        }
    }

    public static String getHardware() {
        return sHardware.a();
    }

    public static String getManufacturer() {
        return sManufacturer.a();
    }

    public static String getModel() {
        return sModel.a();
    }

    public static synchronized int getNetworkType() {
        int i4;
        synchronized (LiteavSystemInfo.class) {
            try {
                if (sNetworkTypeThrottler.a()) {
                    sLastNetworkType = getNetworkTypeFromSystem();
                }
                i4 = sLastNetworkType;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    private static int getNetworkTypeFromSystem() {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ProtectedSandApp.s("匶\u0001"))) == null) {
            return 0;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        if (networkInfo.getType() == 9) {
            return 5;
        }
        if (networkInfo.getType() == 1) {
            return 1;
        }
        if (networkInfo.getType() != 0) {
            return 0;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService(ProtectedSandApp.s("匷\u0001"));
            if (telephonyManager == null) {
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    break;
                default:
                    if (getSystemOSVersionInt() < 29 || networkType != 20) {
                    }
                    break;
                case 13:
                    return 2;
            }
            return 0;
        }
    }

    public static synchronized String getProperty(String str) {
        String str2;
        synchronized (LiteavSystemInfo.class) {
            try {
                str2 = System.getProperty(str);
                try {
                    Log.i(ProtectedSandApp.s("匮\u0001"), ProtectedSandApp.s("匸\u0001") + str + ProtectedSandApp.s("匹\u0001") + str2, new Object[0]);
                } catch (Throwable th) {
                    th = th;
                    Log.e(ProtectedSandApp.s("匮\u0001"), ProtectedSandApp.s("区\u0001").concat(String.valueOf(th)), new Object[0]);
                    return str2;
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = null;
            }
        }
        return str2;
    }

    public static int[] getScreenSizeInPixels() {
        int[] iArr = {0, 0};
        Context applicationContext = ContextUtils.getApplicationContext();
        String s4 = ProtectedSandApp.s("匮\u0001");
        if (applicationContext == null) {
            Log.e(s4, ProtectedSandApp.s("医\u0001"), new Object[0]);
            return iArr;
        }
        try {
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService(ProtectedSandApp.s("匼\u0001"));
            if (windowManager == null) {
                Log.e(s4, ProtectedSandApp.s("匽\u0001"), new Object[0]);
                return iArr;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            iArr[1] = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            return iArr;
        } catch (Throwable th) {
            Log.e(s4, ProtectedSandApp.s("匾\u0001").concat(String.valueOf(th)), new Object[0]);
            return iArr;
        }
    }

    public static String[] getSupportABIs() {
        return sCpuABIs.a();
    }

    public static String getSystemOSVersion() {
        return sSystemOSVersion.a();
    }

    public static int getSystemOSVersionInt() {
        return sSystemOSVersionInt.a().intValue();
    }

    public static synchronized String getSystemProperty(String str) {
        String str2;
        synchronized (LiteavSystemInfo.class) {
            str2 = null;
            try {
                Object invoke = Class.forName(ProtectedSandApp.s("匿\u0001")).getMethod(ProtectedSandApp.s("區\u0001"), String.class).invoke(null, str);
                if (invoke != null) {
                    String str3 = (String) invoke;
                    try {
                        Log.i(ProtectedSandApp.s("匮\u0001"), ProtectedSandApp.s("匸\u0001") + str + ProtectedSandApp.s("匹\u0001") + str3, new Object[0]);
                        str2 = str3;
                    } catch (Throwable th) {
                        th = th;
                        str2 = str3;
                        Log.e(ProtectedSandApp.s("匮\u0001"), ProtectedSandApp.s("十\u0001").concat(String.valueOf(th)), new Object[0]);
                        return str2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str2;
    }

    public static synchronized void listenAppBackgroundState() {
        synchronized (LiteavSystemInfo.class) {
            com.tencent.liteav.base.util.i.a().a(c.a());
        }
    }

    private static native void nativeOnAppBackgroundStateChanged(int i4);

    public static void onAppBackgroundStateChanged(boolean z4) {
        nativeOnAppBackgroundStateChanged(z4 ? 1 : 0);
    }

    public static boolean setExtID(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str.getClass();
            char c5 = 65535;
            switch (str.hashCode()) {
                case -1978299099:
                    if (str.equals(ProtectedSandApp.s("匫\u0001"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (str.equals(ProtectedSandApp.s("匱\u0001"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -794136500:
                    if (str.equals(ProtectedSandApp.s("匪\u0001"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -589756065:
                    if (str.equals(ProtectedSandApp.s("匩\u0001"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -497349352:
                    if (str.equals(ProtectedSandApp.s("匰\u0001"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -497260103:
                    if (str.equals(ProtectedSandApp.s("匨\u0001"))) {
                        c5 = 5;
                        break;
                    }
                    break;
                case -487188133:
                    if (str.equals(ProtectedSandApp.s("匲\u0001"))) {
                        c5 = 6;
                        break;
                    }
                    break;
                case -441921776:
                    if (str.equals(ProtectedSandApp.s("匭\u0001"))) {
                        c5 = 7;
                        break;
                    }
                    break;
                case -391134602:
                    if (str.equals(ProtectedSandApp.s("匬\u0001"))) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case 725329157:
                    if (str.equals(ProtectedSandApp.s("匧\u0001"))) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case 1484112759:
                    if (str.equals(ProtectedSandApp.s("匯\u0001"))) {
                        c5 = '\n';
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    try {
                        com.tencent.liteav.base.util.i.a(Integer.parseInt(str2) == 1);
                        return true;
                    } catch (Exception e4) {
                        Log.e(ProtectedSandApp.s("匮\u0001"), ProtectedSandApp.s("卂\u0001").concat(String.valueOf(e4)), new Object[0]);
                        break;
                    }
                case 1:
                    sSystemOSVersion.a(str2);
                    return true;
                case 2:
                    sAppName.a(str2);
                    return true;
                case 3:
                    sManufacturer.a(str2);
                    return true;
                case 4:
                    sBoard.a(str2);
                    return true;
                case 5:
                    sBrand.a(str2);
                    return true;
                case 6:
                    sModel.a(str2);
                    return true;
                case 7:
                    sAppPackageName.a(str2);
                    return true;
                case '\b':
                    sHardware.a(str2);
                    return true;
                case '\t':
                    try {
                        sSystemOSVersionInt.a(Integer.valueOf(Integer.parseInt(str2)));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return true;
                case '\n':
                    sAppVersion.a(str2);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public static void setSDKWorking(boolean z4) {
        com.tencent.liteav.base.util.i.a().f71931a = z4;
    }
}
