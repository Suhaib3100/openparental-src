package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.f;

/* compiled from: BitmapContainerTransitionFactory.java */
/* loaded from: classes3.dex */
public abstract class a<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final g<Drawable> f44912a;

    /* compiled from: BitmapContainerTransitionFactory.java */
    /* renamed from: com.bumptech.glide.request.transition.a$a, reason: collision with other inner class name */
    private final class C0754a implements f<R> {

        /* renamed from: a, reason: collision with root package name */
        private final f<Drawable> f44913a;

        C0754a(f<Drawable> fVar) {
            this.f44913a = fVar;
        }

        @Override // com.bumptech.glide.request.transition.f
        public boolean a(R r4, f.a aVar) {
            return this.f44913a.a(new BitmapDrawable(aVar.getView().getResources(), a.this.b(r4)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f44912a = gVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z4) {
        return new C0754a(this.f44912a.a(aVar, z4));
    }

    protected abstract Bitmap b(R r4);
}
