package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Predicates.java */
@o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class n0 {

    /* compiled from: Predicates.java */
    private static class b<T> implements m0<T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54972c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final List<? extends m0<? super T>> f54973b;

        @Override // com.google.common.base.m0
        public boolean apply(@i0 T t4) {
            for (int i4 = 0; i4 < this.f54973b.size(); i4++) {
                if (!this.f54973b.get(i4).apply(t4)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof b) {
                return this.f54973b.equals(((b) obj).f54973b);
            }
            return false;
        }

        public int hashCode() {
            return this.f54973b.hashCode() + 306654252;
        }

        public String toString() {
            return n0.w(ProtectedSandApp.s("\uf313"), this.f54973b);
        }

        private b(List<? extends m0<? super T>> list) {
            this.f54973b = list;
        }
    }

    /* compiled from: Predicates.java */
    private static class c<A, B> implements m0<A>, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f54974d = 0;

        /* renamed from: b, reason: collision with root package name */
        final m0<B> f54975b;

        /* renamed from: c, reason: collision with root package name */
        final x<A, ? extends B> f54976c;

        @Override // com.google.common.base.m0
        public boolean apply(@i0 A a5) {
            return this.f54975b.apply(this.f54976c.apply(a5));
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f54976c.equals(cVar.f54976c) && this.f54975b.equals(cVar.f54975b);
        }

        public int hashCode() {
            return this.f54976c.hashCode() ^ this.f54975b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54975b);
            String valueOf2 = String.valueOf(this.f54976c);
            return com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 2, valueOf, ProtectedSandApp.s("\uf314"), valueOf2, ProtectedSandApp.s("\uf315"));
        }

        private c(m0<B> m0Var, x<A, ? extends B> xVar) {
            m0Var.getClass();
            this.f54975b = m0Var;
            xVar.getClass();
            this.f54976c = xVar;
        }
    }

    /* compiled from: Predicates.java */
    @d9.c
    private static class d extends e {

        /* renamed from: d, reason: collision with root package name */
        private static final long f54977d = 0;

        d(String str) {
            super(k0.b(str));
        }

        @Override // com.google.common.base.n0.e
        public String toString() {
            String e4 = this.f54979b.e();
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(e4, 28), ProtectedSandApp.s("\uf31a"), e4, ProtectedSandApp.s("\uf31b"));
        }
    }

    /* compiled from: Predicates.java */
    @d9.c
    private static class e implements m0<CharSequence>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54978c = 0;

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.base.l f54979b;

        e(com.google.common.base.l lVar) {
            lVar.getClass();
            this.f54979b = lVar;
        }

        @Override // com.google.common.base.m0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(CharSequence charSequence) {
            return this.f54979b.d(charSequence).b();
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return f0.a(this.f54979b.e(), eVar.f54979b.e()) && this.f54979b.b() == eVar.f54979b.b();
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f54979b.e(), Integer.valueOf(this.f54979b.b())});
        }

        public String toString() {
            String bVar = d0.c(this.f54979b).f(ProtectedSandApp.s("\uf316"), this.f54979b.e()).d(ProtectedSandApp.s("\uf317"), this.f54979b.b()).toString();
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(bVar, 21), ProtectedSandApp.s("\uf318"), bVar, ProtectedSandApp.s("\uf319"));
        }
    }

    /* compiled from: Predicates.java */
    private static class f<T> implements m0<T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54980c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Collection<?> f54981b;

        @Override // com.google.common.base.m0
        public boolean apply(@i0 T t4) {
            try {
                return this.f54981b.contains(t4);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof f) {
                return this.f54981b.equals(((f) obj).f54981b);
            }
            return false;
        }

        public int hashCode() {
            return this.f54981b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54981b);
            return com.google.common.base.h.a(valueOf.length() + 15, ProtectedSandApp.s("\uf31c"), valueOf, ProtectedSandApp.s("\uf31d"));
        }

        private f(Collection<?> collection) {
            collection.getClass();
            this.f54981b = collection;
        }
    }

    /* compiled from: Predicates.java */
    @d9.c
    private static class g<T> implements m0<T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54982c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f54983b;

        @Override // com.google.common.base.m0
        public boolean apply(@i0 T t4) {
            return this.f54983b.isInstance(t4);
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            return (obj instanceof g) && this.f54983b == ((g) obj).f54983b;
        }

        public int hashCode() {
            return this.f54983b.hashCode();
        }

        public String toString() {
            String name = this.f54983b.getName();
            return com.google.common.base.h.a(name.length() + 23, ProtectedSandApp.s("\uf31e"), name, ProtectedSandApp.s("\uf31f"));
        }

        private g(Class<?> cls) {
            cls.getClass();
            this.f54983b = cls;
        }
    }

    /* compiled from: Predicates.java */
    private static class h implements m0<Object>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54984c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Object f54985b;

        <T> m0<T> a() {
            return this;
        }

        @Override // com.google.common.base.m0
        public boolean apply(@zc.a Object obj) {
            return this.f54985b.equals(obj);
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof h) {
                return this.f54985b.equals(((h) obj).f54985b);
            }
            return false;
        }

        public int hashCode() {
            return this.f54985b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54985b);
            return com.google.common.base.h.a(valueOf.length() + 20, ProtectedSandApp.s("\uf320"), valueOf, ProtectedSandApp.s("\uf321"));
        }

        private h(Object obj) {
            this.f54985b = obj;
        }
    }

    /* compiled from: Predicates.java */
    private static class i<T> implements m0<T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54986c = 0;

        /* renamed from: b, reason: collision with root package name */
        final m0<T> f54987b;

        i(m0<T> m0Var) {
            m0Var.getClass();
            this.f54987b = m0Var;
        }

        @Override // com.google.common.base.m0
        public boolean apply(@i0 T t4) {
            return !this.f54987b.apply(t4);
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof i) {
                return this.f54987b.equals(((i) obj).f54987b);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f54987b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54987b);
            return com.google.common.base.h.a(valueOf.length() + 16, ProtectedSandApp.s("\uf322"), valueOf, ProtectedSandApp.s("\uf323"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Predicates.java */
    static abstract class j implements m0<Object> {
        public static final j ALWAYS_TRUE = new a(ProtectedSandApp.s("\uf324"), 0);
        public static final j ALWAYS_FALSE = new b(ProtectedSandApp.s("\uf325"), 1);
        public static final j IS_NULL = new c(ProtectedSandApp.s("\uf326"), 2);
        public static final j NOT_NULL = new d(ProtectedSandApp.s("\uf327"), 3);
        private static final /* synthetic */ j[] $VALUES = $values();

        /* compiled from: Predicates.java */
        enum a extends j {
            a(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.base.m0
            public boolean apply(@zc.a Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf328");
            }
        }

        /* compiled from: Predicates.java */
        enum b extends j {
            b(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.base.m0
            public boolean apply(@zc.a Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf329");
            }
        }

        /* compiled from: Predicates.java */
        enum c extends j {
            c(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.base.m0
            public boolean apply(@zc.a Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf32a");
            }
        }

        /* compiled from: Predicates.java */
        enum d extends j {
            d(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.base.m0
            public boolean apply(@zc.a Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf32b");
            }
        }

        private static /* synthetic */ j[] $values() {
            return new j[]{ALWAYS_TRUE, ALWAYS_FALSE, IS_NULL, NOT_NULL};
        }

        private j(String str, int i4) {
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }

        <T> m0<T> withNarrowedType() {
            return this;
        }
    }

    /* compiled from: Predicates.java */
    private static class k<T> implements m0<T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54988c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final List<? extends m0<? super T>> f54989b;

        @Override // com.google.common.base.m0
        public boolean apply(@i0 T t4) {
            for (int i4 = 0; i4 < this.f54989b.size(); i4++) {
                if (this.f54989b.get(i4).apply(t4)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof k) {
                return this.f54989b.equals(((k) obj).f54989b);
            }
            return false;
        }

        public int hashCode() {
            return this.f54989b.hashCode() + 87855567;
        }

        public String toString() {
            return n0.w(ProtectedSandApp.s("\uf32c"), this.f54989b);
        }

        private k(List<? extends m0<? super T>> list) {
            this.f54989b = list;
        }
    }

    /* compiled from: Predicates.java */
    @d9.c
    private static class l implements m0<Class<?>>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f54990c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f54991b;

        @Override // com.google.common.base.m0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> cls) {
            return this.f54991b.isAssignableFrom(cls);
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            return (obj instanceof l) && this.f54991b == ((l) obj).f54991b;
        }

        public int hashCode() {
            return this.f54991b.hashCode();
        }

        public String toString() {
            String name = this.f54991b.getName();
            return com.google.common.base.h.a(name.length() + 22, ProtectedSandApp.s("\uf32d"), name, ProtectedSandApp.s("\uf32e"));
        }

        private l(Class<?> cls) {
            cls.getClass();
            this.f54991b = cls;
        }
    }

    private n0() {
    }

    @d9.b(serializable = true)
    public static <T> m0<T> b() {
        return j.ALWAYS_FALSE.withNarrowedType();
    }

    @d9.b(serializable = true)
    public static <T> m0<T> c() {
        return j.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> m0<T> d(m0<? super T> m0Var, m0<? super T> m0Var2) {
        m0Var.getClass();
        m0Var2.getClass();
        return new b(g(m0Var, m0Var2));
    }

    public static <T> m0<T> e(Iterable<? extends m0<? super T>> iterable) {
        return new b(k(iterable));
    }

    @SafeVarargs
    public static <T> m0<T> f(m0<? super T>... m0VarArr) {
        return new b(l(m0VarArr));
    }

    private static <T> List<m0<? super T>> g(m0<? super T> m0Var, m0<? super T> m0Var2) {
        return Arrays.asList(m0Var, m0Var2);
    }

    public static <A, B> m0<A> h(m0<B> m0Var, x<A, ? extends B> xVar) {
        return new c(m0Var, xVar);
    }

    @d9.c("java.util.regex.Pattern")
    public static m0<CharSequence> i(Pattern pattern) {
        return new e(new b0(pattern));
    }

    @d9.c
    public static m0<CharSequence> j(String str) {
        return new d(str);
    }

    static <T> List<T> k(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            t4.getClass();
            arrayList.add(t4);
        }
        return arrayList;
    }

    private static <T> List<T> l(T... tArr) {
        return k(Arrays.asList(tArr));
    }

    public static <T> m0<T> m(@i0 T t4) {
        return t4 == null ? j.IS_NULL.withNarrowedType() : new h(t4);
    }

    public static <T> m0<T> n(Collection<? extends T> collection) {
        return new f(collection);
    }

    @d9.c
    public static <T> m0<T> o(Class<?> cls) {
        return new g(cls);
    }

    @d9.b(serializable = true)
    public static <T> m0<T> p() {
        return j.IS_NULL.withNarrowedType();
    }

    public static <T> m0<T> q(m0<T> m0Var) {
        return new i(m0Var);
    }

    @d9.b(serializable = true)
    public static <T> m0<T> r() {
        return j.NOT_NULL.withNarrowedType();
    }

    public static <T> m0<T> s(m0<? super T> m0Var, m0<? super T> m0Var2) {
        m0Var.getClass();
        m0Var2.getClass();
        return new k(g(m0Var, m0Var2));
    }

    public static <T> m0<T> t(Iterable<? extends m0<? super T>> iterable) {
        return new k(k(iterable));
    }

    @SafeVarargs
    public static <T> m0<T> u(m0<? super T>... m0VarArr) {
        return new k(l(m0VarArr));
    }

    @d9.a
    @d9.c
    public static m0<Class<?>> v(Class<?> cls) {
        return new l(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf32f"));
        sb.append(str);
        sb.append('(');
        boolean z4 = true;
        for (Object obj : iterable) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
