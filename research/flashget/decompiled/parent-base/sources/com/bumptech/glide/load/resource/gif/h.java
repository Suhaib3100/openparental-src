package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.k;
import java.io.IOException;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes3.dex */
public final class h implements k<com.bumptech.glide.gifdecoder.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44646a;

    public h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f44646a = eVar;
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(@o0 com.bumptech.glide.gifdecoder.a aVar, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<Bitmap> b(@o0 com.bumptech.glide.gifdecoder.a aVar, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.resource.bitmap.h.d(aVar.getNextFrame(), this.f44646a);
    }

    public boolean d(@o0 com.bumptech.glide.gifdecoder.a aVar, @o0 com.bumptech.glide.load.i iVar) {
        return true;
    }
}
