package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeParameterDescriptorImpl.java */
/* loaded from: classes6.dex */
public class k0 extends e {
    private boolean A;

    /* renamed from: y, reason: collision with root package name */
    @d5.e
    private final q3.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> f24215y;

    /* renamed from: z, reason: collision with root package name */
    private final List<kotlin.reflect.jvm.internal.impl.types.h0> f24216z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d x1 x1Var, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i5, @d5.d a1 a1Var, @d5.e q3.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> lVar, @d5.d d1 d1Var, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar, mVar, gVar, fVar, x1Var, z5, i5, a1Var, d1Var);
        if (mVar == null) {
            Q(19);
        }
        if (gVar == null) {
            Q(20);
        }
        if (x1Var == null) {
            Q(21);
        }
        if (fVar == null) {
            Q(22);
        }
        if (a1Var == null) {
            Q(23);
        }
        if (d1Var == null) {
            Q(24);
        }
        if (nVar == null) {
            Q(25);
        }
        this.f24216z = new ArrayList(1);
        this.A = false;
        this.f24215y = lVar;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 5 || i5 == 28) ? ProtectedSandApp.s("艥") : ProtectedSandApp.s("艤");
        Object[] objArr = new Object[(i5 == 5 || i5 == 28) ? 2 : 3];
        String s6 = ProtectedSandApp.s("艦");
        switch (i5) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = ProtectedSandApp.s("艰");
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = ProtectedSandApp.s("良");
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = ProtectedSandApp.s("艮");
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = ProtectedSandApp.s("艭");
                break;
            case 5:
            case 28:
                objArr[0] = s6;
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = ProtectedSandApp.s("艧");
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = ProtectedSandApp.s("艬");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("艫");
                break;
            case 24:
                objArr[0] = ProtectedSandApp.s("艪");
                break;
            case 26:
                objArr[0] = ProtectedSandApp.s("艩");
                break;
            case 27:
                objArr[0] = ProtectedSandApp.s("艨");
                break;
        }
        String s7 = ProtectedSandApp.s("艱");
        if (i5 == 5) {
            objArr[1] = s7;
        } else if (i5 != 28) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("色");
        }
        switch (i5) {
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
                objArr[2] = ProtectedSandApp.s("艶");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = ProtectedSandApp.s("艵");
                break;
            case 26:
                objArr[2] = ProtectedSandApp.s("艴");
                break;
            case 27:
                objArr[2] = ProtectedSandApp.s("艳");
                break;
            default:
                objArr[2] = s7;
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 5 && i5 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    private void U0() {
        if (this.A) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("艷") + b1());
    }

    private void V0() {
        if (this.A) {
            throw new IllegalStateException(ProtectedSandApp.s("艸") + b1());
        }
    }

    public static k0 W0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d x1 x1Var, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i5, @d5.d a1 a1Var, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (mVar == null) {
            Q(6);
        }
        if (gVar == null) {
            Q(7);
        }
        if (x1Var == null) {
            Q(8);
        }
        if (fVar == null) {
            Q(9);
        }
        if (a1Var == null) {
            Q(10);
        }
        if (nVar == null) {
            Q(11);
        }
        return X0(mVar, gVar, z5, x1Var, fVar, i5, a1Var, null, d1.a.f24134a, nVar);
    }

    public static k0 X0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d x1 x1Var, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i5, @d5.d a1 a1Var, @d5.e q3.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> lVar, @d5.d d1 d1Var, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (mVar == null) {
            Q(12);
        }
        if (gVar == null) {
            Q(13);
        }
        if (x1Var == null) {
            Q(14);
        }
        if (fVar == null) {
            Q(15);
        }
        if (a1Var == null) {
            Q(16);
        }
        if (d1Var == null) {
            Q(17);
        }
        if (nVar == null) {
            Q(18);
        }
        return new k0(mVar, gVar, z5, x1Var, fVar, i5, a1Var, lVar, d1Var, nVar);
    }

    @d5.d
    public static f1 Y0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d x1 x1Var, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i5, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (mVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (x1Var == null) {
            Q(2);
        }
        if (fVar == null) {
            Q(3);
        }
        if (nVar == null) {
            Q(4);
        }
        k0 W0 = W0(mVar, gVar, z5, x1Var, fVar, i5, a1.f24103a, nVar);
        W0.T0(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(mVar).y());
        W0.c1();
        return W0;
    }

    private void Z0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (kotlin.reflect.jvm.internal.impl.types.j0.a(h0Var)) {
            return;
        }
        this.f24216z.add(h0Var);
    }

    private String b1() {
        return getName() + ProtectedSandApp.s("艹") + kotlin.reflect.jvm.internal.impl.resolve.e.m(b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    protected void R0(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            Q(27);
        }
        q3.l<kotlin.reflect.jvm.internal.impl.types.h0, Void> lVar = this.f24215y;
        if (lVar == null) {
            return;
        }
        lVar.N(h0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @d5.d
    protected List<kotlin.reflect.jvm.internal.impl.types.h0> S0() {
        U0();
        List<kotlin.reflect.jvm.internal.impl.types.h0> list = this.f24216z;
        if (list == null) {
            Q(28);
        }
        return list;
    }

    public void T0(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            Q(26);
        }
        V0();
        Z0(h0Var);
    }

    public boolean a1() {
        return this.A;
    }

    public void c1() {
        V0();
        this.A = true;
    }
}
