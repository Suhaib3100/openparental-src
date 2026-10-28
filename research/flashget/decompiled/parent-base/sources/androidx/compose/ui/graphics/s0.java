package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import kotlin.Metadata;

/* compiled from: AndroidMatrixConversions.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/y4;", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/k2;", "b", "([FLandroid/graphics/Matrix;)V", "a", "(Landroid/graphics/Matrix;[F)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidMatrixConversions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,112:1\n39#2:113\n39#2:114\n39#2:115\n39#2:116\n39#2:117\n39#2:118\n39#2:119\n*S KotlinDebug\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n*L\n58#1:113\n59#1:114\n60#1:115\n61#1:116\n62#1:117\n63#1:118\n64#1:119\n*E\n"})
/* loaded from: classes.dex */
public final class s0 {
    public static final void a(@fg.l Matrix matrix, @fg.l float[] fArr) {
        float f4 = fArr[2];
        if (f4 == 0.0f) {
            float f5 = fArr[6];
            if (f5 == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f) {
                float f6 = fArr[8];
                if (f6 == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                    float f7 = fArr[0];
                    float f10 = fArr[1];
                    float f11 = fArr[3];
                    float f12 = fArr[4];
                    float f13 = fArr[5];
                    float f14 = fArr[7];
                    float f15 = fArr[12];
                    float f16 = fArr[13];
                    float f17 = fArr[15];
                    fArr[0] = f7;
                    fArr[1] = f12;
                    fArr[2] = f15;
                    fArr[3] = f10;
                    fArr[4] = f13;
                    fArr[5] = f16;
                    fArr[6] = f11;
                    fArr[7] = f14;
                    fArr[8] = f17;
                    matrix.setValues(fArr);
                    fArr[0] = f7;
                    fArr[1] = f10;
                    fArr[2] = f4;
                    fArr[3] = f11;
                    fArr[4] = f12;
                    fArr[5] = f13;
                    fArr[6] = f5;
                    fArr[7] = f14;
                    fArr[8] = f6;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms");
    }

    public static final void b(@fg.l float[] fArr, @fg.l Matrix matrix) {
        matrix.getValues(fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        fArr[0] = f4;
        fArr[1] = f7;
        fArr[2] = 0.0f;
        fArr[3] = f12;
        fArr[4] = f5;
        fArr[5] = f10;
        fArr[6] = 0.0f;
        fArr[7] = f13;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f6;
        fArr[13] = f11;
        fArr[14] = 0.0f;
        fArr[15] = f14;
    }
}
