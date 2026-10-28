package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: MemberScope.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final a f25977c;

    /* renamed from: d, reason: collision with root package name */
    private static int f25978d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f25979e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f25980f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f25981g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f25982h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f25983i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f25984j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f25985k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f25986l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f25987m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f25988n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25989o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25990p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25991q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25992r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25993s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25994t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25995u;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25996v;

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25997w;

    /* renamed from: x, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f25998x;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private static final List<a.C0375a> f25999y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private static final List<a.C0375a> f26000z;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final List<c> f26001a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26002b;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a$a, reason: collision with other inner class name */
        private static final class C0375a {

            /* renamed from: a, reason: collision with root package name */
            private final int f26003a;

            /* renamed from: b, reason: collision with root package name */
            @d5.d
            private final String f26004b;

            public C0375a(int i5, @d5.d String str) {
                l0.p(str, ProtectedSandApp.s("十"));
                this.f26003a = i5;
                this.f26004b = str;
            }

            public final int a() {
                return this.f26003a;
            }

            @d5.d
            public final String b() {
                return this.f26004b;
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i5 = d.f25978d;
            a aVar = d.f25977c;
            d.f25978d <<= 1;
            return i5;
        }

        public final int b() {
            return d.f25985k;
        }

        public final int c() {
            return d.f25986l;
        }

        public final int d() {
            return d.f25983i;
        }

        public final int e() {
            return d.f25979e;
        }

        public final int f() {
            return d.f25982h;
        }

        public final int g() {
            return d.f25980f;
        }

        public final int h() {
            return d.f25981g;
        }

        public final int i() {
            return d.f25984j;
        }

        public a(w wVar) {
        }
    }

    static {
        String s5;
        a.C0375a c0375a;
        a.C0375a c0375a2;
        a aVar = new a(null);
        f25977c = aVar;
        f25978d = 1;
        int j5 = aVar.j();
        f25979e = j5;
        int j6 = aVar.j();
        f25980f = j6;
        int j7 = aVar.j();
        f25981g = j7;
        int j8 = aVar.j();
        f25982h = j8;
        int j9 = aVar.j();
        f25983i = j9;
        int j10 = aVar.j();
        f25984j = j10;
        int j11 = aVar.j() - 1;
        f25985k = j11;
        int i5 = j5 | j6 | j7;
        f25986l = i5;
        int i6 = j6 | j9 | j10;
        f25987m = i6;
        int i7 = j9 | j10;
        f25988n = i7;
        f25989o = new d(j11, null, 2, null);
        f25990p = new d(i7, null, 2, null);
        f25991q = new d(j5, null, 2, null);
        f25992r = new d(j6, null, 2, null);
        f25993s = new d(j7, null, 2, null);
        f25994t = new d(i5, null, 2, null);
        f25995u = new d(j8, null, 2, null);
        f25996v = new d(j9, null, 2, null);
        f25997w = new d(j10, null, 2, null);
        f25998x = new d(i6, null, 2, null);
        Field[] fields = d.class.getFields();
        String s6 = ProtectedSandApp.s("卂");
        l0.o(fields, s6);
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
            s5 = ProtectedSandApp.s("千");
            if (!hasNext) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i8 = dVar.f26002b;
                String name = field2.getName();
                l0.o(name, s5);
                c0375a2 = new a.C0375a(i8, name);
            } else {
                c0375a2 = null;
            }
            if (c0375a2 != null) {
                arrayList2.add(c0375a2);
            }
        }
        f25999y = arrayList2;
        Field[] fields2 = d.class.getFields();
        l0.o(fields2, s6);
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
            l0.n(obj3, ProtectedSandApp.s("卄"));
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                l0.o(name2, s5);
                c0375a = new a.C0375a(intValue, name2);
            } else {
                c0375a = null;
            }
            if (c0375a != null) {
                arrayList5.add(c0375a);
            }
        }
        f26000z = arrayList5;
    }

    public d(int i5, List list, int i6, w wVar) {
        this(i5, (i6 & 2) != 0 ? EmptyList.f23167o : list);
    }

    public final boolean a(int i5) {
        return (i5 & this.f26002b) != 0;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l0.g(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l0.n(obj, ProtectedSandApp.s("卆"));
        d dVar = (d) obj;
        return l0.g(this.f26001a, dVar.f26001a) && this.f26002b == dVar.f26002b;
    }

    public int hashCode() {
        return (this.f26001a.hashCode() * 31) + this.f26002b;
    }

    @d5.d
    public final List<c> l() {
        return this.f26001a;
    }

    public final int m() {
        return this.f26002b;
    }

    @d5.e
    public final d n(int i5) {
        int i6 = i5 & this.f26002b;
        if (i6 == 0) {
            return null;
        }
        return new d(i6, this.f26001a);
    }

    @d5.d
    public String toString() {
        Object obj;
        Iterator<T> it = f25999y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C0375a) obj).a() == this.f26002b) {
                break;
            }
        }
        a.C0375a c0375a = (a.C0375a) obj;
        String b6 = c0375a != null ? c0375a.b() : null;
        if (b6 == null) {
            List<a.C0375a> list = f26000z;
            ArrayList arrayList = new ArrayList();
            for (a.C0375a c0375a2 : list) {
                String b7 = a(c0375a2.a()) ? c0375a2.b() : null;
                if (b7 != null) {
                    arrayList.add(b7);
                }
            }
            b6 = j0.m3(arrayList, ProtectedSandApp.s("升"), null, null, 0, null, null, 62, null);
        }
        StringBuilder a6 = androidx.appcompat.view.g.a(ProtectedSandApp.s("午"), b6, ProtectedSandApp.s("卉"));
        a6.append(this.f26001a);
        a6.append(')');
        return a6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i5, @d5.d List<? extends c> list) {
        l0.p(list, ProtectedSandApp.s("卅"));
        this.f26001a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i5 &= ~((c) it.next()).a();
        }
        this.f26002b = i5;
    }
}
