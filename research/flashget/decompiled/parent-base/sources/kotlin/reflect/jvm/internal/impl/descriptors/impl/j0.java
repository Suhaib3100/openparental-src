package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.t0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeAliasConstructorDescriptor.kt */
@r1({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
/* loaded from: classes7.dex */
public final class j0 extends p implements i0 {

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n F;

    @fg.l
    private final e1 G;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.j H;

    @fg.l
    private kotlin.reflect.jvm.internal.impl.descriptors.d I;
    static final /* synthetic */ kotlin.reflect.o<Object>[] K = {l1.u(new g1(l1.d(j0.class), ProtectedSandApp.s("泪\u0001"), ProtectedSandApp.s("泫\u0001")))};

    @fg.l
    public static final a J = new a();

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    @r1({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1559#2:239\n1590#2,4:240\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n*L\n209#1:239\n209#1:240,4\n*E\n"})
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final q1 c(e1 e1Var) {
            if (e1Var.y() == null) {
                return null;
            }
            return q1.f(e1Var.K());
        }

        @fg.m
        public final i0 b(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l e1 e1Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.d d5;
            List<x0> list;
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("泟\u0001"));
            kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("泠\u0001"));
            kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("泡\u0001"));
            q1 c5 = c(e1Var);
            if (c5 == null || (d5 = dVar.d(c5)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = dVar.getAnnotations();
            b.a b5 = dVar.b();
            kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("波\u0001"));
            a1 f4 = e1Var.f();
            kotlin.jvm.internal.l0.o(f4, ProtectedSandApp.s("泣\u0001"));
            j0 j0Var = new j0(nVar, e1Var, d5, null, annotations, b5, f4, null);
            List<j1> P0 = p.P0(j0Var, dVar.i(), c5);
            if (P0 == null) {
                return null;
            }
            p0 c6 = kotlin.reflect.jvm.internal.impl.types.e0.c(d5.getReturnType().R0());
            p0 r4 = e1Var.r();
            kotlin.jvm.internal.l0.o(r4, ProtectedSandApp.s("泤\u0001"));
            p0 j4 = t0.j(c6, r4);
            x0 O = dVar.O();
            x0 i4 = O != null ? kotlin.reflect.jvm.internal.impl.resolve.e.i(j0Var, c5.n(O.getType(), x1.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b()) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.e y4 = e1Var.y();
            if (y4 != null) {
                List<x0> z02 = dVar.z0();
                kotlin.jvm.internal.l0.o(z02, ProtectedSandApp.s("泥\u0001"));
                List<x0> list2 = z02;
                list = new ArrayList<>(kotlin.collections.w.b0(list2, 10));
                int i5 = 0;
                for (Object obj : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        kotlin.collections.w.Z();
                    }
                    x0 x0Var = (x0) obj;
                    kotlin.reflect.jvm.internal.impl.types.h0 n4 = c5.n(x0Var.getType(), x1.INVARIANT);
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h value = x0Var.getValue();
                    kotlin.jvm.internal.l0.n(value, ProtectedSandApp.s("泦\u0001"));
                    list.add(kotlin.reflect.jvm.internal.impl.resolve.e.c(y4, n4, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) value).a(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), i5));
                    i5 = i6;
                }
            } else {
                list = kotlin.collections.j0.f74919b;
            }
            j0Var.S0(i4, null, list, e1Var.s(), P0, j4, kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, e1Var.getVisibility());
            return j0Var;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    @r1({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1549#2:239\n1620#2,3:240\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2\n*L\n87#1:239\n87#1:240,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<j0> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f76037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            super(0);
            this.f76037c = dVar;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            kotlin.reflect.jvm.internal.impl.storage.n P = j0.this.P();
            e1 p12 = j0.this.p1();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = this.f76037c;
            j0 j0Var = j0.this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = dVar.getAnnotations();
            b.a b5 = this.f76037c.b();
            kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("泧\u0001"));
            a1 f4 = j0.this.p1().f();
            kotlin.jvm.internal.l0.o(f4, ProtectedSandApp.s("注\u0001"));
            j0 j0Var2 = new j0(P, p12, dVar, j0Var, annotations, b5, f4, null);
            j0 j0Var3 = j0.this;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = this.f76037c;
            q1 c5 = j0.J.c(j0Var3.p1());
            if (c5 == null) {
                return null;
            }
            x0 O = dVar2.O();
            x0 d5 = O != null ? O.d(c5) : null;
            List<x0> z02 = dVar2.z0();
            kotlin.jvm.internal.l0.o(z02, ProtectedSandApp.s("泩\u0001"));
            List<x0> list = z02;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((x0) it.next()).d(c5));
            }
            j0Var2.S0(null, d5, arrayList, j0Var3.p1().s(), j0Var3.i(), j0Var3.getReturnType(), kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, j0Var3.p1().getVisibility());
            return j0Var2;
        }
    }

    public /* synthetic */ j0(kotlin.reflect.jvm.internal.impl.storage.n nVar, e1 e1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, b.a aVar, a1 a1Var, kotlin.jvm.internal.w wVar) {
        this(nVar, e1Var, dVar, i0Var, gVar, aVar, a1Var);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.storage.n P() {
        return this.F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.d V() {
        return this.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.i c() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public boolean f0() {
        return this.I.f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e g0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e g02 = this.I.g0();
        kotlin.jvm.internal.l0.o(g02, ProtectedSandApp.s("泬\u0001"));
        return g02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h0 getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.h0 returnType = super.getReturnType();
        kotlin.jvm.internal.l0.m(returnType);
        return returnType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public i0 R(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @fg.l b.a aVar, boolean z4) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("泭\u0001"));
        kotlin.jvm.internal.l0.p(e0Var, ProtectedSandApp.s("泮\u0001"));
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("泯\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("泰\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.z a5 = A().r(mVar).l(e0Var).i(uVar).s(aVar).p(z4).a();
        kotlin.jvm.internal.l0.n(a5, ProtectedSandApp.s("泱\u0001"));
        return (i0) a5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @fg.l
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public j0 M0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("泭\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("泰\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("泲\u0001"));
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("泳\u0001"));
        b.a aVar2 = b.a.DECLARATION;
        if (aVar != aVar2) {
            b.a aVar3 = b.a.SYNTHESIZED;
        }
        return new j0(this.F, this.G, this.I, this, gVar, aVar2, a1Var);
    }

    @fg.l
    public e1 n1() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public i0 a() {
        kotlin.reflect.jvm.internal.impl.descriptors.z a5 = super.a();
        kotlin.jvm.internal.l0.n(a5, ProtectedSandApp.s("泱\u0001"));
        return (i0) a5;
    }

    @fg.l
    public e1 p1() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.c1
    @fg.m
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public i0 d(@fg.l q1 q1Var) {
        kotlin.jvm.internal.l0.p(q1Var, ProtectedSandApp.s("泴\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.z d5 = super.d(q1Var);
        kotlin.jvm.internal.l0.n(d5, ProtectedSandApp.s("泵\u0001"));
        j0 j0Var = (j0) d5;
        q1 f4 = q1.f(j0Var.getReturnType());
        kotlin.jvm.internal.l0.o(f4, ProtectedSandApp.s("泶\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.d d6 = this.I.a().d(f4);
        if (d6 == null) {
            return null;
        }
        j0Var.I = d6;
        return j0Var;
    }

    private j0(kotlin.reflect.jvm.internal.impl.storage.n nVar, e1 e1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, b.a aVar, a1 a1Var) {
        super(e1Var, i0Var, gVar, kotlin.reflect.jvm.internal.impl.name.h.f77596i, aVar, a1Var);
        this.F = nVar;
        this.G = e1Var;
        W0(e1Var.a0());
        this.H = nVar.i(new b(dVar));
        this.I = dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        return this.G;
    }
}
