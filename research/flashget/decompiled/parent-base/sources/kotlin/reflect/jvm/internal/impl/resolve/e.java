package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: DescriptorFactory.java */
/* loaded from: classes7.dex */
public class e {

    /* compiled from: DescriptorFactory.java */
    private static class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l a1 a1Var, boolean z4) {
            super(eVar, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), true, b.a.DECLARATION, a1Var);
            if (eVar == null) {
                j0(0);
            }
            if (a1Var == null) {
                j0(1);
            }
            r1(Collections.emptyList(), f.k(eVar, z4));
        }

        private static /* synthetic */ void j0(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("礓\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("礔\u0001");
            }
            objArr[1] = ProtectedSandApp.s("礕\u0001");
            objArr[2] = ProtectedSandApp.s("礖\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("礗\u0001"), objArr));
        }
    }

    private static /* synthetic */ void a(int i4) {
        String s4 = (i4 == 12 || i4 == 23 || i4 == 25) ? ProtectedSandApp.s("礙\u0001") : ProtectedSandApp.s("礘\u0001");
        Object[] objArr = new Object[(i4 == 12 || i4 == 23 || i4 == 25) ? 2 : 3];
        String s5 = ProtectedSandApp.s("礚\u0001");
        switch (i4) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = ProtectedSandApp.s("礤\u0001");
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = ProtectedSandApp.s("礣\u0001");
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = ProtectedSandApp.s("礛\u0001");
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = ProtectedSandApp.s("礢\u0001");
                break;
            case 10:
                objArr[0] = ProtectedSandApp.s("礡\u0001");
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = s5;
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("礠\u0001");
                break;
            case 21:
                objArr[0] = ProtectedSandApp.s("礟\u0001");
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = ProtectedSandApp.s("礞\u0001");
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = ProtectedSandApp.s("礝\u0001");
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = ProtectedSandApp.s("礜\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("礥\u0001");
        String s7 = ProtectedSandApp.s("礦\u0001");
        String s10 = ProtectedSandApp.s("礧\u0001");
        if (i4 == 12) {
            objArr[1] = s6;
        } else if (i4 == 23) {
            objArr[1] = s7;
        } else if (i4 != 25) {
            objArr[1] = s5;
        } else {
            objArr[1] = s10;
        }
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = s6;
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = ProtectedSandApp.s("礲\u0001");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = ProtectedSandApp.s("礱\u0001");
                break;
            case 20:
            case 21:
                objArr[2] = ProtectedSandApp.s("礰\u0001");
                break;
            case 22:
                objArr[2] = s7;
                break;
            case 24:
                objArr[2] = s10;
                break;
            case 26:
                objArr[2] = ProtectedSandApp.s("礯\u0001");
                break;
            case 27:
                objArr[2] = ProtectedSandApp.s("礮\u0001");
                break;
            case 28:
                objArr[2] = ProtectedSandApp.s("礭\u0001");
                break;
            case 29:
                objArr[2] = ProtectedSandApp.s("礬\u0001");
                break;
            case 30:
            case 31:
                objArr[2] = ProtectedSandApp.s("礫\u0001");
                break;
            case 32:
            case 33:
                objArr[2] = ProtectedSandApp.s("礪\u0001");
                break;
            case 34:
            case 35:
                objArr[2] = ProtectedSandApp.s("礩\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("礨\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 12 && i4 != 23 && i4 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @fg.m
    public static x0 b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.m h0 h0Var, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, int i4) {
        if (aVar == null) {
            a(32);
        }
        if (gVar == null) {
            a(33);
        }
        if (h0Var == null) {
            return null;
        }
        return new f0(aVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c(aVar, h0Var, fVar, null), gVar, kotlin.reflect.jvm.internal.impl.name.g.a(i4));
    }

    @fg.m
    public static x0 c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.m h0 h0Var, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, int i4) {
        if (eVar == null) {
            a(34);
        }
        if (gVar == null) {
            a(35);
        }
        if (h0Var == null) {
            return null;
        }
        return new f0(eVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b(eVar, h0Var, fVar, null), gVar, kotlin.reflect.jvm.internal.impl.name.g.a(i4));
    }

    @fg.l
    public static d0 d(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (u0Var == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return j(u0Var, gVar, true, false, false);
    }

    @fg.l
    public static e0 e(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        if (u0Var == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return n(u0Var, gVar, gVar2, true, false, false, u0Var.f());
    }

    @fg.m
    public static u0 f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(26);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h0 g4 = f.g(eVar);
        kotlin.reflect.jvm.internal.impl.descriptors.e a5 = s.a(g4).a(g4);
        if (a5 == null) {
            return null;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b5 = aVar.b();
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
        u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e;
        kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.l.f75816e;
        b.a aVar2 = b.a.SYNTHESIZED;
        c0 Q0 = c0.Q0(eVar, b5, e0Var, uVar, false, fVar, aVar2, eVar.f(), false, false, false, false, false, false);
        d0 d0Var = new d0(Q0, aVar.b(), e0Var, uVar, false, false, false, aVar2, null, eVar.f());
        Q0.W0(d0Var, null);
        d1.f78389c.getClass();
        Q0.d1(i0.i(d1.f78390d, a5.j(), Collections.singletonList(new n1(eVar.r())), false), Collections.emptyList(), null, null, Collections.emptyList());
        d0Var.R0(Q0.getReturnType());
        return Q0;
    }

    @fg.l
    public static z0 g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(24);
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2;
        g0 m12 = g0.m1(eVar, aVar.b(), kotlin.reflect.jvm.internal.impl.builtins.l.f75817f, b.a.SYNTHESIZED, eVar.f());
        g0 S0 = m12.S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new l0(m12, null, 0, aVar.b(), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("礳\u0001")), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).W(), false, false, false, null, eVar.f())), eVar.r(), kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e);
        if (S0 == null) {
            a(25);
        }
        return S0;
    }

    @fg.l
    public static z0 h(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(22);
        }
        g0 S0 = g0.m1(eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), kotlin.reflect.jvm.internal.impl.builtins.l.f75815d, b.a.SYNTHESIZED, eVar.f()).S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(eVar).l(x1.INVARIANT, eVar.r()), kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e);
        if (S0 == null) {
            a(23);
        }
        return S0;
    }

    @fg.m
    public static x0 i(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.m h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
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

    @fg.l
    public static d0 j(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, boolean z5, boolean z6) {
        if (u0Var == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return k(u0Var, gVar, z4, z5, z6, u0Var.f());
    }

    @fg.l
    public static d0 k(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, boolean z5, boolean z6, @fg.l a1 a1Var) {
        if (u0Var == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (a1Var == null) {
            a(19);
        }
        return new d0(u0Var, gVar, u0Var.u(), u0Var.getVisibility(), z4, z5, z6, b.a.DECLARATION, null, a1Var);
    }

    @fg.l
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.f l(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l a1 a1Var) {
        if (eVar == null) {
            a(20);
        }
        if (a1Var == null) {
            a(21);
        }
        return new a(eVar, a1Var, false);
    }

    @fg.l
    public static e0 m(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z4, boolean z5, boolean z6, @fg.l u uVar, @fg.l a1 a1Var) {
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
        e0 e0Var = new e0(u0Var, gVar, u0Var.u(), uVar, z4, z5, z6, b.a.DECLARATION, null, a1Var);
        e0Var.S0(e0.Q0(e0Var, u0Var.getType(), gVar2));
        return e0Var;
    }

    @fg.l
    public static e0 n(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z4, boolean z5, boolean z6, @fg.l a1 a1Var) {
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
        return m(u0Var, gVar, gVar2, z4, z5, z6, u0Var.getVisibility(), a1Var);
    }

    private static boolean o(@fg.l z zVar) {
        if (zVar == null) {
            a(29);
        }
        return zVar.b() == b.a.SYNTHESIZED && f.A(zVar.c());
    }

    public static boolean p(@fg.l z zVar) {
        if (zVar == null) {
            a(28);
        }
        return zVar.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.l.f75817f) && o(zVar);
    }

    public static boolean q(@fg.l z zVar) {
        if (zVar == null) {
            a(27);
        }
        return zVar.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.l.f75815d) && o(zVar);
    }
}
