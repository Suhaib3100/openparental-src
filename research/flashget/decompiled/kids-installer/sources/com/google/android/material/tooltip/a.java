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
import androidx.core.graphics.r1;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.shape.g;
import com.google.android.material.shape.i;
import com.google.android.material.shape.j;
import com.google.android.material.shape.l;
import n1.a;

/* compiled from: TooltipDrawable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class a extends j implements k.b {

    /* renamed from: i0, reason: collision with root package name */
    @h1
    private static final int f14656i0 = a.n.Rc;

    /* renamed from: j0, reason: collision with root package name */
    @f
    private static final int f14657j0 = a.c.wf;

    @q0
    private CharSequence R;

    @o0
    private final Context S;

    @q0
    private final Paint.FontMetrics T;

    @o0
    private final k U;

    @o0
    private final View.OnLayoutChangeListener V;

    @o0
    private final Rect W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f14658a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f14659b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f14660c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f14661d0;

    /* renamed from: e0, reason: collision with root package name */
    private float f14662e0;

    /* renamed from: f0, reason: collision with root package name */
    private final float f14663f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f14664g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f14665h0;

    /* compiled from: TooltipDrawable.java */
    /* renamed from: com.google.android.material.tooltip.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewOnLayoutChangeListenerC0188a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0188a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            a.this.s1(view);
        }
    }

    private a(@o0 Context context, AttributeSet attributeSet, @f int i5, @h1 int i6) {
        super(context, attributeSet, i5, i6);
        this.T = new Paint.FontMetrics();
        k kVar = new k(this);
        this.U = kVar;
        this.V = new ViewOnLayoutChangeListenerC0188a();
        this.W = new Rect();
        this.f14661d0 = 1.0f;
        this.f14662e0 = 1.0f;
        this.f14663f0 = 0.5f;
        this.f14664g0 = 0.5f;
        this.f14665h0 = 1.0f;
        this.S = context;
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        kVar.e().setTextAlign(Paint.Align.CENTER);
    }

    private float R0() {
        int i5;
        if (((this.W.right - getBounds().right) - this.f14660c0) - this.f14658a0 < 0) {
            i5 = ((this.W.right - getBounds().right) - this.f14660c0) - this.f14658a0;
        } else {
            if (((this.W.left - getBounds().left) - this.f14660c0) + this.f14658a0 <= 0) {
                return 0.0f;
            }
            i5 = ((this.W.left - getBounds().left) - this.f14660c0) + this.f14658a0;
        }
        return i5;
    }

    private float S0() {
        this.U.e().getFontMetrics(this.T);
        Paint.FontMetrics fontMetrics = this.T;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float T0(@o0 Rect rect) {
        return rect.centerY() - S0();
    }

    @o0
    public static a U0(@o0 Context context) {
        return W0(context, null, f14657j0, f14656i0);
    }

    @o0
    public static a V0(@o0 Context context, @q0 AttributeSet attributeSet) {
        return W0(context, attributeSet, f14657j0, f14656i0);
    }

    @o0
    public static a W0(@o0 Context context, @q0 AttributeSet attributeSet, @f int i5, @h1 int i6) {
        a aVar = new a(context, attributeSet, i5, i6);
        aVar.h1(attributeSet, i5, i6);
        return aVar;
    }

    private g X0() {
        float f6 = -R0();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f14659b0))) / 2.0f;
        return new l(new i(this.f14659b0), Math.min(Math.max(f6, -width), width));
    }

    private void Z0(@o0 Canvas canvas) {
        if (this.R == null) {
            return;
        }
        int T0 = (int) T0(getBounds());
        if (this.U.d() != null) {
            this.U.e().drawableState = getState();
            this.U.k(this.S);
            this.U.e().setAlpha((int) (this.f14665h0 * 255.0f));
        }
        CharSequence charSequence = this.R;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), T0, this.U.e());
    }

    private float g1() {
        CharSequence charSequence = this.R;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.U.f(charSequence.toString());
    }

    private void h1(@q0 AttributeSet attributeSet, @f int i5, @h1 int i6) {
        TypedArray j5 = n.j(this.S, attributeSet, a.o.Ws, i5, i6, new int[0]);
        this.f14659b0 = this.S.getResources().getDimensionPixelSize(a.f.o6);
        g(l().v().t(X0()).m());
        n1(j5.getText(a.o.ct));
        o1(c.f(this.S, j5, a.o.Xs));
        int g5 = b.g(this.S, a.c.E2, a.class.getCanonicalName());
        p0(ColorStateList.valueOf(j5.getColor(a.o.dt, r1.t(r1.B(g5, 153), r1.B(b.g(this.S, R.attr.colorBackground, a.class.getCanonicalName()), 229)))));
        G0(ColorStateList.valueOf(b.g(this.S, a.c.Q2, a.class.getCanonicalName())));
        this.X = j5.getDimensionPixelSize(a.o.Ys, 0);
        this.Y = j5.getDimensionPixelSize(a.o.at, 0);
        this.Z = j5.getDimensionPixelSize(a.o.bt, 0);
        this.f14658a0 = j5.getDimensionPixelSize(a.o.Zs, 0);
        j5.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1(@o0 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f14660c0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.W);
    }

    public void Y0(@q0 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.V);
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.f14658a0;
    }

    public int b1() {
        return this.Z;
    }

    public int c1() {
        return this.Y;
    }

    @q0
    public CharSequence d1() {
        return this.R;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        canvas.save();
        float R0 = R0();
        float f6 = (float) (-((Math.sqrt(2.0d) * this.f14659b0) - this.f14659b0));
        canvas.scale(this.f14661d0, this.f14662e0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f14664g0) + getBounds().top);
        canvas.translate(R0, f6);
        super.draw(canvas);
        Z0(canvas);
        canvas.restore();
    }

    @q0
    public d e1() {
        return this.U.d();
    }

    public int f1() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.U.e().getTextSize(), this.Z);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.X * 2) + g1(), this.Y);
    }

    public void i1(@u0 int i5) {
        this.f14658a0 = i5;
        invalidateSelf();
    }

    public void j1(@u0 int i5) {
        this.Z = i5;
        invalidateSelf();
    }

    public void k1(@u0 int i5) {
        this.Y = i5;
        invalidateSelf();
    }

    public void l1(@q0 View view) {
        if (view == null) {
            return;
        }
        s1(view);
        view.addOnLayoutChangeListener(this.V);
    }

    public void m1(@x(from = 0.0d, to = 1.0d) float f6) {
        this.f14664g0 = 1.2f;
        this.f14661d0 = f6;
        this.f14662e0 = f6;
        this.f14665h0 = com.google.android.material.animation.a.b(0.0f, 1.0f, 0.19f, 1.0f, f6);
        invalidateSelf();
    }

    public void n1(@q0 CharSequence charSequence) {
        if (TextUtils.equals(this.R, charSequence)) {
            return;
        }
        this.R = charSequence;
        this.U.j(true);
        invalidateSelf();
    }

    public void o1(@q0 d dVar) {
        this.U.i(dVar, this.S);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        g(l().v().t(X0()).m());
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@h1 int i5) {
        o1(new d(this.S, i5));
    }

    public void q1(@u0 int i5) {
        this.X = i5;
        invalidateSelf();
    }

    public void r1(@g1 int i5) {
        n1(this.S.getResources().getString(i5));
    }
}
