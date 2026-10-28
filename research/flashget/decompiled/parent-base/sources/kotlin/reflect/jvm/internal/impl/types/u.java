package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.o1.c;

/* compiled from: DescriptorSubstitutor.java */
/* loaded from: classes7.dex */
public class u {
    private static /* synthetic */ void a(int i4) {
        String s4 = i4 != 4 ? ProtectedSandApp.s("聲\u0001") : ProtectedSandApp.s("聳\u0001");
        Object[] objArr = new Object[i4 != 4 ? 3 : 2];
        String s5 = ProtectedSandApp.s("聴\u0001");
        switch (i4) {
            case 1:
            case 6:
                objArr[0] = ProtectedSandApp.s("聸\u0001");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("職\u0001");
                break;
            case 3:
            case 8:
                objArr[0] = ProtectedSandApp.s("聶\u0001");
                break;
            case 4:
                objArr[0] = s5;
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("聵\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("聹\u0001");
        if (i4 != 4) {
            objArr[1] = s5;
        } else {
            objArr[1] = s6;
        }
        if (i4 != 4) {
            objArr[2] = s6;
        }
        String format = String.format(s4, objArr);
        if (i4 == 4) {
            throw new IllegalStateException(format);
        }
    }

    @fg.l
    public static q1 b(@fg.l List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2) {
        if (list == null) {
            a(0);
        }
        if (o1Var == null) {
            a(1);
        }
        if (mVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        q1 c5 = c(list, o1Var, mVar, list2, null);
        if (c5 != null) {
            return c5;
        }
        throw new AssertionError(ProtectedSandApp.s("聺\u0001"));
    }

    @fg.m
    public static q1 c(@fg.l List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2, @fg.m boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (o1Var == null) {
            a(6);
        }
        if (mVar == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i4 = 0;
        for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 Q0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.Q0(mVar, f1Var.getAnnotations(), f1Var.l(), f1Var.o(), f1Var.getName(), i4, kotlin.reflect.jvm.internal.impl.descriptors.a1.f75900a, f1Var.P());
            hashMap.put(f1Var.j(), new n1(Q0.r()));
            hashMap2.put(f1Var, Q0);
            list2.add(Q0);
            i4++;
        }
        i1 j4 = i1.j(hashMap);
        q1 h4 = q1.h(o1Var, j4);
        o1Var.getClass();
        q1 h5 = q1.h(o1Var.new c(), j4);
        for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var2 : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 k0Var = (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) hashMap2.get(f1Var2);
            for (h0 h0Var : f1Var2.getUpperBounds()) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
                h0 p4 = (((c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) && kotlin.reflect.jvm.internal.impl.types.typeUtil.a.k((kotlin.reflect.jvm.internal.impl.descriptors.f1) c5)) ? h4 : h5).p(h0Var, x1.OUT_VARIANCE);
                if (p4 == null) {
                    return null;
                }
                if (p4 != h0Var && zArr != null) {
                    zArr[0] = true;
                }
                k0Var.N0(p4);
            }
            k0Var.W0();
        }
        return h4;
    }
}
