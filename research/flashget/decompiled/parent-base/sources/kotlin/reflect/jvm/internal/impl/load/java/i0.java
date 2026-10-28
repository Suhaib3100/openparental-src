package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.l1;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: SpecialGenericSignatures.kt */
@r1({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,155:1\n1549#2:156\n1620#2,3:157\n1549#2:160\n1620#2,3:161\n1549#2:164\n1620#2,3:165\n1238#2,4:171\n1549#2:175\n1620#2,3:176\n1549#2:179\n1620#2,3:180\n1238#2,4:186\n1549#2:193\n1620#2,3:194\n1549#2:197\n1620#2,3:198\n1208#2,2:201\n1238#2,4:203\n13#3:168\n13#3:183\n468#4:169\n414#4:170\n468#4:184\n414#4:185\n152#5,3:190\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n57#1:156\n57#1:157,3\n59#1:160\n59#1:161,3\n60#1:164\n60#1:165,3\n98#1:171,4\n104#1:175\n104#1:176,3\n105#1:179\n105#1:180,3\n129#1:186,4\n137#1:193\n137#1:194,3\n141#1:197\n141#1:198,3\n142#1:201,2\n142#1:203,4\n63#1:168\n114#1:183\n98#1:169\n98#1:170\n129#1:184\n129#1:185\n133#1:190,3\n*E\n"})
/* loaded from: classes7.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f76436a = new a();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final List<a.C1087a> f76437b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final List<String> f76438c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final List<String> f76439d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final Map<a.C1087a, c> f76440e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Map<String, c> f76441f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f76442g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final Set<String> f76443h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final a.C1087a f76444i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final Map<a.C1087a, kotlin.reflect.jvm.internal.impl.name.f> f76445j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final Map<String, kotlin.reflect.jvm.internal.impl.name.f> f76446k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final Set<String> f76447l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final List<kotlin.reflect.jvm.internal.impl.name.f> f76448m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> f76449n;

    /* compiled from: SpecialGenericSignatures.kt */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.i0$a$a, reason: collision with other inner class name */
        public static final class C1087a {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final String f76450a;

            /* renamed from: b, reason: collision with root package name */
            @fg.l
            private final kotlin.reflect.jvm.internal.impl.name.f f76451b;

            /* renamed from: c, reason: collision with root package name */
            @fg.l
            private final String f76452c;

            /* renamed from: d, reason: collision with root package name */
            @fg.l
            private final String f76453d;

            /* renamed from: e, reason: collision with root package name */
            @fg.l
            private final String f76454e;

            public C1087a(@fg.l String str, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l String str2, @fg.l String str3) {
                l0.p(str, ProtectedSandApp.s("烠\u0001"));
                l0.p(fVar, ProtectedSandApp.s("烡\u0001"));
                l0.p(str2, ProtectedSandApp.s("烢\u0001"));
                l0.p(str3, ProtectedSandApp.s("烣\u0001"));
                this.f76450a = str;
                this.f76451b = fVar;
                this.f76452c = str2;
                this.f76453d = str3;
                this.f76454e = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.f76824a.k(str, fVar + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ C1087a b(C1087a c1087a, String str, kotlin.reflect.jvm.internal.impl.name.f fVar, String str2, String str3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = c1087a.f76450a;
                }
                if ((i4 & 2) != 0) {
                    fVar = c1087a.f76451b;
                }
                if ((i4 & 4) != 0) {
                    str2 = c1087a.f76452c;
                }
                if ((i4 & 8) != 0) {
                    str3 = c1087a.f76453d;
                }
                return c1087a.a(str, fVar, str2, str3);
            }

            @fg.l
            public final C1087a a(@fg.l String str, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l String str2, @fg.l String str3) {
                l0.p(str, ProtectedSandApp.s("烠\u0001"));
                l0.p(fVar, ProtectedSandApp.s("烡\u0001"));
                l0.p(str2, ProtectedSandApp.s("烢\u0001"));
                l0.p(str3, ProtectedSandApp.s("烣\u0001"));
                return new C1087a(str, fVar, str2, str3);
            }

            @fg.l
            public final kotlin.reflect.jvm.internal.impl.name.f c() {
                return this.f76451b;
            }

            @fg.l
            public final String d() {
                return this.f76454e;
            }

            public boolean equals(@fg.m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1087a)) {
                    return false;
                }
                C1087a c1087a = (C1087a) obj;
                return l0.g(this.f76450a, c1087a.f76450a) && l0.g(this.f76451b, c1087a.f76451b) && l0.g(this.f76452c, c1087a.f76452c) && l0.g(this.f76453d, c1087a.f76453d);
            }

            public int hashCode() {
                return this.f76453d.hashCode() + androidx.compose.foundation.text.modifiers.n.a(this.f76452c, (this.f76451b.hashCode() + (this.f76450a.hashCode() * 31)) * 31, 31);
            }

            @fg.l
            public String toString() {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("烤\u0001"));
                sb.append(this.f76450a);
                sb.append(ProtectedSandApp.s("烥\u0001"));
                sb.append(this.f76451b);
                sb.append(ProtectedSandApp.s("烦\u0001"));
                sb.append(this.f76452c);
                sb.append(ProtectedSandApp.s("烧\u0001"));
                return f3.a(sb, this.f76453d, ')');
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C1087a m(String str, String str2, String str3, String str4) {
            kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(str2);
            l0.o(f4, ProtectedSandApp.s("烨\u0001"));
            return new C1087a(str, f4, str3, str4);
        }

        @fg.m
        public final kotlin.reflect.jvm.internal.impl.name.f b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("烩\u0001"));
            return (kotlin.reflect.jvm.internal.impl.name.f) i0.f76449n.get(fVar);
        }

        @fg.l
        public final List<String> c() {
            return i0.f76438c;
        }

        @fg.l
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return i0.f76442g;
        }

        @fg.l
        public final Set<String> e() {
            return i0.f76443h;
        }

        @fg.l
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> f() {
            return i0.f76449n;
        }

        @fg.l
        public final List<kotlin.reflect.jvm.internal.impl.name.f> g() {
            return i0.f76448m;
        }

        @fg.l
        public final C1087a h() {
            return i0.f76444i;
        }

        @fg.l
        public final Map<String, c> i() {
            return i0.f76441f;
        }

        @fg.l
        public final Map<String, kotlin.reflect.jvm.internal.impl.name.f> j() {
            return i0.f76446k;
        }

        public final boolean k(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("烪\u0001"));
            return i0.f76448m.contains(fVar);
        }

        @fg.l
        public final b l(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("烫\u0001"));
            return i0.f76438c.contains(str) ? b.ONE_COLLECTION_PARAMETER : ((c) z0.K(i0.f76441f, str)) == c.NULL ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    public static final class b {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        private final boolean isObjectReplacedWithTypeParameter;

        @fg.m
        private final String valueParametersSignature;
        public static final b ONE_COLLECTION_PARAMETER = new b(ProtectedSandApp.s("热\u0001"), 0, ProtectedSandApp.s("烬\u0001"), false);
        public static final b OBJECT_PARAMETER_NON_GENERIC = new b(ProtectedSandApp.s("烮\u0001"), 1, null, true);
        public static final b OBJECT_PARAMETER_GENERIC = new b(ProtectedSandApp.s("烰\u0001"), 2, ProtectedSandApp.s("烯\u0001"), true);

        private static final /* synthetic */ b[] $values() {
            return new b[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private b(String str, int i4, String str2, boolean z4) {
            this.valueParametersSignature = str2;
            this.isObjectReplacedWithTypeParameter = z4;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    public static final class c {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c MAP_GET_OR_DEFAULT;

        @fg.m
        private final Object defaultValue;
        public static final c NULL = new c(ProtectedSandApp.s("烱\u0001"), 0, null);
        public static final c INDEX = new c(ProtectedSandApp.s("烲\u0001"), 1, -1);
        public static final c FALSE = new c(ProtectedSandApp.s("烳\u0001"), 2, Boolean.FALSE);

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

        static {
            kotlin.jvm.internal.w wVar = null;
            MAP_GET_OR_DEFAULT = new a(ProtectedSandApp.s("烴\u0001"), 3, wVar, wVar);
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        public /* synthetic */ c(String str, int i4, Object obj, kotlin.jvm.internal.w wVar) {
            this(str, i4, obj);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        private c(String str, int i4, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        String s4;
        Set u4 = l1.u(ProtectedSandApp.s("炒\u0001"), ProtectedSandApp.s("炐\u0001"), ProtectedSandApp.s("炑\u0001"));
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(u4, 10));
        Iterator it = u4.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s4 = ProtectedSandApp.s("炓\u0001");
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            a aVar = f76436a;
            String desc = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN.getDesc();
            l0.o(desc, s4);
            arrayList.add(aVar.m(ProtectedSandApp.s("炔\u0001"), str, ProtectedSandApp.s("炕\u0001"), desc));
        }
        f76437b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C1087a) it2.next()).d());
        }
        f76438c = arrayList3;
        List<a.C1087a> list = f76437b;
        ArrayList arrayList4 = new ArrayList(kotlin.collections.w.b0(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C1087a) it3.next()).c().b());
        }
        f76439d = arrayList4;
        kotlin.reflect.jvm.internal.impl.load.kotlin.a0 a0Var = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.f76824a;
        a aVar2 = f76436a;
        String s5 = ProtectedSandApp.s("炖\u0001");
        String i4 = a0Var.i(s5);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN;
        String desc2 = eVar.getDesc();
        l0.o(desc2, s4);
        String s6 = ProtectedSandApp.s("炗\u0001");
        String s7 = ProtectedSandApp.s("炘\u0001");
        a.C1087a m4 = aVar2.m(i4, s6, s7, desc2);
        c cVar = c.FALSE;
        q0 q0Var = new q0(m4, cVar);
        String i5 = a0Var.i(s5);
        String desc3 = eVar.getDesc();
        l0.o(desc3, s4);
        String s10 = ProtectedSandApp.s("炙\u0001");
        q0 q0Var2 = new q0(aVar2.m(i5, s10, s7, desc3), cVar);
        String s11 = ProtectedSandApp.s("炚\u0001");
        String i6 = a0Var.i(s11);
        String desc4 = eVar.getDesc();
        l0.o(desc4, s4);
        q0 q0Var3 = new q0(aVar2.m(i6, ProtectedSandApp.s("炛\u0001"), s7, desc4), cVar);
        String i7 = a0Var.i(s11);
        String desc5 = eVar.getDesc();
        l0.o(desc5, s4);
        q0 q0Var4 = new q0(aVar2.m(i7, ProtectedSandApp.s("炜\u0001"), s7, desc5), cVar);
        String i10 = a0Var.i(s11);
        String desc6 = eVar.getDesc();
        l0.o(desc6, s4);
        String s12 = ProtectedSandApp.s("炝\u0001");
        q0 q0Var5 = new q0(aVar2.m(i10, s10, s12, desc6), cVar);
        q0 q0Var6 = new q0(aVar2.m(a0Var.i(s11), ProtectedSandApp.s("炞\u0001"), s12, s7), c.MAP_GET_OR_DEFAULT);
        String i11 = a0Var.i(s11);
        String s13 = ProtectedSandApp.s("炟\u0001");
        a.C1087a m5 = aVar2.m(i11, s13, s7, s7);
        c cVar2 = c.NULL;
        q0 q0Var7 = new q0(m5, cVar2);
        q0 q0Var8 = new q0(aVar2.m(a0Var.i(s11), s10, s7, s7), cVar2);
        String s14 = ProtectedSandApp.s("炠\u0001");
        String i12 = a0Var.i(s14);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT;
        String desc7 = eVar2.getDesc();
        l0.o(desc7, s4);
        a.C1087a m6 = aVar2.m(i12, ProtectedSandApp.s("炡\u0001"), s7, desc7);
        c cVar3 = c.INDEX;
        q0 q0Var9 = new q0(m6, cVar3);
        String i13 = a0Var.i(s14);
        String desc8 = eVar2.getDesc();
        l0.o(desc8, s4);
        Map<a.C1087a, c> W = z0.W(q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9, new q0(aVar2.m(i13, ProtectedSandApp.s("炢\u0001"), s7, desc8), cVar3));
        f76440e = W;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(W.size()));
        Iterator<T> it4 = W.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            linkedHashMap.put(((a.C1087a) entry.getKey()).d(), entry.getValue());
        }
        f76441f = linkedHashMap;
        Set C = l1.C(f76440e.keySet(), f76437b);
        ArrayList arrayList5 = new ArrayList(kotlin.collections.w.b0(C, 10));
        Iterator it5 = C.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((a.C1087a) it5.next()).c());
        }
        f76442g = kotlin.collections.w.a6(arrayList5);
        ArrayList arrayList6 = new ArrayList(kotlin.collections.w.b0(C, 10));
        Iterator it6 = C.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((a.C1087a) it6.next()).d());
        }
        f76443h = kotlin.collections.w.a6(arrayList6);
        a aVar3 = f76436a;
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT;
        String desc9 = eVar3.getDesc();
        l0.o(desc9, s4);
        a.C1087a m7 = aVar3.m(ProtectedSandApp.s("炣\u0001"), ProtectedSandApp.s("炤\u0001"), desc9, s7);
        f76444i = m7;
        kotlin.reflect.jvm.internal.impl.load.kotlin.a0 a0Var2 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.f76824a;
        String s15 = ProtectedSandApp.s("炥\u0001");
        String h4 = a0Var2.h(s15);
        String desc10 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BYTE.getDesc();
        l0.o(desc10, s4);
        q0 q0Var10 = new q0(aVar3.m(h4, ProtectedSandApp.s("炦\u0001"), "", desc10), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("炧\u0001")));
        String h5 = a0Var2.h(s15);
        String desc11 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.SHORT.getDesc();
        l0.o(desc11, s4);
        q0 q0Var11 = new q0(aVar3.m(h5, ProtectedSandApp.s("炨\u0001"), "", desc11), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("炩\u0001")));
        String h6 = a0Var2.h(s15);
        String desc12 = eVar3.getDesc();
        l0.o(desc12, s4);
        q0 q0Var12 = new q0(aVar3.m(h6, ProtectedSandApp.s("炪\u0001"), "", desc12), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("炫\u0001")));
        String h7 = a0Var2.h(s15);
        String desc13 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.LONG.getDesc();
        l0.o(desc13, s4);
        q0 q0Var13 = new q0(aVar3.m(h7, ProtectedSandApp.s("炬\u0001"), "", desc13), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("炭\u0001")));
        String h10 = a0Var2.h(s15);
        String desc14 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.FLOAT.getDesc();
        l0.o(desc14, s4);
        q0 q0Var14 = new q0(aVar3.m(h10, ProtectedSandApp.s("炮\u0001"), "", desc14), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("炯\u0001")));
        String h11 = a0Var2.h(s15);
        String desc15 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.DOUBLE.getDesc();
        l0.o(desc15, s4);
        q0 q0Var15 = new q0(aVar3.m(h11, ProtectedSandApp.s("炰\u0001"), "", desc15), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("炱\u0001")));
        q0 q0Var16 = new q0(m7, kotlin.reflect.jvm.internal.impl.name.f.f(s10));
        String h12 = a0Var2.h(ProtectedSandApp.s("炲\u0001"));
        String desc16 = eVar3.getDesc();
        l0.o(desc16, s4);
        String desc17 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.CHAR.getDesc();
        l0.o(desc17, s4);
        Map<a.C1087a, kotlin.reflect.jvm.internal.impl.name.f> W2 = z0.W(q0Var10, q0Var11, q0Var12, q0Var13, q0Var14, q0Var15, q0Var16, new q0(aVar3.m(h12, s13, desc16, desc17), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("炳\u0001"))));
        f76445j = W2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(z0.j(W2.size()));
        Iterator<T> it7 = W2.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it7.next();
            linkedHashMap2.put(((a.C1087a) entry2.getKey()).d(), entry2.getValue());
        }
        f76446k = linkedHashMap2;
        Map<a.C1087a, kotlin.reflect.jvm.internal.impl.name.f> map = f76445j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<a.C1087a, kotlin.reflect.jvm.internal.impl.name.f> entry3 : map.entrySet()) {
            linkedHashSet.add(a.C1087a.b(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).d());
        }
        f76447l = linkedHashSet;
        Set<a.C1087a> keySet = f76445j.keySet();
        ArrayList arrayList7 = new ArrayList(kotlin.collections.w.b0(keySet, 10));
        Iterator<T> it8 = keySet.iterator();
        while (it8.hasNext()) {
            arrayList7.add(((a.C1087a) it8.next()).c());
        }
        f76448m = arrayList7;
        Set<Map.Entry<a.C1087a, kotlin.reflect.jvm.internal.impl.name.f>> entrySet = f76445j.entrySet();
        ArrayList<q0> arrayList8 = new ArrayList(kotlin.collections.w.b0(entrySet, 10));
        Iterator<T> it9 = entrySet.iterator();
        while (it9.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it9.next();
            arrayList8.add(new q0(((a.C1087a) entry4.getKey()).c(), entry4.getValue()));
        }
        int j4 = z0.j(kotlin.collections.w.b0(arrayList8, 10));
        if (j4 < 16) {
            j4 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(j4);
        for (q0 q0Var17 : arrayList8) {
            linkedHashMap3.put((kotlin.reflect.jvm.internal.impl.name.f) q0Var17.f(), (kotlin.reflect.jvm.internal.impl.name.f) q0Var17.e());
        }
        f76449n = linkedHashMap3;
    }
}
