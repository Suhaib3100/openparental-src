package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.view.d0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n1.a;

/* compiled from: MaterialSharedAxis.java */
@x0(21)
/* loaded from: classes3.dex */
public final class q extends r<w> {

    /* renamed from: t, reason: collision with root package name */
    public static final int f14936t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14937u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14938v = 2;

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14939w = a.c.qa;

    /* renamed from: x, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14940x = a.c.Aa;

    /* renamed from: r, reason: collision with root package name */
    private final int f14941r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f14942s;

    /* compiled from: MaterialSharedAxis.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public q(int i5, boolean z5) {
        super(o(i5, z5), new e());
        this.f14941r = i5;
        this.f14942s = z5;
    }

    private static w o(int i5, boolean z5) {
        if (i5 == 0) {
            return new t(z5 ? d0.f5465c : d0.f5464b);
        }
        if (i5 == 1) {
            return new t(z5 ? 80 : 48);
        }
        if (i5 == 2) {
            return new s(z5);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("❭"), i5));
    }

    private static w p() {
        return new e();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void a(@o0 w wVar) {
        super.a(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int f(boolean z5) {
        return f14939w;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int i(boolean z5) {
        return f14940x;
    }

    @Override // com.google.android.material.transition.platform.r
    @o0
    public /* bridge */ /* synthetic */ w j() {
        return super.j();
    }

    @Override // com.google.android.material.transition.platform.r
    @q0
    public /* bridge */ /* synthetic */ w k() {
        return super.k();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ boolean m(@o0 w wVar) {
        return super.m(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void n(@q0 w wVar) {
        super.n(wVar);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public int q() {
        return this.f14941r;
    }

    public boolean s() {
        return this.f14942s;
    }
}
