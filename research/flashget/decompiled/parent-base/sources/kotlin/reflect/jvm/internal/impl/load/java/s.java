package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import sd.a;

/* compiled from: JavaDescriptorVisibilities.java */
/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u f76692a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u f76693b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u f76694c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Map<o1, kotlin.reflect.jvm.internal.impl.descriptors.u> f76695d;

    /* compiled from: JavaDescriptorVisibilities.java */
    static class a extends kotlin.reflect.jvm.internal.impl.descriptors.r {
        a(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("牮\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("牯\u0001");
            }
            objArr[1] = ProtectedSandApp.s("牰\u0001");
            objArr[2] = ProtectedSandApp.s("牱\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("牲\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, boolean z4) {
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
    static class b extends kotlin.reflect.jvm.internal.impl.descriptors.r {
        b(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("牳\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("牴\u0001");
            }
            objArr[1] = ProtectedSandApp.s("牵\u0001");
            objArr[2] = ProtectedSandApp.s("牶\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("牷\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, boolean z4) {
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
    static class c extends kotlin.reflect.jvm.internal.impl.descriptors.r {
        c(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("牸\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("特\u0001");
            }
            objArr[1] = ProtectedSandApp.s("牺\u0001");
            objArr[2] = ProtectedSandApp.s("牻\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("牼\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, boolean z4) {
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
        a aVar = new a(a.C1395a.f91852c);
        f76692a = aVar;
        b bVar = new b(a.c.f91854c);
        f76693b = bVar;
        c cVar = new c(a.b.f91853c);
        f76694c = cVar;
        f76695d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i4) {
        String s4 = (i4 == 5 || i4 == 6) ? ProtectedSandApp.s("牾\u0001") : ProtectedSandApp.s("牽\u0001");
        Object[] objArr = new Object[(i4 == 5 || i4 == 6) ? 2 : 3];
        String s5 = ProtectedSandApp.s("牿\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("犄\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("犃\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("犂\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("犁\u0001");
                break;
            case 5:
            case 6:
                objArr[0] = s5;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("犀\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("犅\u0001");
        if (i4 == 5 || i4 == 6) {
            objArr[1] = s6;
        } else {
            objArr[1] = s5;
        }
        if (i4 == 2 || i4 == 3) {
            objArr[2] = ProtectedSandApp.s("犇\u0001");
        } else if (i4 == 4) {
            objArr[2] = s6;
        } else if (i4 != 5 && i4 != 6) {
            objArr[2] = ProtectedSandApp.s("犆\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 != 5 && i4 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
        if (mVar == null) {
            a(2);
        }
        if (mVar2 == null) {
            a(3);
        }
        l0 l0Var = (l0) kotlin.reflect.jvm.internal.impl.resolve.f.r(mVar, l0.class, false);
        l0 l0Var2 = (l0) kotlin.reflect.jvm.internal.impl.resolve.f.r(mVar2, l0.class, false);
        return (l0Var2 == null || l0Var == null || !l0Var.g().equals(l0Var2.g())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (qVar == null) {
            a(0);
        }
        if (mVar == null) {
            a(1);
        }
        if (d(kotlin.reflect.jvm.internal.impl.resolve.f.M(qVar), mVar)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.t.f76288c.e(hVar, qVar, mVar, false);
    }

    private static void f(kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        f76695d.put(uVar.b(), uVar);
    }

    @fg.l
    public static kotlin.reflect.jvm.internal.impl.descriptors.u g(@fg.l o1 o1Var) {
        if (o1Var == null) {
            a(4);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = f76695d.get(o1Var);
        if (uVar != null) {
            return uVar;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.u j4 = kotlin.reflect.jvm.internal.impl.descriptors.t.j(o1Var);
        if (j4 == null) {
            a(5);
        }
        return j4;
    }
}
