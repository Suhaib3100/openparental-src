package m0;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.input.pointer.b0;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.input.pointer.q;
import androidx.compose.ui.k;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a9\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0006*\u00020\u0012H\u0082\b¢\u0006\u0004\b%\u0010&\u001a*\u0010\"\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`)0\u00002\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b\"\u0010*\u001a.\u0010.\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u00120\u0000j\u0002`+2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0082\n¢\u0006\u0004\b.\u0010/\u001a6\u00101\u001a\u00020\b*\f\u0012\u0004\u0012\u00020\u00120\u0000j\u0002`+2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0006H\u0082\n¢\u0006\u0004\b1\u00102\"\u0014\u00104\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u00103\"\u0014\u00106\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00103\"\u0014\u00108\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00103\"\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u00109\"1\u0010C\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020\u001b8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0010\u0010<\u0012\u0004\bA\u0010B\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@*\u0018\b\u0002\u0010D\"\b\u0012\u0004\u0012\u00020\u00120\u00002\b\u0012\u0004\u0012\u00020\u00120\u0000*\f\b\u0002\u0010E\"\u00020\u00122\u00020\u0012¨\u0006F"}, d2 = {"", "Lm0/a;", "", "index", "", "time", "", "dataPoint", "Lkotlin/k2;", "p", "([Lm0/a;IJF)V", "Lm0/d;", "Landroidx/compose/ui/input/pointer/b0;", "event", "d", "(Lm0/d;Landroidx/compose/ui/input/pointer/b0;)V", "e", "f", "", "x", "y", "sampleCount", "degree", "coefficients", "n", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "g", "([F[FIZ)F", "kineticEnergy", "l", "(F)F", "a", "h", "([F[F)F", "m", "([F)F", "rows", "cols", "Landroidx/compose/ui/input/pointer/util/Vector;", "(II)[[F", "Landroidx/compose/ui/input/pointer/util/Matrix;", "row", "col", "i", "([[FII)F", "value", "q", "([[FIIF)V", "I", "AssumePointerMoveStoppedMilliseconds", "b", "HistorySize", "c", "HorizonMilliseconds", "F", "DefaultWeight", "<set-?>", "Landroidx/compose/runtime/k2;", "j", "()Z", "r", "(Z)V", "k", "()V", "VelocityTrackerAddPointsFix", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,728:1\n706#1:741\n713#1,2:742\n709#1,6:744\n706#1:750\n706#1:751\n701#1:752\n709#1:753\n709#1:754\n687#1:755\n687#1:756\n33#2,6:729\n33#2,6:735\n81#3:757\n107#3,2:758\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n487#1:741\n489#1:742,2\n491#1:744,6\n498#1:750\n500#1:751\n515#1:752\n557#1:753\n559#1:754\n667#1:755\n677#1:756\n385#1:729,6\n421#1:735,6\n727#1:757\n727#1:758,2\n*E\n"})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f81485a = 40;

    /* renamed from: b, reason: collision with root package name */
    private static final int f81486b = 20;

    /* renamed from: c, reason: collision with root package name */
    private static final int f81487c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static final float f81488d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final k2 f81489e;

    static {
        k2 g4;
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        f81489e = g4;
    }

    private static final float[][] a(int i4, int i5) {
        float[][] fArr = new float[i4][];
        for (int i6 = 0; i6 < i4; i6++) {
            fArr[i6] = new float[i5];
        }
        return fArr;
    }

    public static final void d(@l d dVar, @l b0 b0Var) {
        if (j()) {
            f(dVar, b0Var);
        } else {
            e(dVar, b0Var);
        }
    }

    private static final void e(d dVar, b0 b0Var) {
        if (q.c(b0Var)) {
            dVar.g(b0Var.getPosition());
            dVar.f();
        }
        long previousPosition = b0Var.getPreviousPosition();
        List<f> p4 = b0Var.p();
        int size = p4.size();
        int i4 = 0;
        while (i4 < size) {
            f fVar = p4.get(i4);
            long u4 = i0.f.u(fVar.getPosition(), previousPosition);
            long position = fVar.getPosition();
            dVar.g(i0.f.v(dVar.getCurrentPointerPositionAccumulator(), u4));
            dVar.a(fVar.getUptimeMillis(), dVar.getCurrentPointerPositionAccumulator());
            i4++;
            previousPosition = position;
        }
        dVar.g(i0.f.v(dVar.getCurrentPointerPositionAccumulator(), i0.f.u(b0Var.getPosition(), previousPosition)));
        dVar.a(b0Var.getUptimeMillis(), dVar.getCurrentPointerPositionAccumulator());
    }

    private static final void f(d dVar, b0 b0Var) {
        if (q.c(b0Var)) {
            dVar.f();
        }
        if (!q.e(b0Var)) {
            List<f> p4 = b0Var.p();
            int size = p4.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = p4.get(i4);
                dVar.a(fVar.getUptimeMillis(), fVar.getOriginalEventPosition());
            }
            dVar.a(b0Var.getUptimeMillis(), b0Var.getOriginalEventPosition());
        }
        if (q.e(b0Var) && b0Var.getUptimeMillis() - dVar.getLastMoveEventTimeStamp() > 40) {
            dVar.f();
        }
        dVar.h(b0Var.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(float[] fArr, float[] fArr2, int i4, boolean z4) {
        float f4 = 0.0f;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            if (f5 == f6) {
                return 0.0f;
            }
            return (z4 ? fArr[0] : fArr[0] - fArr[1]) / (f5 - f6);
        }
        int i5 = i4 - 1;
        for (int i6 = i5; i6 > 0; i6--) {
            int i7 = i6 - 1;
            if (fArr2[i6] != fArr2[i7]) {
                float signum = Math.signum(f4) * ((float) Math.sqrt(Math.abs(f4) * 2));
                float f7 = (z4 ? -fArr[i7] : fArr[i6] - fArr[i7]) / (fArr2[i6] - fArr2[i7]);
                float abs = (Math.abs(f7) * (f7 - signum)) + f4;
                if (i6 == i5) {
                    abs *= 0.5f;
                }
                f4 = abs;
            }
        }
        return Math.signum(f4) * ((float) Math.sqrt(Math.abs(f4) * 2));
    }

    private static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            f4 += fArr[i4] * fArr2[i4];
        }
        return f4;
    }

    private static final float i(float[][] fArr, int i4, int i5) {
        return fArr[i4][i5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final boolean j() {
        return ((Boolean) f81489e.getValue()).booleanValue();
    }

    @k
    public static /* synthetic */ void k() {
    }

    private static final float l(float f4) {
        return Math.signum(f4) * ((float) Math.sqrt(Math.abs(f4) * 2));
    }

    private static final float m(float[] fArr) {
        return (float) Math.sqrt(h(fArr, fArr));
    }

    @l
    public static final float[] n(@l float[] fArr, @l float[] fArr2, int i4, int i5, @l float[] fArr3) {
        int i6 = i5;
        if (i6 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        if (i6 >= i4) {
            i6 = i4 - 1;
        }
        int i7 = i6 + 1;
        float[][] fArr4 = new float[i7][];
        for (int i10 = 0; i10 < i7; i10++) {
            fArr4[i10] = new float[i4];
        }
        for (int i11 = 0; i11 < i4; i11++) {
            fArr4[0][i11] = 1.0f;
            for (int i12 = 1; i12 < i7; i12++) {
                fArr4[i12][i11] = fArr4[i12 - 1][i11] * fArr[i11];
            }
        }
        float[][] fArr5 = new float[i7][];
        for (int i13 = 0; i13 < i7; i13++) {
            fArr5[i13] = new float[i4];
        }
        float[][] fArr6 = new float[i7][];
        for (int i14 = 0; i14 < i7; i14++) {
            fArr6[i14] = new float[i7];
        }
        int i15 = 0;
        while (i15 < i7) {
            float[] fArr7 = fArr5[i15];
            float[] fArr8 = fArr4[i15];
            for (int i16 = 0; i16 < i4; i16++) {
                fArr7[i16] = fArr8[i16];
            }
            for (int i17 = 0; i17 < i15; i17++) {
                float[] fArr9 = fArr5[i17];
                float h4 = h(fArr7, fArr9);
                for (int i18 = 0; i18 < i4; i18++) {
                    fArr7[i18] = fArr7[i18] - (fArr9[i18] * h4);
                }
            }
            float sqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f4 = 1.0f / sqrt;
            for (int i19 = 0; i19 < i4; i19++) {
                fArr7[i19] = fArr7[i19] * f4;
            }
            float[] fArr10 = fArr6[i15];
            int i20 = 0;
            while (i20 < i7) {
                fArr10[i20] = i20 < i15 ? 0.0f : h(fArr7, fArr4[i20]);
                i20++;
            }
            i15++;
        }
        for (int i21 = i6; -1 < i21; i21--) {
            fArr3[i21] = h(fArr5[i21], fArr2);
            int i22 = i21 + 1;
            if (i22 <= i6) {
                int i23 = i6;
                while (true) {
                    fArr3[i21] = fArr3[i21] - (fArr6[i21][i23] * fArr3[i23]);
                    if (i23 != i22) {
                        i23--;
                    }
                }
            }
            fArr3[i21] = fArr3[i21] / fArr6[i21][i21];
        }
        return fArr3;
    }

    public static float[] o(float[] fArr, float[] fArr2, int i4, int i5, float[] fArr3, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            int i7 = i5 + 1;
            if (i7 < 0) {
                i7 = 0;
            }
            fArr3 = new float[i7];
        }
        return n(fArr, fArr2, i4, i5, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(a[] aVarArr, int i4, long j4, float f4) {
        a aVar = aVarArr[i4];
        if (aVar == null) {
            aVarArr[i4] = new a(j4, f4);
        } else {
            aVar.h(j4);
            aVar.g(f4);
        }
    }

    private static final void q(float[][] fArr, int i4, int i5, float f4) {
        fArr[i4][i5] = f4;
    }

    @k
    public static final void r(boolean z4) {
        f81489e.setValue(Boolean.valueOf(z4));
    }
}
