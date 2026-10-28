package com.tencent.rtmp;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.sdk.common.HouseBuilder;
import java.util.List;

/* loaded from: classes7.dex */
public class TXLiveBase {
    private static final String TAG = ProtectedSandApp.s("宛\u0001");
    private static TXLiveBase instance = new TXLiveBase();
    private static b networkTimeCallback = new b(0);
    private static TXLiveBaseListener sListener;

    static class a implements LiteavLog.a {
        private a() {
        }

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i4, String str, String str2) {
            TXLiveBaseListener tXLiveBaseListener = TXLiveBase.sListener;
            if (tXLiveBaseListener != null) {
                tXLiveBaseListener.onLog(i4, str, str2);
            }
        }

        /* synthetic */ a(byte b5) {
            this();
        }
    }

    static class b implements CommonUtil.a {
        private b() {
        }

        @Override // com.tencent.liteav.base.util.CommonUtil.a
        public final void a(int i4, String str) {
            TXLiveBase.onUpdateNetworkTime(i4, str);
        }

        /* synthetic */ b(byte b5) {
            this();
        }
    }

    static {
        if (SoLoader.loadAllLibraries()) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
    }

    private TXLiveBase() {
    }

    public static void enableCustomHttpDNS(boolean z4) {
        if (z4) {
            HttpDnsUtil.enableCustomHttpDNS(true, new HttpDnsUtil.a() { // from class: com.tencent.rtmp.TXLiveBase.2
                @Override // com.tencent.liteav.base.util.HttpDnsUtil.a
                public final void a(String str, List<String> list) {
                    if (TXLiveBase.sListener != null) {
                        TXLiveBase.sListener.onCustomHttpDNS(str, list);
                    }
                }
            });
        } else {
            HttpDnsUtil.enableCustomHttpDNS(false, null);
        }
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public static long getNetworkTimestamp() {
        return CommonUtil.getNetworkTimestamp();
    }

    public static String getPituSDKVersion() {
        return "";
    }

    public static String getSDKVersionStr() {
        return CommonUtil.getSDKVersionStr();
    }

    public static boolean isLibraryPathValid(String str) {
        return false;
    }

    public static void onUpdateNetworkTime(int i4, String str) {
        TXLiveBaseListener tXLiveBaseListener = sListener;
        if (tXLiveBaseListener != null) {
            tXLiveBaseListener.onUpdateNetworkTime(i4, str);
        }
    }

    public static void setAppID(String str) {
        LiveSettingJni.setAppId(str);
    }

    public static void setAppVersion(String str) {
        LiteavLog.i(ProtectedSandApp.s("宛\u0001"), ProtectedSandApp.s("宜\u0001").concat(String.valueOf(str)));
        LiveSettingJni.setAppVersion(str);
    }

    public static void setConsoleEnabled(boolean z4) {
        LiteavLog.nativeSetConsoleLogEnabled(z4);
    }

    public static boolean setExtID(String str, String str2) {
        return LiteavSystemInfo.setExtID(str, str2);
    }

    public static int setGlobalEnv(String str) {
        return CommonUtil.setGlobalEnv(str);
    }

    public static boolean setLibraryPath(String str) {
        SoLoader.setLibraryPath(str);
        boolean loadAllLibraries = SoLoader.loadAllLibraries();
        if (loadAllLibraries) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
        return loadAllLibraries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setListener(TXLiveBaseListener tXLiveBaseListener) {
        LiteavLog.setCallback(new a(0 == true ? 1 : 0));
        LiteavLog.nativeSetLogCallbackEnabled(tXLiveBaseListener != null);
        sListener = tXLiveBaseListener;
    }

    public static void setLogLevel(int i4) {
        LiteavLog.b bVar = LiteavLog.b.f71916a;
        if (i4 == 2) {
            bVar = LiteavLog.b.f71917b;
        } else if (i4 == 3) {
            bVar = LiteavLog.b.f71918c;
        } else if (i4 == 4) {
            bVar = LiteavLog.b.f71919d;
        } else if (i4 == 5) {
            bVar = LiteavLog.b.f71920e;
        } else if (i4 == 6) {
            bVar = LiteavLog.b.f71921f;
        }
        LiteavLog.nativeSetLogLevel(bVar.mNativeValue);
    }

    public static void setPituLicencePath(String str) {
    }

    public static void setUserId(String str) {
        LiveSettingJni.setUserId(str);
    }

    public static int updateNetworkTime() {
        return CommonUtil.updateNetworkTime();
    }

    public String getLicenceInfo(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("宝\u0001"));
        return HouseBuilder.getInstance().getHouse(HouseBuilder.c.f71997a);
    }

    public void setLicence(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("宝\u0001"));
        HouseBuilder.getInstance().setListener(new HouseBuilder.b() { // from class: com.tencent.rtmp.TXLiveBase.1
            @Override // com.tencent.liteav.sdk.common.HouseBuilder.b
            public final void a(int i4, String str3) {
                TXLiveBaseListener tXLiveBaseListener = TXLiveBase.sListener;
                if (tXLiveBaseListener != null) {
                    tXLiveBaseListener.onLicenceLoaded(i4, str3);
                }
            }
        });
        HouseBuilder.getInstance().setHouse(HouseBuilder.c.f71997a, str, str2);
    }
}
