package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;

/* compiled from: ErrorModuleDescriptor.kt */
/* loaded from: classes7.dex */
public final class d implements h0 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final d f78393b = new d();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f78394c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final List<h0> f78395d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final List<h0> f78396e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Set<h0> f78397f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final b0 f78398g;

    /* compiled from: ErrorModuleDescriptor.kt */
    static final class a extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.builtins.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f78399b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.builtins.e a() {
            return kotlin.reflect.jvm.internal.impl.builtins.e.f75667i.a();
        }

        @Override // ld.a
        public kotlin.reflect.jvm.internal.impl.builtins.e invoke() {
            return kotlin.reflect.jvm.internal.impl.builtins.e.f75667i.a();
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.f i4 = kotlin.reflect.jvm.internal.impl.name.f.i(b.ERROR_MODULE.getDebugText());
        l0.o(i4, ProtectedSandApp.s("縷\u0001"));
        f78394c = i4;
        j0 j0Var = j0.f74919b;
        f78395d = j0Var;
        f78396e = j0Var;
        f78397f = kotlin.collections.l0.f74939b;
        f78398g = c0.c(a.f78399b);
    }

    private d() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public List<h0> B0() {
        return f78396e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @m
    public <R, D> R E(@fg.l o<R, D> oVar, D d5) {
        l0.p(oVar, ProtectedSandApp.s("縸\u0001"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @m
    public <T> T J0(@fg.l g0<T> g0Var) {
        l0.p(g0Var, ProtectedSandApp.s("縹\u0001"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    public boolean N(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("縺\u0001"));
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @m
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return f78394c;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f j0() {
        return f78394c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public q0 n0(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("縻\u0001"));
        throw new IllegalStateException(ProtectedSandApp.s("縼\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        return (kotlin.reflect.jvm.internal.impl.builtins.h) f78398g.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> z(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(cVar, ProtectedSandApp.s("縻\u0001"));
        l0.p(lVar, ProtectedSandApp.s("總\u0001"));
        return j0.f74919b;
    }
}
