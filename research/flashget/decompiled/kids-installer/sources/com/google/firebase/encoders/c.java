package com.google.firebase.encoders;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16584a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f16585b;

    /* compiled from: FieldDescriptor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f16586a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f16587b = null;

        b(String str) {
            this.f16586a = str;
        }

        @o0
        public c a() {
            return new c(this.f16586a, this.f16587b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f16587b)));
        }

        @o0
        public <T extends Annotation> b b(@o0 T t5) {
            if (this.f16587b == null) {
                this.f16587b = new HashMap();
            }
            this.f16587b.put(t5.annotationType(), t5);
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
        return this.f16584a;
    }

    @q0
    public <T extends Annotation> T c(@o0 Class<T> cls) {
        return (T) this.f16585b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16584a.equals(cVar.f16584a) && this.f16585b.equals(cVar.f16585b);
    }

    public int hashCode() {
        return this.f16585b.hashCode() + (this.f16584a.hashCode() * 31);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("ᗽ") + this.f16584a + ProtectedSandApp.s("ᗾ") + this.f16585b.values() + ProtectedSandApp.s("ᗿ");
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f16584a = str;
        this.f16585b = map;
    }
}
