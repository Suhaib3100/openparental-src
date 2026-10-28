package com.google.android.material.transition;

/* compiled from: FadeModeResult.java */
/* loaded from: classes6.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    final int f54549a;

    /* renamed from: b, reason: collision with root package name */
    final int f54550b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f54551c;

    private c(int i4, int i5, boolean z4) {
        this.f54549a = i4;
        this.f54550b = i5;
        this.f54551c = z4;
    }

    static c a(int i4, int i5) {
        return new c(i4, i5, true);
    }

    static c b(int i4, int i5) {
        return new c(i4, i5, false);
    }
}
