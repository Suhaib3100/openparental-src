package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: SimpleFunctionDescriptorImpl.java */
/* loaded from: classes7.dex */
public class g0 extends p implements z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected g0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m z0 z0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l b.a aVar, @fg.l a1 a1Var) {
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
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 13 || i4 == 18 || i4 == 23 || i4 == 24 || i4 == 29 || i4 == 30) ? ProtectedSandApp.s("棄\u0001") : ProtectedSandApp.s("棃\u0001");
        Object[] objArr = new Object[(i4 == 13 || i4 == 18 || i4 == 23 || i4 == 24 || i4 == 29 || i4 == 30) ? 2 : 3];
        String s5 = ProtectedSandApp.s("棅\u0001");
        switch (i4) {
            case 1:
            case 6:
            case 27:
                objArr[0] = ProtectedSandApp.s("棏\u0001");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("棎\u0001");
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = ProtectedSandApp.s("棍\u0001");
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = ProtectedSandApp.s("棌\u0001");
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("棆\u0001");
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = ProtectedSandApp.s("棋\u0001");
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = ProtectedSandApp.s("棊\u0001");
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = ProtectedSandApp.s("棉\u0001");
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = s5;
                break;
            case 14:
            case 19:
                objArr[0] = ProtectedSandApp.s("棈\u0001");
                break;
            case 25:
                objArr[0] = ProtectedSandApp.s("棇\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("棐\u0001");
        if (i4 == 13 || i4 == 18 || i4 == 23) {
            objArr[1] = s6;
        } else if (i4 == 24) {
            objArr[1] = ProtectedSandApp.s("棓\u0001");
        } else if (i4 == 29) {
            objArr[1] = ProtectedSandApp.s("棒\u0001");
        } else if (i4 != 30) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("棑\u0001");
        }
        switch (i4) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("棖\u0001");
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = s6;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = ProtectedSandApp.s("棕\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("棔\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 13 && i4 != 18 && i4 != 23 && i4 != 24 && i4 != 29 && i4 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @fg.l
    public static g0 m1(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l b.a aVar, @fg.l a1 a1Var) {
        if (mVar == null) {
            j0(5);
        }
        if (gVar == null) {
            j0(6);
        }
        if (fVar == null) {
            j0(7);
        }
        if (aVar == null) {
            j0(8);
        }
        if (a1Var == null) {
            j0(9);
        }
        return new g0(mVar, null, gVar, fVar, aVar, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    @fg.l
    public z.a<? extends z0> A() {
        z.a A = super.A();
        if (A == null) {
            j0(30);
        }
        return A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @fg.l
    protected p M0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var) {
        if (mVar == null) {
            j0(25);
        }
        if (aVar == null) {
            j0(26);
        }
        if (gVar == null) {
            j0(27);
        }
        if (a1Var == null) {
            j0(28);
        }
        z0 z0Var = (z0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new g0(mVar, z0Var, gVar, fVar, aVar, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public z0 R(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z4) {
        z0 z0Var = (z0) super.R(mVar, e0Var, uVar, aVar, z4);
        if (z0Var == null) {
            j0(29);
        }
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public z0 a() {
        z0 z0Var = (z0) super.a();
        if (z0Var == null) {
            j0(24);
        }
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @fg.l
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public g0 S0(@fg.m x0 x0Var, @fg.m x0 x0Var2, @fg.l List<x0> list, @fg.l List<? extends f1> list2, @fg.l List<j1> list3, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (list == null) {
            j0(14);
        }
        if (list2 == null) {
            j0(15);
        }
        if (list3 == null) {
            j0(16);
        }
        if (uVar == null) {
            j0(17);
        }
        g0 p12 = p1(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar, null);
        if (p12 == null) {
            j0(18);
        }
        return p12;
    }

    @fg.l
    public g0 p1(@fg.m x0 x0Var, @fg.m x0 x0Var2, @fg.l List<x0> list, @fg.l List<? extends f1> list2, @fg.l List<j1> list3, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @fg.m Map<? extends a.InterfaceC1077a<?>, ?> map) {
        if (list == null) {
            j0(19);
        }
        if (list2 == null) {
            j0(20);
        }
        if (list3 == null) {
            j0(21);
        }
        if (uVar == null) {
            j0(22);
        }
        super.S0(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar);
        if (map != null && !map.isEmpty()) {
            this.E = new LinkedHashMap(map);
        }
        return this;
    }
}
