package com.bumptech.glide.load.resource.gif;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.q;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes3.dex */
public class e extends com.bumptech.glide.load.resource.drawable.j<c> implements q {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<c> a() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.q
    public void c() {
        ((c) this.f44582b).h().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return ((c) this.f44582b).m();
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        ((c) this.f44582b).stop();
        ((c) this.f44582b).p();
    }
}
