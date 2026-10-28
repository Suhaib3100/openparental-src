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
import androidx.compose.material3.f4;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class BubbleLayout extends FrameLayout {
    private int A;
    private int B;
    private int C;
    private Bitmap D;
    private RectF E;
    private Rect F;
    private Paint G;
    private Paint H;
    private int I;
    private int J;
    private Paint K;
    public int L;
    boolean M;

    /* renamed from: b, reason: collision with root package name */
    private Paint f69843b;

    /* renamed from: c, reason: collision with root package name */
    private Path f69844c;

    /* renamed from: d, reason: collision with root package name */
    private b f69845d;

    /* renamed from: e, reason: collision with root package name */
    private int f69846e;

    /* renamed from: f, reason: collision with root package name */
    private int f69847f;

    /* renamed from: g, reason: collision with root package name */
    private int f69848g;

    /* renamed from: h, reason: collision with root package name */
    private int f69849h;

    /* renamed from: i, reason: collision with root package name */
    private int f69850i;

    /* renamed from: j, reason: collision with root package name */
    private int f69851j;

    /* renamed from: k, reason: collision with root package name */
    private int f69852k;

    /* renamed from: l, reason: collision with root package name */
    public int f69853l;

    /* renamed from: m, reason: collision with root package name */
    public int f69854m;

    /* renamed from: n, reason: collision with root package name */
    public int f69855n;

    /* renamed from: o, reason: collision with root package name */
    private int f69856o;

    /* renamed from: p, reason: collision with root package name */
    private int f69857p;

    /* renamed from: q, reason: collision with root package name */
    private int f69858q;

    /* renamed from: r, reason: collision with root package name */
    private int f69859r;

    /* renamed from: s, reason: collision with root package name */
    private int f69860s;

    /* renamed from: t, reason: collision with root package name */
    private int f69861t;

    /* renamed from: u, reason: collision with root package name */
    private int f69862u;

    /* renamed from: v, reason: collision with root package name */
    private int f69863v;

    /* renamed from: w, reason: collision with root package name */
    private int f69864w;

    /* renamed from: x, reason: collision with root package name */
    private int f69865x;

    /* renamed from: y, reason: collision with root package name */
    private int f69866y;

    /* renamed from: z, reason: collision with root package name */
    private int f69867z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69868a;

        static {
            int[] iArr = new int[b.values().length];
            f69868a = iArr;
            try {
                iArr[b.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69868a[b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69868a[b.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69868a[b.RIGHT.ordinal()] = 4;
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

        b(int v4) {
            this.value = v4;
        }

        public static b getType(int value) {
            return value != 1 ? value != 2 ? value != 3 ? BOTTOM : RIGHT : TOP : LEFT;
        }
    }

    public BubbleLayout(Context context) {
        this(context, null);
    }

    private void u() {
        this.f69845d = b.BOTTOM;
        this.f69853l = 0;
        this.f69854m = h.p(getContext(), 10.0f);
        this.f69855n = h.p(getContext(), 9.0f);
        this.f69858q = 0;
        this.f69859r = 0;
        this.f69860s = h.p(getContext(), 8.0f);
        this.f69862u = -1;
        this.f69863v = -1;
        this.f69864w = -1;
        this.f69865x = -1;
        this.f69866y = h.p(getContext(), 1.0f);
        this.f69867z = h.p(getContext(), 1.0f);
        this.A = h.p(getContext(), 1.0f);
        this.B = h.p(getContext(), 1.0f);
        this.f69846e = h.p(getContext(), 0.0f);
        this.f69856o = -12303292;
        this.f69861t = Color.parseColor(ProtectedSandApp.s("᠊\u0001"));
        this.I = 0;
        this.J = 0;
    }

    private void v() {
        int i4;
        int i5;
        w();
        if (this.M) {
            b bVar = this.f69845d;
            if (bVar == b.LEFT || bVar == b.RIGHT) {
                i4 = this.f69848g / 2;
                i5 = this.f69855n;
            } else {
                i4 = this.f69847f / 2;
                i5 = this.f69854m;
            }
            this.f69853l = i4 - (i5 / 2);
        }
        this.f69853l += this.L;
        this.f69843b.setShadowLayer(this.f69857p, this.f69858q, this.f69859r, this.f69856o);
        this.K.setColor(this.I);
        this.K.setStrokeWidth(this.J);
        this.K.setStyle(Paint.Style.STROKE);
        int i6 = this.f69857p;
        int i7 = this.f69858q;
        int i10 = (i7 < 0 ? -i7 : 0) + i6;
        b bVar2 = this.f69845d;
        this.f69849h = i10 + (bVar2 == b.LEFT ? this.f69855n : 0);
        int i11 = this.f69859r;
        this.f69850i = (i11 < 0 ? -i11 : 0) + i6 + (bVar2 == b.TOP ? this.f69855n : 0);
        this.f69851j = ((this.f69847f - i6) + (i7 > 0 ? -i7 : 0)) - (bVar2 == b.RIGHT ? this.f69855n : 0);
        this.f69852k = ((this.f69848g - i6) + (i11 > 0 ? -i11 : 0)) - (bVar2 == b.BOTTOM ? this.f69855n : 0);
        this.f69843b.setColor(this.f69861t);
        this.f69844c.reset();
        int i12 = this.f69853l;
        int i13 = this.f69855n + i12;
        int i14 = this.f69852k;
        if (i13 > i14) {
            i12 = i14 - this.f69854m;
        }
        int max = Math.max(i12, this.f69857p);
        int i15 = this.f69853l;
        int i16 = this.f69855n + i15;
        int i17 = this.f69851j;
        if (i16 > i17) {
            i15 = i17 - this.f69854m;
        }
        int max2 = Math.max(i15, this.f69857p);
        int i18 = a.f69868a[this.f69845d.ordinal()];
        if (i18 == 1) {
            if (max2 >= g() + this.B) {
                this.f69844c.moveTo(max2 - r1, this.f69852k);
                Path path = this.f69844c;
                int i19 = this.B;
                int i20 = this.f69854m;
                int i21 = this.f69855n;
                path.rCubicTo(i19, 0.0f, ((i20 / 2.0f) - this.f69867z) + i19, i21, (i20 / 2.0f) + i19, i21);
            } else {
                this.f69844c.moveTo((this.f69854m / 2.0f) + max2, this.f69852k + this.f69855n);
            }
            int i22 = this.f69854m + max2;
            int o4 = this.f69851j - o();
            int i23 = this.A;
            if (i22 < o4 - i23) {
                Path path2 = this.f69844c;
                float f4 = this.f69866y;
                int i24 = this.f69854m;
                int i25 = this.f69855n;
                path2.rCubicTo(f4, 0.0f, i24 / 2.0f, -i25, (i24 / 2.0f) + i23, -i25);
                this.f69844c.lineTo(this.f69851j - o(), this.f69852k);
            }
            Path path3 = this.f69844c;
            int i26 = this.f69851j;
            path3.quadTo(i26, this.f69852k, i26, r4 - o());
            this.f69844c.lineTo(this.f69851j, p() + this.f69850i);
            this.f69844c.quadTo(this.f69851j, this.f69850i, r1 - p(), this.f69850i);
            this.f69844c.lineTo(h() + this.f69849h, this.f69850i);
            Path path4 = this.f69844c;
            int i27 = this.f69849h;
            path4.quadTo(i27, this.f69850i, i27, h() + r4);
            this.f69844c.lineTo(this.f69849h, this.f69852k - g());
            if (max2 >= g() + this.B) {
                this.f69844c.quadTo(this.f69849h, this.f69852k, g() + r1, this.f69852k);
            } else {
                this.f69844c.quadTo(this.f69849h, this.f69852k, (this.f69854m / 2.0f) + max2, r3 + this.f69855n);
            }
        } else if (i18 == 2) {
            if (max2 >= h() + this.A) {
                this.f69844c.moveTo(max2 - r1, this.f69850i);
                Path path5 = this.f69844c;
                int i28 = this.A;
                int i29 = this.f69854m;
                int i30 = this.f69855n;
                path5.rCubicTo(i28, 0.0f, ((i29 / 2.0f) - this.f69866y) + i28, -i30, (i29 / 2.0f) + i28, -i30);
            } else {
                this.f69844c.moveTo((this.f69854m / 2.0f) + max2, this.f69850i - this.f69855n);
            }
            int i31 = this.f69854m + max2;
            int p4 = this.f69851j - p();
            int i32 = this.B;
            if (i31 < p4 - i32) {
                Path path6 = this.f69844c;
                float f5 = this.f69867z;
                int i33 = this.f69854m;
                int i34 = this.f69855n;
                path6.rCubicTo(f5, 0.0f, i33 / 2.0f, i34, (i33 / 2.0f) + i32, i34);
                this.f69844c.lineTo(this.f69851j - p(), this.f69850i);
            }
            Path path7 = this.f69844c;
            int i35 = this.f69851j;
            path7.quadTo(i35, this.f69850i, i35, p() + r4);
            this.f69844c.lineTo(this.f69851j, this.f69852k - o());
            this.f69844c.quadTo(this.f69851j, this.f69852k, r1 - o(), this.f69852k);
            this.f69844c.lineTo(g() + this.f69849h, this.f69852k);
            Path path8 = this.f69844c;
            int i36 = this.f69849h;
            path8.quadTo(i36, this.f69852k, i36, r4 - g());
            this.f69844c.lineTo(this.f69849h, h() + this.f69850i);
            if (max2 >= h() + this.A) {
                this.f69844c.quadTo(this.f69849h, this.f69850i, h() + r1, this.f69850i);
            } else {
                this.f69844c.quadTo(this.f69849h, this.f69850i, (this.f69854m / 2.0f) + max2, r3 - this.f69855n);
            }
        } else if (i18 == 3) {
            if (max >= h() + this.B) {
                this.f69844c.moveTo(this.f69849h, max - r2);
                Path path9 = this.f69844c;
                int i37 = this.B;
                int i38 = this.f69855n;
                int i39 = this.f69854m;
                path9.rCubicTo(0.0f, i37, -i38, ((i39 / 2.0f) - this.f69867z) + i37, -i38, (i39 / 2.0f) + i37);
            } else {
                this.f69844c.moveTo(this.f69849h - this.f69855n, (this.f69854m / 2.0f) + max);
            }
            int i40 = this.f69854m + max;
            int g4 = this.f69852k - g();
            int i41 = this.A;
            if (i40 < g4 - i41) {
                Path path10 = this.f69844c;
                float f6 = this.f69866y;
                int i42 = this.f69855n;
                int i43 = this.f69854m;
                path10.rCubicTo(0.0f, f6, i42, i43 / 2.0f, i42, (i43 / 2.0f) + i41);
                this.f69844c.lineTo(this.f69849h, this.f69852k - g());
            }
            this.f69844c.quadTo(this.f69849h, this.f69852k, g() + r2, this.f69852k);
            this.f69844c.lineTo(this.f69851j - o(), this.f69852k);
            Path path11 = this.f69844c;
            int i44 = this.f69851j;
            path11.quadTo(i44, this.f69852k, i44, r4 - o());
            this.f69844c.lineTo(this.f69851j, p() + this.f69850i);
            this.f69844c.quadTo(this.f69851j, this.f69850i, r2 - p(), this.f69850i);
            this.f69844c.lineTo(h() + this.f69849h, this.f69850i);
            if (max >= h() + this.B) {
                Path path12 = this.f69844c;
                int i45 = this.f69849h;
                path12.quadTo(i45, this.f69850i, i45, h() + r3);
            } else {
                this.f69844c.quadTo(this.f69849h, this.f69850i, r2 - this.f69855n, (this.f69854m / 2.0f) + max);
            }
        } else if (i18 == 4) {
            if (max >= p() + this.A) {
                this.f69844c.moveTo(this.f69851j, max - r2);
                Path path13 = this.f69844c;
                int i46 = this.A;
                int i47 = this.f69855n;
                int i48 = this.f69854m;
                path13.rCubicTo(0.0f, i46, i47, ((i48 / 2.0f) - this.f69866y) + i46, i47, (i48 / 2.0f) + i46);
            } else {
                this.f69844c.moveTo(this.f69851j + this.f69855n, (this.f69854m / 2.0f) + max);
            }
            int i49 = this.f69854m + max;
            int o5 = this.f69852k - o();
            int i50 = this.B;
            if (i49 < o5 - i50) {
                Path path14 = this.f69844c;
                float f7 = this.f69867z;
                int i51 = this.f69855n;
                int i52 = this.f69854m;
                path14.rCubicTo(0.0f, f7, -i51, i52 / 2.0f, -i51, (i52 / 2.0f) + i50);
                this.f69844c.lineTo(this.f69851j, this.f69852k - o());
            }
            this.f69844c.quadTo(this.f69851j, this.f69852k, r2 - o(), this.f69852k);
            this.f69844c.lineTo(g() + this.f69849h, this.f69852k);
            Path path15 = this.f69844c;
            int i53 = this.f69849h;
            path15.quadTo(i53, this.f69852k, i53, r4 - g());
            this.f69844c.lineTo(this.f69849h, h() + this.f69850i);
            this.f69844c.quadTo(this.f69849h, this.f69850i, h() + r2, this.f69850i);
            this.f69844c.lineTo(this.f69851j - p(), this.f69850i);
            if (max >= p() + this.A) {
                Path path16 = this.f69844c;
                int i54 = this.f69851j;
                path16.quadTo(i54, this.f69850i, i54, p() + r3);
            } else {
                this.f69844c.quadTo(this.f69851j, this.f69850i, r2 + this.f69855n, (this.f69854m / 2.0f) + max);
            }
        }
        this.f69844c.close();
    }

    public void A(int mArrowTopLeftRadius) {
        this.f69866y = mArrowTopLeftRadius;
    }

    public void B(int mArrowTopRightRadius) {
        this.f69867z = mArrowTopRightRadius;
    }

    public void C(int bubbleBorderColor) {
        this.I = bubbleBorderColor;
    }

    public void D(int bubbleBorderSize) {
        this.J = bubbleBorderSize;
    }

    public void E(int mBubbleColor) {
        this.f69861t = mBubbleColor;
    }

    public void F(Bitmap bitmap) {
        this.D = bitmap;
    }

    public void G(int res) {
        this.D = BitmapFactory.decodeResource(getResources(), res);
    }

    public void H(int bubblePadding) {
        this.f69846e = bubblePadding;
    }

    public void I(int mBubbleRadius) {
        this.f69860s = mBubbleRadius;
    }

    public void J(int mLDR) {
        this.f69865x = mLDR;
    }

    public void K(int mLTR) {
        this.f69862u = mLTR;
    }

    public void L(b mLook) {
        this.f69845d = mLook;
        w();
    }

    public void M(int mLookLength) {
        this.f69855n = mLookLength;
        w();
    }

    public void N(int mLookPosition) {
        this.f69853l = mLookPosition;
    }

    public void O(boolean isCenter) {
        this.M = isCenter;
    }

    public void P(int mLookWidth) {
        this.f69854m = mLookWidth;
    }

    public void Q(int mRDR) {
        this.f69864w = mRDR;
    }

    public void R(int mRTR) {
        this.f69863v = mRTR;
    }

    public void S(int mShadowColor) {
        this.f69856o = mShadowColor;
    }

    public void T(int mShadowRadius) {
        this.f69857p = mShadowRadius;
    }

    public void U(int mShadowX) {
        this.f69858q = mShadowX;
    }

    public void V(int mShadowY) {
        this.f69859r = mShadowY;
    }

    public int a() {
        return this.A;
    }

    public int b() {
        return this.B;
    }

    public int c() {
        return this.f69866y;
    }

    public int d() {
        return this.f69867z;
    }

    public int e() {
        return this.f69861t;
    }

    public int f() {
        return this.f69860s;
    }

    public int g() {
        int i4 = this.f69865x;
        return i4 == -1 ? this.f69860s : i4;
    }

    public int h() {
        int i4 = this.f69862u;
        return i4 == -1 ? this.f69860s : i4;
    }

    public b i() {
        return this.f69845d;
    }

    @Override // android.view.View
    public void invalidate() {
        v();
        super.invalidate();
    }

    public int j() {
        return this.f69855n;
    }

    public int k() {
        return this.f69853l;
    }

    public int l() {
        return this.f69854m;
    }

    public Paint m() {
        return this.f69843b;
    }

    public Path n() {
        return this.f69844c;
    }

    public int o() {
        int i4 = this.f69864w;
        return i4 == -1 ? this.f69860s : i4;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f69844c, this.f69843b);
        if (this.D != null) {
            this.f69844c.computeBounds(this.E, true);
            int saveLayer = canvas.saveLayer(this.E, null, 31);
            canvas.drawPath(this.f69844c, this.H);
            float width = this.E.width() / this.E.height();
            if (width > (this.D.getWidth() * 1.0f) / this.D.getHeight()) {
                int height = (int) ((this.D.getHeight() - (this.D.getWidth() / width)) / 2.0f);
                this.F.set(0, height, this.D.getWidth(), ((int) (this.D.getWidth() / width)) + height);
            } else {
                int a5 = (int) f4.a(this.D.getHeight(), width, this.D.getWidth(), 2.0f);
                this.F.set(a5, 0, ((int) (this.D.getHeight() * width)) + a5, this.D.getHeight());
            }
            canvas.drawBitmap(this.D, this.F, this.E, this.G);
            canvas.restoreToCount(saveLayer);
        }
        if (this.J != 0) {
            canvas.drawPath(this.f69844c, this.K);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        this.f69853l = bundle.getInt(ProtectedSandApp.s("᠋\u0001"));
        this.f69854m = bundle.getInt(ProtectedSandApp.s("᠌\u0001"));
        this.f69855n = bundle.getInt(ProtectedSandApp.s("᠍\u0001"));
        this.f69856o = bundle.getInt(ProtectedSandApp.s("\u180e\u0001"));
        this.f69857p = bundle.getInt(ProtectedSandApp.s("᠏\u0001"));
        this.f69858q = bundle.getInt(ProtectedSandApp.s("᠐\u0001"));
        this.f69859r = bundle.getInt(ProtectedSandApp.s("᠑\u0001"));
        this.f69860s = bundle.getInt(ProtectedSandApp.s("᠒\u0001"));
        this.f69862u = bundle.getInt(ProtectedSandApp.s("᠓\u0001"));
        this.f69863v = bundle.getInt(ProtectedSandApp.s("᠔\u0001"));
        this.f69864w = bundle.getInt(ProtectedSandApp.s("᠕\u0001"));
        this.f69865x = bundle.getInt(ProtectedSandApp.s("᠖\u0001"));
        this.f69846e = bundle.getInt(ProtectedSandApp.s("᠗\u0001"));
        this.f69866y = bundle.getInt(ProtectedSandApp.s("᠘\u0001"));
        this.f69867z = bundle.getInt(ProtectedSandApp.s("᠙\u0001"));
        this.A = bundle.getInt(ProtectedSandApp.s("\u181a\u0001"));
        this.B = bundle.getInt(ProtectedSandApp.s("\u181b\u0001"));
        this.f69847f = bundle.getInt(ProtectedSandApp.s("\u181c\u0001"));
        this.f69848g = bundle.getInt(ProtectedSandApp.s("\u181d\u0001"));
        this.f69849h = bundle.getInt(ProtectedSandApp.s("\u181e\u0001"));
        this.f69850i = bundle.getInt(ProtectedSandApp.s("\u181f\u0001"));
        this.f69851j = bundle.getInt(ProtectedSandApp.s("ᠠ\u0001"));
        this.f69852k = bundle.getInt(ProtectedSandApp.s("ᠡ\u0001"));
        int i4 = bundle.getInt(ProtectedSandApp.s("ᠢ\u0001"));
        this.C = i4;
        if (i4 != -1) {
            this.D = BitmapFactory.decodeResource(getResources(), this.C);
        }
        this.J = bundle.getInt(ProtectedSandApp.s("ᠣ\u0001"));
        this.I = bundle.getInt(ProtectedSandApp.s("ᠤ\u0001"));
        super.onRestoreInstanceState(bundle.getParcelable(ProtectedSandApp.s("ᠥ\u0001")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("ᠥ\u0001"), super.onSaveInstanceState());
        bundle.putInt(ProtectedSandApp.s("᠋\u0001"), this.f69853l);
        bundle.putInt(ProtectedSandApp.s("᠌\u0001"), this.f69854m);
        bundle.putInt(ProtectedSandApp.s("᠍\u0001"), this.f69855n);
        bundle.putInt(ProtectedSandApp.s("\u180e\u0001"), this.f69856o);
        bundle.putInt(ProtectedSandApp.s("᠏\u0001"), this.f69857p);
        bundle.putInt(ProtectedSandApp.s("᠐\u0001"), this.f69858q);
        bundle.putInt(ProtectedSandApp.s("᠑\u0001"), this.f69859r);
        bundle.putInt(ProtectedSandApp.s("᠒\u0001"), this.f69860s);
        bundle.putInt(ProtectedSandApp.s("᠓\u0001"), this.f69862u);
        bundle.putInt(ProtectedSandApp.s("᠔\u0001"), this.f69863v);
        bundle.putInt(ProtectedSandApp.s("᠕\u0001"), this.f69864w);
        bundle.putInt(ProtectedSandApp.s("᠖\u0001"), this.f69865x);
        bundle.putInt(ProtectedSandApp.s("᠗\u0001"), this.f69846e);
        bundle.putInt(ProtectedSandApp.s("᠘\u0001"), this.f69866y);
        bundle.putInt(ProtectedSandApp.s("᠙\u0001"), this.f69867z);
        bundle.putInt(ProtectedSandApp.s("\u181a\u0001"), this.A);
        bundle.putInt(ProtectedSandApp.s("\u181b\u0001"), this.B);
        bundle.putInt(ProtectedSandApp.s("\u181c\u0001"), this.f69847f);
        bundle.putInt(ProtectedSandApp.s("\u181d\u0001"), this.f69848g);
        bundle.putInt(ProtectedSandApp.s("\u181e\u0001"), this.f69849h);
        bundle.putInt(ProtectedSandApp.s("\u181f\u0001"), this.f69850i);
        bundle.putInt(ProtectedSandApp.s("ᠠ\u0001"), this.f69851j);
        bundle.putInt(ProtectedSandApp.s("ᠡ\u0001"), this.f69852k);
        bundle.putInt(ProtectedSandApp.s("ᠢ\u0001"), this.C);
        bundle.putInt(ProtectedSandApp.s("ᠤ\u0001"), this.I);
        bundle.putInt(ProtectedSandApp.s("ᠣ\u0001"), this.J);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w4, int h4, int oldw, int oldh) {
        super.onSizeChanged(w4, h4, oldw, oldh);
        this.f69847f = w4;
        this.f69848g = h4;
        v();
    }

    public int p() {
        int i4 = this.f69863v;
        return i4 == -1 ? this.f69860s : i4;
    }

    @Override // android.view.View
    public void postInvalidate() {
        v();
        super.postInvalidate();
    }

    public int q() {
        return this.f69856o;
    }

    public int r() {
        return this.f69857p;
    }

    public int s() {
        return this.f69858q;
    }

    public int t() {
        return this.f69859r;
    }

    public void w() {
        int i4 = this.f69846e + this.f69857p;
        int i5 = a.f69868a[this.f69845d.ordinal()];
        if (i5 == 1) {
            setPadding(i4, i4, this.f69858q + i4, this.f69855n + i4 + this.f69859r);
            return;
        }
        if (i5 == 2) {
            setPadding(i4, this.f69855n + i4, this.f69858q + i4, this.f69859r + i4);
        } else if (i5 == 3) {
            setPadding(this.f69855n + i4, i4, this.f69858q + i4, this.f69859r + i4);
        } else {
            if (i5 != 4) {
                return;
            }
            setPadding(i4, i4, this.f69855n + i4 + this.f69858q, this.f69859r + i4);
        }
    }

    public void x(int mArrowDownLeftRadius) {
        this.A = mArrowDownLeftRadius;
    }

    public void y(int mArrowDownRightRadius) {
        this.B = mArrowDownRightRadius;
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
        this.f69865x = -1;
        this.C = -1;
        this.D = null;
        this.E = new RectF();
        this.F = new Rect();
        this.G = new Paint(5);
        this.H = new Paint(5);
        this.I = x1.f27484y;
        this.J = 0;
        this.K = new Paint(5);
        this.L = 0;
        setLayerType(1, null);
        setWillNotDraw(false);
        u();
        Paint paint = new Paint(5);
        this.f69843b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f69844c = new Path();
        this.G.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }
}
