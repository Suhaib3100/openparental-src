package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.error.j;
import kotlin.reflect.jvm.internal.impl.types.error.k;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.text.m0;

/* compiled from: RawSubstitution.kt */
@r1({"SMAP\nRawSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n*L\n73#1:96\n73#1:97,3\n*E\n"})
/* loaded from: classes7.dex */
public final class g extends o1 {

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final a f76672e = new a();

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f76673f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f76674g;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final f f76675c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final k1 f76676d;

    /* compiled from: RawSubstitution.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: RawSubstitution.kt */
    static final class b extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f76677b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f76678c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0 f76679d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f76680e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, g gVar, p0 p0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
            super(1);
            this.f76677b = eVar;
            this.f76678c = gVar;
            this.f76679d = p0Var;
            this.f76680e = aVar;
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(@l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.name.b k4;
            kotlin.reflect.jvm.internal.impl.descriptors.e b5;
            l0.p(gVar, ProtectedSandApp.s("爲\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f76677b;
            if (eVar == null) {
                eVar = null;
            }
            if (eVar == null || (k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(eVar)) == null || (b5 = gVar.b(k4)) == null || l0.g(b5, this.f76677b)) {
                return null;
            }
            return (p0) this.f76678c.j(this.f76679d, b5, this.f76680e).e();
        }
    }

    static {
        s1 s1Var = s1.COMMON;
        f76673f = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1Var, false, true, null, 5, null).l(c.FLEXIBLE_LOWER_BOUND);
        f76674g = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1Var, false, true, null, 5, null).l(c.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0<p0, Boolean> j(p0 p0Var, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        if (p0Var.O0().getParameters().isEmpty()) {
            return new q0<>(p0Var, Boolean.FALSE);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.h.c0(p0Var)) {
            l1 l1Var = p0Var.M0().get(0);
            x1 c5 = l1Var.c();
            h0 type = l1Var.getType();
            l0.o(type, ProtectedSandApp.s("爷\u0001"));
            return new q0<>(i0.l(p0Var.N0(), p0Var.O0(), kotlin.collections.w.k(new n1(c5, k(type, aVar))), p0Var.P0(), null, 16, null), Boolean.FALSE);
        }
        if (j0.a(p0Var)) {
            return new q0<>(k.d(j.ERROR_RAW_TYPE, p0Var.O0().toString()), Boolean.FALSE);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h s02 = eVar.s0(this);
        l0.o(s02, ProtectedSandApp.s("爸\u0001"));
        d1 N0 = p0Var.N0();
        h1 j4 = eVar.j();
        l0.o(j4, ProtectedSandApp.s("爹\u0001"));
        List<f1> parameters = eVar.j().getParameters();
        l0.o(parameters, ProtectedSandApp.s("爺\u0001"));
        List<f1> list = parameters;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
        for (f1 f1Var : list) {
            f fVar = this.f76675c;
            l0.m(f1Var);
            arrayList.add(y.b(fVar, f1Var, aVar, this.f76676d, null, 8, null));
        }
        return new q0<>(i0.n(N0, j4, arrayList, p0Var.P0(), s02, new b(eVar, this, p0Var, aVar)), Boolean.TRUE);
    }

    private final h0 k(h0 h0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 instanceof f1) {
            return k(this.f76676d.c((f1) c5, aVar.j(true)), aVar);
        }
        if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            throw new IllegalStateException((ProtectedSandApp.s("爽\u0001") + c5).toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c6 = e0.d(h0Var).O0().c();
        if (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            q0<p0, Boolean> j4 = j(e0.c(h0Var), (kotlin.reflect.jvm.internal.impl.descriptors.e) c5, f76673f);
            p0 a5 = j4.a();
            boolean booleanValue = j4.b().booleanValue();
            q0<p0, Boolean> j5 = j(e0.d(h0Var), (kotlin.reflect.jvm.internal.impl.descriptors.e) c6, f76674g);
            p0 a6 = j5.a();
            return (booleanValue || j5.b().booleanValue()) ? new h(a5, a6) : i0.d(a5, a6);
        }
        throw new IllegalStateException((ProtectedSandApp.s("爻\u0001") + c6 + ProtectedSandApp.s("爼\u0001") + c5 + m0.quote).toString());
    }

    static /* synthetic */ h0 l(g gVar, h0 h0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a(s1.COMMON, null, false, false, null, null, 62, null);
        }
        return gVar.k(h0Var, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public n1 e(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("爾\u0001"));
        return new n1(l(this, h0Var, null, 2, null));
    }

    public g(@m k1 k1Var) {
        f fVar = new f();
        this.f76675c = fVar;
        this.f76676d = k1Var == null ? new k1(fVar, null, 2, null) : k1Var;
    }

    public /* synthetic */ g(k1 k1Var, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : k1Var);
    }
}
