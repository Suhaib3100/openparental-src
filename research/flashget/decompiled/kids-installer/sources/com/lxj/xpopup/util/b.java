package com.lxj.xpopup.util;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;

/* compiled from: ImageDownloadTarget.java */
/* loaded from: classes6.dex */
public abstract class b implements p<File> {

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.request.e f21312o;

    /* renamed from: p, reason: collision with root package name */
    private final int f21313p;

    /* renamed from: q, reason: collision with root package name */
    private final int f21314q;

    protected b() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.p
    public void a(@o0 o cb) {
    }

    @Override // com.bumptech.glide.request.target.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@o0 File resource, com.bumptech.glide.request.transition.f<? super File> transition) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void h(@q0 com.bumptech.glide.request.e request) {
        this.f21312o = request;
    }

    @Override // com.bumptech.glide.request.target.p
    public void k(Drawable errorDrawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void n(Drawable placeholder) {
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public com.bumptech.glide.request.e o() {
        return this.f21312o;
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
    public void p(Drawable placeholder) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void q(@o0 o cb) {
        if (n.w(this.f21313p, this.f21314q)) {
            cb.e(this.f21313p, this.f21314q);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("死"));
        sb.append(this.f21313p);
        sb.append(ProtectedSandApp.s("歼"));
        throw new IllegalArgumentException(androidx.constraintlayout.solver.e.a(sb, this.f21314q, ProtectedSandApp.s("歽")));
    }

    private b(int width, int height) {
        this.f21313p = width;
        this.f21314q = height;
    }
}
