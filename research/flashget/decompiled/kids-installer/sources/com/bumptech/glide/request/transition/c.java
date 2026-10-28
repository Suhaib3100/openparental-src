package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableCrossFadeFactory.java */
/* loaded from: classes3.dex */
public class c implements g<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f12109a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12110b;

    /* renamed from: c, reason: collision with root package name */
    private d f12111c;

    /* compiled from: DrawableCrossFadeFactory.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final int f12112c = 300;

        /* renamed from: a, reason: collision with root package name */
        private final int f12113a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12114b;

        public a() {
            this(f12112c);
        }

        public c a() {
            return new c(this.f12113a, this.f12114b);
        }

        public a b(boolean z5) {
            this.f12114b = z5;
            return this;
        }

        public a(int i5) {
            this.f12113a = i5;
        }
    }

    protected c(int i5, boolean z5) {
        this.f12109a = i5;
        this.f12110b = z5;
    }

    private f<Drawable> b() {
        if (this.f12111c == null) {
            this.f12111c = new d(this.f12109a, this.f12110b);
        }
        return this.f12111c;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<Drawable> a(com.bumptech.glide.load.a aVar, boolean z5) {
        return aVar == com.bumptech.glide.load.a.MEMORY_CACHE ? e.b() : b();
    }
}
