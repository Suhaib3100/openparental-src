package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.o;

/* compiled from: StaticScopeForKotlinEnum.kt */
@r1({"SMAP\nStaticScopeForKotlinEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1#2:69\n857#3,2:70\n857#3,2:72\n*S KotlinDebug\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n*L\n59#1:70,2\n62#1:72,2\n*E\n"})
/* loaded from: classes7.dex */
public final class l extends i {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f78003f = {l1.u(new g1(l1.d(l.class), ProtectedSandApp.s("窣\u0001"), ProtectedSandApp.s("窤\u0001"))), l1.u(new g1(l1.d(l.class), ProtectedSandApp.s("窥\u0001"), ProtectedSandApp.s("窦\u0001")))};

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f78004b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f78005c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f78006d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f78007e;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    static final class a extends n0 implements ld.a<List<? extends z0>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<z0> invoke() {
            return w.O(kotlin.reflect.jvm.internal.impl.resolve.e.g(l.this.f78004b), kotlin.reflect.jvm.internal.impl.resolve.e.h(l.this.f78004b));
        }
    }

    /* compiled from: StaticScopeForKotlinEnum.kt */
    static final class b extends n0 implements ld.a<List<? extends u0>> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<u0> invoke() {
            return l.this.f78005c ? w.P(kotlin.reflect.jvm.internal.impl.resolve.e.f(l.this.f78004b)) : j0.f74919b;
        }
    }

    public l(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z4) {
        l0.p(nVar, ProtectedSandApp.s("窧\u0001"));
        l0.p(eVar, ProtectedSandApp.s("窨\u0001"));
        this.f78004b = eVar;
        this.f78005c = z4;
        eVar.b();
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS;
        this.f78006d = nVar.h(new a());
        this.f78007e = nVar.h(new b());
    }

    private final List<z0> n() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78006d, this, f78003f[0]);
    }

    private final List<u0> o() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78007e, this, f78003f[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窩\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窪\u0001"));
        List<u0> o4 = o();
        kotlin.reflect.jvm.internal.impl.utils.f fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f();
        for (Object obj : o4) {
            if (l0.g(((u0) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h f(kotlin.reflect.jvm.internal.impl.name.f fVar, ud.b bVar) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.h) k(fVar, bVar);
    }

    @fg.m
    public Void k(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窩\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窪\u0001"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.b> g(@fg.l d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("窫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("窬\u0001"));
        return w.D4(n(), o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.utils.f<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窩\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窪\u0001"));
        List<z0> n4 = n();
        kotlin.reflect.jvm.internal.impl.utils.f<z0> fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f<>();
        for (Object obj : n4) {
            if (l0.g(((z0) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }
}
