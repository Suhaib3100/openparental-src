package com.github.penfeizhou.animation.glide;

import android.graphics.Bitmap;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.h;
import java.io.IOException;

/* compiled from: FrameBitmapTranscoder.java */
/* loaded from: classes5.dex */
class c implements com.bumptech.glide.load.resource.transcode.e<com.github.penfeizhou.animation.decode.b, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f50837a;

    c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f50837a = eVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @q0
    public u<Bitmap> a(@o0 u<com.github.penfeizhou.animation.decode.b> uVar, @o0 i iVar) {
        try {
            return h.d(uVar.get().v(0), this.f50837a);
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
