package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: ViewGroupOverlayApi18.java */
@x0(18)
/* loaded from: classes6.dex */
class q implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f53522a;

    q(@o0 ViewGroup viewGroup) {
        this.f53522a = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.u
    public void a(@o0 Drawable drawable) {
        this.f53522a.add(drawable);
    }

    @Override // com.google.android.material.internal.u
    public void b(@o0 Drawable drawable) {
        this.f53522a.remove(drawable);
    }

    @Override // com.google.android.material.internal.r
    public void c(@o0 View view) {
        this.f53522a.add(view);
    }

    @Override // com.google.android.material.internal.r
    public void d(@o0 View view) {
        this.f53522a.remove(view);
    }
}
