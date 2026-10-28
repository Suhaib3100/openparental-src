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
import androidx.core.graphics.r1;
import androidx.core.view.y1;

/* compiled from: ShadowRenderer.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    private static final int f13970i = 68;

    /* renamed from: j, reason: collision with root package name */
    private static final int f13971j = 20;

    /* renamed from: k, reason: collision with root package name */
    private static final int f13972k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f13973l = new int[3];

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f13974m = {0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f13975n = new int[4];

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f13976o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final Paint f13977a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Paint f13978b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Paint f13979c;

    /* renamed from: d, reason: collision with root package name */
    private int f13980d;

    /* renamed from: e, reason: collision with root package name */
    private int f13981e;

    /* renamed from: f, reason: collision with root package name */
    private int f13982f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f13983g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f13984h;

    public b() {
        this(y1.f5758t);
    }

    public void a(@o0 Canvas canvas, @q0 Matrix matrix, @o0 RectF rectF, int i5, float f6, float f7) {
        boolean z5 = f7 < 0.0f;
        Path path = this.f13983g;
        if (z5) {
            int[] iArr = f13975n;
            iArr[0] = 0;
            iArr[1] = this.f13982f;
            iArr[2] = this.f13981e;
            iArr[3] = this.f13980d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f7);
            path.close();
            float f8 = -i5;
            rectF.inset(f8, f8);
            int[] iArr2 = f13975n;
            iArr2[0] = 0;
            iArr2[1] = this.f13980d;
            iArr2[2] = this.f13981e;
            iArr2[3] = this.f13982f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f9 = 1.0f - (i5 / width);
        float[] fArr = f13976o;
        fArr[1] = f9;
        fArr[2] = ((1.0f - f9) / 2.0f) + f9;
        this.f13978b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f13975n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z5) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f13984h);
        }
        canvas.drawArc(rectF, f6, f7, true, this.f13978b);
        canvas.restore();
    }

    public void b(@o0 Canvas canvas, @q0 Matrix matrix, @o0 RectF rectF, int i5) {
        rectF.bottom += i5;
        rectF.offset(0.0f, -i5);
        int[] iArr = f13973l;
        iArr[0] = this.f13982f;
        iArr[1] = this.f13981e;
        iArr[2] = this.f13980d;
        Paint paint = this.f13979c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, f13974m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f13979c);
        canvas.restore();
    }

    @o0
    public Paint c() {
        return this.f13977a;
    }

    public void d(int i5) {
        this.f13980d = r1.B(i5, 68);
        this.f13981e = r1.B(i5, 20);
        this.f13982f = r1.B(i5, 0);
        this.f13977a.setColor(this.f13980d);
    }

    public b(int i5) {
        this.f13983g = new Path();
        this.f13984h = new Paint();
        this.f13977a = new Paint();
        d(i5);
        this.f13984h.setColor(0);
        Paint paint = new Paint(4);
        this.f13978b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f13979c = new Paint(paint);
    }
}
