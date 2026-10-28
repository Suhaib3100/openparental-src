package o1;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: CanvasCompat.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static int a(@o0 Canvas canvas, float f6, float f7, float f8, float f9, int i5) {
        return canvas.saveLayerAlpha(f6, f7, f8, f9, i5);
    }

    public static int b(@o0 Canvas canvas, @q0 RectF rectF, int i5) {
        return canvas.saveLayerAlpha(rectF, i5);
    }
}
