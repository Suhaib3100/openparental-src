package com.google.android.material.transition.platform;

import androidx.annotation.x0;

/* compiled from: FadeModeResult.java */
@x0(21)
/* loaded from: classes6.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    final int f54654a;

    /* renamed from: b, reason: collision with root package name */
    final int f54655b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f54656c;

    private c(int i4, int i5, boolean z4) {
        this.f54654a = i4;
        this.f54655b = i5;
        this.f54656c = z4;
    }

    static c a(int i4, int i5) {
        return new c(i4, i5, true);
    }

    static c b(int i4, int i5) {
        return new c(i4, i5, false);
    }
}
