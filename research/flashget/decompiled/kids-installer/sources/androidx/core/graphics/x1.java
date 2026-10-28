package androidx.core.graphics;

import android.graphics.Matrix;
import kotlin.Metadata;

/* compiled from: Matrix.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001a\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005\u001a\"\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Landroid/graphics/Matrix;", "m", "e", "", "h", "", "tx", "ty", "f", "sx", "sy", "c", "degrees", "px", "py", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class x1 {
    @d5.d
    public static final Matrix a(float f6, float f7, float f8) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f6, f7, f8);
        return matrix;
    }

    public static /* synthetic */ Matrix b(float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f8 = 0.0f;
        }
        return a(f6, f7, f8);
    }

    @d5.d
    public static final Matrix c(float f6, float f7) {
        Matrix matrix = new Matrix();
        matrix.setScale(f6, f7);
        return matrix;
    }

    public static /* synthetic */ Matrix d(float f6, float f7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f7 = 1.0f;
        }
        return c(f6, f7);
    }

    @d5.d
    public static final Matrix e(@d5.d Matrix matrix, @d5.d Matrix m5) {
        kotlin.jvm.internal.l0.p(matrix, "<this>");
        kotlin.jvm.internal.l0.p(m5, "m");
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preConcat(m5);
        return matrix2;
    }

    @d5.d
    public static final Matrix f(float f6, float f7) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f6, f7);
        return matrix;
    }

    public static /* synthetic */ Matrix g(float f6, float f7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f7 = 0.0f;
        }
        return f(f6, f7);
    }

    @d5.d
    public static final float[] h(@d5.d Matrix matrix) {
        kotlin.jvm.internal.l0.p(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
