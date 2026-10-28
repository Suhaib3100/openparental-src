package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: ViewStubProxy.java */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private ViewStub f6111a;

    /* renamed from: b, reason: collision with root package name */
    private ViewDataBinding f6112b;

    /* renamed from: c, reason: collision with root package name */
    private View f6113c;

    /* renamed from: d, reason: collision with root package name */
    private ViewStub.OnInflateListener f6114d;

    /* renamed from: e, reason: collision with root package name */
    private ViewDataBinding f6115e;

    /* renamed from: f, reason: collision with root package name */
    private ViewStub.OnInflateListener f6116f;

    /* compiled from: ViewStubProxy.java */
    class a implements ViewStub.OnInflateListener {
        a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            g0.this.f6113c = view;
            g0 g0Var = g0.this;
            g0Var.f6112b = m.c(g0Var.f6115e.f6019z, view, viewStub.getLayoutResource());
            g0.this.f6111a = null;
            if (g0.this.f6114d != null) {
                g0.this.f6114d.onInflate(viewStub, view);
                g0.this.f6114d = null;
            }
            g0.this.f6115e.Z();
            g0.this.f6115e.v();
        }
    }

    public g0(@o0 ViewStub viewStub) {
        a aVar = new a();
        this.f6116f = aVar;
        this.f6111a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @q0
    public ViewDataBinding g() {
        return this.f6112b;
    }

    public View h() {
        return this.f6113c;
    }

    @q0
    public ViewStub i() {
        return this.f6111a;
    }

    public boolean j() {
        return this.f6113c != null;
    }

    public void k(@o0 ViewDataBinding viewDataBinding) {
        this.f6115e = viewDataBinding;
    }

    public void l(@q0 ViewStub.OnInflateListener onInflateListener) {
        if (this.f6111a != null) {
            this.f6114d = onInflateListener;
        }
    }
}
