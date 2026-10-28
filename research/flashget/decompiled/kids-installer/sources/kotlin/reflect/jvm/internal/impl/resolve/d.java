package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: DescriptorFactory.java */
/* loaded from: classes5.dex */
public class d {

    /* compiled from: DescriptorFactory.java */
    /* loaded from: classes6.dex */
    private static class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d a1 a1Var, boolean z5) {
            super(eVar, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), true, b.a.DECLARATION, a1Var);
            if (eVar == null) {
                Q(0);
            }
            if (a1Var == null) {
                Q(1);
            }
            x1(Collections.emptyList(), e.k(eVar, z5));
        }

        private static /* synthetic */ void Q(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("蚄");
            } else {
                objArr[0] = ProtectedSandApp.s("蚅");
            }
            objArr[1] = ProtectedSandApp.s("蚆");
            objArr[2] = ProtectedSandApp.s("蚇");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("蚈"), objArr));
        }
    }

    private static /* synthetic */ void a(int i5) {
        String s5 = (i5 == 12 || i5 == 23 || i5 == 25) ? ProtectedSandApp.s("冧") : ProtectedSandApp.s("冦");
        Object[] objArr = new Object[(i5 == 12 || i5 == 23 || i5 == 25) ? 2 : 3];
        String s6 = ProtectedSandApp.s("冨");
        switch (i5) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = ProtectedSandApp.s("冲");
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = ProtectedSandApp.s("冱");
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = ProtectedSandApp.s("冩");
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = ProtectedSandApp.s("冰");
                break;
            case 10:
                objArr[0] = ProtectedSandApp.s("冯");
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = s6;
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("冮");
                break;
            case 21:
                objArr[0] = ProtectedSandApp.s("冭");
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = ProtectedSandApp.s("冬");
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = ProtectedSandApp.s("冫");
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = ProtectedSandApp.s("冪");
                break;
        }
        String s7 = ProtectedSandApp.s("决");
        String s8 = ProtectedSandApp.s("冴");
        String s9 = ProtectedSandApp.s("况");
        if (i5 == 12) {
            objArr[1] = s9;
        } else if (i5 == 23) {
            objArr[1] = s8;
        } else if (i5 != 25) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        switch (i5) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = s9;
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = ProtectedSandApp.s("净");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = ProtectedSandApp.s("冿");
                break;
            case 20:
            case 21:
                objArr[2] = ProtectedSandApp.s("冾");
                break;
            case 22:
                objArr[2] = s8;
                break;
            case 24:
                objArr[2] = s7;
                break;
            case 26:
                objArr[2] = ProtectedSandApp.s("冽");
                break;
            case 27:
                objArr[2] = ProtectedSandApp.s("冼");
                break;
            case 28:
                objArr[2] = ProtectedSandApp.s("冻");
                break;
            case 29:
                objArr[2] = ProtectedSandApp.s("冺");
                break;
            case 30:
            case 31:
                objArr[2] = ProtectedSandApp.s("冹");
                break;
            case 32:
            case 33:
                objArr[2] = ProtectedSandApp.s("冸");
                break;
            case 34:
            case 35:
                objArr[2] = ProtectedSandApp.s("冷");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("冶");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 12 && i5 != 23 && i5 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.e
    public static x0 b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.e h0 h0Var, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (aVar == null) {
            a(32);
        }
        if (gVar == null) {
            a(33);
        }
        if (h0Var == null) {
            return null;
        }
        return new f0(aVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c(aVar, h0Var, fVar, null), gVar);
    }

    @d5.e
    public static x0 c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.e h0 h0Var, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (eVar == null) {
            a(34);
        }
        if (gVar == null) {
            a(35);
        }
        if (h0Var == null) {
            return null;
        }
        return new f0(eVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b(eVar, h0Var, fVar, null), gVar);
    }

    @d5.d
    public static d0 d(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (u0Var == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return j(u0Var, gVar, true, false, false);
    }

    @d5.d
    public static e0 e(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        if (u0Var == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return n(u0Var, gVar, gVar2, true, false, false, u0Var.k());
    }

    @d5.e
    public static u0 f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(26);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e a6 = y.a(e.g(eVar), kotlin.reflect.jvm.internal.impl.name.i.f25623a.i());
        if (a6 == null) {
            return null;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b6 = aVar.b();
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
        u uVar = t.f24440e;
        kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.l.f24019e;
        b.a aVar2 = b.a.SYNTHESIZED;
        c0 W0 = c0.W0(eVar, b6, e0Var, uVar, false, fVar, aVar2, eVar.k(), false, false, false, false, false, false);
        d0 d0Var = new d0(W0, aVar.b(), e0Var, uVar, false, false, false, aVar2, null, eVar.k());
        W0.c1(d0Var, null);
        d1.f26381p.getClass();
        W0.j1(i0.i(d1.f26382q, a6.m(), Collections.singletonList(new n1(eVar.E())), false), Collections.emptyList(), null, null, Collections.emptyList());
        d0Var.X0(W0.i());
        return W0;
    }

    @d5.d
    public static z0 g(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(24);
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
        g0 s12 = g0.s1(eVar, aVar.b(), kotlin.reflect.jvm.internal.impl.builtins.l.f24020f, b.a.SYNTHESIZED, eVar.k());
        g0 Y0 = s12.Y0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new l0(s12, null, 0, aVar.b(), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("凁")), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).W(), false, false, false, null, eVar.k())), eVar.E(), kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, t.f24440e);
        if (Y0 == null) {
            a(25);
        }
        return Y0;
    }

    @d5.d
    public static z0 h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(22);
        }
        g0 Y0 = g0.s1(eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), kotlin.reflect.jvm.internal.impl.builtins.l.f24018d, b.a.SYNTHESIZED, eVar.k()).Y0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).l(x1.INVARIANT, eVar.E()), kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, t.f24440e);
        if (Y0 == null) {
            a(23);
        }
        return Y0;
    }

    @d5.e
    public static x0 i(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.e h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (aVar == null) {
            a(30);
        }
        if (gVar == null) {
            a(31);
        }
        if (h0Var == null) {
            return null;
        }
        return new f0(aVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(aVar, h0Var, null), gVar);
    }

    @d5.d
    public static d0 j(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, boolean z6, boolean z7) {
        if (u0Var == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return k(u0Var, gVar, z5, z6, z7, u0Var.k());
    }

    @d5.d
    public static d0 k(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, boolean z6, boolean z7, @d5.d a1 a1Var) {
        if (u0Var == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (a1Var == null) {
            a(19);
        }
        return new d0(u0Var, gVar, u0Var.r(), u0Var.c(), z5, z6, z7, b.a.DECLARATION, null, a1Var);
    }

    @d5.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.f l(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d a1 a1Var) {
        if (eVar == null) {
            a(20);
        }
        if (a1Var == null) {
            a(21);
        }
        return new a(eVar, a1Var, false);
    }

    @d5.d
    public static e0 m(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z5, boolean z6, boolean z7, @d5.d u uVar, @d5.d a1 a1Var) {
        if (u0Var == null) {
            a(7);
        }
        if (gVar == null) {
            a(8);
        }
        if (gVar2 == null) {
            a(9);
        }
        if (uVar == null) {
            a(10);
        }
        if (a1Var == null) {
            a(11);
        }
        e0 e0Var = new e0(u0Var, gVar, u0Var.r(), uVar, z5, z6, z7, b.a.DECLARATION, null, a1Var);
        e0Var.Y0(e0.W0(e0Var, u0Var.getType(), gVar2));
        return e0Var;
    }

    @d5.d
    public static e0 n(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z5, boolean z6, boolean z7, @d5.d a1 a1Var) {
        if (u0Var == null) {
            a(3);
        }
        if (gVar == null) {
            a(4);
        }
        if (gVar2 == null) {
            a(5);
        }
        if (a1Var == null) {
            a(6);
        }
        return m(u0Var, gVar, gVar2, z5, z6, z7, u0Var.c(), a1Var);
    }

    private static boolean o(@d5.d z zVar) {
        if (zVar == null) {
            a(29);
        }
        return zVar.j() == b.a.SYNTHESIZED && e.A(zVar.b());
    }

    public static boolean p(@d5.d z zVar) {
        if (zVar == null) {
            a(28);
        }
        return zVar.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.l.f24020f) && o(zVar);
    }

    public static boolean q(@d5.d z zVar) {
        if (zVar == null) {
            a(27);
        }
        return zVar.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.l.f24018d) && o(zVar);
    }
}
