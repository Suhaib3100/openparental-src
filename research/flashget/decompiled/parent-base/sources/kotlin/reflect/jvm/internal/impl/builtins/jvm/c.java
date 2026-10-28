package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.text.v;

/* compiled from: JavaToKotlinClassMap.kt */
@r1({"SMAP\nJavaToKotlinClassMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n49#1,2:221\n49#1,2:223\n49#1,2:225\n49#1,2:227\n49#1,2:229\n49#1,2:231\n49#1,2:233\n49#1,2:235\n1#2:220\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n*L\n54#1:221,2\n55#1:223,2\n56#1:225,2\n57#1:227,2\n58#1:229,2\n59#1:231,2\n60#1:233,2\n61#1:235,2\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c f75734a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f75735b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f75736c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f75737d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f75738e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f75739f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f75740g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f75741h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f75742i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f75743j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f75744k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f75745l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f75746m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f75747n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f75748o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f75749p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final List<a> f75750q;

    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.b f75751a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.b f75752b;

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.b f75753c;

        public a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar2, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar3) {
            l0.p(bVar, ProtectedSandApp.s("椶\u0001"));
            l0.p(bVar2, ProtectedSandApp.s("椷\u0001"));
            l0.p(bVar3, ProtectedSandApp.s("椸\u0001"));
            this.f75751a = bVar;
            this.f75752b = bVar2;
            this.f75753c = bVar3;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f75751a;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b b() {
            return this.f75752b;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b c() {
            return this.f75753c;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b d() {
            return this.f75751a;
        }

        public boolean equals(@fg.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f75751a, aVar.f75751a) && l0.g(this.f75752b, aVar.f75752b) && l0.g(this.f75753c, aVar.f75753c);
        }

        public int hashCode() {
            return this.f75753c.hashCode() + ((this.f75752b.hashCode() + (this.f75751a.hashCode() * 31)) * 31);
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("椹\u0001") + this.f75751a + ProtectedSandApp.s("椺\u0001") + this.f75752b + ProtectedSandApp.s("椻\u0001") + this.f75753c + ')';
        }
    }

    static {
        c cVar = new c();
        f75734a = cVar;
        StringBuilder sb = new StringBuilder();
        f.a aVar = f.a.f75688e;
        sb.append(aVar.b().toString());
        sb.append('.');
        sb.append(aVar.a());
        f75735b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        f.b bVar = f.b.f75689e;
        sb2.append(bVar.b().toString());
        sb2.append('.');
        sb2.append(bVar.a());
        f75736c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        f.d dVar = f.d.f75691e;
        sb3.append(dVar.b().toString());
        sb3.append('.');
        sb3.append(dVar.a());
        f75737d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        f.c cVar2 = f.c.f75690e;
        sb4.append(cVar2.b().toString());
        sb4.append('.');
        sb4.append(cVar2.a());
        f75738e = sb4.toString();
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("椼\u0001")));
        String s4 = ProtectedSandApp.s("椽\u0001");
        l0.o(m4, s4);
        f75739f = m4;
        kotlin.reflect.jvm.internal.impl.name.c b5 = m4.b();
        l0.o(b5, ProtectedSandApp.s("椾\u0001"));
        f75740g = b5;
        kotlin.reflect.jvm.internal.impl.name.i iVar = kotlin.reflect.jvm.internal.impl.name.i.f77605a;
        f75741h = iVar.k();
        f75742i = iVar.j();
        f75743j = cVar.g(Class.class);
        f75744k = new HashMap<>();
        f75745l = new HashMap<>();
        f75746m = new HashMap<>();
        f75747n = new HashMap<>();
        f75748o = new HashMap<>();
        f75749p = new HashMap<>();
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.U);
        l0.o(m5, s4);
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = l.a.f75843c0;
        kotlin.reflect.jvm.internal.impl.name.c h4 = m5.h();
        kotlin.reflect.jvm.internal.impl.name.c h5 = m5.h();
        String s5 = ProtectedSandApp.s("椿\u0001");
        l0.o(h5, s5);
        a aVar2 = new a(cVar.g(Iterable.class), m5, new kotlin.reflect.jvm.internal.impl.name.b(h4, kotlin.reflect.jvm.internal.impl.name.e.g(cVar3, h5), false));
        kotlin.reflect.jvm.internal.impl.name.b m6 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.T);
        l0.o(m6, s4);
        kotlin.reflect.jvm.internal.impl.name.c cVar4 = l.a.f75841b0;
        kotlin.reflect.jvm.internal.impl.name.c h6 = m6.h();
        kotlin.reflect.jvm.internal.impl.name.c h7 = m6.h();
        l0.o(h7, s5);
        a aVar3 = new a(cVar.g(Iterator.class), m6, new kotlin.reflect.jvm.internal.impl.name.b(h6, kotlin.reflect.jvm.internal.impl.name.e.g(cVar4, h7), false));
        kotlin.reflect.jvm.internal.impl.name.b m7 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.V);
        l0.o(m7, s4);
        kotlin.reflect.jvm.internal.impl.name.c cVar5 = l.a.f75845d0;
        kotlin.reflect.jvm.internal.impl.name.c h10 = m7.h();
        kotlin.reflect.jvm.internal.impl.name.c h11 = m7.h();
        l0.o(h11, s5);
        a aVar4 = new a(cVar.g(Collection.class), m7, new kotlin.reflect.jvm.internal.impl.name.b(h10, kotlin.reflect.jvm.internal.impl.name.e.g(cVar5, h11), false));
        kotlin.reflect.jvm.internal.impl.name.b m10 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.W);
        l0.o(m10, s4);
        kotlin.reflect.jvm.internal.impl.name.c cVar6 = l.a.f75847e0;
        kotlin.reflect.jvm.internal.impl.name.c h12 = m10.h();
        kotlin.reflect.jvm.internal.impl.name.c h13 = m10.h();
        l0.o(h13, s5);
        a aVar5 = new a(cVar.g(List.class), m10, new kotlin.reflect.jvm.internal.impl.name.b(h12, kotlin.reflect.jvm.internal.impl.name.e.g(cVar6, h13), false));
        kotlin.reflect.jvm.internal.impl.name.b m11 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.Y);
        l0.o(m11, s4);
        kotlin.reflect.jvm.internal.impl.name.c cVar7 = l.a.f75851g0;
        kotlin.reflect.jvm.internal.impl.name.c h14 = m11.h();
        kotlin.reflect.jvm.internal.impl.name.c h15 = m11.h();
        l0.o(h15, s5);
        a aVar6 = new a(cVar.g(Set.class), m11, new kotlin.reflect.jvm.internal.impl.name.b(h14, kotlin.reflect.jvm.internal.impl.name.e.g(cVar7, h15), false));
        kotlin.reflect.jvm.internal.impl.name.b m12 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.X);
        l0.o(m12, s4);
        kotlin.reflect.jvm.internal.impl.name.c cVar8 = l.a.f75849f0;
        kotlin.reflect.jvm.internal.impl.name.c h16 = m12.h();
        kotlin.reflect.jvm.internal.impl.name.c h17 = m12.h();
        l0.o(h17, s5);
        a aVar7 = new a(cVar.g(ListIterator.class), m12, new kotlin.reflect.jvm.internal.impl.name.b(h16, kotlin.reflect.jvm.internal.impl.name.e.g(cVar8, h17), false));
        kotlin.reflect.jvm.internal.impl.name.c cVar9 = l.a.Z;
        kotlin.reflect.jvm.internal.impl.name.b m13 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar9);
        l0.o(m13, s4);
        kotlin.reflect.jvm.internal.impl.name.c cVar10 = l.a.f75853h0;
        kotlin.reflect.jvm.internal.impl.name.c h18 = m13.h();
        kotlin.reflect.jvm.internal.impl.name.c h19 = m13.h();
        l0.o(h19, s5);
        a aVar8 = new a(cVar.g(Map.class), m13, new kotlin.reflect.jvm.internal.impl.name.b(h18, kotlin.reflect.jvm.internal.impl.name.e.g(cVar10, h19), false));
        kotlin.reflect.jvm.internal.impl.name.b d5 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar9).d(l.a.f75839a0.g());
        String s6 = ProtectedSandApp.s("楀\u0001");
        l0.o(d5, s6);
        kotlin.reflect.jvm.internal.impl.name.c cVar11 = l.a.f75855i0;
        kotlin.reflect.jvm.internal.impl.name.c h20 = d5.h();
        kotlin.reflect.jvm.internal.impl.name.c h21 = d5.h();
        l0.o(h21, s5);
        kotlin.reflect.jvm.internal.impl.name.c g4 = kotlin.reflect.jvm.internal.impl.name.e.g(cVar11, h21);
        List<a> O = w.O(aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new a(cVar.g(Map.Entry.class), d5, new kotlin.reflect.jvm.internal.impl.name.b(h20, g4, false)));
        f75750q = O;
        cVar.f(Object.class, l.a.f75840b);
        cVar.f(String.class, l.a.f75852h);
        cVar.f(CharSequence.class, l.a.f75850g);
        cVar.e(Throwable.class, l.a.f75878u);
        cVar.f(Cloneable.class, l.a.f75844d);
        cVar.f(Number.class, l.a.f75872r);
        cVar.e(Comparable.class, l.a.f75880v);
        cVar.f(Enum.class, l.a.f75874s);
        cVar.e(Annotation.class, l.a.G);
        Iterator<a> it = O.iterator();
        while (it.hasNext()) {
            f75734a.d(it.next());
        }
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar : kotlin.reflect.jvm.internal.impl.resolve.jvm.e.values()) {
            c cVar12 = f75734a;
            kotlin.reflect.jvm.internal.impl.name.b m14 = kotlin.reflect.jvm.internal.impl.name.b.m(eVar.getWrapperFqName());
            l0.o(m14, s4);
            kotlin.reflect.jvm.internal.impl.builtins.i primitiveType = eVar.getPrimitiveType();
            l0.o(primitiveType, ProtectedSandApp.s("楁\u0001"));
            kotlin.reflect.jvm.internal.impl.name.b m15 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.l.c(primitiveType));
            l0.o(m15, s4);
            cVar12.a(m14, m15);
        }
        for (kotlin.reflect.jvm.internal.impl.name.b bVar2 : kotlin.reflect.jvm.internal.impl.builtins.c.f75665a.a()) {
            c cVar13 = f75734a;
            kotlin.reflect.jvm.internal.impl.name.b m16 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("楂\u0001") + bVar2.j().b() + ProtectedSandApp.s("楃\u0001")));
            l0.o(m16, s4);
            kotlin.reflect.jvm.internal.impl.name.b d6 = bVar2.d(kotlin.reflect.jvm.internal.impl.name.h.f77591d);
            l0.o(d6, s6);
            cVar13.a(m16, d6);
        }
        for (int i4 = 0; i4 < 23; i4++) {
            c cVar14 = f75734a;
            kotlin.reflect.jvm.internal.impl.name.b m17 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(android.support.v4.media.a.a(ProtectedSandApp.s("楄\u0001"), i4)));
            l0.o(m17, s4);
            cVar14.a(m17, kotlin.reflect.jvm.internal.impl.builtins.l.a(i4));
            cVar14.c(new kotlin.reflect.jvm.internal.impl.name.c(f75736c + i4), f75741h);
        }
        for (int i5 = 0; i5 < 22; i5++) {
            f.c cVar15 = f.c.f75690e;
            f75734a.c(new kotlin.reflect.jvm.internal.impl.name.c((cVar15.b().toString() + '.' + cVar15.a()) + i5), f75741h);
        }
        c cVar16 = f75734a;
        kotlin.reflect.jvm.internal.impl.name.c l4 = l.a.f75842c.l();
        l0.o(l4, ProtectedSandApp.s("楅\u0001"));
        cVar16.c(l4, cVar16.g(Void.class));
    }

    private c() {
    }

    private final void a(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.b bVar2) {
        b(bVar, bVar2);
        kotlin.reflect.jvm.internal.impl.name.c b5 = bVar2.b();
        l0.o(b5, ProtectedSandApp.s("椾\u0001"));
        c(b5, bVar);
    }

    private final void b(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.b bVar2) {
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> hashMap = f75744k;
        kotlin.reflect.jvm.internal.impl.name.d j4 = bVar.b().j();
        l0.o(j4, ProtectedSandApp.s("楆\u0001"));
        hashMap.put(j4, bVar2);
    }

    private final void c(kotlin.reflect.jvm.internal.impl.name.c cVar, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> hashMap = f75745l;
        kotlin.reflect.jvm.internal.impl.name.d j4 = cVar.j();
        l0.o(j4, ProtectedSandApp.s("楆\u0001"));
        hashMap.put(j4, bVar);
    }

    private final void d(a aVar) {
        kotlin.reflect.jvm.internal.impl.name.b a5 = aVar.a();
        kotlin.reflect.jvm.internal.impl.name.b b5 = aVar.b();
        kotlin.reflect.jvm.internal.impl.name.b c5 = aVar.c();
        a(a5, b5);
        kotlin.reflect.jvm.internal.impl.name.c b6 = c5.b();
        String s4 = ProtectedSandApp.s("椾\u0001");
        l0.o(b6, s4);
        c(b6, a5);
        f75748o.put(c5, b5);
        f75749p.put(b5, c5);
        kotlin.reflect.jvm.internal.impl.name.c b7 = b5.b();
        l0.o(b7, s4);
        kotlin.reflect.jvm.internal.impl.name.c b10 = c5.b();
        l0.o(b10, s4);
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> hashMap = f75746m;
        kotlin.reflect.jvm.internal.impl.name.d j4 = c5.b().j();
        String s5 = ProtectedSandApp.s("楆\u0001");
        l0.o(j4, s5);
        hashMap.put(j4, b7);
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> hashMap2 = f75747n;
        kotlin.reflect.jvm.internal.impl.name.d j5 = b7.j();
        l0.o(j5, s5);
        hashMap2.put(j5, b10);
    }

    private final void e(Class<?> cls, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.name.b g4 = g(cls);
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        l0.o(m4, ProtectedSandApp.s("椽\u0001"));
        a(g4, m4);
    }

    private final void f(Class<?> cls, kotlin.reflect.jvm.internal.impl.name.d dVar) {
        kotlin.reflect.jvm.internal.impl.name.c l4 = dVar.l();
        l0.o(l4, ProtectedSandApp.s("楅\u0001"));
        e(cls, l4);
    }

    private final kotlin.reflect.jvm.internal.impl.name.b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(cls.getCanonicalName()));
            l0.o(m4, ProtectedSandApp.s("椽\u0001"));
            return m4;
        }
        kotlin.reflect.jvm.internal.impl.name.b d5 = g(declaringClass).d(kotlin.reflect.jvm.internal.impl.name.f.f(cls.getSimpleName()));
        l0.o(d5, ProtectedSandApp.s("楀\u0001"));
        return d5;
    }

    private final boolean j(kotlin.reflect.jvm.internal.impl.name.d dVar, String str) {
        Integer X0;
        String b5 = dVar.b();
        l0.o(b5, ProtectedSandApp.s("楇\u0001"));
        String l5 = v.l5(b5, str, "");
        return l5.length() > 0 && !v.b5(l5, '0', false, 2, null) && (X0 = v.X0(l5)) != null && X0.intValue() >= 23;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.c h() {
        return f75740g;
    }

    @fg.l
    public final List<a> i() {
        return f75750q;
    }

    public final boolean k(@fg.m kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f75746m.containsKey(dVar);
    }

    public final boolean l(@fg.m kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f75747n.containsKey(dVar);
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.name.b m(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("楈\u0001"));
        return f75744k.get(cVar.j());
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.name.b n(@fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("楉\u0001"));
        return j(dVar, f75735b) ? f75739f : j(dVar, f75737d) ? f75739f : j(dVar, f75736c) ? f75741h : j(dVar, f75738e) ? f75741h : f75745l.get(dVar);
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.name.c o(@fg.m kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f75746m.get(dVar);
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.name.c p(@fg.m kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f75747n.get(dVar);
    }
}
