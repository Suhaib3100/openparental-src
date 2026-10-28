package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.d0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n1.a;

/* compiled from: MaterialSharedAxis.java */
/* loaded from: classes4.dex */
public final class p extends q<v> {

    /* renamed from: w0, reason: collision with root package name */
    public static final int f14812w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f14813x0 = 1;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f14814y0 = 2;

    /* renamed from: u0, reason: collision with root package name */
    private final int f14816u0;

    /* renamed from: v0, reason: collision with root package name */
    private final boolean f14817v0;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14815z0 = a.c.qa;

    @androidx.annotation.f
    private static final int A0 = a.c.Aa;

    /* compiled from: MaterialSharedAxis.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public p(int i5, boolean z5) {
        super(m1(i5, z5), new e());
        this.f14816u0 = i5;
        this.f14817v0 = z5;
    }

    private static v m1(int i5, boolean z5) {
        if (i5 == 0) {
            return new s(z5 ? d0.f5465c : d0.f5464b);
        }
        if (i5 == 1) {
            return new s(z5 ? 80 : 48);
        }
        if (i5 == 2) {
            return new r(z5);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("㍎"), i5));
    }

    private static v o1() {
        return new e();
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator U0(ViewGroup viewGroup, View view, androidx.transition.d0 d0Var, androidx.transition.d0 d0Var2) {
        return super.U0(viewGroup, view, d0Var, d0Var2);
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator W0(ViewGroup viewGroup, View view, androidx.transition.d0 d0Var, androidx.transition.d0 d0Var2) {
        return super.W0(viewGroup, view, d0Var, d0Var2);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void Z0(@o0 v vVar) {
        super.Z0(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void b1() {
        super.b1();
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int e1(boolean z5) {
        return f14815z0;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int f1(boolean z5) {
        return A0;
    }

    @Override // com.google.android.material.transition.q
    @o0
    public /* bridge */ /* synthetic */ v h1() {
        return super.h1();
    }

    @Override // com.google.android.material.transition.q
    @q0
    public /* bridge */ /* synthetic */ v i1() {
        return super.i1();
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ boolean k1(@o0 v vVar) {
        return super.k1(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void l1(@q0 v vVar) {
        super.l1(vVar);
    }

    public int p1() {
        return this.f14816u0;
    }

    public boolean r1() {
        return this.f14817v0;
    }
}
