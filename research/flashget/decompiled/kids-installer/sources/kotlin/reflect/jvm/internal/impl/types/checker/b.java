package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.g0;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.m0;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.r1;
import kotlin.reflect.jvm.internal.impl.types.s0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: ClassicTypeSystemContext.kt */
/* loaded from: classes6.dex */
public interface b extends r1, h4.t {

    /* compiled from: ClassicTypeSystemContext.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* compiled from: ClassicTypeSystemContext.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0386a extends g1.c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f26339a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1 f26340b;

            C0386a(b bVar, q1 q1Var) {
                this.f26339a = bVar;
                this.f26340b = q1Var;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            @d5.d
            public h4.k a(@d5.d g1 g1Var, @d5.d h4.i iVar) {
                l0.p(g1Var, ProtectedSandApp.s("袉"));
                l0.p(iVar, ProtectedSandApp.s("袊"));
                b bVar = this.f26339a;
                q1 q1Var = this.f26340b;
                h4.i t02 = bVar.t0(iVar);
                l0.n(t02, ProtectedSandApp.s("袋"));
                h0 n5 = q1Var.n((h0) t02, x1.INVARIANT);
                l0.o(n5, ProtectedSandApp.s("袌"));
                h4.k e6 = bVar.e(n5);
                l0.m(e6);
                return e6;
            }
        }

        @d5.d
        public static h4.w A(@d5.d b bVar, @d5.d h4.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("哊"));
            if (nVar instanceof l1) {
                x1 b6 = ((l1) nVar).b();
                l0.o(b6, ProtectedSandApp.s("哋"));
                return h4.s.a(b6);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哌") + nVar + ProtectedSandApp.s("响") + kotlin.jvm.internal.l1.d(nVar.getClass())).toString());
        }

        @d5.d
        public static h4.w B(@d5.d b bVar, @d5.d h4.p pVar) {
            l0.p(pVar, ProtectedSandApp.s("哎"));
            if (pVar instanceof f1) {
                x1 z5 = ((f1) pVar).z();
                l0.o(z5, ProtectedSandApp.s("哏"));
                return h4.s.a(z5);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哐") + pVar + ProtectedSandApp.s("哑") + kotlin.jvm.internal.l1.d(pVar.getClass())).toString());
        }

        public static boolean C(@d5.d b bVar, @d5.d h4.i iVar, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(iVar, ProtectedSandApp.s("哒"));
            l0.p(cVar, ProtectedSandApp.s("哓"));
            if (iVar instanceof h0) {
                return ((h0) iVar).getAnnotations().O0(cVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哔") + iVar + ProtectedSandApp.s("哕") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        public static boolean D(@d5.d b bVar, @d5.d h4.p pVar, @d5.e h4.o oVar) {
            l0.p(pVar, ProtectedSandApp.s("哖"));
            boolean z5 = pVar instanceof f1;
            String s5 = ProtectedSandApp.s("哗");
            String s6 = ProtectedSandApp.s("哘");
            if (!z5) {
                throw new IllegalArgumentException((s6 + pVar + s5 + kotlin.jvm.internal.l1.d(pVar.getClass())).toString());
            }
            if (oVar == null ? true : oVar instanceof h1) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.m((f1) pVar, (h1) oVar, null, 4, null);
            }
            throw new IllegalArgumentException((s6 + pVar + s5 + kotlin.jvm.internal.l1.d(pVar.getClass())).toString());
        }

        public static boolean E(@d5.d b bVar, @d5.d h4.k kVar, @d5.d h4.k kVar2) {
            l0.p(kVar, ProtectedSandApp.s("哙"));
            l0.p(kVar2, ProtectedSandApp.s("哚"));
            boolean z5 = kVar instanceof p0;
            String s5 = ProtectedSandApp.s("哛");
            String s6 = ProtectedSandApp.s("哜");
            if (!z5) {
                StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(s6, kVar, s5);
                a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
                throw new IllegalArgumentException(a6.toString().toString());
            }
            if (kVar2 instanceof p0) {
                return ((p0) kVar).S0() == ((p0) kVar2).S0();
            }
            StringBuilder a7 = kotlin.reflect.jvm.internal.impl.types.c.a(s6, kVar2, s5);
            a7.append(kotlin.jvm.internal.l1.d(kVar2.getClass()));
            throw new IllegalArgumentException(a7.toString().toString());
        }

        @d5.d
        public static h4.i F(@d5.d b bVar, @d5.d List<? extends h4.i> list) {
            l0.p(list, ProtectedSandApp.s("哝"));
            return d.a(list);
        }

        public static boolean G(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("哞"));
            if (oVar instanceof h1) {
                return kotlin.reflect.jvm.internal.impl.builtins.h.v0((h1) oVar, l.a.f24043b);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哟") + oVar + ProtectedSandApp.s("哠") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean H(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("員"));
            if (oVar instanceof h1) {
                return ((h1) oVar).b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哢") + oVar + ProtectedSandApp.s("哣") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean I(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("哤"));
            if (oVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((h1) oVar).b();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
                return (eVar == null || !f0.a(eVar) || eVar.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY || eVar.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哥") + oVar + ProtectedSandApp.s("哦") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean J(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("哧"));
            if (oVar instanceof h1) {
                return ((h1) oVar).d();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哨") + oVar + ProtectedSandApp.s("哩") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean K(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("哪"));
            if (iVar instanceof h0) {
                return j0.a((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哫") + iVar + ProtectedSandApp.s("哬") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        public static boolean L(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("哭"));
            if (oVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((h1) oVar).b();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
                return (eVar != null ? eVar.G0() : null) instanceof a0;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哮") + oVar + ProtectedSandApp.s("哯") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean M(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("哰"));
            if (oVar instanceof h1) {
                return oVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哱") + oVar + ProtectedSandApp.s("哲") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean N(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("哳"));
            if (oVar instanceof h1) {
                return oVar instanceof g0;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哴") + oVar + ProtectedSandApp.s("哵") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean O(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("哶"));
            if (kVar instanceof p0) {
                return ((p0) kVar).V0();
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("哷"), kVar, ProtectedSandApp.s("哸"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        public static boolean P(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("哹"));
            return iVar instanceof m0;
        }

        public static boolean Q(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("哺"));
            if (oVar instanceof h1) {
                return kotlin.reflect.jvm.internal.impl.builtins.h.v0((h1) oVar, l.a.f24045c);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哻") + oVar + ProtectedSandApp.s("哼") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        public static boolean R(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("哽"));
            if (iVar instanceof h0) {
                return t1.l((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("哾") + iVar + ProtectedSandApp.s("哿") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        public static boolean S(@d5.d b bVar, @d5.d h4.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("唀"));
            return dVar instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean T(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("唁"));
            if (kVar instanceof h0) {
                return kotlin.reflect.jvm.internal.impl.builtins.h.r0((h0) kVar);
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("唂"), kVar, ProtectedSandApp.s("唃"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        public static boolean U(@d5.d b bVar, @d5.d h4.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("唄"));
            if (dVar instanceof i) {
                return ((i) dVar).g1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唅") + dVar + ProtectedSandApp.s("唆") + kotlin.jvm.internal.l1.d(dVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("唇"));
            if (!(kVar instanceof p0)) {
                StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("唈"), kVar, ProtectedSandApp.s("唉"));
                a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
                throw new IllegalArgumentException(a6.toString().toString());
            }
            if (!j0.a((h0) kVar)) {
                p0 p0Var = (p0) kVar;
                if (!(p0Var.U0().b() instanceof e1) && (p0Var.U0().b() != null || (kVar instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a) || (kVar instanceof i) || (kVar instanceof kotlin.reflect.jvm.internal.impl.types.q) || (p0Var.U0() instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n) || W(bVar, kVar))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean W(b bVar, h4.k kVar) {
            return (kVar instanceof s0) && bVar.c(((s0) kVar).g1());
        }

        public static boolean X(@d5.d b bVar, @d5.d h4.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("唊"));
            if (nVar instanceof l1) {
                return ((l1) nVar).c();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唋") + nVar + ProtectedSandApp.s("唌") + kotlin.jvm.internal.l1.d(nVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("唍"));
            if (kVar instanceof p0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.n((h0) kVar);
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("唎"), kVar, ProtectedSandApp.s("唏"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("唐"));
            if (kVar instanceof p0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.o((h0) kVar);
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("唑"), kVar, ProtectedSandApp.s("唒"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        public static boolean a(@d5.d b bVar, @d5.d h4.o oVar, @d5.d h4.o oVar2) {
            l0.p(oVar, ProtectedSandApp.s("唓"));
            l0.p(oVar2, ProtectedSandApp.s("唔"));
            boolean z5 = oVar instanceof h1;
            String s5 = ProtectedSandApp.s("唕");
            String s6 = ProtectedSandApp.s("唖");
            if (!z5) {
                throw new IllegalArgumentException((s6 + oVar + s5 + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
            }
            if (oVar2 instanceof h1) {
                return l0.g(oVar, oVar2);
            }
            throw new IllegalArgumentException((s6 + oVar2 + s5 + kotlin.jvm.internal.l1.d(oVar2.getClass())).toString());
        }

        public static boolean a0(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("唗"));
            return (iVar instanceof w1) && (((w1) iVar).U0() instanceof n);
        }

        public static int b(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("唘"));
            if (iVar instanceof h0) {
                return ((h0) iVar).S0().size();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唙") + iVar + ProtectedSandApp.s("唚") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        public static boolean b0(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("唛"));
            if (oVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((h1) oVar).b();
                return b6 != null && kotlin.reflect.jvm.internal.impl.builtins.h.A0(b6);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唜") + oVar + ProtectedSandApp.s("唝") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.d
        public static h4.m c(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("唞"));
            if (kVar instanceof p0) {
                return (h4.m) kVar;
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("唟"), kVar, ProtectedSandApp.s("唠"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        @d5.d
        public static h4.k c0(@d5.d b bVar, @d5.d h4.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("唡"));
            if (gVar instanceof b0) {
                return ((b0) gVar).c1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唢") + gVar + ProtectedSandApp.s("唣") + kotlin.jvm.internal.l1.d(gVar.getClass())).toString());
        }

        @d5.e
        public static h4.d d(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("唤"));
            if (!(kVar instanceof p0)) {
                StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("唥"), kVar, ProtectedSandApp.s("唦"));
                a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
                throw new IllegalArgumentException(a6.toString().toString());
            }
            if (kVar instanceof s0) {
                return bVar.a(((s0) kVar).g1());
            }
            if (kVar instanceof i) {
                return (i) kVar;
            }
            return null;
        }

        @d5.e
        public static h4.i d0(@d5.d b bVar, @d5.d h4.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("唧"));
            if (dVar instanceof i) {
                return ((i) dVar).f1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唨") + dVar + ProtectedSandApp.s("唩") + kotlin.jvm.internal.l1.d(dVar.getClass())).toString());
        }

        @d5.e
        public static h4.e e(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("唪"));
            if (kVar instanceof p0) {
                if (kVar instanceof kotlin.reflect.jvm.internal.impl.types.q) {
                    return (kotlin.reflect.jvm.internal.impl.types.q) kVar;
                }
                return null;
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("唫"), kVar, ProtectedSandApp.s("唬"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        @d5.d
        public static h4.i e0(@d5.d b bVar, @d5.d h4.i iVar) {
            w1 b6;
            l0.p(iVar, ProtectedSandApp.s("唭"));
            if (iVar instanceof w1) {
                b6 = c.b((w1) iVar);
                return b6;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("售") + iVar + ProtectedSandApp.s("唯") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        @d5.e
        public static h4.f f(@d5.d b bVar, @d5.d h4.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("唰"));
            if (gVar instanceof b0) {
                if (gVar instanceof kotlin.reflect.jvm.internal.impl.types.w) {
                    return (kotlin.reflect.jvm.internal.impl.types.w) gVar;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唱") + gVar + ProtectedSandApp.s("唲") + kotlin.jvm.internal.l1.d(gVar.getClass())).toString());
        }

        @d5.d
        public static g1 f0(@d5.d b bVar, boolean z5, boolean z6) {
            return kotlin.reflect.jvm.internal.impl.types.checker.a.b(z5, z6, bVar, null, null, 24, null);
        }

        @d5.e
        public static h4.g g(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("唳"));
            if (iVar instanceof h0) {
                w1 X0 = ((h0) iVar).X0();
                if (X0 instanceof b0) {
                    return (b0) X0;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唴") + iVar + ProtectedSandApp.s("唵") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        @d5.d
        public static h4.k g0(@d5.d b bVar, @d5.d h4.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("唶"));
            if (eVar instanceof kotlin.reflect.jvm.internal.impl.types.q) {
                return ((kotlin.reflect.jvm.internal.impl.types.q) eVar).g1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唷") + eVar + ProtectedSandApp.s("唸") + kotlin.jvm.internal.l1.d(eVar.getClass())).toString());
        }

        @d5.e
        public static h4.j h(@d5.d b bVar, @d5.d h4.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("唹"));
            if (gVar instanceof b0) {
                if (gVar instanceof o0) {
                    return (o0) gVar;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唺") + gVar + ProtectedSandApp.s("唻") + kotlin.jvm.internal.l1.d(gVar.getClass())).toString());
        }

        public static int h0(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("唼"));
            if (oVar instanceof h1) {
                return ((h1) oVar).r().size();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("唽") + oVar + ProtectedSandApp.s("唾") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.e
        public static h4.k i(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("唿"));
            if (iVar instanceof h0) {
                w1 X0 = ((h0) iVar).X0();
                if (X0 instanceof p0) {
                    return (p0) X0;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啀") + iVar + ProtectedSandApp.s("啁") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        @d5.d
        public static Collection<h4.i> i0(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("啂"));
            h4.o g5 = bVar.g(kVar);
            if (g5 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n) {
                return ((kotlin.reflect.jvm.internal.impl.resolve.constants.n) g5).j();
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("啃"), kVar, ProtectedSandApp.s("啄"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        @d5.d
        public static h4.n j(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("啅"));
            if (iVar instanceof h0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("商") + iVar + ProtectedSandApp.s("啇") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        @d5.d
        public static h4.n j0(@d5.d b bVar, @d5.d h4.c cVar) {
            l0.p(cVar, ProtectedSandApp.s("啈"));
            if (cVar instanceof j) {
                return ((j) cVar).e();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啉") + cVar + ProtectedSandApp.s("啊") + kotlin.jvm.internal.l1.d(cVar.getClass())).toString());
        }

        @d5.e
        public static h4.k k(@d5.d b bVar, @d5.d h4.k kVar, @d5.d h4.b bVar2) {
            l0.p(kVar, ProtectedSandApp.s("啋"));
            l0.p(bVar2, ProtectedSandApp.s("啌"));
            if (kVar instanceof p0) {
                return k.b((p0) kVar, bVar2);
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("啍"), kVar, ProtectedSandApp.s("啎"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.d
        public static g1.c k0(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("問"));
            if (kVar instanceof p0) {
                return new C0386a(bVar, i1.f26482c.a((h0) kVar).c());
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("啐"), kVar, ProtectedSandApp.s("啑"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        @d5.d
        public static h4.b l(@d5.d b bVar, @d5.d h4.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("啒"));
            if (dVar instanceof i) {
                return ((i) dVar).d1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啓") + dVar + ProtectedSandApp.s("啔") + kotlin.jvm.internal.l1.d(dVar.getClass())).toString());
        }

        @d5.d
        public static Collection<h4.i> l0(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("啕"));
            if (oVar instanceof h1) {
                Collection<h0> m5 = ((h1) oVar).m();
                l0.o(m5, ProtectedSandApp.s("啖"));
                return m5;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啗") + oVar + ProtectedSandApp.s("啘") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.d
        public static h4.i m(@d5.d b bVar, @d5.d h4.k kVar, @d5.d h4.k kVar2) {
            l0.p(kVar, ProtectedSandApp.s("啙"));
            l0.p(kVar2, ProtectedSandApp.s("啚"));
            boolean z5 = kVar instanceof p0;
            String s5 = ProtectedSandApp.s("啛");
            String s6 = ProtectedSandApp.s("啜");
            if (!z5) {
                throw new IllegalArgumentException((s6 + bVar + s5 + kotlin.jvm.internal.l1.d(bVar.getClass())).toString());
            }
            if (kVar2 instanceof p0) {
                return i0.d((p0) kVar, (p0) kVar2);
            }
            throw new IllegalArgumentException((s6 + bVar + s5 + kotlin.jvm.internal.l1.d(bVar.getClass())).toString());
        }

        @d5.d
        public static h4.c m0(@d5.d b bVar, @d5.d h4.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("啝"));
            if (dVar instanceof i) {
                return ((i) dVar).e1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啞") + dVar + ProtectedSandApp.s("啟") + kotlin.jvm.internal.l1.d(dVar.getClass())).toString());
        }

        @d5.d
        public static h4.n n(@d5.d b bVar, @d5.d h4.i iVar, int i5) {
            l0.p(iVar, ProtectedSandApp.s("啠"));
            if (iVar instanceof h0) {
                return ((h0) iVar).S0().get(i5);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啡") + iVar + ProtectedSandApp.s("啢") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        @d5.d
        public static h4.o n0(@d5.d b bVar, @d5.d h4.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("啣"));
            if (kVar instanceof p0) {
                return ((p0) kVar).U0();
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("啤"), kVar, ProtectedSandApp.s("啥"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        @d5.d
        public static List<h4.n> o(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("啦"));
            if (iVar instanceof h0) {
                return ((h0) iVar).S0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啧") + iVar + ProtectedSandApp.s("啨") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        @d5.d
        public static h4.k o0(@d5.d b bVar, @d5.d h4.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("啩"));
            if (gVar instanceof b0) {
                return ((b0) gVar).d1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啪") + gVar + ProtectedSandApp.s("啫") + kotlin.jvm.internal.l1.d(gVar.getClass())).toString());
        }

        @d5.d
        public static kotlin.reflect.jvm.internal.impl.name.d p(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("啬"));
            if (oVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((h1) oVar).b();
                l0.n(b6, ProtectedSandApp.s("啭"));
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啮") + oVar + ProtectedSandApp.s("啯") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.d
        public static h4.i p0(@d5.d b bVar, @d5.d h4.i iVar, boolean z5) {
            l0.p(iVar, ProtectedSandApp.s("啰"));
            if (iVar instanceof h4.k) {
                return bVar.f((h4.k) iVar, z5);
            }
            if (!(iVar instanceof h4.g)) {
                throw new IllegalStateException(ProtectedSandApp.s("啱").toString());
            }
            h4.g gVar = (h4.g) iVar;
            return bVar.k0(bVar.f(bVar.b(gVar), z5), bVar.f(bVar.d(gVar), z5));
        }

        @d5.d
        public static h4.p q(@d5.d b bVar, @d5.d h4.o oVar, int i5) {
            l0.p(oVar, ProtectedSandApp.s("啲"));
            if (oVar instanceof h1) {
                f1 f1Var = ((h1) oVar).r().get(i5);
                l0.o(f1Var, ProtectedSandApp.s("啳"));
                return f1Var;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啴") + oVar + ProtectedSandApp.s("啵") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.d
        public static h4.k q0(@d5.d b bVar, @d5.d h4.k kVar, boolean z5) {
            l0.p(kVar, ProtectedSandApp.s("啶"));
            if (kVar instanceof p0) {
                return ((p0) kVar).b1(z5);
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("啷"), kVar, ProtectedSandApp.s("啸"));
            a6.append(kotlin.jvm.internal.l1.d(kVar.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        @d5.d
        public static List<h4.p> r(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("啹"));
            if (oVar instanceof h1) {
                List<f1> r5 = ((h1) oVar).r();
                l0.o(r5, ProtectedSandApp.s("啺"));
                return r5;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啻") + oVar + ProtectedSandApp.s("啼") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.e
        public static kotlin.reflect.jvm.internal.impl.builtins.i s(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("啽"));
            if (oVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((h1) oVar).b();
                l0.n(b6, ProtectedSandApp.s("啾"));
                return kotlin.reflect.jvm.internal.impl.builtins.h.P((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("啿") + oVar + ProtectedSandApp.s("喀") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.e
        public static kotlin.reflect.jvm.internal.impl.builtins.i t(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("喁"));
            if (oVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((h1) oVar).b();
                l0.n(b6, ProtectedSandApp.s("喂"));
                return kotlin.reflect.jvm.internal.impl.builtins.h.S((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("喃") + oVar + ProtectedSandApp.s("善") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.d
        public static h4.i u(@d5.d b bVar, @d5.d h4.p pVar) {
            l0.p(pVar, ProtectedSandApp.s("喅"));
            if (pVar instanceof f1) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j((f1) pVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("喆") + pVar + ProtectedSandApp.s("喇") + kotlin.jvm.internal.l1.d(pVar.getClass())).toString());
        }

        @d5.d
        public static h4.i v(@d5.d b bVar, @d5.d h4.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("喈"));
            if (nVar instanceof l1) {
                return ((l1) nVar).getType().X0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("喉") + nVar + ProtectedSandApp.s("喊") + kotlin.jvm.internal.l1.d(nVar.getClass())).toString());
        }

        @d5.e
        public static h4.p w(@d5.d b bVar, @d5.d h4.v vVar) {
            l0.p(vVar, ProtectedSandApp.s("喋"));
            if (vVar instanceof n) {
                return ((n) vVar).c();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("喌") + vVar + ProtectedSandApp.s("喍") + kotlin.jvm.internal.l1.d(vVar.getClass())).toString());
        }

        @d5.e
        public static h4.p x(@d5.d b bVar, @d5.d h4.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("喎"));
            if (oVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((h1) oVar).b();
                if (b6 instanceof f1) {
                    return (f1) b6;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("喏") + oVar + ProtectedSandApp.s("喐") + kotlin.jvm.internal.l1.d(oVar.getClass())).toString());
        }

        @d5.e
        public static h4.i y(@d5.d b bVar, @d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("喑"));
            if (iVar instanceof h0) {
                return kotlin.reflect.jvm.internal.impl.resolve.g.e((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("喒") + iVar + ProtectedSandApp.s("喓") + kotlin.jvm.internal.l1.d(iVar.getClass())).toString());
        }

        @d5.d
        public static List<h4.i> z(@d5.d b bVar, @d5.d h4.p pVar) {
            l0.p(pVar, ProtectedSandApp.s("喔"));
            if (pVar instanceof f1) {
                List<h0> upperBounds = ((f1) pVar).getUpperBounds();
                l0.o(upperBounds, ProtectedSandApp.s("喕"));
                return upperBounds;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("喖") + pVar + ProtectedSandApp.s("喗") + kotlin.jvm.internal.l1.d(pVar.getClass())).toString());
        }
    }

    @Override // h4.r
    @d5.e
    h4.d a(@d5.d h4.k kVar);

    @Override // h4.r
    @d5.d
    h4.k b(@d5.d h4.g gVar);

    @Override // h4.r
    boolean c(@d5.d h4.k kVar);

    @Override // h4.r
    @d5.d
    h4.k d(@d5.d h4.g gVar);

    @Override // h4.r
    @d5.e
    h4.k e(@d5.d h4.i iVar);

    @Override // h4.r
    @d5.d
    h4.k f(@d5.d h4.k kVar, boolean z5);

    @Override // h4.r
    @d5.d
    h4.o g(@d5.d h4.k kVar);

    @d5.d
    h4.i k0(@d5.d h4.k kVar, @d5.d h4.k kVar2);
}
