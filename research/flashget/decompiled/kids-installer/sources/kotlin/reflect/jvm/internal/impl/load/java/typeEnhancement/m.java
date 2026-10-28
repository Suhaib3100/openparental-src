package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.collections.b0;
import kotlin.collections.e1;
import kotlin.collections.t;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.load.kotlin.y;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes5.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Map<String, k> f24893a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final String f24894a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f24895b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m$a$a, reason: collision with other inner class name */
        public final class C0292a {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final String f24896a;

            /* renamed from: b, reason: collision with root package name */
            @d5.d
            private final List<Pair<String, q>> f24897b;

            /* renamed from: c, reason: collision with root package name */
            @d5.d
            private Pair<String, q> f24898c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f24899d;

            public C0292a(@d5.d a aVar, String str) {
                l0.p(str, ProtectedSandApp.s("䬺"));
                this.f24899d = aVar;
                this.f24896a = str;
                this.f24897b = new ArrayList();
                this.f24898c = new Pair<>(ProtectedSandApp.s("䬻"), null);
            }

            @d5.d
            public final Pair<String, k> a() {
                int b02;
                int b03;
                y yVar = y.f25078a;
                String b6 = this.f24899d.b();
                String str = this.f24896a;
                List<Pair<String, q>> list = this.f24897b;
                b02 = b0.b0(list, 10);
                ArrayList arrayList = new ArrayList(b02);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).e());
                }
                String k5 = yVar.k(b6, yVar.j(str, arrayList, this.f24898c.e()));
                q f6 = this.f24898c.f();
                List<Pair<String, q>> list2 = this.f24897b;
                b03 = b0.b0(list2, 10);
                ArrayList arrayList2 = new ArrayList(b03);
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((q) ((Pair) it2.next()).f());
                }
                return new Pair<>(k5, new k(f6, arrayList2));
            }

            public final void b(@d5.d String str, @d5.d e... eVarArr) {
                Iterable<IndexedValue> Ez;
                int b02;
                int j5;
                q qVar;
                l0.p(str, ProtectedSandApp.s("䬼"));
                l0.p(eVarArr, ProtectedSandApp.s("䬽"));
                List<Pair<String, q>> list = this.f24897b;
                if (eVarArr.length == 0) {
                    qVar = null;
                } else {
                    Ez = t.Ez(eVarArr);
                    b02 = b0.b0(Ez, 10);
                    j5 = e1.j(b02);
                    if (j5 < 16) {
                        j5 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
                    for (IndexedValue indexedValue : Ez) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.e()), (e) indexedValue.f());
                    }
                    qVar = new q(linkedHashMap);
                }
                list.add(new Pair<>(str, qVar));
            }

            public final void c(@d5.d String str, @d5.d e... eVarArr) {
                Iterable<IndexedValue> Ez;
                int b02;
                int j5;
                l0.p(str, ProtectedSandApp.s("䬾"));
                l0.p(eVarArr, ProtectedSandApp.s("䬿"));
                Ez = t.Ez(eVarArr);
                b02 = b0.b0(Ez, 10);
                j5 = e1.j(b02);
                if (j5 < 16) {
                    j5 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
                for (IndexedValue indexedValue : Ez) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.e()), (e) indexedValue.f());
                }
                this.f24898c = new Pair<>(str, new q(linkedHashMap));
            }

            public final void d(@d5.d kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar) {
                l0.p(eVar, ProtectedSandApp.s("䭀"));
                String desc = eVar.getDesc();
                l0.o(desc, ProtectedSandApp.s("䭁"));
                this.f24898c = new Pair<>(desc, null);
            }
        }

        public a(@d5.d m mVar, String str) {
            l0.p(str, ProtectedSandApp.s("䭂"));
            this.f24895b = mVar;
            this.f24894a = str;
        }

        public final void a(@d5.d String str, @d5.d q3.l<? super C0292a, m2> lVar) {
            l0.p(str, ProtectedSandApp.s("䭃"));
            l0.p(lVar, ProtectedSandApp.s("䭄"));
            Map map = this.f24895b.f24893a;
            C0292a c0292a = new C0292a(this, str);
            lVar.N(c0292a);
            Pair<String, k> a6 = c0292a.a();
            map.put(a6.e(), a6.f());
        }

        @d5.d
        public final String b() {
            return this.f24894a;
        }
    }

    @d5.d
    public final Map<String, k> b() {
        return this.f24893a;
    }
}
