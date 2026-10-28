package com.tencent.beacon.a.b;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AttaReport.java */
/* loaded from: classes6.dex */
public class j extends h {

    /* renamed from: e, reason: collision with root package name */
    private static volatile j f71049e;

    private j() {
    }

    public static j e() {
        if (f71049e == null) {
            synchronized (j.class) {
                try {
                    if (f71049e == null) {
                        f71049e = new j();
                    }
                } finally {
                }
            }
        }
        return f71049e;
    }

    @Override // com.tencent.beacon.a.b.h
    String b() {
        return ProtectedSandApp.s("〞\u0001");
    }

    @Override // com.tencent.beacon.a.b.h
    String c() {
        return ProtectedSandApp.s("〟\u0001");
    }
}
