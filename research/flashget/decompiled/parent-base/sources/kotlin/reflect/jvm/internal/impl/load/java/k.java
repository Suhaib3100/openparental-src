package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;

/* compiled from: DescriptorsJvmAbiUtil.java */
/* loaded from: classes7.dex */
public final class k {
    private static /* synthetic */ void a(int i4) {
        Object[] objArr = new Object[3];
        if (i4 == 1 || i4 == 2) {
            objArr[0] = ProtectedSandApp.s("焃\u0001");
        } else if (i4 != 3) {
            objArr[0] = ProtectedSandApp.s("焁\u0001");
        } else {
            objArr[0] = ProtectedSandApp.s("焂\u0001");
        }
        objArr[1] = ProtectedSandApp.s("焄\u0001");
        if (i4 == 1) {
            objArr[2] = ProtectedSandApp.s("焈\u0001");
        } else if (i4 == 2) {
            objArr[2] = ProtectedSandApp.s("焇\u0001");
        } else if (i4 != 3) {
            objArr[2] = ProtectedSandApp.s("焅\u0001");
        } else {
            objArr[2] = ProtectedSandApp.s("焆\u0001");
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("焉\u0001"), objArr));
    }

    public static boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.x y02;
        if (bVar == null) {
            a(3);
        }
        if ((bVar instanceof u0) && (y02 = ((u0) bVar).y0()) != null && y02.getAnnotations().o3(a0.f76321b)) {
            return true;
        }
        return bVar.getAnnotations().o3(a0.f76321b);
    }

    public static boolean c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(1);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.f.x(mVar) && kotlin.reflect.jvm.internal.impl.resolve.f.w(mVar.c()) && !d((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar);
    }

    public static boolean d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(2);
        }
        return kotlin.reflect.jvm.internal.impl.builtins.d.a(kotlin.reflect.jvm.internal.impl.builtins.c.f75665a, eVar);
    }

    public static boolean e(@fg.l u0 u0Var) {
        if (u0Var == null) {
            a(0);
        }
        if (u0Var.b() == b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(u0Var.c())) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.f.x(u0Var.c()) && b(u0Var);
    }
}
