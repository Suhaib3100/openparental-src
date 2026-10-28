package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import x3.a;

/* compiled from: JavaDescriptorVisibilities.java */
/* loaded from: classes5.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u f24817a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u f24818b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u f24819c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Map<o1, kotlin.reflect.jvm.internal.impl.descriptors.u> f24820d;

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.descriptors.r {
        a(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("蕼");
            } else {
                objArr[0] = ProtectedSandApp.s("蕽");
            }
            objArr[1] = ProtectedSandApp.s("蕾");
            objArr[2] = ProtectedSandApp.s("蕿");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("薀"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, boolean z5) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return s.d(qVar, mVar);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class b extends kotlin.reflect.jvm.internal.impl.descriptors.r {
        b(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("薁");
            } else {
                objArr[0] = ProtectedSandApp.s("薂");
            }
            objArr[1] = ProtectedSandApp.s("薃");
            objArr[2] = ProtectedSandApp.s("薄");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("薅"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, boolean z5) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return s.e(hVar, qVar, mVar);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class c extends kotlin.reflect.jvm.internal.impl.descriptors.r {
        c(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("薆");
            } else {
                objArr[0] = ProtectedSandApp.s("薇");
            }
            objArr[1] = ProtectedSandApp.s("薈");
            objArr[2] = ProtectedSandApp.s("薉");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("薊"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, boolean z5) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return s.e(hVar, qVar, mVar);
        }
    }

    static {
        a aVar = new a(a.C0521a.f34365c);
        f24817a = aVar;
        b bVar = new b(a.c.f34367c);
        f24818b = bVar;
        c cVar = new c(a.b.f34366c);
        f24819c = cVar;
        f24820d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i5) {
        String s5 = (i5 == 5 || i5 == 6) ? ProtectedSandApp.s("䫘") : ProtectedSandApp.s("䫗");
        Object[] objArr = new Object[(i5 == 5 || i5 == 6) ? 2 : 3];
        String s6 = ProtectedSandApp.s("䫙");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("䫞");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("䫝");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("䫜");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("䫛");
                break;
            case 5:
            case 6:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("䫚");
                break;
        }
        String s7 = ProtectedSandApp.s("䫟");
        if (i5 == 5 || i5 == 6) {
            objArr[1] = s7;
        } else {
            objArr[1] = s6;
        }
        if (i5 == 2 || i5 == 3) {
            objArr[2] = ProtectedSandApp.s("䫡");
        } else if (i5 == 4) {
            objArr[2] = s7;
        } else if (i5 != 5 && i5 != 6) {
            objArr[2] = ProtectedSandApp.s("䫠");
        }
        String format = String.format(s5, objArr);
        if (i5 != 5 && i5 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
        if (mVar == null) {
            a(2);
        }
        if (mVar2 == null) {
            a(3);
        }
        l0 l0Var = (l0) kotlin.reflect.jvm.internal.impl.resolve.e.r(mVar, l0.class, false);
        l0 l0Var2 = (l0) kotlin.reflect.jvm.internal.impl.resolve.e.r(mVar2, l0.class, false);
        return (l0Var2 == null || l0Var == null || !l0Var.f().equals(l0Var2.f())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (qVar == null) {
            a(0);
        }
        if (mVar == null) {
            a(1);
        }
        if (d(kotlin.reflect.jvm.internal.impl.resolve.e.M(qVar), mVar)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.t.f24438c.e(hVar, qVar, mVar, false);
    }

    private static void f(kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        f24820d.put(uVar.b(), uVar);
    }

    @d5.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.u g(@d5.d o1 o1Var) {
        if (o1Var == null) {
            a(4);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = f24820d.get(o1Var);
        if (uVar != null) {
            return uVar;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.u j5 = kotlin.reflect.jvm.internal.impl.descriptors.t.j(o1Var);
        if (j5 == null) {
            a(5);
        }
        return j5;
    }
}
