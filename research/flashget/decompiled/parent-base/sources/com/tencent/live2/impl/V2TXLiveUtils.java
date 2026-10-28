package com.tencent.live2.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.live2.V2TXLiveDef;

/* loaded from: classes7.dex */
public class V2TXLiveUtils {
    private static final String TAG = ProtectedSandApp.s("塯\u0001");
    public static final String TRTC_ADDRESS1 = new String(Base64.decode(ProtectedSandApp.s("塰\u0001"), 0));
    public static final String TRTC_ADDRESS2 = new String(Base64.decode(ProtectedSandApp.s("塱\u0001"), 0));

    /* renamed from: com.tencent.live2.impl.V2TXLiveUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72677a;

        static {
            int[] iArr = new int[V2TXLiveDef.V2TXLiveVideoResolution.values().length];
            f72677a = iArr;
            try {
                iArr[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution160x160.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution270x270.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x480.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x240.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x360.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x480.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x180.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x270.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x360.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution960x540.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1280x720.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f72677a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1920x1080.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f72678a;

        /* renamed from: b, reason: collision with root package name */
        public int f72679b;

        public a(int i4, int i5) {
            this.f72678a = i4;
            this.f72679b = i5;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a getBitrateByResolution(V2TXLiveDef.V2TXLiveVideoResolution v2TXLiveVideoResolution) {
        int i4;
        int i5;
        int i6 = 600;
        switch (AnonymousClass1.f72677a[v2TXLiveVideoResolution.ordinal()]) {
            case 1:
                i6 = 100;
                i4 = 150;
                break;
            case 2:
                i6 = 200;
                i4 = 300;
                break;
            case 3:
                i5 = 525;
                i4 = i5;
                i6 = 350;
                break;
            case 4:
                i4 = 375;
                i6 = 250;
                break;
            case 5:
                i4 = 600;
                i6 = 400;
                break;
            case 6:
                i4 = 900;
                break;
            case 7:
                i4 = 400;
                i6 = 250;
                break;
            case 8:
                i5 = 550;
                i4 = i5;
                i6 = 350;
                break;
            case 9:
                i6 = 500;
                i4 = 900;
                break;
            case 10:
            default:
                i6 = 800;
                i4 = 1500;
                break;
            case 11:
                i6 = 1000;
                i4 = 1800;
                break;
            case 12:
                i6 = g.f40879e;
                i4 = 3000;
                break;
        }
        return new a(i6, i4);
    }

    public static V2TXLiveDef.V2TXLiveMode parseLiveMode(String str) {
        boolean startsWith = str.startsWith(ProtectedSandApp.s("塲\u0001"));
        String s4 = ProtectedSandApp.s("塯\u0001");
        if (startsWith || str.startsWith(TRTC_ADDRESS1) || str.startsWith(TRTC_ADDRESS2)) {
            TXCLog.i(s4, ProtectedSandApp.s("塴\u0001"));
            return V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC;
        }
        TXCLog.i(s4, ProtectedSandApp.s("塳\u0001"));
        return V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP;
    }

    public static String removeURLSensitiveInfo(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String[] strArr = {ProtectedSandApp.s("塵\u0001"), ProtectedSandApp.s("塶\u0001"), ProtectedSandApp.s("塷\u0001")};
            for (int i4 = 0; i4 < 3; i4++) {
                if (str.contains(strArr[i4]) && (indexOf = str.indexOf(strArr[i4])) != -1) {
                    int indexOf2 = str.indexOf(ProtectedSandApp.s("塸\u0001"), indexOf);
                    str = indexOf2 == -1 ? str.substring(0, indexOf) : str.substring(0, indexOf) + str.substring(indexOf2);
                }
            }
        } catch (Exception e4) {
            TXCLog.e(ProtectedSandApp.s("塯\u0001"), ProtectedSandApp.s("塹\u0001"), e4);
        }
        return str;
    }
}
