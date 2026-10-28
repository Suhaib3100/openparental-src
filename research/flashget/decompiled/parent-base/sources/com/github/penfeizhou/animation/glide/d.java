package com.github.penfeizhou.animation.glide;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.drawable.j;
import com.github.penfeizhou.animation.webp.decode.l;

/* compiled from: FrameDrawableTranscoder.java */
/* loaded from: classes5.dex */
class d implements com.bumptech.glide.load.resource.transcode.e<com.github.penfeizhou.animation.decode.b, Drawable> {

    /* compiled from: FrameDrawableTranscoder.java */
    class a extends j<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.github.penfeizhou.animation.apng.b f50838c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Drawable drawable, com.github.penfeizhou.animation.apng.b bVar) {
            super(drawable);
            this.f50838c = bVar;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.q
        public void c() {
            super.c();
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
            return this.f50838c.i();
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
            this.f50838c.stop();
        }
    }

    /* compiled from: FrameDrawableTranscoder.java */
    class b extends j<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.github.penfeizhou.animation.webp.a f50840c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Drawable drawable, com.github.penfeizhou.animation.webp.a aVar) {
            super(drawable);
            this.f50840c = aVar;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.q
        public void c() {
            super.c();
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
            return this.f50840c.i();
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
            this.f50840c.stop();
        }
    }

    /* compiled from: FrameDrawableTranscoder.java */
    class c extends j<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.github.penfeizhou.animation.gif.a f50842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Drawable drawable, com.github.penfeizhou.animation.gif.a aVar) {
            super(drawable);
            this.f50842c = aVar;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.q
        public void c() {
            super.c();
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
            return this.f50842c.i();
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
            this.f50842c.stop();
        }
    }

    /* compiled from: FrameDrawableTranscoder.java */
    /* renamed from: com.github.penfeizhou.animation.glide.d$d, reason: collision with other inner class name */
    class C0782d extends j<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.github.penfeizhou.animation.avif.a f50844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0782d(Drawable drawable, com.github.penfeizhou.animation.avif.a aVar) {
            super(drawable);
            this.f50844c = aVar;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.q
        public void c() {
            super.c();
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
            return this.f50844c.i();
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
            this.f50844c.stop();
        }
    }

    d() {
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @q0
    public u<Drawable> a(@o0 u<com.github.penfeizhou.animation.decode.b> uVar, @o0 i iVar) {
        com.github.penfeizhou.animation.decode.b bVar = uVar.get();
        boolean booleanValue = ((Boolean) iVar.c(com.github.penfeizhou.animation.glide.a.f50831d)).booleanValue();
        if (bVar instanceof com.github.penfeizhou.animation.apng.decode.b) {
            com.github.penfeizhou.animation.apng.b bVar2 = new com.github.penfeizhou.animation.apng.b((com.github.penfeizhou.animation.apng.decode.b) bVar);
            bVar2.q(false);
            bVar2.s(booleanValue);
            return new a(bVar2, bVar2);
        }
        if (bVar instanceof l) {
            com.github.penfeizhou.animation.webp.a aVar = new com.github.penfeizhou.animation.webp.a((l) bVar);
            aVar.q(false);
            aVar.s(booleanValue);
            return new b(aVar, aVar);
        }
        if (bVar instanceof com.github.penfeizhou.animation.gif.decode.g) {
            com.github.penfeizhou.animation.gif.a aVar2 = new com.github.penfeizhou.animation.gif.a((com.github.penfeizhou.animation.gif.decode.g) bVar);
            aVar2.q(false);
            aVar2.s(booleanValue);
            return new c(aVar2, aVar2);
        }
        if (!(bVar instanceof com.github.penfeizhou.animation.avif.decode.a)) {
            return null;
        }
        com.github.penfeizhou.animation.avif.a aVar3 = new com.github.penfeizhou.animation.avif.a((com.github.penfeizhou.animation.avif.decode.a) bVar);
        aVar3.q(false);
        aVar3.s(booleanValue);
        return new C0782d(aVar3, aVar3);
    }
}
