package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.r0;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.a0;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes7.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Map<String, k> f76769a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final String f76770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f76771b;

        /* compiled from: predefinedEnhancementInfo.kt */
        @r1({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1208#2,2:255\n1238#2,4:257\n1208#2,2:261\n1238#2,4:263\n1549#2:267\n1620#2,3:268\n1549#2:271\n1620#2,3:272\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n*L\n226#1:255,2\n226#1:257,4\n237#1:261,2\n237#1:263,4\n245#1:267\n245#1:268,3\n246#1:271\n246#1:272,3\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m$a$a, reason: collision with other inner class name */
        public final class C1096a {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final String f76772a;

            /* renamed from: b, reason: collision with root package name */
            @fg.l
            private final List<q0<String, q>> f76773b;

            /* renamed from: c, reason: collision with root package name */
            @fg.l
            private q0<String, q> f76774c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f76775d;

            public C1096a(@fg.l a aVar, String str) {
                l0.p(str, ProtectedSandApp.s("猉\u0001"));
                this.f76775d = aVar;
                this.f76772a = str;
                this.f76773b = new ArrayList();
                this.f76774c = new q0<>(ProtectedSandApp.s("猊\u0001"), null);
            }

            @fg.l
            public final q0<String, k> a() {
                a0 a0Var = a0.f76824a;
                String b5 = this.f76775d.b();
                String str = this.f76772a;
                List<q0<String, q>> list = this.f76773b;
                ArrayList arrayList = new ArrayList(w.b0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((q0) it.next()).e());
                }
                String k4 = a0Var.k(b5, a0Var.j(str, arrayList, this.f76774c.e()));
                q f4 = this.f76774c.f();
                List<q0<String, q>> list2 = this.f76773b;
                ArrayList arrayList2 = new ArrayList(w.b0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((q) ((q0) it2.next()).f());
                }
                return new q0<>(k4, new k(f4, arrayList2));
            }

            public final void b(@fg.l String str, @fg.l e... eVarArr) {
                q qVar;
                l0.p(str, ProtectedSandApp.s("猋\u0001"));
                l0.p(eVarArr, ProtectedSandApp.s("猌\u0001"));
                List<q0<String, q>> list = this.f76773b;
                if (eVarArr.length == 0) {
                    qVar = null;
                } else {
                    Iterable<r0> Fz = kotlin.collections.l.Fz(eVarArr);
                    int j4 = z0.j(w.b0(Fz, 10));
                    if (j4 < 16) {
                        j4 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
                    for (r0 r0Var : Fz) {
                        linkedHashMap.put(Integer.valueOf(r0Var.e()), (e) r0Var.f());
                    }
                    qVar = new q(linkedHashMap);
                }
                list.add(new q0<>(str, qVar));
            }

            public final void c(@fg.l String str, @fg.l e... eVarArr) {
                l0.p(str, ProtectedSandApp.s("猋\u0001"));
                l0.p(eVarArr, ProtectedSandApp.s("猌\u0001"));
                Iterable<r0> Fz = kotlin.collections.l.Fz(eVarArr);
                int j4 = z0.j(w.b0(Fz, 10));
                if (j4 < 16) {
                    j4 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
                for (r0 r0Var : Fz) {
                    linkedHashMap.put(Integer.valueOf(r0Var.e()), (e) r0Var.f());
                }
                this.f76774c = new q0<>(str, new q(linkedHashMap));
            }

            public final void d(@fg.l kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar) {
                l0.p(eVar, ProtectedSandApp.s("猋\u0001"));
                String desc = eVar.getDesc();
                l0.o(desc, ProtectedSandApp.s("猍\u0001"));
                this.f76774c = new q0<>(desc, null);
            }
        }

        public a(@fg.l m mVar, String str) {
            l0.p(str, ProtectedSandApp.s("猎\u0001"));
            this.f76771b = mVar;
            this.f76770a = str;
        }

        public final void a(@fg.l String str, @fg.l ld.l<? super C1096a, k2> lVar) {
            l0.p(str, ProtectedSandApp.s("猏\u0001"));
            l0.p(lVar, ProtectedSandApp.s("猐\u0001"));
            Map map = this.f76771b.f76769a;
            C1096a c1096a = new C1096a(this, str);
            lVar.invoke(c1096a);
            q0<String, k> a5 = c1096a.a();
            map.put(a5.e(), a5.f());
        }

        @fg.l
        public final String b() {
            return this.f76770a;
        }
    }

    @fg.l
    public final Map<String, k> b() {
        return this.f76769a;
    }
}
