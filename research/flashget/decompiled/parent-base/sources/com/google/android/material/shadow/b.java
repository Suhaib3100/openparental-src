package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.graphics.z;
import androidx.core.view.x1;

/* compiled from: ShadowRenderer.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    private static final int f53830i = 68;

    /* renamed from: j, reason: collision with root package name */
    private static final int f53831j = 20;

    /* renamed from: k, reason: collision with root package name */
    private static final int f53832k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f53833l = new int[3];

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f53834m = {0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f53835n = new int[4];

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f53836o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final Paint f53837a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Paint f53838b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Paint f53839c;

    /* renamed from: d, reason: collision with root package name */
    private int f53840d;

    /* renamed from: e, reason: collision with root package name */
    private int f53841e;

    /* renamed from: f, reason: collision with root package name */
    private int f53842f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f53843g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f53844h;

    public b() {
        this(x1.f27484y);
    }

    public void a(@o0 Canvas canvas, @q0 Matrix matrix, @o0 RectF rectF, int i4, float f4, float f5) {
        boolean z4 = f5 < 0.0f;
        Path path = this.f53843g;
        if (z4) {
            int[] iArr = f53835n;
            iArr[0] = 0;
            iArr[1] = this.f53842f;
            iArr[2] = this.f53841e;
            iArr[3] = this.f53840d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f4, f5);
            path.close();
            float f6 = -i4;
            rectF.inset(f6, f6);
            int[] iArr2 = f53835n;
            iArr2[0] = 0;
            iArr2[1] = this.f53840d;
            iArr2[2] = this.f53841e;
            iArr2[3] = this.f53842f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f7 = 1.0f - (i4 / width);
        float[] fArr = f53836o;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        this.f53838b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f53835n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f53844h);
        }
        canvas.drawArc(rectF, f4, f5, true, this.f53838b);
        canvas.restore();
    }

    public void b(@o0 Canvas canvas, @q0 Matrix matrix, @o0 RectF rectF, int i4) {
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int[] iArr = f53833l;
        iArr[0] = this.f53842f;
        iArr[1] = this.f53841e;
        iArr[2] = this.f53840d;
        Paint paint = this.f53839c;
        float f4 = rectF.left;
        paint.setShader(new LinearGradient(f4, rectF.top, f4, rectF.bottom, iArr, f53834m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f53839c);
        canvas.restore();
    }

    @o0
    public Paint c() {
        return this.f53837a;
    }

    public void d(int i4) {
        this.f53840d = z.D(i4, 68);
        this.f53841e = z.D(i4, 20);
        this.f53842f = z.D(i4, 0);
        this.f53837a.setColor(this.f53840d);
    }

    public b(int i4) {
        this.f53843g = new Path();
        this.f53844h = new Paint();
        this.f53837a = new Paint();
        d(i4);
        this.f53844h.setColor(0);
        Paint paint = new Paint(4);
        this.f53838b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f53839c = new Paint(paint);
    }
}
