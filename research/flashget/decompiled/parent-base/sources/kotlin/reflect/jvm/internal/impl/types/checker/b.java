package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
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
/* loaded from: classes7.dex */
public interface b extends r1, ce.s {

    /* compiled from: ClassicTypeSystemContext.kt */
    @kotlin.jvm.internal.r1({"SMAP\nClassicTypeSystemContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContextKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 6 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n1#1,964:1\n1#2:965\n958#3:966\n958#3:967\n958#3:968\n958#3:969\n958#3:970\n958#3:971\n958#3:972\n958#3:973\n958#3:974\n958#3:975\n958#3:976\n958#3:977\n958#3:978\n958#3:979\n958#3:980\n958#3:981\n958#3:982\n958#3:983\n958#3:984\n958#3:985\n958#3:986\n958#3:987\n958#3:988\n958#3:989\n958#3:990\n958#3:991\n958#3:992\n958#3:993\n958#3:994\n958#3:995\n958#3:996\n958#3:997\n958#3:998\n958#3:999\n958#3:1000\n958#3:1001\n958#3:1002\n958#3:1003\n958#3:1004\n958#3:1005\n958#3:1006\n958#3:1007\n958#3:1008\n958#3:1009\n958#3:1010\n958#3:1011\n958#3:1012\n958#3:1013\n958#3:1014\n958#3:1015\n958#3:1016\n958#3:1017\n958#3:1018\n958#3:1019\n958#3:1020\n958#3:1021\n958#3:1022\n958#3:1023\n958#3:1024\n958#3:1025\n958#3:1026\n958#3:1027\n958#3:1028\n958#3:1029\n958#3:1030\n958#3:1031\n958#3:1032\n958#3:1033\n958#3:1034\n958#3:1035\n958#3:1036\n958#3:1037\n958#3:1038\n958#3:1042\n958#3:1043\n958#3:1044\n958#3:1045\n958#3:1046\n958#3:1047\n958#3:1048\n958#3:1049\n958#3:1055\n958#3:1056\n958#3:1057\n958#3:1058\n958#3:1059\n958#3:1060\n958#3:1067\n958#3:1068\n958#3:1069\n958#3:1084\n958#3:1085\n958#3:1086\n958#3:1087\n958#3:1088\n958#3:1089\n958#3:1103\n958#3:1104\n958#3:1105\n958#3:1106\n958#3:1107\n958#3:1108\n958#3:1109\n958#3:1110\n958#3:1111\n958#3:1112\n958#3:1113\n958#3:1114\n958#3:1115\n958#3:1116\n958#3:1117\n958#3:1118\n958#3:1119\n958#3:1120\n958#3:1121\n958#3:1122\n958#3:1123\n958#3:1124\n958#3:1125\n958#3:1126\n958#3:1127\n958#3:1128\n819#4:1039\n847#4,2:1040\n766#4:1052\n857#4,2:1053\n1549#4:1063\n1620#4,3:1064\n1549#4:1070\n1620#4,3:1071\n2661#4,7:1074\n819#4:1081\n847#4,2:1082\n819#4:1090\n847#4,2:1091\n1549#4:1093\n1620#4,3:1094\n1271#4,2:1097\n1285#4,4:1099\n20#5,2:1050\n280#6,2:1061\n*S KotlinDebug\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n*L\n41#1:966\n46#1:967\n59#1:968\n64#1:969\n70#1:970\n76#1:971\n81#1:972\n86#1:973\n91#1:974\n96#1:975\n101#1:976\n106#1:977\n111#1:978\n120#1:979\n126#1:980\n131#1:981\n136#1:982\n137#1:983\n142#1:984\n147#1:985\n152#1:986\n157#1:987\n166#1:988\n171#1:989\n176#1:990\n181#1:991\n189#1:992\n194#1:993\n199#1:994\n204#1:995\n209#1:996\n214#1:997\n219#1:998\n224#1:999\n229#1:1000\n234#1:1001\n235#1:1002\n240#1:1003\n246#1:1004\n251#1:1005\n256#1:1006\n261#1:1007\n266#1:1008\n271#1:1009\n276#1:1010\n281#1:1011\n286#1:1012\n291#1:1013\n292#1:1014\n298#1:1015\n299#1:1016\n304#1:1017\n309#1:1018\n314#1:1019\n320#1:1020\n328#1:1021\n334#1:1022\n339#1:1023\n344#1:1024\n349#1:1025\n354#1:1026\n359#1:1027\n373#1:1028\n383#1:1029\n388#1:1030\n414#1:1031\n419#1:1032\n424#1:1033\n425#1:1034\n465#1:1035\n471#1:1036\n476#1:1037\n481#1:1038\n487#1:1042\n492#1:1043\n509#1:1044\n515#1:1045\n520#1:1046\n525#1:1047\n532#1:1048\n543#1:1049\n566#1:1055\n571#1:1056\n576#1:1057\n583#1:1058\n588#1:1059\n594#1:1060\n600#1:1067\n622#1:1068\n623#1:1069\n679#1:1084\n684#1:1085\n689#1:1086\n694#1:1087\n699#1:1088\n704#1:1089\n742#1:1103\n747#1:1104\n752#1:1105\n757#1:1106\n762#1:1107\n767#1:1108\n772#1:1109\n777#1:1110\n782#1:1111\n787#1:1112\n792#1:1113\n797#1:1114\n802#1:1115\n807#1:1116\n812#1:1117\n817#1:1118\n822#1:1119\n827#1:1120\n832#1:1121\n841#1:1122\n842#1:1123\n853#1:1124\n858#1:1125\n863#1:1126\n894#1:1127\n901#1:1128\n482#1:1039\n482#1:1040,2\n551#1:1052\n551#1:1053,2\n596#1:1063\n596#1:1064,3\n665#1:1070\n665#1:1071,3\n665#1:1074,7\n671#1:1081\n671#1:1082,2\n705#1:1090\n705#1:1091,2\n730#1:1093\n730#1:1094,3\n731#1:1097,2\n731#1:1099,4\n545#1:1050,2\n596#1:1061,2\n*E\n"})
    public static final class a {

