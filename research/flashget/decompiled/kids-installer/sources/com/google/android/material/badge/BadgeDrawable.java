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
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.shape.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import n1.a;

/* loaded from: classes3.dex */
public class BadgeDrawable extends Drawable implements k.b {
    public static final int E = 8388661;
    public static final int F = 8388659;
    public static final int G = 8388693;
    public static final int H = 8388691;
    private static final int I = 4;
    private static final int J = -1;
    private static final int K = 9;
    private float A;
    private float B;

    @q0
    private WeakReference<View> C;

    @q0
    private WeakReference<FrameLayout> D;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final WeakReference<Context> f12904o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final j f12905p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final k f12906q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final Rect f12907r;

    /* renamed from: s, reason: collision with root package name */
    private final float f12908s;

    /* renamed from: t, reason: collision with root package name */
    private final float f12909t;

    /* renamed from: u, reason: collision with root package name */
    private final float f12910u;

    /* renamed from: v, reason: collision with root package name */
    @o0
    private final SavedState f12911v;

    /* renamed from: w, reason: collision with root package name */
    private float f12912w;

    /* renamed from: x, reason: collision with root package name */
    private float f12913x;

    /* renamed from: y, reason: collision with root package name */
    private int f12914y;

    /* renamed from: z, reason: collision with root package name */
    private float f12915z;
    static final String N = ProtectedSandApp.s("⚈");

    @h1
    private static final int L = a.n.Oa;

    @f
    private static final int M = a.c.f29284s0;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f12928o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ FrameLayout f12929p;

        a(View view, FrameLayout frameLayout) {
            this.f12928o = view;
            this.f12929p = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.S(this.f12928o, this.f12929p);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    private BadgeDrawable(@o0 Context context) {
        this.f12904o = new WeakReference<>(context);
        n.c(context);
        Resources resources = context.getResources();
        this.f12907r = new Rect();
        this.f12905p = new j();
        this.f12908s = resources.getDimensionPixelSize(a.f.O2);
        this.f12910u = resources.getDimensionPixelSize(a.f.N2);
        this.f12909t = resources.getDimensionPixelSize(a.f.T2);
        k kVar = new k(this);
        this.f12906q = kVar;
        kVar.e().setTextAlign(Paint.Align.CENTER);
        this.f12911v = new SavedState(context);
        L(a.n.f6);
    }

    private void K(@q0 d dVar) {
        Context context;
        if (this.f12906q.d() == dVar || (context = this.f12904o.get()) == null) {
            return;
        }
        this.f12906q.i(dVar, context);
        T();
    }

    private void L(@h1 int i5) {
        Context context = this.f12904o.get();
        if (context == null) {
            return;
        }
        K(new d(context, i5));
    }

    private void O(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != a.h.R2) {
            WeakReference<FrameLayout> weakReference = this.D;
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
                this.D = new WeakReference<>(frameLayout);
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
        Context context = this.f12904o.get();
        WeakReference<View> weakReference = this.C;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f12907r);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.D;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.a.f12931a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        com.google.android.material.badge.a.l(this.f12907r, this.f12912w, this.f12913x, this.A, this.B);
        this.f12905p.l0(this.f12915z);
        if (rect.equals(this.f12907r)) {
            return;
        }
        this.f12905p.setBounds(this.f12907r);
    }

    private void U() {
        this.f12914y = ((int) Math.pow(10.0d, r() - 1.0d)) - 1;
    }

    private void b(@o0 Context context, @o0 Rect rect, @o0 View view) {
        int i5 = this.f12911v.f12927z + this.f12911v.B;
        int i6 = this.f12911v.f12924w;
        if (i6 == 8388691 || i6 == 8388693) {
            this.f12913x = rect.bottom - i5;
        } else {
            this.f12913x = rect.top + i5;
        }
        if (s() <= 9) {
            float f6 = !v() ? this.f12908s : this.f12909t;
            this.f12915z = f6;
            this.B = f6;
            this.A = f6;
        } else {
            float f7 = this.f12909t;
            this.f12915z = f7;
            this.B = f7;
            this.A = (this.f12906q.f(m()) / 2.0f) + this.f12910u;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(v() ? a.f.P2 : a.f.M2);
        int i7 = this.f12911v.f12926y + this.f12911v.A;
        int i8 = this.f12911v.f12924w;
        if (i8 == 8388659 || i8 == 8388691) {
            this.f12912w = y1.Z(view) == 0 ? (rect.left - this.A) + dimensionPixelSize + i7 : ((rect.right + this.A) - dimensionPixelSize) - i7;
        } else {
            this.f12912w = y1.Z(view) == 0 ? ((rect.right + this.A) - dimensionPixelSize) - i7 : (rect.left - this.A) + dimensionPixelSize + i7;
        }
    }

    @o0
    public static BadgeDrawable d(@o0 Context context) {
        return e(context, null, M, L);
    }

    @o0
    private static BadgeDrawable e(@o0 Context context, AttributeSet attributeSet, @f int i5, @h1 int i6) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.w(context, attributeSet, i5, i6);
        return badgeDrawable;
    }

