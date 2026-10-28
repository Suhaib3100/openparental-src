package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f12167a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f12168b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f12169c;

    public k() {
    }

    public void a(@o0 Class<?> cls, @o0 Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@o0 Class<?> cls, @o0 Class<?> cls2, @q0 Class<?> cls3) {
        this.f12167a = cls;
        this.f12168b = cls2;
        this.f12169c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f12167a.equals(kVar.f12167a) && this.f12168b.equals(kVar.f12168b) && n.d(this.f12169c, kVar.f12169c);
    }

    public int hashCode() {
        int hashCode = (this.f12168b.hashCode() + (this.f12167a.hashCode() * 31)) * 31;
        Class<?> cls = this.f12169c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("ȫ") + this.f12167a + ProtectedSandApp.s("Ȭ") + this.f12168b + '}';
    }

    public k(@o0 Class<?> cls, @o0 Class<?> cls2) {
        a(cls, cls2);
    }

    public k(@o0 Class<?> cls, @o0 Class<?> cls2, @q0 Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
