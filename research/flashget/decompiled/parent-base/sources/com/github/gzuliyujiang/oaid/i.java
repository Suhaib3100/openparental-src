package com.github.gzuliyujiang.oaid;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: OAIDLog.java */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f50133a = ProtectedSandApp.s("썯");

    /* renamed from: b, reason: collision with root package name */
    private static boolean f50134b;

    private i() {
    }

    public static void a() {
        f50134b = true;
    }

    public static void b(Object log) {
        if (f50134b) {
            if (log == null) {
                log = ProtectedSandApp.s("썰");
            }
            log.toString();
        }
    }
}
