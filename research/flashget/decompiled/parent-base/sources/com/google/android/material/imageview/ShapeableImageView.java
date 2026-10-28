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
import androidx.core.content.d;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import com.google.android.material.shape.s;
import s8.a;

/* loaded from: classes6.dex */
public class ShapeableImageView extends AppCompatImageView implements s {

    /* renamed from: t, reason: collision with root package name */
    private static final int f53349t = a.n.lc;

    /* renamed from: u, reason: collision with root package name */
    private static final int f53350u = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private final p f53351b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f53352c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f53353d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f53354e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f53355f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f53356g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private ColorStateList f53357h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private j f53358i;

    /* renamed from: j, reason: collision with root package name */
    private o f53359j;

    /* renamed from: k, reason: collision with root package name */
    @r
    private float f53360k;

    /* renamed from: l, reason: collision with root package name */
    private Path f53361l;

    /* renamed from: m, reason: collision with root package name */
    @r
    private int f53362m;

    /* renamed from: n, reason: collision with root package name */
    @r
    private int f53363n;

    /* renamed from: o, reason: collision with root package name */
    @r
    private int f53364o;

    /* renamed from: p, reason: collision with root package name */
    @r
    private int f53365p;

    /* renamed from: q, reason: collision with root package name */
    @r
    private int f53366q;

    /* renamed from: r, reason: collision with root package name */
    @r
    private int f53367r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f53368s;

