package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.content.d;
import androidx.core.view.x1;

/* compiled from: CircleImageView.java */
/* loaded from: classes3.dex */
class a extends ImageView {

    /* renamed from: d, reason: collision with root package name */
    private static final int f34155d = 503316480;

    /* renamed from: e, reason: collision with root package name */
    private static final int f34156e = 1023410176;

    /* renamed from: f, reason: collision with root package name */
    private static final float f34157f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f34158g = 1.75f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f34159h = 3.5f;

    /* renamed from: i, reason: collision with root package name */
    private static final int f34160i = 4;

    /* renamed from: b, reason: collision with root package name */
    private Animation.AnimationListener f34161b;

    /* renamed from: c, reason: collision with root package name */
    int f34162c;

    /* compiled from: CircleImageView.java */
    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private class C0627a extends OvalShape {

        /* renamed from: b, reason: collision with root package name */
        private RadialGradient f34163b;

        /* renamed from: c, reason: collision with root package name */
        private Paint f34164c = new Paint();

        C0627a(int i4) {
            a.this.f34162c = i4;
            b((int) rect().width());
        }

        private void b(int i4) {
            float f4 = i4 / 2;
            RadialGradient radialGradient = new RadialGradient(f4, f4, a.this.f34162c, new int[]{a.f34156e, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f34163b = radialGradient;
            this.f34164c.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = a.this.getWidth() / 2;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f34164c);
            canvas.drawCircle(width, height, r0 - a.this.f34162c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f4, float f5) {
            super.onResize(f4, f5);
            b((int) f4);
        }
    }

    a(Context context, int i4) {
        super(context);
        float f4 = getContext().getResources().getDisplayMetrics().density;
        this.f34162c = (int) (f34159h * f4);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        x1.V1(this, f4 * 4.0f);
        shapeDrawable.getPaint().setColor(i4);
        x1.P1(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f34161b = animationListener;
    }

    public void c(int i4) {
        setBackgroundColor(d.getColor(getContext(), i4));
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f34161b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f34161b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i4);
        }
    }
}
