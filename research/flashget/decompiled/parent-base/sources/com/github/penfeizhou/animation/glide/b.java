package com.github.penfeizhou.animation.glide;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import com.github.penfeizhou.animation.gif.decode.h;
import com.github.penfeizhou.animation.webp.decode.l;
import com.github.penfeizhou.animation.webp.decode.m;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferAnimationDecoder.java */
/* loaded from: classes5.dex */
public class b implements k<ByteBuffer, com.github.penfeizhou.animation.decode.b> {

    /* compiled from: ByteBufferAnimationDecoder.java */
    class a extends com.github.penfeizhou.animation.loader.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f50833a;

        a(ByteBuffer byteBuffer) {
            this.f50833a = byteBuffer;
        }

        @Override // com.github.penfeizhou.animation.loader.b
        public ByteBuffer b() {
            this.f50833a.position(0);
            return this.f50833a;
        }
    }

    /* compiled from: ByteBufferAnimationDecoder.java */
    /* renamed from: com.github.penfeizhou.animation.glide.b$b, reason: collision with other inner class name */
    private static class C0781b implements u<com.github.penfeizhou.animation.decode.b> {

        /* renamed from: b, reason: collision with root package name */
        private final com.github.penfeizhou.animation.decode.b f50835b;

        /* renamed from: c, reason: collision with root package name */
        private final int f50836c;

        C0781b(com.github.penfeizhou.animation.decode.b bVar, int i4) {
            this.f50835b = bVar;
            this.f50836c = i4;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Class<com.github.penfeizhou.animation.decode.b> a() {
            return com.github.penfeizhou.animation.decode.b.class;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.github.penfeizhou.animation.decode.b get() {
            return this.f50835b;
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
            return this.f50836c;
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
            this.f50835b.W();
        }
    }

    @Override // com.bumptech.glide.load.k
    @q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<com.github.penfeizhou.animation.decode.b> b(@o0 ByteBuffer byteBuffer, int i4, int i5, @o0 i iVar) throws IOException {
        com.github.penfeizhou.animation.decode.b aVar;
        a aVar2 = new a(byteBuffer);
        if (m.c(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            aVar = new l(aVar2, null);
        } else if (com.github.penfeizhou.animation.apng.decode.d.c(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            aVar = new com.github.penfeizhou.animation.apng.decode.b(aVar2, null);
        } else if (h.d(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            aVar = new com.github.penfeizhou.animation.gif.decode.g(aVar2, null);
        } else {
            if (!com.github.penfeizhou.animation.avif.decode.c.c(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
                return null;
            }
            aVar = new com.github.penfeizhou.animation.avif.decode.a(aVar2, null);
        }
        return new C0781b(aVar, byteBuffer.limit());
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 ByteBuffer byteBuffer, @o0 i iVar) {
        return (!((Boolean) iVar.c(com.github.penfeizhou.animation.glide.a.f50829b)).booleanValue() && m.c(new com.github.penfeizhou.animation.io.a(byteBuffer))) || (!((Boolean) iVar.c(com.github.penfeizhou.animation.glide.a.f50830c)).booleanValue() && com.github.penfeizhou.animation.apng.decode.d.c(new com.github.penfeizhou.animation.io.a(byteBuffer))) || ((!((Boolean) iVar.c(com.github.penfeizhou.animation.glide.a.f50828a)).booleanValue() && h.d(new com.github.penfeizhou.animation.io.a(byteBuffer))) || (!((Boolean) iVar.c(com.github.penfeizhou.animation.glide.a.f50832e)).booleanValue() && com.github.penfeizhou.animation.avif.decode.c.c(new com.github.penfeizhou.animation.io.a(byteBuffer))));
    }
}
