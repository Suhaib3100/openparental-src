package com.bumptech.glide.request.target;

import android.content.preferences.protobuf.v;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: CustomTarget.java */
/* loaded from: classes3.dex */
public abstract class e<T> implements p<T> {

    /* renamed from: o, reason: collision with root package name */
    private final int f12050o;

    /* renamed from: p, reason: collision with root package name */
    private final int f12051p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private com.bumptech.glide.request.e f12052q;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.p
    public final void a(@o0 o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void h(@q0 com.bumptech.glide.request.e eVar) {
        this.f12052q = eVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public void k(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void n(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public final com.bumptech.glide.request.e o() {
        return this.f12052q;
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
    public final void q(@o0 o oVar) {
        oVar.e(this.f12050o, this.f12051p);
    }

    public e(int i5, int i6) {
        if (!com.bumptech.glide.util.n.w(i5, i6)) {
            throw new IllegalArgumentException(v.a(ProtectedSandApp.s("ᶅ"), i5, ProtectedSandApp.s("ᶆ"), i6));
        }
        this.f12050o = i5;
        this.f12051p = i6;
    }
}
