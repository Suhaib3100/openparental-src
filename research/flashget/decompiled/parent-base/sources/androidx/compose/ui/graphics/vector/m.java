package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.vector.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PathParser.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\u001a\u0014\u0010\u001b\u001a\u00020\u0007*\u00020\u0007H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001c\"\u001a\u0010!\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"", "Landroidx/compose/ui/graphics/vector/i;", "Landroidx/compose/ui/graphics/g5;", "target", "d", "(Ljava/util/List;Landroidx/compose/ui/graphics/g5;)Landroidx/compose/ui/graphics/g5;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "Lkotlin/k2;", "(Landroidx/compose/ui/graphics/g5;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(Landroidx/compose/ui/graphics/g5;DDDDDDDDD)V", "f", "(D)D", "", "[F", "c", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,555:1\n554#1:562\n33#2,6:556\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n407#1:562\n176#1:556,6\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final float[] f18280a = new float[0];

    private static final void a(g5 g5Var, double d5, double d6, double d7, double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d7;
        double d17 = 4;
        int ceil = (int) Math.ceil(Math.abs((d15 * d17) / 3.141592653589793d));
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double cos2 = Math.cos(d14);
        double sin2 = Math.sin(d14);
        double d18 = -d16;
        double d19 = d18 * cos;
        double d20 = d10 * sin;
        double d21 = (d19 * sin2) - (d20 * cos2);
        double d22 = d18 * sin;
        double d23 = d10 * cos;
        double d24 = (cos2 * d23) + (sin2 * d22);
        double d25 = d15 / ceil;
        double d26 = d11;
        double d27 = d24;
        double d28 = d21;
        int i4 = 0;
        double d29 = d12;
        double d30 = d14;
        while (i4 < ceil) {
            double d31 = d30 + d25;
            double sin3 = Math.sin(d31);
            double cos3 = Math.cos(d31);
            int i5 = ceil;
            double d32 = (((d16 * cos) * cos3) + d5) - (d20 * sin3);
            double d33 = (d23 * sin3) + (d16 * sin * cos3) + d6;
            double d34 = (d19 * sin3) - (d20 * cos3);
            double d35 = (cos3 * d23) + (sin3 * d22);
            double d36 = d31 - d30;
            double tan = Math.tan(d36 / 2);
            double sqrt = ((Math.sqrt(((3.0d * tan) * tan) + d17) - 1) * Math.sin(d36)) / 3;
            g5Var.t((float) ((d28 * sqrt) + d26), (float) ((d27 * sqrt) + d29), (float) (d32 - (sqrt * d34)), (float) (d33 - (sqrt * d35)), (float) d32, (float) d33);
            i4++;
            d25 = d25;
            sin = sin;
            d29 = d33;
            d26 = d32;
            d22 = d22;
            d30 = d31;
            d27 = d35;
            d17 = d17;
            d28 = d34;
            cos = cos;
            d16 = d7;
            ceil = i5;
        }
    }

    private static final void b(g5 g5Var, double d5, double d6, double d7, double d10, double d11, double d12, double d13, boolean z4, boolean z5) {
        double d14;
        double d15;
        double d16 = (d13 / 180) * 3.141592653589793d;
        double cos = Math.cos(d16);
        double sin = Math.sin(d16);
        double d17 = ((d6 * sin) + (d5 * cos)) / d11;
        double d18 = ((d6 * cos) + ((-d5) * sin)) / d12;
        double d19 = ((d10 * sin) + (d7 * cos)) / d11;
        double d20 = ((d10 * cos) + ((-d7) * sin)) / d12;
        double d21 = d17 - d19;
        double d22 = d18 - d20;
        double d23 = 2;
        double d24 = (d17 + d19) / d23;
        double d25 = (d18 + d20) / d23;
        double d26 = (d22 * d22) + (d21 * d21);
        if (d26 == com.google.firebase.remoteconfig.p.f60679p) {
            return;
        }
        double d27 = (1.0d / d26) - 0.25d;
        if (d27 < com.google.firebase.remoteconfig.p.f60679p) {
            double sqrt = (float) (Math.sqrt(d26) / 1.99999d);
            b(g5Var, d5, d6, d7, d10, d11 * sqrt, d12 * sqrt, d13, z4, z5);
            return;
        }
        double sqrt2 = Math.sqrt(d27);
        double d28 = d21 * sqrt2;
        double d29 = sqrt2 * d22;
        if (z4 == z5) {
            d14 = d24 - d29;
            d15 = d25 + d28;
        } else {
            d14 = d24 + d29;
            d15 = d25 - d28;
        }
        double atan2 = Math.atan2(d18 - d15, d17 - d14);
        double atan22 = Math.atan2(d20 - d15, d19 - d14) - atan2;
        if (z5 != (atan22 >= com.google.firebase.remoteconfig.p.f60679p)) {
            atan22 = atan22 > com.google.firebase.remoteconfig.p.f60679p ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d30 = d14 * d11;
        double d31 = d15 * d12;
        a(g5Var, (d30 * cos) - (d31 * sin), (d31 * cos) + (d30 * sin), d11, d12, d5, d6, d16, atan2, atan22);
    }

    @fg.l
    public static final float[] c() {
        return f18280a;
    }

    @fg.l
    public static final g5 d(@fg.l List<? extends i> list, @fg.l g5 g5Var) {
        i iVar;
        float f4;
        int i4;
        int i5;
        i iVar2;
        float f5;
        float f6;
        float f7;
        float f10;
        float g4;
        float h4;
        float l4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float g5;
        float h5;
        float g6;
        float h6;
        List<? extends i> list2 = list;
        g5 g5Var2 = g5Var;
        int p4 = g5Var.p();
        g5Var.rewind();
        g5Var2.g(p4);
        i iVar3 = list.isEmpty() ? i.b.f18200c : list2.get(0);
        int size = list.size();
        float f17 = 0.0f;
        int i6 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        while (i6 < size) {
            i iVar4 = list2.get(i6);
            if (iVar4 instanceof i.b) {
                g5Var.close();
                g5Var2.s(f22, f23);
                iVar2 = iVar4;
                f18 = f22;
                f20 = f18;
                f19 = f23;
                f21 = f19;
            } else {
                if (iVar4 instanceof i.n) {
                    i.n nVar = (i.n) iVar4;
                    g6 = nVar.g() + f20;
                    h6 = nVar.h() + f21;
                    g5Var2.c(nVar.g(), nVar.h());
                } else if (iVar4 instanceof i.f) {
                    i.f fVar = (i.f) iVar4;
                    g6 = fVar.g();
                    h6 = fVar.h();
                    g5Var2.s(fVar.g(), fVar.h());
                } else {
                    if (iVar4 instanceof i.m) {
                        i.m mVar = (i.m) iVar4;
                        g5Var2.w(mVar.g(), mVar.h());
                        g5 = mVar.g() + f20;
                        h5 = mVar.h() + f21;
                    } else if (iVar4 instanceof i.e) {
                        i.e eVar = (i.e) iVar4;
                        g5Var2.z(eVar.g(), eVar.h());
                        g5 = eVar.g();
                        h5 = eVar.h();
                    } else {
                        if (iVar4 instanceof i.l) {
                            i.l lVar = (i.l) iVar4;
                            g5Var2.w(lVar.f(), f17);
                            f16 = lVar.f() + f20;
                        } else if (iVar4 instanceof i.d) {
                            i.d dVar = (i.d) iVar4;
                            g5Var2.z(dVar.f(), f21);
                            f16 = dVar.f();
                        } else {
                            if (iVar4 instanceof i.r) {
                                i.r rVar = (i.r) iVar4;
                                g5Var2.w(f17, rVar.f());
                                f15 = rVar.f() + f21;
                            } else if (iVar4 instanceof i.s) {
                                i.s sVar = (i.s) iVar4;
                                g5Var2.z(f20, sVar.f());
                                f15 = sVar.f();
                            } else {
                                if (iVar4 instanceof i.k) {
                                    i.k kVar = (i.k) iVar4;
                                    iVar = iVar4;
                                    g5Var.d(kVar.k(), kVar.n(), kVar.l(), kVar.o(), kVar.m(), kVar.p());
                                    f7 = kVar.l() + f20;
                                    f10 = kVar.o() + f21;
                                    g4 = kVar.m() + f20;
                                    h4 = kVar.p();
                                } else {
                                    iVar = iVar4;
                                    if (iVar instanceof i.c) {
                                        i.c cVar = (i.c) iVar;
                                        g5Var.t(cVar.k(), cVar.n(), cVar.l(), cVar.o(), cVar.m(), cVar.p());
                                        f7 = cVar.l();
                                        f10 = cVar.o();
                                        g4 = cVar.m();
                                        l4 = cVar.p();
                                    } else if (iVar instanceof i.p) {
                                        if (iVar3.getIsCurve()) {
                                            f14 = f21 - f19;
                                            f13 = f20 - f18;
                                        } else {
                                            f13 = f17;
                                            f14 = f13;
                                        }
                                        i.p pVar = (i.p) iVar;
                                        g5Var.d(f13, f14, pVar.i(), pVar.k(), pVar.j(), pVar.l());
                                        f7 = pVar.i() + f20;
                                        f10 = pVar.k() + f21;
                                        g4 = pVar.j() + f20;
                                        h4 = pVar.l();
                                    } else if (iVar instanceof i.h) {
                                        if (iVar3.getIsCurve()) {
                                            float f24 = 2;
                                            f12 = (f24 * f21) - f19;
                                            f11 = (f20 * f24) - f18;
                                        } else {
                                            f11 = f20;
                                            f12 = f21;
                                        }
                                        i.h hVar = (i.h) iVar;
                                        g5Var.t(f11, f12, hVar.i(), hVar.k(), hVar.j(), hVar.l());
                                        f7 = hVar.i();
                                        f10 = hVar.k();
                                        g4 = hVar.j();
                                        l4 = hVar.l();
                                    } else if (iVar instanceof i.o) {
                                        i.o oVar = (i.o) iVar;
                                        g5Var2.f(oVar.i(), oVar.k(), oVar.j(), oVar.l());
                                        f7 = oVar.i() + f20;
                                        f10 = oVar.k() + f21;
                                        g4 = oVar.j() + f20;
                                        h4 = oVar.l();
                                    } else if (iVar instanceof i.g) {
                                        i.g gVar = (i.g) iVar;
                                        g5Var2.e(gVar.i(), gVar.k(), gVar.j(), gVar.l());
                                        f7 = gVar.i();
                                        f10 = gVar.k();
                                        g4 = gVar.j();
                                        l4 = gVar.l();
                                    } else if (iVar instanceof i.q) {
                                        if (iVar3.getIsQuad()) {
                                            f5 = f20 - f18;
                                            f6 = f21 - f19;
                                        } else {
                                            f5 = f17;
                                            f6 = f5;
                                        }
                                        i.q qVar = (i.q) iVar;
                                        g5Var2.f(f5, f6, qVar.g(), qVar.h());
                                        f7 = f5 + f20;
                                        f10 = f6 + f21;
                                        g4 = qVar.g() + f20;
                                        h4 = qVar.h();
                                    } else {
                                        if (iVar instanceof i.C0333i) {
                                            if (iVar3.getIsQuad()) {
                                                float f25 = 2;
                                                f20 = (f20 * f25) - f18;
                                                f21 = (f25 * f21) - f19;
                                            }
                                            i.C0333i c0333i = (i.C0333i) iVar;
                                            g5Var2.e(f20, f21, c0333i.g(), c0333i.h());
                                            float g7 = c0333i.g();
                                            iVar2 = iVar;
                                            f19 = f21;
                                            f4 = f17;
                                            i4 = i6;
                                            i5 = size;
                                            f21 = c0333i.h();
                                            f18 = f20;
                                            f20 = g7;
                                        } else if (iVar instanceof i.j) {
                                            i.j jVar = (i.j) iVar;
                                            float l5 = jVar.l() + f20;
                                            float m4 = jVar.m() + f21;
                                            iVar2 = iVar;
                                            i4 = i6;
                                            f4 = 0.0f;
                                            i5 = size;
                                            b(g5Var, f20, f21, l5, m4, jVar.n(), jVar.p(), jVar.o(), jVar.q(), jVar.r());
                                            f18 = l5;
                                            f20 = f18;
                                            f22 = f22;
                                            f23 = f23;
                                            f19 = m4;
                                            f21 = f19;
                                        } else {
                                            float f26 = f22;
                                            float f27 = f23;
                                            f4 = f17;
                                            i4 = i6;
                                            i5 = size;
                                            if (iVar instanceof i.a) {
                                                i.a aVar = (i.a) iVar;
                                                iVar2 = iVar;
                                                b(g5Var, f20, f21, aVar.l(), aVar.m(), aVar.n(), aVar.p(), aVar.o(), aVar.q(), aVar.r());
                                                f20 = aVar.l();
                                                f19 = aVar.m();
                                                f21 = f19;
                                                f22 = f26;
                                                f23 = f27;
                                                f18 = f20;
                                            } else {
                                                iVar2 = iVar;
                                                f22 = f26;
                                                f23 = f27;
                                            }
                                        }
                                        i6 = i4 + 1;
                                        g5Var2 = g5Var;
                                        size = i5;
                                        iVar3 = iVar2;
                                        f17 = f4;
                                        list2 = list;
                                    }
                                    iVar2 = iVar;
                                    f20 = g4;
                                    f21 = l4;
                                    f4 = f17;
                                    i4 = i6;
                                    i5 = size;
                                    f19 = f10;
                                    f18 = f7;
                                    i6 = i4 + 1;
                                    g5Var2 = g5Var;
                                    size = i5;
                                    iVar3 = iVar2;
                                    f17 = f4;
                                    list2 = list;
                                }
                                l4 = h4 + f21;
                                iVar2 = iVar;
                                f20 = g4;
                                f21 = l4;
                                f4 = f17;
                                i4 = i6;
                                i5 = size;
                                f19 = f10;
                                f18 = f7;
                                i6 = i4 + 1;
                                g5Var2 = g5Var;
                                size = i5;
                                iVar3 = iVar2;
                                f17 = f4;
                                list2 = list;
                            }
                            f21 = f15;
                            iVar2 = iVar4;
                        }
                        f20 = f16;
                        iVar2 = iVar4;
                    }
                    f21 = h5;
                    f20 = g5;
                    iVar2 = iVar4;
                }
                f20 = g6;
                f22 = f20;
                f21 = h6;
                f23 = f21;
                iVar2 = iVar4;
            }
            f4 = f17;
            i4 = i6;
            i5 = size;
            i6 = i4 + 1;
            g5Var2 = g5Var;
            size = i5;
            iVar3 = iVar2;
            f17 = f4;
            list2 = list;
        }
        return g5Var;
    }

    public static /* synthetic */ g5 e(List list, g5 g5Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            g5Var = a1.a();
        }
        return d(list, g5Var);
    }

    private static final double f(double d5) {
        return (d5 / 180) * 3.141592653589793d;
    }
}
