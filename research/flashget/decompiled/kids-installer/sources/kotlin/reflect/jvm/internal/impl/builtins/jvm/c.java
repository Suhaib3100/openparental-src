package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.text.d0;
import kotlin.text.h0;

/* compiled from: JavaToKotlinClassMap.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final c f23942a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final String f23943b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final String f23944c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final String f23945d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final String f23946e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f23947f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f23948g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f23949h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f23950i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f23951j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f23952k;

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f23953l;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f23954m;

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f23955n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f23956o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f23957p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private static final List<a> f23958q;

    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.b f23959a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.b f23960b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.b f23961c;

        public a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar2, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar3) {
            l0.p(bVar, ProtectedSandApp.s("䔞"));
            l0.p(bVar2, ProtectedSandApp.s("䔟"));
            l0.p(bVar3, ProtectedSandApp.s("䔠"));
            this.f23959a = bVar;
            this.f23960b = bVar2;
            this.f23961c = bVar3;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f23959a;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b b() {
            return this.f23960b;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b c() {
            return this.f23961c;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b d() {
            return this.f23959a;
        }

        public boolean equals(@d5.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f23959a, aVar.f23959a) && l0.g(this.f23960b, aVar.f23960b) && l0.g(this.f23961c, aVar.f23961c);
        }

        public int hashCode() {
            return this.f23961c.hashCode() + ((this.f23960b.hashCode() + (this.f23959a.hashCode() * 31)) * 31);
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("䔡") + this.f23959a + ProtectedSandApp.s("䔢") + this.f23960b + ProtectedSandApp.s("䔣") + this.f23961c + ')';
        }
    }

    static {
        List<a> O;
        c cVar = new c();
        f23942a = cVar;
        StringBuilder sb = new StringBuilder();
        kotlin.reflect.jvm.internal.impl.builtins.functions.c cVar2 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.Function;
        sb.append(cVar2.getPackageFqName().toString());
        sb.append(org.apache.commons.io.k.f32026a);
        sb.append(cVar2.getClassNamePrefix());
        f23943b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        kotlin.reflect.jvm.internal.impl.builtins.functions.c cVar3 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.KFunction;
        sb2.append(cVar3.getPackageFqName().toString());
        sb2.append(org.apache.commons.io.k.f32026a);
        sb2.append(cVar3.getClassNamePrefix());
        f23944c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        kotlin.reflect.jvm.internal.impl.builtins.functions.c cVar4 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.SuspendFunction;
        sb3.append(cVar4.getPackageFqName().toString());
        sb3.append(org.apache.commons.io.k.f32026a);
        sb3.append(cVar4.getClassNamePrefix());
        f23945d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        kotlin.reflect.jvm.internal.impl.builtins.functions.c cVar5 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.KSuspendFunction;
        sb4.append(cVar5.getPackageFqName().toString());
        sb4.append(org.apache.commons.io.k.f32026a);
        sb4.append(cVar5.getClassNamePrefix());
        f23946e = sb4.toString();
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䔤")));
        l0.o(m5, ProtectedSandApp.s("䔥"));
        f23947f = m5;
        kotlin.reflect.jvm.internal.impl.name.c b6 = m5.b();
        l0.o(b6, ProtectedSandApp.s("䔦"));
        f23948g = b6;
        kotlin.reflect.jvm.internal.impl.name.i iVar = kotlin.reflect.jvm.internal.impl.name.i.f25623a;
        f23949h = iVar.k();
        f23950i = iVar.j();
        f23951j = cVar.g(Class.class);
        f23952k = new HashMap<>();
        f23953l = new HashMap<>();
        f23954m = new HashMap<>();
        f23955n = new HashMap<>();
        f23956o = new HashMap<>();
        f23957p = new HashMap<>();
        kotlin.reflect.jvm.internal.impl.name.b m6 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.T);
        l0.o(m6, ProtectedSandApp.s("䔧"));
        kotlin.reflect.jvm.internal.impl.name.c cVar6 = l.a.f24044b0;
        kotlin.reflect.jvm.internal.impl.name.c h5 = m6.h();
        kotlin.reflect.jvm.internal.impl.name.c h6 = m6.h();
        String s5 = ProtectedSandApp.s("䔨");
        l0.o(h6, s5);
        kotlin.reflect.jvm.internal.impl.name.c g5 = kotlin.reflect.jvm.internal.impl.name.e.g(cVar6, h6);
        kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(h5, g5, false);
        kotlin.reflect.jvm.internal.impl.name.b m7 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.S);
        l0.o(m7, ProtectedSandApp.s("䔩"));
        kotlin.reflect.jvm.internal.impl.name.c cVar7 = l.a.f24042a0;
        kotlin.reflect.jvm.internal.impl.name.c h7 = m7.h();
        kotlin.reflect.jvm.internal.impl.name.c h8 = m7.h();
        l0.o(h8, s5);
        kotlin.reflect.jvm.internal.impl.name.b bVar2 = new kotlin.reflect.jvm.internal.impl.name.b(h7, kotlin.reflect.jvm.internal.impl.name.e.g(cVar7, h8), false);
        kotlin.reflect.jvm.internal.impl.name.b m8 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.U);
        l0.o(m8, ProtectedSandApp.s("䔪"));
        kotlin.reflect.jvm.internal.impl.name.c cVar8 = l.a.f24046c0;
        kotlin.reflect.jvm.internal.impl.name.c h9 = m8.h();
        kotlin.reflect.jvm.internal.impl.name.c h10 = m8.h();
        l0.o(h10, s5);
        kotlin.reflect.jvm.internal.impl.name.b bVar3 = new kotlin.reflect.jvm.internal.impl.name.b(h9, kotlin.reflect.jvm.internal.impl.name.e.g(cVar8, h10), false);
        kotlin.reflect.jvm.internal.impl.name.b m9 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.V);
        l0.o(m9, ProtectedSandApp.s("䔫"));
        kotlin.reflect.jvm.internal.impl.name.c cVar9 = l.a.f24048d0;
        kotlin.reflect.jvm.internal.impl.name.c h11 = m9.h();
        kotlin.reflect.jvm.internal.impl.name.c h12 = m9.h();
        l0.o(h12, s5);
        kotlin.reflect.jvm.internal.impl.name.b bVar4 = new kotlin.reflect.jvm.internal.impl.name.b(h11, kotlin.reflect.jvm.internal.impl.name.e.g(cVar9, h12), false);
        kotlin.reflect.jvm.internal.impl.name.b m10 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.X);
        l0.o(m10, ProtectedSandApp.s("䔬"));
        kotlin.reflect.jvm.internal.impl.name.c cVar10 = l.a.f24052f0;
        kotlin.reflect.jvm.internal.impl.name.c h13 = m10.h();
        kotlin.reflect.jvm.internal.impl.name.c h14 = m10.h();
        l0.o(h14, s5);
        kotlin.reflect.jvm.internal.impl.name.b bVar5 = new kotlin.reflect.jvm.internal.impl.name.b(h13, kotlin.reflect.jvm.internal.impl.name.e.g(cVar10, h14), false);
        kotlin.reflect.jvm.internal.impl.name.b m11 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.W);
        l0.o(m11, ProtectedSandApp.s("䔭"));
        kotlin.reflect.jvm.internal.impl.name.c cVar11 = l.a.f24050e0;
        kotlin.reflect.jvm.internal.impl.name.c h15 = m11.h();
        kotlin.reflect.jvm.internal.impl.name.c h16 = m11.h();
        l0.o(h16, s5);
        kotlin.reflect.jvm.internal.impl.name.b bVar6 = new kotlin.reflect.jvm.internal.impl.name.b(h15, kotlin.reflect.jvm.internal.impl.name.e.g(cVar11, h16), false);
        kotlin.reflect.jvm.internal.impl.name.c cVar12 = l.a.Y;
        kotlin.reflect.jvm.internal.impl.name.b m12 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar12);
        l0.o(m12, ProtectedSandApp.s("䔮"));
        kotlin.reflect.jvm.internal.impl.name.c cVar13 = l.a.f24054g0;
        kotlin.reflect.jvm.internal.impl.name.c h17 = m12.h();
        kotlin.reflect.jvm.internal.impl.name.c h18 = m12.h();
        l0.o(h18, s5);
        kotlin.reflect.jvm.internal.impl.name.b bVar7 = new kotlin.reflect.jvm.internal.impl.name.b(h17, kotlin.reflect.jvm.internal.impl.name.e.g(cVar13, h18), false);
        kotlin.reflect.jvm.internal.impl.name.b d6 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar12).d(l.a.Z.g());
        l0.o(d6, ProtectedSandApp.s("䔯"));
        kotlin.reflect.jvm.internal.impl.name.c cVar14 = l.a.f24056h0;
        kotlin.reflect.jvm.internal.impl.name.c h19 = d6.h();
        kotlin.reflect.jvm.internal.impl.name.c h20 = d6.h();
        l0.o(h20, s5);
        O = a0.O(new a(cVar.g(Iterable.class), m6, bVar), new a(cVar.g(Iterator.class), m7, bVar2), new a(cVar.g(Collection.class), m8, bVar3), new a(cVar.g(List.class), m9, bVar4), new a(cVar.g(Set.class), m10, bVar5), new a(cVar.g(ListIterator.class), m11, bVar6), new a(cVar.g(Map.class), m12, bVar7), new a(cVar.g(Map.Entry.class), d6, new kotlin.reflect.jvm.internal.impl.name.b(h19, kotlin.reflect.jvm.internal.impl.name.e.g(cVar14, h20), false)));
        f23958q = O;
        cVar.f(Object.class, l.a.f24043b);
        cVar.f(String.class, l.a.f24055h);
        cVar.f(CharSequence.class, l.a.f24053g);
        cVar.e(Throwable.class, l.a.f24081u);
        cVar.f(Cloneable.class, l.a.f24047d);
        cVar.f(Number.class, l.a.f24075r);
        cVar.e(Comparable.class, l.a.f24083v);
        cVar.f(Enum.class, l.a.f24077s);
        cVar.e(Annotation.class, l.a.G);
        Iterator<a> it = O.iterator();
        while (it.hasNext()) {
            f23942a.d(it.next());
        }
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar : kotlin.reflect.jvm.internal.impl.resolve.jvm.e.values()) {
            c cVar15 = f23942a;
            kotlin.reflect.jvm.internal.impl.name.b m13 = kotlin.reflect.jvm.internal.impl.name.b.m(eVar.getWrapperFqName());
            l0.o(m13, ProtectedSandApp.s("䔰"));
            kotlin.reflect.jvm.internal.impl.builtins.i primitiveType = eVar.getPrimitiveType();
            l0.o(primitiveType, ProtectedSandApp.s("䔱"));
            kotlin.reflect.jvm.internal.impl.name.b m14 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.l.c(primitiveType));
            l0.o(m14, ProtectedSandApp.s("䔲"));
            cVar15.a(m13, m14);
        }
        for (kotlin.reflect.jvm.internal.impl.name.b bVar8 : kotlin.reflect.jvm.internal.impl.builtins.c.f23889a.a()) {
            c cVar16 = f23942a;
            kotlin.reflect.jvm.internal.impl.name.b m15 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䔳") + bVar8.j().h() + ProtectedSandApp.s("䔴")));
            l0.o(m15, ProtectedSandApp.s("䔵"));
            kotlin.reflect.jvm.internal.impl.name.b d7 = bVar8.d(kotlin.reflect.jvm.internal.impl.name.h.f25608d);
            l0.o(d7, ProtectedSandApp.s("䔶"));
            cVar16.a(m15, d7);
        }
        for (int i5 = 0; i5 < 23; i5++) {
            c cVar17 = f23942a;
            kotlin.reflect.jvm.internal.impl.name.b m16 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(s.a(ProtectedSandApp.s("䔷"), i5)));
            l0.o(m16, ProtectedSandApp.s("䔸"));
            cVar17.a(m16, kotlin.reflect.jvm.internal.impl.builtins.l.a(i5));
            cVar17.c(new kotlin.reflect.jvm.internal.impl.name.c(f23944c + i5), f23949h);
        }
        for (int i6 = 0; i6 < 22; i6++) {
            kotlin.reflect.jvm.internal.impl.builtins.functions.c cVar18 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.KSuspendFunction;
            f23942a.c(new kotlin.reflect.jvm.internal.impl.name.c((cVar18.getPackageFqName().toString() + org.apache.commons.io.k.f32026a + cVar18.getClassNamePrefix()) + i6), f23949h);
        }
        c cVar19 = f23942a;
        kotlin.reflect.jvm.internal.impl.name.c l5 = l.a.f24045c.l();
        l0.o(l5, ProtectedSandApp.s("䔹"));
        cVar19.c(l5, cVar19.g(Void.class));
    }

    private c() {
    }

    private final void a(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.b bVar2) {
        b(bVar, bVar2);
        kotlin.reflect.jvm.internal.impl.name.c b6 = bVar2.b();
        l0.o(b6, ProtectedSandApp.s("䔺"));
        c(b6, bVar);
    }

    private final void b(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.b bVar2) {
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> hashMap = f23952k;
        kotlin.reflect.jvm.internal.impl.name.d j5 = bVar.b().j();
        l0.o(j5, ProtectedSandApp.s("䔻"));
        hashMap.put(j5, bVar2);
    }

    private final void c(kotlin.reflect.jvm.internal.impl.name.c cVar, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> hashMap = f23953l;
        kotlin.reflect.jvm.internal.impl.name.d j5 = cVar.j();
        l0.o(j5, ProtectedSandApp.s("䔼"));
        hashMap.put(j5, bVar);
    }

    private final void d(a aVar) {
        kotlin.reflect.jvm.internal.impl.name.b a6 = aVar.a();
        kotlin.reflect.jvm.internal.impl.name.b b6 = aVar.b();
        kotlin.reflect.jvm.internal.impl.name.b c6 = aVar.c();
        a(a6, b6);
        kotlin.reflect.jvm.internal.impl.name.c b7 = c6.b();
        String s5 = ProtectedSandApp.s("䔽");
        l0.o(b7, s5);
        c(b7, a6);
        f23956o.put(c6, b6);
        f23957p.put(b6, c6);
        kotlin.reflect.jvm.internal.impl.name.c b8 = b6.b();
        l0.o(b8, ProtectedSandApp.s("䔾"));
        kotlin.reflect.jvm.internal.impl.name.c b9 = c6.b();
        l0.o(b9, s5);
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> hashMap = f23954m;
        kotlin.reflect.jvm.internal.impl.name.d j5 = c6.b().j();
        l0.o(j5, ProtectedSandApp.s("䔿"));
        hashMap.put(j5, b8);
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> hashMap2 = f23955n;
        kotlin.reflect.jvm.internal.impl.name.d j6 = b8.j();
        l0.o(j6, ProtectedSandApp.s("䕀"));
        hashMap2.put(j6, b9);
    }

    private final void e(Class<?> cls, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.name.b g5 = g(cls);
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        l0.o(m5, ProtectedSandApp.s("䕁"));
        a(g5, m5);
    }

    private final void f(Class<?> cls, kotlin.reflect.jvm.internal.impl.name.d dVar) {
        kotlin.reflect.jvm.internal.impl.name.c l5 = dVar.l();
        l0.o(l5, ProtectedSandApp.s("䕂"));
        e(cls, l5);
    }

    private final kotlin.reflect.jvm.internal.impl.name.b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(cls.getCanonicalName()));
            l0.o(m5, ProtectedSandApp.s("䕃"));
            return m5;
        }
        kotlin.reflect.jvm.internal.impl.name.b d6 = g(declaringClass).d(kotlin.reflect.jvm.internal.impl.name.f.p(cls.getSimpleName()));
        l0.o(d6, ProtectedSandApp.s("䕄"));
        return d6;
    }

    private final boolean j(kotlin.reflect.jvm.internal.impl.name.d dVar, String str) {
        String l5;
        boolean b52;
        Integer X0;
        String b6 = dVar.b();
        l0.o(b6, ProtectedSandApp.s("䕅"));
        l5 = h0.l5(b6, str, "");
        if (l5.length() > 0) {
            b52 = h0.b5(l5, '0', false, 2, null);
            if (!b52) {
                X0 = d0.X0(l5);
                return X0 != null && X0.intValue() >= 23;
            }
        }
        return false;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.c h() {
        return f23948g;
    }

    @d5.d
    public final List<a> i() {
        return f23958q;
    }

    public final boolean k(@d5.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f23954m.containsKey(dVar);
    }

    public final boolean l(@d5.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f23955n.containsKey(dVar);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.name.b m(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䕆"));
        return f23952k.get(cVar.j());
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.name.b n(@d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("䕇"));
        return j(dVar, f23943b) ? f23947f : j(dVar, f23945d) ? f23947f : j(dVar, f23944c) ? f23949h : j(dVar, f23946e) ? f23949h : f23953l.get(dVar);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.name.c o(@d5.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f23954m.get(dVar);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.name.c p(@d5.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f23955n.get(dVar);
    }
}
