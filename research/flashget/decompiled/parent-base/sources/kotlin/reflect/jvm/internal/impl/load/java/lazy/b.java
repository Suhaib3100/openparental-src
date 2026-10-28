package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.load.java.p;
import kotlin.reflect.jvm.internal.impl.load.java.q;
import kotlin.reflect.jvm.internal.impl.load.java.u;
import kotlin.reflect.jvm.internal.impl.load.java.x;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: context.kt */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final n f76462a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final p f76463b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final r f76464c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.j f76465d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.components.j f76466e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.r f76467f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.components.g f76468g;

    /* renamed from: h, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.components.f f76469h;

    /* renamed from: i, reason: collision with root package name */
    @l
    private final zd.a f76470i;

    /* renamed from: j, reason: collision with root package name */
    @l
    private final vd.b f76471j;

    /* renamed from: k, reason: collision with root package name */
    @l
    private final i f76472k;

    /* renamed from: l, reason: collision with root package name */
    @l
    private final z f76473l;

    /* renamed from: m, reason: collision with root package name */
    @l
    private final d1 f76474m;

    /* renamed from: n, reason: collision with root package name */
    @l
    private final ud.c f76475n;

    /* renamed from: o, reason: collision with root package name */
    @l
    private final h0 f76476o;

    /* renamed from: p, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.builtins.j f76477p;

    /* renamed from: q, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.d f76478q;

    /* renamed from: r, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l f76479r;

    /* renamed from: s, reason: collision with root package name */
    @l
    private final q f76480s;

    /* renamed from: t, reason: collision with root package name */
    @l
    private final c f76481t;

    /* renamed from: u, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.types.checker.l f76482u;

    /* renamed from: v, reason: collision with root package name */
    @l
    private final x f76483v;

    /* renamed from: w, reason: collision with root package name */
    @l
    private final u f76484w;

    /* renamed from: x, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.f f76485x;

    public b(@l n nVar, @l p pVar, @l r rVar, @l kotlin.reflect.jvm.internal.impl.load.kotlin.j jVar, @l kotlin.reflect.jvm.internal.impl.load.java.components.j jVar2, @l kotlin.reflect.jvm.internal.impl.serialization.deserialization.r rVar2, @l kotlin.reflect.jvm.internal.impl.load.java.components.g gVar, @l kotlin.reflect.jvm.internal.impl.load.java.components.f fVar, @l zd.a aVar, @l vd.b bVar, @l i iVar, @l z zVar, @l d1 d1Var, @l ud.c cVar, @l h0 h0Var, @l kotlin.reflect.jvm.internal.impl.builtins.j jVar3, @l kotlin.reflect.jvm.internal.impl.load.java.d dVar, @l kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l lVar, @l q qVar, @l c cVar2, @l kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, @l x xVar, @l u uVar, @l kotlin.reflect.jvm.internal.impl.resolve.jvm.f fVar2) {
        l0.p(nVar, ProtectedSandApp.s("焕\u0001"));
        l0.p(pVar, ProtectedSandApp.s("焖\u0001"));
        l0.p(rVar, ProtectedSandApp.s("焗\u0001"));
        l0.p(jVar, ProtectedSandApp.s("焘\u0001"));
        l0.p(jVar2, ProtectedSandApp.s("焙\u0001"));
        l0.p(rVar2, ProtectedSandApp.s("焚\u0001"));
        l0.p(gVar, ProtectedSandApp.s("焛\u0001"));
        l0.p(fVar, ProtectedSandApp.s("焜\u0001"));
        l0.p(aVar, ProtectedSandApp.s("焝\u0001"));
        l0.p(bVar, ProtectedSandApp.s("焞\u0001"));
        l0.p(iVar, ProtectedSandApp.s("焟\u0001"));
        l0.p(zVar, ProtectedSandApp.s("焠\u0001"));
        l0.p(d1Var, ProtectedSandApp.s("無\u0001"));
        l0.p(cVar, ProtectedSandApp.s("焢\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("焣\u0001"));
        l0.p(jVar3, ProtectedSandApp.s("焤\u0001"));
        l0.p(dVar, ProtectedSandApp.s("焥\u0001"));
        l0.p(lVar, ProtectedSandApp.s("焦\u0001"));
        l0.p(qVar, ProtectedSandApp.s("焧\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("焨\u0001"));
        l0.p(lVar2, ProtectedSandApp.s("焩\u0001"));
        l0.p(xVar, ProtectedSandApp.s("焪\u0001"));
        l0.p(uVar, ProtectedSandApp.s("焫\u0001"));
        l0.p(fVar2, ProtectedSandApp.s("焬\u0001"));
        this.f76462a = nVar;
        this.f76463b = pVar;
        this.f76464c = rVar;
        this.f76465d = jVar;
        this.f76466e = jVar2;
        this.f76467f = rVar2;
        this.f76468g = gVar;
        this.f76469h = fVar;
        this.f76470i = aVar;
        this.f76471j = bVar;
        this.f76472k = iVar;
        this.f76473l = zVar;
        this.f76474m = d1Var;
        this.f76475n = cVar;
        this.f76476o = h0Var;
        this.f76477p = jVar3;
        this.f76478q = dVar;
        this.f76479r = lVar;
        this.f76480s = qVar;
        this.f76481t = cVar2;
        this.f76482u = lVar2;
        this.f76483v = xVar;
        this.f76484w = uVar;
        this.f76485x = fVar2;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.java.d a() {
        return this.f76478q;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.j b() {
        return this.f76465d;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.r c() {
        return this.f76467f;
    }

    @l
    public final p d() {
        return this.f76463b;
    }

    @l
    public final q e() {
        return this.f76480s;
    }

    @l
    public final u f() {
        return this.f76484w;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.java.components.f g() {
        return this.f76469h;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.java.components.g h() {
        return this.f76468g;
    }

    @l
    public final x i() {
        return this.f76483v;
    }

    @l
    public final r j() {
        return this.f76464c;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.types.checker.l k() {
        return this.f76482u;
    }

    @l
    public final ud.c l() {
        return this.f76475n;
    }

    @l
    public final h0 m() {
        return this.f76476o;
    }

    @l
    public final i n() {
        return this.f76472k;
    }

    @l
    public final z o() {
        return this.f76473l;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.builtins.j p() {
        return this.f76477p;
    }

    @l
    public final c q() {
        return this.f76481t;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l r() {
        return this.f76479r;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.java.components.j s() {
        return this.f76466e;
    }

    @l
    public final vd.b t() {
        return this.f76471j;
    }

    @l
    public final n u() {
        return this.f76462a;
    }

    @l
    public final d1 v() {
        return this.f76474m;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.f w() {
        return this.f76485x;
    }

    @l
    public final b x(@l kotlin.reflect.jvm.internal.impl.load.java.components.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("焛\u0001"));
        return new b(this.f76462a, this.f76463b, this.f76464c, this.f76465d, this.f76466e, this.f76467f, gVar, this.f76469h, this.f76470i, this.f76471j, this.f76472k, this.f76473l, this.f76474m, this.f76475n, this.f76476o, this.f76477p, this.f76478q, this.f76479r, this.f76480s, this.f76481t, this.f76482u, this.f76483v, this.f76484w, null, 8388608, null);
    }

    public /* synthetic */ b(n nVar, p pVar, r rVar, kotlin.reflect.jvm.internal.impl.load.kotlin.j jVar, kotlin.reflect.jvm.internal.impl.load.java.components.j jVar2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.r rVar2, kotlin.reflect.jvm.internal.impl.load.java.components.g gVar, kotlin.reflect.jvm.internal.impl.load.java.components.f fVar, zd.a aVar, vd.b bVar, i iVar, z zVar, d1 d1Var, ud.c cVar, h0 h0Var, kotlin.reflect.jvm.internal.impl.builtins.j jVar3, kotlin.reflect.jvm.internal.impl.load.java.d dVar, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l lVar, q qVar, c cVar2, kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, x xVar, u uVar, kotlin.reflect.jvm.internal.impl.resolve.jvm.f fVar2, int i4, w wVar) {
        this(nVar, pVar, rVar, jVar, jVar2, rVar2, gVar, fVar, aVar, bVar, iVar, zVar, d1Var, cVar, h0Var, jVar3, dVar, lVar, qVar, cVar2, lVar2, xVar, uVar, (i4 & 8388608) != 0 ? kotlin.reflect.jvm.internal.impl.resolve.jvm.f.f77925a.a() : fVar2);
    }
}
