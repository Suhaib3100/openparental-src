package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.a0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes6.dex */
public final class l extends i {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f26019e = {l1.u(new g1(l1.d(l.class), ProtectedSandApp.s("蛕"), ProtectedSandApp.s("蛖"))), l1.u(new g1(l1.d(l.class), ProtectedSandApp.s("蛗"), ProtectedSandApp.s("蛘")))};

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f26020b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f26021c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f26022d;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    static final class a extends Lambda implements q3.a<List<? extends z0>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<z0> n() {
            List<z0> O;
            O = a0.O(kotlin.reflect.jvm.internal.impl.resolve.d.g(l.this.f26020b), kotlin.reflect.jvm.internal.impl.resolve.d.h(l.this.f26020b));
            return O;
        }
    }

    /* compiled from: StaticScopeForKotlinEnum.kt */
    static final class b extends Lambda implements q3.a<List<? extends u0>> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<u0> n() {
            List<u0> P;
            P = a0.P(kotlin.reflect.jvm.internal.impl.resolve.d.f(l.this.f26020b));
            return P;
        }
    }

    public l(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(nVar, ProtectedSandApp.s("蛙"));
        l0.p(eVar, ProtectedSandApp.s("蛚"));
        this.f26020b = eVar;
        eVar.j();
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS;
        this.f26021c = nVar.d(new a());
        this.f26022d = nVar.d(new b());
    }

    private final List<z0> m() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26021c, this, f26019e[0]);
    }

    private final List<u0> n() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26022d, this, f26019e[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛛"));
        l0.p(bVar, ProtectedSandApp.s("蛜"));
        List<u0> n5 = n();
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        for (Object obj : n5) {
            if (l0.g(((u0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h h(kotlin.reflect.jvm.internal.impl.name.f fVar, z3.b bVar) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.h) j(fVar, bVar);
    }

    @d5.e
    public Void j(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛝"));
        l0.p(bVar, ProtectedSandApp.s("蛞"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.b> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.b> D4;
        l0.p(dVar, ProtectedSandApp.s("蛟"));
        l0.p(lVar, ProtectedSandApp.s("蛠"));
        D4 = j0.D4(m(), n());
        return D4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.utils.e<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛡"));
        l0.p(bVar, ProtectedSandApp.s("蛢"));
        List<z0> m5 = m();
        kotlin.reflect.jvm.internal.impl.utils.e<z0> eVar = new kotlin.reflect.jvm.internal.impl.utils.e<>();
        for (Object obj : m5) {
            if (l0.g(((z0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }
}
