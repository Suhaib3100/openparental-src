package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.m;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes3.dex */
public class f implements m<c> {

    /* renamed from: c, reason: collision with root package name */
    private final m<Bitmap> f44619c;

    public f(m<Bitmap> mVar) {
        this.f44619c = (m) com.bumptech.glide.util.m.f(mVar, ProtectedSandApp.s("ਖ"));
    }

    @Override // com.bumptech.glide.load.m
    @o0
    public u<c> a(@o0 Context context, @o0 u<c> uVar, int i4, int i5) {
        c cVar = uVar.get();
        u<Bitmap> hVar = new com.bumptech.glide.load.resource.bitmap.h(cVar.h(), com.bumptech.glide.c.e(context).h());
        u<Bitmap> a5 = this.f44619c.a(context, hVar, i4, i5);
        if (!hVar.equals(a5)) {
            hVar.recycle();
        }
        cVar.r(this.f44619c, a5.get());
        return uVar;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        this.f44619c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f44619c.equals(((f) obj).f44619c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f44619c.hashCode();
    }
}
