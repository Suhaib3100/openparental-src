package com.bumptech.glide.load.engine.cache;

import androidx.annotation.o0;
import androidx.core.util.v;
import com.bumptech.glide.util.o;
import com.bumptech.glide.util.pool.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.j<com.bumptech.glide.load.f, String> f43980a = new com.bumptech.glide.util.j<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final v.a<b> f43981b = com.bumptech.glide.util.pool.a.e(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    class a implements a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance(ProtectedSandApp.s("ࣖ")));
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    private static final class b implements a.f {

        /* renamed from: b, reason: collision with root package name */
        final MessageDigest f43983b;

        /* renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.util.pool.c f43984c = com.bumptech.glide.util.pool.c.a();

        b(MessageDigest messageDigest) {
            this.f43983b = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.a.f
        @o0
        public com.bumptech.glide.util.pool.c d() {
            return this.f43984c;
        }
    }

    private String a(com.bumptech.glide.load.f fVar) {
        b bVar = (b) com.bumptech.glide.util.m.f(this.f43981b.acquire(), ProtectedSandApp.s("ࣗ"));
        try {
            fVar.b(bVar.f43983b);
            return o.A(bVar.f43983b.digest());
        } finally {
            this.f43981b.release(bVar);
        }
    }

    public String b(com.bumptech.glide.load.f fVar) {
        String k4;
        synchronized (this.f43980a) {
            k4 = this.f43980a.k(fVar);
        }
        if (k4 == null) {
            k4 = a(fVar);
        }
        synchronized (this.f43980a) {
            this.f43980a.o(fVar, k4);
        }
        return k4;
    }
}
