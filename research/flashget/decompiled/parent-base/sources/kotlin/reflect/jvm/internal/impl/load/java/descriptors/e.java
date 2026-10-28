package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import java.util.Map;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.util.p;

/* compiled from: JavaMethodDescriptor.java */
/* loaded from: classes7.dex */
public class e extends g0 implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.a {
    public static final a.InterfaceC1077a<j1> H = new a();
    public static final a.InterfaceC1077a<Boolean> I = new b();
    static final /* synthetic */ boolean J = false;
    private c F;
    private final boolean G;

    /* compiled from: JavaMethodDescriptor.java */
    static class a implements a.InterfaceC1077a<j1> {
        a() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    static class b implements a.InterfaceC1077a<Boolean> {
        b() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i4) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("灬\u0001"), ProtectedSandApp.s("灪\u0001"), ProtectedSandApp.s("火\u0001")));
        }

        c(boolean z4, boolean z5) {
            this.isStable = z4;
            this.isSynthesized = z5;
        }

        @l
        public static c get(boolean z4, boolean z5) {
            c cVar = z4 ? z5 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z5 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                $$$reportNull$$$0(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@l m mVar, @fg.m z0 z0Var, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l b.a aVar, @l a1 a1Var, boolean z4) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var);
        if (mVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (fVar == null) {
            j0(2);
        }
        if (aVar == null) {
            j0(3);
        }
        if (a1Var == null) {
            j0(4);
        }
        this.F = null;
        this.G = z4;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 13 || i4 == 18 || i4 == 21) ? ProtectedSandApp.s("灲\u0001") : ProtectedSandApp.s("灱\u0001");
        Object[] objArr = new Object[(i4 == 13 || i4 == 18 || i4 == 21) ? 2 : 3];
        String s5 = ProtectedSandApp.s("灳\u0001");
        switch (i4) {
            case 1:
            case 6:
            case 16:
                objArr[0] = ProtectedSandApp.s("灿\u0001");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("灾\u0001");
                break;
            case 3:
            case 15:
                objArr[0] = ProtectedSandApp.s("災\u0001");
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = ProtectedSandApp.s("灼\u0001");
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("灴\u0001");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("灻\u0001");
                break;
            case 10:
                objArr[0] = ProtectedSandApp.s("灺\u0001");
                break;
            case 11:
                objArr[0] = ProtectedSandApp.s("灹\u0001");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("灸\u0001");
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = s5;
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("灷\u0001");
                break;
            case 19:
                objArr[0] = ProtectedSandApp.s("灶\u0001");
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("灵\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("炀\u0001");
        String s7 = ProtectedSandApp.s("炁\u0001");
        String s10 = ProtectedSandApp.s("炂\u0001");
        if (i4 == 13) {
            objArr[1] = s6;
        } else if (i4 == 18) {
            objArr[1] = s7;
        } else if (i4 != 21) {
            objArr[1] = s5;
        } else {
            objArr[1] = s10;
        }
        switch (i4) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = ProtectedSandApp.s("炄\u0001");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = s6;
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = s7;
                break;
            case 19:
            case 20:
                objArr[2] = s10;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("炃\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 13 && i4 != 18 && i4 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @l
    public static e q1(@l m mVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l a1 a1Var, boolean z4) {
        if (mVar == null) {
            j0(5);
        }
        if (gVar == null) {
            j0(6);
        }
        if (fVar == null) {
            j0(7);
        }
        if (a1Var == null) {
            j0(8);
        }
        return new e(mVar, null, gVar, fVar, b.a.DECLARATION, a1Var, z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public boolean R0() {
        return this.F.isStable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return this.F.isSynthesized;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0
    @l
    public g0 p1(@fg.m x0 x0Var, @fg.m x0 x0Var2, @l List<x0> list, @l List<? extends f1> list2, @l List<j1> list3, @fg.m h0 h0Var, @fg.m e0 e0Var, @l u uVar, @fg.m Map<? extends a.InterfaceC1077a<?>, ?> map) {
        if (list == null) {
            j0(9);
        }
        if (list2 == null) {
            j0(10);
        }
        if (list3 == null) {
            j0(11);
        }
        if (uVar == null) {
            j0(12);
        }
        g0 p12 = super.p1(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar, map);
        g1(p.f78614a.a(p12).a());
        if (p12 == null) {
            j0(13);
        }
        return p12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @l
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public e M0(@l m mVar, @fg.m z zVar, @l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l a1 a1Var) {
        if (mVar == null) {
            j0(14);
        }
        if (aVar == null) {
            j0(15);
        }
        if (gVar == null) {
            j0(16);
        }
        if (a1Var == null) {
            j0(17);
        }
        z0 z0Var = (z0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(mVar, z0Var, gVar, fVar, aVar, a1Var, this.G);
        eVar.t1(R0(), i0());
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @l
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public e d0(@fg.m h0 h0Var, @l List<h0> list, @l h0 h0Var2, @fg.m q0<a.InterfaceC1077a<?>, ?> q0Var) {
        if (list == null) {
            j0(19);
        }
        if (h0Var2 == null) {
            j0(20);
        }
        e eVar = (e) A().c(h.a(list, i(), this)).n(h0Var2).f(h0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.e.i(this, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b())).b().m().a();
        if (q0Var != null) {
            eVar.V0(q0Var.e(), q0Var.f());
        }
        if (eVar == null) {
            j0(21);
        }
        return eVar;
    }

    public void t1(boolean z4, boolean z5) {
        this.F = c.get(z4, z5);
    }
}
