package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
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
/* loaded from: classes6.dex */
public class e extends g0 implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.a {
    public static final a.InterfaceC0274a<j1> U = new a();
    public static final a.InterfaceC0274a<Boolean> V = new b();
    static final /* synthetic */ boolean W = false;
    private c S;
    private final boolean T;

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes5.dex */
    static class a implements a.InterfaceC0274a<j1> {
        a() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes5.dex */
    static class b implements a.InterfaceC0274a<Boolean> {
        b() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes5.dex */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i5) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("䦜"), ProtectedSandApp.s("䦚"), ProtectedSandApp.s("䦛")));
        }

        c(boolean z5, boolean z6) {
            this.isStable = z5;
            this.isSynthesized = z6;
        }

        @d5.d
        public static c get(boolean z5, boolean z6) {
            c cVar = z5 ? z6 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z6 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                $$$reportNull$$$0(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@d5.d m mVar, @d5.e z0 z0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, @d5.d a1 a1Var, boolean z5) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var);
        if (mVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (fVar == null) {
            Q(2);
        }
        if (aVar == null) {
            Q(3);
        }
        if (a1Var == null) {
            Q(4);
        }
        this.S = null;
        this.T = z5;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 13 || i5 == 18 || i5 == 21) ? ProtectedSandApp.s("葆") : ProtectedSandApp.s("葅");
        Object[] objArr = new Object[(i5 == 13 || i5 == 18 || i5 == 21) ? 2 : 3];
        String s6 = ProtectedSandApp.s("葇");
        switch (i5) {
            case 1:
            case 6:
            case 16:
                objArr[0] = ProtectedSandApp.s("葓");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("葒");
                break;
            case 3:
            case 15:
                objArr[0] = ProtectedSandApp.s("葑");
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = ProtectedSandApp.s("葐");
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("葈");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("葏");
                break;
            case 10:
                objArr[0] = ProtectedSandApp.s("葎");
                break;
            case 11:
                objArr[0] = ProtectedSandApp.s("葍");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("葌");
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = s6;
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("葋");
                break;
            case 19:
                objArr[0] = ProtectedSandApp.s("葊");
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("葉");
                break;
        }
        String s7 = ProtectedSandApp.s("葔");
        String s8 = ProtectedSandApp.s("葕");
        String s9 = ProtectedSandApp.s("葖");
        if (i5 == 13) {
            objArr[1] = s9;
        } else if (i5 == 18) {
            objArr[1] = s8;
        } else if (i5 != 21) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        switch (i5) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = ProtectedSandApp.s("葘");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = s9;
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = s8;
                break;
            case 19:
            case 20:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("著");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 13 && i5 != 18 && i5 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.d
    public static e w1(@d5.d m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var, boolean z5) {
        if (mVar == null) {
            Q(5);
        }
        if (gVar == null) {
            Q(6);
        }
        if (fVar == null) {
            Q(7);
        }
        if (a1Var == null) {
            Q(8);
        }
        return new e(mVar, null, gVar, fVar, b.a.DECLARATION, a1Var, z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return this.S.isSynthesized;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public boolean X0() {
        return this.S.isStable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0
    @d5.d
    public g0 v1(@d5.e x0 x0Var, @d5.e x0 x0Var2, @d5.d List<x0> list, @d5.d List<? extends f1> list2, @d5.d List<j1> list3, @d5.e h0 h0Var, @d5.e e0 e0Var, @d5.d u uVar, @d5.e Map<? extends a.InterfaceC0274a<?>, ?> map) {
        if (list == null) {
            Q(9);
        }
        if (list2 == null) {
            Q(10);
        }
        if (list3 == null) {
            Q(11);
        }
        if (uVar == null) {
            Q(12);
        }
        g0 v12 = super.v1(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar, map);
        m1(p.f26606a.a(v12).a());
        if (v12 == null) {
            Q(13);
        }
        return v12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.d
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public e S0(@d5.d m mVar, @d5.e z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        if (mVar == null) {
            Q(14);
        }
        if (aVar == null) {
            Q(15);
        }
        if (gVar == null) {
            Q(16);
        }
        if (a1Var == null) {
            Q(17);
        }
        z0 z0Var = (z0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(mVar, z0Var, gVar, fVar, aVar, a1Var, this.T);
        eVar.z1(X0(), P());
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @d5.d
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public e K(@d5.e h0 h0Var, @d5.d List<h0> list, @d5.d h0 h0Var2, @d5.e Pair<a.InterfaceC0274a<?>, ?> pair) {
        if (list == null) {
            Q(19);
        }
        if (h0Var2 == null) {
            Q(20);
        }
        e eVar = (e) F().b(h.a(list, n(), this)).f(h0Var2).j(h0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.d.i(this, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b())).a().e().build();
        if (pair != null) {
            eVar.b1(pair.e(), pair.f());
        }
        if (eVar == null) {
            Q(21);
        }
        return eVar;
    }

    public void z1(boolean z5, boolean z6) {
        this.S = c.get(z5, z6);
    }
}
