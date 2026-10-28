package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: DeserializedDescriptorResolver.kt */
@r1({"SMAP\nDeserializedDescriptorResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n126#1,14:155\n126#1,14:169\n1#2:183\n*S KotlinDebug\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n*L\n56#1:155,14\n68#1:169,14\n*E\n"})
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final a f76914b = new a();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final Set<a.EnumC1104a> f76915c = l1.f(a.EnumC1104a.CLASS);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Set<a.EnumC1104a> f76916d = l1.u(a.EnumC1104a.FILE_FACADE, a.EnumC1104a.MULTIFILE_CLASS_PART);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f76917e = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 2);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f76918f = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 11);

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f76919g = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 13);

    /* renamed from: a, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.k f76920a;

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e a() {
            return j.f76919g;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: DeserializedDescriptorResolver.kt */
    static final class b extends n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76921b = new b(0);

        b() {
            super(0);
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.impl.name.f> a() {
            return j0.f74919b;
        }

        @Override // ld.a
        public Collection<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return j0.f74919b;
        }
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f c(t tVar) {
        return d().g().e() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.STABLE : tVar.o().j() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.FIR_UNSTABLE : tVar.o().k() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.IR_UNSTABLE : kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.STABLE;
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e(t tVar) {
        if (g() || tVar.o().d().h(f())) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<>(tVar.o().d(), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.f77546i, f(), f().k(tVar.o().d().j()), tVar.getLocation(), tVar.m());
    }

    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f() {
        return kotlin.reflect.jvm.internal.impl.utils.c.a(d().g());
    }

    private final boolean g() {
        return d().g().f();
    }

    private final boolean h(t tVar) {
        return !d().g().b() && tVar.o().i() && l0.g(tVar.o().d(), f76918f);
    }

    private final boolean i(t tVar) {
        return (d().g().g() && (tVar.o().i() || l0.g(tVar.o().d(), f76917e))) || h(tVar);
    }

    private final String[] k(t tVar, Set<? extends a.EnumC1104a> set) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o4 = tVar.o();
        String[] a5 = o4.a();
        if (a5 == null) {
            a5 = o4.b();
        }
        if (a5 == null || !set.contains(o4.c())) {
            return null;
        }
        return a5;
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @fg.l t tVar) {
        q0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l> q0Var;
        String s4 = ProtectedSandApp.s("瑶\u0001");
        l0.p(l0Var, ProtectedSandApp.s("瑷\u0001"));
        l0.p(tVar, ProtectedSandApp.s("瑸\u0001"));
        String[] k4 = k(tVar, f76916d);
        if (k4 == null) {
            return null;
        }
        String[] g4 = tVar.o().g();
        try {
        } catch (Throwable th) {
            if (g() || tVar.o().d().h(f())) {
                throw th;
            }
            q0Var = null;
        }
        if (g4 == null) {
            return null;
        }
        try {
            q0Var = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.m(k4, g4);
            if (q0Var == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f a5 = q0Var.a();
            a.l b5 = q0Var.b();
            n nVar = new n(tVar, b5, a5, e(tVar), i(tVar), c(tVar));
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j(l0Var, b5, a5, tVar.o().d(), nVar, d(), ProtectedSandApp.s("瑹\u0001") + nVar + ProtectedSandApp.s("瑺\u0001") + l0Var, b.f76921b);
        } catch (InvalidProtocolBufferException e4) {
            throw new IllegalStateException(s4 + tVar.getLocation(), e4);
        }
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k d() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar = this.f76920a;
        if (kVar != null) {
            return kVar;
        }
        l0.S(ProtectedSandApp.s("瑻\u0001"));
        return null;
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.g j(@fg.l t tVar) {
        q0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.c> q0Var;
        String s4 = ProtectedSandApp.s("瑶\u0001");
        l0.p(tVar, ProtectedSandApp.s("瑸\u0001"));
        String[] k4 = k(tVar, f76915c);
        if (k4 == null) {
            return null;
        }
        String[] g4 = tVar.o().g();
        try {
        } catch (Throwable th) {
            if (g() || tVar.o().d().h(f())) {
                throw th;
            }
            q0Var = null;
        }
        if (g4 == null) {
            return null;
        }
        try {
            q0Var = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.i(k4, g4);
            if (q0Var == null) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.g(q0Var.a(), q0Var.b(), tVar.o().d(), new v(tVar, e(tVar), i(tVar), c(tVar)));
        } catch (InvalidProtocolBufferException e4) {
            throw new IllegalStateException(s4 + tVar.getLocation(), e4);
        }
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.descriptors.e l(@fg.l t tVar) {
        l0.p(tVar, ProtectedSandApp.s("瑸\u0001"));
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.g j4 = j(tVar);
        if (j4 == null) {
            return null;
        }
        return d().f().d(tVar.m(), j4);
    }

    public final void m(@fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("瑻\u0001"));
        n(hVar.a());
    }

    public final void n(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar) {
        l0.p(kVar, ProtectedSandApp.s("瑼\u0001"));
        this.f76920a = kVar;
    }
}
