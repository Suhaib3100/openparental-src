package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.request.transition.k;

/* compiled from: ViewAnimationFactory.java */
/* loaded from: classes3.dex */
public class h<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final k.a f44925a;

    /* renamed from: b, reason: collision with root package name */
    private f<R> f44926b;

    /* compiled from: ViewAnimationFactory.java */
    private static class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final Animation f44927a;

        a(Animation animation) {
            this.f44927a = animation;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return this.f44927a;
        }
    }

    /* compiled from: ViewAnimationFactory.java */
    private static class b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f44928a;

        b(int i4) {
            this.f44928a = i4;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f44928a);
        }
    }

    public h(Animation animation) {
        this(new a(animation));
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z4) {
        if (aVar == com.bumptech.glide.load.a.MEMORY_CACHE || !z4) {
            return e.b();
        }
        if (this.f44926b == null) {
            this.f44926b = new k(this.f44925a);
        }
        return this.f44926b;
    }

    public h(int i4) {
        this(new b(i4));
    }

    h(k.a aVar) {
        this.f44925a = aVar;
    }
}
