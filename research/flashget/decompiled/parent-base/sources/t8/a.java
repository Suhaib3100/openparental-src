package t8;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: CanvasCompat.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class a {
    private a() {
    }

    public static int a(@o0 Canvas canvas, float f4, float f5, float f6, float f7, int i4) {
        return canvas.saveLayerAlpha(f4, f5, f6, f7, i4);
    }

    public static int b(@o0 Canvas canvas, @q0 RectF rectF, int i4) {
        return canvas.saveLayerAlpha(rectF, i4);
    }
}
