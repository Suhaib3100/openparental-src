package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.m;
import com.bumptech.glide.util.l;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes3.dex */
public class f implements m<c> {

    /* renamed from: c, reason: collision with root package name */
    private final m<Bitmap> f11839c;

    public f(m<Bitmap> mVar) {
        this.f11839c = (m) l.d(mVar);
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        this.f11839c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    @o0
    public u<c> b(@o0 Context context, @o0 u<c> uVar, int i5, int i6) {
        c cVar = uVar.get();
        u<Bitmap> gVar = new com.bumptech.glide.load.resource.bitmap.g(cVar.g(), com.bumptech.glide.b.e(context).h());
        u<Bitmap> b6 = this.f11839c.b(context, gVar, i5, i6);
        if (!gVar.equals(b6)) {
            gVar.recycle();
        }
        cVar.q(this.f11839c, b6.get());
        return uVar;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f11839c.equals(((f) obj).f11839c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f11839c.hashCode();
    }
}
