package com.bumptech.glide.load.model.stream;

import androidx.annotation.o0;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: classes3.dex */
public class i implements n<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final n<com.bumptech.glide.load.model.g, InputStream> f11627a;

    /* compiled from: UrlLoader.java */
    public static class a implements o<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<URL, InputStream> c(r rVar) {
            return new i(rVar.d(com.bumptech.glide.load.model.g.class, InputStream.class));
        }
    }

    public i(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this.f11627a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@o0 URL url, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return this.f11627a.b(new com.bumptech.glide.load.model.g(url), i5, i6, iVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 URL url) {
        return true;
    }
}
