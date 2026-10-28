package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class g0 extends p implements z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected g0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e z0 z0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, @d5.d a1 a1Var) {
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
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 13 || i5 == 18 || i5 == 23 || i5 == 24 || i5 == 29 || i5 == 30) ? ProtectedSandApp.s("肶") : ProtectedSandApp.s("肵");
        Object[] objArr = new Object[(i5 == 13 || i5 == 18 || i5 == 23 || i5 == 24 || i5 == 29 || i5 == 30) ? 2 : 3];
        String s6 = ProtectedSandApp.s("肷");
        switch (i5) {
            case 1:
            case 6:
            case 27:
                objArr[0] = ProtectedSandApp.s("胁");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("胀");
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = ProtectedSandApp.s("肿");
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = ProtectedSandApp.s("肾");
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("肸");
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = ProtectedSandApp.s("肽");
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = ProtectedSandApp.s("肼");
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = ProtectedSandApp.s("肻");
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = s6;
                break;
            case 14:
            case 19:
                objArr[0] = ProtectedSandApp.s("肺");
                break;
            case 25:
                objArr[0] = ProtectedSandApp.s("肹");
                break;
        }
        String s7 = ProtectedSandApp.s("胂");
        if (i5 == 13 || i5 == 18 || i5 == 23) {
            objArr[1] = s7;
        } else if (i5 == 24) {
            objArr[1] = ProtectedSandApp.s("胅");
        } else if (i5 == 29) {
            objArr[1] = ProtectedSandApp.s("胄");
        } else if (i5 != 30) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("胃");
        }
        switch (i5) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("胈");
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
                objArr[2] = s7;
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
                objArr[2] = ProtectedSandApp.s("胇");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("胆");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 13 && i5 != 18 && i5 != 23 && i5 != 24 && i5 != 29 && i5 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.d
    public static g0 s1(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, @d5.d a1 a1Var) {
        if (mVar == null) {
            Q(5);
        }
        if (gVar == null) {
            Q(6);
        }
        if (fVar == null) {
            Q(7);
        }
        if (aVar == null) {
            Q(8);
        }
        if (a1Var == null) {
            Q(9);
        }
        return new g0(mVar, null, gVar, fVar, aVar, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    @d5.d
    public z.a<? extends z0> F() {
        z.a F = super.F();
        if (F == null) {
            Q(30);
        }
        return F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.d
    protected p S0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        if (mVar == null) {
            Q(25);
        }
        if (aVar == null) {
            Q(26);
        }
        if (gVar == null) {
            Q(27);
        }
        if (a1Var == null) {
            Q(28);
        }
        z0 z0Var = (z0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new g0(mVar, z0Var, gVar, fVar, aVar, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public z0 r0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z5) {
        z0 z0Var = (z0) super.r0(mVar, e0Var, uVar, aVar, z5);
        if (z0Var == null) {
            Q(29);
        }
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public z0 a() {
        z0 z0Var = (z0) super.a();
        if (z0Var == null) {
            Q(24);
        }
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.d
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public g0 Y0(@d5.e x0 x0Var, @d5.e x0 x0Var2, @d5.d List<x0> list, @d5.d List<? extends f1> list2, @d5.d List<j1> list3, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (list == null) {
            Q(14);
        }
        if (list2 == null) {
            Q(15);
        }
        if (list3 == null) {
            Q(16);
        }
        if (uVar == null) {
            Q(17);
        }
        g0 v12 = v1(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar, null);
        if (v12 == null) {
            Q(18);
        }
        return v12;
    }

    @d5.d
    public g0 v1(@d5.e x0 x0Var, @d5.e x0 x0Var2, @d5.d List<x0> list, @d5.d List<? extends f1> list2, @d5.d List<j1> list3, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @d5.e Map<? extends a.InterfaceC0274a<?>, ?> map) {
        if (list == null) {
            Q(19);
        }
        if (list2 == null) {
            Q(20);
        }
        if (list3 == null) {
            Q(21);
        }
        if (uVar == null) {
            Q(22);
        }
        super.Y0(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar);
        if (map != null && !map.isEmpty()) {
            this.R = new LinkedHashMap(map);
        }
        return this;
    }
}
