package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidShader.android.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010#\u001a\u0004\u0018\u00010\"2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b#\u0010$\u001a-\u0010&\u001a\u00020%2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b&\u0010'*\n\u0010(\"\u00020\n2\u00020\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Li0/f;", "from", "to", "", "Landroidx/compose/ui/graphics/d2;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/n6;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "center", "radius", "c", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "d", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/s4;", "image", "tileModeX", "tileModeY", "a", "(Landroidx/compose/ui/graphics/s4;II)Landroid/graphics/Shader;", "", "e", "(Ljava/util/List;)I", "numTransparentColors", "", "f", "(Ljava/util/List;I)[I", "stops", "", "g", "(Ljava/util/List;Ljava/util/List;I)[F", "Lkotlin/k2;", "h", "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n69#2,6:207\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:207,6\n*E\n"})
/* loaded from: classes.dex */
public final class d1 {
    @fg.l
    public static final Shader a(@fg.l s4 s4Var, int i4, int i5) {
        return new BitmapShader(r0.b(s4Var), f1.b(i4), f1.b(i5));
    }

    @fg.l
    public static final Shader b(long j4, long j5, @fg.l List<d2> list, @fg.m List<Float> list2, int i4) {
        h(list, list2);
        int e4 = e(list);
        return new LinearGradient(i0.f.p(j4), i0.f.r(j4), i0.f.p(j5), i0.f.r(j5), f(list, e4), g(list2, list, e4), f1.b(i4));
    }

    @fg.l
    public static final Shader c(long j4, float f4, @fg.l List<d2> list, @fg.m List<Float> list2, int i4) {
        h(list, list2);
        int e4 = e(list);
        return new RadialGradient(i0.f.p(j4), i0.f.r(j4), f4, f(list, e4), g(list2, list, e4), f1.b(i4));
    }

    @fg.l
    public static final Shader d(long j4, @fg.l List<d2> list, @fg.m List<Float> list2) {
        h(list, list2);
        int e4 = e(list);
        return new SweepGradient(i0.f.p(j4), i0.f.r(j4), f(list, e4), g(list2, list, e4));
    }

    @androidx.annotation.m1
    public static final int e(@fg.l List<d2> list) {
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int J = kotlin.collections.w.J(list);
        for (int i5 = 1; i5 < J; i5++) {
            if (d2.A(list.get(i5).M()) == 0.0f) {
                i4++;
            }
        }
        return i4;
    }

    @fg.l
    @androidx.annotation.m1
    public static final int[] f(@fg.l List<d2> list, int i4) {
        int i5;
        int i6 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i6 < size) {
                iArr[i6] = f2.r(list.get(i6).M());
                i6++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i4];
        int J = kotlin.collections.w.J(list);
        int size2 = list.size();
        int i7 = 0;
        while (i6 < size2) {
            long M = list.get(i6).M();
            if (d2.A(M) == 0.0f) {
                if (i6 == 0) {
                    i5 = i7 + 1;
                    iArr2[i7] = f2.r(d2.w(list.get(1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i6 == J) {
                    i5 = i7 + 1;
                    iArr2[i7] = f2.r(d2.w(list.get(i6 - 1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i10 = i7 + 1;
                    iArr2[i7] = f2.r(d2.w(list.get(i6 - 1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i7 += 2;
                    iArr2[i10] = f2.r(d2.w(list.get(i6 + 1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i7 = i5;
            } else {
                iArr2[i7] = f2.r(M);
                i7++;
            }
            i6++;
        }
        return iArr2;
    }

    @fg.m
    @androidx.annotation.m1
    public static final float[] g(@fg.m List<Float> list, @fg.l List<d2> list2, int i4) {
        if (i4 == 0) {
            if (list != null) {
                return kotlin.collections.w.S5(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i4];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int J = kotlin.collections.w.J(list2);
        int i5 = 1;
        for (int i6 = 1; i6 < J; i6++) {
            long M = list2.get(i6).M();
            float floatValue = list != null ? list.get(i6).floatValue() : i6 / kotlin.collections.w.J(list2);
            int i7 = i5 + 1;
            fArr[i5] = floatValue;
            if (d2.A(M) == 0.0f) {
                i5 += 2;
                fArr[i7] = floatValue;
            } else {
                i5 = i7;
            }
        }
        fArr[i5] = list != null ? list.get(kotlin.collections.w.J(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void h(List<d2> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
