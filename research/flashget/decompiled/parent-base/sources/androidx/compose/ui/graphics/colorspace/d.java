package androidx.compose.ui.graphics.colorspace;

import androidx.compose.material3.f4;
import androidx.compose.ui.graphics.colorspace.b;
import androidx.compose.ui.graphics.colorspace.h;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ColorSpace.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001aO\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aO\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a?\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0014\u001a?\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a!\u0010\u0012\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u0012\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010!\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010#\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010(\u001a\u001f\u0010)\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020 H\u0000¢\u0006\u0004\b)\u0010(\u001a/\u0010.\u001a\u00020*2\u0006\u0010&\u001a\u00020 2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b.\u0010/\u001a/\u00100\u001a\u00020*2\u0006\u0010&\u001a\u00020 2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b0\u0010/\u001a/\u00101\u001a\u00020*2\u0006\u0010&\u001a\u00020 2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b1\u0010/\u001a\u001f\u00102\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020 H\u0000¢\u0006\u0004\b2\u0010(\u001a'\u0010\u0017\u001a\u00020 2\u0006\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020 H\u0000¢\u0006\u0004\b\u0017\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "destination", "Landroidx/compose/ui/graphics/colorspace/m;", "intent", "Landroidx/compose/ui/graphics/colorspace/h;", "j", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I)Landroidx/compose/ui/graphics/colorspace/h;", "Landroidx/compose/ui/graphics/colorspace/e0;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/a;", "adaptation", "d", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/e0;Landroidx/compose/ui/graphics/colorspace/a;)Landroidx/compose/ui/graphics/colorspace/c;", "", "x", "a", "b", "c", "g", "s", "(DDDDDD)D", "u", "e", "f", "t", "(DDDDDDDD)D", "v", "Landroidx/compose/ui/graphics/colorspace/d0;", "", "(Landroidx/compose/ui/graphics/colorspace/d0;Landroidx/compose/ui/graphics/colorspace/d0;)Z", "h", "(Landroidx/compose/ui/graphics/colorspace/e0;Landroidx/compose/ui/graphics/colorspace/e0;)Z", "", "i", "([F[F)Z", "m", "l", "([F)[F", "lhs", "rhs", "([F[F)[F", "o", "", "r0", "r1", "r2", "p", "([FFFF)F", "q", "r", "n", "matrix", "srcWhitePoint", "dstWhitePoint", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final double a(double d5, double d6, double d7, double d10, double d11, double d12) {
        return Math.copySign(s(d5 < com.google.firebase.remoteconfig.p.f60679p ? -d5 : d5, d6, d7, d10, d11, d12), d5);
    }

    public static final double b(double d5, double d6, double d7, double d10, double d11, double d12) {
        return Math.copySign(u(d5 < com.google.firebase.remoteconfig.p.f60679p ? -d5 : d5, d6, d7, d10, d11, d12), d5);
    }

    @fg.l
    @kd.j
    public static final c c(@fg.l c cVar, @fg.l e0 e0Var) {
        return e(cVar, e0Var, null, 2, null);
    }

    @fg.l
    @kd.j
    public static final c d(@fg.l c cVar, @fg.l e0 e0Var, @fg.l a aVar) {
        long model = cVar.getModel();
        b.INSTANCE.getClass();
        if (!b.h(model, b.f17669c)) {
            return cVar;
        }
        l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        a0 a0Var = (a0) cVar;
        if (h(a0Var.getWhitePoint(), e0Var)) {
            return cVar;
        }
        return new a0(a0Var, m(f(aVar.getTransform(), a0Var.getWhitePoint().g(), e0Var.g()), a0Var.getTransform()), e0Var);
    }

    public static c e(c cVar, e0 e0Var, a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            a.INSTANCE.getClass();
            aVar = a.f17645c;
        }
        return d(cVar, e0Var, aVar);
    }

    @fg.l
    public static final float[] f(@fg.l float[] fArr, @fg.l float[] fArr2, @fg.l float[] fArr3) {
        float[] o4 = o(fArr, fArr2);
        float[] o5 = o(fArr, fArr3);
        return m(l(fArr), n(new float[]{o5[0] / o4[0], o5[1] / o4[1], o5[2] / o4[2]}, fArr));
    }

    public static final boolean g(@fg.l d0 d0Var, @fg.m d0 d0Var2) {
        return d0Var2 != null && Math.abs(d0Var.j() - d0Var2.j()) < 0.001d && Math.abs(d0Var.k() - d0Var2.k()) < 0.001d && Math.abs(d0Var.l() - d0Var2.l()) < 0.001d && Math.abs(d0Var.m() - d0Var2.m()) < 0.002d && Math.abs(d0Var.n() - d0Var2.n()) < 0.001d && Math.abs(d0Var.o() - d0Var2.o()) < 0.001d && Math.abs(d0Var.p() - d0Var2.p()) < 0.001d;
    }

    public static final boolean h(@fg.l e0 e0Var, @fg.l e0 e0Var2) {
        if (e0Var == e0Var2) {
            return true;
        }
        return Math.abs(e0Var.e() - e0Var2.e()) < 0.001f && Math.abs(e0Var.f() - e0Var2.f()) < 0.001f;
    }

    public static final boolean i(@fg.l float[] fArr, @fg.l float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (Float.compare(fArr[i4], fArr2[i4]) != 0 && Math.abs(fArr[i4] - fArr2[i4]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public static final h j(@fg.l c cVar, @fg.l c cVar2, int i4) {
        g gVar = g.f17689a;
        if (cVar == gVar.x()) {
            if (cVar2 == gVar.x()) {
                h.INSTANCE.getClass();
                return h.f17714h;
            }
            if (cVar2 == gVar.u()) {
                m.INSTANCE.getClass();
                if (m.h(i4, m.f17748c)) {
                    h.INSTANCE.getClass();
                    return h.f17715i;
                }
            }
        } else if (cVar == gVar.u() && cVar2 == gVar.x()) {
            m.INSTANCE.getClass();
            if (m.h(i4, m.f17748c)) {
                h.INSTANCE.getClass();
                return h.f17716j;
            }
        }
        if (cVar == cVar2) {
            return h.INSTANCE.f(cVar);
        }
        long model = cVar.getModel();
        b.Companion companion = b.INSTANCE;
        companion.getClass();
        kotlin.jvm.internal.w wVar = null;
        if (b.h(model, b.f17669c)) {
            long model2 = cVar2.getModel();
            companion.getClass();
            if (b.h(model2, b.f17669c)) {
                l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                l0.n(cVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                return new h.b((a0) cVar, (a0) cVar2, i4, wVar);
            }
        }
        return new h(cVar, cVar2, i4, wVar);
    }

    public static h k(c cVar, c cVar2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cVar2 = g.f17689a.x();
        }
        if ((i5 & 2) != 0) {
            m.INSTANCE.getClass();
            i4 = m.f17748c;
        }
        return j(cVar, cVar2, i4);
    }

    @fg.l
    public static final float[] l(@fg.l float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[3];
        float f6 = fArr[6];
        float f7 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f10 * f14) - (f11 * f13);
        float f16 = (f11 * f12) - (f7 * f14);
        float f17 = (f7 * f13) - (f10 * f12);
        float f18 = (f6 * f17) + (f5 * f16) + (f4 * f15);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f15 / f18;
        fArr2[1] = f16 / f18;
        fArr2[2] = f17 / f18;
        fArr2[3] = f4.a(f5, f14, f6 * f13, f18);
        fArr2[4] = f4.a(f6, f12, f14 * f4, f18);
        fArr2[5] = f4.a(f4, f13, f12 * f5, f18);
        fArr2[6] = f4.a(f6, f10, f5 * f11, f18);
        fArr2[7] = f4.a(f4, f11, f6 * f7, f18);
        fArr2[8] = f4.a(f5, f7, f4 * f10, f18);
        return fArr2;
    }

    @fg.l
    public static final float[] m(@fg.l float[] fArr, @fg.l float[] fArr2) {
        float f4 = fArr[0];
        float f5 = fArr2[0];
        float f6 = fArr[3];
        float f7 = fArr2[1];
        float f10 = fArr[6];
        float f11 = fArr2[2];
        float f12 = (f10 * f11) + (f6 * f7) + (f4 * f5);
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = (f15 * f11) + (f14 * f7) + (f13 * f5);
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[8];
        float f20 = (f11 * f19) + (f7 * f18) + (f5 * f17);
        float f21 = fArr2[3];
        float f22 = fArr2[4];
        float f23 = fArr2[5];
        float f24 = (f10 * f23) + (f6 * f22) + (f4 * f21);
        float f25 = (f15 * f23) + (f14 * f22) + (f13 * f21);
        float f26 = (f23 * f19) + (f22 * f18) + (f21 * f17);
        float f27 = fArr2[6];
        float f28 = fArr2[7];
        float f29 = (f6 * f28) + (f4 * f27);
        float f30 = fArr2[8];
        return new float[]{f12, f16, f20, f24, f25, f26, (f10 * f30) + f29, (f15 * f30) + (f14 * f28) + (f13 * f27), (f19 * f30) + (f18 * f28) + (f17 * f27)};
    }

    @fg.l
    public static final float[] n(@fg.l float[] fArr, @fg.l float[] fArr2) {
        float f4 = fArr[0];
        float f5 = fArr2[0] * f4;
        float f6 = fArr[1];
        float f7 = fArr2[1] * f6;
        float f10 = fArr[2];
        return new float[]{f5, f7, fArr2[2] * f10, fArr2[3] * f4, fArr2[4] * f6, fArr2[5] * f10, f4 * fArr2[6], f6 * fArr2[7], f10 * fArr2[8]};
    }

    @fg.l
    public static final float[] o(@fg.l float[] fArr, @fg.l float[] fArr2) {
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float f6 = fArr2[2];
        fArr2[0] = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f4);
        fArr2[1] = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f4);
        fArr2[2] = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f4);
        return fArr2;
    }

    public static final float p(@fg.l float[] fArr, float f4, float f5, float f6) {
        return (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f4);
    }

    public static final float q(@fg.l float[] fArr, float f4, float f5, float f6) {
        return (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f4);
    }

    public static final float r(@fg.l float[] fArr, float f4, float f5, float f6) {
        return (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f4);
    }

    public static final double s(double d5, double d6, double d7, double d10, double d11, double d12) {
        return d5 >= d11 * d10 ? (Math.pow(d5, 1.0d / d12) - d7) / d6 : d5 / d10;
    }

    public static final double t(double d5, double d6, double d7, double d10, double d11, double d12, double d13, double d14) {
        return d5 >= d11 * d10 ? (Math.pow(d5 - d12, 1.0d / d14) - d7) / d6 : (d5 - d13) / d10;
    }

    public static final double u(double d5, double d6, double d7, double d10, double d11, double d12) {
        return d5 >= d11 ? Math.pow((d6 * d5) + d7, d12) : d5 * d10;
    }

    public static final double v(double d5, double d6, double d7, double d10, double d11, double d12, double d13, double d14) {
        return d5 >= d11 ? Math.pow((d6 * d5) + d7, d14) + d12 : (d10 * d5) + d13;
    }
}
