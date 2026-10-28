package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.t4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: MultimapBuilder.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class s4<K0, V0> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f56392a = 8;

    /* compiled from: MultimapBuilder.java */
    class a extends k<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f56393b;

        a(int i4) {
            this.f56393b = i4;
        }

        @Override // com.google.common.collect.s4.k
        <K, V> Map<K, Collection<V>> c() {
            return d0.z(this.f56393b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    class b extends k<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f56394b;

        b(int i4) {
            this.f56394b = i4;
        }

        @Override // com.google.common.collect.s4.k
        <K, V> Map<K, Collection<V>> c() {
            return g0.i0(this.f56394b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    class c extends k<K0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f56395b;

        c(Comparator comparator) {
            this.f56395b = comparator;
        }

        @Override // com.google.common.collect.s4.k
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f56395b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    class d extends k<K0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f56396b;

        d(Class cls) {
            this.f56396b = cls;
        }

        @Override // com.google.common.collect.s4.k
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new EnumMap(this.f56396b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    private static final class e<V> implements com.google.common.base.u0<List<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final int f56397b;

        e(int i4) {
            this.f56397b = b0.b(i4, ProtectedSandApp.s("\uf547"));
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f56397b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    private static final class f<V extends Enum<V>> implements com.google.common.base.u0<Set<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final Class<V> f56398b;

        f(Class<V> cls) {
            cls.getClass();
            this.f56398b = cls;
        }

        public Set<V> a() {
            return EnumSet.noneOf(this.f56398b);
        }

        @Override // com.google.common.base.u0
        public Object get() {
            return EnumSet.noneOf(this.f56398b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    private static final class g<V> implements com.google.common.base.u0<Set<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final int f56399b;

        g(int i4) {
            this.f56399b = b0.b(i4, ProtectedSandApp.s("\uf548"));
        }

        public Set<V> a() {
            return e0.q(this.f56399b);
        }

        @Override // com.google.common.base.u0
        public Object get() {
            return e0.q(this.f56399b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    private static final class h<V> implements com.google.common.base.u0<Set<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final int f56400b;

        h(int i4) {
            this.f56400b = b0.b(i4, ProtectedSandApp.s("\uf549"));
        }

        public Set<V> a() {
            return h0.e0(this.f56400b);
        }

        @Override // com.google.common.base.u0
        public Object get() {
            return h0.e0(this.f56400b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    private enum i implements com.google.common.base.u0<List<?>> {
        INSTANCE;

        public static <V> com.google.common.base.u0<List<V>> instance() {
            return INSTANCE;
        }

        @Override // com.google.common.base.u0
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class j<K0, V0> extends s4<K0, V0> {
        j() {
        }

        @Override // com.google.common.collect.s4
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public abstract <K extends K0, V extends V0> k4<K, V> a();

        @Override // com.google.common.collect.s4
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> k4<K, V> b(r4<? extends K, ? extends V> r4Var) {
            return (k4) super.b(r4Var);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class k<K0> {

        /* renamed from: a, reason: collision with root package name */
        private static final int f56401a = 2;

        /* compiled from: MultimapBuilder.java */
        class a extends j<K0, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f56402b;

            a(int i4) {
                this.f56402b = i4;
            }

            @Override // com.google.common.collect.s4.j, com.google.common.collect.s4
            /* renamed from: j */
            public <K extends K0, V> k4<K, V> a() {
                return new t4.b(k.this.c(), new e(this.f56402b));
            }
        }

        /* compiled from: MultimapBuilder.java */
        class b extends j<K0, Object> {
            b() {
            }

            @Override // com.google.common.collect.s4.j, com.google.common.collect.s4
            /* renamed from: j */
            public <K extends K0, V> k4<K, V> a() {
                return new t4.b(k.this.c(), i.instance());
            }
        }

        /* compiled from: MultimapBuilder.java */
        class c extends l<K0, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f56405b;

            c(int i4) {
                this.f56405b = i4;
            }

            @Override // com.google.common.collect.s4.l, com.google.common.collect.s4
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V> c6<K, V> a() {
                return new t4.d(k.this.c(), new g(this.f56405b));
            }
        }

        /* compiled from: MultimapBuilder.java */
        class d extends l<K0, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f56407b;

            d(int i4) {
                this.f56407b = i4;
            }

            @Override // com.google.common.collect.s4.l, com.google.common.collect.s4
            /* renamed from: j */
            public <K extends K0, V> c6<K, V> a() {
                return new t4.d(k.this.c(), new h(this.f56407b));
            }
        }

        /* compiled from: MultimapBuilder.java */
        class e extends m<K0, V0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Comparator f56409b;

            e(Comparator comparator) {
                this.f56409b = comparator;
            }

            @Override // com.google.common.collect.s4.m, com.google.common.collect.s4.l
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V extends V0> n6<K, V> a() {
                return new t4.e(k.this.c(), new n(this.f56409b));
            }
        }

        /* compiled from: MultimapBuilder.java */
        class f extends l<K0, V0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Class f56411b;

            f(Class cls) {
                this.f56411b = cls;
            }

            @Override // com.google.common.collect.s4.l, com.google.common.collect.s4
            /* renamed from: j */
            public <K extends K0, V extends V0> c6<K, V> a() {
                return new t4.d(k.this.c(), new f(this.f56411b));
            }
        }

        k() {
        }

        public j<K0, Object> a() {
            return b(2);
        }

        public j<K0, Object> b(int i4) {
            b0.b(i4, ProtectedSandApp.s("\uf544"));
            return new a(i4);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();

        public <V0 extends Enum<V0>> l<K0, V0> d(Class<V0> cls) {
            com.google.common.base.l0.F(cls, ProtectedSandApp.s("\uf545"));
            return new f(cls);
        }

        public l<K0, Object> e() {
            return f(2);
        }

        public l<K0, Object> f(int i4) {
            b0.b(i4, ProtectedSandApp.s("\uf544"));
            return new c(i4);
        }

        public l<K0, Object> g() {
            return h(2);
        }

        public l<K0, Object> h(int i4) {
            b0.b(i4, ProtectedSandApp.s("\uf544"));
            return new d(i4);
        }

        public j<K0, Object> i() {
            return new b();
        }

        public m<K0, Comparable> j() {
            return k(x4.f56632f);
        }

        public <V0> m<K0, V0> k(Comparator<V0> comparator) {
            com.google.common.base.l0.F(comparator, ProtectedSandApp.s("\uf546"));
            return new e(comparator);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class l<K0, V0> extends s4<K0, V0> {
        l() {
        }

        @Override // com.google.common.collect.s4
        /* renamed from: j */
        public abstract <K extends K0, V extends V0> c6<K, V> a();

        @Override // com.google.common.collect.s4
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> c6<K, V> b(r4<? extends K, ? extends V> r4Var) {
            return (c6) super.b(r4Var);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class m<K0, V0> extends l<K0, V0> {
        m() {
        }

        @Override // com.google.common.collect.s4.l
        /* renamed from: l */
        public abstract <K extends K0, V extends V0> n6<K, V> a();

        @Override // com.google.common.collect.s4.l
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> n6<K, V> b(r4<? extends K, ? extends V> r4Var) {
            return (n6) super.b(r4Var);
        }
    }

    /* compiled from: MultimapBuilder.java */
    private static final class n<V> implements com.google.common.base.u0<SortedSet<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final Comparator<? super V> f56413b;

        n(Comparator<? super V> comparator) {
            comparator.getClass();
            this.f56413b = comparator;
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> get() {
            return new TreeSet(this.f56413b);
        }
    }

    private s4() {
    }

    public static <K0 extends Enum<K0>> k<K0> c(Class<K0> cls) {
        cls.getClass();
        return new d(cls);
    }

    public static k<Object> d() {
        return e(8);
    }

    public static k<Object> e(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf54b"));
        return new a(i4);
    }

    public static k<Object> f() {
        return g(8);
    }

    public static k<Object> g(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf54b"));
        return new b(i4);
    }

    public static k<Comparable> h() {
        return i(x4.f56632f);
    }

    public static <K0> k<K0> i(Comparator<K0> comparator) {
        comparator.getClass();
        return new c(comparator);
    }

    public abstract <K extends K0, V extends V0> r4<K, V> a();

    public <K extends K0, V extends V0> r4<K, V> b(r4<? extends K, ? extends V> r4Var) {
        r4<K, V> a5 = a();
        a5.n0(r4Var);
        return a5;
    }

    s4(a aVar) {
    }
}
