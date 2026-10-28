package com.bumptech.glide.load.engine.cache;

import androidx.annotation.o0;
import androidx.core.util.p;
import com.bumptech.glide.util.n;
import com.bumptech.glide.util.pool.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.i<com.bumptech.glide.load.f, String> f11272a = new com.bumptech.glide.util.i<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final p.a<b> f11273b = com.bumptech.glide.util.pool.a.e(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes3.dex */
    class a implements a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance(ProtectedSandApp.s("᳑")));
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes3.dex */
    private static final class b implements a.f {

        /* renamed from: o, reason: collision with root package name */
        final MessageDigest f11275o;

        /* renamed from: p, reason: collision with root package name */
        private final com.bumptech.glide.util.pool.c f11276p = com.bumptech.glide.util.pool.c.a();

        b(MessageDigest messageDigest) {
            this.f11275o = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.a.f
        @o0
        public com.bumptech.glide.util.pool.c l() {
            return this.f11276p;
        }
    }

    private String a(com.bumptech.glide.load.f fVar) {
        b bVar = (b) com.bumptech.glide.util.l.d(this.f11273b.b());
        try {
            fVar.a(bVar.f11275o);
            return n.z(bVar.f11275o.digest());
        } finally {
            this.f11273b.a(bVar);
        }
    }

    public String b(com.bumptech.glide.load.f fVar) {
        String k5;
        synchronized (this.f11272a) {
            k5 = this.f11272a.k(fVar);
        }
        if (k5 == null) {
            k5 = a(fVar);
        }
        synchronized (this.f11272a) {
            this.f11272a.o(fVar, k5);
        }
        return k5;
    }
}
