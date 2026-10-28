package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.f;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.i1;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.o1;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.shape.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import s8.a;

/* loaded from: classes6.dex */
public class BadgeDrawable extends Drawable implements k.b {

    /* renamed from: r, reason: collision with root package name */
    public static final int f52613r = 8388661;

    /* renamed from: s, reason: collision with root package name */
    public static final int f52614s = 8388659;

    /* renamed from: t, reason: collision with root package name */
    public static final int f52615t = 8388693;

    /* renamed from: u, reason: collision with root package name */
    public static final int f52616u = 8388691;

    /* renamed from: v, reason: collision with root package name */
    private static final int f52617v = 4;

    /* renamed from: w, reason: collision with root package name */
    private static final int f52618w = -1;

    /* renamed from: x, reason: collision with root package name */
    private static final int f52619x = 9;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final WeakReference<Context> f52622b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final j f52623c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final k f52624d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final Rect f52625e;

    /* renamed from: f, reason: collision with root package name */
    private final float f52626f;

    /* renamed from: g, reason: collision with root package name */
    private final float f52627g;

    /* renamed from: h, reason: collision with root package name */
    private final float f52628h;

    /* renamed from: i, reason: collision with root package name */
    @o0
    private final SavedState f52629i;

    /* renamed from: j, reason: collision with root package name */
    private float f52630j;

    /* renamed from: k, reason: collision with root package name */
    private float f52631k;

    /* renamed from: l, reason: collision with root package name */
    private int f52632l;

    /* renamed from: m, reason: collision with root package name */
    private float f52633m;

    /* renamed from: n, reason: collision with root package name */
    private float f52634n;

    /* renamed from: o, reason: collision with root package name */
    private float f52635o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private WeakReference<View> f52636p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private WeakReference<FrameLayout> f52637q;
    static final String A = ProtectedSandApp.s("\uf14d");

    /* renamed from: y, reason: collision with root package name */
    @h1
    private static final int f52620y = a.n.Oa;

    /* renamed from: z, reason: collision with root package name */
    @f
    private static final int f52621z = a.c.f90551r0;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f52652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FrameLayout f52653c;

