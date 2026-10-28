package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: MemberScopeImpl.kt */
/* loaded from: classes6.dex */
public abstract class i implements h {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<? extends z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("聚"));
        l0.p(bVar, ProtectedSandApp.s("聛"));
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g5 = g(d.f25996v, kotlin.reflect.jvm.internal.impl.utils.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g5) {
            if (obj instanceof z0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((z0) obj).getName();
                l0.o(name, ProtectedSandApp.s("聜"));
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g5 = g(d.f25997w, kotlin.reflect.jvm.internal.impl.utils.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g5) {
            if (obj instanceof z0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((z0) obj).getName();
                l0.o(name, ProtectedSandApp.s("聝"));
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<? extends u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("聞"));
        l0.p(bVar, ProtectedSandApp.s("聟"));
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        h.b.a(this, fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("聠"));
        l0.p(lVar, ProtectedSandApp.s("聡"));
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("聢"));
        l0.p(bVar, ProtectedSandApp.s("聣"));
        return null;
    }
}
