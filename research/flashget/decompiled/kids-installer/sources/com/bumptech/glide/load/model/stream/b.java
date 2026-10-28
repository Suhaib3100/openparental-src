package com.bumptech.glide.load.model.stream;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes3.dex */
public class b implements n<com.bumptech.glide.load.model.g, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Integer> f11603b = com.bumptech.glide.load.h.g(ProtectedSandApp.s("ᴺ"), 2500);

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f11604a;

    /* compiled from: HttpGlideUrlLoader.java */
    public static class a implements o<com.bumptech.glide.load.model.g, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f11605a = new m<>(500);

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<com.bumptech.glide.load.model.g, InputStream> c(r rVar) {
            return new b(this.f11605a);
        }
    }

    public b() {
        this(null);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@o0 com.bumptech.glide.load.model.g gVar, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar = this.f11604a;
        if (mVar != null) {
            com.bumptech.glide.load.model.g b6 = mVar.b(gVar, 0, 0);
            if (b6 == null) {
                this.f11604a.c(gVar, 0, 0, gVar);
            } else {
                gVar = b6;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) iVar.c(f11603b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 com.bumptech.glide.load.model.g gVar) {
        return true;
    }

    public b(@q0 m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar) {
        this.f11604a = mVar;
    }
}
