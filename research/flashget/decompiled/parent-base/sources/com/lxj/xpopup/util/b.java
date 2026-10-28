package com.lxj.xpopup.util;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: ImageDownloadTarget.java */
/* loaded from: classes6.dex */
public abstract class b implements p<File> {

    /* renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.request.e f69789b;

    /* renamed from: c, reason: collision with root package name */
    private final int f69790c;

    /* renamed from: d, reason: collision with root package name */
    private final int f69791d;

    protected b() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.p
    public void a(@o0 o cb2) {
    }

    @Override // com.bumptech.glide.request.target.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void j(@o0 File resource, com.bumptech.glide.request.transition.f<? super File> transition) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void g(Drawable placeholder) {
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public com.bumptech.glide.request.e h() {
        return this.f69789b;
    }

    @Override // com.bumptech.glide.request.target.p
    public void i(Drawable placeholder) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void l(@q0 com.bumptech.glide.request.e request) {
        this.f69789b = request;
    }

    @Override // com.bumptech.glide.request.target.p
    public void m(Drawable errorDrawable) {
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
    public final void p(@o0 o cb2) {
        if (com.bumptech.glide.util.o.x(this.f69790c, this.f69791d)) {
            cb2.d(this.f69790c, this.f69791d);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("៘\u0001"));
        sb.append(this.f69790c);
        sb.append(ProtectedSandApp.s("៙\u0001"));
        throw new IllegalArgumentException(android.support.v4.media.b.a(sb, this.f69791d, ProtectedSandApp.s("៚\u0001")));
    }

    private b(int width, int height) {
        this.f69790c = width;
        this.f69791d = height;
    }
}
