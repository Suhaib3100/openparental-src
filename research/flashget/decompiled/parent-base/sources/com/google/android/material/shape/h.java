package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: InterpolateOnScrollPositionChangeHelper.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private View f53851a;

    /* renamed from: b, reason: collision with root package name */
    private j f53852b;

    /* renamed from: c, reason: collision with root package name */
    private ScrollView f53853c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f53854d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    private final int[] f53855e = new int[2];

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f53856f = new a();

    /* compiled from: InterpolateOnScrollPositionChangeHelper.java */
    class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            h.this.e();
        }
    }

    public h(View view, j jVar, ScrollView scrollView) {
        this.f53851a = view;
        this.f53852b = jVar;
        this.f53853c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f53853c = scrollView;
    }

    public void b(j jVar) {
        this.f53852b = jVar;
    }

    public void c(@o0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f53856f);
    }

    public void d(@o0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f53856f);
    }

    public void e() {
        ScrollView scrollView = this.f53853c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf20e"));
        }
        this.f53853c.getLocationInWindow(this.f53854d);
        this.f53853c.getChildAt(0).getLocationInWindow(this.f53855e);
        int top2 = (this.f53851a.getTop() - this.f53854d[1]) + this.f53855e[1];
        int height = this.f53851a.getHeight();
        int height2 = this.f53853c.getHeight();
        if (top2 < 0) {
            this.f53852b.q0(Math.max(0.0f, Math.min(1.0f, (top2 / height) + 1.0f)));
            this.f53851a.invalidate();
            return;
        }
        if (top2 + height > height2) {
            this.f53852b.q0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((r0 - height2) / height))));
            this.f53851a.invalidate();
        } else if (this.f53852b.B() != 1.0f) {
            this.f53852b.q0(1.0f);
            this.f53851a.invalidate();
        }
    }
}
