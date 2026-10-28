package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import eightbitlab.com.blurview.k;

/* compiled from: PreDrawBlurController.java */
/* loaded from: classes7.dex */
final class g implements b {

    /* renamed from: p, reason: collision with root package name */
    @l
    static final int f73786p = 0;

    /* renamed from: d, reason: collision with root package name */
    private final eightbitlab.com.blurview.a f73788d;

    /* renamed from: e, reason: collision with root package name */
    private c f73789e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f73790f;

    /* renamed from: g, reason: collision with root package name */
    final BlurView f73791g;

    /* renamed from: h, reason: collision with root package name */
    private int f73792h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f73793i;

    /* renamed from: n, reason: collision with root package name */
    private boolean f73798n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private Drawable f73799o;

    /* renamed from: c, reason: collision with root package name */
    private float f73787c = 16.0f;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f73794j = new int[2];

    /* renamed from: k, reason: collision with root package name */
    private final int[] f73795k = new int[2];

    /* renamed from: l, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f73796l = new a();

    /* renamed from: m, reason: collision with root package name */
    private boolean f73797m = true;

    /* compiled from: PreDrawBlurController.java */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            g.this.j();
            return true;
        }
    }

    g(@o0 BlurView blurView, @o0 ViewGroup viewGroup, @l int i4, eightbitlab.com.blurview.a aVar) {
        this.f73793i = viewGroup;
        this.f73791g = blurView;
        this.f73792h = i4;
        this.f73788d = aVar;
        if (aVar instanceof i) {
            ((i) aVar).f(blurView.getContext());
        }
        h(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    private void g() {
        this.f73790f = this.f73788d.e(this.f73790f, this.f73787c);
        if (this.f73788d.b()) {
            return;
        }
        this.f73789e.setBitmap(this.f73790f);
    }

    private void i() {
        this.f73793i.getLocationOnScreen(this.f73794j);
        this.f73791g.getLocationOnScreen(this.f73795k);
        int[] iArr = this.f73795k;
        int i4 = iArr[0];
        int[] iArr2 = this.f73794j;
        int i5 = i4 - iArr2[0];
        int i6 = iArr[1] - iArr2[1];
        float height = this.f73791g.getHeight() / this.f73790f.getHeight();
        float width = this.f73791g.getWidth() / this.f73790f.getWidth();
        this.f73789e.translate((-i5) / width, (-i6) / height);
        this.f73789e.scale(1.0f / width, 1.0f / height);
    }

    @Override // eightbitlab.com.blurview.d
    public d a(int i4) {
        if (this.f73792h != i4) {
            this.f73792h = i4;
            this.f73791g.invalidate();
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.d
    public d b(boolean z4) {
        this.f73797m = z4;
        c(z4);
        this.f73791g.invalidate();
        return this;
    }

    @Override // eightbitlab.com.blurview.d
    public d c(boolean z4) {
        this.f73793i.getViewTreeObserver().removeOnPreDrawListener(this.f73796l);
        if (z4) {
            this.f73793i.getViewTreeObserver().addOnPreDrawListener(this.f73796l);
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.d
    public d d(@q0 Drawable drawable) {
        this.f73799o = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.b
    public void destroy() {
        c(false);
        this.f73788d.destroy();
        this.f73798n = false;
    }

    @Override // eightbitlab.com.blurview.b
    public boolean draw(Canvas canvas) {
        if (this.f73797m && this.f73798n) {
            if (canvas instanceof c) {
                return false;
            }
            float width = this.f73791g.getWidth() / this.f73790f.getWidth();
            canvas.save();
            canvas.scale(width, this.f73791g.getHeight() / this.f73790f.getHeight());
            this.f73788d.c(canvas, this.f73790f);
            canvas.restore();
            int i4 = this.f73792h;
            if (i4 != 0) {
                canvas.drawColor(i4);
            }
        }
        return true;
    }

    @Override // eightbitlab.com.blurview.b
    public void e() {
        h(this.f73791g.getMeasuredWidth(), this.f73791g.getMeasuredHeight());
    }

    @Override // eightbitlab.com.blurview.d
    public d f(float f4) {
        this.f73787c = f4;
        return this;
    }

    void h(int i4, int i5) {
        c(true);
        k kVar = new k(this.f73788d.d());
        if (kVar.b(i4, i5)) {
            this.f73791g.setWillNotDraw(true);
            return;
        }
        this.f73791g.setWillNotDraw(false);
        k.a d5 = kVar.d(i4, i5);
        this.f73790f = Bitmap.createBitmap(d5.f73818a, d5.f73819b, this.f73788d.a());
        this.f73789e = new c(this.f73790f);
        this.f73798n = true;
        j();
    }

    void j() {
        if (this.f73797m && this.f73798n) {
            Drawable drawable = this.f73799o;
            if (drawable == null) {
                this.f73790f.eraseColor(0);
            } else {
                drawable.draw(this.f73789e);
            }
            this.f73789e.save();
            i();
            this.f73793i.draw(this.f73789e);
            this.f73789e.restore();
            g();
        }
    }
}
