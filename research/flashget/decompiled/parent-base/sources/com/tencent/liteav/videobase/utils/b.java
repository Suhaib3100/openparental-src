package com.tencent.liteav.videobase.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f72287a;

    /* renamed from: b, reason: collision with root package name */
    public int f72288b;

    /* renamed from: c, reason: collision with root package name */
    public String f72289c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f72290d;

    /* renamed from: e, reason: collision with root package name */
    public MediaCodecInfo.CodecCapabilities f72291e;

    /* renamed from: f, reason: collision with root package name */
    private a f72292f;

    /* renamed from: g, reason: collision with root package name */
    private MediaFormat f72293g;

    /* renamed from: h, reason: collision with root package name */
    private JSONArray f72294h;

    /* renamed from: com.tencent.liteav.videobase.utils.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72295a;

        static {
            int[] iArr = new int[a.values().length];
            f72295a = iArr;
            try {
                iArr[a.f72297b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72295a[a.f72298c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72295a[a.f72299d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72295a[a.f72300e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum a {
        f72296a,
        f72297b,
        f72298c,
        f72299d,
        f72300e
    }

    public b() {
        a aVar = a.f72296a;
        this.f72292f = aVar;
        a b5 = b();
        if (b5 == aVar) {
            String lowerCase = LiteavSystemInfo.getHardware().toLowerCase();
            if (lowerCase.contains(ProtectedSandApp.s("啃\u0001"))) {
                aVar = a.f72297b;
            } else if (lowerCase.contains(ProtectedSandApp.s("啄\u0001"))) {
                aVar = a.f72298c;
            } else if (lowerCase.contains(ProtectedSandApp.s("啅\u0001"))) {
                aVar = a.f72299d;
            }
            b5 = aVar;
        }
        this.f72292f = b5;
        LiteavLog.i(ProtectedSandApp.s("啈\u0001"), ProtectedSandApp.s("商\u0001") + LiteavSystemInfo.getHardware().toLowerCase() + ProtectedSandApp.s("啇\u0001") + this.f72292f);
    }

    private static a b() {
        int i4;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return a.f72296a;
        }
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            int length = codecInfos.length;
            while (i4 < length) {
                String lowerCase = codecInfos[i4].getName().toLowerCase();
                if (lowerCase.contains(ProtectedSandApp.s("啉\u0001"))) {
                    return a.f72298c;
                }
                if (lowerCase.contains(ProtectedSandApp.s("啊\u0001"))) {
                    return a.f72300e;
                }
                i4 = (lowerCase.contains(ProtectedSandApp.s("啃\u0001")) || lowerCase.contains(ProtectedSandApp.s("啋\u0001"))) ? 0 : i4 + 1;
                return a.f72297b;
            }
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("啈\u0001"), ProtectedSandApp.s("啌\u0001") + th.getMessage());
        }
        return a.f72296a;
    }

    public final MediaFormat a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaFormat mediaFormat = this.f72293g;
        if (mediaFormat == null) {
            mediaFormat = MediaFormat.createVideoFormat(this.f72289c, this.f72287a, this.f72288b);
        }
        if (this.f72290d) {
            int systemOSVersionInt = LiteavSystemInfo.getSystemOSVersionInt();
            if (systemOSVersionInt >= 30 && this.f72292f != a.f72298c && (codecCapabilities = this.f72291e) != null) {
                String s4 = ProtectedSandApp.s("啍\u0001");
                if (codecCapabilities.isFeatureSupported(s4)) {
                    mediaFormat.setInteger(s4, 1);
                }
            }
            if (systemOSVersionInt > 23 || !LiteavSystemInfo.getManufacturer().toLowerCase().contains(ProtectedSandApp.s("啎\u0001"))) {
                mediaFormat.setInteger(ProtectedSandApp.s("問\u0001"), 1);
            }
            if (systemOSVersionInt >= 26) {
                int i4 = AnonymousClass1.f72295a[this.f72292f.ordinal()];
                if (i4 == 1) {
                    mediaFormat.setInteger(ProtectedSandApp.s("啔\u0001"), 1);
                    mediaFormat.setInteger(ProtectedSandApp.s("啕\u0001"), 1);
                } else if (i4 == 2) {
                    mediaFormat.setInteger(ProtectedSandApp.s("啒\u0001"), 1);
                    mediaFormat.setInteger(ProtectedSandApp.s("啓\u0001"), -1);
                } else if (i4 == 3) {
                    mediaFormat.setInteger(ProtectedSandApp.s("啑\u0001"), 1);
                } else if (i4 == 4) {
                    mediaFormat.setInteger(ProtectedSandApp.s("啐\u0001"), 1);
                }
            }
        }
        JSONArray jSONArray = this.f72294h;
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i5);
                    mediaFormat.setInteger(jSONObject.optString(ProtectedSandApp.s("啖\u0001")), jSONObject.optInt(ProtectedSandApp.s("啗\u0001")));
                } catch (JSONException e4) {
                    LiteavLog.e(ProtectedSandApp.s("啈\u0001"), ProtectedSandApp.s("啘\u0001"), e4);
                }
            }
        }
        return mediaFormat;
    }
}
