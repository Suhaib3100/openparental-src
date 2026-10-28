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
import androidx.appcompat.view.b;
import androidx.fragment.app.l0;
import d.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class ActionBar {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f650a = 0;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f651b = 1;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f652c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f653d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f654e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f655f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f656g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f657h = 16;

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void a(boolean z4);
    }

    @Deprecated
    public interface d {
        boolean a(int i4, long j4);
    }

    @Deprecated
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public static final int f659a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract e h(@g1 int i4);

        public abstract e i(CharSequence charSequence);

        public abstract e j(int i4);

        public abstract e k(View view);

        public abstract e l(@androidx.annotation.v int i4);

        public abstract e m(Drawable drawable);

        public abstract e n(f fVar);

        public abstract e o(Object obj);

        public abstract e p(int i4);

        public abstract e q(CharSequence charSequence);
    }

    @Deprecated
    public interface f {
        void a(e eVar, l0 l0Var);

        void b(e eVar, l0 l0Var);

        void c(e eVar, l0 l0Var);
    }

    public Context A() {
        return null;
    }

    public abstract void A0(CharSequence charSequence);

    @q0
    public abstract CharSequence B();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void B0(CharSequence charSequence) {
    }

    public abstract void C();

    public abstract void C0();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean D() {
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.b D0(b.a aVar) {
        return null;
    }

    public boolean E() {
        return false;
    }

    public abstract boolean F();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean G() {
        return false;
    }

    @Deprecated
    public abstract e H();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void I(Configuration configuration) {
    }

    void J() {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean K(int i4, KeyEvent keyEvent) {
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean L(KeyEvent keyEvent) {
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean M() {
        return false;
    }

    @Deprecated
    public abstract void N();

    public abstract void O(c cVar);

    @Deprecated
    public abstract void P(e eVar);

    @Deprecated
    public abstract void Q(int i4);

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    boolean R() {
        return false;
    }

    @Deprecated
    public abstract void S(e eVar);

    public abstract void T(@q0 Drawable drawable);

    public abstract void U(int i4);

    public abstract void V(View view);

    public abstract void W(View view, LayoutParams layoutParams);

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void X(boolean z4) {
    }

    public abstract void Y(boolean z4);

    public abstract void Z(int i4);

    public abstract void a0(int i4, int i5);

    public abstract void b0(boolean z4);

    public abstract void c0(boolean z4);

    public abstract void d0(boolean z4);

    public abstract void e0(boolean z4);

    public void f0(float f4) {
        if (f4 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void g(c cVar);

    public void g0(int i4) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(e eVar);

    public void h0(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void i(e eVar, int i4);

    public void i0(@g1 int i4) {
    }

    @Deprecated
    public abstract void j(e eVar, int i4, boolean z4);

    public void j0(@q0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void k(e eVar, boolean z4);

    public void k0(@androidx.annotation.v int i4) {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(@q0 Drawable drawable) {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return false;
    }

    public void m0(boolean z4) {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void n(boolean z4) {
    }

    public abstract void n0(@androidx.annotation.v int i4);

    public abstract View o();

    public abstract void o0(Drawable drawable);

    public abstract int p();

    @Deprecated
    public abstract void p0(SpinnerAdapter spinnerAdapter, d dVar);

    public float q() {
        return 0.0f;
    }

    public abstract void q0(@androidx.annotation.v int i4);

    public abstract int r();

    public abstract void r0(Drawable drawable);

    public int s() {
        return 0;
    }

    @Deprecated
    public abstract void s0(int i4);

    @Deprecated
    public abstract int t();

    @Deprecated
    public abstract void t0(int i4);

    @Deprecated
    public abstract int u();

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void u0(boolean z4) {
    }

    @Deprecated
    public abstract int v();

    public void v0(Drawable drawable) {
    }

    @q0
    @Deprecated
    public abstract e w();

    public void w0(Drawable drawable) {
    }

    @q0
    public abstract CharSequence x();

    public abstract void x0(int i4);

    @Deprecated
    public abstract e y(int i4);

    public abstract void y0(CharSequence charSequence);

    @Deprecated
    public abstract int z();

    public abstract void z0(@g1 int i4);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f658a;

        public LayoutParams(@o0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f658a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.E);
            this.f658a = obtainStyledAttributes.getInt(a.m.F, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f658a = 8388627;
        }

        public LayoutParams(int i4, int i5, int i6) {
            super(i4, i5);
            this.f658a = i6;
        }

        public LayoutParams(int i4) {
            this(-2, -1, i4);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f658a = 0;
            this.f658a = layoutParams.f658a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f658a = 0;
        }
    }
}
