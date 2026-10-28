package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.types.c1;
import rd.a;
import rd.c;

/* compiled from: context.kt */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n f78222a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.h0 f78223b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final l f78224c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final h f78225d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f78226e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final m0 f78227f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final w f78228g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final r f78229h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final ud.c f78230i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private final s f78231j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final Iterable<rd.b> f78232k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final k0 f78233l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final j f78234m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final rd.a f78235n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final rd.c f78236o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.protobuf.f f78237p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.types.checker.l f78238q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private final zd.a f78239r;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private final List<c1> f78240s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private final q f78241t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private final i f78242u;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @fg.l l lVar, @fg.l h hVar, @fg.l c<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> cVar, @fg.l m0 m0Var, @fg.l w wVar, @fg.l r rVar, @fg.l ud.c cVar2, @fg.l s sVar, @fg.l Iterable<? extends rd.b> iterable, @fg.l k0 k0Var, @fg.l j jVar, @fg.l rd.a aVar, @fg.l rd.c cVar3, @fg.l kotlin.reflect.jvm.internal.impl.protobuf.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, @fg.l zd.a aVar2, @fg.l List<? extends c1> list, @fg.l q qVar) {
        l0.p(nVar, ProtectedSandApp.s("籞\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("籟\u0001"));
        l0.p(lVar, ProtectedSandApp.s("籠\u0001"));
        l0.p(hVar, ProtectedSandApp.s("籡\u0001"));
        l0.p(cVar, ProtectedSandApp.s("籢\u0001"));
        l0.p(m0Var, ProtectedSandApp.s("籣\u0001"));
        l0.p(wVar, ProtectedSandApp.s("籤\u0001"));
        l0.p(rVar, ProtectedSandApp.s("籥\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("籦\u0001"));
        l0.p(sVar, ProtectedSandApp.s("籧\u0001"));
        l0.p(iterable, ProtectedSandApp.s("籨\u0001"));
        l0.p(k0Var, ProtectedSandApp.s("籩\u0001"));
        l0.p(jVar, ProtectedSandApp.s("籪\u0001"));
        l0.p(aVar, ProtectedSandApp.s("籫\u0001"));
        l0.p(cVar3, ProtectedSandApp.s("籬\u0001"));
        l0.p(fVar, ProtectedSandApp.s("籭\u0001"));
        l0.p(lVar2, ProtectedSandApp.s("籮\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("籯\u0001"));
        l0.p(list, ProtectedSandApp.s("籰\u0001"));
        l0.p(qVar, ProtectedSandApp.s("籱\u0001"));
        this.f78222a = nVar;
        this.f78223b = h0Var;
        this.f78224c = lVar;
        this.f78225d = hVar;
        this.f78226e = cVar;
        this.f78227f = m0Var;
        this.f78228g = wVar;
        this.f78229h = rVar;
        this.f78230i = cVar2;
        this.f78231j = sVar;
        this.f78232k = iterable;
        this.f78233l = k0Var;
        this.f78234m = jVar;
        this.f78235n = aVar;
        this.f78236o = cVar3;
        this.f78237p = fVar;
        this.f78238q = lVar2;
        this.f78239r = aVar2;
        this.f78240s = list;
        this.f78241t = qVar;
        this.f78242u = new i(this);
    }

    @fg.l
    public final m a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar2) {
        l0.p(l0Var, ProtectedSandApp.s("籲\u0001"));
        l0.p(cVar, ProtectedSandApp.s("米\u0001"));
        l0.p(gVar, ProtectedSandApp.s("籴\u0001"));
        l0.p(hVar, ProtectedSandApp.s("籵\u0001"));
        l0.p(aVar, ProtectedSandApp.s("籶\u0001"));
        return new m(this, cVar, l0Var, gVar, hVar, aVar, gVar2, null, j0.f74919b);
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("籷\u0001"));
        return i.e(this.f78242u, bVar, null, 2, null);
    }

    @fg.l
    public final rd.a c() {
        return this.f78235n;
    }

    @fg.l
    public final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d() {
        return this.f78226e;
    }

    @fg.l
    public final h e() {
        return this.f78225d;
    }

    @fg.l
    public final i f() {
        return this.f78242u;
    }

    @fg.l
    public final l g() {
        return this.f78224c;
    }

    @fg.l
    public final j h() {
        return this.f78234m;
    }

    @fg.l
    public final q i() {
        return this.f78241t;
    }

    @fg.l
    public final r j() {
        return this.f78229h;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.protobuf.f k() {
        return this.f78237p;
    }

    @fg.l
    public final Iterable<rd.b> l() {
        return this.f78232k;
    }

    @fg.l
    public final s m() {
        return this.f78231j;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.types.checker.l n() {
        return this.f78238q;
    }

    @fg.l
    public final w o() {
        return this.f78228g;
    }

    @fg.l
    public final ud.c p() {
        return this.f78230i;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.h0 q() {
        return this.f78223b;
    }

    @fg.l
    public final k0 r() {
        return this.f78233l;
    }

    @fg.l
    public final m0 s() {
        return this.f78227f;
    }

    @fg.l
    public final rd.c t() {
        return this.f78236o;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.storage.n u() {
        return this.f78222a;
    }

    @fg.l
    public final List<c1> v() {
        return this.f78240s;
    }

    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.storage.n nVar, kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, l lVar, h hVar, c cVar, m0 m0Var, w wVar, r rVar, ud.c cVar2, s sVar, Iterable iterable, k0 k0Var, j jVar, rd.a aVar, rd.c cVar3, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, zd.a aVar2, List list, q qVar, int i4, kotlin.jvm.internal.w wVar2) {
        this(nVar, h0Var, lVar, hVar, cVar, m0Var, wVar, rVar, cVar2, sVar, iterable, k0Var, jVar, (i4 & 8192) != 0 ? a.C1384a.f89864a : aVar, (i4 & 16384) != 0 ? c.a.f89865a : cVar3, fVar, (65536 & i4) != 0 ? kotlin.reflect.jvm.internal.impl.types.checker.l.f78369b.a() : lVar2, aVar2, (262144 & i4) != 0 ? kotlin.collections.w.k(kotlin.reflect.jvm.internal.impl.types.p.f78523a) : list, (i4 & 524288) != 0 ? q.a.f78263a : qVar);
    }
}
