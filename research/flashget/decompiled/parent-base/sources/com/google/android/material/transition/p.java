package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.f0;
import androidx.transition.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s8.a;

/* compiled from: MaterialSharedAxis.java */
/* loaded from: classes6.dex */
public final class p extends q<v> {
    public static final int W2 = 0;
    public static final int X2 = 1;
    public static final int Y2 = 2;

    @androidx.annotation.f
    private static final int Z2 = a.c.f90529pa;

    /* renamed from: a3, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54649a3 = a.c.f90654za;
    private final int U2;
    private final boolean V2;

    /* compiled from: MaterialSharedAxis.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public p(int i4, boolean z4) {
        super(g1(i4, z4), new e());
        this.U2 = i4;
        this.V2 = z4;
    }

    private static v g1(int i4, boolean z4) {
        if (i4 == 0) {
            return new s(z4 ? f0.f27130c : f0.f27129b);
        }
        if (i4 == 1) {
            return new s(z4 ? 80 : 48);
        }
        if (i4 == 2) {
            return new r(z4);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf28f"), i4));
    }

    private static v h1() {
        return new e();
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator P0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return super.P0(viewGroup, view, b0Var, b0Var2);
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator R0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return super.R0(viewGroup, view, b0Var, b0Var2);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void U0(@o0 v vVar) {
        super.U0(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void W0() {
        super.W0();
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int Z0(boolean z4) {
        return Z2;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int a1(boolean z4) {
        return f54649a3;
    }

    @Override // com.google.android.material.transition.q
    @o0
    public /* bridge */ /* synthetic */ v b1() {
        return super.b1();
    }

    @Override // com.google.android.material.transition.q
    @q0
    public /* bridge */ /* synthetic */ v c1() {
        return super.c1();
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ boolean e1(@o0 v vVar) {
        return super.e1(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void f1(@q0 v vVar) {
        super.f1(vVar);
    }

    public int i1() {
        return this.U2;
    }

    public boolean j1() {
        return this.V2;
    }
}
