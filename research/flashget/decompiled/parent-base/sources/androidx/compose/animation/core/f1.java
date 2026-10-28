package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MonoSpline.kt */
@n0
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\n\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\n\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b \u0010\u0012J\u001d\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001d\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u001fJ\u001d\u0010$\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020!¢\u0006\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010,\u001a\u00020*8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010+R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006."}, d2 = {"Landroidx/compose/animation/core/f1;", "", "", "time", "", "y", "<init>", "([FLjava/util/List;)V", "", "a", "b", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "j", "(II)Ljava/util/ArrayList;", "(Ljava/util/List;)Ljava/util/ArrayList;", "", "f", "(FI)F", "h", "x", "y1", "y2", "t1", "t2", "i", "(FFFFFF)F", "t", "v", "Lkotlin/k2;", "e", "(F[F)V", "c", "Landroidx/compose/animation/core/s;", "d", "(FLandroidx/compose/animation/core/s;)V", "g", "[F", "timePoints", "Ljava/util/ArrayList;", "values", "tangents", "", "Z", "isExtrapolate", "slopeTemp", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2695f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] timePoints;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ArrayList<float[]> values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ArrayList<float[]> tangents;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isExtrapolate = true;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] slopeTemp;

    public f1(@fg.l float[] fArr, @fg.l List<float[]> list) {
        int i4;
        int length = fArr.length;
        int i5 = 0;
        int length2 = list.get(0).length;
        this.slopeTemp = new float[length2];
        int i6 = length - 1;
        ArrayList<float[]> j4 = j(i6, length2);
        ArrayList<float[]> j5 = j(length, length2);
        for (int i7 = 0; i7 < length2; i7++) {
            int i10 = 0;
            while (i10 < i6) {
                int i11 = i10 + 1;
                j4.get(i10)[i7] = (list.get(i11)[i7] - list.get(i10)[i7]) / (fArr[i11] - fArr[i10]);
                if (i10 == 0) {
                    j5.get(i10)[i7] = j4.get(i10)[i7];
                } else {
                    j5.get(i10)[i7] = (j4.get(i10 - 1)[i7] + j4.get(i10)[i7]) * 0.5f;
                }
                i10 = i11;
            }
            j5.get(i6)[i7] = j4.get(length - 2)[i7];
        }
        int i12 = 0;
        while (i12 < i6) {
            int i13 = i5;
            while (i13 < length2) {
                if (j4.get(i12)[i13] == 0.0f) {
                    j5.get(i12)[i13] = 0.0f;
                    j5.get(i12 + 1)[i13] = 0.0f;
                    i4 = length2;
                } else {
                    float f4 = j5.get(i12)[i13] / j4.get(i12)[i13];
                    int i14 = i12 + 1;
                    float f5 = j5.get(i14)[i13] / j4.get(i12)[i13];
                    i4 = length2;
                    float hypot = (float) Math.hypot(f4, f5);
                    if (hypot > 9.0d) {
                        float f6 = 3.0f / hypot;
                        j5.get(i12)[i13] = f4 * f6 * j4.get(i12)[i13];
                        j5.get(i14)[i13] = f6 * f5 * j4.get(i12)[i13];
                    }
                }
                i13++;
                length2 = i4;
            }
            i12++;
            i5 = 0;
        }
        this.timePoints = fArr;
        this.values = a(list);
        this.tangents = j5;
    }

    private final ArrayList<float[]> a(List<float[]> y4) {
        ArrayList<float[]> arrayList = new ArrayList<>();
        arrayList.addAll(y4);
        return arrayList;
    }

    private final float b(float h4, float x4, float y12, float y22, float t12, float t22) {
        float f4 = x4 * x4;
        float f5 = 6;
        float f6 = f5 * x4;
        float f7 = (((f5 * f4) * y12) + ((y22 * f6) + (((-6) * f4) * y22))) - (f6 * y12);
        float f10 = 3 * h4;
        return (h4 * t12) + (((((f10 * t12) * f4) + (((f10 * t22) * f4) + f7)) - (((2 * h4) * t22) * x4)) - (((4 * h4) * t12) * x4));
    }

    private final float f(float time, int j4) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i4 = 0;
        float f4 = fArr[0];
        if (time < f4) {
            time = f4;
        } else {
            float f5 = fArr[length - 1];
            if (time >= f5) {
                time = f5;
            }
        }
        int i5 = length - 1;
        while (i4 < i5) {
            float[] fArr2 = this.timePoints;
            int i6 = i4 + 1;
            float f6 = fArr2[i6];
            if (time <= f6) {
                float f7 = fArr2[i4];
                float f10 = f6 - f7;
                return b(f10, (time - f7) / f10, this.values.get(i4)[j4], this.values.get(i6)[j4], this.tangents.get(i4)[j4], this.tangents.get(i6)[j4]) / f10;
            }
            i4 = i6;
        }
        return 0.0f;
    }

    private final float i(float h4, float x4, float y12, float y22, float t12, float t22) {
        float f4 = x4 * x4;
        float f5 = f4 * x4;
        float f6 = 3 * f4;
        float f7 = 2;
        float f10 = t22 * h4;
        float f11 = (f10 * f5) + ((((f7 * f5) * y12) + ((y22 * f6) + (((-2) * f5) * y22))) - (f6 * y12)) + y12;
        float f12 = h4 * t12;
        return (f12 * x4) + ((((f5 * f12) + f11) - (f10 * f4)) - (((f7 * h4) * t12) * f4));
    }

    private final ArrayList<float[]> j(int a5, int b5) {
        ArrayList<float[]> arrayList = new ArrayList<>();
        for (int i4 = 0; i4 < a5; i4++) {
            arrayList.add(new float[b5]);
        }
        return arrayList;
    }

    public final float c(float t4, int j4) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i4 = 0;
        if (this.isExtrapolate) {
            if (t4 <= fArr[0]) {
                float f4 = this.values.get(0)[j4];
                float f5 = this.timePoints[0];
                return ((t4 - f5) * f(f5, j4)) + f4;
            }
            int i5 = length - 1;
            if (t4 >= fArr[i5]) {
                float f6 = this.values.get(i5)[j4];
                float f7 = this.timePoints[i5];
                return ((t4 - f7) * f(f7, j4)) + f6;
            }
        } else {
            if (t4 <= fArr[0]) {
                return this.values.get(0)[j4];
            }
            int i6 = length - 1;
            if (t4 >= fArr[i6]) {
                return this.values.get(i6)[j4];
            }
        }
        int i7 = length - 1;
        while (i4 < i7) {
            float[] fArr2 = this.timePoints;
            float f10 = fArr2[i4];
            if (t4 == f10) {
                return this.values.get(i4)[j4];
            }
            int i10 = i4 + 1;
            float f11 = fArr2[i10];
            if (t4 < f11) {
                float f12 = f11 - f10;
                return i(f12, (t4 - f10) / f12, this.values.get(i4)[j4], this.values.get(i10)[j4], this.tangents.get(i4)[j4], this.tangents.get(i10)[j4]);
            }
            i4 = i10;
        }
        return 0.0f;
    }

    public final void d(float t4, @fg.l s v4) {
        int length = this.timePoints.length;
        int i4 = 0;
        int length2 = this.values.get(0).length;
        if (this.isExtrapolate) {
            float[] fArr = this.timePoints;
            float f4 = fArr[0];
            if (t4 <= f4) {
                h(f4, this.slopeTemp);
                for (int i5 = 0; i5 < length2; i5++) {
                    v4.e(i5, ((t4 - this.timePoints[0]) * this.slopeTemp[i5]) + this.values.get(0)[i5]);
                }
                return;
            }
            int i6 = length - 1;
            float f5 = fArr[i6];
            if (t4 >= f5) {
                h(f5, this.slopeTemp);
                while (i4 < length2) {
                    v4.e(i4, ((t4 - this.timePoints[i6]) * this.slopeTemp[i4]) + this.values.get(i6)[i4]);
                    i4++;
                }
                return;
            }
        } else {
            float[] fArr2 = this.timePoints;
            if (t4 <= fArr2[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    v4.e(i7, this.values.get(0)[i7]);
                }
                return;
            }
            int i10 = length - 1;
            if (t4 >= fArr2[i10]) {
                while (i4 < length2) {
                    v4.e(i4, this.values.get(i10)[i4]);
                    i4++;
                }
                return;
            }
        }
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < i11) {
            if (t4 == this.timePoints[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    v4.e(i13, this.values.get(i12)[i13]);
                }
            }
            float[] fArr3 = this.timePoints;
            int i14 = i12 + 1;
            float f6 = fArr3[i14];
            if (t4 < f6) {
                float f7 = fArr3[i12];
                float f10 = f6 - f7;
                float f11 = (t4 - f7) / f10;
                for (int i15 = 0; i15 < length2; i15++) {
                    v4.e(i15, i(f10, f11, this.values.get(i12)[i15], this.values.get(i14)[i15], this.tangents.get(i12)[i15], this.tangents.get(i14)[i15]));
                }
                return;
            }
            i12 = i14;
        }
    }

    public final void e(float t4, @fg.l float[] v4) {
        int length = this.timePoints.length;
        int i4 = 0;
        int length2 = this.values.get(0).length;
        if (this.isExtrapolate) {
            float[] fArr = this.timePoints;
            float f4 = fArr[0];
            if (t4 <= f4) {
                h(f4, this.slopeTemp);
                for (int i5 = 0; i5 < length2; i5++) {
                    v4[i5] = ((t4 - this.timePoints[0]) * this.slopeTemp[i5]) + this.values.get(0)[i5];
                }
                return;
            }
            int i6 = length - 1;
            float f5 = fArr[i6];
            if (t4 >= f5) {
                h(f5, this.slopeTemp);
                while (i4 < length2) {
                    v4[i4] = ((t4 - this.timePoints[i6]) * this.slopeTemp[i4]) + this.values.get(i6)[i4];
                    i4++;
                }
                return;
            }
        } else {
            float[] fArr2 = this.timePoints;
            if (t4 <= fArr2[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    v4[i7] = this.values.get(0)[i7];
                }
                return;
            }
            int i10 = length - 1;
            if (t4 >= fArr2[i10]) {
                while (i4 < length2) {
                    v4[i4] = this.values.get(i10)[i4];
                    i4++;
                }
                return;
            }
        }
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < i11) {
            if (t4 == this.timePoints[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    v4[i13] = this.values.get(i12)[i13];
                }
            }
            float[] fArr3 = this.timePoints;
            int i14 = i12 + 1;
            float f6 = fArr3[i14];
            if (t4 < f6) {
                float f7 = fArr3[i12];
                float f10 = f6 - f7;
                float f11 = (t4 - f7) / f10;
                for (int i15 = 0; i15 < length2; i15++) {
                    v4[i15] = i(f10, f11, this.values.get(i12)[i15], this.values.get(i14)[i15], this.tangents.get(i12)[i15], this.tangents.get(i14)[i15]);
                }
                return;
            }
            i12 = i14;
        }
    }

    public final void g(float time, @fg.l s v4) {
        float f4;
        int length = this.timePoints.length;
        int length2 = this.values.get(0).length;
        float[] fArr = this.timePoints;
        float f5 = fArr[0];
        if (time <= f5) {
            f4 = f5;
        } else {
            f4 = fArr[length - 1];
            if (time < f4) {
                f4 = time;
            }
        }
        int i4 = length - 1;
        int i5 = 0;
        while (i5 < i4) {
            float[] fArr2 = this.timePoints;
            int i6 = i5 + 1;
            float f6 = fArr2[i6];
            if (f4 <= f6) {
                float f7 = fArr2[i5];
                float f10 = f6 - f7;
                float f11 = (f4 - f7) / f10;
                for (int i7 = 0; i7 < length2; i7++) {
                    v4.e(i7, b(f10, f11, this.values.get(i5)[i7], this.values.get(i6)[i7], this.tangents.get(i5)[i7], this.tangents.get(i6)[i7]) / f10);
                }
                return;
            }
            i5 = i6;
        }
    }

    public final void h(float time, @fg.l float[] v4) {
        float f4;
        int length = this.timePoints.length;
        int length2 = this.values.get(0).length;
        float[] fArr = this.timePoints;
        float f5 = fArr[0];
        if (time <= f5) {
            f4 = f5;
        } else {
            f4 = fArr[length - 1];
            if (time < f4) {
                f4 = time;
            }
        }
        int i4 = length - 1;
        int i5 = 0;
        while (i5 < i4) {
            float[] fArr2 = this.timePoints;
            int i6 = i5 + 1;
            float f6 = fArr2[i6];
            if (f4 <= f6) {
                float f7 = fArr2[i5];
                float f10 = f6 - f7;
                float f11 = (f4 - f7) / f10;
                for (int i7 = 0; i7 < length2; i7++) {
                    v4[i7] = b(f10, f11, this.values.get(i5)[i7], this.values.get(i6)[i7], this.tangents.get(i5)[i7], this.tangents.get(i6)[i7]) / f10;
                }
                return;
            }
            i5 = i6;
        }
    }
}
