package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.e1;
import kotlin.collections.f1;
import kotlin.collections.q1;
import kotlin.collections.r1;
import kotlin.jvm.internal.l0;

/* compiled from: SpecialGenericSignatures.kt */
/* loaded from: classes5.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f24581a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final List<a.C0283a> f24582b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final List<String> f24583c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final List<String> f24584d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final Map<a.C0283a, c> f24585e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final Map<String, c> f24586f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f24587g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private static final Set<String> f24588h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private static final a.C0283a f24589i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private static final Map<a.C0283a, kotlin.reflect.jvm.internal.impl.name.f> f24590j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    private static final Map<String, kotlin.reflect.jvm.internal.impl.name.f> f24591k;

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    private static final List<kotlin.reflect.jvm.internal.impl.name.f> f24592l;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> f24593m;

    /* compiled from: SpecialGenericSignatures.kt */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.i0$a$a, reason: collision with other inner class name */
        public static final class C0283a {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final kotlin.reflect.jvm.internal.impl.name.f f24594a;

            /* renamed from: b, reason: collision with root package name */
            @d5.d
            private final String f24595b;

            public C0283a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d String str) {
                l0.p(fVar, ProtectedSandApp.s("䨅"));
                l0.p(str, ProtectedSandApp.s("䨆"));
                this.f24594a = fVar;
                this.f24595b = str;
            }

            @d5.d
            public final kotlin.reflect.jvm.internal.impl.name.f a() {
                return this.f24594a;
            }

            @d5.d
            public final String b() {
                return this.f24595b;
            }

            public boolean equals(@d5.e Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0283a)) {
                    return false;
                }
                C0283a c0283a = (C0283a) obj;
                return l0.g(this.f24594a, c0283a.f24594a) && l0.g(this.f24595b, c0283a.f24595b);
            }

            public int hashCode() {
                return this.f24595b.hashCode() + (this.f24594a.hashCode() * 31);
            }

            @d5.d
            public String toString() {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䨇"));
                sb.append(this.f24594a);
                sb.append(ProtectedSandApp.s("䨈"));
                return c1.c.a(sb, this.f24595b, ')');
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0283a m(String str, String str2, String str3, String str4) {
            kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(str2);
            l0.o(p5, ProtectedSandApp.s("䨉"));
            return new C0283a(p5, kotlin.reflect.jvm.internal.impl.load.kotlin.y.f25078a.k(str, str2 + '(' + str3 + ')' + str4));
        }

        @d5.e
        public final kotlin.reflect.jvm.internal.impl.name.f b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("䨊"));
            return (kotlin.reflect.jvm.internal.impl.name.f) i0.f24593m.get(fVar);
        }

        @d5.d
        public final List<String> c() {
            return i0.f24583c;
        }

        @d5.d
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return i0.f24587g;
        }

        @d5.d
        public final Set<String> e() {
            return i0.f24588h;
        }

        @d5.d
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> f() {
            return i0.f24593m;
        }

        @d5.d
        public final List<kotlin.reflect.jvm.internal.impl.name.f> g() {
            return i0.f24592l;
        }

        @d5.d
        public final C0283a h() {
            return i0.f24589i;
        }

        @d5.d
        public final Map<String, c> i() {
            return i0.f24586f;
        }

        @d5.d
        public final Map<String, kotlin.reflect.jvm.internal.impl.name.f> j() {
            return i0.f24591k;
        }

        public final boolean k(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("䨋"));
            return i0.f24592l.contains(fVar);
        }

        @d5.d
        public final b l(@d5.d String str) {
            Object K;
            l0.p(str, ProtectedSandApp.s("䨌"));
            if (i0.f24583c.contains(str)) {
                return b.ONE_COLLECTION_PARAMETER;
            }
            K = f1.K(i0.f24586f, str);
            return ((c) K) == c.NULL ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: SpecialGenericSignatures.kt */
    public enum b {
        ONE_COLLECTION_PARAMETER(ProtectedSandApp.s("䨍"), false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC(ProtectedSandApp.s("䨐"), true);

        private final boolean isObjectReplacedWithTypeParameter;

        @d5.e
        private final String valueParametersSignature;

        b(String str, boolean z5) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z5;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    public static final class c {

        @d5.e
        private final Object defaultValue;
        public static final c NULL = new c(ProtectedSandApp.s("䨒"), 0, null);
        public static final c INDEX = new c(ProtectedSandApp.s("䨓"), 1, -1);
        public static final c FALSE = new c(ProtectedSandApp.s("䨔"), 2, Boolean.FALSE);
        public static final c MAP_GET_OR_DEFAULT = new a(ProtectedSandApp.s("䨕"), 3);
        private static final /* synthetic */ c[] $VALUES = $values();

        /* compiled from: SpecialGenericSignatures.kt */
        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            a(java.lang.String r2, int r3) {
                /*
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.i0.c.a.<init>(java.lang.String, int):void");
            }
        }

        private static final /* synthetic */ c[] $values() {
            return new c[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        public /* synthetic */ c(String str, int i5, Object obj, kotlin.jvm.internal.w wVar) {
            this(str, i5, obj);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        private c(String str, int i5, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Set u5;
        int b02;
        String s5;
        int b03;
        int b04;
        Map<a.C0283a, c> W;
        int j5;
        Set C;
        int b05;
        Set<kotlin.reflect.jvm.internal.impl.name.f> a6;
        int b06;
        Set<String> a62;
        Map<a.C0283a, kotlin.reflect.jvm.internal.impl.name.f> W2;
        int j6;
        int b07;
        int b08;
        int b09;
        int j7;
        u5 = q1.u(ProtectedSandApp.s("䦭"), ProtectedSandApp.s("䦫"), ProtectedSandApp.s("䦬"));
        b02 = kotlin.collections.b0.b0(u5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = u5.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s5 = ProtectedSandApp.s("䦮");
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            a aVar = f24581a;
            String desc = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN.getDesc();
            l0.o(desc, s5);
            arrayList.add(aVar.m(ProtectedSandApp.s("䦯"), str, ProtectedSandApp.s("䦰"), desc));
        }
        f24582b = arrayList;
        b03 = kotlin.collections.b0.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((a.C0283a) it2.next()).b());
        }
        f24583c = arrayList2;
        List<a.C0283a> list = f24582b;
        b04 = kotlin.collections.b0.b0(list, 10);
        ArrayList arrayList3 = new ArrayList(b04);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((a.C0283a) it3.next()).a().h());
        }
        f24584d = arrayList3;
        kotlin.reflect.jvm.internal.impl.load.kotlin.y yVar = kotlin.reflect.jvm.internal.impl.load.kotlin.y.f25078a;
        a aVar2 = f24581a;
        String s6 = ProtectedSandApp.s("䦱");
        String i5 = yVar.i(s6);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN;
        String desc2 = eVar.getDesc();
        l0.o(desc2, s5);
        String s7 = ProtectedSandApp.s("䦲");
        String s8 = ProtectedSandApp.s("䦳");
        a.C0283a m5 = aVar2.m(i5, s7, s8, desc2);
        c cVar = c.FALSE;
        String i6 = yVar.i(s6);
        String desc3 = eVar.getDesc();
        l0.o(desc3, s5);
        String s9 = ProtectedSandApp.s("䦴");
        String s10 = ProtectedSandApp.s("䦵");
        String i7 = yVar.i(s10);
        String desc4 = eVar.getDesc();
        l0.o(desc4, s5);
        String i8 = yVar.i(s10);
        String desc5 = eVar.getDesc();
        l0.o(desc5, s5);
        String i9 = yVar.i(s10);
        String desc6 = eVar.getDesc();
        l0.o(desc6, s5);
        String s11 = ProtectedSandApp.s("䦸");
        String i10 = yVar.i(s10);
        String s12 = ProtectedSandApp.s("䦺");
        a.C0283a m6 = aVar2.m(i10, s12, s8, s8);
        c cVar2 = c.NULL;
        String s13 = ProtectedSandApp.s("䦻");
        String i11 = yVar.i(s13);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT;
        String desc7 = eVar2.getDesc();
        String s14 = ProtectedSandApp.s("䦼");
        l0.o(desc7, s14);
        a.C0283a m7 = aVar2.m(i11, ProtectedSandApp.s("䦽"), s8, desc7);
        c cVar3 = c.INDEX;
        String i12 = yVar.i(s13);
        String desc8 = eVar2.getDesc();
        l0.o(desc8, s14);
        W = f1.W(new Pair(m5, cVar), new Pair(aVar2.m(i6, s9, s8, desc3), cVar), new Pair(aVar2.m(i7, ProtectedSandApp.s("䦶"), s8, desc4), cVar), new Pair(aVar2.m(i8, ProtectedSandApp.s("䦷"), s8, desc5), cVar), new Pair(aVar2.m(i9, s9, s11, desc6), cVar), new Pair(aVar2.m(yVar.i(s10), ProtectedSandApp.s("䦹"), s11, s8), c.MAP_GET_OR_DEFAULT), new Pair(m6, cVar2), new Pair(aVar2.m(yVar.i(s10), s9, s8, s8), cVar2), new Pair(m7, cVar3), new Pair(aVar2.m(i12, ProtectedSandApp.s("䦾"), s8, desc8), cVar3));
        f24585e = W;
        j5 = e1.j(W.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        Iterator<T> it4 = W.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            linkedHashMap.put(((a.C0283a) entry.getKey()).b(), entry.getValue());
        }
        f24586f = linkedHashMap;
        C = r1.C(f24585e.keySet(), f24582b);
        b05 = kotlin.collections.b0.b0(C, 10);
        ArrayList arrayList4 = new ArrayList(b05);
        Iterator it5 = C.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((a.C0283a) it5.next()).a());
        }
        a6 = kotlin.collections.j0.a6(arrayList4);
        f24587g = a6;
        b06 = kotlin.collections.b0.b0(C, 10);
        ArrayList arrayList5 = new ArrayList(b06);
        Iterator it6 = C.iterator();
        while (it6.hasNext()) {
            arrayList5.add(((a.C0283a) it6.next()).b());
        }
        a62 = kotlin.collections.j0.a6(arrayList5);
        f24588h = a62;
        a aVar3 = f24581a;
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT;
        String desc9 = eVar3.getDesc();
        l0.o(desc9, s14);
        a.C0283a m8 = aVar3.m(ProtectedSandApp.s("䦿"), ProtectedSandApp.s("䧀"), desc9, s8);
        f24589i = m8;
        kotlin.reflect.jvm.internal.impl.load.kotlin.y yVar2 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.f25078a;
        String s15 = ProtectedSandApp.s("䧁");
        String h5 = yVar2.h(s15);
        String desc10 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BYTE.getDesc();
        l0.o(desc10, ProtectedSandApp.s("䧂"));
        String h6 = yVar2.h(s15);
        String desc11 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.SHORT.getDesc();
        l0.o(desc11, ProtectedSandApp.s("䧅"));
        String h7 = yVar2.h(s15);
        String desc12 = eVar3.getDesc();
        l0.o(desc12, s14);
        String h8 = yVar2.h(s15);
        String desc13 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.LONG.getDesc();
        l0.o(desc13, ProtectedSandApp.s("䧊"));
        String h9 = yVar2.h(s15);
        String desc14 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.FLOAT.getDesc();
        l0.o(desc14, ProtectedSandApp.s("䧍"));
        String h10 = yVar2.h(s15);
        String desc15 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.DOUBLE.getDesc();
        l0.o(desc15, ProtectedSandApp.s("䧐"));
        String h11 = yVar2.h(ProtectedSandApp.s("䧓"));
        String desc16 = eVar3.getDesc();
        l0.o(desc16, s14);
        String desc17 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.CHAR.getDesc();
        l0.o(desc17, ProtectedSandApp.s("䧔"));
        W2 = f1.W(new Pair(aVar3.m(h5, ProtectedSandApp.s("䧃"), "", desc10), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧄"))), new Pair(aVar3.m(h6, ProtectedSandApp.s("䧆"), "", desc11), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧇"))), new Pair(aVar3.m(h7, ProtectedSandApp.s("䧈"), "", desc12), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧉"))), new Pair(aVar3.m(h8, ProtectedSandApp.s("䧋"), "", desc13), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧌"))), new Pair(aVar3.m(h9, ProtectedSandApp.s("䧎"), "", desc14), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧏"))), new Pair(aVar3.m(h10, ProtectedSandApp.s("䧑"), "", desc15), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧒"))), new Pair(m8, kotlin.reflect.jvm.internal.impl.name.f.p(s9)), new Pair(aVar3.m(h11, s12, desc16, desc17), kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧕"))));
        f24590j = W2;
        j6 = e1.j(W2.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j6);
        Iterator<T> it7 = W2.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it7.next();
            linkedHashMap2.put(((a.C0283a) entry2.getKey()).b(), entry2.getValue());
        }
        f24591k = linkedHashMap2;
        Set<a.C0283a> keySet = f24590j.keySet();
        b07 = kotlin.collections.b0.b0(keySet, 10);
        ArrayList arrayList6 = new ArrayList(b07);
        Iterator<T> it8 = keySet.iterator();
        while (it8.hasNext()) {
            arrayList6.add(((a.C0283a) it8.next()).a());
        }
        f24592l = arrayList6;
        Set<Map.Entry<a.C0283a, kotlin.reflect.jvm.internal.impl.name.f>> entrySet = f24590j.entrySet();
        b08 = kotlin.collections.b0.b0(entrySet, 10);
        ArrayList<Pair> arrayList7 = new ArrayList(b08);
        Iterator<T> it9 = entrySet.iterator();
        while (it9.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it9.next();
            arrayList7.add(new Pair(((a.C0283a) entry3.getKey()).a(), entry3.getValue()));
        }
        b09 = kotlin.collections.b0.b0(arrayList7, 10);
        j7 = e1.j(b09);
        if (j7 < 16) {
            j7 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(j7);
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((kotlin.reflect.jvm.internal.impl.name.f) pair.f(), (kotlin.reflect.jvm.internal.impl.name.f) pair.e());
        }
        f24593m = linkedHashMap3;
    }
}
