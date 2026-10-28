package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.util.h;

/* loaded from: classes5.dex */
public class BubbleLayout extends FrameLayout {
    public int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private Bitmap Q;
    private RectF R;
    private Rect S;
    private Paint T;
    private Paint U;
    private int V;
    private int W;

    /* renamed from: a0, reason: collision with root package name */
    private Paint f21366a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f21367b0;

    /* renamed from: c0, reason: collision with root package name */
    boolean f21368c0;

    /* renamed from: o, reason: collision with root package name */
    private Paint f21369o;

    /* renamed from: p, reason: collision with root package name */
    private Path f21370p;

    /* renamed from: q, reason: collision with root package name */
    private b f21371q;

    /* renamed from: r, reason: collision with root package name */
    private int f21372r;

    /* renamed from: s, reason: collision with root package name */
    private int f21373s;

    /* renamed from: t, reason: collision with root package name */
    private int f21374t;

    /* renamed from: u, reason: collision with root package name */
    private int f21375u;

    /* renamed from: v, reason: collision with root package name */
    private int f21376v;

    /* renamed from: w, reason: collision with root package name */
    private int f21377w;

    /* renamed from: x, reason: collision with root package name */
    private int f21378x;

    /* renamed from: y, reason: collision with root package name */
    public int f21379y;

    /* renamed from: z, reason: collision with root package name */
    public int f21380z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21381a;

