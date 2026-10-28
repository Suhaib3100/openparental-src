package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: ViewOverlayApi18.java */
@x0(18)
/* loaded from: classes3.dex */
class t implements u {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f13736a;

    t(@o0 View view) {
        this.f13736a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.u
    public void a(@o0 Drawable drawable) {
        this.f13736a.add(drawable);
    }

    @Override // com.google.android.material.internal.u
    public void b(@o0 Drawable drawable) {
        this.f13736a.remove(drawable);
    }
}
