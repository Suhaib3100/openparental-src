package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: SubstitutingScope.kt */
@r1({"SMAP\nSubstitutingScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n372#2,3:112\n375#2,4:116\n19#3:115\n1#4:120\n*S KotlinDebug\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n*L\n52#1:112,3\n52#1:116,4\n54#1:115\n*E\n"})
/* loaded from: classes7.dex */
public final class m implements h {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final h f78010b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final b0 f78011c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final q1 f78012d;

    /* renamed from: e, reason: collision with root package name */
    @fg.m
    private Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> f78013e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final b0 f78014f;

    /* compiled from: SubstitutingScope.kt */
    static final class a extends n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke() {
            m mVar = m.this;
            return mVar.l(k.a.a(mVar.f78010b, null, null, 3, null));
        }
    }

    /* compiled from: SubstitutingScope.kt */
    static final class b extends n0 implements ld.a<q1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1 f78016b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q1 q1Var) {
            super(0);
            this.f78016b = q1Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q1 invoke() {
            return this.f78016b.j().c();
        }
    }

    public m(@fg.l h hVar, @fg.l q1 q1Var) {
        l0.p(hVar, ProtectedSandApp.s("窭\u0001"));
        l0.p(q1Var, ProtectedSandApp.s("窮\u0001"));
        this.f78010b = hVar;
        this.f78011c = c0.c(new b(q1Var));
        o1 j4 = q1Var.j();
        l0.o(j4, ProtectedSandApp.s("窯\u0001"));
        this.f78012d = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.f(j4, false, 1, null).c();
        this.f78014f = c0.c(new a());
    }

    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> k() {
        return (Collection) this.f78014f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> Collection<D> l(Collection<? extends D> collection) {
        if (this.f78012d.k()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g4 = kotlin.reflect.jvm.internal.impl.utils.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g4.add(m((kotlin.reflect.jvm.internal.impl.descriptors.m) it.next()));
        }
        return g4;
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D m(D d5) {
        if (this.f78012d.k()) {
            return d5;
        }
        if (this.f78013e == null) {
            this.f78013e = new HashMap();
        }
        Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> map = this.f78013e;
        l0.m(map);
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = map.get(d5);
        if (mVar == null) {
            if (!(d5 instanceof c1)) {
                throw new IllegalStateException((ProtectedSandApp.s("窲\u0001") + d5).toString());
            }
            mVar = ((c1) d5).d(this.f78012d);
            if (mVar == null) {
                throw new AssertionError(ProtectedSandApp.s("窰\u0001") + d5 + ProtectedSandApp.s("窱\u0001"));
            }
            map.put(d5, mVar);
        }
        D d6 = (D) mVar;
        l0.n(d6, ProtectedSandApp.s("窳\u0001"));
        return d6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<? extends z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窴\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窵\u0001"));
        return l(this.f78010b.a(fVar, bVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<? extends u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窴\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窵\u0001"));
        return l(this.f78010b.b(fVar, bVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f78010b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return this.f78010b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        h.b.a(this, fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窴\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窵\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h f4 = this.f78010b.f(fVar, bVar);
        if (f4 != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.h) m(f4);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("窶\u0001"));
        l0.p(lVar, ProtectedSandApp.s("窷\u0001"));
        return k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.m
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return this.f78010b.h();
    }
}
