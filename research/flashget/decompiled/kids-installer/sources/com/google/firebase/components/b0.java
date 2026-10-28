package com.google.firebase.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes2.dex */
public final class b0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f15336a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f15337b;

    /* compiled from: Qualified.java */
    private @interface a {
    }

    public b0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f15336a = cls;
        this.f15337b = cls2;
    }

    public static <T> b0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new b0<>(cls, cls2);
    }

    public static <T> b0<T> b(Class<T> cls) {
        return new b0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f15337b.equals(b0Var.f15337b)) {
            return this.f15336a.equals(b0Var.f15336a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15336a.hashCode() + (this.f15337b.hashCode() * 31);
    }

    public String toString() {
        if (this.f15336a == a.class) {
            return this.f15337b.getName();
        }
        return ProtectedSandApp.s("ᎈ") + this.f15336a.getName() + ProtectedSandApp.s("ᎉ") + this.f15337b.getName();
    }
}
