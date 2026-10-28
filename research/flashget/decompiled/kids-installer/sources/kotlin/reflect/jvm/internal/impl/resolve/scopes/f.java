package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;

/* compiled from: InnerClassesScopeWrapper.kt */
/* loaded from: classes6.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h f26011b;

    public f(@d5.d h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蛈"));
        this.f26011b = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f26011b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f26011b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛉"));
        l0.p(bVar, ProtectedSandApp.s("蛊"));
        this.f26011b.e(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return this.f26011b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛋"));
        l0.p(bVar, ProtectedSandApp.s("蛌"));
        kotlin.reflect.jvm.internal.impl.descriptors.h h5 = this.f26011b.h(fVar, bVar);
        if (h5 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) h5 : null;
        if (eVar != null) {
            return eVar;
        }
        if (h5 instanceof e1) {
            return (e1) h5;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.h> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蛍"));
        l0.p(lVar, ProtectedSandApp.s("蛎"));
        d.f25977c.getClass();
        d n5 = dVar.n(d.f25986l);
        if (n5 == null) {
            return EmptyList.f23167o;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g5 = this.f26011b.g(n5, lVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g5) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蛏") + this.f26011b;
    }
}
