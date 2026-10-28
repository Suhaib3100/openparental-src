package com.google.android.material.transition.platform;

import androidx.annotation.x0;

/* compiled from: FadeModeResult.java */
@x0(21)
/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    final int f14822a;

    /* renamed from: b, reason: collision with root package name */
    final int f14823b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f14824c;

    private c(int i5, int i6, boolean z5) {
        this.f14822a = i5;
        this.f14823b = i6;
        this.f14824c = z5;
    }

    static c a(int i5, int i6) {
        return new c(i5, i6, true);
    }

    static c b(int i5, int i6) {
        return new c(i5, i6, false);
    }
}
