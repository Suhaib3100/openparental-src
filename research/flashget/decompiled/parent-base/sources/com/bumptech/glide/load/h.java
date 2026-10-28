package com.bumptech.glide.load;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes3.dex */
public final class h<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f44243e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f44244a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f44245b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44246c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f44247d;

    /* compiled from: Option.java */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        public void a(@o0 byte[] bArr, @o0 Object obj, @o0 MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    public interface b<T> {
        void a(@o0 byte[] bArr, @o0 T t4, @o0 MessageDigest messageDigest);
    }

    private h(@o0 String str, @q0 T t4, @o0 b<T> bVar) {
        this.f44246c = com.bumptech.glide.util.m.c(str);
        this.f44244a = t4;
        this.f44245b = (b) com.bumptech.glide.util.m.f(bVar, ProtectedSandApp.s("ॏ"));
    }

    @o0
    public static <T> h<T> a(@o0 String str, @o0 b<T> bVar) {
        return new h<>(str, null, bVar);
    }

    @o0
    public static <T> h<T> b(@o0 String str, @q0 T t4, @o0 b<T> bVar) {
        return new h<>(str, t4, bVar);
    }

    @o0
    private static <T> b<T> c() {
        return (b<T>) f44243e;
    }

    @o0
    private byte[] e() {
        if (this.f44247d == null) {
            this.f44247d = this.f44246c.getBytes(f.f44241b);
        }
        return this.f44247d;
    }

    @o0
    public static <T> h<T> f(@o0 String str) {
        return new h<>(str, null, f44243e);
    }

    @o0
    public static <T> h<T> g(@o0 String str, @o0 T t4) {
        return new h<>(str, t4, f44243e);
    }

    @q0
    public T d() {
        return this.f44244a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f44246c.equals(((h) obj).f44246c);
        }
        return false;
    }

    public void h(@o0 T t4, @o0 MessageDigest messageDigest) {
        this.f44245b.a(e(), t4, messageDigest);
    }

    public int hashCode() {
        return this.f44246c.hashCode();
    }

    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("ॐ")), this.f44246c, ProtectedSandApp.s("॑"));
    }
}
