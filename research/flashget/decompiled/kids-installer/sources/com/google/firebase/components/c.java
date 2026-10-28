package com.google.firebase.components;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes2.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f15338a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b0<? super T>> f15339b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<r> f15340c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15341d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15342e;

    /* renamed from: f, reason: collision with root package name */
    private final g<T> f15343f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f15344g;

    private static /* synthetic */ Object A(Object obj, d dVar) {
        return obj;
    }

    @Deprecated
    public static <T> c<T> B(Class<T> cls, T t5) {
        return h(cls).f(new com.google.firebase.components.b(t5)).d();
    }

    @SafeVarargs
    public static <T> c<T> C(T t5, b0<T> b0Var, b0<? super T>... b0VarArr) {
        return g(b0Var, b0VarArr).f(new com.google.firebase.components.b(t5)).d();
    }

    @SafeVarargs
    public static <T> c<T> D(T t5, Class<T> cls, Class<? super T>... clsArr) {
        return i(cls, clsArr).f(new com.google.firebase.components.b(t5)).d();
    }

    public static /* synthetic */ Object a(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object e(Object obj, d dVar) {
        return obj;
    }

    public static <T> b<T> f(b0<T> b0Var) {
        return new b<>(b0Var, new b0[0]);
    }

    @SafeVarargs
    public static <T> b<T> g(b0<T> b0Var, b0<? super T>... b0VarArr) {
        return new b<>(b0Var, b0VarArr);
    }

    public static <T> b<T> h(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> i(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> c<T> o(T t5, b0<T> b0Var) {
        return q(b0Var).f(new com.google.firebase.components.b(t5)).d();
    }

    public static <T> c<T> p(T t5, Class<T> cls) {
        return r(cls).f(new com.google.firebase.components.b(t5)).d();
    }

    public static <T> b<T> q(b0<T> b0Var) {
        return b.a(f(b0Var));
    }

    public static <T> b<T> r(Class<T> cls) {
        return b.a(h(cls));
    }

    private static /* synthetic */ Object w(Object obj, d dVar) {
        return obj;
    }

    private static /* synthetic */ Object x(Object obj, d dVar) {
        return obj;
    }

    private static /* synthetic */ Object y(Object obj, d dVar) {
        return obj;
    }

    private static /* synthetic */ Object z(Object obj, d dVar) {
        return obj;
    }

    public c<T> E(g<T> gVar) {
        return new c<>(this.f15338a, this.f15339b, this.f15340c, this.f15341d, this.f15342e, gVar, this.f15344g);
    }

    public Set<r> j() {
        return this.f15340c;
    }

    public g<T> k() {
        return this.f15343f;
    }

    @q0
    public String l() {
        return this.f15338a;
    }

    public Set<b0<? super T>> m() {
        return this.f15339b;
    }

    public Set<Class<?>> n() {
        return this.f15344g;
    }

    public boolean s() {
        return this.f15341d == 1;
    }

    public boolean t() {
        return this.f15341d == 2;
    }

    public String toString() {
        return ProtectedSandApp.s("᎑") + Arrays.toString(this.f15339b.toArray()) + ProtectedSandApp.s("᎒") + this.f15341d + ProtectedSandApp.s("᎓") + this.f15342e + ProtectedSandApp.s("᎔") + Arrays.toString(this.f15340c.toArray()) + ProtectedSandApp.s("᎕");
    }

    public boolean u() {
        return this.f15341d == 0;
    }

    public boolean v() {
        return this.f15342e == 0;
    }

    /* compiled from: Component.java */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f15345a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b0<? super T>> f15346b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<r> f15347c;

        /* renamed from: d, reason: collision with root package name */
        private int f15348d;

        /* renamed from: e, reason: collision with root package name */
        private int f15349e;

        /* renamed from: f, reason: collision with root package name */
        private g<T> f15350f;

        /* renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f15351g;

        static b a(b bVar) {
            bVar.f15349e = 1;
            return bVar;
        }

        @x1.a
        private b<T> g() {
            this.f15349e = 1;
            return this;
        }

        @x1.a
        private b<T> j(int i5) {
            a0.d(this.f15348d == 0, ProtectedSandApp.s("ᎌ"));
            this.f15348d = i5;
            return this;
        }

        private void k(b0<?> b0Var) {
            a0.a(!this.f15346b.contains(b0Var), ProtectedSandApp.s("ᎍ"));
        }

        @x1.a
        public b<T> b(r rVar) {
            a0.c(rVar, ProtectedSandApp.s("ᎎ"));
            k(rVar.d());
            this.f15347c.add(rVar);
            return this;
        }

        @x1.a
        public b<T> c() {
            return j(1);
        }

        public c<T> d() {
            a0.d(this.f15350f != null, ProtectedSandApp.s("ᎏ"));
            return new c<>(this.f15345a, new HashSet(this.f15346b), new HashSet(this.f15347c), this.f15348d, this.f15349e, this.f15350f, this.f15351g);
        }

        @x1.a
        public b<T> e() {
            return j(2);
        }

        @x1.a
        public b<T> f(g<T> gVar) {
            this.f15350f = (g) a0.c(gVar, ProtectedSandApp.s("᎐"));
            return this;
        }

        public b<T> h(@o0 String str) {
            this.f15345a = str;
            return this;
        }

        @x1.a
        public b<T> i(Class<?> cls) {
            this.f15351g.add(cls);
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f15345a = null;
            HashSet hashSet = new HashSet();
            this.f15346b = hashSet;
            this.f15347c = new HashSet();
            this.f15348d = 0;
            this.f15349e = 0;
            this.f15351g = new HashSet();
            String s5 = ProtectedSandApp.s("ᎋ");
            a0.c(cls, s5);
            hashSet.add(b0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                a0.c(cls2, s5);
                this.f15346b.add(b0.b(cls2));
            }
        }

        @SafeVarargs
        private b(b0<T> b0Var, b0<? super T>... b0VarArr) {
            this.f15345a = null;
            HashSet hashSet = new HashSet();
            this.f15346b = hashSet;
            this.f15347c = new HashSet();
            this.f15348d = 0;
            this.f15349e = 0;
            this.f15351g = new HashSet();
            String s5 = ProtectedSandApp.s("ᎊ");
            a0.c(b0Var, s5);
            hashSet.add(b0Var);
            for (b0<? super T> b0Var2 : b0VarArr) {
                a0.c(b0Var2, s5);
            }
            Collections.addAll(this.f15346b, b0VarArr);
        }
    }

    private c(@q0 String str, Set<b0<? super T>> set, Set<r> set2, int i5, int i6, g<T> gVar, Set<Class<?>> set3) {
        this.f15338a = str;
        this.f15339b = Collections.unmodifiableSet(set);
        this.f15340c = Collections.unmodifiableSet(set2);
        this.f15341d = i5;
        this.f15342e = i6;
        this.f15343f = gVar;
        this.f15344g = Collections.unmodifiableSet(set3);
    }
}
