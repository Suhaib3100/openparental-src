package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.q0;

/* compiled from: BaseTarget.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class b<Z> implements p<Z> {

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.request.e f12049o;

    @Override // com.bumptech.glide.request.target.p
    public void h(@q0 com.bumptech.glide.request.e eVar) {
        this.f12049o = eVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public void k(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void n(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public com.bumptech.glide.request.e o() {
        return this.f12049o;
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@q0 Drawable drawable) {
    }
}
