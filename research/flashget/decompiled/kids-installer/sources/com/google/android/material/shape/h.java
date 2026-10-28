package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: InterpolateOnScrollPositionChangeHelper.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private View f13991a;

    /* renamed from: b, reason: collision with root package name */
    private j f13992b;

    /* renamed from: c, reason: collision with root package name */
    private ScrollView f13993c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f13994d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    private final int[] f13995e = new int[2];

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f13996f = new a();

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
        this.f13991a = view;
        this.f13992b = jVar;
        this.f13993c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f13993c = scrollView;
    }

    public void b(j jVar) {
        this.f13992b = jVar;
    }

    public void c(@o0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f13996f);
    }

    public void d(@o0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f13996f);
    }

    public void e() {
        ScrollView scrollView = this.f13993c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ቑ"));
        }
        this.f13993c.getLocationInWindow(this.f13994d);
        this.f13993c.getChildAt(0).getLocationInWindow(this.f13995e);
        int top = (this.f13991a.getTop() - this.f13994d[1]) + this.f13995e[1];
        int height = this.f13991a.getHeight();
        int height2 = this.f13993c.getHeight();
        if (top < 0) {
            this.f13992b.q0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f13991a.invalidate();
            return;
        }
        if (top + height > height2) {
            this.f13992b.q0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((r0 - height2) / height))));
            this.f13991a.invalidate();
        } else if (this.f13992b.B() != 1.0f) {
            this.f13992b.q0(1.0f);
            this.f13991a.invalidate();
        }
    }
}
