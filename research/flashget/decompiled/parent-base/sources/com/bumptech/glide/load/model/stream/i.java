package com.bumptech.glide.load.model.stream;

import androidx.annotation.o0;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: classes3.dex */
public class i implements o<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final o<com.bumptech.glide.load.model.h, InputStream> f44370a;

    /* compiled from: UrlLoader.java */
    public static class a implements p<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<URL, InputStream> e(s sVar) {
            return new i(sVar.d(com.bumptech.glide.load.model.h.class, InputStream.class));
        }
    }

    public i(o<com.bumptech.glide.load.model.h, InputStream> oVar) {
        this.f44370a = oVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@o0 URL url, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return this.f44370a.b(new com.bumptech.glide.load.model.h(url), i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 URL url) {
        return true;
    }
}
