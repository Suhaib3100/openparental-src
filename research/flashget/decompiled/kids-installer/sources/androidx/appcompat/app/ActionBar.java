package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.appcompat.view.b;
import androidx.fragment.app.f0;
import d.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class ActionBar {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f157a = 0;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f158b = 1;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f159c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f160d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f161e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f162f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f163g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f164h = 16;

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void onMenuVisibilityChanged(boolean z5);
    }

    @Deprecated
    public interface d {
        boolean onNavigationItemSelected(int i5, long j5);
    }

    @Deprecated
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public static final int f166a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract e h(@g1 int i5);

        public abstract e i(CharSequence charSequence);

        public abstract e j(int i5);

        public abstract e k(View view);

        public abstract e l(@v int i5);

        public abstract e m(Drawable drawable);

        public abstract e n(f fVar);

        public abstract e o(Object obj);

        public abstract e p(int i5);

        public abstract e q(CharSequence charSequence);
    }

    @Deprecated
    public interface f {
        void a(e eVar, f0 f0Var);

        void b(e eVar, f0 f0Var);

        void c(e eVar, f0 f0Var);
    }

    @q0
    public abstract CharSequence A();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void A0(CharSequence charSequence) {
    }

    public abstract void B();

    public abstract void B0();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean C() {
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.b C0(b.a aVar) {
        return null;
    }

    public boolean D() {
        return false;
    }

    public abstract boolean E();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean F() {
        return false;
    }

    @Deprecated
    public abstract e G();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void H(Configuration configuration) {
    }

    void I() {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean J(int i5, KeyEvent keyEvent) {
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean K(KeyEvent keyEvent) {
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean L() {
        return false;
    }

    @Deprecated
    public abstract void M();

    public abstract void N(c cVar);

    @Deprecated
    public abstract void O(e eVar);

    @Deprecated
    public abstract void P(int i5);

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    boolean Q() {
        return false;
    }

    @Deprecated
    public abstract void R(e eVar);

    public abstract void S(@q0 Drawable drawable);

    public abstract void T(int i5);

    public abstract void U(View view);

    public abstract void V(View view, LayoutParams layoutParams);

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void W(boolean z5) {
    }

    public abstract void X(boolean z5);

    public abstract void Y(int i5);

    public abstract void Z(int i5, int i6);

    public abstract void a0(boolean z5);

    public abstract void b0(boolean z5);

    public abstract void c0(boolean z5);

    public abstract void d0(boolean z5);

    public void e0(float f6) {
        if (f6 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void f(c cVar);

    public void f0(int i5) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void g(e eVar);

    public void g0(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(e eVar, int i5);

    public void h0(@g1 int i5) {
    }

    @Deprecated
    public abstract void i(e eVar, int i5, boolean z5);

    public void i0(@q0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void j(e eVar, boolean z5);

    public void j0(@v int i5) {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean k() {
        return false;
    }

    public void k0(@q0 Drawable drawable) {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(boolean z5) {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z5) {
    }

    public abstract void m0(@v int i5);

    public abstract View n();

    public abstract void n0(Drawable drawable);

    public abstract int o();

    @Deprecated
    public abstract void o0(SpinnerAdapter spinnerAdapter, d dVar);

    public float p() {
        return 0.0f;
    }

    public abstract void p0(@v int i5);

    public abstract int q();

    public abstract void q0(Drawable drawable);

    public int r() {
        return 0;
    }

    @Deprecated
    public abstract void r0(int i5);

    @Deprecated
    public abstract int s();

    @Deprecated
    public abstract void s0(int i5);

    @Deprecated
    public abstract int t();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void t0(boolean z5) {
    }

    @Deprecated
    public abstract int u();

    public void u0(Drawable drawable) {
    }

    @q0
    @Deprecated
    public abstract e v();

    public void v0(Drawable drawable) {
    }

    @q0
    public abstract CharSequence w();

    public abstract void w0(int i5);

    @Deprecated
    public abstract e x(int i5);

    public abstract void x0(CharSequence charSequence);

    @Deprecated
    public abstract int y();

    public abstract void y0(@g1 int i5);

    public Context z() {
        return null;
    }

    public abstract void z0(CharSequence charSequence);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f165a;

        public LayoutParams(@o0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f165a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.E);
            this.f165a = obtainStyledAttributes.getInt(a.n.F, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f165a = 8388627;
        }

        public LayoutParams(int i5, int i6, int i7) {
            super(i5, i6);
            this.f165a = i7;
        }

        public LayoutParams(int i5) {
            this(-2, -1, i5);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f165a = 0;
            this.f165a = layoutParams.f165a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f165a = 0;
        }
    }
}
