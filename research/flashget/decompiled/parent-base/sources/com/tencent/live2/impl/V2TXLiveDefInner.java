package com.tencent.live2.impl;

import android.support.v4.media.b;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class V2TXLiveDefInner {

    public static class SurfaceSize {
        public int height;
        public int width;

        public SurfaceSize(int i4, int i5) {
            this.width = i4;
            this.height = i5;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("塌\u0001"));
            sb.append(this.width);
            sb.append(ProtectedSandApp.s("塍\u0001"));
            return b.a(sb, this.height, ProtectedSandApp.s("塎\u0001"));
        }
    }

    public static class TXLivePropertyKey {
        public static final String kV2EnableCameraZoom = ProtectedSandApp.s("塏\u0001");
        public static final String kV2SetLebCacheParams = ProtectedSandApp.s("塐\u0001");
        public static final String kV2SetAudioCodecType = ProtectedSandApp.s("塑\u0001");
        public static final String kV2EnableAGC = ProtectedSandApp.s("塒\u0001");
        public static final String kV2SetSurface = ProtectedSandApp.s("塓\u0001");
        public static final String kV2EnableRTMPAcc = ProtectedSandApp.s("塔\u0001");
        public static final String kV2EnableANS = ProtectedSandApp.s("塕\u0001");
        public static final String kV2SetFramework = ProtectedSandApp.s("塖\u0001");
        public static final String kV2SetAudioEncodeFormat = ProtectedSandApp.s("塗\u0001");
        public static final String kV2SetAudioRoute = ProtectedSandApp.s("塘\u0001");
        public static final String kV2SetSurfaceSize = ProtectedSandApp.s("塙\u0001");
        public static final String kV2SetDisplayRotationObtainMethod = ProtectedSandApp.s("塚\u0001");
        public static final String kV2SetLEBEnvironment = ProtectedSandApp.s("塛\u0001");
        public static final String kV2SetPreferLocalIPStack = ProtectedSandApp.s("塜\u0001");
        public static final String kV2EnableRealtimeMode = ProtectedSandApp.s("塝\u0001");
        public static final String kV2SetOpenGLContext = ProtectedSandApp.s("塞\u0001");
        public static final String kV2EnableSEITimestampMessage = ProtectedSandApp.s("塟\u0001");
        public static final String kEnableAdjustEncoderDirectionToUIOrientation = ProtectedSandApp.s("塠\u0001");
    }
}
