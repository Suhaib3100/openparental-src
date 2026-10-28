package com.github.mikephil.charting.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.utils.h;
import com.google.firebase.remoteconfig.p;
import java.util.List;

/* compiled from: MPPointD.java */
/* loaded from: classes5.dex */
public class f extends h.a {

    /* renamed from: f, reason: collision with root package name */
    private static h<f> f50631f;

    /* renamed from: d, reason: collision with root package name */
    public double f50632d;

    /* renamed from: e, reason: collision with root package name */
    public double f50633e;

    static {
        h<f> a5 = h.a(64, new f(p.f60679p, p.f60679p));
        f50631f = a5;
        a5.l(0.5f);
    }

    private f(double d5, double d6) {
        this.f50632d = d5;
        this.f50633e = d6;
    }

    public static f b(double d5, double d6) {
        f b5 = f50631f.b();
        b5.f50632d = d5;
        b5.f50633e = d6;
        return b5;
    }

    public static void c(f fVar) {
        f50631f.g(fVar);
    }

    public static void d(List<f> list) {
        f50631f.h(list);
    }

    @Override // com.github.mikephil.charting.utils.h.a
    protected h.a a() {
        return new f(p.f60679p, p.f60679p);
    }

    public String toString() {
        return ProtectedSandApp.s("쑠") + this.f50632d + ProtectedSandApp.s("쑡") + this.f50633e;
    }
}