    @TargetApi(21)
    class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f53369a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f53359j == null) {
                return;
            }
            if (ShapeableImageView.this.f53358i == null) {
                ShapeableImageView.this.f53358i = new j(ShapeableImageView.this.f53359j);
            }
            ShapeableImageView.this.f53352c.round(this.f53369a);
            ShapeableImageView.this.f53358i.setBounds(this.f53369a);
            ShapeableImageView.this.f53358i.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void i(Canvas canvas) {
        if (this.f53357h == null) {
            return;
        }
        this.f53354e.setStrokeWidth(this.f53360k);
        int colorForState = this.f53357h.getColorForState(getDrawableState(), this.f53357h.getDefaultColor());
        if (this.f53360k <= 0.0f || colorForState == 0) {
            return;
        }
        this.f53354e.setColor(colorForState);
        canvas.drawPath(this.f53356g, this.f53354e);
    }

    private boolean r() {
        return (this.f53366q == Integer.MIN_VALUE && this.f53367r == Integer.MIN_VALUE) ? false : true;
    }

    private boolean s() {
        return getLayoutDirection() == 1;
    }

    private void z(int i4, int i5) {
        this.f53352c.set(getPaddingLeft(), getPaddingTop(), i4 - getPaddingRight(), i5 - getPaddingBottom());
        this.f53351b.d(this.f53359j, 1.0f, this.f53352c, this.f53356g);
        this.f53361l.rewind();
        this.f53361l.addPath(this.f53356g);
        this.f53353d.set(0.0f, 0.0f, i4, i5);
        this.f53361l.addRect(this.f53353d, Path.Direction.CCW);
    }

    @Override // com.google.android.material.shape.s
    public void d(@o0 o oVar) {
        this.f53359j = oVar;
        j jVar = this.f53358i;
        if (jVar != null) {
            jVar.d(oVar);
        }
        z(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o e() {
        return this.f53359j;
    }

    @Override // android.view.View
    @r
    public int getPaddingBottom() {
        return super.getPaddingBottom() - j();
    }

    @Override // android.view.View
    @r
    public int getPaddingEnd() {
        return super.getPaddingEnd() - k();
    }

    @Override // android.view.View
    @r
    public int getPaddingLeft() {
        return super.getPaddingLeft() - l();
    }

    @Override // android.view.View
    @r
    public int getPaddingRight() {
        return super.getPaddingRight() - m();
    }

    @Override // android.view.View
    @r
    public int getPaddingStart() {
        return super.getPaddingStart() - n();
    }

    @Override // android.view.View
    @r
    public int getPaddingTop() {
        return super.getPaddingTop() - o();
    }

    @r
    public int j() {
        return this.f53365p;
    }

    @r
    public final int k() {
        int i4 = this.f53367r;
        return i4 != Integer.MIN_VALUE ? i4 : s() ? this.f53362m : this.f53364o;
    }

    @r
    public int l() {
        int i4;
        int i5;
        if (r()) {
            if (s() && (i5 = this.f53367r) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!s() && (i4 = this.f53366q) != Integer.MIN_VALUE) {
                return i4;
            }
        }
        return this.f53362m;
    }

    @r
    public int m() {
        int i4;
        int i5;
        if (r()) {
            if (s() && (i5 = this.f53366q) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!s() && (i4 = this.f53367r) != Integer.MIN_VALUE) {
                return i4;
            }
        }
        return this.f53364o;
    }

    @r
    public final int n() {
        int i4 = this.f53366q;
        return i4 != Integer.MIN_VALUE ? i4 : s() ? this.f53364o : this.f53362m;
    }

    @r
    public int o() {
        return this.f53363n;
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
        canvas.drawPath(this.f53361l, this.f53355f);
        i(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (!this.f53368s && isLayoutDirectionResolved()) {
            this.f53368s = true;
            if (isPaddingRelative() || r()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        z(i4, i5);
    }

    @q0
    public ColorStateList p() {
        return this.f53357h;
    }

    @r
    public float q() {
        return this.f53360k;
    }

    @Override // android.view.View
    public void setPadding(@r int i4, @r int i5, @r int i6, @r int i7) {
        super.setPadding(l() + i4, o() + i5, m() + i6, j() + i7);
    }

    @Override // android.view.View
    public void setPaddingRelative(@r int i4, @r int i5, @r int i6, @r int i7) {
        super.setPaddingRelative(n() + i4, o() + i5, k() + i6, j() + i7);
    }

    public void t(@r int i4, @r int i5, @r int i6, @r int i7) {
        this.f53366q = Integer.MIN_VALUE;
        this.f53367r = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f53362m) + i4, (super.getPaddingTop() - this.f53363n) + i5, (super.getPaddingRight() - this.f53364o) + i6, (super.getPaddingBottom() - this.f53365p) + i7);
        this.f53362m = i4;
        this.f53363n = i5;
        this.f53364o = i6;
        this.f53365p = i7;
    }

    @x0(17)
    public void u(@r int i4, @r int i5, @r int i6, @r int i7) {
        super.setPaddingRelative((super.getPaddingStart() - n()) + i4, (super.getPaddingTop() - this.f53363n) + i5, (super.getPaddingEnd() - k()) + i6, (super.getPaddingBottom() - this.f53365p) + i7);
        this.f53362m = s() ? i6 : i4;
        this.f53363n = i5;
        if (!s()) {
            i4 = i6;
        }
        this.f53364o = i4;
        this.f53365p = i7;
    }

    public void v(@q0 ColorStateList colorStateList) {
        this.f53357h = colorStateList;
        invalidate();
    }

    public void w(@n int i4) {
        v(d.getColorStateList(getContext(), i4));
    }

    public void x(@r float f4) {
        if (this.f53360k != f4) {
            this.f53360k = f4;
            invalidate();
        }
    }

    public void y(@q int i4) {
        x(getResources().getDimensionPixelSize(i4));
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
            int r0 = com.google.android.material.imageview.ShapeableImageView.f53349t
            android.content.Context r7 = a9.a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.p r7 = com.google.android.material.shape.p.k()
            r6.f53351b = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f53356g = r7
            r7 = 0
            r6.f53368s = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f53355f = r2
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
            r6.f53352c = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f53353d = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f53361l = r2
            int[] r2 = s8.a.o.Zp
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = s8.a.o.jq
            android.content.res.ColorStateList r4 = com.google.android.material.resources.c.a(r1, r2, r4)
            r6.f53357h = r4
            int r4 = s8.a.o.kq
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f53360k = r4
            int r4 = s8.a.o.aq
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f53362m = r7
            r6.f53363n = r7
            r6.f53364o = r7
            r6.f53365p = r7
            int r4 = s8.a.o.dq
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f53362m = r4
            int r4 = s8.a.o.gq
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f53363n = r4
            int r4 = s8.a.o.eq
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f53364o = r4
            int r4 = s8.a.o.bq
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f53365p = r7
            int r7 = s8.a.o.fq
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f53366q = r7
            int r7 = s8.a.o.cq
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f53367r = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f53354e = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.o$b r7 = com.google.android.material.shape.o.e(r1, r8, r9, r0)
            com.google.android.material.shape.o r7 = r7.m()
            r6.f53359j = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
