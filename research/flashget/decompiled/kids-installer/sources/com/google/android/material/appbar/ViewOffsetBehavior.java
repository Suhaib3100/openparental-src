package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.o0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    private a f12893a;

    /* renamed from: b, reason: collision with root package name */
    private int f12894b;

    /* renamed from: c, reason: collision with root package name */
    private int f12895c;

    public ViewOffsetBehavior() {
        this.f12894b = 0;
        this.f12895c = 0;
    }

    public int G() {
        a aVar = this.f12893a;
        if (aVar != null) {
            return aVar.d();
        }
        return 0;
    }

    public int H() {
        a aVar = this.f12893a;
        if (aVar != null) {
            return aVar.e();
        }
        return 0;
    }

    public boolean I() {
        a aVar = this.f12893a;
        return aVar != null && aVar.f();
    }

    public boolean J() {
        a aVar = this.f12893a;
        return aVar != null && aVar.g();
    }

    protected void K(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, int i5) {
        coordinatorLayout.W(v5, i5);
    }

    public void L(boolean z5) {
        a aVar = this.f12893a;
        if (aVar != null) {
            aVar.i(z5);
        }
    }

    public boolean M(int i5) {
        a aVar = this.f12893a;
        if (aVar != null) {
            return aVar.j(i5);
        }
        this.f12895c = i5;
        return false;
    }

    public boolean N(int i5) {
        a aVar = this.f12893a;
        if (aVar != null) {
            return aVar.k(i5);
        }
        this.f12894b = i5;
        return false;
    }

    public void O(boolean z5) {
        a aVar = this.f12893a;
        if (aVar != null) {
            aVar.l(z5);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, int i5) {
        K(coordinatorLayout, v5, i5);
        if (this.f12893a == null) {
            this.f12893a = new a(v5);
        }
        this.f12893a.h();
        this.f12893a.a();
        int i6 = this.f12894b;
        if (i6 != 0) {
            this.f12893a.k(i6);
            this.f12894b = 0;
        }
        int i7 = this.f12895c;
        if (i7 == 0) {
            return true;
        }
        this.f12893a.j(i7);
        this.f12895c = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12894b = 0;
        this.f12895c = 0;
    }
}
