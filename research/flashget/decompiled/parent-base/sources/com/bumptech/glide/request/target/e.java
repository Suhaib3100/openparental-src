package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CustomTarget.java */
/* loaded from: classes3.dex */
public abstract class e<T> implements p<T> {

    /* renamed from: b, reason: collision with root package name */
    private final int f44856b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44857c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private com.bumptech.glide.request.e f44858d;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.p
    public final void a(@o0 o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void g(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public final com.bumptech.glide.request.e h() {
        return this.f44858d;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void l(@q0 com.bumptech.glide.request.e eVar) {
        this.f44858d = eVar;
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

    @Override // com.bumptech.glide.request.target.p
    public final void p(@o0 o oVar) {
        oVar.d(this.f44856b, this.f44857c);
    }

    public e(int i4, int i5) {
        if (!com.bumptech.glide.util.o.x(i4, i5)) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("ਗ"), i4, ProtectedSandApp.s("ਘ"), i5));
        }
        this.f44856b = i4;
        this.f44857c = i5;
    }
}
