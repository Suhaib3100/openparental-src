package com.tencent.live2.impl;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.live.V2TXLivePremierJni;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1006a f72680a = new C1006a();

    /* renamed from: b, reason: collision with root package name */
    private static V2TXLivePremier.V2TXLivePremierObserver f72681b;

    /* renamed from: com.tencent.live2.impl.a$a, reason: collision with other inner class name */
    public static final class C1006a implements LiteavLog.a {

        /* renamed from: a, reason: collision with root package name */
        V2TXLivePremier.V2TXLivePremierObserver f72682a;

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i4, String str, String str2) {
            V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = this.f72682a;
            if (v2TXLivePremierObserver != null) {
                v2TXLivePremierObserver.onLog(i4, str2);
            }
        }
    }

    public static String a() {
        return CommonUtil.getSDKVersionStr();
    }

    public static int c(String str) {
        return V2TXLivePremierJni.callExperimentalAPI(str);
    }

    public static void a(V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        f72681b = v2TXLivePremierObserver;
        f72680a.f72682a = v2TXLivePremierObserver;
        V2TXLivePremierJni.setObserver(v2TXLivePremierObserver);
    }

    public static void b(boolean z4, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        V2TXLivePremierJni.enableAudioPlayoutObserver(z4, v2TXLiveAudioFrameObserverFormat);
    }

    public static void b(String str) {
        LiveSettingJni.setUserId(str);
    }

    public static void a(V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        LiteavLog.b bVar;
        if (v2TXLiveLogConfig != null) {
            LiteavLog.nativeSetConsoleLogEnabled(v2TXLiveLogConfig.enableConsole);
            LiteavLog.nativeSetLogToFileEnabled(v2TXLiveLogConfig.enableLogFile);
            String str = v2TXLiveLogConfig.logPath;
            if (str != null) {
                LiteavLog.nativeSetLogFilePath(str);
            }
            int i4 = v2TXLiveLogConfig.logLevel;
            if (i4 == 2) {
                bVar = LiteavLog.b.f71917b;
            } else if (i4 == 3) {
                bVar = LiteavLog.b.f71918c;
            } else if (i4 == 4) {
                bVar = LiteavLog.b.f71919d;
            } else if (i4 == 5) {
                bVar = LiteavLog.b.f71920e;
            } else if (i4 != 6) {
                bVar = LiteavLog.b.f71916a;
            } else {
                bVar = LiteavLog.b.f71921f;
            }
            LiteavLog.nativeSetLogLevel(bVar.mNativeValue);
            C1006a c1006a = f72680a;
            boolean z4 = v2TXLiveLogConfig.enableObserver;
            if (!z4) {
                c1006a = null;
            }
            LiteavLog.setCallback(c1006a);
            LiteavLog.nativeSetLogCallbackEnabled(z4);
        }
    }

    public static void a(String str) {
        CommonUtil.setGlobalEnv(str);
    }

    public static void a(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("塺\u0001"));
        HouseBuilder.getInstance().setListener(new HouseBuilder.b() { // from class: com.tencent.live2.impl.a.1
            @Override // com.tencent.liteav.sdk.common.HouseBuilder.b
            public final void a(int i4, String str3) {
                V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = a.f72681b;
                if (v2TXLivePremierObserver != null) {
                    v2TXLivePremierObserver.onLicenceLoaded(i4, str3);
                }
            }
        });
        HouseBuilder.getInstance().setHouse(HouseBuilder.c.f71997a, str, str2);
    }

    public static void a(String str, int i4, String str2, String str3, V2TXLiveDef.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig) {
        CommonUtil.setSocks5Proxy(str, i4, str2, str3, v2TXLiveSocks5ProxyConfig.supportHttps, v2TXLiveSocks5ProxyConfig.supportTcp, v2TXLiveSocks5ProxyConfig.supportUdp);
    }

    public static void a(boolean z4, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        V2TXLivePremierJni.enableAudioCaptureObserver(z4, v2TXLiveAudioFrameObserverFormat);
    }

    public static void a(boolean z4) {
        V2TXLivePremierJni.enableVoiceEarMonitorObserver(z4);
    }
}
