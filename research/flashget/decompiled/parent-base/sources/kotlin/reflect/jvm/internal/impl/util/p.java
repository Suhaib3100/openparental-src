package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.util.k;
import kotlin.reflect.jvm.internal.impl.util.r;
import kotlin.reflect.jvm.internal.impl.util.t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public final class p extends kotlin.reflect.jvm.internal.impl.util.b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final p f78614a = new p();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final List<h> f78615b;

    /* compiled from: modifierChecks.kt */
    @r1({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n1#2:265\n171#3:266\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$1\n*L\n189#1:266\n*E\n"})
    static final class a extends n0 implements ld.l<z, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f78616b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("胗\u0001"));
            List<j1> i4 = zVar.i();
            l0.o(i4, ProtectedSandApp.s("胘\u0001"));
            j1 j1Var = (j1) w.v3(i4);
            boolean z4 = false;
            if (j1Var != null && !kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(j1Var) && j1Var.x0() == null) {
                z4 = true;
            }
            p pVar = p.f78614a;
            if (z4) {
                return null;
            }
            return ProtectedSandApp.s("胙\u0001");
        }
    }

    /* compiled from: modifierChecks.kt */
    @r1({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n1747#2,3:265\n171#3:268\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$2\n*L\n203#1:265,3\n203#1:268\n*E\n"})
    static final class b extends n0 implements ld.l<z, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f78617b = new b(1);

        b() {
            super(1);
        }

        private static final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && kotlin.reflect.jvm.internal.impl.builtins.h.a0((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cb A[ORIG_RETURN, RETURN] */
        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z r4) {
            /*
                r3 = this;
                java.lang.String r0 = "胚\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.util.p r0 = kotlin.reflect.jvm.internal.impl.util.p.f78614a
                kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r4.c()
                java.lang.String r1 = "胛\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                boolean r0 = b(r0)
                if (r0 != 0) goto L5e
                java.util.Collection r0 = r4.e()
                java.lang.String r2 = "胜\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r0, r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L37
                goto L55
            L37:
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L55
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.descriptors.z r2 = (kotlin.reflect.jvm.internal.impl.descriptors.z) r2
                kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r2.c()
                kotlin.jvm.internal.l0.o(r2, r1)
                boolean r2 = b(r2)
                if (r2 == 0) goto L3b
                goto L5e
            L55:
                boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.s.c(r4)
                if (r0 == 0) goto L5c
                goto L5e
            L5c:
                r0 = 0
                goto L5f
            L5e:
                r0 = 1
            L5f:
                if (r0 != 0) goto Lcb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "胝\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                r0.<init>(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r4.c()
                kotlin.jvm.internal.l0.o(r2, r1)
                boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.h.g(r2)
                if (r1 == 0) goto Lbd
                kotlin.reflect.jvm.internal.impl.renderer.c r1 = kotlin.reflect.jvm.internal.impl.renderer.c.f77800i
                kotlin.reflect.jvm.internal.impl.descriptors.m r4 = r4.c()
                java.lang.String r2 = "胞\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.n(r4, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r4
                kotlin.reflect.jvm.internal.impl.types.p0 r4 = r4.r()
                java.lang.String r2 = "胟\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r4, r2)
                kotlin.reflect.jvm.internal.impl.types.h0 r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.y(r4)
                java.lang.String r4 = r1.y(r4)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "胠\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r4 = "胡\u0001"
                java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.append(r4)
            Lbd:
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "胢\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r4, r0)
                goto Lcc
            Lcb:
                r4 = 0
            Lcc:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.p.b.invoke(kotlin.reflect.jvm.internal.impl.descriptors.z):java.lang.String");
        }
    }

    /* compiled from: modifierChecks.kt */
    @r1({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n+ 2 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n171#2:265\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n*L\n220#1:265\n*E\n"})
    static final class c extends n0 implements ld.l<z, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f78618b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l z zVar) {
            boolean z4;
            l0.p(zVar, ProtectedSandApp.s("胣\u0001"));
            x0 O = zVar.O();
            if (O == null) {
                O = zVar.S();
            }
            p pVar = p.f78614a;
            boolean z5 = false;
            if (O != null) {
                h0 returnType = zVar.getReturnType();
                if (returnType != null) {
                    h0 type = O.getType();
                    l0.o(type, ProtectedSandApp.s("胤\u0001"));
                    z4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.r(returnType, type);
                } else {
                    z4 = false;
                }
                if (z4 || pVar.d(zVar, O)) {
                    z5 = true;
                }
            }
            if (z5) {
                return null;
            }
            return ProtectedSandApp.s("胥\u0001");
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.f fVar = q.f78629k;
        k.b bVar = k.b.f78606b;
        h hVar = new h(fVar, new f[]{bVar, new t.a(1)}, (ld.l) null, 4, (kotlin.jvm.internal.w) null);
        h hVar2 = new h(q.f78630l, new f[]{bVar, new t.a(2)}, a.f78616b);
        kotlin.reflect.jvm.internal.impl.name.f fVar2 = q.f78620b;
        m mVar = m.f78608a;
        t.a aVar = new t.a(2);
        j jVar = j.f78602a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null);
        h hVar4 = new h(q.f78621c, new f[]{bVar, mVar, new t.a(3), jVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null);
        h hVar5 = new h(q.f78622d, new f[]{bVar, mVar, new t.b(2), jVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null);
        h hVar6 = new h(q.f78627i, new f[]{bVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null);
        kotlin.reflect.jvm.internal.impl.name.f fVar3 = q.f78626h;
        t.d dVar = t.d.f78661b;
        r.a aVar2 = r.a.f78648d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (ld.l) null, 4, (kotlin.jvm.internal.w) null);
        kotlin.reflect.jvm.internal.impl.name.f fVar4 = q.f78628j;
        t.c cVar = t.c.f78660b;
        f78615b = w.O(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.f78631m, new f[]{bVar, cVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.f78632n, new f[]{bVar, cVar, aVar2}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.I, new f[]{bVar, dVar, mVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.J, new f[]{bVar, dVar, mVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.f78623e, new f[]{k.a.f78605b}, b.f78617b), new h(q.f78625g, new f[]{bVar, r.b.f78650d, dVar, mVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.S, new f[]{bVar, dVar, mVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.R, new f[]{bVar, cVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(w.O(q.f78642x, q.f78643y), new f[]{bVar}, c.f78618b), new h(q.V, new f[]{bVar, r.c.f78652d, dVar, mVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null), new h(q.f78634p, new f[]{bVar, cVar}, (ld.l) null, 4, (kotlin.jvm.internal.w) null));
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(z zVar, x0 x0Var) {
        kotlin.reflect.jvm.internal.impl.name.b k4;
        h0 returnType;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h value = x0Var.getValue();
        l0.o(value, ProtectedSandApp.s("胦\u0001"));
        if (!(value instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e y4 = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e) value).y();
        if (!y4.m0() || (k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(y4)) == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b5 = y.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(y4), k4);
        e1 e1Var = b5 instanceof e1 ? (e1) b5 : null;
        if (e1Var == null || (returnType = zVar.getReturnType()) == null) {
            return false;
        }
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.r(returnType, e1Var.K());
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    @fg.l
    public List<h> b() {
        return f78615b;
    }
}
