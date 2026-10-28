package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: AbstractScopeAdapter.kt */
/* loaded from: classes6.dex */
public abstract class a implements h {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蚭"));
        l0.p(bVar, ProtectedSandApp.s("蚮"));
        return j().a(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return j().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return j().c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蚯"));
        l0.p(bVar, ProtectedSandApp.s("蚰"));
        return j().d(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蚱"));
        l0.p(bVar, ProtectedSandApp.s("蚲"));
        j().e(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return j().f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蚳"));
        l0.p(lVar, ProtectedSandApp.s("蚴"));
        return j().g(dVar, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蚵"));
        l0.p(bVar, ProtectedSandApp.s("蚶"));
        return j().h(fVar, bVar);
    }

    @d5.d
    public final h i() {
        if (!(j() instanceof a)) {
            return j();
        }
        h j5 = j();
        l0.n(j5, ProtectedSandApp.s("蚷"));
        return ((a) j5).i();
    }

    @d5.d
    protected abstract h j();
}
