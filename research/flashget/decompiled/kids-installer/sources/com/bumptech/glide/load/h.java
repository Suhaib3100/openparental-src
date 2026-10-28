package com.bumptech.glide.load;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class h<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f11503e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f11504a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f11505b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11506c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f11507d;

    /* compiled from: Option.java */
    /* loaded from: classes3.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        public void a(@o0 byte[] bArr, @o0 Object obj, @o0 MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    public interface b<T> {
        void a(@o0 byte[] bArr, @o0 T t5, @o0 MessageDigest messageDigest);
    }

    private h(@o0 String str, @q0 T t5, @o0 b<T> bVar) {
        this.f11506c = com.bumptech.glide.util.l.b(str);
        this.f11504a = t5;
        this.f11505b = (b) com.bumptech.glide.util.l.d(bVar);
    }

    @o0
    public static <T> h<T> a(@o0 String str, @o0 b<T> bVar) {
        return new h<>(str, null, bVar);
    }

    @o0
    public static <T> h<T> b(@o0 String str, @q0 T t5, @o0 b<T> bVar) {
        return new h<>(str, t5, bVar);
    }

    @o0
    private static <T> b<T> c() {
        return (b<T>) f11503e;
    }

    @o0
    private byte[] e() {
        if (this.f11507d == null) {
            this.f11507d = this.f11506c.getBytes(f.f11501b);
        }
        return this.f11507d;
    }

    @o0
    public static <T> h<T> f(@o0 String str) {
        return new h<>(str, null, f11503e);
    }

    @o0
    public static <T> h<T> g(@o0 String str, @o0 T t5) {
        return new h<>(str, t5, f11503e);
    }

    @q0
    public T d() {
        return this.f11504a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f11506c.equals(((h) obj).f11506c);
        }
        return false;
    }

    public void h(@o0 T t5, @o0 MessageDigest messageDigest) {
        this.f11505b.a(e(), t5, messageDigest);
    }

    public int hashCode() {
        return this.f11506c.hashCode();
    }

    public String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("ţ")), this.f11506c, ProtectedSandApp.s("Ť"));
    }
}
