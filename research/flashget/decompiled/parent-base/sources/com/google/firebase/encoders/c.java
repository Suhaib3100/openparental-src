package com.google.firebase.encoders;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f59605a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f59606b;

    /* compiled from: FieldDescriptor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f59607a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f59608b = null;

        b(String str) {
            this.f59607a = str;
        }

        @o0
        public c a() {
            return new c(this.f59607a, this.f59608b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f59608b)));
        }

        @o0
        public <T extends Annotation> b b(@o0 T t4) {
            if (this.f59608b == null) {
                this.f59608b = new HashMap();
            }
            this.f59608b.put(t4.annotationType(), t4);
            return this;
        }
    }

    @o0
    public static b a(@o0 String str) {
        return new b(str);
    }

    @o0
    public static c d(@o0 String str) {
        return new c(str, Collections.emptyMap());
    }

    @o0
    public String b() {
        return this.f59605a;
    }

    @q0
    public <T extends Annotation> T c(@o0 Class<T> cls) {
        return (T) this.f59606b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59605a.equals(cVar.f59605a) && this.f59606b.equals(cVar.f59606b);
    }

    public int hashCode() {
        return this.f59606b.hashCode() + (this.f59605a.hashCode() * 31);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("C\u0001") + this.f59605a + ProtectedSandApp.s("D\u0001") + this.f59606b.values() + ProtectedSandApp.s("E\u0001");
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f59605a = str;
        this.f59606b = map;
    }
}
