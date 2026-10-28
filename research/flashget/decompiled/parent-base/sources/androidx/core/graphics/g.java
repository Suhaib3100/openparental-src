package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Canvas.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0013\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001c2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010$\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b$\u0010%\u001aM\u0010&\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b&\u0010\u0012\u001a5\u0010)\u001a\u00020\u0002*\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "block", "j", "(Landroid/graphics/Canvas;Lld/l;)V", "", "x", "y", "o", "(Landroid/graphics/Canvas;FFLld/l;)V", "degrees", "pivotX", "pivotY", "h", "(Landroid/graphics/Canvas;FFFLld/l;)V", "k", "(Landroid/graphics/Canvas;FFFFLld/l;)V", "m", "Landroid/graphics/Matrix;", "matrix", "f", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lld/l;)V", "Landroid/graphics/Rect;", "clipRect", "d", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;Lld/l;)V", "Landroid/graphics/RectF;", "e", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lld/l;)V", "", "left", "top", "right", "bottom", "b", "(Landroid/graphics/Canvas;IIIILld/l;)V", "a", "Landroid/graphics/Path;", "clipPath", "c", "(Landroid/graphics/Canvas;Landroid/graphics/Path;Lld/l;)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    public static final void a(@fg.l Canvas canvas, float f4, float f5, float f6, float f7, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.clipRect(f4, f5, f6, f7);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void b(@fg.l Canvas canvas, int i4, int i5, int i6, int i7, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.clipRect(i4, i5, i6, i7);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void c(@fg.l Canvas canvas, @fg.l Path path, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void d(@fg.l Canvas canvas, @fg.l Rect rect, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void e(@fg.l Canvas canvas, @fg.l RectF rectF, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void f(@fg.l Canvas canvas, @fg.l Matrix matrix, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void g(Canvas canvas, Matrix matrix, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void h(@fg.l Canvas canvas, float f4, float f5, float f6, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.rotate(f4, f5, f6);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void i(Canvas canvas, float f4, float f5, float f6, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f4, f5, f6);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void j(@fg.l Canvas canvas, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void k(@fg.l Canvas canvas, float f4, float f5, float f6, float f7, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.scale(f4, f5, f6, f7);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void l(Canvas canvas, float f4, float f5, float f6, float f7, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 1.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        if ((i4 & 8) != 0) {
            f7 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f4, f5, f6, f7);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void m(@fg.l Canvas canvas, float f4, float f5, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.skew(f4, f5);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void n(Canvas canvas, float f4, float f5, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f4, f5);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o(@fg.l Canvas canvas, float f4, float f5, @fg.l ld.l<? super Canvas, k2> lVar) {
        int save = canvas.save();
        canvas.translate(f4, f5);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void p(Canvas canvas, float f4, float f5, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f4, f5);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
