package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.f;

/* loaded from: classes3.dex */
public class MotionTelltales extends MockView {
    private static final String G = "MotionTelltales";
    MotionLayout A;
    float[] B;
    Matrix C;
    int D;
    int E;
    float F;

    /* renamed from: z, reason: collision with root package name */
    private Paint f2694z;

    public MotionTelltales(Context context) {
        super(context);
        this.f2694z = new Paint();
        this.B = new float[2];
        this.C = new Matrix();
        this.D = 0;
        this.E = -65281;
        this.F = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.Of);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.Pf) {
                    this.E = obtainStyledAttributes.getColor(index, this.E);
                } else if (index == f.m.Rf) {
                    this.D = obtainStyledAttributes.getInt(index, this.D);
                } else if (index == f.m.Qf) {
                    this.F = obtainStyledAttributes.getFloat(index, this.F);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2694z.setColor(this.E);
        this.f2694z.setStrokeWidth(5.0f);
    }

    public void b(CharSequence charSequence) {
        this.f2688t = charSequence.toString();
        requestLayout();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.C);
        if (this.A == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.A = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i5 = 0; i5 < 5; i5++) {
            float f6 = fArr[i5];
            for (int i6 = 0; i6 < 5; i6++) {
                float f7 = fArr[i6];
                this.A.V0(this, f7, f6, this.B, this.D);
                this.C.mapVectors(this.B);
                float f8 = width * f7;
                float f9 = height * f6;
                float[] fArr2 = this.B;
                float f10 = fArr2[0];
                float f11 = this.F;
                float f12 = f9 - (fArr2[1] * f11);
                this.C.mapVectors(fArr2);
                canvas.drawLine(f8, f9, f8 - (f10 * f11), f12, this.f2694z);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        postInvalidate();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2694z = new Paint();
        this.B = new float[2];
        this.C = new Matrix();
        this.D = 0;
        this.E = -65281;
        this.F = 0.25f;
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f2694z = new Paint();
        this.B = new float[2];
        this.C = new Matrix();
        this.D = 0;
        this.E = -65281;
        this.F = 0.25f;
        a(context, attributeSet);
    }
}