        a(View view, FrameLayout frameLayout) {
            this.f52652b = view;
            this.f52653c = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.S(this.f52652b, this.f52653c);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private BadgeDrawable(@o0 Context context) {
        this.f52622b = new WeakReference<>(context);
        n.c(context);
        Resources resources = context.getResources();
        this.f52625e = new Rect();
        this.f52623c = new j();
        this.f52626f = resources.getDimensionPixelSize(a.f.O2);
        this.f52628h = resources.getDimensionPixelSize(a.f.N2);
        this.f52627g = resources.getDimensionPixelSize(a.f.T2);
        k kVar = new k(this);
        this.f52624d = kVar;
        kVar.e().setTextAlign(Paint.Align.CENTER);
        this.f52629i = new SavedState(context);
        L(a.n.f6);
    }

    private void K(@q0 d dVar) {
        Context context;
        if (this.f52624d.d() == dVar || (context = this.f52622b.get()) == null) {
            return;
        }
        this.f52624d.i(dVar, context);
        T();
    }

    private void L(@h1 int i4) {
        Context context = this.f52622b.get();
        if (context == null) {
            return;
        }
        K(new d(context, i4));
    }

    private void O(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != a.h.R2) {
            WeakReference<FrameLayout> weakReference = this.f52637q;
            if (weakReference == null || weakReference.get() != viewGroup) {
                P(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(a.h.R2);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f52637q = new WeakReference<>(frameLayout);
                frameLayout.post(new a(view, frameLayout));
            }
        }
    }

    private static void P(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void T() {
        Context context = this.f52622b.get();
        WeakReference<View> weakReference = this.f52636p;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f52625e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f52637q;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.a.f52655a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        com.google.android.material.badge.a.l(this.f52625e, this.f52630j, this.f52631k, this.f52634n, this.f52635o);
        this.f52623c.l0(this.f52633m);
        if (rect.equals(this.f52625e)) {
            return;
        }
        this.f52623c.setBounds(this.f52625e);
    }

    private void U() {
        this.f52632l = ((int) Math.pow(10.0d, r() - 1.0d)) - 1;
    }

    private void b(@o0 Context context, @o0 Rect rect, @o0 View view) {
        int i4 = this.f52629i.f52649m + this.f52629i.f52651o;
        int i5 = this.f52629i.f52646j;
        if (i5 == 8388691 || i5 == 8388693) {
            this.f52631k = rect.bottom - i4;
        } else {
            this.f52631k = rect.top + i4;
        }
        if (s() <= 9) {
            float f4 = !v() ? this.f52626f : this.f52627g;
            this.f52633m = f4;
            this.f52635o = f4;
            this.f52634n = f4;
        } else {
            float f5 = this.f52627g;
            this.f52633m = f5;
            this.f52635o = f5;
            this.f52634n = (this.f52624d.f(m()) / 2.0f) + this.f52628h;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(v() ? a.f.P2 : a.f.M2);
        int i6 = this.f52629i.f52648l + this.f52629i.f52650n;
        int i7 = this.f52629i.f52646j;
        if (i7 == 8388659 || i7 == 8388691) {
            this.f52630j = x1.c0(view) == 0 ? (rect.left - this.f52634n) + dimensionPixelSize + i6 : ((rect.right + this.f52634n) - dimensionPixelSize) - i6;
        } else {
            this.f52630j = x1.c0(view) == 0 ? ((rect.right + this.f52634n) - dimensionPixelSize) - i6 : (rect.left - this.f52634n) + dimensionPixelSize + i6;
        }
    }

    @o0
    public static BadgeDrawable d(@o0 Context context) {
        return e(context, null, f52621z, f52620y);
    }

    @o0
    private static BadgeDrawable e(@o0 Context context, AttributeSet attributeSet, @f int i4, @h1 int i5) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.w(context, attributeSet, i4, i5);
        return badgeDrawable;
    }

    @o0
    public static BadgeDrawable f(@o0 Context context, @o1 int i4) {
        AttributeSet a5 = w8.a.a(context, i4, ProtectedSandApp.s("\uf14e"));
        int styleAttribute = a5.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = f52620y;
        }
        return e(context, a5, f52621z, styleAttribute);
    }

    @o0
    static BadgeDrawable g(@o0 Context context, @o0 SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.y(savedState);
        return badgeDrawable;
    }

    private void h(Canvas canvas) {
        Rect rect = new Rect();
        String m4 = m();
        this.f52624d.e().getTextBounds(m4, 0, m4.length(), rect);
        canvas.drawText(m4, this.f52630j, this.f52631k + (rect.height() / 2), this.f52624d.e());
    }

    @o0
    private String m() {
        if (s() <= this.f52632l) {
            return NumberFormat.getInstance().format(s());
        }
        Context context = this.f52622b.get();
        return context == null ? "" : context.getString(a.m.f91237n0, Integer.valueOf(this.f52632l), ProtectedSandApp.s("\uf14d"));
    }

    private void w(Context context, AttributeSet attributeSet, @f int i4, @h1 int i5) {
        TypedArray j4 = n.j(context, attributeSet, a.o.V3, i4, i5, new int[0]);
        I(j4.getInt(a.o.f91508a4, 4));
        int i6 = a.o.f91521b4;
        if (j4.hasValue(i6)) {
            J(j4.getInt(i6, 0));
        }
        B(x(context, j4, a.o.W3));
        int i7 = a.o.Y3;
        if (j4.hasValue(i7)) {
            D(x(context, j4, i7));
        }
        C(j4.getInt(a.o.X3, f52613r));
        H(j4.getDimensionPixelOffset(a.o.Z3, 0));
        M(j4.getDimensionPixelOffset(a.o.f91535c4, 0));
        j4.recycle();
    }

    private static int x(Context context, @o0 TypedArray typedArray, @i1 int i4) {
        return c.a(context, typedArray, i4).getDefaultColor();
    }

    private void y(@o0 SavedState savedState) {
        I(savedState.f52642f);
        if (savedState.f52641e != -1) {
            J(savedState.f52641e);
        }
        B(savedState.f52638b);
        D(savedState.f52639c);
        C(savedState.f52646j);
        H(savedState.f52648l);
        M(savedState.f52649m);
        z(savedState.f52650n);
        A(savedState.f52651o);
        N(savedState.f52647k);
    }

    void A(int i4) {
        this.f52629i.f52651o = i4;
        T();
    }

    public void B(@l int i4) {
        this.f52629i.f52638b = i4;
        ColorStateList valueOf = ColorStateList.valueOf(i4);
        if (this.f52623c.A() != valueOf) {
            this.f52623c.p0(valueOf);
            invalidateSelf();
        }
    }

    public void C(int i4) {
        if (this.f52629i.f52646j != i4) {
            this.f52629i.f52646j = i4;
            WeakReference<View> weakReference = this.f52636p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f52636p.get();
            WeakReference<FrameLayout> weakReference2 = this.f52637q;
            S(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public void D(@l int i4) {
        this.f52629i.f52639c = i4;
        if (this.f52624d.e().getColor() != i4) {
            this.f52624d.e().setColor(i4);
            invalidateSelf();
        }
    }

    public void E(@g1 int i4) {
        this.f52629i.f52645i = i4;
    }

    public void F(CharSequence charSequence) {
        this.f52629i.f52643g = charSequence;
    }

    public void G(@t0 int i4) {
        this.f52629i.f52644h = i4;
    }

    public void H(int i4) {
        this.f52629i.f52648l = i4;
        T();
    }

    public void I(int i4) {
        if (this.f52629i.f52642f != i4) {
            this.f52629i.f52642f = i4;
            U();
            this.f52624d.j(true);
            T();
            invalidateSelf();
        }
    }

    public void J(int i4) {
        int max = Math.max(0, i4);
        if (this.f52629i.f52641e != max) {
            this.f52629i.f52641e = max;
            this.f52624d.j(true);
            T();
            invalidateSelf();
        }
    }

    public void M(int i4) {
        this.f52629i.f52649m = i4;
        T();
    }

    public void N(boolean z4) {
        setVisible(z4, false);
        this.f52629i.f52647k = z4;
        if (!com.google.android.material.badge.a.f52655a || p() == null || z4) {
            return;
        }
        ((ViewGroup) p().getParent()).invalidate();
    }

    public void Q(@o0 View view) {
        S(view, null);
    }

    @Deprecated
    public void R(@o0 View view, @q0 ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf14f"));
        }
        S(view, (FrameLayout) viewGroup);
    }

    public void S(@o0 View view, @q0 FrameLayout frameLayout) {
        this.f52636p = new WeakReference<>(view);
        boolean z4 = com.google.android.material.badge.a.f52655a;
        if (z4 && frameLayout == null) {
            O(view);
        } else {
            this.f52637q = new WeakReference<>(frameLayout);
        }
        if (!z4) {
            P(view);
        }
        T();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.k.b
    @c1({c1.a.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public void c() {
        this.f52629i.f52641e = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f52623c.draw(canvas);
        if (v()) {
            h(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f52629i.f52640d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f52625e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f52625e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    int i() {
        return this.f52629i.f52650n;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    int j() {
        return this.f52629i.f52651o;
    }

    @l
    public int k() {
        return this.f52623c.A().getDefaultColor();
    }

    public int l() {
        return this.f52629i.f52646j;
    }

    @l
    public int n() {
        return this.f52624d.e().getColor();
    }

    @q0
    public CharSequence o() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!v()) {
            return this.f52629i.f52643g;
        }
        if (this.f52629i.f52644h <= 0 || (context = this.f52622b.get()) == null) {
            return null;
        }
        return s() <= this.f52632l ? context.getResources().getQuantityString(this.f52629i.f52644h, s(), Integer.valueOf(s())) : context.getString(this.f52629i.f52645i, Integer.valueOf(this.f52632l));
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @q0
    public FrameLayout p() {
        WeakReference<FrameLayout> weakReference = this.f52637q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int q() {
        return this.f52629i.f52648l;
    }

    public int r() {
        return this.f52629i.f52642f;
    }

    public int s() {
        if (v()) {
            return this.f52629i.f52641e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f52629i.f52640d = i4;
        this.f52624d.e().setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @o0
    public SavedState t() {
        return this.f52629i;
    }

    public int u() {
        return this.f52629i.f52649m;
    }

    public boolean v() {
        return this.f52629i.f52641e != -1;
    }

    void z(int i4) {
        this.f52629i.f52650n = i4;
        T();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        private int f52638b;

        /* renamed from: c, reason: collision with root package name */
        @l
        private int f52639c;

        /* renamed from: d, reason: collision with root package name */
        private int f52640d;

        /* renamed from: e, reason: collision with root package name */
        private int f52641e;

        /* renamed from: f, reason: collision with root package name */
        private int f52642f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        private CharSequence f52643g;

        /* renamed from: h, reason: collision with root package name */
        @t0
        private int f52644h;

        /* renamed from: i, reason: collision with root package name */
        @g1
        private int f52645i;

        /* renamed from: j, reason: collision with root package name */
        private int f52646j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f52647k;

        /* renamed from: l, reason: collision with root package name */
        @r(unit = 1)
        private int f52648l;

        /* renamed from: m, reason: collision with root package name */
        @r(unit = 1)
        private int f52649m;

        /* renamed from: n, reason: collision with root package name */
        @r(unit = 1)
        private int f52650n;

        /* renamed from: o, reason: collision with root package name */
        @r(unit = 1)
        private int f52651o;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @o0
            public SavedState a(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @o0
            public SavedState[] b(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(@o0 Context context) {
            this.f52640d = 255;
            this.f52641e = -1;
            this.f52639c = new d(context, a.n.f6).f53770a.getDefaultColor();
            this.f52643g = context.getString(a.m.f91231k0);
            this.f52644h = a.l.f91209a;
            this.f52645i = a.m.f91235m0;
            this.f52647k = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            parcel.writeInt(this.f52638b);
            parcel.writeInt(this.f52639c);
            parcel.writeInt(this.f52640d);
            parcel.writeInt(this.f52641e);
            parcel.writeInt(this.f52642f);
            parcel.writeString(this.f52643g.toString());
            parcel.writeInt(this.f52644h);
            parcel.writeInt(this.f52646j);
            parcel.writeInt(this.f52648l);
            parcel.writeInt(this.f52649m);
            parcel.writeInt(this.f52650n);
            parcel.writeInt(this.f52651o);
            parcel.writeInt(this.f52647k ? 1 : 0);
        }

        protected SavedState(@o0 Parcel parcel) {
            this.f52640d = 255;
            this.f52641e = -1;
            this.f52638b = parcel.readInt();
            this.f52639c = parcel.readInt();
            this.f52640d = parcel.readInt();
            this.f52641e = parcel.readInt();
            this.f52642f = parcel.readInt();
            this.f52643g = parcel.readString();
            this.f52644h = parcel.readInt();
            this.f52646j = parcel.readInt();
            this.f52648l = parcel.readInt();
            this.f52649m = parcel.readInt();
            this.f52650n = parcel.readInt();
            this.f52651o = parcel.readInt();
            this.f52647k = parcel.readInt() != 0;
        }
    }
}
