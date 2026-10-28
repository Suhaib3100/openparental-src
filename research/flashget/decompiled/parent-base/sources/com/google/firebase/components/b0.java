package com.google.firebase.components;

import androidx.annotation.o0;
import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes6.dex */
public final class b0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f58413a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f58414b;

    /* compiled from: Qualified.java */
    private @interface a {
    }

    public b0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f58413a = cls;
        this.f58414b = cls2;
    }

    @o0
    public static <T> b0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new b0<>(cls, cls2);
    }

    @o0
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
        if (this.f58414b.equals(b0Var.f58414b)) {
            return this.f58413a.equals(b0Var.f58413a);
        }
        return false;
    }

    public int hashCode() {
        return this.f58413a.hashCode() + (this.f58414b.hashCode() * 31);
    }

    public String toString() {
        if (this.f58413a == a.class) {
            return this.f58414b.getName();
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﭢ"));
        m2.a(this.f58413a, sb, ProtectedSandApp.s("ﭣ"));
        sb.append(this.f58414b.getName());
        return sb.toString();
    }
}
