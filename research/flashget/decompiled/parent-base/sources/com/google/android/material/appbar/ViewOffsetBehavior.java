package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.o0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    private b f52602a;

    /* renamed from: b, reason: collision with root package name */
    private int f52603b;

    /* renamed from: c, reason: collision with root package name */
    private int f52604c;

    public ViewOffsetBehavior() {
        this.f52603b = 0;
        this.f52604c = 0;
    }

    public int G() {
        b bVar = this.f52602a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public int H() {
        b bVar = this.f52602a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0;
    }

    public boolean I() {
        b bVar = this.f52602a;
        return bVar != null && bVar.f();
    }

    public boolean J() {
        b bVar = this.f52602a;
        return bVar != null && bVar.g();
    }

    protected void K(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, int i4) {
        coordinatorLayout.T(v4, i4);
    }

    public void L(boolean z4) {
        b bVar = this.f52602a;
        if (bVar != null) {
            bVar.i(z4);
        }
    }

    public boolean M(int i4) {
        b bVar = this.f52602a;
        if (bVar != null) {
            return bVar.j(i4);
        }
        this.f52604c = i4;
        return false;
    }

    public boolean N(int i4) {
        b bVar = this.f52602a;
        if (bVar != null) {
            return bVar.k(i4);
        }
        this.f52603b = i4;
        return false;
    }

    public void O(boolean z4) {
        b bVar = this.f52602a;
        if (bVar != null) {
            bVar.l(z4);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, int i4) {
        K(coordinatorLayout, v4, i4);
        if (this.f52602a == null) {
            this.f52602a = new b(v4);
        }
        this.f52602a.h();
        this.f52602a.a();
        int i5 = this.f52603b;
        if (i5 != 0) {
            this.f52602a.k(i5);
            this.f52603b = 0;
        }
        int i6 = this.f52604c;
        if (i6 == 0) {
            return true;
        }
        this.f52602a.j(i6);
        this.f52604c = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52603b = 0;
        this.f52604c = 0;
    }
}
