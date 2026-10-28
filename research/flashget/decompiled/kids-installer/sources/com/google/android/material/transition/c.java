package com.google.android.material.transition;

/* compiled from: FadeModeResult.java */
/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    final int f14710a;

    /* renamed from: b, reason: collision with root package name */
    final int f14711b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f14712c;

    private c(int i5, int i6, boolean z5) {
        this.f14710a = i5;
        this.f14711b = i6;
        this.f14712c = z5;
    }

    static c a(int i5, int i6) {
        return new c(i5, i6, true);
    }

    static c b(int i5, int i6) {
        return new c(i5, i6, false);
    }
}
