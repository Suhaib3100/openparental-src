package com.tencent.liteav.videobase.common;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class MediaCodecAbility {
    private static final String TAG = ProtectedSandApp.s("哕\u0001");

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getMediaCodecDecoderSupportLowResolution() {
        /*
            java.lang.String r0 = "哔\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            int r1 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            r2 = 21
            r3 = 0
            if (r1 >= r2) goto L10
            return r3
        L10:
            r1 = 0
            android.media.MediaCodec r1 = android.media.MediaCodec.createDecoderByType(r0)     // Catch: java.lang.Throwable -> L56
            android.media.MediaCodecInfo r2 = r1.getCodecInfo()     // Catch: java.lang.Throwable -> L56
            android.media.MediaCodecInfo$CodecCapabilities r0 = r2.getCapabilitiesForType(r0)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L23
            r1.release()
            return r3
        L23:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L2d
            r1.release()
            return r3
        L2d:
            android.util.Range r2 = r0.getSupportedWidths()     // Catch: java.lang.Throwable -> L56
            android.util.Range r0 = r0.getSupportedHeights()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            if (r0 != 0) goto L3a
            goto L58
        L3a:
            java.lang.Comparable r2 = r2.getLower()     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L56
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L56
            java.lang.Comparable r0 = r0.getLower()     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L56
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> L56
        L52:
            r1.release()
            goto L76
        L56:
            r0 = move-exception
            goto L5c
        L58:
            r1.release()
            return r3
        L5c:
            java.lang.String r2 = "哕\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "哖\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r4.concat(r0)     // Catch: java.lang.Throwable -> L77
            com.tencent.liteav.base.util.LiteavLog.e(r2, r0)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L76
            goto L52
        L76:
            return r3
        L77:
            r0 = move-exception
            if (r1 == 0) goto L7d
            r1.release()
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.common.MediaCodecAbility.getMediaCodecDecoderSupportLowResolution():int");
    }

    public static boolean isDecoderSupportHevc() {
        String s4 = ProtectedSandApp.s("哕\u0001");
        boolean z4 = false;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            boolean z5 = false;
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                try {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (!mediaCodecInfo.isEncoder()) {
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            if (supportedTypes[i4].contains(ProtectedSandApp.s("哗\u0001"))) {
                                z5 = true;
                                LiteavLog.i(s4, ProtectedSandApp.s("哘\u0001"), mediaCodecInfo.getName());
                                break;
                            }
                            i4++;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    z4 = z5;
                    f.a(th, ProtectedSandApp.s("哙\u0001"), s4);
                    return z4;
                }
            }
            return z5;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean isEncoderSupportHevc() {
        String s4 = ProtectedSandApp.s("哕\u0001");
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        if (str.contains(ProtectedSandApp.s("哗\u0001"))) {
                            LiteavLog.i(s4, ProtectedSandApp.s("哚\u0001"));
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            LiteavLog.w(s4, ProtectedSandApp.s("哛\u0001").concat(String.valueOf(th)));
        }
        LiteavLog.w(s4, ProtectedSandApp.s("哜\u0001"));
        return false;
    }

    public static boolean isMediaCodecDecodeSupportSWHevc() {
        String s4 = ProtectedSandApp.s("哕\u0001");
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (!mediaCodecInfo.isEncoder()) {
                    for (String str : supportedTypes) {
                        if (str.contains(ProtectedSandApp.s("哗\u0001")) && isSoftOnlyDecoder(mediaCodecInfo)) {
                            LiteavLog.i(s4, ProtectedSandApp.s("哝\u0001"), mediaCodecInfo.getName());
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            f.a(th, ProtectedSandApp.s("哙\u0001"), s4);
        }
        return false;
    }

    public static boolean isSoftOnlyDecoder(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        if (LiteavSystemInfo.getSystemOSVersionInt() <= 29) {
            return mediaCodecInfo.getName().contains(ProtectedSandApp.s("哞\u0001")) || mediaCodecInfo.getName().contains(ProtectedSandApp.s("哟\u0001"));
        }
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }
}
