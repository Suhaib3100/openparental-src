package com.google.firebase.crashlytics.ndk;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class CrashpadMain {
    public static native void crashpadMain(String[] strArr);

    public static void main(String[] strArr) {
        try {
            System.load(strArr[1] + ProtectedSandApp.s("\u0003\u0001"));
            crashpadMain(strArr);
        } catch (UnsatisfiedLinkError e4) {
            throw new RuntimeException(e4);
        }
    }
}
