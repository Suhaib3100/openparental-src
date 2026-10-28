package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.view.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s8.a;

/* compiled from: MaterialSharedAxis.java */
@x0(21)
/* loaded from: classes6.dex */
public final class q extends r<w> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f54775g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f54776h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f54777i = 2;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54778j = a.c.f90529pa;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54779k = a.c.f90654za;

    /* renamed from: e, reason: collision with root package name */
    private final int f54780e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f54781f;

    /* compiled from: MaterialSharedAxis.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public q(int i4, boolean z4) {
        super(p(i4, z4), new e());
        this.f54780e = i4;
        this.f54781f = z4;
    }

    private static w p(int i4, boolean z4) {
        if (i4 == 0) {
            return new t(z4 ? f0.f27130c : f0.f27129b);
        }
        if (i4 == 1) {
            return new t(z4 ? 80 : 48);
        }
        if (i4 == 2) {
            return new s(z4);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf299"), i4));
    }

    private static w q() {
        return new e();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void b(@o0 w wVar) {
        super.b(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int g(boolean z4) {
        return f54778j;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int i(boolean z4) {
        return f54779k;
    }

    @Override // com.google.android.material.transition.platform.r
    @o0
    public /* bridge */ /* synthetic */ w k() {
        return super.k();
    }

    @Override // com.google.android.material.transition.platform.r
    @q0
    public /* bridge */ /* synthetic */ w l() {
        return super.l();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ boolean n(@o0 w wVar) {
        return super.n(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void o(@q0 w wVar) {
        super.o(wVar);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public int r() {
        return this.f54780e;
    }

    public boolean s() {
        return this.f54781f;
    }
}
