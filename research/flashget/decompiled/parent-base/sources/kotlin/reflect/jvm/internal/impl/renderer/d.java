package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.g0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
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
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.types.y1;
import kotlin.text.m0;
import kotlin.text.v;

/* compiled from: DescriptorRendererImpl.kt */
@r1({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1207:1\n2624#2,3:1208\n766#2:1211\n857#2,2:1212\n1549#2:1214\n1620#2,3:1215\n766#2:1218\n857#2,2:1219\n1549#2:1221\n1620#2,3:1222\n1549#2:1225\n1620#2,3:1226\n1603#2,9:1230\n1855#2:1239\n1856#2:1241\n1612#2:1242\n2624#2,3:1243\n2624#2,3:1246\n766#2:1249\n857#2,2:1250\n1620#2,3:1252\n1#3:1229\n1#3:1240\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n183#1:1208,3\n483#1:1211\n483#1:1212,2\n484#1:1214\n484#1:1215,3\n486#1:1218\n486#1:1219,2\n486#1:1221\n486#1:1222,3\n488#1:1225\n488#1:1226,3\n497#1:1230,9\n497#1:1239\n497#1:1241\n497#1:1242\n588#1:1243,3\n590#1:1246,3\n806#1:1249\n806#1:1250,2\n829#1:1252,3\n497#1:1240\n*E\n"})
/* loaded from: classes7.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.renderer.c implements kotlin.reflect.jvm.internal.impl.renderer.f {

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.renderer.g f77815l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final b0 f77816m;

    /* compiled from: DescriptorRendererImpl.kt */
    private final class a implements o<k2, StringBuilder> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1173a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f77818a;

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
                f77818a = iArr;
            }
        }

        public a() {
        }

        private final void t(t0 t0Var, StringBuilder sb, String str) {
            int i4 = C1173a.f77818a[d.this.m0().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                p(t0Var, sb);
                return;
            }
            d.B(d.this, t0Var, sb);
            sb.append(str + ProtectedSandApp.s("眧\u0001"));
            d dVar = d.this;
            u0 Y = t0Var.Y();
            l0.o(Y, ProtectedSandApp.s("眨\u0001"));
            dVar.B1(Y, sb);
        }

        public void A(@fg.l j1 j1Var, @fg.l StringBuilder sb) {
            l0.p(j1Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.T1(j1Var, true, sb, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
            n(eVar, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 b(q0 q0Var, StringBuilder sb) {
            s(q0Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 c(u0 u0Var, StringBuilder sb) {
            u(u0Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 d(e1 e1Var, StringBuilder sb) {
            y(e1Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 e(w0 w0Var, StringBuilder sb) {
            w(w0Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 f(j1 j1Var, StringBuilder sb) {
            A(j1Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 g(v0 v0Var, StringBuilder sb) {
            v(v0Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 h(kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, StringBuilder sb) {
            r(l0Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 i(z zVar, StringBuilder sb) {
            p(zVar, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 j(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, StringBuilder sb) {
            o(lVar, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 k(h0 h0Var, StringBuilder sb) {
            q(h0Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 l(x0 x0Var, StringBuilder sb) {
            x(x0Var, sb);
            return k2.f75408a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
        public /* bridge */ /* synthetic */ k2 m(f1 f1Var, StringBuilder sb) {
            z(f1Var, sb);
            return k2.f75408a;
        }

        public void n(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l StringBuilder sb) {
            l0.p(eVar, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.Y0(eVar, sb);
        }

        public void o(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @fg.l StringBuilder sb) {
            l0.p(lVar, ProtectedSandApp.s("眫\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.d1(lVar, sb);
        }

        public void p(@fg.l z zVar, @fg.l StringBuilder sb) {
            l0.p(zVar, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.j1(zVar, sb);
        }

        public void q(@fg.l h0 h0Var, @fg.l StringBuilder sb) {
            l0.p(h0Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.t1(h0Var, sb, true);
        }

        public void r(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @fg.l StringBuilder sb) {
            l0.p(l0Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.x1(l0Var, sb);
        }

        public void s(@fg.l q0 q0Var, @fg.l StringBuilder sb) {
            l0.p(q0Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.z1(q0Var, sb);
        }

        public void u(@fg.l u0 u0Var, @fg.l StringBuilder sb) {
            l0.p(u0Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.B1(u0Var, sb);
        }

        public void v(@fg.l v0 v0Var, @fg.l StringBuilder sb) {
            l0.p(v0Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            t(v0Var, sb, ProtectedSandApp.s("眬\u0001"));
        }

        public void w(@fg.l w0 w0Var, @fg.l StringBuilder sb) {
            l0.p(w0Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            t(w0Var, sb, ProtectedSandApp.s("眭\u0001"));
        }

        public void x(@fg.l x0 x0Var, @fg.l StringBuilder sb) {
            l0.p(x0Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            sb.append(x0Var.getName());
        }

        public void y(@fg.l e1 e1Var, @fg.l StringBuilder sb) {
            l0.p(e1Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.J1(e1Var, sb);
        }

        public void z(@fg.l f1 f1Var, @fg.l StringBuilder sb) {
            l0.p(f1Var, ProtectedSandApp.s("眩\u0001"));
            l0.p(sb, ProtectedSandApp.s("眪\u0001"));
            d.this.O1(f1Var, sb, true);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77819a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f77820b;

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
            f77819a = iArr;
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
            f77820b = iArr2;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    static final class c extends n0 implements ld.l<l1, CharSequence> {
        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l l1 l1Var) {
            l0.p(l1Var, ProtectedSandApp.s("眮\u0001"));
            if (l1Var.b()) {
                return ProtectedSandApp.s("眯\u0001");
            }
            d dVar = d.this;
            kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
            l0.o(type, ProtectedSandApp.s("眰\u0001"));
            String y4 = dVar.y(type);
            if (l1Var.c() == x1.INVARIANT) {
                return y4;
            }
            return l1Var.c() + ' ' + y4;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d, reason: collision with other inner class name */
    static final class C1174d extends n0 implements ld.a<d> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d$a */
        static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f77823b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("眱\u0001"));
                fVar.l(kotlin.collections.l1.C(fVar.i(), w.O(l.a.C, l.a.D)));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
                a(fVar);
                return k2.f75408a;
            }
        }

        C1174d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            kotlin.reflect.jvm.internal.impl.renderer.c A = d.this.A(a.f77823b);
            l0.n(A, ProtectedSandApp.s("眲\u0001"));
            return (d) A;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    static final class e extends n0 implements ld.l<j1, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f77824b = new e(1);

        e() {
            super(1);
        }

        @fg.l
        public final CharSequence a(j1 j1Var) {
            return "";
        }

        @Override // ld.l
        public CharSequence invoke(j1 j1Var) {
            return "";
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    static final class f extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.h0, CharSequence> {
        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            d dVar = d.this;
            l0.m(h0Var);
            return dVar.y(h0Var);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    static final class g extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.h0, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f77826b = new g(1);

        g() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("眳\u0001"));
            return h0Var instanceof kotlin.reflect.jvm.internal.impl.types.x0 ? ((kotlin.reflect.jvm.internal.impl.types.x0) h0Var).X0() : h0Var;
        }
    }

    public d(@fg.l kotlin.reflect.jvm.internal.impl.renderer.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("眴\u0001"));
        this.f77815l = gVar;
        gVar.n0();
        this.f77816m = c0.c(new C1174d());
    }

    private final void A1(StringBuilder sb, s0 s0Var) {
        s0 c5 = s0Var.c();
        if (c5 != null) {
            A1(sb, c5);
            sb.append('.');
            kotlin.reflect.jvm.internal.impl.name.f name = s0Var.b().getName();
            l0.o(name, ProtectedSandApp.s("眵\u0001"));
            sb.append(x(name, false));
        } else {
            h1 j4 = s0Var.b().j();
            l0.o(j4, ProtectedSandApp.s("眶\u0001"));
            sb.append(L1(j4));
        }
        sb.append(K1(s0Var.a()));
    }

    public static final void B(d dVar, t0 t0Var, StringBuilder sb) {
        dVar.o1(t0Var, sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(u0 u0Var, StringBuilder sb) {
        boolean b02 = this.f77815l.b0();
        String s4 = ProtectedSandApp.s("眷\u0001");
        if (!b02) {
            if (!this.f77815l.a0()) {
                C1(u0Var, sb);
                List<x0> z02 = u0Var.z0();
                l0.o(z02, ProtectedSandApp.s("眸\u0001"));
                e1(z02, sb);
                u visibility = u0Var.getVisibility();
                l0.o(visibility, ProtectedSandApp.s("眹\u0001"));
                W1(visibility, sb);
                boolean z4 = false;
                s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.CONST) && u0Var.isConst(), ProtectedSandApp.s("眺\u0001"));
                o1(u0Var, sb);
                r1(u0Var, sb);
                w1(u0Var, sb);
                if (this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.LATEINIT) && u0Var.A0()) {
                    z4 = true;
                }
                s1(sb, z4, ProtectedSandApp.s("眻\u0001"));
                n1(u0Var, sb);
            }
            S1(this, u0Var, sb, false, 4, null);
            List<f1> typeParameters = u0Var.getTypeParameters();
            l0.o(typeParameters, s4);
            Q1(typeParameters, sb, true);
            D1(u0Var, sb);
        }
        t1(u0Var, sb, true);
        sb.append(ProtectedSandApp.s("眼\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = u0Var.getType();
        l0.o(type, ProtectedSandApp.s("眽\u0001"));
        sb.append(y(type));
        E1(u0Var, sb);
        l1(u0Var, sb);
        List<f1> typeParameters2 = u0Var.getTypeParameters();
        l0.o(typeParameters2, s4);
        X1(typeParameters2, sb);
    }

    private final void C1(u0 u0Var, StringBuilder sb) {
        if (this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            W0(this, sb, u0Var, null, 2, null);
            x y02 = u0Var.y0();
            if (y02 != null) {
                V0(sb, y02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.FIELD);
            }
            x T = u0Var.T();
            if (T != null) {
                V0(sb, T, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_DELEGATE_FIELD);
            }
            if (this.f77815l.N() == l.NONE) {
                v0 getter = u0Var.getGetter();
                if (getter != null) {
                    V0(sb, getter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_GETTER);
                }
                w0 setter = u0Var.getSetter();
                if (setter != null) {
                    V0(sb, setter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_SETTER);
                    List<j1> i4 = setter.i();
                    l0.o(i4, ProtectedSandApp.s("眾\u0001"));
                    j1 j1Var = (j1) w.h5(i4);
                    l0.m(j1Var);
                    V0(sb, j1Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void D1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb) {
        x0 S = aVar.S();
        if (S != null) {
            V0(sb, S, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            kotlin.reflect.jvm.internal.impl.types.h0 type = S.getType();
            l0.o(type, ProtectedSandApp.s("眽\u0001"));
            sb.append(h1(type));
            sb.append(ProtectedSandApp.s("眿\u0001"));
        }
    }

    private final void E1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb) {
        x0 S;
        if (this.f77815l.P() && (S = aVar.S()) != null) {
            sb.append(ProtectedSandApp.s("着\u0001"));
            kotlin.reflect.jvm.internal.impl.types.h0 type = S.getType();
            l0.o(type, ProtectedSandApp.s("眽\u0001"));
            sb.append(y(type));
        }
    }

    private final void F1(StringBuilder sb, p0 p0Var) {
        boolean g4 = l0.g(p0Var, t1.f78542b);
        String s4 = ProtectedSandApp.s("睁\u0001");
        if (g4 || t1.k(p0Var)) {
            sb.append(s4);
            return;
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.k.o(p0Var)) {
            if (!this.f77815l.e0()) {
                sb.append(s4);
                return;
            }
            h1 O0 = p0Var.O0();
            l0.n(O0, ProtectedSandApp.s("睂\u0001"));
            sb.append(g1(((kotlin.reflect.jvm.internal.impl.types.error.i) O0).f(0)));
            return;
        }
        if (j0.a(p0Var)) {
            f1(sb, p0Var);
        } else if (Y1(p0Var)) {
            k1(sb, p0Var);
        } else {
            f1(sb, p0Var);
        }
    }

    private final void G1(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final void H1(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
        if (this.f77815l.l0() || kotlin.reflect.jvm.internal.impl.builtins.h.n0(eVar.r())) {
            return;
        }
        Collection<kotlin.reflect.jvm.internal.impl.types.h0> j4 = eVar.j().j();
        l0.o(j4, ProtectedSandApp.s("睃\u0001"));
        if (j4.isEmpty()) {
            return;
        }
        if (j4.size() == 1 && kotlin.reflect.jvm.internal.impl.builtins.h.b0(j4.iterator().next())) {
            return;
        }
        G1(sb);
        sb.append(ProtectedSandApp.s("眼\u0001"));
        g0.j3(j4, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("睄\u0001"), (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : new f());
    }

    private final void I1(z zVar, StringBuilder sb) {
        s1(sb, zVar.isSuspend(), ProtectedSandApp.s("睅\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(e1 e1Var, StringBuilder sb) {
        W0(this, sb, e1Var, null, 2, null);
        u visibility = e1Var.getVisibility();
        l0.o(visibility, ProtectedSandApp.s("眹\u0001"));
        W1(visibility, sb);
        o1(e1Var, sb);
        sb.append(m1(ProtectedSandApp.s("睆\u0001")));
        sb.append(ProtectedSandApp.s("睇\u0001"));
        t1(e1Var, sb, true);
        List<f1> s4 = e1Var.s();
        l0.o(s4, ProtectedSandApp.s("睈\u0001"));
        Q1(s4, sb, false);
        X0(e1Var, sb);
        sb.append(ProtectedSandApp.s("睉\u0001"));
        sb.append(y(e1Var.v0()));
    }

    private final String L0() {
        return P(ProtectedSandApp.s("睊\u0001"));
    }

    private final void M(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5;
        String name;
        if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) || (mVar instanceof q0) || (c5 = mVar.c()) == null || (c5 instanceof h0)) {
            return;
        }
        String s4 = ProtectedSandApp.s("睇\u0001");
        sb.append(s4);
        sb.append(p1(ProtectedSandApp.s("睋\u0001")));
        sb.append(s4);
        kotlin.reflect.jvm.internal.impl.name.d m4 = kotlin.reflect.jvm.internal.impl.resolve.f.m(c5);
        l0.o(m4, ProtectedSandApp.s("睌\u0001"));
        sb.append(m4.e() ? ProtectedSandApp.s("睍\u0001") : w(m4));
        if (this.f77815l.j0() && (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && (mVar instanceof p) && (name = ((p) mVar).f().b().getName()) != null) {
            sb.append(s4);
            sb.append(p1(ProtectedSandApp.s("睎\u0001")));
            sb.append(s4);
            sb.append(name);
        }
    }

    private final boolean M0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        return kotlin.reflect.jvm.internal.impl.builtins.g.r(h0Var) || !h0Var.getAnnotations().isEmpty();
    }

    private final void M1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var, h1 h1Var) {
        s0 a5 = g1.a(h0Var);
        if (a5 != null) {
            A1(sb, a5);
        } else {
            sb.append(L1(h1Var));
            sb.append(K1(h0Var.M0()));
        }
    }

    private final void N(StringBuilder sb, List<? extends l1> list) {
        g0.j3(list, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("睄\u0001"), (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : new c());
    }

    private final e0 N0(d0 d0Var) {
        if (d0Var instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) d0Var).b() == kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE ? e0.ABSTRACT : e0.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = d0Var.c();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
        if (eVar == null) {
            return e0.FINAL;
        }
        if (!(d0Var instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
            return e0.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) d0Var;
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e4 = bVar.e();
        l0.o(e4, ProtectedSandApp.s("睏\u0001"));
        if (!e4.isEmpty() && eVar.u() != e0.FINAL) {
            return e0.OPEN;
        }
        if (eVar.b() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || l0.g(bVar.getVisibility(), t.f76286a)) {
            return e0.FINAL;
        }
        e0 u4 = bVar.u();
        e0 e0Var = e0.ABSTRACT;
        return u4 == e0Var ? e0Var : e0.OPEN;
    }

    static /* synthetic */ void N1(d dVar, StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var, h1 h1Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            h1Var = h0Var.O0();
        }
        dVar.M1(sb, h0Var, h1Var);
    }

    private final String O() {
        int i4 = b.f77819a[this.f77815l.c0().ordinal()];
        if (i4 == 1) {
            return P(ProtectedSandApp.s("睑\u0001"));
        }
        if (i4 == 2) {
            return ProtectedSandApp.s("睐\u0001");
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean O0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        return l0.g(cVar.g(), l.a.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(f1 f1Var, StringBuilder sb, boolean z4) {
        if (z4) {
            sb.append(P(ProtectedSandApp.s("睒\u0001")));
        }
        if (this.f77815l.h0()) {
            sb.append(ProtectedSandApp.s("睓\u0001"));
            sb.append(f1Var.getIndex());
            sb.append(ProtectedSandApp.s("睔\u0001"));
        }
        s1(sb, f1Var.l(), ProtectedSandApp.s("睕\u0001"));
        String label = f1Var.o().getLabel();
        boolean z5 = true;
        s1(sb, label.length() > 0, label);
        W0(this, sb, f1Var, null, 2, null);
        t1(f1Var, sb, z4);
        int size = f1Var.getUpperBounds().size();
        String s4 = ProtectedSandApp.s("睖\u0001");
        if ((size > 1 && !z4) || size == 1) {
            kotlin.reflect.jvm.internal.impl.types.h0 next = f1Var.getUpperBounds().iterator().next();
            if (!kotlin.reflect.jvm.internal.impl.builtins.h.j0(next)) {
                sb.append(s4);
                l0.m(next);
                sb.append(y(next));
            }
        } else if (z4) {
            for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : f1Var.getUpperBounds()) {
                if (!kotlin.reflect.jvm.internal.impl.builtins.h.j0(h0Var)) {
                    if (z5) {
                        sb.append(s4);
                    } else {
                        sb.append(ProtectedSandApp.s("睗\u0001"));
                    }
                    l0.m(h0Var);
                    sb.append(y(h0Var));
                    z5 = false;
                }
            }
        }
        if (z4) {
            sb.append(P(ProtectedSandApp.s("睊\u0001")));
        }
    }

    private final String P(String str) {
        return this.f77815l.c0().escape(str);
    }

    private final String P0() {
        return P(ProtectedSandApp.s("睒\u0001"));
    }

    private final void P1(StringBuilder sb, List<? extends f1> list) {
        Iterator<? extends f1> it = list.iterator();
        while (it.hasNext()) {
            O1(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(ProtectedSandApp.s("睄\u0001"));
            }
        }
    }

    private final boolean Q0(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        return !bVar.e().isEmpty();
    }

    private final void Q1(List<? extends f1> list, StringBuilder sb, boolean z4) {
        if (this.f77815l.m0() || list.isEmpty()) {
            return;
        }
        sb.append(P(ProtectedSandApp.s("睒\u0001")));
        P1(sb, list);
        sb.append(P(ProtectedSandApp.s("睊\u0001")));
        if (z4) {
            sb.append(ProtectedSandApp.s("睇\u0001"));
        }
    }

    private final void R0(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.a aVar) {
        m c02 = this.f77815l.c0();
        m mVar = m.HTML;
        if (c02 == mVar) {
            sb.append(ProtectedSandApp.s("睘\u0001"));
        }
        sb.append(ProtectedSandApp.s("睙\u0001"));
        v1(sb, aVar.K());
        sb.append(ProtectedSandApp.s("睚\u0001"));
        if (this.f77815l.c0() == mVar) {
            sb.append(ProtectedSandApp.s("睛\u0001"));
        }
    }

    private final void R1(kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, StringBuilder sb, boolean z4) {
        if (z4 || !(l1Var instanceof j1)) {
            sb.append(m1(l1Var.Q() ? ProtectedSandApp.s("睜\u0001") : ProtectedSandApp.s("睝\u0001")));
            sb.append(ProtectedSandApp.s("睇\u0001"));
        }
    }

    private final void S0(t0 t0Var, StringBuilder sb) {
        o1(t0Var, sb);
    }

    static /* synthetic */ void S1(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, StringBuilder sb, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        dVar.R1(l1Var, sb, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r5.f77815l.u() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r5.f77815l.u() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T0(kotlin.reflect.jvm.internal.impl.descriptors.z r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.x()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "睏\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            if (r0 == 0) goto L41
            java.util.Collection r0 = r6.e()
            kotlin.jvm.internal.l0.o(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L21
            goto L3f
        L21:
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z r4 = (kotlin.reflect.jvm.internal.impl.descriptors.z) r4
            boolean r4 = r4.x()
            if (r4 == 0) goto L25
            kotlin.reflect.jvm.internal.impl.renderer.g r0 = r5.f77815l
            boolean r0 = r0.u()
            if (r0 == 0) goto L41
        L3f:
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            boolean r4 = r6.B()
            if (r4 == 0) goto L7a
            java.util.Collection r4 = r6.e()
            kotlin.jvm.internal.l0.o(r4, r3)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L5b
            goto L79
        L5b:
            java.util.Iterator r3 = r4.iterator()
        L5f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z r4 = (kotlin.reflect.jvm.internal.impl.descriptors.z) r4
            boolean r4 = r4.B()
            if (r4 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.renderer.g r3 = r5.f77815l
            boolean r3 = r3.u()
            if (r3 == 0) goto L7a
        L79:
            r1 = r2
        L7a:
            boolean r2 = r6.G()
            java.lang.String r3 = "睞\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r5.s1(r7, r2, r3)
            r5.I1(r6, r7)
            boolean r6 = r6.k()
            java.lang.String r2 = "睟\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r5.s1(r7, r6, r2)
            java.lang.String r6 = "睠\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.s1(r7, r1, r6)
            java.lang.String r6 = "睡\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.s1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.T0(kotlin.reflect.jvm.internal.impl.descriptors.z, java.lang.StringBuilder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1(kotlin.reflect.jvm.internal.impl.descriptors.j1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L18
            java.lang.String r0 = "睢\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r0 = r9.m1(r0)
            r12.append(r0)
            java.lang.String r0 = "睇\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r12.append(r0)
        L18:
            kotlin.reflect.jvm.internal.impl.renderer.g r0 = r9.f77815l
            boolean r0 = r0.h0()
            if (r0 == 0) goto L39
            java.lang.String r0 = "睓\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
            java.lang.String r0 = "睔\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r12.append(r0)
        L39:
            r5 = 2
            r6 = 0
            r4 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            W0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.t0()
            java.lang.String r1 = "督\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r9.s1(r12, r0, r1)
            boolean r0 = r10.r0()
            java.lang.String r1 = "睤\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r9.s1(r12, r0, r1)
            kotlin.reflect.jvm.internal.impl.renderer.g r0 = r9.f77815l
            boolean r0 = r0.W()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L7c
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r10.c()
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L71
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L72
        L71:
            r0 = 0
        L72:
            if (r0 == 0) goto L7c
            boolean r0 = r0.f0()
            if (r0 != r2) goto L7c
            r8 = r2
            goto L7d
        L7c:
            r8 = r1
        L7d:
            if (r8 == 0) goto L8e
            kotlin.reflect.jvm.internal.impl.renderer.g r0 = r9.f77815l
            boolean r0 = r0.t()
            java.lang.String r3 = "睥\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r9.s1(r12, r0, r3)
        L8e:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.V1(r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.renderer.g r11 = r9.f77815l
            ld.l r11 = r11.z()
            if (r11 == 0) goto Lb2
            kotlin.reflect.jvm.internal.impl.renderer.g r11 = r9.f77815l
            boolean r11 = r11.j()
            if (r11 == 0) goto Lab
            boolean r11 = r10.C0()
            goto Laf
        Lab:
            boolean r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(r10)
        Laf:
            if (r11 == 0) goto Lb2
            r1 = r2
        Lb2:
            if (r1 == 0) goto Ld8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "睉\u0001"
            java.lang.String r13 = com.flashget.parentalcontrol.ProtectedSandApp.s(r13)
            r11.<init>(r13)
            kotlin.reflect.jvm.internal.impl.renderer.g r13 = r9.f77815l
            ld.l r13 = r13.z()
            kotlin.jvm.internal.l0.m(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.T1(kotlin.reflect.jvm.internal.impl.descriptors.j1, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final List<String> U0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.d H;
        List<j1> i4;
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a5 = cVar.a();
        List list = null;
        kotlin.reflect.jvm.internal.impl.descriptors.e i5 = this.f77815l.T() ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar) : null;
        if (i5 != null && (H = i5.H()) != null && (i4 = H.i()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : i4) {
                if (((j1) obj).C0()) {
                    arrayList.add(obj);
                }
            }
            List arrayList2 = new ArrayList(w.b0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((j1) it.next()).getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = kotlin.collections.j0.f74919b;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) obj2;
            l0.m(fVar);
            if (!a5.containsKey(fVar)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(w.b0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((kotlin.reflect.jvm.internal.impl.name.f) it2.next()).b() + ProtectedSandApp.s("睦\u0001"));
        }
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> entrySet = a5.entrySet();
        ArrayList arrayList5 = new ArrayList(w.b0(entrySet, 10));
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar2.b());
            sb.append(ProtectedSandApp.s("睉\u0001"));
            sb.append(!list.contains(fVar2) ? c1(gVar) : ProtectedSandApp.s("睧\u0001"));
            arrayList5.add(sb.toString());
        }
        return w.q5(w.D4(arrayList4, arrayList5));
    }

    private final void U1(Collection<? extends j1> collection, boolean z4, StringBuilder sb) {
        boolean Z1 = Z1(z4);
        int size = collection.size();
        this.f77815l.g0().b(size, sb);
        int i4 = 0;
        for (j1 j1Var : collection) {
            this.f77815l.g0().a(j1Var, i4, size, sb);
            T1(j1Var, Z1, sb, false);
            this.f77815l.g0().c(j1Var, i4, size, sb);
            i4++;
        }
        this.f77815l.g0().d(size, sb);
    }

    private final void V0(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            Set<kotlin.reflect.jvm.internal.impl.name.c> i4 = aVar instanceof kotlin.reflect.jvm.internal.impl.types.h0 ? this.f77815l.i() : this.f77815l.B();
            ld.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> v4 = this.f77815l.v();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.getAnnotations()) {
                if (!w.W1(i4, cVar.g()) && !O0(cVar) && (v4 == null || v4.invoke(cVar).booleanValue())) {
                    sb.append(t(cVar, eVar));
                    if (this.f77815l.A()) {
                        sb.append('\n');
                        l0.o(sb, ProtectedSandApp.s("睨\u0001"));
                    } else {
                        sb.append(ProtectedSandApp.s("睇\u0001"));
                    }
                }
            }
        }
    }

    private final void V1(kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, boolean z4, StringBuilder sb, boolean z5, boolean z6) {
        kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
        l0.o(type, ProtectedSandApp.s("眽\u0001"));
        j1 j1Var = l1Var instanceof j1 ? (j1) l1Var : null;
        kotlin.reflect.jvm.internal.impl.types.h0 x02 = j1Var != null ? j1Var.x0() : null;
        kotlin.reflect.jvm.internal.impl.types.h0 h0Var = x02 == null ? type : x02;
        s1(sb, x02 != null, ProtectedSandApp.s("睩\u0001"));
        if (z6 || (z5 && !this.f77815l.b0())) {
            R1(l1Var, sb, z6);
        }
        if (z4) {
            t1(l1Var, sb, z5);
            sb.append(ProtectedSandApp.s("眼\u0001"));
        }
        sb.append(y(h0Var));
        l1(l1Var, sb);
        if (!this.f77815l.h0() || x02 == null) {
            return;
        }
        sb.append(ProtectedSandApp.s("睪\u0001"));
        sb.append(y(type));
        sb.append(ProtectedSandApp.s("睫\u0001"));
    }

    static /* synthetic */ void W0(d dVar, StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            eVar = null;
        }
        dVar.V0(sb, aVar, eVar);
    }

    private final boolean W1(u uVar, StringBuilder sb) {
        if (!this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VISIBILITY)) {
            return false;
        }
        if (this.f77815l.I()) {
            uVar = uVar.f();
        }
        if (!this.f77815l.V() && l0.g(uVar, t.f76297l)) {
            return false;
        }
        sb.append(m1(uVar.c()));
        sb.append(ProtectedSandApp.s("睇\u0001"));
        return true;
    }

    private final void X0(kotlin.reflect.jvm.internal.impl.descriptors.i iVar, StringBuilder sb) {
        List<f1> s4 = iVar.s();
        l0.o(s4, ProtectedSandApp.s("睈\u0001"));
        List<f1> parameters = iVar.j().getParameters();
        l0.o(parameters, ProtectedSandApp.s("睬\u0001"));
        if (this.f77815l.h0() && iVar.n() && parameters.size() > s4.size()) {
            sb.append(ProtectedSandApp.s("睭\u0001"));
            P1(sb, parameters.subList(s4.size(), parameters.size()));
            sb.append(ProtectedSandApp.s("睫\u0001"));
        }
    }

    private final void X1(List<? extends f1> list, StringBuilder sb) {
        if (this.f77815l.m0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (f1 f1Var : list) {
            List<kotlin.reflect.jvm.internal.impl.types.h0> upperBounds = f1Var.getUpperBounds();
            l0.o(upperBounds, ProtectedSandApp.s("睮\u0001"));
            for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : w.c2(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                kotlin.reflect.jvm.internal.impl.name.f name = f1Var.getName();
                l0.o(name, ProtectedSandApp.s("眵\u0001"));
                sb2.append(x(name, false));
                sb2.append(ProtectedSandApp.s("睖\u0001"));
                l0.m(h0Var);
                sb2.append(y(h0Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String s4 = ProtectedSandApp.s("睇\u0001");
        sb.append(s4);
        sb.append(m1(ProtectedSandApp.s("睯\u0001")));
        sb.append(s4);
        g0.j3(arrayList, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("睄\u0001"), (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.d H;
        boolean z4 = eVar.b() == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY;
        boolean b02 = this.f77815l.b0();
        String s4 = ProtectedSandApp.s("眹\u0001");
        if (!b02) {
            W0(this, sb, eVar, null, 2, null);
            List<x0> b03 = eVar.b0();
            l0.o(b03, ProtectedSandApp.s("睰\u0001"));
            e1(b03, sb);
            if (!z4) {
                u visibility = eVar.getVisibility();
                l0.o(visibility, s4);
                W1(visibility, sb);
            }
            if ((eVar.b() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || eVar.u() != e0.ABSTRACT) && (!eVar.b().isSingleton() || eVar.u() != e0.FINAL)) {
                e0 u4 = eVar.u();
                l0.o(u4, ProtectedSandApp.s("睱\u0001"));
                q1(u4, sb, N0(eVar));
            }
            o1(eVar, sb);
            s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INNER) && eVar.n(), ProtectedSandApp.s("睲\u0001"));
            s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.DATA) && eVar.C(), ProtectedSandApp.s("睳\u0001"));
            s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INLINE) && eVar.k(), ProtectedSandApp.s("睟\u0001"));
            s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VALUE) && eVar.w(), ProtectedSandApp.s("睴\u0001"));
            s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.FUN) && eVar.v(), ProtectedSandApp.s("睵\u0001"));
            Z0(eVar, sb);
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.f.x(eVar)) {
            b1(eVar, sb);
        } else {
            if (!this.f77815l.b0()) {
                G1(sb);
            }
            t1(eVar, sb, true);
        }
        if (z4) {
            return;
        }
        List<f1> s5 = eVar.s();
        l0.o(s5, ProtectedSandApp.s("睈\u0001"));
        Q1(s5, sb, false);
        X0(eVar, sb);
        if (!eVar.b().isSingleton() && this.f77815l.x() && (H = eVar.H()) != null) {
            sb.append(ProtectedSandApp.s("睇\u0001"));
            W0(this, sb, H, null, 2, null);
            u visibility2 = H.getVisibility();
            l0.o(visibility2, s4);
            W1(visibility2, sb);
            sb.append(m1(ProtectedSandApp.s("睶\u0001")));
            List<j1> i4 = H.i();
            l0.o(i4, ProtectedSandApp.s("眾\u0001"));
            U1(i4, H.i0(), sb);
        }
        H1(eVar, sb);
        X1(s5, sb);
    }

    private final boolean Y1(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (kotlin.reflect.jvm.internal.impl.builtins.g.p(h0Var)) {
            List<l1> M0 = h0Var.M0();
            if (!(M0 instanceof Collection) || !M0.isEmpty()) {
                Iterator<T> it = M0.iterator();
                while (it.hasNext()) {
                    if (((l1) it.next()).b()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final d Z() {
        return (d) this.f77816m.getValue();
    }

    private final void Z0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
        sb.append(m1(kotlin.reflect.jvm.internal.impl.renderer.c.f77792a.a(eVar)));
    }

    private final boolean Z1(boolean z4) {
        int i4 = b.f77820b[this.f77815l.K().ordinal()];
        if (i4 == 1) {
            return true;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z4) {
            return true;
        }
        return false;
    }

    private final void b1(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, StringBuilder sb) {
        boolean Q = this.f77815l.Q();
        String s4 = ProtectedSandApp.s("眵\u0001");
        if (Q) {
            if (this.f77815l.b0()) {
                sb.append(ProtectedSandApp.s("睷\u0001"));
            }
            G1(sb);
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = mVar.c();
            if (c5 != null) {
                sb.append(ProtectedSandApp.s("睸\u0001"));
                kotlin.reflect.jvm.internal.impl.name.f name = c5.getName();
                l0.o(name, s4);
                sb.append(x(name, false));
            }
        }
        if (this.f77815l.h0() || !l0.g(mVar.getName(), kotlin.reflect.jvm.internal.impl.name.h.f77591d)) {
            if (!this.f77815l.b0()) {
                G1(sb);
            }
            kotlin.reflect.jvm.internal.impl.name.f name2 = mVar.getName();
            l0.o(name2, s4);
            sb.append(x(name2, true));
        }
    }

    private final String c1(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        ld.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>, String> O = this.f77815l.O();
        if (O != null) {
            return O.invoke(gVar);
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b5 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = b5.iterator();
            while (it.hasNext()) {
                String c12 = c1((kotlin.reflect.jvm.internal.impl.resolve.constants.g) it.next());
                if (c12 != null) {
                    arrayList.add(c12);
                }
            }
            return w.m3(arrayList, ProtectedSandApp.s("睄\u0001"), ProtectedSandApp.s("睹\u0001"), ProtectedSandApp.s("睺\u0001"), 0, null, null, 56, null);
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            return v.a4(kotlin.reflect.jvm.internal.impl.renderer.c.u(this, ((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).b(), null, 2, null), ProtectedSandApp.s("睻\u0001"));
        }
        if (!(gVar instanceof q)) {
            return gVar.toString();
        }
        q.b b6 = ((q) gVar).b();
        boolean z4 = b6 instanceof q.b.a;
        String s4 = ProtectedSandApp.s("睼\u0001");
        if (z4) {
            return ((q.b.a) b6).a() + s4;
        }
        if (!(b6 instanceof q.b.C1177b)) {
            throw new NoWhenBranchMatchedException();
        }
        q.b.C1177b c1177b = (q.b.C1177b) b6;
        String b7 = c1177b.b().b().b();
        l0.o(b7, ProtectedSandApp.s("睽\u0001"));
        int a5 = c1177b.a();
        for (int i4 = 0; i4 < a5; i4++) {
            b7 = ProtectedSandApp.s("睾\u0001") + b7 + m0.greater;
        }
        return androidx.compose.runtime.changelist.j.a(b7, s4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(kotlin.reflect.jvm.internal.impl.descriptors.l r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.d1(kotlin.reflect.jvm.internal.impl.descriptors.l, java.lang.StringBuilder):void");
    }

    private final void e1(List<? extends x0> list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append(ProtectedSandApp.s("瞃\u0001"));
        int i4 = 0;
        for (x0 x0Var : list) {
            int i5 = i4 + 1;
            V0(sb, x0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            kotlin.reflect.jvm.internal.impl.types.h0 type = x0Var.getType();
            l0.o(type, ProtectedSandApp.s("眽\u0001"));
            sb.append(h1(type));
            if (i4 == w.J(list)) {
                sb.append(ProtectedSandApp.s("瞄\u0001"));
            } else {
                sb.append(ProtectedSandApp.s("睄\u0001"));
            }
            i4 = i5;
        }
    }

    private final void f1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        W0(this, sb, h0Var, null, 2, null);
        kotlin.reflect.jvm.internal.impl.types.q qVar = h0Var instanceof kotlin.reflect.jvm.internal.impl.types.q ? (kotlin.reflect.jvm.internal.impl.types.q) h0Var : null;
        p0 a12 = qVar != null ? qVar.a1() : null;
        if (j0.a(h0Var)) {
            if (kotlin.reflect.jvm.internal.impl.types.typeUtil.a.u(h0Var) && this.f77815l.M()) {
                sb.append(g1(kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.p(h0Var)));
            } else {
                if (!(h0Var instanceof kotlin.reflect.jvm.internal.impl.types.error.h) || this.f77815l.G()) {
                    sb.append(h0Var.O0().toString());
                } else {
                    sb.append(((kotlin.reflect.jvm.internal.impl.types.error.h) h0Var).X0());
                }
                sb.append(K1(h0Var.M0()));
            }
        } else if (h0Var instanceof kotlin.reflect.jvm.internal.impl.types.x0) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.x0) h0Var).X0().toString());
        } else if (a12 instanceof kotlin.reflect.jvm.internal.impl.types.x0) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.x0) a12).X0().toString());
        } else {
            N1(this, sb, h0Var, null, 2, null);
        }
        if (h0Var.P0()) {
            sb.append(ProtectedSandApp.s("瞅\u0001"));
        }
        if (kotlin.reflect.jvm.internal.impl.types.t0.c(h0Var)) {
            sb.append(ProtectedSandApp.s("瞆\u0001"));
        }
    }

    private final String g1(String str) {
        int i4 = b.f77819a[this.f77815l.c0().ordinal()];
        if (i4 == 1) {
            return str;
        }
        if (i4 == 2) {
            return android.support.v4.media.d.a(ProtectedSandApp.s("瞇\u0001"), str, ProtectedSandApp.s("瞈\u0001"));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String h1(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        String y4 = y(h0Var);
        if ((!Y1(h0Var) || t1.l(h0Var)) && !(h0Var instanceof kotlin.reflect.jvm.internal.impl.types.q)) {
            return y4;
        }
        return ProtectedSandApp.s("瞁\u0001") + y4 + ')';
    }

    private final String i1(List<kotlin.reflect.jvm.internal.impl.name.f> list) {
        return P(n.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1(z zVar, StringBuilder sb) {
        boolean b02 = this.f77815l.b0();
        String s4 = ProtectedSandApp.s("眷\u0001");
        if (!b02) {
            if (!this.f77815l.a0()) {
                W0(this, sb, zVar, null, 2, null);
                List<x0> z02 = zVar.z0();
                l0.o(z02, ProtectedSandApp.s("眸\u0001"));
                e1(z02, sb);
                u visibility = zVar.getVisibility();
                l0.o(visibility, ProtectedSandApp.s("眹\u0001"));
                W1(visibility, sb);
                r1(zVar, sb);
                if (this.f77815l.C()) {
                    o1(zVar, sb);
                }
                w1(zVar, sb);
                if (this.f77815l.C()) {
                    T0(zVar, sb);
                } else {
                    I1(zVar, sb);
                }
                n1(zVar, sb);
                if (this.f77815l.h0()) {
                    if (zVar.E0()) {
                        sb.append(ProtectedSandApp.s("瞉\u0001"));
                    }
                    if (zVar.H0()) {
                        sb.append(ProtectedSandApp.s("瞊\u0001"));
                    }
                }
            }
            sb.append(m1(ProtectedSandApp.s("睵\u0001")));
            sb.append(ProtectedSandApp.s("睇\u0001"));
            List<f1> typeParameters = zVar.getTypeParameters();
            l0.o(typeParameters, s4);
            Q1(typeParameters, sb, true);
            D1(zVar, sb);
        }
        t1(zVar, sb, true);
        List<j1> i4 = zVar.i();
        l0.o(i4, ProtectedSandApp.s("眾\u0001"));
        U1(i4, zVar.i0(), sb);
        E1(zVar, sb);
        kotlin.reflect.jvm.internal.impl.types.h0 returnType = zVar.getReturnType();
        if (!this.f77815l.k0() && (this.f77815l.f0() || returnType == null || !kotlin.reflect.jvm.internal.impl.builtins.h.C0(returnType))) {
            sb.append(ProtectedSandApp.s("眼\u0001"));
            sb.append(returnType == null ? ProtectedSandApp.s("瞋\u0001") : y(returnType));
        }
        List<f1> typeParameters2 = zVar.getTypeParameters();
        l0.o(typeParameters2, s4);
        X1(typeParameters2, sb);
    }

    private final void k1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        int length = sb.length();
        W0(Z(), sb, h0Var, null, 2, null);
        boolean z4 = sb.length() != length;
        kotlin.reflect.jvm.internal.impl.types.h0 k4 = kotlin.reflect.jvm.internal.impl.builtins.g.k(h0Var);
        List<kotlin.reflect.jvm.internal.impl.types.h0> e4 = kotlin.reflect.jvm.internal.impl.builtins.g.e(h0Var);
        boolean isEmpty = e4.isEmpty();
        String s4 = ProtectedSandApp.s("瞄\u0001");
        String s5 = ProtectedSandApp.s("睄\u0001");
        if (!isEmpty) {
            sb.append(ProtectedSandApp.s("瞃\u0001"));
            Iterator<kotlin.reflect.jvm.internal.impl.types.h0> it = e4.subList(0, w.J(e4)).iterator();
            while (it.hasNext()) {
                u1(sb, it.next());
                sb.append(s5);
            }
            u1(sb, (kotlin.reflect.jvm.internal.impl.types.h0) w.p3(e4));
            sb.append(s4);
        }
        boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.g.r(h0Var);
        boolean P0 = h0Var.P0();
        boolean z5 = P0 || (z4 && k4 != null);
        String s6 = ProtectedSandApp.s("瞁\u0001");
        if (z5) {
            if (r4) {
                sb.insert(length, '(');
            } else {
                if (z4) {
                    kotlin.text.c.r(v.r7(sb));
                    if (sb.charAt(v.g3(sb) - 1) != ')') {
                        sb.insert(v.g3(sb), ProtectedSandApp.s("瞌\u0001"));
                    }
                }
                sb.append(s6);
            }
        }
        s1(sb, r4, ProtectedSandApp.s("睅\u0001"));
        String s7 = ProtectedSandApp.s("瞂\u0001");
        if (k4 != null) {
            boolean z6 = (Y1(k4) && !k4.P0()) || M0(k4) || (k4 instanceof kotlin.reflect.jvm.internal.impl.types.q);
            if (z6) {
                sb.append(s6);
            }
            u1(sb, k4);
            if (z6) {
                sb.append(s7);
            }
            sb.append(ProtectedSandApp.s("眿\u0001"));
        }
        sb.append(s6);
        if (!kotlin.reflect.jvm.internal.impl.builtins.g.n(h0Var) || h0Var.M0().size() > 1) {
            int i4 = 0;
            for (l1 l1Var : kotlin.reflect.jvm.internal.impl.builtins.g.m(h0Var)) {
                int i5 = i4 + 1;
                if (i4 > 0) {
                    sb.append(s5);
                }
                if (this.f77815l.L()) {
                    kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
                    l0.o(type, ProtectedSandApp.s("眽\u0001"));
                    fVar = kotlin.reflect.jvm.internal.impl.builtins.g.d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb.append(x(fVar, false));
                    sb.append(ProtectedSandApp.s("眼\u0001"));
                }
                sb.append(z(l1Var));
                i4 = i5;
            }
        } else {
            sb.append(ProtectedSandApp.s("睁\u0001"));
        }
        sb.append(s4);
        sb.append(O());
        sb.append(ProtectedSandApp.s("睇\u0001"));
        u1(sb, kotlin.reflect.jvm.internal.impl.builtins.g.l(h0Var));
        if (z5) {
            sb.append(s7);
        }
        if (P0) {
            sb.append(ProtectedSandApp.s("瞅\u0001"));
        }
    }

    private final void l1(kotlin.reflect.jvm.internal.impl.descriptors.l1 l1Var, StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> q02;
        String c12;
        if (!this.f77815l.F() || (q02 = l1Var.q0()) == null || (c12 = c1(q02)) == null) {
            return;
        }
        sb.append(ProtectedSandApp.s("睉\u0001"));
        sb.append(P(c12));
    }

    private final String m1(String str) {
        int i4 = b.f77819a[this.f77815l.c0().ordinal()];
        if (i4 == 1) {
            return str;
        }
        if (i4 == 2) {
            return this.f77815l.w() ? str : android.support.v4.media.d.a(ProtectedSandApp.s("瞍\u0001"), str, ProtectedSandApp.s("瞎\u0001"));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void n1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb) {
        if (this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MEMBER_KIND) && this.f77815l.h0() && bVar.b() != b.a.DECLARATION) {
            sb.append(ProtectedSandApp.s("睓\u0001"));
            sb.append(de.a.f(bVar.b().name()));
            sb.append(ProtectedSandApp.s("睔\u0001"));
        }
    }

    private final void o1(d0 d0Var, StringBuilder sb) {
        s1(sb, d0Var.t(), ProtectedSandApp.s("瞏\u0001"));
        boolean z4 = false;
        s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.EXPECT) && d0Var.m0(), ProtectedSandApp.s("瞐\u0001"));
        if (this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ACTUAL) && d0Var.a0()) {
            z4 = true;
        }
        s1(sb, z4, ProtectedSandApp.s("睥\u0001"));
    }

    private final void q1(e0 e0Var, StringBuilder sb, e0 e0Var2) {
        if (this.f77815l.U() || e0Var != e0Var2) {
            s1(sb, this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MODALITY), de.a.f(e0Var.name()));
        }
    }

    private final void r1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb) {
        if (kotlin.reflect.jvm.internal.impl.resolve.f.J(bVar) && bVar.u() == e0.FINAL) {
            return;
        }
        if (this.f77815l.J() == j.RENDER_OVERRIDE && bVar.u() == e0.OPEN && Q0(bVar)) {
            return;
        }
        e0 u4 = bVar.u();
        l0.o(u4, ProtectedSandApp.s("睱\u0001"));
        q1(u4, sb, N0(bVar));
    }

    private final void s1(StringBuilder sb, boolean z4, String str) {
        if (z4) {
            sb.append(m1(str));
            sb.append(ProtectedSandApp.s("睇\u0001"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, StringBuilder sb, boolean z4) {
        kotlin.reflect.jvm.internal.impl.name.f name = mVar.getName();
        l0.o(name, ProtectedSandApp.s("眵\u0001"));
        sb.append(x(name, z4));
    }

    private final void u1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        w1 R0 = h0Var.R0();
        kotlin.reflect.jvm.internal.impl.types.a aVar = R0 instanceof kotlin.reflect.jvm.internal.impl.types.a ? (kotlin.reflect.jvm.internal.impl.types.a) R0 : null;
        if (aVar == null) {
            v1(sb, h0Var);
            return;
        }
        if (this.f77815l.X()) {
            v1(sb, aVar.K());
            return;
        }
        v1(sb, aVar.a1());
        if (this.f77815l.Y()) {
            R0(sb, aVar);
        }
    }

    private final void v1(StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if ((h0Var instanceof y1) && this.f77815l.j() && !((y1) h0Var).T0()) {
            sb.append(ProtectedSandApp.s("瞑\u0001"));
            return;
        }
        w1 R0 = h0Var.R0();
        if (R0 instanceof kotlin.reflect.jvm.internal.impl.types.b0) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.b0) R0).Y0(this, this));
        } else if (R0 instanceof p0) {
            F1(sb, (p0) R0);
        }
    }

    private final void w1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb) {
        if (this.f77815l.H().contains(kotlin.reflect.jvm.internal.impl.renderer.e.OVERRIDE) && Q0(bVar) && this.f77815l.J() != j.RENDER_OPEN) {
            s1(sb, true, ProtectedSandApp.s("瞒\u0001"));
            if (this.f77815l.h0()) {
                sb.append(ProtectedSandApp.s("睓\u0001"));
                sb.append(bVar.e().size());
                sb.append(ProtectedSandApp.s("睔\u0001"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, StringBuilder sb) {
        y1(l0Var.g(), ProtectedSandApp.s("瞓\u0001"), sb);
        if (this.f77815l.j()) {
            sb.append(ProtectedSandApp.s("瞔\u0001"));
            t1(l0Var.c(), sb, false);
        }
    }

    private final void y1(kotlin.reflect.jvm.internal.impl.name.c cVar, String str, StringBuilder sb) {
        sb.append(m1(str));
        kotlin.reflect.jvm.internal.impl.name.d j4 = cVar.j();
        l0.o(j4, ProtectedSandApp.s("瞕\u0001"));
        String w4 = w(j4);
        if (w4.length() > 0) {
            sb.append(ProtectedSandApp.s("睇\u0001"));
            sb.append(w4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(q0 q0Var, StringBuilder sb) {
        y1(q0Var.g(), ProtectedSandApp.s("瞖\u0001"), sb);
        if (this.f77815l.j()) {
            sb.append(ProtectedSandApp.s("瞗\u0001"));
            t1(q0Var.D0(), sb, false);
        }
    }

    @fg.l
    public m A0() {
        return this.f77815l.c0();
    }

    @fg.l
    public ld.l<kotlin.reflect.jvm.internal.impl.types.h0, kotlin.reflect.jvm.internal.impl.types.h0> B0() {
        return this.f77815l.d0();
    }

    public boolean C0() {
        return this.f77815l.e0();
    }

    public boolean D0() {
        return this.f77815l.f0();
    }

    @fg.l
    public c.l E0() {
        return this.f77815l.g0();
    }

    public boolean F0() {
        return this.f77815l.h0();
    }

    public boolean G0() {
        return this.f77815l.i0();
    }

    public boolean H0() {
        return this.f77815l.j0();
    }

    public boolean I0() {
        return this.f77815l.k0();
    }

    public boolean J0() {
        return this.f77815l.l0();
    }

    public boolean K0() {
        return this.f77815l.m0();
    }

    @fg.l
    public String K1(@fg.l List<? extends l1> list) {
        l0.p(list, ProtectedSandApp.s("瞘\u0001"));
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(P(ProtectedSandApp.s("睒\u0001")));
        N(sb, list);
        sb.append(P(ProtectedSandApp.s("睊\u0001")));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("瞙\u0001"));
        return sb2;
    }

    @fg.l
    public String L1(@fg.l h1 h1Var) {
        l0.p(h1Var, ProtectedSandApp.s("瞚\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
        if (c5 instanceof f1 ? true : c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? true : c5 instanceof e1) {
            return a1(c5);
        }
        if (c5 == null) {
            return h1Var instanceof kotlin.reflect.jvm.internal.impl.types.g0 ? ((kotlin.reflect.jvm.internal.impl.types.g0) h1Var).h(g.f77826b) : h1Var.toString();
        }
        throw new IllegalStateException((ProtectedSandApp.s("瞛\u0001") + c5.getClass()).toString());
    }

    public boolean Q() {
        return this.f77815l.t();
    }

    public boolean R() {
        return this.f77815l.u();
    }

    @fg.m
    public ld.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> S() {
        return this.f77815l.v();
    }

    public boolean T() {
        return this.f77815l.w();
    }

    public boolean U() {
        return this.f77815l.x();
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.renderer.b V() {
        return this.f77815l.y();
    }

    @fg.m
    public ld.l<j1, String> W() {
        return this.f77815l.z();
    }

    public boolean X() {
        return this.f77815l.A();
    }

    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.c> Y() {
        return this.f77815l.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(boolean z4) {
        this.f77815l.a(z4);
    }

    public boolean a0() {
        return this.f77815l.C();
    }

    @fg.l
    public String a1(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        l0.p(hVar, ProtectedSandApp.s("瞜\u0001"));
        return kotlin.reflect.jvm.internal.impl.types.error.k.m(hVar) ? hVar.j().toString() : this.f77815l.y().a(hVar, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(@fg.l k kVar) {
        l0.p(kVar, ProtectedSandApp.s("瞝\u0001"));
        this.f77815l.b(kVar);
    }

    public boolean b0() {
        kotlin.reflect.jvm.internal.impl.renderer.g gVar = this.f77815l;
        gVar.getClass();
        return f.a.a(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(boolean z4) {
        this.f77815l.c(z4);
    }

    public boolean c0() {
        kotlin.reflect.jvm.internal.impl.renderer.g gVar = this.f77815l;
        gVar.getClass();
        return f.a.b(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean d() {
        return this.f77815l.d();
    }

    public boolean d0() {
        return this.f77815l.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z4) {
        this.f77815l.e(z4);
    }

    public boolean e0() {
        return this.f77815l.G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void f(boolean z4) {
        this.f77815l.f(z4);
    }

    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.renderer.e> f0() {
        return this.f77815l.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void g(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("瞝\u0001"));
        this.f77815l.g(mVar);
    }

    public boolean g0() {
        return this.f77815l.I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void h(@fg.l kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("瞝\u0001"));
        this.f77815l.h(aVar);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.renderer.g h0() {
        return this.f77815l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.c> i() {
        return this.f77815l.i();
    }

    @fg.l
    public j i0() {
        return this.f77815l.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean j() {
        return this.f77815l.j();
    }

    @fg.l
    public k j0() {
        return this.f77815l.K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @fg.l
    public kotlin.reflect.jvm.internal.impl.renderer.a k() {
        return this.f77815l.k();
    }

    public boolean k0() {
        return this.f77815l.L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(@fg.l Set<kotlin.reflect.jvm.internal.impl.name.c> set) {
        l0.p(set, ProtectedSandApp.s("瞝\u0001"));
        this.f77815l.l(set);
    }

    public boolean l0() {
        return this.f77815l.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void m(@fg.l Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> set) {
        l0.p(set, ProtectedSandApp.s("瞝\u0001"));
        this.f77815l.m(set);
    }

    @fg.l
    public l m0() {
        return this.f77815l.N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void n(boolean z4) {
        this.f77815l.n(z4);
    }

    public boolean n0() {
        return this.f77815l.P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void o(@fg.l kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("瞝\u0001"));
        this.f77815l.o(bVar);
    }

    public boolean o0() {
        return this.f77815l.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void p(boolean z4) {
        this.f77815l.p(z4);
    }

    public boolean p0() {
        return this.f77815l.R();
    }

    @fg.l
    public String p1(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("瞞\u0001"));
        int i4 = b.f77819a[this.f77815l.c0().ordinal()];
        if (i4 == 1) {
            return str;
        }
        if (i4 == 2) {
            return android.support.v4.media.d.a(ProtectedSandApp.s("瞟\u0001"), str, ProtectedSandApp.s("瞠\u0001"));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void q(boolean z4) {
        this.f77815l.q(z4);
    }

    public boolean q0() {
        return this.f77815l.S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void r(boolean z4) {
        this.f77815l.r(z4);
    }

    public boolean r0() {
        return this.f77815l.T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @fg.l
    public String s(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("瞡\u0001"));
        StringBuilder sb = new StringBuilder();
        mVar.E(new a(), sb);
        if (this.f77815l.i0()) {
            M(sb, mVar);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("瞙\u0001"));
        return sb2;
    }

    public boolean s0() {
        return this.f77815l.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @fg.l
    public String t(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        l0.p(cVar, ProtectedSandApp.s("瞢\u0001"));
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (eVar != null) {
            sb.append(eVar.getRenderName() + ':');
        }
        kotlin.reflect.jvm.internal.impl.types.h0 type = cVar.getType();
        sb.append(y(type));
        if (b0()) {
            List<String> U0 = U0(cVar);
            if (c0() || !U0.isEmpty()) {
                g0.j3(U0, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("睄\u0001"), (r14 & 4) != 0 ? "" : ProtectedSandApp.s("瞁\u0001"), (r14 & 8) == 0 ? ProtectedSandApp.s("瞂\u0001") : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : null);
            }
        }
        if (this.f77815l.h0() && (j0.a(type) || (type.O0().c() instanceof k0.b))) {
            sb.append(ProtectedSandApp.s("瞣\u0001"));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("瞙\u0001"));
        return sb2;
    }

    public boolean t0() {
        return this.f77815l.V();
    }

    public boolean u0() {
        return this.f77815l.W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @fg.l
    public String v(@fg.l String str, @fg.l String str2, @fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        l0.p(str, ProtectedSandApp.s("瞤\u0001"));
        l0.p(str2, ProtectedSandApp.s("瞥\u0001"));
        l0.p(hVar, ProtectedSandApp.s("瞦\u0001"));
        boolean f4 = n.f(str, str2);
        String s4 = ProtectedSandApp.s("瞁\u0001");
        if (f4) {
            if (v.s2(str2, s4, false, 2, null)) {
                return android.support.v4.media.d.a(s4, str, ProtectedSandApp.s("瞧\u0001"));
            }
            return str + '!';
        }
        kotlin.reflect.jvm.internal.impl.renderer.b y4 = this.f77815l.y();
        kotlin.reflect.jvm.internal.impl.descriptors.e w4 = hVar.w();
        l0.o(w4, ProtectedSandApp.s("瞨\u0001"));
        String v5 = v.v5(y4.a(w4, this), ProtectedSandApp.s("瞩\u0001"), null, 2, null);
        String d5 = n.d(str, androidx.compose.runtime.changelist.j.a(v5, ProtectedSandApp.s("瞪\u0001")), str2, v5, androidx.compose.runtime.changelist.j.a(v5, ProtectedSandApp.s("瞫\u0001")));
        if (d5 != null) {
            return d5;
        }
        String d6 = n.d(str, androidx.compose.runtime.changelist.j.a(v5, ProtectedSandApp.s("瞬\u0001")), str2, androidx.compose.runtime.changelist.j.a(v5, ProtectedSandApp.s("瞭\u0001")), androidx.compose.runtime.changelist.j.a(v5, ProtectedSandApp.s("瞮\u0001")));
        if (d6 != null) {
            return d6;
        }
        kotlin.reflect.jvm.internal.impl.renderer.b y5 = this.f77815l.y();
        kotlin.reflect.jvm.internal.impl.descriptors.e j4 = hVar.j();
        l0.o(j4, ProtectedSandApp.s("瞯\u0001"));
        String v52 = v.v5(y5.a(j4, this), ProtectedSandApp.s("瞰\u0001"), null, 2, null);
        StringBuilder a5 = j4.a(v52);
        a5.append(P(ProtectedSandApp.s("瞱\u0001")));
        String sb = a5.toString();
        StringBuilder a6 = j4.a(v52);
        a6.append(P(ProtectedSandApp.s("瞲\u0001")));
        String sb2 = a6.toString();
        StringBuilder a7 = j4.a(v52);
        a7.append(P(ProtectedSandApp.s("瞳\u0001")));
        String d7 = n.d(str, sb, str2, sb2, a7.toString());
        if (d7 != null) {
            return d7;
        }
        return s4 + str + ProtectedSandApp.s("瞴\u0001") + str2 + ')';
    }

    public boolean v0() {
        return this.f77815l.X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @fg.l
    public String w(@fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("瞵\u0001"));
        List<kotlin.reflect.jvm.internal.impl.name.f> h4 = dVar.h();
        l0.o(h4, ProtectedSandApp.s("瞶\u0001"));
        return i1(h4);
    }

    public boolean w0() {
        return this.f77815l.Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @fg.l
    public String x(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z4) {
        l0.p(fVar, ProtectedSandApp.s("瞷\u0001"));
        String P = P(n.b(fVar));
        return (this.f77815l.w() && this.f77815l.c0() == m.HTML && z4) ? android.support.v4.media.d.a(ProtectedSandApp.s("瞍\u0001"), P, ProtectedSandApp.s("瞎\u0001")) : P;
    }

    public boolean x0() {
        return this.f77815l.Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @fg.l
    public String y(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("瞸\u0001"));
        StringBuilder sb = new StringBuilder();
        u1(sb, this.f77815l.d0().invoke(h0Var));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("瞙\u0001"));
        return sb2;
    }

    public boolean y0() {
        return this.f77815l.a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    @fg.l
    public String z(@fg.l l1 l1Var) {
        l0.p(l1Var, ProtectedSandApp.s("瞹\u0001"));
        StringBuilder sb = new StringBuilder();
        N(sb, w.k(l1Var));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("瞙\u0001"));
        return sb2;
    }

    public boolean z0() {
        return this.f77815l.b0();
    }
}
