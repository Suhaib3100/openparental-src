package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: SubstitutingScope.kt */
/* loaded from: classes6.dex */
public final class m implements h {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h f26025b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Lazy f26026c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final q1 f26027d;

    /* renamed from: e, reason: collision with root package name */
    @d5.e
    private Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> f26028e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final Lazy f26029f;

    /* compiled from: SubstitutingScope.kt */
    static final class a extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> n() {
            m mVar = m.this;
            return mVar.l(k.a.a(mVar.f26025b, null, null, 3, null));
        }
    }

    /* compiled from: SubstitutingScope.kt */
    static final class b extends Lambda implements q3.a<q1> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q1 f26031p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q1 q1Var) {
            super(0);
            this.f26031p = q1Var;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q1 n() {
            return this.f26031p.j().c();
        }
    }

    public m(@d5.d h hVar, @d5.d q1 q1Var) {
        Lazy c6;
        Lazy c7;
        l0.p(hVar, ProtectedSandApp.s("蛣"));
        l0.p(q1Var, ProtectedSandApp.s("蛤"));
        this.f26025b = hVar;
        c6 = d0.c(new b(q1Var));
        this.f26026c = c6;
        o1 j5 = q1Var.j();
        l0.o(j5, ProtectedSandApp.s("蛥"));
        this.f26027d = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.f(j5, false, 1, null).c();
        c7 = d0.c(new a());
        this.f26029f = c7;
    }

    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> k() {
        return (Collection) this.f26029f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> Collection<D> l(Collection<? extends D> collection) {
        if (this.f26027d.k()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g5 = kotlin.reflect.jvm.internal.impl.utils.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g5.add(m((kotlin.reflect.jvm.internal.impl.descriptors.m) it.next()));
        }
        return g5;
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D m(D d6) {
        if (this.f26027d.k()) {
            return d6;
        }
        if (this.f26028e == null) {
            this.f26028e = new HashMap();
        }
        Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> map = this.f26028e;
        l0.m(map);
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = map.get(d6);
        if (mVar == null) {
            if (!(d6 instanceof c1)) {
                throw new IllegalStateException((ProtectedSandApp.s("蛨") + d6).toString());
            }
            mVar = ((c1) d6).d(this.f26027d);
            if (mVar == null) {
                throw new AssertionError(ProtectedSandApp.s("蛦") + d6 + ProtectedSandApp.s("蛧"));
            }
            map.put(d6, mVar);
        }
        D d7 = (D) mVar;
        l0.n(d7, ProtectedSandApp.s("蛩"));
        return d7;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<? extends z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛪"));
        l0.p(bVar, ProtectedSandApp.s("蛫"));
        return l(this.f26025b.a(fVar, bVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f26025b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f26025b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<? extends u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛬"));
        l0.p(bVar, ProtectedSandApp.s("蛭"));
        return l(this.f26025b.d(fVar, bVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        h.b.a(this, fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return this.f26025b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蛮"));
        l0.p(lVar, ProtectedSandApp.s("蛯"));
        return k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛰"));
        l0.p(bVar, ProtectedSandApp.s("蛱"));
        kotlin.reflect.jvm.internal.impl.descriptors.h h5 = this.f26025b.h(fVar, bVar);
        if (h5 != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.h) m(h5);
        }
        return null;
    }
}
