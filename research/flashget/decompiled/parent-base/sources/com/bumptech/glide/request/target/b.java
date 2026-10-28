package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.q0;

/* compiled from: BaseTarget.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class b<Z> implements p<Z> {

    /* renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.request.e f44855b;

    @Override // com.bumptech.glide.request.target.p
    public void g(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public com.bumptech.glide.request.e h() {
        return this.f44855b;
    }

    @Override // com.bumptech.glide.request.target.p
    public void i(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void l(@q0 com.bumptech.glide.request.e eVar) {
        this.f44855b = eVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public void m(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }
}