        /* compiled from: ClassicTypeSystemContext.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a$a, reason: collision with other inner class name */
        public static final class C1190a extends g1.c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f78347a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1 f78348b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1190a(b bVar, q1 q1Var) {
                super(null);
                this.f78347a = bVar;
                this.f78348b = q1Var;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            @fg.l
            public ce.j a(@fg.l g1 g1Var, @fg.l ce.i iVar) {
                l0.p(g1Var, ProtectedSandApp.s("絉\u0001"));
                l0.p(iVar, ProtectedSandApp.s("絊\u0001"));
                b bVar = this.f78347a;
                q1 q1Var = this.f78348b;
                ce.i c02 = bVar.c0(iVar);
                l0.n(c02, ProtectedSandApp.s("絋\u0001"));
                h0 n4 = q1Var.n((h0) c02, x1.INVARIANT);
                l0.o(n4, ProtectedSandApp.s("経\u0001"));
                ce.j g4 = bVar.g(n4);
                l0.m(g4);
                return g4;
            }
        }

        @fg.l
        public static ce.v A(@fg.l b bVar, @fg.l ce.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("絍\u0001"));
            if (oVar instanceof f1) {
                x1 o4 = ((f1) oVar).o();
                l0.o(o4, ProtectedSandApp.s("絎\u0001"));
                return ce.r.a(o4);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + oVar + ProtectedSandApp.s("結\u0001") + l1.d(oVar.getClass())).toString());
        }

        public static boolean B(@fg.l b bVar, @fg.l ce.i iVar, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            l0.p(cVar, ProtectedSandApp.s("絑\u0001"));
            if (iVar instanceof h0) {
                return ((h0) iVar).getAnnotations().o3(cVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        public static boolean C(@fg.l b bVar, @fg.l ce.o oVar, @fg.m ce.n nVar) {
            l0.p(oVar, ProtectedSandApp.s("絍\u0001"));
            boolean z4 = oVar instanceof f1;
            String s4 = ProtectedSandApp.s("結\u0001");
            String s5 = ProtectedSandApp.s("絏\u0001");
            if (!z4) {
                throw new IllegalArgumentException((s5 + oVar + s4 + l1.d(oVar.getClass())).toString());
            }
            if (nVar == null ? true : nVar instanceof h1) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.m((f1) oVar, (h1) nVar, null, 4, null);
            }
            throw new IllegalArgumentException((s5 + oVar + s4 + l1.d(oVar.getClass())).toString());
        }

        public static boolean D(@fg.l b bVar, @fg.l ce.j jVar, @fg.l ce.j jVar2) {
            l0.p(jVar, ProtectedSandApp.s("絒\u0001"));
            l0.p(jVar2, ProtectedSandApp.s("絓\u0001"));
            boolean z4 = jVar instanceof p0;
            String s4 = ProtectedSandApp.s("結\u0001");
            String s5 = ProtectedSandApp.s("絏\u0001");
            if (!z4) {
                StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(s5, jVar, s4);
                a5.append(l1.d(jVar.getClass()));
                throw new IllegalArgumentException(a5.toString().toString());
            }
            if (jVar2 instanceof p0) {
                return ((p0) jVar).M0() == ((p0) jVar2).M0();
            }
            StringBuilder a6 = kotlin.reflect.jvm.internal.impl.types.c.a(s5, jVar2, s4);
            a6.append(l1.d(jVar2.getClass()));
            throw new IllegalArgumentException(a6.toString().toString());
        }

        @fg.l
        public static ce.i E(@fg.l b bVar, @fg.l List<? extends ce.i> list) {
            l0.p(list, ProtectedSandApp.s("絔\u0001"));
            return d.a(list);
        }

        public static boolean F(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                return kotlin.reflect.jvm.internal.impl.builtins.h.w0((h1) nVar, l.a.f75840b);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean G(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                return ((h1) nVar).c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean H(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h1) nVar).c();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
                return (eVar == null || !f0.a(eVar) || eVar.b() == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY || eVar.b() == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean I(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                return ((h1) nVar).d();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean J(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return j0.a((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        public static boolean K(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h1) nVar).c();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
                return (eVar != null ? eVar.X() : null) instanceof a0;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean L(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                return nVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean M(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                return nVar instanceof g0;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean N(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof p0) {
                return ((p0) jVar).P0();
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        public static boolean O(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            return iVar instanceof m0;
        }

        public static boolean P(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                return kotlin.reflect.jvm.internal.impl.builtins.h.w0((h1) nVar, l.a.f75842c);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        public static boolean Q(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return t1.l((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        public static boolean R(@fg.l b bVar, @fg.l ce.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("絍\u0001"));
            return dVar instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof h0) {
                return kotlin.reflect.jvm.internal.impl.builtins.h.s0((h0) jVar);
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        public static boolean T(@fg.l b bVar, @fg.l ce.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("絍\u0001"));
            if (dVar instanceof i) {
                return ((i) dVar).a1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + dVar + ProtectedSandApp.s("結\u0001") + l1.d(dVar.getClass())).toString());
        }

        public static boolean U(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return iVar instanceof o0;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (!(jVar instanceof p0)) {
                StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
                a5.append(l1.d(jVar.getClass()));
                throw new IllegalArgumentException(a5.toString().toString());
            }
            if (!j0.a((h0) jVar)) {
                p0 p0Var = (p0) jVar;
                if (!(p0Var.O0().c() instanceof e1) && (p0Var.O0().c() != null || (jVar instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a) || (jVar instanceof i) || (jVar instanceof kotlin.reflect.jvm.internal.impl.types.q) || (p0Var.O0() instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n) || W(bVar, jVar))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean W(b bVar, ce.j jVar) {
            return (jVar instanceof s0) && bVar.f(((s0) jVar).a1());
        }

        public static boolean X(@fg.l b bVar, @fg.l ce.m mVar) {
            l0.p(mVar, ProtectedSandApp.s("絍\u0001"));
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.types.l1) {
                return ((kotlin.reflect.jvm.internal.impl.types.l1) mVar).b();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + mVar + ProtectedSandApp.s("結\u0001") + l1.d(mVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof p0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.p((h0) jVar);
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof p0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.q((h0) jVar);
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        public static boolean a(@fg.l b bVar, @fg.l ce.n nVar, @fg.l ce.n nVar2) {
            l0.p(nVar, ProtectedSandApp.s("絕\u0001"));
            l0.p(nVar2, ProtectedSandApp.s("絖\u0001"));
            boolean z4 = nVar instanceof h1;
            String s4 = ProtectedSandApp.s("結\u0001");
            String s5 = ProtectedSandApp.s("絏\u0001");
            if (!z4) {
                throw new IllegalArgumentException((s5 + nVar + s4 + l1.d(nVar.getClass())).toString());
            }
            if (nVar2 instanceof h1) {
                return l0.g(nVar, nVar2);
            }
            throw new IllegalArgumentException((s5 + nVar2 + s4 + l1.d(nVar2.getClass())).toString());
        }

        public static boolean a0(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            return (iVar instanceof w1) && (((w1) iVar).O0() instanceof n);
        }

        public static int b(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return ((h0) iVar).M0().size();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        public static boolean b0(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h1) nVar).c();
                return c5 != null && kotlin.reflect.jvm.internal.impl.builtins.h.B0(c5);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.l
        public static ce.l c(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof p0) {
                return (ce.l) jVar;
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @fg.l
        public static ce.j c0(@fg.l b bVar, @fg.l ce.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("絍\u0001"));
            if (gVar instanceof b0) {
                return ((b0) gVar).W0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + gVar + ProtectedSandApp.s("結\u0001") + l1.d(gVar.getClass())).toString());
        }

        @fg.m
        public static ce.d d(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (!(jVar instanceof p0)) {
                StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
                a5.append(l1.d(jVar.getClass()));
                throw new IllegalArgumentException(a5.toString().toString());
            }
            if (jVar instanceof s0) {
                return bVar.e(((s0) jVar).a1());
            }
            if (jVar instanceof i) {
                return (i) jVar;
            }
            return null;
        }

        @fg.m
        public static ce.i d0(@fg.l b bVar, @fg.l ce.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("絍\u0001"));
            if (dVar instanceof i) {
                return ((i) dVar).Z0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + dVar + ProtectedSandApp.s("結\u0001") + l1.d(dVar.getClass())).toString());
        }

        @fg.m
        public static ce.e e(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof p0) {
                if (jVar instanceof kotlin.reflect.jvm.internal.impl.types.q) {
                    return (kotlin.reflect.jvm.internal.impl.types.q) jVar;
                }
                return null;
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @fg.l
        public static ce.i e0(@fg.l b bVar, @fg.l ce.i iVar) {
            w1 b5;
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof w1) {
                b5 = c.b((w1) iVar);
                return b5;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        @fg.m
        public static ce.f f(@fg.l b bVar, @fg.l ce.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("絍\u0001"));
            if (gVar instanceof b0) {
                if (gVar instanceof kotlin.reflect.jvm.internal.impl.types.w) {
                    return (kotlin.reflect.jvm.internal.impl.types.w) gVar;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + gVar + ProtectedSandApp.s("結\u0001") + l1.d(gVar.getClass())).toString());
        }

        @fg.l
        public static g1 f0(@fg.l b bVar, boolean z4, boolean z5) {
            return kotlin.reflect.jvm.internal.impl.types.checker.a.b(z4, z5, bVar, null, null, 24, null);
        }

        @fg.m
        public static ce.g g(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                w1 R0 = ((h0) iVar).R0();
                if (R0 instanceof b0) {
                    return (b0) R0;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        @fg.l
        public static ce.j g0(@fg.l b bVar, @fg.l ce.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("絍\u0001"));
            if (eVar instanceof kotlin.reflect.jvm.internal.impl.types.q) {
                return ((kotlin.reflect.jvm.internal.impl.types.q) eVar).a1();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + eVar + ProtectedSandApp.s("結\u0001") + l1.d(eVar.getClass())).toString());
        }

        @fg.m
        public static ce.j h(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                w1 R0 = ((h0) iVar).R0();
                if (R0 instanceof p0) {
                    return (p0) R0;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        public static int h0(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                return ((h1) nVar).getParameters().size();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.l
        public static ce.m i(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        @fg.l
        public static Collection<ce.i> i0(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            ce.n d5 = bVar.d(jVar);
            if (d5 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n) {
                return ((kotlin.reflect.jvm.internal.impl.resolve.constants.n) d5).i();
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @fg.m
        public static ce.j j(@fg.l b bVar, @fg.l ce.j jVar, @fg.l ce.b bVar2) {
            l0.p(jVar, ProtectedSandApp.s("絗\u0001"));
            l0.p(bVar2, ProtectedSandApp.s("絘\u0001"));
            if (jVar instanceof p0) {
                return k.b((p0) jVar, bVar2);
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @fg.l
        public static ce.m j0(@fg.l b bVar, @fg.l ce.c cVar) {
            l0.p(cVar, ProtectedSandApp.s("絍\u0001"));
            if (cVar instanceof j) {
                return ((j) cVar).getProjection();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + cVar + ProtectedSandApp.s("結\u0001") + l1.d(cVar.getClass())).toString());
        }

        @fg.l
        public static ce.b k(@fg.l b bVar, @fg.l ce.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("絍\u0001"));
            if (dVar instanceof i) {
                return ((i) dVar).X0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + dVar + ProtectedSandApp.s("結\u0001") + l1.d(dVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.l
        public static g1.c k0(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絗\u0001"));
            if (jVar instanceof p0) {
                return new C1190a(bVar, i1.f78491c.a((h0) jVar).c());
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @fg.l
        public static ce.i l(@fg.l b bVar, @fg.l ce.j jVar, @fg.l ce.j jVar2) {
            l0.p(jVar, ProtectedSandApp.s("絙\u0001"));
            l0.p(jVar2, ProtectedSandApp.s("絚\u0001"));
            boolean z4 = jVar instanceof p0;
            String s4 = ProtectedSandApp.s("結\u0001");
            String s5 = ProtectedSandApp.s("絏\u0001");
            if (!z4) {
                throw new IllegalArgumentException((s5 + bVar + s4 + l1.d(bVar.getClass())).toString());
            }
            if (jVar2 instanceof p0) {
                return i0.d((p0) jVar, (p0) jVar2);
            }
            throw new IllegalArgumentException((s5 + bVar + s4 + l1.d(bVar.getClass())).toString());
        }

        @fg.l
        public static Collection<ce.i> l0(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                Collection<h0> j4 = ((h1) nVar).j();
                l0.o(j4, ProtectedSandApp.s("絛\u0001"));
                return j4;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.l
        public static ce.m m(@fg.l b bVar, @fg.l ce.i iVar, int i4) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return ((h0) iVar).M0().get(i4);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        @fg.l
        public static ce.c m0(@fg.l b bVar, @fg.l ce.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("絍\u0001"));
            if (dVar instanceof i) {
                return ((i) dVar).Y0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + dVar + ProtectedSandApp.s("結\u0001") + l1.d(dVar.getClass())).toString());
        }

        @fg.l
        public static List<ce.m> n(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return ((h0) iVar).M0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        @fg.l
        public static ce.n n0(@fg.l b bVar, @fg.l ce.j jVar) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof p0) {
                return ((p0) jVar).O0();
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @fg.l
        public static kotlin.reflect.jvm.internal.impl.name.d o(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h1) nVar).c();
                l0.n(c5, ProtectedSandApp.s("絜\u0001"));
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.l
        public static ce.j o0(@fg.l b bVar, @fg.l ce.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("絍\u0001"));
            if (gVar instanceof b0) {
                return ((b0) gVar).X0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + gVar + ProtectedSandApp.s("結\u0001") + l1.d(gVar.getClass())).toString());
        }

        @fg.l
        public static ce.o p(@fg.l b bVar, @fg.l ce.n nVar, int i4) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                f1 f1Var = ((h1) nVar).getParameters().get(i4);
                l0.o(f1Var, ProtectedSandApp.s("絝\u0001"));
                return f1Var;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.l
        public static ce.i p0(@fg.l b bVar, @fg.l ce.i iVar, boolean z4) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof ce.j) {
                return bVar.a((ce.j) iVar, z4);
            }
            if (!(iVar instanceof ce.g)) {
                throw new IllegalStateException(ProtectedSandApp.s("絞\u0001"));
            }
            ce.g gVar = (ce.g) iVar;
            return bVar.o0(bVar.a(bVar.b(gVar), z4), bVar.a(bVar.c(gVar), z4));
        }

        @fg.l
        public static List<ce.o> q(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                List<f1> parameters = ((h1) nVar).getParameters();
                l0.o(parameters, ProtectedSandApp.s("絟\u0001"));
                return parameters;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.l
        public static ce.j q0(@fg.l b bVar, @fg.l ce.j jVar, boolean z4) {
            l0.p(jVar, ProtectedSandApp.s("絍\u0001"));
            if (jVar instanceof p0) {
                return ((p0) jVar).V0(z4);
            }
            StringBuilder a5 = kotlin.reflect.jvm.internal.impl.types.c.a(ProtectedSandApp.s("絏\u0001"), jVar, ProtectedSandApp.s("結\u0001"));
            a5.append(l1.d(jVar.getClass()));
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @fg.m
        public static kotlin.reflect.jvm.internal.impl.builtins.i r(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h1) nVar).c();
                l0.n(c5, ProtectedSandApp.s("絜\u0001"));
                return kotlin.reflect.jvm.internal.impl.builtins.h.P((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.m
        public static kotlin.reflect.jvm.internal.impl.builtins.i s(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h1) nVar).c();
                l0.n(c5, ProtectedSandApp.s("絜\u0001"));
                return kotlin.reflect.jvm.internal.impl.builtins.h.S((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.l
        public static ce.i t(@fg.l b bVar, @fg.l ce.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("絍\u0001"));
            if (oVar instanceof f1) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j((f1) oVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + oVar + ProtectedSandApp.s("結\u0001") + l1.d(oVar.getClass())).toString());
        }

        @fg.l
        public static ce.i u(@fg.l b bVar, @fg.l ce.m mVar) {
            l0.p(mVar, ProtectedSandApp.s("絍\u0001"));
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.types.l1) {
                return ((kotlin.reflect.jvm.internal.impl.types.l1) mVar).getType().R0();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + mVar + ProtectedSandApp.s("結\u0001") + l1.d(mVar.getClass())).toString());
        }

        @fg.m
        public static ce.o v(@fg.l b bVar, @fg.l ce.u uVar) {
            l0.p(uVar, ProtectedSandApp.s("絍\u0001"));
            if (uVar instanceof n) {
                return ((n) uVar).b();
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + uVar + ProtectedSandApp.s("結\u0001") + l1.d(uVar.getClass())).toString());
        }

        @fg.m
        public static ce.o w(@fg.l b bVar, @fg.l ce.n nVar) {
            l0.p(nVar, ProtectedSandApp.s("絍\u0001"));
            if (nVar instanceof h1) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h1) nVar).c();
                if (c5 instanceof f1) {
                    return (f1) c5;
                }
                return null;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + nVar + ProtectedSandApp.s("結\u0001") + l1.d(nVar.getClass())).toString());
        }

        @fg.m
        public static ce.i x(@fg.l b bVar, @fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絍\u0001"));
            if (iVar instanceof h0) {
                return kotlin.reflect.jvm.internal.impl.resolve.h.k((h0) iVar);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + iVar + ProtectedSandApp.s("結\u0001") + l1.d(iVar.getClass())).toString());
        }

        @fg.l
        public static List<ce.i> y(@fg.l b bVar, @fg.l ce.o oVar) {
            l0.p(oVar, ProtectedSandApp.s("絍\u0001"));
            if (oVar instanceof f1) {
                List<h0> upperBounds = ((f1) oVar).getUpperBounds();
                l0.o(upperBounds, ProtectedSandApp.s("絠\u0001"));
                return upperBounds;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + oVar + ProtectedSandApp.s("結\u0001") + l1.d(oVar.getClass())).toString());
        }

        @fg.l
        public static ce.v z(@fg.l b bVar, @fg.l ce.m mVar) {
            l0.p(mVar, ProtectedSandApp.s("絍\u0001"));
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.types.l1) {
                x1 c5 = ((kotlin.reflect.jvm.internal.impl.types.l1) mVar).c();
                l0.o(c5, ProtectedSandApp.s("絡\u0001"));
                return ce.r.a(c5);
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("絏\u0001") + mVar + ProtectedSandApp.s("結\u0001") + l1.d(mVar.getClass())).toString());
        }
    }

    @Override // ce.q
    @fg.l
    ce.j a(@fg.l ce.j jVar, boolean z4);

    @Override // ce.q
    @fg.l
    ce.j b(@fg.l ce.g gVar);

    @Override // ce.q
    @fg.l
    ce.j c(@fg.l ce.g gVar);

    @Override // ce.q
    @fg.l
    ce.n d(@fg.l ce.j jVar);

    @Override // ce.q
    @fg.m
    ce.d e(@fg.l ce.j jVar);

    @Override // ce.q
    boolean f(@fg.l ce.j jVar);

    @Override // ce.q
    @fg.m
    ce.j g(@fg.l ce.i iVar);

    @fg.l
    ce.i o0(@fg.l ce.j jVar, @fg.l ce.j jVar2);
}
