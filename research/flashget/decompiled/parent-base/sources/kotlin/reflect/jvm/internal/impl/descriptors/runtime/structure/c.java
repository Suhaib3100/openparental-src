package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ReflectJavaMember.kt */
@r1({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n1#2:106\n11065#3:107\n11400#3,3:108\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n*L\n100#1:107\n100#1:108,3\n*E\n"})
/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c f76238a = new c();

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private static a f76239b;

    /* compiled from: ReflectJavaMember.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.m
        private final Method f76240a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final Method f76241b;

        public a(@fg.m Method method, @fg.m Method method2) {
            this.f76240a = method;
            this.f76241b = method2;
        }

        @fg.m
        public final Method a() {
            return this.f76241b;
        }

        @fg.m
        public final Method b() {
            return this.f76240a;
        }
    }

    private c() {
    }

    @fg.l
    public final a a(@fg.l Member member) {
        l0.p(member, ProtectedSandApp.s("溝\u0001"));
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod(ProtectedSandApp.s("溞\u0001"), null), d.f(cls).loadClass(ProtectedSandApp.s("溟\u0001")).getMethod(ProtectedSandApp.s("溠\u0001"), null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    @fg.m
    public final List<String> b(@fg.l Member member) {
        Method a5;
        l0.p(member, ProtectedSandApp.s("溝\u0001"));
        a aVar = f76239b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f76239b;
                if (aVar == null) {
                    aVar = f76238a.a(member);
                    f76239b = aVar;
                }
            }
        }
        Method b5 = aVar.b();
        if (b5 == null || (a5 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b5.invoke(member, null);
        l0.n(invoke, ProtectedSandApp.s("溡\u0001"));
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a5.invoke(obj, null);
            l0.n(invoke2, ProtectedSandApp.s("溢\u0001"));
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
