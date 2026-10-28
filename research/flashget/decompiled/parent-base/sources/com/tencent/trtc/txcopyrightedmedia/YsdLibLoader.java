package com.tencent.trtc.txcopyrightedmedia;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.SoLoader;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class YsdLibLoader {
    public static String getLibraryPath() {
        return SoLoader.getLibraryPath();
    }

    public static boolean loadLibrary() {
        return SoLoader.loadLibrary(ProtectedSandApp.s("嶃\u0001"));
    }
}
