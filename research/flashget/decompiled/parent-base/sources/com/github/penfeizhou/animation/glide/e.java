package com.github.penfeizhou.animation.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import com.bumptech.glide.Registry;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: GlideAnimationModule.java */
@v3.c
/* loaded from: classes5.dex */
public class e extends com.bumptech.glide.module.d {
    @Override // com.bumptech.glide.module.d, com.bumptech.glide.module.f
    public void b(@o0 Context context, @o0 com.bumptech.glide.c cVar, @o0 Registry registry) {
        b bVar = new b();
        registry.q(InputStream.class, com.github.penfeizhou.animation.decode.b.class, new g(bVar));
        registry.q(ByteBuffer.class, com.github.penfeizhou.animation.decode.b.class, bVar);
        registry.x(com.github.penfeizhou.animation.decode.b.class, Drawable.class, new d());
        registry.x(com.github.penfeizhou.animation.decode.b.class, Bitmap.class, new c(cVar.h()));
    }
}
