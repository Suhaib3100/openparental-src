package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.f0;
import com.bumptech.glide.util.m;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: classes3.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f44666a;

    public b(@o0 Context context) {
        this(context.getResources());
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @q0
    public u<BitmapDrawable> a(@o0 u<Bitmap> uVar, @o0 i iVar) {
        return f0.d(this.f44666a, uVar);
    }

    @Deprecated
    public b(@o0 Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(resources);
    }

    public b(@o0 Resources resources) {
        this.f44666a = (Resources) m.f(resources, ProtectedSandApp.s("ਣ"));
    }
}
