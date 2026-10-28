package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashMap;
import java.util.List;

/* compiled from: DescriptorSubstitutor.java */
/* loaded from: classes5.dex */
public class u {
    private static /* synthetic */ void a(int i5) {
        String s5 = i5 != 4 ? ProtectedSandApp.s("堿") : ProtectedSandApp.s("塀");
        Object[] objArr = new Object[i5 != 4 ? 3 : 2];
        String s6 = ProtectedSandApp.s("塁");
        switch (i5) {
            case 1:
            case 6:
                objArr[0] = ProtectedSandApp.s("塅");
                break;
            case 2:
            case 7:
                objArr[0] = ProtectedSandApp.s("塄");
                break;
            case 3:
            case 8:
                objArr[0] = ProtectedSandApp.s("塃");
                break;
            case 4:
                objArr[0] = s6;
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("塂");
                break;
        }
        String s7 = ProtectedSandApp.s("塆");
        if (i5 != 4) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        if (i5 != 4) {
            objArr[2] = s7;
        }
        String format = String.format(s5, objArr);
        if (i5 == 4) {
            throw new IllegalStateException(format);
        }
    }

    @d5.d
    public static q1 b(@d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2) {
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
        q1 c6 = c(list, o1Var, mVar, list2, null);
        if (c6 != null) {
            return c6;
        }
        throw new AssertionError(ProtectedSandApp.s("塇"));
    }

    @d5.e
    public static q1 c(@d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2, @d5.e boolean[] zArr) {
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
        int i5 = 0;
        for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 W0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.W0(mVar, f1Var.getAnnotations(), f1Var.v(), f1Var.z(), f1Var.getName(), i5, kotlin.reflect.jvm.internal.impl.descriptors.a1.f24103a, f1Var.o0());
            hashMap.put(f1Var.m(), new n1(W0.E()));
            hashMap2.put(f1Var, W0);
            list2.add(W0);
            i5++;
        }
        i1 j5 = i1.j(hashMap);
        q1 h5 = q1.h(o1Var, j5);
        q1 h6 = q1.h(o1Var.h(), j5);
        for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var2 : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 k0Var = (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) hashMap2.get(f1Var2);
            for (h0 h0Var : f1Var2.getUpperBounds()) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
                h0 p5 = (((b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) && kotlin.reflect.jvm.internal.impl.types.typeUtil.a.k((kotlin.reflect.jvm.internal.impl.descriptors.f1) b6)) ? h5 : h6).p(h0Var, x1.OUT_VARIANCE);
                if (p5 == null) {
                    return null;
                }
                if (p5 != h0Var && zArr != null) {
                    zArr[0] = true;
                }
                k0Var.T0(p5);
            }
            k0Var.c1();
        }
        return h5;
    }
}
