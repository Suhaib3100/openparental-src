package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.constraintlayout.motion.widget.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.collections.r1;
import kotlin.collections.y;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.types.g0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.types.y1;
import kotlin.text.Typography;

/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes5.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.renderer.c implements kotlin.reflect.jvm.internal.impl.renderer.f {

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.renderer.g f25833l;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    private final Lazy f25834m;

    /* compiled from: DescriptorRendererImpl.kt */
    private final class a implements o<m2, StringBuilder> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0368a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25836a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f25836a = iArr;
            }
        }

        public a() {
        }

        private final void t(t0 t0Var, StringBuilder sb, String str) {
            int i5 = C0368a.f25836a[d.this.n0().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
                p(t0Var, sb);
                return;
            }
            d.B(d.this, t0Var, sb);
            sb.append(str + ProtectedSandApp.s("侞"));
            d dVar = d.this;
            u0 I0 = t0Var.I0();
            l0.o(I0, ProtectedSandApp.s("侟"));
            dVar.C1(I0, sb);
        }

        public void A(@d5.d j1 j1Var, @d5.d StringBuilder sb) {
            l0.p(j1Var, ProtectedSandApp.s("侠"));
            l0.p(sb, ProtectedSandApp.s("価"));
            d.this.U1(j1Var, true, sb, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
            n(eVar, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 b(v0 v0Var, StringBuilder sb) {
            v(v0Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 c(q0 q0Var, StringBuilder sb) {
            s(q0Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 d(u0 u0Var, StringBuilder sb) {
            u(u0Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 e(e1 e1Var, StringBuilder sb) {
            y(e1Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 f(kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, StringBuilder sb) {
            r(l0Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 g(z zVar, StringBuilder sb) {
            p(zVar, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 h(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, StringBuilder sb) {
            o(lVar, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 i(w0 w0Var, StringBuilder sb) {
            w(w0Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 j(h0 h0Var, StringBuilder sb) {
            q(h0Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 k(j1 j1Var, StringBuilder sb) {
            A(j1Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 l(x0 x0Var, StringBuilder sb) {
            x(x0Var, sb);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ m2 m(f1 f1Var, StringBuilder sb) {
            z(f1Var, sb);
            return m2.f23662a;
        }

        public void n(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d StringBuilder sb) {
            l0.p(eVar, ProtectedSandApp.s("侢"));
            l0.p(sb, ProtectedSandApp.s("侣"));
            d.this.Z0(eVar, sb);
        }

        public void o(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @d5.d StringBuilder sb) {
            l0.p(lVar, ProtectedSandApp.s("侤"));
            l0.p(sb, ProtectedSandApp.s("侥"));
            d.this.e1(lVar, sb);
        }

        public void p(@d5.d z zVar, @d5.d StringBuilder sb) {
            l0.p(zVar, ProtectedSandApp.s("侦"));
            l0.p(sb, ProtectedSandApp.s("侧"));
            d.this.k1(zVar, sb);
        }

        public void q(@d5.d h0 h0Var, @d5.d StringBuilder sb) {
            l0.p(h0Var, ProtectedSandApp.s("侨"));
            l0.p(sb, ProtectedSandApp.s("侩"));
            d.this.u1(h0Var, sb, true);
        }

        public void r(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @d5.d StringBuilder sb) {
            l0.p(l0Var, ProtectedSandApp.s("侪"));
            l0.p(sb, ProtectedSandApp.s("侫"));
            d.this.y1(l0Var, sb);
        }

        public void s(@d5.d q0 q0Var, @d5.d StringBuilder sb) {
            l0.p(q0Var, ProtectedSandApp.s("侬"));
            l0.p(sb, ProtectedSandApp.s("侭"));
            d.this.A1(q0Var, sb);
        }

        public void u(@d5.d u0 u0Var, @d5.d StringBuilder sb) {
            l0.p(u0Var, ProtectedSandApp.s("侮"));
            l0.p(sb, ProtectedSandApp.s("侯"));
            d.this.C1(u0Var, sb);
        }

        public void v(@d5.d v0 v0Var, @d5.d StringBuilder sb) {
            l0.p(v0Var, ProtectedSandApp.s("侰"));
            l0.p(sb, ProtectedSandApp.s("侱"));
            t(v0Var, sb, ProtectedSandApp.s("侲"));
        }

        public void w(@d5.d w0 w0Var, @d5.d StringBuilder sb) {
            l0.p(w0Var, ProtectedSandApp.s("侳"));
            l0.p(sb, ProtectedSandApp.s("侴"));
            t(w0Var, sb, ProtectedSandApp.s("侵"));
        }

        public void x(@d5.d x0 x0Var, @d5.d StringBuilder sb) {
            l0.p(x0Var, ProtectedSandApp.s("侶"));
            l0.p(sb, ProtectedSandApp.s("侷"));
            sb.append(x0Var.getName());
        }

        public void y(@d5.d e1 e1Var, @d5.d StringBuilder sb) {
            l0.p(e1Var, ProtectedSandApp.s("侸"));
            l0.p(sb, ProtectedSandApp.s("侹"));
            d.this.K1(e1Var, sb);
        }

        public void z(@d5.d f1 f1Var, @d5.d StringBuilder sb) {
            l0.p(f1Var, ProtectedSandApp.s("侺"));
            l0.p(sb, ProtectedSandApp.s("侻"));
            d.this.P1(f1Var, sb, true);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25837a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f25838b;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25837a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f25838b = iArr2;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<l1, CharSequence> {
        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d l1 l1Var) {
            l0.p(l1Var, ProtectedSandApp.s("蘸"));
            if (l1Var.c()) {
                return ProtectedSandApp.s("蘹");
            }
            d dVar = d.this;
            kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
            l0.o(type, ProtectedSandApp.s("蘺"));
            String y5 = dVar.y(type);
            if (l1Var.b() == x1.INVARIANT) {
                return y5;
            }
            return l1Var.b() + ' ' + y5;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0369d extends Lambda implements q3.a<d> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d$a */
        static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.renderer.f, m2> {

            /* renamed from: p, reason: collision with root package name */
            public static final a f25841p = new a();

            a() {
                super(1);
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ m2 N(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
                a(fVar);
                return m2.f23662a;
            }

            public final void a(@d5.d kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
                List O;
                Set<kotlin.reflect.jvm.internal.impl.name.c> C;
                l0.p(fVar, ProtectedSandApp.s("蘻"));
                Set<kotlin.reflect.jvm.internal.impl.name.c> o5 = fVar.o();
                O = a0.O(l.a.C, l.a.D);
                C = r1.C(o5, O);
                fVar.a(C);
            }
        }

        C0369d() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d n() {
            kotlin.reflect.jvm.internal.impl.renderer.c A = d.this.A(a.f25841p);
            l0.n(A, ProtectedSandApp.s("蘼"));
            return (d) A;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>, CharSequence> {
        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
            l0.p(gVar, ProtectedSandApp.s("蘽"));
            return d.this.d1(gVar);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes6.dex */
    static final class f extends Lambda implements q3.l<j1, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final f f25843p = new f();

        f() {
            super(1);
        }

        @Override // q3.l
        public CharSequence N(j1 j1Var) {
            return "";
        }

        @d5.d
        public final CharSequence a(j1 j1Var) {
            return "";
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes6.dex */
    static final class g extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.h0, CharSequence> {
        g() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            d dVar = d.this;
            l0.o(h0Var, ProtectedSandApp.s("蘾"));
            return dVar.y(h0Var);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes6.dex */
    static final class h extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.h0, Object> {

        /* renamed from: p, reason: collision with root package name */
        public static final h f25845p = new h();

        h() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object N(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("蘿"));
            return h0Var instanceof kotlin.reflect.jvm.internal.impl.types.x0 ? ((kotlin.reflect.jvm.internal.impl.types.x0) h0Var).d1() : h0Var;
        }
    }

    public d(@d5.d kotlin.reflect.jvm.internal.impl.renderer.g gVar) {
        Lazy c6;
        l0.p(gVar, ProtectedSandApp.s("侼"));
        this.f25833l = gVar;
        gVar.m0();
        c6 = d0.c(new C0369d());
        this.f25834m = c6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(q0 q0Var, StringBuilder sb) {
        z1(q0Var.f(), ProtectedSandApp.s("侽"), sb);
        if (p()) {
            sb.append(ProtectedSandApp.s("侾"));
            u1(q0Var.C0(), sb, false);
        }
    }

    public static final void B(d dVar, t0 t0Var, StringBuilder sb) {
        dVar.p1(t0Var, sb);
    }

    private final void B1(StringBuilder sb, s0 s0Var) {
        s0 c6 = s0Var.c();
        if (c6 != null) {
            B1(sb, c6);
            sb.append(org.apache.commons.io.k.f32026a);
            kotlin.reflect.jvm.internal.impl.name.f name = s0Var.b().getName();
            l0.o(name, ProtectedSandApp.s("便"));
            sb.append(x(name, false));
        } else {
            h1 m5 = s0Var.b().m();
            l0.o(m5, ProtectedSandApp.s("俀"));
            sb.append(M1(m5));
        }
        sb.append(L1(s0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(u0 u0Var, StringBuilder sb) {
        boolean A0 = A0();
        String s5 = ProtectedSandApp.s("俁");
        if (!A0) {
            if (!z0()) {
                D1(u0Var, sb);
                List<x0> y02 = u0Var.y0();
                l0.o(y02, ProtectedSandApp.s("係"));
                f1(y02, sb);
                u c6 = u0Var.c();
                l0.o(c6, ProtectedSandApp.s("促"));
                X1(c6, sb);
                boolean z5 = false;
                t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.CONST) && u0Var.s(), ProtectedSandApp.s("俄"));
                p1(u0Var, sb);
                s1(u0Var, sb);
                x1(u0Var, sb);
                if (g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.LATEINIT) && u0Var.z0()) {
                    z5 = true;
                }
                t1(sb, z5, ProtectedSandApp.s("俅"));
                o1(u0Var, sb);
            }
            T1(this, u0Var, sb, false, 4, null);
            List<f1> typeParameters = u0Var.getTypeParameters();
            l0.o(typeParameters, s5);
            R1(typeParameters, sb, true);
            E1(u0Var, sb);
        }
        u1(u0Var, sb, true);
        sb.append(ProtectedSandApp.s("俆"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = u0Var.getType();
        l0.o(type, ProtectedSandApp.s("俇"));
        sb.append(y(type));
        F1(u0Var, sb);
        m1(u0Var, sb);
        List<f1> typeParameters2 = u0Var.getTypeParameters();
        l0.o(typeParameters2, s5);
        Y1(typeParameters2, sb);
    }

    private final void D1(u0 u0Var, StringBuilder sb) {
        Object h5;
        if (g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            X0(this, sb, u0Var, null, 2, null);
            x x02 = u0Var.x0();
            if (x02 != null) {
                W0(sb, x02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.FIELD);
            }
            x u02 = u0Var.u0();
            if (u02 != null) {
                W0(sb, u02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_DELEGATE_FIELD);
            }
            if (n0() == l.NONE) {
                v0 e6 = u0Var.e();
                if (e6 != null) {
                    W0(sb, e6, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_GETTER);
                }
                w0 h6 = u0Var.h();
                if (h6 != null) {
                    W0(sb, h6, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_SETTER);
                    List<j1> n5 = h6.n();
                    l0.o(n5, ProtectedSandApp.s("俈"));
                    h5 = j0.h5(n5);
                    j1 j1Var = (j1) h5;
                    l0.o(j1Var, ProtectedSandApp.s("俉"));
                    W0(sb, j1Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void E1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb) {
        x0 t02 = aVar.t0();
        if (t02 != null) {
            W0(sb, t02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            kotlin.reflect.jvm.internal.impl.types.h0 type = t02.getType();
            l0.o(type, ProtectedSandApp.s("俊"));
            sb.append(i1(type));
            sb.append(ProtectedSandApp.s("俋"));
        }
    }

    private final void F1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb) {
        x0 t02;
        if (o0() && (t02 = aVar.t0()) != null) {
            sb.append(ProtectedSandApp.s("俌"));
            kotlin.reflect.jvm.internal.impl.types.h0 type = t02.getType();
            l0.o(type, ProtectedSandApp.s("俍"));
            sb.append(y(type));
        }
    }

    private final void G1(StringBuilder sb, p0 p0Var) {
        boolean g5 = l0.g(p0Var, t1.f26533b);
        String s5 = ProtectedSandApp.s("俎");
        if (g5 || t1.k(p0Var)) {
            sb.append(s5);
            return;
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.k.o(p0Var)) {
            if (!D0()) {
                sb.append(s5);
                return;
            }
            h1 U0 = p0Var.U0();
            l0.n(U0, ProtectedSandApp.s("俏"));
            sb.append(h1(((kotlin.reflect.jvm.internal.impl.types.error.i) U0).g(0)));
            return;
        }
        if (kotlin.reflect.jvm.internal.impl.types.j0.a(p0Var)) {
            g1(sb, p0Var);
        } else if (Z1(p0Var)) {
            l1(sb, p0Var);
        } else {
            g1(sb, p0Var);
        }
    }

    private final void H1(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final void I1(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
        if (K0() || kotlin.reflect.jvm.internal.impl.builtins.h.m0(eVar.E())) {
            return;
        }
        Collection<kotlin.reflect.jvm.internal.impl.types.h0> m5 = eVar.m().m();
        l0.o(m5, ProtectedSandApp.s("俐"));
        if (m5.isEmpty()) {
            return;
        }
        if (m5.size() == 1 && kotlin.reflect.jvm.internal.impl.builtins.h.b0(m5.iterator().next())) {
            return;
        }
        H1(sb);
        sb.append(ProtectedSandApp.s("俑"));
        y.k3(m5, sb, ProtectedSandApp.s("俒"), null, null, 0, null, new g(), 60, null);
    }

    private final void J1(z zVar, StringBuilder sb) {
        t1(sb, zVar.o(), ProtectedSandApp.s("俓"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(e1 e1Var, StringBuilder sb) {
        X0(this, sb, e1Var, null, 2, null);
        u c6 = e1Var.c();
        l0.o(c6, ProtectedSandApp.s("俔"));
        X1(c6, sb);
        p1(e1Var, sb);
        sb.append(n1(ProtectedSandApp.s("俕")));
        sb.append(ProtectedSandApp.s("俖"));
        u1(e1Var, sb, true);
        List<f1> G = e1Var.G();
        l0.o(G, ProtectedSandApp.s("俗"));
        R1(G, sb, false);
        Y0(e1Var, sb);
        sb.append(ProtectedSandApp.s("俘"));
        sb.append(y(e1Var.n0()));
    }

    private final String M0() {
        return Q(ProtectedSandApp.s("俙"));
    }

    private final void N(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.m b6;
        String name;
        if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) || (mVar instanceof q0) || (b6 = mVar.b()) == null || (b6 instanceof h0)) {
            return;
        }
        String s5 = ProtectedSandApp.s("俚");
        sb.append(s5);
        sb.append(q1(ProtectedSandApp.s("俛")));
        sb.append(s5);
        kotlin.reflect.jvm.internal.impl.name.d m5 = kotlin.reflect.jvm.internal.impl.resolve.e.m(b6);
        l0.o(m5, ProtectedSandApp.s("俜"));
        sb.append(m5.e() ? ProtectedSandApp.s("保") : w(m5));
        if (I0() && (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && (mVar instanceof p) && (name = ((p) mVar).k().a().getName()) != null) {
            sb.append(s5);
            sb.append(q1(ProtectedSandApp.s("俞")));
            sb.append(s5);
            sb.append(name);
        }
    }

    private final boolean N0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        return kotlin.reflect.jvm.internal.impl.builtins.g.q(h0Var) || !h0Var.getAnnotations().isEmpty();
    }

    private final void N1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var, h1 h1Var) {
        s0 a6 = g1.a(h0Var);
        if (a6 != null) {
            B1(sb, a6);
        } else {
            sb.append(M1(h1Var));
            sb.append(L1(h0Var.S0()));
        }
    }

    private final void O(StringBuilder sb, List<? extends l1> list) {
        y.k3(list, sb, ProtectedSandApp.s("俟"), null, null, 0, null, new c(), 60, null);
    }

    private final e0 O0(kotlin.reflect.jvm.internal.impl.descriptors.d0 d0Var) {
        if (d0Var instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) d0Var).j() == kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE ? e0.ABSTRACT : e0.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = d0Var.b();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
        if (eVar == null) {
            return e0.FINAL;
        }
        if (!(d0Var instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
            return e0.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) d0Var;
        l0.o(bVar.g(), ProtectedSandApp.s("俠"));
        if ((!r1.isEmpty()) && eVar.r() != e0.FINAL) {
            return e0.OPEN;
        }
        if (eVar.j() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || l0.g(bVar.c(), t.f24436a)) {
            return e0.FINAL;
        }
        e0 r5 = bVar.r();
        e0 e0Var = e0.ABSTRACT;
        return r5 == e0Var ? e0Var : e0.OPEN;
    }

    static /* synthetic */ void O1(d dVar, StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var, h1 h1Var, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            h1Var = h0Var.U0();
        }
        dVar.N1(sb, h0Var, h1Var);
    }

    private final String P() {
        int i5 = b.f25837a[B0().ordinal()];
        if (i5 == 1) {
            return Q(ProtectedSandApp.s("俢"));
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("信");
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        return l0.g(cVar.f(), l.a.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(f1 f1Var, StringBuilder sb, boolean z5) {
        if (z5) {
            sb.append(Q0());
        }
        if (G0()) {
            sb.append(ProtectedSandApp.s("俣"));
            sb.append(f1Var.getIndex());
            sb.append(ProtectedSandApp.s("俤"));
        }
        t1(sb, f1Var.v(), ProtectedSandApp.s("俥"));
        String label = f1Var.z().getLabel();
        boolean z6 = true;
        t1(sb, label.length() > 0, label);
        X0(this, sb, f1Var, null, 2, null);
        u1(f1Var, sb, z5);
        int size = f1Var.getUpperBounds().size();
        String s5 = ProtectedSandApp.s("俦");
        String s6 = ProtectedSandApp.s("俧");
        if ((size > 1 && !z5) || size == 1) {
            kotlin.reflect.jvm.internal.impl.types.h0 next = f1Var.getUpperBounds().iterator().next();
            if (!kotlin.reflect.jvm.internal.impl.builtins.h.i0(next)) {
                sb.append(s6);
                l0.o(next, s5);
                sb.append(y(next));
            }
        } else if (z5) {
            for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : f1Var.getUpperBounds()) {
                if (!kotlin.reflect.jvm.internal.impl.builtins.h.i0(h0Var)) {
                    if (z6) {
                        sb.append(s6);
                    } else {
                        sb.append(ProtectedSandApp.s("俨"));
                    }
                    l0.o(h0Var, s5);
                    sb.append(y(h0Var));
                    z6 = false;
                }
            }
        }
        if (z5) {
            sb.append(M0());
        }
    }

    private final String Q(String str) {
        return B0().escape(str);
    }

    private final String Q0() {
        return Q(ProtectedSandApp.s("俩"));
    }

    private final void Q1(StringBuilder sb, List<? extends f1> list) {
        Iterator<? extends f1> it = list.iterator();
        while (it.hasNext()) {
            P1(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(ProtectedSandApp.s("俪"));
            }
        }
    }

    private final boolean R0(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        return !bVar.g().isEmpty();
    }

    private final void R1(List<? extends f1> list, StringBuilder sb, boolean z5) {
        if (!L0() && (!list.isEmpty())) {
            sb.append(Q0());
            Q1(sb, list);
            sb.append(M0());
            if (z5) {
                sb.append(ProtectedSandApp.s("俫"));
            }
        }
    }

    private final void S0(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.a aVar) {
        m B0 = B0();
        m mVar = m.HTML;
        if (B0 == mVar) {
            sb.append(ProtectedSandApp.s("俬"));
        }
        sb.append(ProtectedSandApp.s("俭"));
        w1(sb, aVar.d0());
        sb.append(ProtectedSandApp.s("修"));
        if (B0() == mVar) {
            sb.append(ProtectedSandApp.s("俯"));
        }
    }

    private final void S1(kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, StringBuilder sb, boolean z5) {
        if (z5 || !(l1Var instanceof j1)) {
            sb.append(n1(l1Var.q0() ? ProtectedSandApp.s("俰") : ProtectedSandApp.s("俱")));
            sb.append(ProtectedSandApp.s("俲"));
        }
    }

    private final void T0(t0 t0Var, StringBuilder sb) {
        p1(t0Var, sb);
    }

    static /* synthetic */ void T1(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, StringBuilder sb, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        dVar.S1(l1Var, sb, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void U0(kotlin.reflect.jvm.internal.impl.descriptors.z r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.B()
            java.lang.String r1 = "俳"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3e
            java.util.Collection r0 = r6.g()
            kotlin.jvm.internal.l0.o(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L1d
        L1b:
            r0 = r3
            goto L34
        L1d:
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z r4 = (kotlin.reflect.jvm.internal.impl.descriptors.z) r4
            boolean r4 = r4.B()
            if (r4 == 0) goto L21
            r0 = r2
        L34:
            if (r0 != 0) goto L3c
            boolean r0 = r5.S()
            if (r0 == 0) goto L3e
        L3c:
            r0 = r3
            goto L3f
        L3e:
            r0 = r2
        L3f:
            boolean r4 = r6.H()
            if (r4 == 0) goto L74
            java.util.Collection r4 = r6.g()
            kotlin.jvm.internal.l0.o(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L54
        L52:
            r1 = r3
            goto L6b
        L54:
            java.util.Iterator r1 = r4.iterator()
        L58:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L52
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z r4 = (kotlin.reflect.jvm.internal.impl.descriptors.z) r4
            boolean r4 = r4.H()
            if (r4 == 0) goto L58
            r1 = r2
        L6b:
            if (r1 != 0) goto L73
            boolean r1 = r5.S()
            if (r1 == 0) goto L74
        L73:
            r2 = r3
        L74:
            boolean r1 = r6.X()
            java.lang.String r3 = "俴"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            r5.t1(r7, r1, r3)
            r5.J1(r6, r7)
            boolean r6 = r6.p()
            java.lang.String r1 = "俵"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r5.t1(r7, r6, r1)
            java.lang.String r6 = "俶"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.t1(r7, r2, r6)
            java.lang.String r6 = "俷"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.t1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.U0(kotlin.reflect.jvm.internal.impl.descriptors.z, java.lang.StringBuilder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if ((p() ? r10.B0() : kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(r10)) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U1(kotlin.reflect.jvm.internal.impl.descriptors.j1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L18
            java.lang.String r0 = "俸"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.String r0 = r9.n1(r0)
            r12.append(r0)
            java.lang.String r0 = "俹"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r12.append(r0)
        L18:
            boolean r0 = r9.G0()
            if (r0 == 0) goto L37
            java.lang.String r0 = "俺"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
            java.lang.String r0 = "俻"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r12.append(r0)
        L37:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            X0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.i0()
            java.lang.String r1 = "俼"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r9.t1(r12, r0, r1)
            boolean r0 = r10.f0()
            java.lang.String r1 = "俽"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r9.t1(r12, r0, r1)
            boolean r0 = r9.v0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L7d
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r10.b()
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L6d
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r0 == 0) goto L78
            boolean r0 = r0.M()
            if (r0 != r1) goto L78
            r0 = r1
            goto L79
        L78:
            r0 = r2
        L79:
            if (r0 == 0) goto L7d
            r8 = r1
            goto L7e
        L7d:
            r8 = r2
        L7e:
            if (r8 == 0) goto L8d
            boolean r0 = r9.R()
            java.lang.String r3 = "俾"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            r9.t1(r12, r0, r3)
        L8d:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.W1(r4, r5, r6, r7, r8)
            q3.l r11 = r9.X()
            if (r11 == 0) goto Lad
            boolean r11 = r9.p()
            if (r11 == 0) goto La6
            boolean r11 = r10.B0()
            goto Laa
        La6:
            boolean r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(r10)
        Laa:
            if (r11 == 0) goto Lad
            goto Lae
        Lad:
            r1 = r2
        Lae:
            if (r1 == 0) goto Ld2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "俿"
            java.lang.String r13 = com.flashget.kidsdownloader.ProtectedSandApp.s(r13)
            r11.<init>(r13)
            q3.l r13 = r9.X()
            kotlin.jvm.internal.l0.m(r13)
            java.lang.Object r10 = r13.N(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.U1(kotlin.reflect.jvm.internal.impl.descriptors.j1, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final List<String> V0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        int b02;
        int b03;
        List D4;
        List<String> q5;
        kotlin.reflect.jvm.internal.impl.descriptors.d Y;
        List<j1> n5;
        int b04;
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a6 = cVar.a();
        List list = null;
        kotlin.reflect.jvm.internal.impl.descriptors.e i5 = s0() ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar) : null;
        if (i5 != null && (Y = i5.Y()) != null && (n5 = Y.n()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : n5) {
                if (((j1) obj).B0()) {
                    arrayList.add(obj);
                }
            }
            b04 = b0.b0(arrayList, 10);
            List arrayList2 = new ArrayList(b04);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((j1) it.next()).getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = EmptyList.f23167o;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            l0.o((kotlin.reflect.jvm.internal.impl.name.f) obj2, ProtectedSandApp.s("倀"));
            if (!a6.containsKey(r5)) {
                arrayList3.add(obj2);
            }
        }
        b02 = b0.b0(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(b02);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((kotlin.reflect.jvm.internal.impl.name.f) it2.next()).h() + ProtectedSandApp.s("倁"));
        }
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> entrySet = a6.entrySet();
        b03 = b0.b0(entrySet, 10);
        ArrayList arrayList5 = new ArrayList(b03);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.h());
            sb.append(ProtectedSandApp.s("倂"));
            sb.append(!list.contains(fVar) ? d1(gVar) : ProtectedSandApp.s("倃"));
            arrayList5.add(sb.toString());
        }
        D4 = j0.D4(arrayList4, arrayList5);
        q5 = j0.q5(D4);
        return q5;
    }

    private final void V1(Collection<? extends j1> collection, boolean z5, StringBuilder sb) {
        boolean a22 = a2(z5);
        int size = collection.size();
        F0().b(size, sb);
        int i5 = 0;
        for (j1 j1Var : collection) {
            F0().a(j1Var, i5, size, sb);
            U1(j1Var, a22, sb, false);
            F0().d(j1Var, i5, size, sb);
            i5++;
        }
        F0().c(size, sb);
    }

    private final void W0(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        boolean W1;
        if (g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            Set<kotlin.reflect.jvm.internal.impl.name.c> o5 = aVar instanceof kotlin.reflect.jvm.internal.impl.types.h0 ? o() : Z();
            q3.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> T = T();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.getAnnotations()) {
                W1 = j0.W1(o5, cVar.f());
                if (!W1 && !P0(cVar) && (T == null || T.N(cVar).booleanValue())) {
                    sb.append(t(cVar, eVar));
                    if (Y()) {
                        sb.append('\n');
                        l0.o(sb, ProtectedSandApp.s("倄"));
                    } else {
                        sb.append(ProtectedSandApp.s("倅"));
                    }
                }
            }
        }
    }

    private final void W1(kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, boolean z5, StringBuilder sb, boolean z6, boolean z7) {
        kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
        l0.o(type, ProtectedSandApp.s("倆"));
        j1 j1Var = l1Var instanceof j1 ? (j1) l1Var : null;
        kotlin.reflect.jvm.internal.impl.types.h0 s02 = j1Var != null ? j1Var.s0() : null;
        kotlin.reflect.jvm.internal.impl.types.h0 h0Var = s02 == null ? type : s02;
        t1(sb, s02 != null, ProtectedSandApp.s("倇"));
        if (z7 || (z6 && !A0())) {
            S1(l1Var, sb, z7);
        }
        if (z5) {
            u1(l1Var, sb, z6);
            sb.append(ProtectedSandApp.s("倈"));
        }
        sb.append(y(h0Var));
        m1(l1Var, sb);
        if (!G0() || s02 == null) {
            return;
        }
        sb.append(ProtectedSandApp.s("倉"));
        sb.append(y(type));
        sb.append(ProtectedSandApp.s("倊"));
    }

    static /* synthetic */ void X0(d dVar, StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            eVar = null;
        }
        dVar.W0(sb, aVar, eVar);
    }

    private final boolean X1(u uVar, StringBuilder sb) {
        if (!g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VISIBILITY)) {
            return false;
        }
        if (h0()) {
            uVar = uVar.f();
        }
        if (!u0() && l0.g(uVar, t.f24447l)) {
            return false;
        }
        sb.append(n1(uVar.c()));
        sb.append(ProtectedSandApp.s("個"));
        return true;
    }

    private final void Y0(kotlin.reflect.jvm.internal.impl.descriptors.i iVar, StringBuilder sb) {
        List<f1> G = iVar.G();
        l0.o(G, ProtectedSandApp.s("倌"));
        List<f1> r5 = iVar.m().r();
        l0.o(r5, ProtectedSandApp.s("倍"));
        if (G0() && iVar.y() && r5.size() > G.size()) {
            sb.append(ProtectedSandApp.s("倎"));
            Q1(sb, r5.subList(G.size(), r5.size()));
            sb.append(ProtectedSandApp.s("倏"));
        }
    }

    private final void Y1(List<? extends f1> list, StringBuilder sb) {
        List<kotlin.reflect.jvm.internal.impl.types.h0> c22;
        if (L0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (f1 f1Var : list) {
            List<kotlin.reflect.jvm.internal.impl.types.h0> upperBounds = f1Var.getUpperBounds();
            l0.o(upperBounds, ProtectedSandApp.s("倐"));
            c22 = j0.c2(upperBounds, 1);
            for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : c22) {
                StringBuilder sb2 = new StringBuilder();
                kotlin.reflect.jvm.internal.impl.name.f name = f1Var.getName();
                l0.o(name, ProtectedSandApp.s("們"));
                sb2.append(x(name, false));
                sb2.append(ProtectedSandApp.s("倒"));
                l0.o(h0Var, ProtectedSandApp.s("倓"));
                sb2.append(y(h0Var));
                arrayList.add(sb2.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            String s5 = ProtectedSandApp.s("倔");
            sb.append(s5);
            sb.append(n1(ProtectedSandApp.s("倕")));
            sb.append(s5);
            y.k3(arrayList, sb, ProtectedSandApp.s("倖"), null, null, 0, null, null, 124, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.d Y;
        boolean z5 = eVar.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY;
        if (!A0()) {
            X0(this, sb, eVar, null, 2, null);
            List<x0> N0 = eVar.N0();
            l0.o(N0, ProtectedSandApp.s("倗"));
            f1(N0, sb);
            if (!z5) {
                u c6 = eVar.c();
                l0.o(c6, ProtectedSandApp.s("倘"));
                X1(c6, sb);
            }
            if ((eVar.j() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || eVar.r() != e0.ABSTRACT) && (!eVar.j().isSingleton() || eVar.r() != e0.FINAL)) {
                e0 r5 = eVar.r();
                l0.o(r5, ProtectedSandApp.s("候"));
                r1(r5, sb, O0(eVar));
            }
            p1(eVar, sb);
            t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INNER) && eVar.y(), ProtectedSandApp.s("倚"));
            t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.DATA) && eVar.I(), ProtectedSandApp.s("倛"));
            t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INLINE) && eVar.p(), ProtectedSandApp.s("倜"));
            t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VALUE) && eVar.x(), ProtectedSandApp.s("倝"));
            t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.FUN) && eVar.u(), ProtectedSandApp.s("倞"));
            a1(eVar, sb);
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.e.x(eVar)) {
            c1(eVar, sb);
        } else {
            if (!A0()) {
                H1(sb);
            }
            u1(eVar, sb, true);
        }
        if (z5) {
            return;
        }
        List<f1> G = eVar.G();
        l0.o(G, ProtectedSandApp.s("借"));
        R1(G, sb, false);
        Y0(eVar, sb);
        if (!eVar.j().isSingleton() && V() && (Y = eVar.Y()) != null) {
            sb.append(ProtectedSandApp.s("倠"));
            X0(this, sb, Y, null, 2, null);
            u c7 = Y.c();
            l0.o(c7, ProtectedSandApp.s("倡"));
            X1(c7, sb);
            sb.append(n1(ProtectedSandApp.s("倢")));
            List<j1> n5 = Y.n();
            l0.o(n5, ProtectedSandApp.s("倣"));
            V1(n5, Y.P(), sb);
        }
        I1(eVar, sb);
        Y1(G, sb);
    }

    private final boolean Z1(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        boolean z5;
        if (!kotlin.reflect.jvm.internal.impl.builtins.g.o(h0Var)) {
            return false;
        }
        List<l1> S0 = h0Var.S0();
        if (!(S0 instanceof Collection) || !S0.isEmpty()) {
            Iterator<T> it = S0.iterator();
            while (it.hasNext()) {
                if (((l1) it.next()).c()) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        return z5;
    }

    private final d a0() {
        return (d) this.f25834m.getValue();
    }

    private final void a1(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
        sb.append(n1(kotlin.reflect.jvm.internal.impl.renderer.c.f25810a.a(eVar)));
    }

    private final boolean a2(boolean z5) {
        int i5 = b.f25838b[k0().ordinal()];
        if (i5 == 1) {
            return true;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z5) {
            return true;
        }
        return false;
    }

    private final void c1(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, StringBuilder sb) {
        if (p0()) {
            if (A0()) {
                sb.append(ProtectedSandApp.s("値"));
            }
            H1(sb);
            kotlin.reflect.jvm.internal.impl.descriptors.m b6 = mVar.b();
            if (b6 != null) {
                sb.append(ProtectedSandApp.s("倥"));
                kotlin.reflect.jvm.internal.impl.name.f name = b6.getName();
                l0.o(name, ProtectedSandApp.s("倦"));
                sb.append(x(name, false));
            }
        }
        if (G0() || !l0.g(mVar.getName(), kotlin.reflect.jvm.internal.impl.name.h.f25608d)) {
            if (!A0()) {
                H1(sb);
            }
            kotlin.reflect.jvm.internal.impl.name.f name2 = mVar.getName();
            l0.o(name2, ProtectedSandApp.s("倧"));
            sb.append(x(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d1(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        String a42;
        String m32;
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            m32 = j0.m3(((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b(), ProtectedSandApp.s("倨"), ProtectedSandApp.s("倩"), ProtectedSandApp.s("倪"), 0, null, new e(), 24, null);
            return m32;
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            a42 = kotlin.text.h0.a4(kotlin.reflect.jvm.internal.impl.renderer.c.u(this, ((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).b(), null, 2, null), ProtectedSandApp.s("倫"));
            return a42;
        }
        if (!(gVar instanceof q)) {
            return gVar.toString();
        }
        q.b b6 = ((q) gVar).b();
        boolean z5 = b6 instanceof q.b.a;
        String s5 = ProtectedSandApp.s("倬");
        if (z5) {
            return ((q.b.a) b6).a() + s5;
        }
        if (!(b6 instanceof q.b.C0373b)) {
            throw new NoWhenBranchMatchedException();
        }
        q.b.C0373b c0373b = (q.b.C0373b) b6;
        String b7 = c0373b.b().b().b();
        l0.o(b7, ProtectedSandApp.s("倭"));
        int a6 = c0373b.a();
        for (int i5 = 0; i5 < a6; i5++) {
            b7 = ProtectedSandApp.s("倮") + b7 + Typography.f27130f;
        }
        return androidx.concurrent.futures.b.a(b7, s5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e1(kotlin.reflect.jvm.internal.impl.descriptors.l r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.e1(kotlin.reflect.jvm.internal.impl.descriptors.l, java.lang.StringBuilder):void");
    }

    private final void f1(List<? extends x0> list, StringBuilder sb) {
        int J;
        if (!list.isEmpty()) {
            sb.append(ProtectedSandApp.s("倻"));
            int i5 = 0;
            for (x0 x0Var : list) {
                int i6 = i5 + 1;
                W0(sb, x0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
                kotlin.reflect.jvm.internal.impl.types.h0 type = x0Var.getType();
                l0.o(type, ProtectedSandApp.s("值"));
                sb.append(i1(type));
                J = a0.J(list);
                if (i5 == J) {
                    sb.append(ProtectedSandApp.s("倽"));
                } else {
                    sb.append(ProtectedSandApp.s("倾"));
                }
                i5 = i6;
            }
        }
    }

    private final void g1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        X0(this, sb, h0Var, null, 2, null);
        kotlin.reflect.jvm.internal.impl.types.q qVar = h0Var instanceof kotlin.reflect.jvm.internal.impl.types.q ? (kotlin.reflect.jvm.internal.impl.types.q) h0Var : null;
        p0 g12 = qVar != null ? qVar.g1() : null;
        if (kotlin.reflect.jvm.internal.impl.types.j0.a(h0Var)) {
            if (kotlin.reflect.jvm.internal.impl.types.typeUtil.a.s(h0Var) && m0()) {
                sb.append(h1(kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.p(h0Var)));
            } else {
                if (!(h0Var instanceof kotlin.reflect.jvm.internal.impl.types.error.h) || f0()) {
                    sb.append(h0Var.U0().toString());
                } else {
                    sb.append(((kotlin.reflect.jvm.internal.impl.types.error.h) h0Var).d1());
                }
                sb.append(L1(h0Var.S0()));
            }
        } else if (h0Var instanceof kotlin.reflect.jvm.internal.impl.types.x0) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.x0) h0Var).d1().toString());
        } else if (g12 instanceof kotlin.reflect.jvm.internal.impl.types.x0) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.x0) g12).d1().toString());
        } else {
            O1(this, sb, h0Var, null, 2, null);
        }
        if (h0Var.V0()) {
            sb.append(ProtectedSandApp.s("倿"));
        }
        if (kotlin.reflect.jvm.internal.impl.types.t0.c(h0Var)) {
            sb.append(ProtectedSandApp.s("偀"));
        }
    }

    private final String h1(String str) {
        int i5 = b.f25837a[B0().ordinal()];
        if (i5 == 1) {
            return str;
        }
        if (i5 == 2) {
            return androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("偁"), str, ProtectedSandApp.s("偂"));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String i1(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        String y5 = y(h0Var);
        if (!Z1(h0Var) || t1.l(h0Var)) {
            return y5;
        }
        return ProtectedSandApp.s("偃") + y5 + ')';
    }

    private final String j1(List<kotlin.reflect.jvm.internal.impl.name.f> list) {
        return Q(n.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1(z zVar, StringBuilder sb) {
        boolean A0 = A0();
        String s5 = ProtectedSandApp.s("偄");
        if (!A0) {
            if (!z0()) {
                X0(this, sb, zVar, null, 2, null);
                List<x0> y02 = zVar.y0();
                l0.o(y02, ProtectedSandApp.s("偅"));
                f1(y02, sb);
                u c6 = zVar.c();
                l0.o(c6, ProtectedSandApp.s("偆"));
                X1(c6, sb);
                s1(zVar, sb);
                if (b0()) {
                    p1(zVar, sb);
                }
                x1(zVar, sb);
                if (b0()) {
                    U0(zVar, sb);
                } else {
                    J1(zVar, sb);
                }
                o1(zVar, sb);
                if (G0()) {
                    if (zVar.D0()) {
                        sb.append(ProtectedSandApp.s("假"));
                    }
                    if (zVar.J0()) {
                        sb.append(ProtectedSandApp.s("偈"));
                    }
                }
            }
            sb.append(n1(ProtectedSandApp.s("偉")));
            sb.append(ProtectedSandApp.s("偊"));
            List<f1> typeParameters = zVar.getTypeParameters();
            l0.o(typeParameters, s5);
            R1(typeParameters, sb, true);
            E1(zVar, sb);
        }
        u1(zVar, sb, true);
        List<j1> n5 = zVar.n();
        l0.o(n5, ProtectedSandApp.s("偋"));
        V1(n5, zVar.P(), sb);
        F1(zVar, sb);
        kotlin.reflect.jvm.internal.impl.types.h0 i5 = zVar.i();
        if (!J0() && (E0() || i5 == null || !kotlin.reflect.jvm.internal.impl.builtins.h.B0(i5))) {
            sb.append(ProtectedSandApp.s("偌"));
            sb.append(i5 == null ? ProtectedSandApp.s("偍") : y(i5));
        }
        List<f1> typeParameters2 = zVar.getTypeParameters();
        l0.o(typeParameters2, s5);
        Y1(typeParameters2, sb);
    }

    private final void l1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        char r7;
        int g32;
        int g33;
        int J;
        Object p32;
        int length = sb.length();
        X0(a0(), sb, h0Var, null, 2, null);
        boolean z5 = sb.length() != length;
        kotlin.reflect.jvm.internal.impl.types.h0 j5 = kotlin.reflect.jvm.internal.impl.builtins.g.j(h0Var);
        List<kotlin.reflect.jvm.internal.impl.types.h0> e6 = kotlin.reflect.jvm.internal.impl.builtins.g.e(h0Var);
        boolean z6 = !e6.isEmpty();
        String s5 = ProtectedSandApp.s("偎");
        String s6 = ProtectedSandApp.s("偏");
        if (z6) {
            sb.append(ProtectedSandApp.s("偐"));
            J = a0.J(e6);
            Iterator<kotlin.reflect.jvm.internal.impl.types.h0> it = e6.subList(0, J).iterator();
            while (it.hasNext()) {
                v1(sb, it.next());
                sb.append(s5);
            }
            p32 = j0.p3(e6);
            v1(sb, (kotlin.reflect.jvm.internal.impl.types.h0) p32);
            sb.append(s6);
        }
        boolean q5 = kotlin.reflect.jvm.internal.impl.builtins.g.q(h0Var);
        boolean V0 = h0Var.V0();
        boolean z7 = V0 || (z5 && j5 != null);
        String s7 = ProtectedSandApp.s("偑");
        if (z7) {
            if (q5) {
                sb.insert(length, '(');
            } else {
                if (z5) {
                    r7 = kotlin.text.j0.r7(sb);
                    kotlin.text.d.r(r7);
                    g32 = kotlin.text.h0.g3(sb);
                    if (sb.charAt(g32 - 1) != ')') {
                        g33 = kotlin.text.h0.g3(sb);
                        sb.insert(g33, ProtectedSandApp.s("偒"));
                    }
                }
                sb.append(s7);
            }
        }
        t1(sb, q5, ProtectedSandApp.s("偓"));
        String s8 = ProtectedSandApp.s("偔");
        if (j5 != null) {
            boolean z8 = (Z1(j5) && !j5.V0()) || N0(j5);
            if (z8) {
                sb.append(s7);
            }
            v1(sb, j5);
            if (z8) {
                sb.append(s8);
            }
            sb.append(ProtectedSandApp.s("偕"));
        }
        sb.append(s7);
        if (!kotlin.reflect.jvm.internal.impl.builtins.g.m(h0Var) || h0Var.S0().size() > 1) {
            int i5 = 0;
            for (l1 l1Var : kotlin.reflect.jvm.internal.impl.builtins.g.l(h0Var)) {
                int i6 = i5 + 1;
                if (i5 > 0) {
                    sb.append(s5);
                }
                if (l0()) {
                    kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
                    l0.o(type, ProtectedSandApp.s("偗"));
                    fVar = kotlin.reflect.jvm.internal.impl.builtins.g.d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb.append(x(fVar, false));
                    sb.append(ProtectedSandApp.s("偘"));
                }
                sb.append(z(l1Var));
                i5 = i6;
            }
        } else {
            sb.append(ProtectedSandApp.s("偖"));
        }
        sb.append(s6);
        sb.append(P());
        sb.append(ProtectedSandApp.s("偙"));
        v1(sb, kotlin.reflect.jvm.internal.impl.builtins.g.k(h0Var));
        if (z7) {
            sb.append(s8);
        }
        if (V0) {
            sb.append(ProtectedSandApp.s("做"));
        }
    }

    private final void m1(kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> e02;
        if (!e0() || (e02 = l1Var.e0()) == null) {
            return;
        }
        sb.append(ProtectedSandApp.s("偛"));
        sb.append(Q(d1(e02)));
    }

    private final String n1(String str) {
        int i5 = b.f25837a[B0().ordinal()];
        if (i5 == 1) {
            return str;
        }
        if (i5 == 2) {
            return U() ? str : androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("停"), str, ProtectedSandApp.s("偝"));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void o1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb) {
        if (g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MEMBER_KIND) && G0() && bVar.j() != b.a.DECLARATION) {
            sb.append(ProtectedSandApp.s("偞"));
            sb.append(i4.a.f(bVar.j().name()));
            sb.append(ProtectedSandApp.s("偟"));
        }
    }

    private final void p1(kotlin.reflect.jvm.internal.impl.descriptors.d0 d0Var, StringBuilder sb) {
        t1(sb, d0Var.q(), ProtectedSandApp.s("偠"));
        t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.EXPECT) && d0Var.U(), ProtectedSandApp.s("偡"));
        t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ACTUAL) && d0Var.L0(), ProtectedSandApp.s("偢"));
    }

    private final void r1(e0 e0Var, StringBuilder sb, e0 e0Var2) {
        if (t0() || e0Var != e0Var2) {
            t1(sb, g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MODALITY), i4.a.f(e0Var.name()));
        }
    }

    private final void s1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb) {
        if (kotlin.reflect.jvm.internal.impl.resolve.e.J(bVar) && bVar.r() == e0.FINAL) {
            return;
        }
        if (j0() == j.RENDER_OVERRIDE && bVar.r() == e0.OPEN && R0(bVar)) {
            return;
        }
        e0 r5 = bVar.r();
        l0.o(r5, ProtectedSandApp.s("偣"));
        r1(r5, sb, O0(bVar));
    }

    private final void t1(StringBuilder sb, boolean z5, String str) {
        if (z5) {
            sb.append(n1(str));
            sb.append(ProtectedSandApp.s("偤"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, StringBuilder sb, boolean z5) {
        kotlin.reflect.jvm.internal.impl.name.f name = mVar.getName();
        l0.o(name, ProtectedSandApp.s("健"));
        sb.append(x(name, z5));
    }

    private final void v1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        w1 X0 = h0Var.X0();
        kotlin.reflect.jvm.internal.impl.types.a aVar = X0 instanceof kotlin.reflect.jvm.internal.impl.types.a ? (kotlin.reflect.jvm.internal.impl.types.a) X0 : null;
        if (aVar == null) {
            w1(sb, h0Var);
            return;
        }
        if (w0()) {
            w1(sb, aVar.d0());
            return;
        }
        w1(sb, aVar.g1());
        if (x0()) {
            S0(sb, aVar);
        }
    }

    private final void w1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if ((h0Var instanceof y1) && p() && !((y1) h0Var).Z0()) {
            sb.append(ProtectedSandApp.s("偦"));
            return;
        }
        w1 X0 = h0Var.X0();
        if (X0 instanceof kotlin.reflect.jvm.internal.impl.types.b0) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.b0) X0).e1(this, this));
        } else if (X0 instanceof p0) {
            G1(sb, (p0) X0);
        }
    }

    private final void x1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb) {
        if (g0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.OVERRIDE) && R0(bVar) && j0() != j.RENDER_OPEN) {
            t1(sb, true, ProtectedSandApp.s("偧"));
            if (G0()) {
                sb.append(ProtectedSandApp.s("偨"));
                sb.append(bVar.g().size());
                sb.append(ProtectedSandApp.s("偩"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, StringBuilder sb) {
        z1(l0Var.f(), ProtectedSandApp.s("偪"), sb);
        if (p()) {
            sb.append(ProtectedSandApp.s("偫"));
            u1(l0Var.b(), sb, false);
        }
    }

    private final void z1(kotlin.reflect.jvm.internal.impl.name.c cVar, String str, StringBuilder sb) {
        sb.append(n1(str));
        kotlin.reflect.jvm.internal.impl.name.d j5 = cVar.j();
        l0.o(j5, ProtectedSandApp.s("偬"));
        String w5 = w(j5);
        if (w5.length() > 0) {
            sb.append(ProtectedSandApp.s("偭"));
            sb.append(w5);
        }
    }

    public boolean A0() {
        return this.f25833l.a0();
    }

    @d5.d
    public m B0() {
        return this.f25833l.b0();
    }

    @d5.d
    public q3.l<kotlin.reflect.jvm.internal.impl.types.h0, kotlin.reflect.jvm.internal.impl.types.h0> C0() {
        return this.f25833l.c0();
    }

    public boolean D0() {
        return this.f25833l.d0();
    }

    public boolean E0() {
        return this.f25833l.e0();
    }

    @d5.d
    public c.l F0() {
        return this.f25833l.f0();
    }

    public boolean G0() {
        return this.f25833l.g0();
    }

    public boolean H0() {
        return this.f25833l.h0();
    }

    public boolean I0() {
        return this.f25833l.i0();
    }

    public boolean J0() {
        return this.f25833l.j0();
    }

    public boolean K0() {
        return this.f25833l.k0();
    }

    public boolean L0() {
        return this.f25833l.l0();
    }

    @d5.d
    public String L1(@d5.d List<? extends l1> list) {
        l0.p(list, ProtectedSandApp.s("偮"));
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Q0());
        O(sb, list);
        sb.append(M0());
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("偯"));
        return sb2;
    }

    @d5.d
    public String M1(@d5.d h1 h1Var) {
        l0.p(h1Var, ProtectedSandApp.s("偰"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
        if (b6 instanceof f1 ? true : b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? true : b6 instanceof e1) {
            return b1(b6);
        }
        if (b6 == null) {
            return h1Var instanceof g0 ? ((g0) h1Var).i(h.f25845p) : h1Var.toString();
        }
        throw new IllegalStateException((ProtectedSandApp.s("偱") + b6.getClass()).toString());
    }

    public boolean R() {
        return this.f25833l.t();
    }

    public boolean S() {
        return this.f25833l.u();
    }

    @d5.e
    public q3.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> T() {
        return this.f25833l.v();
    }

    public boolean U() {
        return this.f25833l.w();
    }

    public boolean V() {
        return this.f25833l.x();
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.renderer.b W() {
        return this.f25833l.y();
    }

    @d5.e
    public q3.l<j1, String> X() {
        return this.f25833l.z();
    }

    public boolean Y() {
        return this.f25833l.A();
    }

    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> Z() {
        return this.f25833l.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(@d5.d Set<kotlin.reflect.jvm.internal.impl.name.c> set) {
        l0.p(set, ProtectedSandApp.s("偲"));
        this.f25833l.a(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(boolean z5) {
        this.f25833l.b(z5);
    }

    public boolean b0() {
        return this.f25833l.C();
    }

    @d5.d
    public String b1(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        l0.p(hVar, ProtectedSandApp.s("偳"));
        return kotlin.reflect.jvm.internal.impl.types.error.k.m(hVar) ? hVar.m().toString() : W().a(hVar, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(@d5.d Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> set) {
        l0.p(set, ProtectedSandApp.s("側"));
        this.f25833l.c(set);
    }

    public boolean c0() {
        kotlin.reflect.jvm.internal.impl.renderer.g gVar = this.f25833l;
        gVar.getClass();
        return f.a.a(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void d(@d5.d k kVar) {
        l0.p(kVar, ProtectedSandApp.s("偵"));
        this.f25833l.d(kVar);
    }

    public boolean d0() {
        kotlin.reflect.jvm.internal.impl.renderer.g gVar = this.f25833l;
        gVar.getClass();
        return f.a.b(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z5) {
        this.f25833l.e(z5);
    }

    public boolean e0() {
        return this.f25833l.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void f(boolean z5) {
        this.f25833l.f(z5);
    }

    public boolean f0() {
        return this.f25833l.G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean g() {
        return this.f25833l.g();
    }

    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.renderer.e> g0() {
        return this.f25833l.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void h(@d5.d kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("偶"));
        this.f25833l.h(bVar);
    }

    public boolean h0() {
        return this.f25833l.I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void i(boolean z5) {
        this.f25833l.i(z5);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.renderer.g i0() {
        return this.f25833l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void j(boolean z5) {
        this.f25833l.j(z5);
    }

    @d5.d
    public j j0() {
        return this.f25833l.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void k(boolean z5) {
        this.f25833l.k(z5);
    }

    @d5.d
    public k k0() {
        return this.f25833l.K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(boolean z5) {
        this.f25833l.l(z5);
    }

    public boolean l0() {
        return this.f25833l.L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void m(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("偷"));
        this.f25833l.m(mVar);
    }

    public boolean m0() {
        return this.f25833l.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void n(@d5.d kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("偸"));
        this.f25833l.n(aVar);
    }

    @d5.d
    public l n0() {
        return this.f25833l.N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> o() {
        return this.f25833l.o();
    }

    public boolean o0() {
        return this.f25833l.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean p() {
        return this.f25833l.p();
    }

    public boolean p0() {
        return this.f25833l.P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @d5.d
    public kotlin.reflect.jvm.internal.impl.renderer.a q() {
        return this.f25833l.q();
    }

    public boolean q0() {
        return this.f25833l.Q();
    }

    @d5.d
    public String q1(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("偹"));
        int i5 = b.f25837a[B0().ordinal()];
        if (i5 == 1) {
            return str;
        }
        if (i5 == 2) {
            return androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("偺"), str, ProtectedSandApp.s("偻"));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void r(boolean z5) {
        this.f25833l.r(z5);
    }

    public boolean r0() {
        return this.f25833l.R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @d5.d
    public String s(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("偼"));
        StringBuilder sb = new StringBuilder();
        mVar.T(new a(), sb);
        if (H0()) {
            N(sb, mVar);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("偽"));
        return sb2;
    }

    public boolean s0() {
        return this.f25833l.S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @d5.d
    public String t(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        l0.p(cVar, ProtectedSandApp.s("偾"));
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (eVar != null) {
            sb.append(eVar.getRenderName() + ':');
        }
        kotlin.reflect.jvm.internal.impl.types.h0 type = cVar.getType();
        sb.append(y(type));
        if (c0()) {
            List<String> V0 = V0(cVar);
            if (d0() || (!V0.isEmpty())) {
                y.k3(V0, sb, ProtectedSandApp.s("偿"), ProtectedSandApp.s("傀"), ProtectedSandApp.s("傁"), 0, null, null, 112, null);
            }
        }
        if (G0() && (kotlin.reflect.jvm.internal.impl.types.j0.a(type) || (type.U0().b() instanceof k0.b))) {
            sb.append(ProtectedSandApp.s("傂"));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("傃"));
        return sb2;
    }

    public boolean t0() {
        return this.f25833l.T();
    }

    public boolean u0() {
        return this.f25833l.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @d5.d
    public String v(@d5.d String str, @d5.d String str2, @d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        String v5;
        String v52;
        boolean s22;
        l0.p(str, ProtectedSandApp.s("傄"));
        l0.p(str2, ProtectedSandApp.s("傅"));
        l0.p(hVar, ProtectedSandApp.s("傆"));
        boolean f6 = n.f(str, str2);
        String s5 = ProtectedSandApp.s("傇");
        if (f6) {
            s22 = kotlin.text.e0.s2(str2, s5, false, 2, null);
            if (s22) {
                return androidx.constraintlayout.solver.widgets.analyzer.e.a(s5, str, ProtectedSandApp.s("傈"));
            }
            return str + '!';
        }
        kotlin.reflect.jvm.internal.impl.renderer.b W = W();
        kotlin.reflect.jvm.internal.impl.descriptors.e w5 = hVar.w();
        l0.o(w5, ProtectedSandApp.s("傉"));
        v5 = kotlin.text.h0.v5(W.a(w5, this), ProtectedSandApp.s("傊"), null, 2, null);
        String d6 = n.d(str, androidx.concurrent.futures.b.a(v5, ProtectedSandApp.s("傋")), str2, v5, androidx.concurrent.futures.b.a(v5, ProtectedSandApp.s("傌")));
        if (d6 != null) {
            return d6;
        }
        String d7 = n.d(str, androidx.concurrent.futures.b.a(v5, ProtectedSandApp.s("傍")), str2, androidx.concurrent.futures.b.a(v5, ProtectedSandApp.s("傎")), androidx.concurrent.futures.b.a(v5, ProtectedSandApp.s("傏")));
        if (d7 != null) {
            return d7;
        }
        kotlin.reflect.jvm.internal.impl.renderer.b W2 = W();
        kotlin.reflect.jvm.internal.impl.descriptors.e j5 = hVar.j();
        l0.o(j5, ProtectedSandApp.s("傐"));
        v52 = kotlin.text.h0.v5(W2.a(j5, this), ProtectedSandApp.s("傑"), null, 2, null);
        StringBuilder a6 = r.a(v52);
        a6.append(Q(ProtectedSandApp.s("傒")));
        String sb = a6.toString();
        StringBuilder a7 = r.a(v52);
        a7.append(Q(ProtectedSandApp.s("傓")));
        String sb2 = a7.toString();
        StringBuilder a8 = r.a(v52);
        a8.append(Q(ProtectedSandApp.s("傔")));
        String d8 = n.d(str, sb, str2, sb2, a8.toString());
        if (d8 != null) {
            return d8;
        }
        return s5 + str + ProtectedSandApp.s("傕") + str2 + ')';
    }

    public boolean v0() {
        return this.f25833l.V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @d5.d
    public String w(@d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("傖"));
        List<kotlin.reflect.jvm.internal.impl.name.f> h5 = dVar.h();
        l0.o(h5, ProtectedSandApp.s("傗"));
        return j1(h5);
    }

    public boolean w0() {
        return this.f25833l.W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @d5.d
    public String x(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z5) {
        l0.p(fVar, ProtectedSandApp.s("傘"));
        String Q = Q(n.b(fVar));
        return (U() && B0() == m.HTML && z5) ? androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("備"), Q, ProtectedSandApp.s("傚")) : Q;
    }

    public boolean x0() {
        return this.f25833l.X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @d5.d
    public String y(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("傛"));
        StringBuilder sb = new StringBuilder();
        v1(sb, C0().N(h0Var));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("傜"));
        return sb2;
    }

    public boolean y0() {
        return this.f25833l.Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @d5.d
    public String z(@d5.d l1 l1Var) {
        List<? extends l1> k5;
        l0.p(l1Var, ProtectedSandApp.s("傝"));
        StringBuilder sb = new StringBuilder();
        k5 = kotlin.collections.z.k(l1Var);
        O(sb, k5);
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("傞"));
        return sb2;
    }

    public boolean z0() {
        return this.f25833l.Z();
    }
}
