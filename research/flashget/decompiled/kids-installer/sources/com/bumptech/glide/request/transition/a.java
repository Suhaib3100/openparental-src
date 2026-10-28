package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.f;

/* compiled from: BitmapContainerTransitionFactory.java */
/* loaded from: classes3.dex */
public abstract class a<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final g<Drawable> f12106a;

    /* compiled from: BitmapContainerTransitionFactory.java */
    /* renamed from: com.bumptech.glide.request.transition.a$a, reason: collision with other inner class name */
    private final class C0153a implements f<R> {

        /* renamed from: a, reason: collision with root package name */
        private final f<Drawable> f12107a;

        C0153a(f<Drawable> fVar) {
            this.f12107a = fVar;
        }

        @Override // com.bumptech.glide.request.transition.f
        public boolean a(R r5, f.a aVar) {
            return this.f12107a.a(new BitmapDrawable(aVar.d().getResources(), a.this.b(r5)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f12106a = gVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z5) {
        return new C0153a(this.f12106a.a(aVar, z5));
    }

    protected abstract Bitmap b(R r5);
}
