package com.tencent.beacon.a.b;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AttaAggregateReport.java */
/* loaded from: classes6.dex */
public class i extends h {

    /* renamed from: e, reason: collision with root package name */
    private static volatile i f71048e;

    private i() {
    }

    public static i e() {
        if (f71048e == null) {
            synchronized (i.class) {
                try {
                    if (f71048e == null) {
                        f71048e = new i();
                    }
                } finally {
                }
            }
        }
        return f71048e;
    }

    @Override // com.tencent.beacon.a.b.h
    String b() {
        return ProtectedSandApp.s("〜\u0001");
    }

    @Override // com.tencent.beacon.a.b.h
    String c() {
        return ProtectedSandApp.s("〝\u0001");
    }
}