    @o0
    public static BadgeDrawable f(@o0 Context context, @o1 int i5) {
        AttributeSet a6 = r1.a.a(context, i5, ProtectedSandApp.s("⚉"));
        int styleAttribute = a6.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = L;
        }
        return e(context, a6, M, styleAttribute);
    }

    @o0
    static BadgeDrawable g(@o0 Context context, @o0 SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.y(savedState);
        return badgeDrawable;
    }

    private void h(Canvas canvas) {
        Rect rect = new Rect();
        String m5 = m();
        this.f12906q.e().getTextBounds(m5, 0, m5.length(), rect);
        canvas.drawText(m5, this.f12912w, this.f12913x + (rect.height() / 2), this.f12906q.e());
    }

    @o0
    private String m() {
        if (s() <= this.f12914y) {
            return NumberFormat.getInstance().format(s());
        }
        Context context = this.f12904o.get();
        return context == null ? "" : context.getString(a.m.f29965n0, Integer.valueOf(this.f12914y), ProtectedSandApp.s("⚊"));
    }

    private void w(Context context, AttributeSet attributeSet, @f int i5, @h1 int i6) {
        TypedArray j5 = n.j(context, attributeSet, a.o.U3, i5, i6, new int[0]);
        I(j5.getInt(a.o.Z3, 4));
        int i7 = a.o.f30157a4;
        if (j5.hasValue(i7)) {
            J(j5.getInt(i7, 0));
        }
        B(x(context, j5, a.o.V3));
        int i8 = a.o.X3;
        if (j5.hasValue(i8)) {
            D(x(context, j5, i8));
        }
        C(j5.getInt(a.o.W3, E));
        H(j5.getDimensionPixelOffset(a.o.Y3, 0));
        M(j5.getDimensionPixelOffset(a.o.f30164b4, 0));
        j5.recycle();
    }

    private static int x(Context context, @o0 TypedArray typedArray, @i1 int i5) {
        return c.a(context, typedArray, i5).getDefaultColor();
    }

    private void y(@o0 SavedState savedState) {
        I(savedState.f12920s);
        if (savedState.f12919r != -1) {
            J(savedState.f12919r);
        }
        B(savedState.f12916o);
        D(savedState.f12917p);
        C(savedState.f12924w);
        H(savedState.f12926y);
        M(savedState.f12927z);
        z(savedState.A);
        A(savedState.B);
        N(savedState.f12925x);
    }

    void A(int i5) {
        this.f12911v.B = i5;
        T();
    }

    public void B(@l int i5) {
        this.f12911v.f12916o = i5;
        ColorStateList valueOf = ColorStateList.valueOf(i5);
        if (this.f12905p.A() != valueOf) {
            this.f12905p.p0(valueOf);
            invalidateSelf();
        }
    }

    public void C(int i5) {
        if (this.f12911v.f12924w != i5) {
            this.f12911v.f12924w = i5;
            WeakReference<View> weakReference = this.C;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.C.get();
            WeakReference<FrameLayout> weakReference2 = this.D;
            S(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public void D(@l int i5) {
        this.f12911v.f12917p = i5;
        if (this.f12906q.e().getColor() != i5) {
            this.f12906q.e().setColor(i5);
            invalidateSelf();
        }
    }

    public void E(@g1 int i5) {
        this.f12911v.f12923v = i5;
    }

    public void F(CharSequence charSequence) {
        this.f12911v.f12921t = charSequence;
    }

    public void G(@t0 int i5) {
        this.f12911v.f12922u = i5;
    }

    public void H(int i5) {
        this.f12911v.f12926y = i5;
        T();
    }

    public void I(int i5) {
        if (this.f12911v.f12920s != i5) {
            this.f12911v.f12920s = i5;
            U();
            this.f12906q.j(true);
            T();
            invalidateSelf();
        }
    }

    public void J(int i5) {
        int max = Math.max(0, i5);
        if (this.f12911v.f12919r != max) {
            this.f12911v.f12919r = max;
            this.f12906q.j(true);
            T();
            invalidateSelf();
        }
    }

    public void M(int i5) {
        this.f12911v.f12927z = i5;
        T();
    }

    public void N(boolean z5) {
        setVisible(z5, false);
        this.f12911v.f12925x = z5;
        if (!com.google.android.material.badge.a.f12931a || p() == null || z5) {
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
            throw new IllegalArgumentException(ProtectedSandApp.s("⚋"));
        }
        S(view, (FrameLayout) viewGroup);
    }

    public void S(@o0 View view, @q0 FrameLayout frameLayout) {
        this.C = new WeakReference<>(view);
        boolean z5 = com.google.android.material.badge.a.f12931a;
        if (z5 && frameLayout == null) {
            O(view);
        } else {
            this.D = new WeakReference<>(frameLayout);
        }
        if (!z5) {
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
        this.f12911v.f12919r = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f12905p.draw(canvas);
        if (v()) {
            h(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12911v.f12918q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12907r.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12907r.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    int i() {
        return this.f12911v.A;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    int j() {
        return this.f12911v.B;
    }

    @l
    public int k() {
        return this.f12905p.A().getDefaultColor();
    }

    public int l() {
        return this.f12911v.f12924w;
    }

    @l
    public int n() {
        return this.f12906q.e().getColor();
    }

    @q0
    public CharSequence o() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!v()) {
            return this.f12911v.f12921t;
        }
        if (this.f12911v.f12922u <= 0 || (context = this.f12904o.get()) == null) {
            return null;
        }
        return s() <= this.f12914y ? context.getResources().getQuantityString(this.f12911v.f12922u, s(), Integer.valueOf(s())) : context.getString(this.f12911v.f12923v, Integer.valueOf(this.f12914y));
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @q0
    public FrameLayout p() {
        WeakReference<FrameLayout> weakReference = this.D;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int q() {
        return this.f12911v.f12926y;
    }

    public int r() {
        return this.f12911v.f12920s;
    }

    public int s() {
        if (v()) {
            return this.f12911v.f12919r;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f12911v.f12918q = i5;
        this.f12906q.e().setAlpha(i5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @o0
    public SavedState t() {
        return this.f12911v;
    }

    public int u() {
        return this.f12911v.f12927z;
    }

    public boolean v() {
        return this.f12911v.f12919r != -1;
    }

    void z(int i5) {
        this.f12911v.A = i5;
        T();
    }

    @c1({c1.a.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        @r(unit = 1)
        private int A;

        @r(unit = 1)
        private int B;

        /* renamed from: o, reason: collision with root package name */
        @l
        private int f12916o;

        /* renamed from: p, reason: collision with root package name */
        @l
        private int f12917p;

        /* renamed from: q, reason: collision with root package name */
        private int f12918q;

        /* renamed from: r, reason: collision with root package name */
        private int f12919r;

        /* renamed from: s, reason: collision with root package name */
        private int f12920s;

        /* renamed from: t, reason: collision with root package name */
        @q0
        private CharSequence f12921t;

        /* renamed from: u, reason: collision with root package name */
        @t0
        private int f12922u;

        /* renamed from: v, reason: collision with root package name */
        @g1
        private int f12923v;

        /* renamed from: w, reason: collision with root package name */
        private int f12924w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f12925x;

        /* renamed from: y, reason: collision with root package name */
        @r(unit = 1)
        private int f12926y;

        /* renamed from: z, reason: collision with root package name */
        @r(unit = 1)
        private int f12927z;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @o0
            public SavedState a(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @o0
            public SavedState[] b(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        public SavedState(@o0 Context context) {
            this.f12918q = 255;
            this.f12919r = -1;
            this.f12917p = new d(context, a.n.f6).f13920a.getDefaultColor();
            this.f12921t = context.getString(a.m.f29959k0);
            this.f12922u = a.l.f29937a;
            this.f12923v = a.m.f29963m0;
            this.f12925x = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            parcel.writeInt(this.f12916o);
            parcel.writeInt(this.f12917p);
            parcel.writeInt(this.f12918q);
            parcel.writeInt(this.f12919r);
            parcel.writeInt(this.f12920s);
            parcel.writeString(this.f12921t.toString());
            parcel.writeInt(this.f12922u);
            parcel.writeInt(this.f12924w);
            parcel.writeInt(this.f12926y);
            parcel.writeInt(this.f12927z);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B);
            parcel.writeInt(this.f12925x ? 1 : 0);
        }

        protected SavedState(@o0 Parcel parcel) {
            this.f12918q = 255;
            this.f12919r = -1;
            this.f12916o = parcel.readInt();
            this.f12917p = parcel.readInt();
            this.f12918q = parcel.readInt();
            this.f12919r = parcel.readInt();
            this.f12920s = parcel.readInt();
            this.f12921t = parcel.readString();
            this.f12922u = parcel.readInt();
            this.f12924w = parcel.readInt();
            this.f12926y = parcel.readInt();
            this.f12927z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readInt();
            this.f12925x = parcel.readInt() != 0;
        }
    }
}
