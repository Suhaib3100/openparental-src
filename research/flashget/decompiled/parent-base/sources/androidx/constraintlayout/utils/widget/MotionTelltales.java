package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* renamed from: t, reason: collision with root package name */
    private static final String f23763t = "MotionTelltales";

    /* renamed from: m, reason: collision with root package name */
    private Paint f23764m;

    /* renamed from: n, reason: collision with root package name */
    MotionLayout f23765n;

    /* renamed from: o, reason: collision with root package name */
    float[] f23766o;

    /* renamed from: p, reason: collision with root package name */
    Matrix f23767p;

    /* renamed from: q, reason: collision with root package name */
    int f23768q;

    /* renamed from: r, reason: collision with root package name */
    int f23769r;

    /* renamed from: s, reason: collision with root package name */
    float f23770s;

    public MotionTelltales(Context context) {
        super(context);
        this.f23764m = new Paint();
        this.f23766o = new float[2];
        this.f23767p = new Matrix();
        this.f23768q = 0;
        this.f23769r = -65281;
        this.f23770s = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.tk);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.uk) {
                    this.f23769r = obtainStyledAttributes.getColor(index, this.f23769r);
                } else if (index == g.m.wk) {
                    this.f23768q = obtainStyledAttributes.getInt(index, this.f23768q);
                } else if (index == g.m.vk) {
                    this.f23770s = obtainStyledAttributes.getFloat(index, this.f23770s);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f23764m.setColor(this.f23769r);
        this.f23764m.setStrokeWidth(5.0f);
    }

    public void b(CharSequence text) {
        this.f23723g = text.toString();
        requestLayout();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f23767p);
        if (this.f23765n == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f23765n = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i4 = 0; i4 < 5; i4++) {
            float f4 = fArr[i4];
            for (int i5 = 0; i5 < 5; i5++) {
                float f5 = fArr[i5];
                this.f23765n.i1(this, f5, f4, this.f23766o, this.f23768q);
                this.f23767p.mapVectors(this.f23766o);
                float f6 = width * f5;
                float f7 = height * f4;
                float[] fArr2 = this.f23766o;
                float f10 = fArr2[0];
                float f11 = this.f23770s;
                float f12 = f7 - (fArr2[1] * f11);
                this.f23767p.mapVectors(fArr2);
                canvas.drawLine(f6, f7, f6 - (f10 * f11), f12, this.f23764m);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        super.onLayout(changed, left, top2, right, bottom);
        postInvalidate();
    }

    public MotionTelltales(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23764m = new Paint();
        this.f23766o = new float[2];
        this.f23767p = new Matrix();
        this.f23768q = 0;
        this.f23769r = -65281;
        this.f23770s = 0.25f;
        a(context, attrs);
    }

    public MotionTelltales(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23764m = new Paint();
        this.f23766o = new float[2];
        this.f23767p = new Matrix();
        this.f23768q = 0;
        this.f23769r = -65281;
        this.f23770s = 0.25f;
        a(context, attrs);
    }
}
