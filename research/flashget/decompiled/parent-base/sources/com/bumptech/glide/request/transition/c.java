package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableCrossFadeFactory.java */
/* loaded from: classes3.dex */
public class c implements g<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f44915a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44916b;

    /* renamed from: c, reason: collision with root package name */
    private d f44917c;

    /* compiled from: DrawableCrossFadeFactory.java */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final int f44918c = 300;

        /* renamed from: a, reason: collision with root package name */
        private final int f44919a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f44920b;

        public a() {
            this(300);
        }

        public c a() {
            return new c(this.f44919a, this.f44920b);
        }

        public a b(boolean z4) {
            this.f44920b = z4;
            return this;
        }

        public a(int i4) {
            this.f44919a = i4;
        }
    }

    protected c(int i4, boolean z4) {
        this.f44915a = i4;
        this.f44916b = z4;
    }

    private f<Drawable> b() {
        if (this.f44917c == null) {
            this.f44917c = new d(this.f44915a, this.f44916b);
        }
        return this.f44917c;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<Drawable> a(com.bumptech.glide.load.a aVar, boolean z4) {
        return aVar == com.bumptech.glide.load.a.MEMORY_CACHE ? e.b() : b();
    }
}
