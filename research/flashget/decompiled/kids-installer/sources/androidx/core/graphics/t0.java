package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: Canvas.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a=\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aG\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aQ\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a=\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a1\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a1\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aI\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aI\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a1\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lkotlin/m2;", "Lkotlin/u;", "block", "j", "", "x", "y", "o", "degrees", "pivotX", "pivotY", "h", "k", "m", "Landroid/graphics/Matrix;", "matrix", "f", "Landroid/graphics/Rect;", "clipRect", "d", "Landroid/graphics/RectF;", "e", "", "left", "top", "right", "bottom", "b", "a", "Landroid/graphics/Path;", "clipPath", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class t0 {
    public static final void a(@d5.d Canvas canvas, float f6, float f7, float f8, float f9, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(f6, f7, f8, f9);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void b(@d5.d Canvas canvas, int i5, int i6, int i7, int i8, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(i5, i6, i7, i8);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void c(@d5.d Canvas canvas, @d5.d Path clipPath, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(clipPath, "clipPath");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.clipPath(clipPath);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void d(@d5.d Canvas canvas, @d5.d Rect clipRect, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(clipRect, "clipRect");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void e(@d5.d Canvas canvas, @d5.d RectF clipRect, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(clipRect, "clipRect");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void f(@d5.d Canvas canvas, @d5.d Matrix matrix, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(matrix, "matrix");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void g(Canvas canvas, Matrix matrix, q3.l block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            matrix = new Matrix();
        }
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(matrix, "matrix");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void h(@d5.d Canvas canvas, float f6, float f7, float f8, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.rotate(f6, f7, f8);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void i(Canvas canvas, float f6, float f7, float f8, q3.l block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f8 = 0.0f;
        }
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.rotate(f6, f7, f8);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void j(@d5.d Canvas canvas, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void k(@d5.d Canvas canvas, float f6, float f7, float f8, float f9, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.scale(f6, f7, f8, f9);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void l(Canvas canvas, float f6, float f7, float f8, float f9, q3.l block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f7 = 1.0f;
        }
        if ((i5 & 4) != 0) {
            f8 = 0.0f;
        }
        if ((i5 & 8) != 0) {
            f9 = 0.0f;
        }
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.scale(f6, f7, f8, f9);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void m(@d5.d Canvas canvas, float f6, float f7, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.skew(f6, f7);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void n(Canvas canvas, float f6, float f7, q3.l block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f7 = 0.0f;
        }
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.skew(f6, f7);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o(@d5.d Canvas canvas, float f6, float f7, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.translate(f6, f7);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void p(Canvas canvas, float f6, float f7, q3.l block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f7 = 0.0f;
        }
        kotlin.jvm.internal.l0.p(canvas, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        int save = canvas.save();
        canvas.translate(f6, f7);
        try {
            block.N(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
