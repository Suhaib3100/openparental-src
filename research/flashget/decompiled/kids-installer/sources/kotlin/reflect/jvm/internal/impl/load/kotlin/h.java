package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.p1;
import kotlin.collections.q1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: DeserializedDescriptorResolver.kt */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final a f25003b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Set<a.EnumC0299a> f25004c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Set<a.EnumC0299a> f25005d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f25006e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f25007f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f25008g;

    /* renamed from: a, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.k f25009a;

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e a() {
            return h.f25008g;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: DeserializedDescriptorResolver.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f25010p = new b();

        b() {
            super(0);
        }

        @d5.d
        public final Collection<kotlin.reflect.jvm.internal.impl.name.f> a() {
            return EmptyList.f23167o;
        }

        @Override // q3.a
        public Collection<? extends kotlin.reflect.jvm.internal.impl.name.f> n() {
            return EmptyList.f23167o;
        }
    }

    static {
        Set<a.EnumC0299a> f6;
        Set<a.EnumC0299a> u5;
        f6 = p1.f(a.EnumC0299a.CLASS);
        f25004c = f6;
        u5 = q1.u(a.EnumC0299a.FILE_FACADE, a.EnumC0299a.MULTIFILE_CLASS_PART);
        f25005d = u5;
        f25006e = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 2);
        f25007f = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 11);
        f25008g = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 13);
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f c(r rVar) {
        return d().g().b() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.STABLE : rVar.a().j() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.FIR_UNSTABLE : rVar.a().k() ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.IR_UNSTABLE : kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.STABLE;
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e(r rVar) {
        if (f() || rVar.a().d().h()) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<>(rVar.a().d(), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.f25565i, rVar.getLocation(), rVar.h());
    }

    private final boolean f() {
        return d().g().d();
    }

    private final boolean g(r rVar) {
        return !d().g().c() && rVar.a().i() && l0.g(rVar.a().d(), f25007f);
    }

    private final boolean h(r rVar) {
        return (d().g().e() && (rVar.a().i() || l0.g(rVar.a().d(), f25006e))) || g(rVar);
    }

    private final String[] j(r rVar, Set<? extends a.EnumC0299a> set) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a6 = rVar.a();
        String[] a7 = a6.a();
        if (a7 == null) {
            a7 = a6.b();
        }
        if (a7 == null || !set.contains(a6.c())) {
            return null;
        }
        return a7;
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @d5.d r rVar) {
        Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l> pair;
        String s5 = ProtectedSandApp.s("䰼");
        l0.p(l0Var, ProtectedSandApp.s("䰽"));
        l0.p(rVar, ProtectedSandApp.s("䰾"));
        String[] j5 = j(rVar, f25005d);
        if (j5 == null) {
            return null;
        }
        String[] g5 = rVar.a().g();
        try {
        } catch (Throwable th) {
            if (f() || rVar.a().d().h()) {
                throw th;
            }
            pair = null;
        }
        if (g5 == null) {
            return null;
        }
        try {
            pair = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.m(j5, g5);
            if (pair == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f a6 = pair.a();
            a.l b6 = pair.b();
            l lVar = new l(rVar, b6, a6, e(rVar), h(rVar), c(rVar));
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j(l0Var, b6, a6, rVar.a().d(), lVar, d(), ProtectedSandApp.s("䰿") + lVar + ProtectedSandApp.s("䱀") + l0Var, b.f25010p);
        } catch (InvalidProtocolBufferException e6) {
            throw new IllegalStateException(s5 + rVar.getLocation(), e6);
        }
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k d() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar = this.f25009a;
        if (kVar != null) {
            return kVar;
        }
        l0.S(ProtectedSandApp.s("䱁"));
        return null;
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.g i(@d5.d r rVar) {
        Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.c> pair;
        String s5 = ProtectedSandApp.s("䱂");
        l0.p(rVar, ProtectedSandApp.s("䱃"));
        String[] j5 = j(rVar, f25004c);
        if (j5 == null) {
            return null;
        }
        String[] g5 = rVar.a().g();
        try {
        } catch (Throwable th) {
            if (f() || rVar.a().d().h()) {
                throw th;
            }
            pair = null;
        }
        if (g5 == null) {
            return null;
        }
        try {
            pair = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.i(j5, g5);
            if (pair == null) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.g(pair.a(), pair.b(), rVar.a().d(), new t(rVar, e(rVar), h(rVar), c(rVar)));
        } catch (InvalidProtocolBufferException e6) {
            throw new IllegalStateException(s5 + rVar.getLocation(), e6);
        }
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e k(@d5.d r rVar) {
        l0.p(rVar, ProtectedSandApp.s("䱄"));
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.g i5 = i(rVar);
        if (i5 == null) {
            return null;
        }
        return d().f().d(rVar.h(), i5);
    }

    public final void l(@d5.d f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䱅"));
        m(fVar.a());
    }

    public final void m(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar) {
        l0.p(kVar, ProtectedSandApp.s("䱆"));
        this.f25009a = kVar;
    }
}
