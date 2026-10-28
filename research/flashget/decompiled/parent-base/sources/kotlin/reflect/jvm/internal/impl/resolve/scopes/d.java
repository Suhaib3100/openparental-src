package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import androidx.compose.ui.graphics.l6;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: MemberScope.kt */
@r1({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1855#2,2:262\n1726#2,3:264\n288#2,2:267\n1603#2,9:269\n1855#2:278\n1856#2:280\n1612#2:281\n1603#2,9:286\n1855#2:295\n1856#2:297\n1612#2:298\n766#2:303\n857#2,2:304\n1603#2,9:306\n1855#2:315\n1856#2:317\n1612#2:318\n1#3:279\n1#3:296\n1#3:316\n210#4:282\n210#4:299\n3792#5:283\n4307#5,2:284\n3792#5:300\n4307#5,2:301\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n*L\n98#1:262,2\n103#1:264,3\n129#1:267,2\n131#1:269,9\n131#1:278\n131#1:280\n131#1:281\n197#1:286,9\n197#1:295\n197#1:297\n197#1:298\n203#1:303\n203#1:304,2\n204#1:306,9\n204#1:315\n204#1:317\n204#1:318\n131#1:279\n197#1:296\n204#1:316\n196#1:282\n202#1:299\n196#1:283\n196#1:284,2\n202#1:300\n202#1:301,2\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final a f77961c;

    /* renamed from: d, reason: collision with root package name */
    private static int f77962d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f77963e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f77964f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f77965g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f77966h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f77967i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f77968j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f77969k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f77970l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f77971m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f77972n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77973o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77974p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77975q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77976r;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77977s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77978t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77979u;

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77980v;

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77981w;

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f77982x;

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private static final List<a.C1179a> f77983y;

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private static final List<a.C1179a> f77984z;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final List<c> f77985a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77986b;

    /* compiled from: MemberScope.kt */
    @r1({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1#2:262\n3792#3:263\n4307#3,2:264\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n*L\n210#1:263\n210#1:264,2\n*E\n"})
    public static final class a {

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a$a, reason: collision with other inner class name */
        private static final class C1179a {

            /* renamed from: a, reason: collision with root package name */
            private final int f77987a;

            /* renamed from: b, reason: collision with root package name */
            @fg.l
            private final String f77988b;

            public C1179a(int i4, @fg.l String str) {
                l0.p(str, ProtectedSandApp.s("窄\u0001"));
                this.f77987a = i4;
                this.f77988b = str;
            }

            public final int a() {
                return this.f77987a;
            }

            @fg.l
            public final String b() {
                return this.f77988b;
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i4 = d.f77962d;
            a aVar = d.f77961c;
            d.f77962d <<= 1;
            return i4;
        }

        public final int b() {
            return d.f77969k;
        }

        public final int c() {
            return d.f77970l;
        }

        public final int d() {
            return d.f77967i;
        }

        public final int e() {
            return d.f77963e;
        }

        public final int f() {
            return d.f77966h;
        }

        public final int g() {
            return d.f77964f;
        }

        public final int h() {
            return d.f77965g;
        }

        public final int i() {
            return d.f77968j;
        }

        public a(w wVar) {
        }
    }

    static {
        String s4;
        a.C1179a c1179a;
        a.C1179a c1179a2;
        a aVar = new a();
        f77961c = aVar;
        int j4 = aVar.j();
        f77963e = j4;
        int j5 = aVar.j();
        f77964f = j5;
        int j6 = aVar.j();
        f77965g = j6;
        int j7 = aVar.j();
        f77966h = j7;
        int j10 = aVar.j();
        f77967i = j10;
        int j11 = aVar.j();
        f77968j = j11;
        int j12 = aVar.j() - 1;
        f77969k = j12;
        int i4 = j4 | j5 | j6;
        f77970l = i4;
        int i5 = j5 | j10 | j11;
        f77971m = i5;
        int i6 = j10 | j11;
        f77972n = i6;
        f77973o = new d(j12, null, 2, null);
        f77974p = new d(i6, null, 2, null);
        f77975q = new d(j4, null, 2, null);
        f77976r = new d(j5, null, 2, null);
        f77977s = new d(j6, null, 2, null);
        f77978t = new d(i4, null, 2, null);
        f77979u = new d(j7, null, 2, null);
        f77980v = new d(j10, null, 2, null);
        f77981w = new d(j11, null, 2, null);
        f77982x = new d(i5, null, 2, null);
        Field[] fields = d.class.getFields();
        String s5 = ProtectedSandApp.s("窅\u0001");
        l0.o(fields, s5);
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s4 = ProtectedSandApp.s("窆\u0001");
            if (!hasNext) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i7 = dVar.f77986b;
                String name = field2.getName();
                l0.o(name, s4);
                c1179a2 = new a.C1179a(i7, name);
            } else {
                c1179a2 = null;
            }
            if (c1179a2 != null) {
                arrayList2.add(c1179a2);
            }
        }
        f77983y = arrayList2;
        Field[] fields2 = d.class.getFields();
        l0.o(fields2, s5);
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (l0.g(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            l0.n(obj3, ProtectedSandApp.s("窇\u0001"));
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                l0.o(name2, s4);
                c1179a = new a.C1179a(intValue, name2);
            } else {
                c1179a = null;
            }
            if (c1179a != null) {
                arrayList5.add(c1179a);
            }
        }
        f77984z = arrayList5;
    }

    public d(int i4, List list, int i5, w wVar) {
        this(i4, (i5 & 2) != 0 ? j0.f74919b : list);
    }

    public final boolean a(int i4) {
        return (i4 & this.f77986b) != 0;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l0.g(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l0.n(obj, ProtectedSandApp.s("窉\u0001"));
        d dVar = (d) obj;
        return l0.g(this.f77985a, dVar.f77985a) && this.f77986b == dVar.f77986b;
    }

    public int hashCode() {
        return (this.f77985a.hashCode() * 31) + this.f77986b;
    }

    @fg.l
    public final List<c> l() {
        return this.f77985a;
    }

    public final int m() {
        return this.f77986b;
    }

    @fg.m
    public final d n(int i4) {
        int i5 = i4 & this.f77986b;
        if (i5 == 0) {
            return null;
        }
        return new d(i5, this.f77985a);
    }

    @fg.l
    public String toString() {
        Object obj;
        Iterator<T> it = f77983y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C1179a) obj).a() == this.f77986b) {
                break;
            }
        }
        a.C1179a c1179a = (a.C1179a) obj;
        String b5 = c1179a != null ? c1179a.b() : null;
        if (b5 == null) {
            List<a.C1179a> list = f77984z;
            ArrayList arrayList = new ArrayList();
            for (a.C1179a c1179a2 : list) {
                String b6 = a(c1179a2.a()) ? c1179a2.b() : null;
                if (b6 != null) {
                    arrayList.add(b6);
                }
            }
            b5 = kotlin.collections.w.m3(arrayList, ProtectedSandApp.s("窊\u0001"), null, null, 0, null, null, 62, null);
        }
        return l6.a(androidx.appcompat.view.g.a(ProtectedSandApp.s("窋\u0001"), b5, ProtectedSandApp.s("窌\u0001")), this.f77985a, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i4, @fg.l List<? extends c> list) {
        l0.p(list, ProtectedSandApp.s("窈\u0001"));
        this.f77985a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i4 &= ~((c) it.next()).a();
        }
        this.f77986b = i4;
    }
}
