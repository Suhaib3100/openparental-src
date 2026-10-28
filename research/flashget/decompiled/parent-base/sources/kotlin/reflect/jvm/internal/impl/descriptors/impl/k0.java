package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeParameterDescriptorImpl.java */
/* loaded from: classes7.dex */
public class k0 extends e {

    /* renamed from: l, reason: collision with root package name */
    @fg.m
    private final ld.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> f76040l;

    /* renamed from: m, reason: collision with root package name */
    private final List<kotlin.reflect.jvm.internal.impl.types.h0> f76041m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f76042n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @fg.l x1 x1Var, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, int i4, @fg.l a1 a1Var, @fg.m ld.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> lVar, @fg.l d1 d1Var, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar, mVar, gVar, fVar, x1Var, z4, i4, a1Var, d1Var);
        if (mVar == null) {
            j0(19);
        }
        if (gVar == null) {
            j0(20);
        }
        if (x1Var == null) {
            j0(21);
        }
        if (fVar == null) {
            j0(22);
        }
        if (a1Var == null) {
            j0(23);
        }
        if (d1Var == null) {
            j0(24);
        }
        if (nVar == null) {
            j0(25);
        }
        this.f76041m = new ArrayList(1);
        this.f76042n = false;
        this.f76040l = lVar;
    }

    private void O0() {
        if (this.f76042n) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("泷\u0001") + V0());
    }

    private void P0() {
        if (this.f76042n) {
            throw new IllegalStateException(ProtectedSandApp.s("泸\u0001") + V0());
        }
    }

    public static k0 Q0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @fg.l x1 x1Var, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, int i4, @fg.l a1 a1Var, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (mVar == null) {
            j0(6);
        }
        if (gVar == null) {
            j0(7);
        }
        if (x1Var == null) {
            j0(8);
        }
        if (fVar == null) {
            j0(9);
        }
        if (a1Var == null) {
            j0(10);
        }
        if (nVar == null) {
            j0(11);
        }
        return R0(mVar, gVar, z4, x1Var, fVar, i4, a1Var, null, d1.a.f75932a, nVar);
    }

    public static k0 R0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @fg.l x1 x1Var, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, int i4, @fg.l a1 a1Var, @fg.m ld.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> lVar, @fg.l d1 d1Var, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (mVar == null) {
            j0(12);
        }
        if (gVar == null) {
            j0(13);
        }
        if (x1Var == null) {
            j0(14);
        }
        if (fVar == null) {
            j0(15);
        }
        if (a1Var == null) {
            j0(16);
        }
        if (d1Var == null) {
            j0(17);
        }
        if (nVar == null) {
            j0(18);
        }
        return new k0(mVar, gVar, z4, x1Var, fVar, i4, a1Var, lVar, d1Var, nVar);
    }

    @fg.l
    public static f1 S0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @fg.l x1 x1Var, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, int i4, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (mVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (x1Var == null) {
            j0(2);
        }
        if (fVar == null) {
            j0(3);
        }
        if (nVar == null) {
            j0(4);
        }
        k0 Q0 = Q0(mVar, gVar, z4, x1Var, fVar, i4, a1.f75900a, nVar);
        Q0.N0(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(mVar).y());
        Q0.W0();
        return Q0;
    }

    private void T0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (kotlin.reflect.jvm.internal.impl.types.j0.a(h0Var)) {
            return;
        }
        this.f76041m.add(h0Var);
    }

    private String V0() {
        return getName() + ProtectedSandApp.s("泹\u0001") + kotlin.reflect.jvm.internal.impl.resolve.f.m(c());
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 5 || i4 == 28) ? ProtectedSandApp.s("泻\u0001") : ProtectedSandApp.s("泺\u0001");
        Object[] objArr = new Object[(i4 == 5 || i4 == 28) ? 2 : 3];
        String s5 = ProtectedSandApp.s("泼\u0001");
        switch (i4) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = ProtectedSandApp.s("洆\u0001");
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = ProtectedSandApp.s("洅\u0001");
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = ProtectedSandApp.s("洄\u0001");
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = ProtectedSandApp.s("洃\u0001");
                break;
            case 5:
            case 28:
                objArr[0] = s5;
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = ProtectedSandApp.s("泽\u0001");
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = ProtectedSandApp.s("洂\u0001");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("洁\u0001");
                break;
            case 24:
                objArr[0] = ProtectedSandApp.s("洀\u0001");
                break;
            case 26:
                objArr[0] = ProtectedSandApp.s("泿\u0001");
                break;
            case 27:
                objArr[0] = ProtectedSandApp.s("泾\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("洇\u0001");
        if (i4 == 5) {
            objArr[1] = s6;
        } else if (i4 != 28) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("洈\u0001");
        }
        switch (i4) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = ProtectedSandApp.s("洌\u0001");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = ProtectedSandApp.s("洋\u0001");
                break;
            case 26:
                objArr[2] = ProtectedSandApp.s("洊\u0001");
                break;
            case 27:
                objArr[2] = ProtectedSandApp.s("洉\u0001");
                break;
            default:
                objArr[2] = s6;
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 5 && i4 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    protected void L0(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            j0(27);
        }
        ld.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> lVar = this.f76040l;
        if (lVar == null) {
            return;
        }
        lVar.invoke(h0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @fg.l
    protected List<kotlin.reflect.jvm.internal.impl.types.h0> M0() {
        O0();
        List<kotlin.reflect.jvm.internal.impl.types.h0> list = this.f76041m;
        if (list == null) {
            j0(28);
        }
        return list;
    }

    public void N0(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            j0(26);
        }
        P0();
        T0(h0Var);
    }

    public boolean U0() {
        return this.f76042n;
    }

    public void W0() {
        P0();
        this.f76042n = true;
    }
}
