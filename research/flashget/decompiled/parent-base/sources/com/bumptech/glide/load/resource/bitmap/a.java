package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes3.dex */
public class a<DataType> implements com.bumptech.glide.load.k<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.k<DataType, Bitmap> f44426a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f44427b;

    public a(Context context, com.bumptech.glide.load.k<DataType, Bitmap> kVar) {
        this(context.getResources(), kVar);
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 DataType datatype, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return this.f44426a.a(datatype, iVar);
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.engine.u<BitmapDrawable> b(@androidx.annotation.o0 DataType datatype, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return f0.d(this.f44427b, this.f44426a.b(datatype, i4, i5, iVar));
    }

    @Deprecated
    public a(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.k<DataType, Bitmap> kVar) {
        this(resources, kVar);
    }

    public a(@androidx.annotation.o0 Resources resources, @androidx.annotation.o0 com.bumptech.glide.load.k<DataType, Bitmap> kVar) {
        String s4 = ProtectedSandApp.s("ঌ");
        this.f44427b = (Resources) com.bumptech.glide.util.m.f(resources, s4);
        this.f44426a = (com.bumptech.glide.load.k) com.bumptech.glide.util.m.f(kVar, s4);
    }
}
