package com.google.firebase.components;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes6.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f58415a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b0<? super T>> f58416b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<r> f58417c;

    /* renamed from: d, reason: collision with root package name */
    private final int f58418d;

    /* renamed from: e, reason: collision with root package name */
    private final int f58419e;

    /* renamed from: f, reason: collision with root package name */
    private final g<T> f58420f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f58421g;

    private static /* synthetic */ Object A(Object obj, d dVar) {
        return obj;
    }

    @Deprecated
    public static <T> c<T> B(Class<T> cls, T t4) {
        return h(cls).f(new com.google.firebase.components.b(t4)).d();
    }

    @SafeVarargs
    public static <T> c<T> C(T t4, b0<T> b0Var, b0<? super T>... b0VarArr) {
        return g(b0Var, b0VarArr).f(new com.google.firebase.components.b(t4)).d();
    }

    @SafeVarargs
    public static <T> c<T> D(T t4, Class<T> cls, Class<? super T>... clsArr) {
        return i(cls, clsArr).f(new com.google.firebase.components.b(t4)).d();
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

    public static <T> c<T> o(T t4, b0<T> b0Var) {
        return q(b0Var).f(new com.google.firebase.components.b(t4)).d();
    }

    public static <T> c<T> p(T t4, Class<T> cls) {
        return r(cls).f(new com.google.firebase.components.b(t4)).d();
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
        return new c<>(this.f58415a, this.f58416b, this.f58417c, this.f58418d, this.f58419e, gVar, this.f58421g);
    }

    public Set<r> j() {
        return this.f58417c;
    }

    public g<T> k() {
        return this.f58420f;
    }

    @q0
    public String l() {
        return this.f58415a;
    }

    public Set<b0<? super T>> m() {
        return this.f58416b;
    }

    public Set<Class<?>> n() {
        return this.f58421g;
    }

    public boolean s() {
        return this.f58418d == 1;
    }

    public boolean t() {
        return this.f58418d == 2;
    }

    public String toString() {
        return ProtectedSandApp.s("ﭪ") + Arrays.toString(this.f58416b.toArray()) + ProtectedSandApp.s("ﭫ") + this.f58418d + ProtectedSandApp.s("ﭬ") + this.f58419e + ProtectedSandApp.s("ﭭ") + Arrays.toString(this.f58417c.toArray()) + ProtectedSandApp.s("ﭮ");
    }

    public boolean u() {
        return this.f58418d == 0;
    }

    public boolean v() {
        return this.f58419e == 0;
    }

    /* compiled from: Component.java */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f58422a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b0<? super T>> f58423b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<r> f58424c;

        /* renamed from: d, reason: collision with root package name */
        private int f58425d;

        /* renamed from: e, reason: collision with root package name */
        private int f58426e;

        /* renamed from: f, reason: collision with root package name */
        private g<T> f58427f;

        /* renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f58428g;

        static b a(b bVar) {
            bVar.f58426e = 1;
            return bVar;
        }

        @f9.a
        private b<T> g() {
            this.f58426e = 1;
            return this;
        }

        @f9.a
        private b<T> j(int i4) {
            a0.d(this.f58425d == 0, ProtectedSandApp.s("ﭥ"));
            this.f58425d = i4;
            return this;
        }

        private void k(b0<?> b0Var) {
            a0.a(!this.f58423b.contains(b0Var), ProtectedSandApp.s("ﭦ"));
        }

        @f9.a
        public b<T> b(r rVar) {
            a0.c(rVar, ProtectedSandApp.s("ﭧ"));
            k(rVar.d());
            this.f58424c.add(rVar);
            return this;
        }

        @f9.a
        public b<T> c() {
            return j(1);
        }

        public c<T> d() {
            a0.d(this.f58427f != null, ProtectedSandApp.s("ﭨ"));
            return new c<>(this.f58422a, new HashSet(this.f58423b), new HashSet(this.f58424c), this.f58425d, this.f58426e, this.f58427f, this.f58428g);
        }

        @f9.a
        public b<T> e() {
            return j(2);
        }

        @f9.a
        public b<T> f(g<T> gVar) {
            this.f58427f = (g) a0.c(gVar, ProtectedSandApp.s("ﭩ"));
            return this;
        }

        public b<T> h(@o0 String str) {
            this.f58422a = str;
            return this;
        }

        @f9.a
        public b<T> i(Class<?> cls) {
            this.f58428g.add(cls);
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f58422a = null;
            HashSet hashSet = new HashSet();
            this.f58423b = hashSet;
            this.f58424c = new HashSet();
            this.f58425d = 0;
            this.f58426e = 0;
            this.f58428g = new HashSet();
            String s4 = ProtectedSandApp.s("ﭤ");
            a0.c(cls, s4);
            hashSet.add(b0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                a0.c(cls2, s4);
                this.f58423b.add(b0.b(cls2));
            }
        }

        @SafeVarargs
        private b(b0<T> b0Var, b0<? super T>... b0VarArr) {
            this.f58422a = null;
            HashSet hashSet = new HashSet();
            this.f58423b = hashSet;
            this.f58424c = new HashSet();
            this.f58425d = 0;
            this.f58426e = 0;
            this.f58428g = new HashSet();
            String s4 = ProtectedSandApp.s("ﭤ");
            a0.c(b0Var, s4);
            hashSet.add(b0Var);
            for (b0<? super T> b0Var2 : b0VarArr) {
                a0.c(b0Var2, s4);
            }
            Collections.addAll(this.f58423b, b0VarArr);
        }
    }

    private c(@q0 String str, Set<b0<? super T>> set, Set<r> set2, int i4, int i5, g<T> gVar, Set<Class<?>> set3) {
        this.f58415a = str;
        this.f58416b = Collections.unmodifiableSet(set);
        this.f58417c = Collections.unmodifiableSet(set2);
        this.f58418d = i4;
        this.f58419e = i5;
        this.f58420f = gVar;
        this.f58421g = Collections.unmodifiableSet(set3);
    }
}
