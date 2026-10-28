package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaMember.kt */
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final c f24388a = new c();

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private static a f24389b;

    /* compiled from: ReflectJavaMember.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        private final Method f24390a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final Method f24391b;

        public a(@d5.e Method method, @d5.e Method method2) {
            this.f24390a = method;
            this.f24391b = method2;
        }

        @d5.e
        public final Method a() {
            return this.f24391b;
        }

        @d5.e
        public final Method b() {
            return this.f24390a;
        }
    }

    private c() {
    }

    @d5.d
    public final a a(@d5.d Member member) {
        l0.p(member, ProtectedSandApp.s("䢅"));
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod(ProtectedSandApp.s("䢆"), new Class[0]), d.f(cls).loadClass(ProtectedSandApp.s("䢇")).getMethod(ProtectedSandApp.s("䢈"), new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    @d5.e
    public final List<String> b(@d5.d Member member) {
        Method a6;
        l0.p(member, ProtectedSandApp.s("䢉"));
        a aVar = f24389b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f24389b;
                if (aVar == null) {
                    aVar = f24388a.a(member);
                    f24389b = aVar;
                }
            }
        }
        Method b6 = aVar.b();
        if (b6 == null || (a6 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b6.invoke(member, new Object[0]);
        l0.n(invoke, ProtectedSandApp.s("䢊"));
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a6.invoke(obj, new Object[0]);
            l0.n(invoke2, ProtectedSandApp.s("䢋"));
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
