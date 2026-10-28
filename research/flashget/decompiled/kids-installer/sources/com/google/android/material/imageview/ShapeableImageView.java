package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.x0;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import com.google.android.material.shape.s;
import n1.a;

/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements s {
    private static final int I = a.n.lc;
    private static final int J = Integer.MIN_VALUE;
    private Path A;

    @r
    private int B;

    @r
    private int C;

    @r
    private int D;

    @r
    private int E;

    @r
    private int F;

    @r
    private int G;
    private boolean H;

    /* renamed from: q, reason: collision with root package name */
    private final p f13568q;

    /* renamed from: r, reason: collision with root package name */
    private final RectF f13569r;

    /* renamed from: s, reason: collision with root package name */
    private final RectF f13570s;

    /* renamed from: t, reason: collision with root package name */
    private final Paint f13571t;

    /* renamed from: u, reason: collision with root package name */
    private final Paint f13572u;

    /* renamed from: v, reason: collision with root package name */
    private final Path f13573v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private ColorStateList f13574w;

    /* renamed from: x, reason: collision with root package name */
    @q0
    private j f13575x;

    /* renamed from: y, reason: collision with root package name */
    private o f13576y;

    /* renamed from: z, reason: collision with root package name */
    @r
    private float f13577z;

    @TargetApi(21)
    /* loaded from: classes2.dex */
    class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f13578a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f13576y == null) {
                return;
            }
            if (ShapeableImageView.this.f13575x == null) {
                ShapeableImageView.this.f13575x = new j(ShapeableImageView.this.f13576y);
            }
            ShapeableImageView.this.f13569r.round(this.f13578a);
            ShapeableImageView.this.f13575x.setBounds(this.f13578a);
            ShapeableImageView.this.f13575x.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private boolean A() {
        return getLayoutDirection() == 1;
    }

    private void H(int i5, int i6) {
        this.f13569r.set(getPaddingLeft(), getPaddingTop(), i5 - getPaddingRight(), i6 - getPaddingBottom());
        this.f13568q.d(this.f13576y, 1.0f, this.f13569r, this.f13573v);
        this.A.rewind();
        this.A.addPath(this.f13573v);
        this.f13570s.set(0.0f, 0.0f, i5, i6);
        this.A.addRect(this.f13570s, Path.Direction.CCW);
    }

    private void q(Canvas canvas) {
        if (this.f13574w == null) {
            return;
        }
        this.f13571t.setStrokeWidth(this.f13577z);
        int colorForState = this.f13574w.getColorForState(getDrawableState(), this.f13574w.getDefaultColor());
        if (this.f13577z <= 0.0f || colorForState == 0) {
            return;
        }
        this.f13571t.setColor(colorForState);
        canvas.drawPath(this.f13573v, this.f13571t);
    }

    private boolean z() {
        return (this.F == Integer.MIN_VALUE && this.G == Integer.MIN_VALUE) ? false : true;
    }

    public void B(@r int i5, @r int i6, @r int i7, @r int i8) {
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.B) + i5, (super.getPaddingTop() - this.C) + i6, (super.getPaddingRight() - this.D) + i7, (super.getPaddingBottom() - this.E) + i8);
        this.B = i5;
        this.C = i6;
        this.D = i7;
        this.E = i8;
    }

    @x0(17)
    public void C(@r int i5, @r int i6, @r int i7, @r int i8) {
        super.setPaddingRelative((super.getPaddingStart() - v()) + i5, (super.getPaddingTop() - this.C) + i6, (super.getPaddingEnd() - s()) + i7, (super.getPaddingBottom() - this.E) + i8);
        this.B = A() ? i7 : i5;
        this.C = i6;
        if (!A()) {
            i5 = i7;
        }
        this.D = i5;
        this.E = i8;
    }

    public void D(@q0 ColorStateList colorStateList) {
        this.f13574w = colorStateList;
        invalidate();
    }

    public void E(@n int i5) {
        D(androidx.appcompat.content.res.a.c(getContext(), i5));
    }

    public void F(@r float f6) {
        if (this.f13577z != f6) {
            this.f13577z = f6;
            invalidate();
        }
    }

    public void G(@q int i5) {
        F(getResources().getDimensionPixelSize(i5));
    }

    @Override // com.google.android.material.shape.s
    public void g(@o0 o oVar) {
        this.f13576y = oVar;
        j jVar = this.f13575x;
        if (jVar != null) {
            jVar.g(oVar);
        }
        H(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    @Override // android.view.View
    @r
    public int getPaddingBottom() {
        return super.getPaddingBottom() - r();
    }

    @Override // android.view.View
    @r
    public int getPaddingEnd() {
        return super.getPaddingEnd() - s();
    }

    @Override // android.view.View
    @r
    public int getPaddingLeft() {
        return super.getPaddingLeft() - t();
    }

    @Override // android.view.View
    @r
    public int getPaddingRight() {
        return super.getPaddingRight() - u();
    }

    @Override // android.view.View
    @r
    public int getPaddingStart() {
        return super.getPaddingStart() - v();
    }

    @Override // android.view.View
    @r
    public int getPaddingTop() {
        return super.getPaddingTop() - w();
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o l() {
        return this.f13576y;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.A, this.f13572u);
        q(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (!this.H && isLayoutDirectionResolved()) {
            this.H = true;
            if (isPaddingRelative() || z()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        H(i5, i6);
    }

    @r
    public int r() {
        return this.E;
    }

    @r
    public final int s() {
        int i5 = this.G;
        return i5 != Integer.MIN_VALUE ? i5 : A() ? this.B : this.D;
    }

    @Override // android.view.View
    public void setPadding(@r int i5, @r int i6, @r int i7, @r int i8) {
        super.setPadding(t() + i5, w() + i6, u() + i7, r() + i8);
    }

    @Override // android.view.View
    public void setPaddingRelative(@r int i5, @r int i6, @r int i7, @r int i8) {
        super.setPaddingRelative(v() + i5, w() + i6, s() + i7, r() + i8);
    }

    @r
    public int t() {
        int i5;
        int i6;
        if (z()) {
            if (A() && (i6 = this.G) != Integer.MIN_VALUE) {
                return i6;
            }
            if (!A() && (i5 = this.F) != Integer.MIN_VALUE) {
                return i5;
            }
        }
        return this.B;
    }

    @r
    public int u() {
        int i5;
        int i6;
        if (z()) {
            if (A() && (i6 = this.F) != Integer.MIN_VALUE) {
                return i6;
            }
            if (!A() && (i5 = this.G) != Integer.MIN_VALUE) {
                return i5;
            }
        }
        return this.D;
    }

    @r
    public final int v() {
        int i5 = this.F;
        return i5 != Integer.MIN_VALUE ? i5 : A() ? this.D : this.B;
    }

    @r
    public int w() {
        return this.C;
    }

    @q0
    public ColorStateList x() {
        return this.f13574w;
    }

    @r
    public float y() {
        return this.f13577z;
    }

    public ShapeableImageView(Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShapeableImageView(android.content.Context r7, @androidx.annotation.q0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.I
            android.content.Context r7 = v1.a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.p r7 = com.google.android.material.shape.p.k()
            r6.f13568q = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f13573v = r7
            r7 = 0
            r6.H = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f13572u = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f13569r = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f13570s = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.A = r2
            int[] r2 = n1.a.o.uo
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = n1.a.o.Eo
            android.content.res.ColorStateList r4 = com.google.android.material.resources.c.a(r1, r2, r4)
            r6.f13574w = r4
            int r4 = n1.a.o.Fo
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f13577z = r4
            int r4 = n1.a.o.vo
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.B = r7
            r6.C = r7
            r6.D = r7
            r6.E = r7
            int r4 = n1.a.o.yo
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.B = r4
            int r4 = n1.a.o.Bo
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.C = r4
            int r4 = n1.a.o.zo
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.D = r4
            int r4 = n1.a.o.wo
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.E = r7
            int r7 = n1.a.o.Ao
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.F = r7
            int r7 = n1.a.o.xo
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.G = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f13571t = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.o$b r7 = com.google.android.material.shape.o.e(r1, r8, r9, r0)
            com.google.android.material.shape.o r7 = r7.m()
            r6.f13576y = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
