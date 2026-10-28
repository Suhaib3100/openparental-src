package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.y0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: p, reason: collision with root package name */
    private static final String f38615p = ProtectedSandApp.s("î");

    /* renamed from: q, reason: collision with root package name */
    private static final p0<Throwable> f38616q = new i();

    /* renamed from: b, reason: collision with root package name */
    private final p0<k> f38617b;

    /* renamed from: c, reason: collision with root package name */
    private final p0<Throwable> f38618c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    private p0<Throwable> f38619d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.v
    private int f38620e;

    /* renamed from: f, reason: collision with root package name */
    private final n0 f38621f;

    /* renamed from: g, reason: collision with root package name */
    private String f38622g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.v0
    private int f38623h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f38624i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f38625j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38626k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<c> f38627l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<r0> f38628m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.annotation.q0
    private v0<k> f38629n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.q0
    private k f38630o;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        String f38631b;

        /* renamed from: c, reason: collision with root package name */
        int f38632c;

        /* renamed from: d, reason: collision with root package name */
        float f38633d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38634e;

        /* renamed from: f, reason: collision with root package name */
        String f38635f;

        /* renamed from: g, reason: collision with root package name */
        int f38636g;

        /* renamed from: h, reason: collision with root package name */
        int f38637h;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f38631b);
            parcel.writeFloat(this.f38633d);
            parcel.writeInt(this.f38634e ? 1 : 0);
            parcel.writeString(this.f38635f);
            parcel.writeInt(this.f38636g);
            parcel.writeInt(this.f38637h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f38631b = parcel.readString();
            this.f38633d = parcel.readFloat();
            this.f38634e = parcel.readInt() == 1;
            this.f38635f = parcel.readString();
            this.f38636g = parcel.readInt();
            this.f38637h = parcel.readInt();
        }
    }

    class a implements p0<Throwable> {
        a() {
        }

        @Override // com.airbnb.lottie.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f38620e != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f38620e);
            }
            (LottieAnimationView.this.f38619d == null ? LottieAnimationView.f38616q : LottieAnimationView.this.f38619d).onResult(th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f38639d;

        b(com.airbnb.lottie.value.l lVar) {
            this.f38639d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f38639d.a(bVar);
        }
    }

    private enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f38617b = new p0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.p0
            public final void onResult(Object obj) {
                LottieAnimationView.this.q0((k) obj);
            }
        };
        this.f38618c = new a();
        this.f38620e = 0;
        this.f38621f = new n0();
        this.f38624i = false;
        this.f38625j = false;
        this.f38626k = true;
        this.f38627l = new HashSet();
        this.f38628m = new HashSet();
        N(null, y0.c.f39574q2);
    }

    private void N(@androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, y0.n.j5, i4, 0);
        this.f38626k = obtainStyledAttributes.getBoolean(y0.n.l5, true);
        int i5 = y0.n.v5;
        boolean hasValue = obtainStyledAttributes.hasValue(i5);
        int i6 = y0.n.q5;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i6);
        int i7 = y0.n.A5;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i7);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ï"));
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i5, 0);
            if (resourceId != 0) {
                g0(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i6);
            if (string2 != null) {
                i0(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i7)) != null) {
            l0(string);
        }
        t0(obtainStyledAttributes.getResourceId(y0.n.p5, 0));
        if (obtainStyledAttributes.getBoolean(y0.n.k5, false)) {
            this.f38625j = true;
        }
        if (obtainStyledAttributes.getBoolean(y0.n.t5, false)) {
            this.f38621f.q1(-1);
        }
        int i10 = y0.n.y5;
        if (obtainStyledAttributes.hasValue(i10)) {
            Q0(obtainStyledAttributes.getInt(i10, 1));
        }
        int i11 = y0.n.x5;
        if (obtainStyledAttributes.hasValue(i11)) {
            P0(obtainStyledAttributes.getInt(i11, -1));
        }
        int i12 = y0.n.z5;
        if (obtainStyledAttributes.hasValue(i12)) {
            S0(obtainStyledAttributes.getFloat(i12, 1.0f));
        }
        int i13 = y0.n.m5;
        if (obtainStyledAttributes.hasValue(i13)) {
            p0(obtainStyledAttributes.getBoolean(i13, true));
        }
        y0(obtainStyledAttributes.getString(y0.n.s5));
        N0(obtainStyledAttributes.getFloat(y0.n.u5, 0.0f));
        u(obtainStyledAttributes.getBoolean(y0.n.o5, false));
        int i14 = y0.n.n5;
        if (obtainStyledAttributes.hasValue(i14)) {
            o(new com.airbnb.lottie.model.e(ProtectedSandApp.s("ð")), s0.K, new com.airbnb.lottie.value.j(new a1(androidx.core.content.d.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i14, -1)).getDefaultColor())));
        }
        int i15 = y0.n.w5;
        if (obtainStyledAttributes.hasValue(i15)) {
            z0 z0Var = z0.AUTOMATIC;
            int i16 = obtainStyledAttributes.getInt(i15, z0Var.ordinal());
            if (i16 >= z0.values().length) {
                i16 = z0Var.ordinal();
            }
            O0(z0.values()[i16]);
        }
        w0(obtainStyledAttributes.getBoolean(y0.n.r5, false));
        obtainStyledAttributes.recycle();
        this.f38621f.u1(Boolean.valueOf(com.airbnb.lottie.utils.j.f(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0 Q(String str) throws Exception {
        return this.f38626k ? w.q(getContext(), str) : w.r(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0 R(int i4) throws Exception {
        return this.f38626k ? w.E(getContext(), i4) : w.F(getContext(), i4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Throwable th) {
        if (!com.airbnb.lottie.utils.j.k(th)) {
            throw new IllegalStateException(ProtectedSandApp.s("ò"), th);
        }
        com.airbnb.lottie.utils.f.f(ProtectedSandApp.s("ñ"), th);
    }

    private void r() {
        v0<k> v0Var = this.f38629n;
        if (v0Var != null) {
            v0Var.j(this.f38617b);
            this.f38629n.i(this.f38618c);
        }
    }

    private void r0(v0<k> v0Var) {
        this.f38627l.add(c.SET_ANIMATION);
        s();
        r();
        this.f38629n = v0Var.d(this.f38617b).c(this.f38618c);
    }

    private void s() {
        this.f38630o = null;
        this.f38621f.C();
    }

    private v0<k> v(final String str) {
        return isInEditMode() ? new v0<>(new Callable() { // from class: com.airbnb.lottie.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 Q;
                Q = LottieAnimationView.this.Q(str);
                return Q;
            }
        }, true) : this.f38626k ? w.o(getContext(), str) : w.p(getContext(), str, null);
    }

    private v0<k> w(@androidx.annotation.v0 final int i4) {
        return isInEditMode() ? new v0<>(new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 R;
                R = LottieAnimationView.this.R(i4);
                return R;
            }
        }, true) : this.f38626k ? w.C(getContext(), i4) : w.D(getContext(), i4, null);
    }

    private void z0() {
        boolean O = O();
        setImageDrawable(null);
        setImageDrawable(this.f38621f);
        if (O) {
            this.f38621f.Q0();
        }
    }

    public int A() {
        return this.f38621f.T();
    }

    public void A0(boolean z4) {
        this.f38621f.b1(z4);
    }

    @androidx.annotation.q0
    public String B() {
        return this.f38621f.W();
    }

    public void B0(int i4) {
        this.f38621f.c1(i4);
    }

    public boolean C() {
        return this.f38621f.Y();
    }

    public void C0(String str) {
        this.f38621f.d1(str);
    }

    public float D() {
        return this.f38621f.Z();
    }

    public void D0(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        this.f38621f.e1(f4);
    }

    public float E() {
        return this.f38621f.a0();
    }

    public void E0(int i4, int i5) {
        this.f38621f.f1(i4, i5);
    }

    @androidx.annotation.q0
    public x0 F() {
        return this.f38621f.b0();
    }

    public void F0(String str) {
        this.f38621f.g1(str);
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public float G() {
        return this.f38621f.c0();
    }

    public void G0(String str, String str2, boolean z4) {
        this.f38621f.h1(str, str2, z4);
    }

    public z0 H() {
        return this.f38621f.d0();
    }

    public void H0(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f4, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f5) {
        this.f38621f.i1(f4, f5);
    }

    public int I() {
        return this.f38621f.e0();
    }

    public void I0(int i4) {
        this.f38621f.j1(i4);
    }

    public int J() {
        return this.f38621f.f0();
    }

    public void J0(String str) {
        this.f38621f.k1(str);
    }

    public float K() {
        return this.f38621f.g0();
    }

    public void K0(float f4) {
        this.f38621f.l1(f4);
    }

    public boolean L() {
        return this.f38621f.j0();
    }

    public void L0(boolean z4) {
        this.f38621f.m1(z4);
    }

    public boolean M() {
        return this.f38621f.k0();
    }

    public void M0(boolean z4) {
        this.f38621f.n1(z4);
    }

    public void N0(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        this.f38627l.add(c.SET_PROGRESS);
        this.f38621f.o1(f4);
    }

    public boolean O() {
        return this.f38621f.m0();
    }

    public void O0(z0 z0Var) {
        this.f38621f.p1(z0Var);
    }

    public boolean P() {
        return this.f38621f.q0();
    }

    public void P0(int i4) {
        this.f38627l.add(c.SET_REPEAT_COUNT);
        this.f38621f.q1(i4);
    }

    public void Q0(int i4) {
        this.f38627l.add(c.SET_REPEAT_MODE);
        this.f38621f.r1(i4);
    }

    public void R0(boolean z4) {
        this.f38621f.s1(z4);
    }

    public void S0(float f4) {
        this.f38621f.t1(f4);
    }

    @Deprecated
    public void T(boolean z4) {
        this.f38621f.q1(z4 ? -1 : 0);
    }

    public void T0(b1 b1Var) {
        this.f38621f.v1(b1Var);
    }

    @androidx.annotation.l0
    public void U() {
        this.f38625j = false;
        this.f38621f.H0();
    }

    @androidx.annotation.q0
    public Bitmap U0(String str, @androidx.annotation.q0 Bitmap bitmap) {
        return this.f38621f.w1(str, bitmap);
    }

    @androidx.annotation.l0
    public void V() {
        this.f38627l.add(c.PLAY_OPTION);
        this.f38621f.I0();
    }

    public void W() {
        this.f38621f.J0();
    }

    public void X() {
        this.f38628m.clear();
    }

    public void Y() {
        this.f38621f.K0();
    }

    public void Z(Animator.AnimatorListener animatorListener) {
        this.f38621f.L0(animatorListener);
    }

    @androidx.annotation.x0(api = 19)
    public void a0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38621f.M0(animatorPauseListener);
    }

    public boolean b0(@androidx.annotation.o0 r0 r0Var) {
        return this.f38628m.remove(r0Var);
    }

    public void c0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38621f.N0(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.e> d0(com.airbnb.lottie.model.e eVar) {
        return this.f38621f.P0(eVar);
    }

    @androidx.annotation.l0
    public void e0() {
        this.f38627l.add(c.PLAY_OPTION);
        this.f38621f.Q0();
    }

    public void f0() {
        this.f38621f.R0();
    }

    public void g0(@androidx.annotation.v0 int i4) {
        this.f38623h = i4;
        this.f38622g = null;
        r0(w(i4));
    }

    public void h0(InputStream inputStream, @androidx.annotation.q0 String str) {
        r0(w.t(inputStream, str));
    }

    public void i0(String str) {
        this.f38622g = str;
        this.f38623h = 0;
        r0(v(str));
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof n0) && ((n0) drawable).d0() == z0.SOFTWARE) {
            this.f38621f.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@androidx.annotation.o0 Drawable drawable) {
        Drawable drawable2 = getDrawable();
        n0 n0Var = this.f38621f;
        if (drawable2 == n0Var) {
            super.invalidateDrawable(n0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Deprecated
    public void j0(String str) {
        k0(str, null);
    }

    public void k(Animator.AnimatorListener animatorListener) {
        this.f38621f.u(animatorListener);
    }

    public void k0(String str, @androidx.annotation.q0 String str2) {
        h0(new ByteArrayInputStream(str.getBytes()), str2);
    }

    @androidx.annotation.x0(api = 19)
    public void l(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38621f.v(animatorPauseListener);
    }

    public void l0(String str) {
        r0(this.f38626k ? w.G(getContext(), str) : w.H(getContext(), str, null));
    }

    public void m(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38621f.w(animatorUpdateListener);
    }

    public void m0(String str, @androidx.annotation.q0 String str2) {
        r0(w.H(getContext(), str, str2));
    }

    public boolean n(@androidx.annotation.o0 r0 r0Var) {
        k kVar = this.f38630o;
        if (kVar != null) {
            r0Var.a(kVar);
        }
        return this.f38628m.add(r0Var);
    }

    public void n0(boolean z4) {
        this.f38621f.T0(z4);
    }

    public <T> void o(com.airbnb.lottie.model.e eVar, T t4, com.airbnb.lottie.value.j<T> jVar) {
        this.f38621f.x(eVar, t4, jVar);
    }

    public void o0(boolean z4) {
        this.f38626k = z4;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f38625j) {
            return;
        }
        this.f38621f.I0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f38622g = savedState.f38631b;
        Set<c> set = this.f38627l;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f38622g)) {
            i0(this.f38622g);
        }
        this.f38623h = savedState.f38632c;
        if (!this.f38627l.contains(cVar) && (i4 = this.f38623h) != 0) {
            g0(i4);
        }
        if (!this.f38627l.contains(c.SET_PROGRESS)) {
            N0(savedState.f38633d);
        }
        if (!this.f38627l.contains(c.PLAY_OPTION) && savedState.f38634e) {
            V();
        }
        if (!this.f38627l.contains(c.SET_IMAGE_ASSETS)) {
            y0(savedState.f38635f);
        }
        if (!this.f38627l.contains(c.SET_REPEAT_MODE)) {
            Q0(savedState.f38636g);
        }
        if (this.f38627l.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        P0(savedState.f38637h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f38631b = this.f38622g;
        savedState.f38632c = this.f38623h;
        savedState.f38633d = this.f38621f.c0();
        savedState.f38634e = this.f38621f.n0();
        savedState.f38635f = this.f38621f.W();
        savedState.f38636g = this.f38621f.f0();
        savedState.f38637h = this.f38621f.e0();
        return savedState;
    }

    public <T> void p(com.airbnb.lottie.model.e eVar, T t4, com.airbnb.lottie.value.l<T> lVar) {
        this.f38621f.x(eVar, t4, new b(lVar));
    }

    public void p0(boolean z4) {
        this.f38621f.U0(z4);
    }

    @androidx.annotation.l0
    public void q() {
        this.f38627l.add(c.PLAY_OPTION);
        this.f38621f.B();
    }

    public void q0(@androidx.annotation.o0 k kVar) {
        if (e.f38877a) {
            Objects.toString(kVar);
        }
        this.f38621f.setCallback(this);
        this.f38630o = kVar;
        this.f38624i = true;
        boolean V0 = this.f38621f.V0(kVar);
        this.f38624i = false;
        if (getDrawable() != this.f38621f || V0) {
            if (!V0) {
                z0();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<r0> it = this.f38628m.iterator();
            while (it.hasNext()) {
                it.next().a(kVar);
            }
        }
    }

    public void s0(@androidx.annotation.q0 p0<Throwable> p0Var) {
        this.f38619d = p0Var;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        r();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        r();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        r();
        super.setImageResource(i4);
    }

    @Deprecated
    public void t() {
        this.f38621f.G();
    }

    public void t0(@androidx.annotation.v int i4) {
        this.f38620e = i4;
    }

    public void u(boolean z4) {
        this.f38621f.J(z4);
    }

    public void u0(com.airbnb.lottie.c cVar) {
        this.f38621f.W0(cVar);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        n0 n0Var;
        if (!this.f38624i && drawable == (n0Var = this.f38621f) && n0Var.m0()) {
            U();
        } else if (!this.f38624i && (drawable instanceof n0)) {
            n0 n0Var2 = (n0) drawable;
            if (n0Var2.m0()) {
                n0Var2.H0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v0(int i4) {
        this.f38621f.X0(i4);
    }

    public void w0(boolean z4) {
        this.f38621f.Y0(z4);
    }

    public boolean x() {
        return this.f38621f.P();
    }

    public void x0(d dVar) {
        this.f38621f.Z0(dVar);
    }

    @androidx.annotation.q0
    public k y() {
        return this.f38630o;
    }

    public void y0(String str) {
        this.f38621f.a1(str);
    }

    public long z() {
        k kVar = this.f38630o;
        if (kVar != null) {
            return (long) kVar.d();
        }
        return 0L;
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38617b = new p0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.p0
            public final void onResult(Object obj) {
                LottieAnimationView.this.q0((k) obj);
            }
        };
        this.f38618c = new a();
        this.f38620e = 0;
        this.f38621f = new n0();
        this.f38624i = false;
        this.f38625j = false;
        this.f38626k = true;
        this.f38627l = new HashSet();
        this.f38628m = new HashSet();
        N(attributeSet, y0.c.f39574q2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f38617b = new p0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.p0
            public final void onResult(Object obj) {
                LottieAnimationView.this.q0((k) obj);
            }
        };
        this.f38618c = new a();
        this.f38620e = 0;
        this.f38621f = new n0();
        this.f38624i = false;
        this.f38625j = false;
        this.f38626k = true;
        this.f38627l = new HashSet();
        this.f38628m = new HashSet();
        N(attributeSet, i4);
    }
}
