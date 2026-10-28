package com.airbnb.lottie.model.content;

/* compiled from: Mask.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final a f39016a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f39017b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f39018c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39019d;

    /* compiled from: Mask.java */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public h(a aVar, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z4) {
        this.f39016a = aVar;
        this.f39017b = hVar;
        this.f39018c = dVar;
        this.f39019d = z4;
    }

    public a a() {
        return this.f39016a;
    }

    public com.airbnb.lottie.model.animatable.h b() {
        return this.f39017b;
    }

    public com.airbnb.lottie.model.animatable.d c() {
        return this.f39018c;
    }

    public boolean d() {
        return this.f39019d;
    }
}
