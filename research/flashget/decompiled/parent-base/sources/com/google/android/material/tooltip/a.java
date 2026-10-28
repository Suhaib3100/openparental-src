package com.google.android.material.tooltip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.f;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.x;
import androidx.core.graphics.z;
import com.android.internal.telephony.SmsConstants;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.shape.g;
import com.google.android.material.shape.i;
import com.google.android.material.shape.j;
import com.google.android.material.shape.l;
import s8.a;

/* compiled from: TooltipDrawable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class a extends j implements k.b {

    @h1
    private static final int Q1 = a.n.Rc;

    @f
    private static final int V1 = a.c.f90610vf;

    @q0
    private CharSequence E;

    @o0
    private final Context F;

    @q0
    private final Paint.FontMetrics G;

    @o0
    private final k H;

    @o0
    private final View.OnLayoutChangeListener I;

    @o0
    private final Rect J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private float Q;
    private float R;
    private final float X;
    private float Y;
    private float Z;

    /* compiled from: TooltipDrawable.java */
    /* renamed from: com.google.android.material.tooltip.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0822a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0822a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
            a.this.s1(view);
        }
    }

    private a(@o0 Context context, AttributeSet attributeSet, @f int i4, @h1 int i5) {
        super(context, attributeSet, i4, i5);
        this.G = new Paint.FontMetrics();
        k kVar = new k(this);
        this.H = kVar;
        this.I = new ViewOnLayoutChangeListenerC0822a();
        this.J = new Rect();
        this.Q = 1.0f;
        this.R = 1.0f;
        this.X = 0.5f;
        this.Y = 0.5f;
        this.Z = 1.0f;
        this.F = context;
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        kVar.e().setTextAlign(Paint.Align.CENTER);
    }

    private float R0() {
        int i4;
        if (((this.J.right - getBounds().right) - this.P) - this.N < 0) {
            i4 = ((this.J.right - getBounds().right) - this.P) - this.N;
        } else {
            if (((this.J.left - getBounds().left) - this.P) + this.N <= 0) {
                return 0.0f;
            }
            i4 = ((this.J.left - getBounds().left) - this.P) + this.N;
        }
        return i4;
    }

    private float S0() {
        this.H.e().getFontMetrics(this.G);
        Paint.FontMetrics fontMetrics = this.G;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float T0(@o0 Rect rect) {
        return rect.centerY() - S0();
    }

    @o0
    public static a U0(@o0 Context context) {
        return W0(context, null, V1, Q1);
    }

    @o0
    public static a V0(@o0 Context context, @q0 AttributeSet attributeSet) {
        return W0(context, attributeSet, V1, Q1);
    }

    @o0
    public static a W0(@o0 Context context, @q0 AttributeSet attributeSet, @f int i4, @h1 int i5) {
        a aVar = new a(context, attributeSet, i4, i5);
        aVar.h1(attributeSet, i4, i5);
        return aVar;
    }

    private g X0() {
        float f4 = -R0();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.O))) / 2.0f;
        return new l(new i(this.O), Math.min(Math.max(f4, -width), width));
    }

    private void Z0(@o0 Canvas canvas) {
        if (this.E == null) {
            return;
        }
        int T0 = (int) T0(getBounds());
        if (this.H.d() != null) {
            this.H.e().drawableState = getState();
            this.H.k(this.F);
            this.H.e().setAlpha((int) (this.Z * 255.0f));
        }
        CharSequence charSequence = this.E;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), T0, this.H.e());
    }

    private float g1() {
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.H.f(charSequence.toString());
    }

    private void h1(@q0 AttributeSet attributeSet, @f int i4, @h1 int i5) {
        TypedArray j4 = n.j(this.F, attributeSet, a.o.Cu, i4, i5, new int[0]);
        this.O = this.F.getResources().getDimensionPixelSize(a.f.o6);
        d(e().v().t(X0()).m());
        n1(j4.getText(a.o.Iu));
        o1(c.f(this.F, j4, a.o.Du));
        int g4 = b.g(this.F, a.c.D2, a.class.getCanonicalName());
        p0(ColorStateList.valueOf(j4.getColor(a.o.Ju, z.v(z.D(g4, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER), z.D(b.g(this.F, R.attr.colorBackground, a.class.getCanonicalName()), 229)))));
        G0(ColorStateList.valueOf(b.g(this.F, a.c.P2, a.class.getCanonicalName())));
        this.K = j4.getDimensionPixelSize(a.o.Eu, 0);
        this.L = j4.getDimensionPixelSize(a.o.Gu, 0);
        this.M = j4.getDimensionPixelSize(a.o.Hu, 0);
        this.N = j4.getDimensionPixelSize(a.o.Fu, 0);
        j4.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1(@o0 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.P = iArr[0];
        view.getWindowVisibleDisplayFrame(this.J);
    }

    public void Y0(@q0 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.I);
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.N;
    }

    public int b1() {
        return this.M;
    }

    public int c1() {
        return this.L;
    }

    @q0
    public CharSequence d1() {
        return this.E;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        canvas.save();
        float R0 = R0();
        float f4 = (float) (-((Math.sqrt(2.0d) * this.O) - this.O));
        canvas.scale(this.Q, this.R, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.Y) + getBounds().top);
        canvas.translate(R0, f4);
        super.draw(canvas);
        Z0(canvas);
        canvas.restore();
    }

    @q0
    public d e1() {
        return this.H.d();
    }

    public int f1() {
        return this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.H.e().getTextSize(), this.M);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.K * 2) + g1(), this.L);
    }

    public void i1(@u0 int i4) {
        this.N = i4;
        invalidateSelf();
    }

    public void j1(@u0 int i4) {
        this.M = i4;
        invalidateSelf();
    }

    public void k1(@u0 int i4) {
        this.L = i4;
        invalidateSelf();
    }

    public void l1(@q0 View view) {
        if (view == null) {
            return;
        }
        s1(view);
        view.addOnLayoutChangeListener(this.I);
    }

    public void m1(@x(from = 0.0d, to = 1.0d) float f4) {
        this.Y = 1.2f;
        this.Q = f4;
        this.R = f4;
        this.Z = com.google.android.material.animation.a.b(0.0f, 1.0f, 0.19f, 1.0f, f4);
        invalidateSelf();
    }

    public void n1(@q0 CharSequence charSequence) {
        if (TextUtils.equals(this.E, charSequence)) {
            return;
        }
        this.E = charSequence;
        this.H.j(true);
        invalidateSelf();
    }

    public void o1(@q0 d dVar) {
        this.H.i(dVar, this.F);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d(e().v().t(X0()).m());
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@h1 int i4) {
        o1(new d(this.F, i4));
    }

    public void q1(@u0 int i4) {
        this.K = i4;
        invalidateSelf();
    }

    public void r1(@g1 int i4) {
        n1(this.F.getResources().getString(i4));
    }
}
