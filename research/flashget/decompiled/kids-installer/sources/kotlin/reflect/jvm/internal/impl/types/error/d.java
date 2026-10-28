package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;

/* compiled from: ErrorModuleDescriptor.kt */
/* loaded from: classes6.dex */
public final class d implements h0 {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final d f26385o = new d();

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f26386p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private static final List<h0> f26387q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private static final List<h0> f26388r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private static final Set<h0> f26389s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.builtins.h f26390t;

    static {
        kotlin.reflect.jvm.internal.impl.name.f s5 = kotlin.reflect.jvm.internal.impl.name.f.s(b.ERROR_MODULE.getDebugText());
        l0.o(s5, ProtectedSandApp.s("裾"));
        f26386p = s5;
        EmptyList emptyList = EmptyList.f23167o;
        f26387q = emptyList;
        f26388r = emptyList;
        f26389s = EmptySet.f23181o;
        kotlin.reflect.jvm.internal.impl.builtins.e.f23891i.getClass();
        f26390t = kotlin.reflect.jvm.internal.impl.builtins.e.f23892j;
    }

    private d() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        return f26390t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public List<h0> A0() {
        return f26388r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.e
    public <T> T P0(@d5.d g0<T> g0Var) {
        l0.p(g0Var, ProtectedSandApp.s("裿"));
        return null;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f Q() {
        return f26386p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.e
    public <R, D> R T(@d5.d o<R, D> oVar, D d6) {
        l0.p(oVar, ProtectedSandApp.s("褀"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public q0 V(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("褁"));
        throw new IllegalStateException(ProtectedSandApp.s("褂"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public m a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.e
    public m b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return f26386p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    public boolean l0(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("褃"));
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(cVar, ProtectedSandApp.s("褄"));
        l0.p(lVar, ProtectedSandApp.s("褅"));
        return EmptyList.f23167o;
    }
}
