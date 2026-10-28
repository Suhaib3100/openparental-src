package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: Matrix.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/y4;", "m1", "", "row", "m2", "column", "", "b", "([FI[FI)F", "", "c", "([F)Z", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#2:442\n39#2:443\n39#2:444\n39#2:445\n39#2:446\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n423#1:442\n424#1:443\n425#1:444\n426#1:445\n434#1:446\n*E\n"})
/* loaded from: classes.dex */
public final class z4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float[] fArr, int i4, float[] fArr2, int i5) {
        int i6 = i4 * 4;
        return (fArr[i6 + 3] * fArr2[12 + i5]) + (fArr[i6 + 2] * fArr2[8 + i5]) + (fArr[i6 + 1] * fArr2[4 + i5]) + (fArr[i6] * fArr2[i5]);
    }

    public static final boolean c(@fg.l float[] fArr) {
        int i4 = 0;
        while (i4 < 4) {
            int i5 = 0;
            while (i5 < 4) {
                if (fArr[(i4 * 4) + i5] != (i4 == i5 ? 1.0f : 0.0f)) {
                    return false;
                }
                i5++;
            }
            i4++;
        }
        return true;
    }
}
