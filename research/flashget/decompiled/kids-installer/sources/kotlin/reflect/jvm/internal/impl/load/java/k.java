package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;

/* compiled from: DescriptorsJvmAbiUtil.java */
/* loaded from: classes5.dex */
public final class k {
    private static /* synthetic */ void a(int i5) {
        Object[] objArr = new Object[3];
        if (i5 == 1 || i5 == 2) {
            objArr[0] = ProtectedSandApp.s("䨣");
        } else if (i5 != 3) {
            objArr[0] = ProtectedSandApp.s("䨡");
        } else {
            objArr[0] = ProtectedSandApp.s("䨢");
        }
        objArr[1] = ProtectedSandApp.s("䨤");
        if (i5 == 1) {
            objArr[2] = ProtectedSandApp.s("䨨");
        } else if (i5 == 2) {
            objArr[2] = ProtectedSandApp.s("䨧");
        } else if (i5 != 3) {
            objArr[2] = ProtectedSandApp.s("䨥");
        } else {
            objArr[2] = ProtectedSandApp.s("䨦");
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䨩"), objArr));
    }

    public static boolean b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.x x02;
        if (bVar == null) {
            a(3);
        }
        if ((bVar instanceof u0) && (x02 = ((u0) bVar).x0()) != null && x02.getAnnotations().O0(a0.f24471b)) {
            return true;
        }
        return bVar.getAnnotations().O0(a0.f24471b);
    }

    public static boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(1);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.e.x(mVar) && kotlin.reflect.jvm.internal.impl.resolve.e.w(mVar.b()) && !d((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar);
    }

    public static boolean d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(2);
        }
        return kotlin.reflect.jvm.internal.impl.builtins.d.a(kotlin.reflect.jvm.internal.impl.builtins.c.f23889a, eVar);
    }

    public static boolean e(@d5.d u0 u0Var) {
        if (u0Var == null) {
            a(0);
        }
        if (u0Var.j() == b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(u0Var.b())) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.e.x(u0Var.b()) && b(u0Var);
    }
}
