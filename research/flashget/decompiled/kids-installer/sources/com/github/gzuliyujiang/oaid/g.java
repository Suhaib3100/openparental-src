package com.github.gzuliyujiang.oaid;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: OAIDLog.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12207a = ProtectedSandApp.s("ࢵ");

    /* renamed from: b, reason: collision with root package name */
    private static boolean f12208b;

    private g() {
    }

    public static void a() {
        f12208b = true;
    }

    public static void b(Object log) {
        if (f12208b) {
            if (log == null) {
                log = ProtectedSandApp.s("ࢶ");
            }
            log.toString();
        }
    }
}