        static {
            int[] iArr = new int[b.values().length];
            f21381a = iArr;
            try {
                iArr[b.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21381a[b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21381a[b.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21381a[b.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        LEFT(1),
        TOP(2),
        RIGHT(3),
        BOTTOM(4);

        int value;

        b(int v5) {
            this.value = v5;
        }

        public static b getType(int value) {
            return value != 1 ? value != 2 ? value != 3 ? BOTTOM : RIGHT : TOP : LEFT;
        }
    }

    public BubbleLayout(Context context) {
        this(context, null);
    }

    private void u() {
        this.f21371q = b.BOTTOM;
        this.f21379y = 0;
        this.f21380z = h.p(getContext(), 10.0f);
        this.A = h.p(getContext(), 9.0f);
        this.D = 0;
        this.E = 0;
        this.F = h.p(getContext(), 8.0f);
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = h.p(getContext(), 1.0f);
        this.M = h.p(getContext(), 1.0f);
        this.N = h.p(getContext(), 1.0f);
        this.O = h.p(getContext(), 1.0f);
        this.f21372r = h.p(getContext(), 0.0f);
        this.B = -12303292;
        this.G = Color.parseColor(ProtectedSandApp.s("㖊"));
        this.V = 0;
        this.W = 0;
    }

    private void v() {
        int i5;
        int i6;
        w();
        if (this.f21368c0) {
            b bVar = this.f21371q;
            if (bVar == b.LEFT || bVar == b.RIGHT) {
                i5 = this.f21374t / 2;
                i6 = this.A;
            } else {
                i5 = this.f21373s / 2;
                i6 = this.f21380z;
            }
            this.f21379y = i5 - (i6 / 2);
        }
        this.f21379y += this.f21367b0;
        this.f21369o.setShadowLayer(this.C, this.D, this.E, this.B);
        this.f21366a0.setColor(this.V);
        this.f21366a0.setStrokeWidth(this.W);
        this.f21366a0.setStyle(Paint.Style.STROKE);
        int i7 = this.C;
        int i8 = this.D;
        int i9 = (i8 < 0 ? -i8 : 0) + i7;
        b bVar2 = this.f21371q;
        this.f21375u = i9 + (bVar2 == b.LEFT ? this.A : 0);
        int i10 = this.E;
        this.f21376v = (i10 < 0 ? -i10 : 0) + i7 + (bVar2 == b.TOP ? this.A : 0);
        this.f21377w = ((this.f21373s - i7) + (i8 > 0 ? -i8 : 0)) - (bVar2 == b.RIGHT ? this.A : 0);
        this.f21378x = ((this.f21374t - i7) + (i10 > 0 ? -i10 : 0)) - (bVar2 == b.BOTTOM ? this.A : 0);
        this.f21369o.setColor(this.G);
        this.f21370p.reset();
        int i11 = this.f21379y;
        int i12 = this.A + i11;
        int i13 = this.f21378x;
        if (i12 > i13) {
            i11 = i13 - this.f21380z;
        }
        int max = Math.max(i11, this.C);
        int i14 = this.f21379y;
        int i15 = this.A + i14;
        int i16 = this.f21377w;
        if (i15 > i16) {
            i14 = i16 - this.f21380z;
        }
        int max2 = Math.max(i14, this.C);
        int i17 = a.f21381a[this.f21371q.ordinal()];
        if (i17 == 1) {
            if (max2 >= g() + this.O) {
                this.f21370p.moveTo(max2 - r1, this.f21378x);
                Path path = this.f21370p;
                int i18 = this.O;
                int i19 = this.f21380z;
                int i20 = this.A;
                path.rCubicTo(i18, 0.0f, ((i19 / 2.0f) - this.M) + i18, i20, (i19 / 2.0f) + i18, i20);
            } else {
                this.f21370p.moveTo((this.f21380z / 2.0f) + max2, this.f21378x + this.A);
            }
            int i21 = this.f21380z + max2;
            int o5 = this.f21377w - o();
            int i22 = this.N;
            if (i21 < o5 - i22) {
                Path path2 = this.f21370p;
                float f6 = this.L;
                int i23 = this.f21380z;
                int i24 = this.A;
                path2.rCubicTo(f6, 0.0f, i23 / 2.0f, -i24, (i23 / 2.0f) + i22, -i24);
                this.f21370p.lineTo(this.f21377w - o(), this.f21378x);
            }
            Path path3 = this.f21370p;
            int i25 = this.f21377w;
            path3.quadTo(i25, this.f21378x, i25, r4 - o());
            this.f21370p.lineTo(this.f21377w, p() + this.f21376v);
            this.f21370p.quadTo(this.f21377w, this.f21376v, r1 - p(), this.f21376v);
            this.f21370p.lineTo(h() + this.f21375u, this.f21376v);
            Path path4 = this.f21370p;
            int i26 = this.f21375u;
            path4.quadTo(i26, this.f21376v, i26, h() + r4);
            this.f21370p.lineTo(this.f21375u, this.f21378x - g());
            if (max2 >= g() + this.O) {
                this.f21370p.quadTo(this.f21375u, this.f21378x, g() + r1, this.f21378x);
            } else {
                this.f21370p.quadTo(this.f21375u, this.f21378x, (this.f21380z / 2.0f) + max2, r3 + this.A);
            }
        } else if (i17 == 2) {
            if (max2 >= h() + this.N) {
                this.f21370p.moveTo(max2 - r1, this.f21376v);
                Path path5 = this.f21370p;
                int i27 = this.N;
                int i28 = this.f21380z;
                int i29 = this.A;
                path5.rCubicTo(i27, 0.0f, ((i28 / 2.0f) - this.L) + i27, -i29, (i28 / 2.0f) + i27, -i29);
            } else {
                this.f21370p.moveTo((this.f21380z / 2.0f) + max2, this.f21376v - this.A);
            }
            int i30 = this.f21380z + max2;
            int p5 = this.f21377w - p();
            int i31 = this.O;
            if (i30 < p5 - i31) {
                Path path6 = this.f21370p;
                float f7 = this.M;
                int i32 = this.f21380z;
                int i33 = this.A;
                path6.rCubicTo(f7, 0.0f, i32 / 2.0f, i33, (i32 / 2.0f) + i31, i33);
                this.f21370p.lineTo(this.f21377w - p(), this.f21376v);
            }
            Path path7 = this.f21370p;
            int i34 = this.f21377w;
            path7.quadTo(i34, this.f21376v, i34, p() + r4);
            this.f21370p.lineTo(this.f21377w, this.f21378x - o());
            this.f21370p.quadTo(this.f21377w, this.f21378x, r1 - o(), this.f21378x);
            this.f21370p.lineTo(g() + this.f21375u, this.f21378x);
            Path path8 = this.f21370p;
            int i35 = this.f21375u;
            path8.quadTo(i35, this.f21378x, i35, r4 - g());
            this.f21370p.lineTo(this.f21375u, h() + this.f21376v);
            if (max2 >= h() + this.N) {
                this.f21370p.quadTo(this.f21375u, this.f21376v, h() + r1, this.f21376v);
            } else {
                this.f21370p.quadTo(this.f21375u, this.f21376v, (this.f21380z / 2.0f) + max2, r3 - this.A);
            }
        } else if (i17 == 3) {
            if (max >= h() + this.O) {
                this.f21370p.moveTo(this.f21375u, max - r2);
                Path path9 = this.f21370p;
                int i36 = this.O;
                int i37 = this.A;
                int i38 = this.f21380z;
                path9.rCubicTo(0.0f, i36, -i37, i36 + ((i38 / 2.0f) - this.M), -i37, (i38 / 2.0f) + i36);
            } else {
                this.f21370p.moveTo(this.f21375u - this.A, (this.f21380z / 2.0f) + max);
            }
            int i39 = this.f21380z + max;
            int g5 = this.f21378x - g();
            int i40 = this.N;
            if (i39 < g5 - i40) {
                Path path10 = this.f21370p;
                float f8 = this.L;
                int i41 = this.A;
                int i42 = this.f21380z;
                path10.rCubicTo(0.0f, f8, i41, i42 / 2.0f, i41, (i42 / 2.0f) + i40);
                this.f21370p.lineTo(this.f21375u, this.f21378x - g());
            }
            this.f21370p.quadTo(this.f21375u, this.f21378x, g() + r2, this.f21378x);
            this.f21370p.lineTo(this.f21377w - o(), this.f21378x);
            Path path11 = this.f21370p;
            int i43 = this.f21377w;
            path11.quadTo(i43, this.f21378x, i43, r4 - o());
            this.f21370p.lineTo(this.f21377w, p() + this.f21376v);
            this.f21370p.quadTo(this.f21377w, this.f21376v, r2 - p(), this.f21376v);
            this.f21370p.lineTo(h() + this.f21375u, this.f21376v);
            if (max >= h() + this.O) {
                Path path12 = this.f21370p;
                int i44 = this.f21375u;
                path12.quadTo(i44, this.f21376v, i44, h() + r3);
            } else {
                this.f21370p.quadTo(this.f21375u, this.f21376v, r2 - this.A, (this.f21380z / 2.0f) + max);
            }
        } else if (i17 == 4) {
            if (max >= p() + this.N) {
                this.f21370p.moveTo(this.f21377w, max - r2);
                Path path13 = this.f21370p;
                int i45 = this.N;
                int i46 = this.A;
                int i47 = this.f21380z;
                path13.rCubicTo(0.0f, i45, i46, i45 + ((i47 / 2.0f) - this.L), i46, (i47 / 2.0f) + i45);
            } else {
                this.f21370p.moveTo(this.f21377w + this.A, (this.f21380z / 2.0f) + max);
            }
            int i48 = this.f21380z + max;
            int o6 = this.f21378x - o();
            int i49 = this.O;
            if (i48 < o6 - i49) {
                Path path14 = this.f21370p;
                float f9 = this.M;
                int i50 = this.A;
                int i51 = this.f21380z;
                path14.rCubicTo(0.0f, f9, -i50, i51 / 2.0f, -i50, (i51 / 2.0f) + i49);
                this.f21370p.lineTo(this.f21377w, this.f21378x - o());
            }
            this.f21370p.quadTo(this.f21377w, this.f21378x, r2 - o(), this.f21378x);
            this.f21370p.lineTo(g() + this.f21375u, this.f21378x);
            Path path15 = this.f21370p;
            int i52 = this.f21375u;
            path15.quadTo(i52, this.f21378x, i52, r4 - g());
            this.f21370p.lineTo(this.f21375u, h() + this.f21376v);
            this.f21370p.quadTo(this.f21375u, this.f21376v, h() + r2, this.f21376v);
            this.f21370p.lineTo(this.f21377w - p(), this.f21376v);
            if (max >= p() + this.N) {
                Path path16 = this.f21370p;
                int i53 = this.f21377w;
                path16.quadTo(i53, this.f21376v, i53, p() + r3);
            } else {
                this.f21370p.quadTo(this.f21377w, this.f21376v, r2 + this.A, (this.f21380z / 2.0f) + max);
            }
        }
        this.f21370p.close();
    }

    public void A(int mArrowTopLeftRadius) {
        this.L = mArrowTopLeftRadius;
    }

    public void B(int mArrowTopRightRadius) {
        this.M = mArrowTopRightRadius;
    }

    public void C(int bubbleBorderColor) {
        this.V = bubbleBorderColor;
    }

    public void D(int bubbleBorderSize) {
        this.W = bubbleBorderSize;
    }

    public void E(int mBubbleColor) {
        this.G = mBubbleColor;
    }

    public void F(Bitmap bitmap) {
        this.Q = bitmap;
    }

    public void G(int res) {
        this.Q = BitmapFactory.decodeResource(getResources(), res);
    }

    public void H(int bubblePadding) {
        this.f21372r = bubblePadding;
    }

    public void I(int mBubbleRadius) {
        this.F = mBubbleRadius;
    }

    public void J(int mLDR) {
        this.K = mLDR;
    }

    public void K(int mLTR) {
        this.H = mLTR;
    }

    public void L(b mLook) {
        this.f21371q = mLook;
        w();
    }

    public void M(int mLookLength) {
        this.A = mLookLength;
        w();
    }

    public void N(int mLookPosition) {
        this.f21379y = mLookPosition;
    }

    public void O(boolean isCenter) {
        this.f21368c0 = isCenter;
    }

    public void P(int mLookWidth) {
        this.f21380z = mLookWidth;
    }

    public void Q(int mRDR) {
        this.J = mRDR;
    }

    public void R(int mRTR) {
        this.I = mRTR;
    }

    public void S(int mShadowColor) {
        this.B = mShadowColor;
    }

    public void T(int mShadowRadius) {
        this.C = mShadowRadius;
    }

    public void U(int mShadowX) {
        this.D = mShadowX;
    }

    public void V(int mShadowY) {
        this.E = mShadowY;
    }

    public int a() {
        return this.N;
    }

    public int b() {
        return this.O;
    }

    public int c() {
        return this.L;
    }

    public int d() {
        return this.M;
    }

    public int e() {
        return this.G;
    }

    public int f() {
        return this.F;
    }

    public int g() {
        int i5 = this.K;
        return i5 == -1 ? this.F : i5;
    }

    public int h() {
        int i5 = this.H;
        return i5 == -1 ? this.F : i5;
    }

    public b i() {
        return this.f21371q;
    }

    @Override // android.view.View
    public void invalidate() {
        v();
        super.invalidate();
    }

    public int j() {
        return this.A;
    }

    public int k() {
        return this.f21379y;
    }

    public int l() {
        return this.f21380z;
    }

    public Paint m() {
        return this.f21369o;
    }

    public Path n() {
        return this.f21370p;
    }

    public int o() {
        int i5 = this.J;
        return i5 == -1 ? this.F : i5;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f21370p, this.f21369o);
        if (this.Q != null) {
            this.f21370p.computeBounds(this.R, true);
            int saveLayer = canvas.saveLayer(this.R, null, 31);
            canvas.drawPath(this.f21370p, this.U);
            float width = this.R.width() / this.R.height();
            if (width > (this.Q.getWidth() * 1.0f) / this.Q.getHeight()) {
                int height = (int) ((this.Q.getHeight() - (this.Q.getWidth() / width)) / 2.0f);
                this.S.set(0, height, this.Q.getWidth(), ((int) (this.Q.getWidth() / width)) + height);
            } else {
                int width2 = (int) ((this.Q.getWidth() - (this.Q.getHeight() * width)) / 2.0f);
                this.S.set(width2, 0, ((int) (this.Q.getHeight() * width)) + width2, this.Q.getHeight());
            }
            canvas.drawBitmap(this.Q, this.S, this.R, this.T);
            canvas.restoreToCount(saveLayer);
        }
        if (this.W != 0) {
            canvas.drawPath(this.f21370p, this.f21366a0);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        this.f21379y = bundle.getInt(ProtectedSandApp.s("㖋"));
        this.f21380z = bundle.getInt(ProtectedSandApp.s("㖌"));
        this.A = bundle.getInt(ProtectedSandApp.s("㖍"));
        this.B = bundle.getInt(ProtectedSandApp.s("㖎"));
        this.C = bundle.getInt(ProtectedSandApp.s("㖏"));
        this.D = bundle.getInt(ProtectedSandApp.s("㖐"));
        this.E = bundle.getInt(ProtectedSandApp.s("㖑"));
        this.F = bundle.getInt(ProtectedSandApp.s("㖒"));
        this.H = bundle.getInt(ProtectedSandApp.s("㖓"));
        this.I = bundle.getInt(ProtectedSandApp.s("㖔"));
        this.J = bundle.getInt(ProtectedSandApp.s("㖕"));
        this.K = bundle.getInt(ProtectedSandApp.s("㖖"));
        this.f21372r = bundle.getInt(ProtectedSandApp.s("㖗"));
        this.L = bundle.getInt(ProtectedSandApp.s("㖘"));
        this.M = bundle.getInt(ProtectedSandApp.s("㖙"));
        this.N = bundle.getInt(ProtectedSandApp.s("㖚"));
        this.O = bundle.getInt(ProtectedSandApp.s("㖛"));
        this.f21373s = bundle.getInt(ProtectedSandApp.s("㖜"));
        this.f21374t = bundle.getInt(ProtectedSandApp.s("㖝"));
        this.f21375u = bundle.getInt(ProtectedSandApp.s("㖞"));
        this.f21376v = bundle.getInt(ProtectedSandApp.s("㖟"));
        this.f21377w = bundle.getInt(ProtectedSandApp.s("㖠"));
        this.f21378x = bundle.getInt(ProtectedSandApp.s("㖡"));
        int i5 = bundle.getInt(ProtectedSandApp.s("㖢"));
        this.P = i5;
        if (i5 != -1) {
            this.Q = BitmapFactory.decodeResource(getResources(), this.P);
        }
        this.W = bundle.getInt(ProtectedSandApp.s("㖣"));
        this.V = bundle.getInt(ProtectedSandApp.s("㖤"));
        super.onRestoreInstanceState(bundle.getParcelable(ProtectedSandApp.s("㖥")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("㖦"), super.onSaveInstanceState());
        bundle.putInt(ProtectedSandApp.s("㖧"), this.f21379y);
        bundle.putInt(ProtectedSandApp.s("㖨"), this.f21380z);
        bundle.putInt(ProtectedSandApp.s("㖩"), this.A);
        bundle.putInt(ProtectedSandApp.s("㖪"), this.B);
        bundle.putInt(ProtectedSandApp.s("㖫"), this.C);
        bundle.putInt(ProtectedSandApp.s("㖬"), this.D);
        bundle.putInt(ProtectedSandApp.s("㖭"), this.E);
        bundle.putInt(ProtectedSandApp.s("㖮"), this.F);
        bundle.putInt(ProtectedSandApp.s("㖯"), this.H);
        bundle.putInt(ProtectedSandApp.s("㖰"), this.I);
        bundle.putInt(ProtectedSandApp.s("㖱"), this.J);
        bundle.putInt(ProtectedSandApp.s("㖲"), this.K);
        bundle.putInt(ProtectedSandApp.s("㖳"), this.f21372r);
        bundle.putInt(ProtectedSandApp.s("㖴"), this.L);
        bundle.putInt(ProtectedSandApp.s("㖵"), this.M);
        bundle.putInt(ProtectedSandApp.s("㖶"), this.N);
        bundle.putInt(ProtectedSandApp.s("㖷"), this.O);
        bundle.putInt(ProtectedSandApp.s("㖸"), this.f21373s);
        bundle.putInt(ProtectedSandApp.s("㖹"), this.f21374t);
        bundle.putInt(ProtectedSandApp.s("㖺"), this.f21375u);
        bundle.putInt(ProtectedSandApp.s("㖻"), this.f21376v);
        bundle.putInt(ProtectedSandApp.s("㖼"), this.f21377w);
        bundle.putInt(ProtectedSandApp.s("㖽"), this.f21378x);
        bundle.putInt(ProtectedSandApp.s("㖾"), this.P);
        bundle.putInt(ProtectedSandApp.s("㖿"), this.V);
        bundle.putInt(ProtectedSandApp.s("㗀"), this.W);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w5, int h5, int oldw, int oldh) {
        super.onSizeChanged(w5, h5, oldw, oldh);
        this.f21373s = w5;
        this.f21374t = h5;
        v();
    }

    public int p() {
        int i5 = this.I;
        return i5 == -1 ? this.F : i5;
    }

    @Override // android.view.View
    public void postInvalidate() {
        v();
        super.postInvalidate();
    }

    public int q() {
        return this.B;
    }

    public int r() {
        return this.C;
    }

    public int s() {
        return this.D;
    }

    public int t() {
        return this.E;
    }

    public void w() {
        int i5 = this.f21372r + this.C;
        int i6 = a.f21381a[this.f21371q.ordinal()];
        if (i6 == 1) {
            setPadding(i5, i5, this.D + i5, this.A + i5 + this.E);
            return;
        }
        if (i6 == 2) {
            setPadding(i5, this.A + i5, this.D + i5, this.E + i5);
        } else if (i6 == 3) {
            setPadding(this.A + i5, i5, this.D + i5, this.E + i5);
        } else {
            if (i6 != 4) {
                return;
            }
            setPadding(i5, i5, this.A + i5 + this.D, this.E + i5);
        }
    }

    public void x(int mArrowDownLeftRadius) {
        this.N = mArrowDownLeftRadius;
    }

    public void y(int mArrowDownRightRadius) {
        this.O = mArrowDownRightRadius;
    }

    public void z(int radius) {
        x(radius);
        y(radius);
        A(radius);
        B(radius);
    }

    public BubbleLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BubbleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.K = -1;
        this.P = -1;
        this.Q = null;
        this.R = new RectF();
        this.S = new Rect();
        this.T = new Paint(5);
        this.U = new Paint(5);
        this.V = y1.f5758t;
        this.W = 0;
        this.f21366a0 = new Paint(5);
        this.f21367b0 = 0;
        setLayerType(1, null);
        setWillNotDraw(false);
        u();
        Paint paint = new Paint(5);
        this.f21369o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f21370p = new Path();
        this.T.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }
}
