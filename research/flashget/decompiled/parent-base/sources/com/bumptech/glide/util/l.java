package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MultiClassKey.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f44976a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f44977b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f44978c;

    public l() {
    }

    public void a(@o0 Class<?> cls, @o0 Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@o0 Class<?> cls, @o0 Class<?> cls2, @q0 Class<?> cls3) {
        this.f44976a = cls;
        this.f44977b = cls2;
        this.f44978c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f44976a.equals(lVar.f44976a) && this.f44977b.equals(lVar.f44977b) && o.e(this.f44978c, lVar.f44978c);
    }

    public int hashCode() {
        int hashCode = (this.f44977b.hashCode() + (this.f44976a.hashCode() * 31)) * 31;
        Class<?> cls = this.f44978c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("ઞ") + this.f44976a + ProtectedSandApp.s("ટ") + this.f44977b + '}';
    }

    public l(@o0 Class<?> cls, @o0 Class<?> cls2) {
        a(cls, cls2);
    }

    public l(@o0 Class<?> cls, @o0 Class<?> cls2, @q0 Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
