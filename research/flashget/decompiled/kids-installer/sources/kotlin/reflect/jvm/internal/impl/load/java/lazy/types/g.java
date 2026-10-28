package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
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
import kotlin.text.Typography;
import q3.l;

/* compiled from: RawSubstitution.kt */
/* loaded from: classes5.dex */
public final class g extends o1 {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final a f24797e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f24798f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f24799g;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final f f24800c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final k1 f24801d;

    /* compiled from: RawSubstitution.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: RawSubstitution.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f24802p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f24803q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ p0 f24804r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f24805s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, g gVar, p0 p0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
            super(1);
            this.f24802p = eVar;
            this.f24803q = gVar;
            this.f24804r = p0Var;
            this.f24805s = aVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 N(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.name.b k5;
            kotlin.reflect.jvm.internal.impl.descriptors.e b6;
            l0.p(gVar, ProtectedSandApp.s("蕩"));
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f24802p;
            if (!(eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                eVar = null;
            }
            if (eVar == null || (k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(eVar)) == null || (b6 = gVar.b(k5)) == null || l0.g(b6, this.f24802p)) {
                return null;
            }
            return (p0) this.f24803q.j(this.f24804r, b6, this.f24805s).e();
        }
    }

    static {
        s1 s1Var = s1.COMMON;
        f24798f = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1Var, false, true, null, 5, null).l(c.FLEXIBLE_LOWER_BOUND);
        f24799g = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1Var, false, true, null, 5, null).l(c.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<p0, Boolean> j(p0 p0Var, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        int b02;
        List k5;
        if (p0Var.U0().r().isEmpty()) {
            return new Pair<>(p0Var, Boolean.FALSE);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.h.c0(p0Var)) {
            l1 l1Var = p0Var.S0().get(0);
            x1 b6 = l1Var.b();
            h0 type = l1Var.getType();
            l0.o(type, ProtectedSandApp.s("䪮"));
            k5 = z.k(new n1(b6, k(type, aVar)));
            return new Pair<>(i0.l(p0Var.T0(), p0Var.U0(), k5, p0Var.V0(), null, 16, null), Boolean.FALSE);
        }
        if (j0.a(p0Var)) {
            return new Pair<>(k.d(j.ERROR_RAW_TYPE, p0Var.U0().toString()), Boolean.FALSE);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h h02 = eVar.h0(this);
        l0.o(h02, ProtectedSandApp.s("䪯"));
        d1 T0 = p0Var.T0();
        h1 m5 = eVar.m();
        l0.o(m5, ProtectedSandApp.s("䪰"));
        List<f1> r5 = eVar.m().r();
        l0.o(r5, ProtectedSandApp.s("䪱"));
        b02 = b0.b0(r5, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (f1 f1Var : r5) {
            f fVar = this.f24800c;
            l0.o(f1Var, ProtectedSandApp.s("䪲"));
            arrayList.add(y.b(fVar, f1Var, aVar, this.f24801d, null, 8, null));
        }
        return new Pair<>(i0.n(T0, m5, arrayList, p0Var.V0(), h02, new b(eVar, this, p0Var, aVar)), Boolean.TRUE);
    }

    private final h0 k(h0 h0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (b6 instanceof f1) {
            return k(this.f24801d.c((f1) b6, aVar.j(true)), aVar);
        }
        if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            throw new IllegalStateException((ProtectedSandApp.s("䪵") + b6).toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b7 = e0.d(h0Var).U0().b();
        if (b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            Pair<p0, Boolean> j5 = j(e0.c(h0Var), (kotlin.reflect.jvm.internal.impl.descriptors.e) b6, f24798f);
            p0 a6 = j5.a();
            boolean booleanValue = j5.b().booleanValue();
            Pair<p0, Boolean> j6 = j(e0.d(h0Var), (kotlin.reflect.jvm.internal.impl.descriptors.e) b7, f24799g);
            p0 a7 = j6.a();
            return (booleanValue || j6.b().booleanValue()) ? new h(a6, a7) : i0.d(a6, a7);
        }
        throw new IllegalStateException((ProtectedSandApp.s("䪳") + b7 + ProtectedSandApp.s("䪴") + b6 + Typography.f27126b).toString());
    }

    static /* synthetic */ h0 l(g gVar, h0 h0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            aVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a(s1.COMMON, null, false, false, null, null, 62, null);
        }
        return gVar.k(h0Var, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @d5.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public n1 e(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䪶"));
        return new n1(l(this, h0Var, null, 2, null));
    }

    public g(@d5.e k1 k1Var) {
        f fVar = new f();
        this.f24800c = fVar;
        this.f24801d = k1Var == null ? new k1(fVar, null, 2, null) : k1Var;
    }

    public /* synthetic */ g(k1 k1Var, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : k1Var);
    }
}
