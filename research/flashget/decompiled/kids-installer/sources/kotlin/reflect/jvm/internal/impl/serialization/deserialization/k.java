package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.types.c1;

/* compiled from: context.kt */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.n f26213a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h0 f26214b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final l f26215c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final h f26216d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f26217e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final m0 f26218f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final v f26219g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private final r f26220h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private final z3.c f26221i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private final s f26222j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    private final Iterable<w3.b> f26223k;

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    private final k0 f26224l;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    private final j f26225m;

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    private final w3.a f26226n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final w3.c f26227o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.protobuf.f f26228p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.l f26229q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final e4.a f26230r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final w3.e f26231s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final List<c1> f26232t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final i f26233u;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d h0 h0Var, @d5.d l lVar, @d5.d h hVar, @d5.d c<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> cVar, @d5.d m0 m0Var, @d5.d v vVar, @d5.d r rVar, @d5.d z3.c cVar2, @d5.d s sVar, @d5.d Iterable<? extends w3.b> iterable, @d5.d k0 k0Var, @d5.d j jVar, @d5.d w3.a aVar, @d5.d w3.c cVar3, @d5.d kotlin.reflect.jvm.internal.impl.protobuf.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, @d5.d e4.a aVar2, @d5.d w3.e eVar, @d5.d List<? extends c1> list) {
        l0.p(nVar, ProtectedSandApp.s("吗"));
        l0.p(h0Var, ProtectedSandApp.s("吘"));
        l0.p(lVar, ProtectedSandApp.s("吙"));
        l0.p(hVar, ProtectedSandApp.s("吚"));
        l0.p(cVar, ProtectedSandApp.s("君"));
        l0.p(m0Var, ProtectedSandApp.s("吜"));
        l0.p(vVar, ProtectedSandApp.s("吝"));
        l0.p(rVar, ProtectedSandApp.s("吞"));
        l0.p(cVar2, ProtectedSandApp.s("吟"));
        l0.p(sVar, ProtectedSandApp.s("吠"));
        l0.p(iterable, ProtectedSandApp.s("吡"));
        l0.p(k0Var, ProtectedSandApp.s("吢"));
        l0.p(jVar, ProtectedSandApp.s("吣"));
        l0.p(aVar, ProtectedSandApp.s("吤"));
        l0.p(cVar3, ProtectedSandApp.s("吥"));
        l0.p(fVar, ProtectedSandApp.s("否"));
        l0.p(lVar2, ProtectedSandApp.s("吧"));
        l0.p(aVar2, ProtectedSandApp.s("吨"));
        l0.p(eVar, ProtectedSandApp.s("吩"));
        l0.p(list, ProtectedSandApp.s("吪"));
        this.f26213a = nVar;
        this.f26214b = h0Var;
        this.f26215c = lVar;
        this.f26216d = hVar;
        this.f26217e = cVar;
        this.f26218f = m0Var;
        this.f26219g = vVar;
        this.f26220h = rVar;
        this.f26221i = cVar2;
        this.f26222j = sVar;
        this.f26223k = iterable;
        this.f26224l = k0Var;
        this.f26225m = jVar;
        this.f26226n = aVar;
        this.f26227o = cVar3;
        this.f26228p = fVar;
        this.f26229q = lVar2;
        this.f26230r = aVar2;
        this.f26231s = eVar;
        this.f26232t = list;
        this.f26233u = new i(this);
    }

    @d5.d
    public final m a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar2) {
        l0.p(l0Var, ProtectedSandApp.s("含"));
        l0.p(cVar, ProtectedSandApp.s("听"));
        l0.p(gVar, ProtectedSandApp.s("吭"));
        l0.p(hVar, ProtectedSandApp.s("吮"));
        l0.p(aVar, ProtectedSandApp.s("启"));
        return new m(this, cVar, l0Var, gVar, hVar, aVar, gVar2, null, EmptyList.f23167o);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("吰"));
        return i.e(this.f26233u, bVar, null, 2, null);
    }

    @d5.d
    public final w3.a c() {
        return this.f26226n;
    }

    @d5.d
    public final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d() {
        return this.f26217e;
    }

    @d5.d
    public final h e() {
        return this.f26216d;
    }

    @d5.d
    public final i f() {
        return this.f26233u;
    }

    @d5.d
    public final l g() {
        return this.f26215c;
    }

    @d5.d
    public final j h() {
        return this.f26225m;
    }

    @d5.d
    public final r i() {
        return this.f26220h;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.protobuf.f j() {
        return this.f26228p;
    }

    @d5.d
    public final Iterable<w3.b> k() {
        return this.f26223k;
    }

    @d5.d
    public final s l() {
        return this.f26222j;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.types.checker.l m() {
        return this.f26229q;
    }

    @d5.d
    public final v n() {
        return this.f26219g;
    }

    @d5.d
    public final z3.c o() {
        return this.f26221i;
    }

    @d5.d
    public final h0 p() {
        return this.f26214b;
    }

    @d5.d
    public final k0 q() {
        return this.f26224l;
    }

    @d5.d
    public final m0 r() {
        return this.f26218f;
    }

    @d5.d
    public final w3.c s() {
        return this.f26227o;
    }

    @d5.d
    public final w3.e t() {
        return this.f26231s;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.storage.n u() {
        return this.f26213a;
    }

    @d5.d
    public final List<c1> v() {
        return this.f26232t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.storage.n r24, kotlin.reflect.jvm.internal.impl.descriptors.h0 r25, kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r26, kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r27, kotlin.reflect.jvm.internal.impl.serialization.deserialization.c r28, kotlin.reflect.jvm.internal.impl.descriptors.m0 r29, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r30, kotlin.reflect.jvm.internal.impl.serialization.deserialization.r r31, z3.c r32, kotlin.reflect.jvm.internal.impl.serialization.deserialization.s r33, java.lang.Iterable r34, kotlin.reflect.jvm.internal.impl.descriptors.k0 r35, kotlin.reflect.jvm.internal.impl.serialization.deserialization.j r36, w3.a r37, w3.c r38, kotlin.reflect.jvm.internal.impl.protobuf.f r39, kotlin.reflect.jvm.internal.impl.types.checker.l r40, e4.a r41, w3.e r42, java.util.List r43, int r44, kotlin.jvm.internal.w r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto Lb
            w3.a$a r1 = w3.a.C0517a.f34018a
            r16 = r1
            goto Ld
        Lb:
            r16 = r37
        Ld:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L16
            w3.c$a r1 = w3.c.a.f34019a
            r17 = r1
            goto L18
        L16:
            r17 = r38
        L18:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.types.checker.l$a r1 = kotlin.reflect.jvm.internal.impl.types.checker.l.f26361b
            kotlin.reflect.jvm.internal.impl.types.checker.m r1 = r1.a()
            r19 = r1
            goto L28
        L26:
            r19 = r40
        L28:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L32
            w3.e$a r1 = w3.e.a.f34022a
            r21 = r1
            goto L34
        L32:
            r21 = r42
        L34:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.types.p r0 = kotlin.reflect.jvm.internal.impl.types.p.f26514a
            java.util.List r0 = kotlin.collections.y.k(r0)
            r22 = r0
            goto L44
        L42:
            r22 = r43
        L44:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.<init>(kotlin.reflect.jvm.internal.impl.storage.n, kotlin.reflect.jvm.internal.impl.descriptors.h0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.l, kotlin.reflect.jvm.internal.impl.serialization.deserialization.h, kotlin.reflect.jvm.internal.impl.serialization.deserialization.c, kotlin.reflect.jvm.internal.impl.descriptors.m0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v, kotlin.reflect.jvm.internal.impl.serialization.deserialization.r, z3.c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.s, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.descriptors.k0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.j, w3.a, w3.c, kotlin.reflect.jvm.internal.impl.protobuf.f, kotlin.reflect.jvm.internal.impl.types.checker.l, e4.a, w3.e, java.util.List, int, kotlin.jvm.internal.w):void");
    }
}
