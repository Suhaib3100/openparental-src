package com.github.mikephil.charting.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.utils.h;
import java.util.List;

/* compiled from: FSize.java */
/* loaded from: classes5.dex */
public final class c extends h.a {

    /* renamed from: f, reason: collision with root package name */
    private static h<c> f50627f;

    /* renamed from: d, reason: collision with root package name */
    public float f50628d;

    /* renamed from: e, reason: collision with root package name */
    public float f50629e;

    static {
        h<c> a5 = h.a(256, new c(0.0f, 0.0f));
        f50627f = a5;
        a5.l(0.5f);
    }

    public c() {
    }

    public static c b(float f4, float f5) {
        c b5 = f50627f.b();
        b5.f50628d = f4;
        b5.f50629e = f5;
        return b5;
    }

    public static void c(c cVar) {
        f50627f.g(cVar);
    }

    public static void d(List<c> list) {
        f50627f.h(list);
    }

    @Override // com.github.mikephil.charting.utils.h.a
    protected h.a a() {
        return new c(0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f50628d == cVar.f50628d && this.f50629e == cVar.f50629e;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f50628d) ^ Float.floatToIntBits(this.f50629e);
    }

    public String toString() {
        return this.f50628d + ProtectedSandApp.s("쑜") + this.f50629e;
    }

    public c(float f4, float f5) {
        this.f50628d = f4;
        this.f50629e = f5;
    }
}
