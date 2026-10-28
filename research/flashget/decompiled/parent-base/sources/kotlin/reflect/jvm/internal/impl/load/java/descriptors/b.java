package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.collections.j0;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: JavaClassConstructorDescriptor.java */
/* loaded from: classes7.dex */
public class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f implements a {
    static final /* synthetic */ boolean J = false;
    private Boolean H;
    private Boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(@l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m b bVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @l b.a aVar, @l a1 a1Var) {
        super(eVar, bVar, gVar, z4, aVar, a1Var);
        if (eVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (aVar == null) {
            j0(2);
        }
        if (a1Var == null) {
            j0(3);
        }
        this.H = null;
        this.I = null;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 11 || i4 == 18) ? ProtectedSandApp.s("瀿\u0001") : ProtectedSandApp.s("瀾\u0001");
        Object[] objArr = new Object[(i4 == 11 || i4 == 18) ? 2 : 3];
        String s5 = ProtectedSandApp.s("灀\u0001");
        switch (i4) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = ProtectedSandApp.s("灈\u0001");
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = ProtectedSandApp.s("灇\u0001");
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = ProtectedSandApp.s("灆\u0001");
                break;
            case 4:
            default:
                objArr[0] = ProtectedSandApp.s("灁\u0001");
                break;
            case 7:
            case 12:
                objArr[0] = ProtectedSandApp.s("灅\u0001");
                break;
            case 11:
            case 18:
                objArr[0] = s5;
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("灄\u0001");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("灃\u0001");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("灂\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("灉\u0001");
        String s7 = ProtectedSandApp.s("灊\u0001");
        if (i4 == 11) {
            objArr[1] = s6;
        } else if (i4 != 18) {
            objArr[1] = s5;
        } else {
            objArr[1] = s7;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
                objArr[2] = ProtectedSandApp.s("灍\u0001");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = s6;
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = ProtectedSandApp.s("灌\u0001");
                break;
            case 16:
            case 17:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("灋\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 11 && i4 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @l
    public static b u1(@l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @l a1 a1Var) {
        if (eVar == null) {
            j0(4);
        }
        if (gVar == null) {
            j0(5);
        }
        if (a1Var == null) {
            j0(6);
        }
        return new b(eVar, null, gVar, z4, b.a.DECLARATION, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public boolean R0() {
        return this.H.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public void Z0(boolean z4) {
        this.H = Boolean.valueOf(z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public void a1(boolean z4) {
        this.I = Boolean.valueOf(z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return this.I.booleanValue();
    }

    @l
    protected b t1(@l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m b bVar, @l b.a aVar, @l a1 a1Var, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (eVar == null) {
            j0(12);
        }
        if (aVar == null) {
            j0(13);
        }
        if (a1Var == null) {
            j0(14);
        }
        if (gVar == null) {
            j0(15);
        }
        return new b(eVar, bVar, gVar, this.F, aVar, a1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.f
    @l
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b M0(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @m z zVar, @l b.a aVar, @m kotlin.reflect.jvm.internal.impl.name.f fVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l a1 a1Var) {
        if (mVar == null) {
            j0(7);
        }
        if (aVar == null) {
            j0(8);
        }
        if (gVar == null) {
            j0(9);
        }
        if (a1Var == null) {
            j0(10);
        }
        if (aVar == b.a.DECLARATION || aVar == b.a.SYNTHESIZED) {
            b t12 = t1((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, (b) zVar, aVar, a1Var, gVar);
            t12.Z0(R0());
            t12.a1(i0());
            return t12;
        }
        throw new IllegalStateException(ProtectedSandApp.s("灎\u0001") + this + ProtectedSandApp.s("灏\u0001") + mVar + ProtectedSandApp.s("灐\u0001") + aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @l
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b d0(@m h0 h0Var, @l List<h0> list, @l h0 h0Var2, @m q0<a.InterfaceC1077a<?>, ?> q0Var) {
        if (list == null) {
            j0(16);
        }
        if (h0Var2 == null) {
            j0(17);
        }
        b M0 = M0(c(), null, b(), null, getAnnotations(), f());
        M0.S0(h0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.e.i(M0, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b()), O(), j0.f74919b, getTypeParameters(), h.a(list, i(), M0), h0Var2, u(), getVisibility());
        if (q0Var != null) {
            M0.V0(q0Var.e(), q0Var.f());
        }
        return M0;
    }
}
