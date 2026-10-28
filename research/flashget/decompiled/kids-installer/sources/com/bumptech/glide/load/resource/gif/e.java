package com.bumptech.glide.load.resource.gif;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.q;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes3.dex */
public class e extends com.bumptech.glide.load.resource.drawable.b<c> implements q {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return ((c) this.f11805o).l();
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.q
    public void b() {
        ((c) this.f11805o).g().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<c> c() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        ((c) this.f11805o).stop();
        ((c) this.f11805o).o();
    }
}
