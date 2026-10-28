package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.q;
import com.annimon.stream.function.s1;
import com.annimon.stream.function.t1;
import com.annimon.stream.function.u1;
import com.annimon.stream.function.v1;
import com.annimon.stream.function.z0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Collectors.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final a1<long[]> f41286a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final a1<double[]> f41287b = new v();

    /* JADX INFO: Add missing generic type declarations: [T, M] */
    /* compiled from: Collectors.java */
    static class a<M, T> implements com.annimon.stream.function.a<M, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41288a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41289b;

        a(com.annimon.stream.function.q qVar, com.annimon.stream.function.q qVar2) {
            this.f41288a = qVar;
            this.f41289b = qVar2;
        }

        /* JADX WARN: Incorrect types in method signature: (TM;TT;)V */
        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map map, Object obj) {
            Object apply = this.f41288a.apply(obj);
            Object apply2 = this.f41289b.apply(obj);
            apply2.getClass();
            Object put = map.put(apply, apply2);
            if (put == null) {
                return;
            }
            map.put(apply, put);
            throw b.k(apply, put, apply2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Collectors.java */
    static class a0<R> implements com.annimon.stream.function.q<u0<R>, R> {
        a0() {
        }

        public R a(u0<R> u0Var) {
            return u0Var.f41323a;
        }

        @Override // com.annimon.stream.function.q
        public Object apply(Object obj) {
            return ((u0) obj).f41323a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, M] */
    /* compiled from: Collectors.java */
    /* renamed from: com.annimon.stream.b$b, reason: collision with other inner class name */
    static class C0683b<M, T> implements com.annimon.stream.function.a<M, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.c f41292c;

        C0683b(com.annimon.stream.function.q qVar, com.annimon.stream.function.q qVar2, com.annimon.stream.function.c cVar) {
            this.f41290a = qVar;
            this.f41291b = qVar2;
            this.f41292c = cVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TM;TT;)V */
        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map map, Object obj) {
            b.v(map, this.f41290a.apply(obj), this.f41291b.apply(obj), this.f41292c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, T] */
    /* compiled from: Collectors.java */
    static class b0<A, T> implements com.annimon.stream.function.a<A, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f41293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.a f41294b;

        b0(z0 z0Var, com.annimon.stream.function.a aVar) {
            this.f41293a = z0Var;
            this.f41294b = aVar;
        }

        @Override // com.annimon.stream.function.a
        public void accept(A a5, T t4) {
            if (this.f41293a.test(t4)) {
                this.f41294b.accept(a5, t4);
            }
        }
    }

    /* compiled from: Collectors.java */
    static class c implements a1<StringBuilder> {
        c() {
        }

        public StringBuilder a() {
            return new StringBuilder();
        }

        @Override // com.annimon.stream.function.a1
        public StringBuilder get() {
            return new StringBuilder();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, T] */
    /* compiled from: Collectors.java */
    static class c0<A, T> implements com.annimon.stream.function.a<A, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.a f41295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41296b;

        c0(com.annimon.stream.function.a aVar, com.annimon.stream.function.q qVar) {
            this.f41295a = aVar;
            this.f41296b = qVar;
        }

        @Override // com.annimon.stream.function.a
        public void accept(A a5, T t4) {
            this.f41295a.accept(a5, this.f41296b.apply(t4));
        }
    }

    /* compiled from: Collectors.java */
    static class d implements com.annimon.stream.function.a<StringBuilder, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f41297a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f41298b;

        d(CharSequence charSequence, CharSequence charSequence2) {
            this.f41297a = charSequence;
            this.f41298b = charSequence2;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(StringBuilder sb, CharSequence charSequence) {
            if (sb.length() > 0) {
                sb.append(this.f41297a);
            } else {
                sb.append(this.f41298b);
            }
            sb.append(charSequence);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, T] */
    /* compiled from: Collectors.java */
    static class d0<A, T> implements com.annimon.stream.function.a<A, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.a f41300b;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: Collectors.java */
        class a<U> implements com.annimon.stream.function.h<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f41301a;

            a(Object obj) {
                this.f41301a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.annimon.stream.function.h
            public void accept(U u4) {
                d0.this.f41300b.accept(this.f41301a, u4);
            }
        }

        d0(com.annimon.stream.function.q qVar, com.annimon.stream.function.a aVar) {
            this.f41299a = qVar;
            this.f41300b = aVar;
        }

        @Override // com.annimon.stream.function.a
        public void accept(A a5, T t4) {
            com.annimon.stream.p pVar = (com.annimon.stream.p) this.f41299a.apply(t4);
            if (pVar == null) {
                return;
            }
            pVar.J(new a(a5));
        }
    }

    /* compiled from: Collectors.java */
    static class e implements com.annimon.stream.function.q<StringBuilder, String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f41304b;

        e(String str, CharSequence charSequence) {
            this.f41303a = str;
            this.f41304b = charSequence;
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(StringBuilder sb) {
            if (sb.length() == 0) {
                return this.f41303a;
            }
            sb.append(this.f41304b);
            return sb.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, K, M] */
    /* compiled from: Collectors.java */
    static class e0<A, K, M> implements com.annimon.stream.function.q<Map<K, A>, M> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41305a;

        e0(com.annimon.stream.function.q qVar) {
            this.f41305a = qVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/util/Map<TK;TA;>;)TM; */
        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map apply(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                entry.setValue(this.f41305a.apply(entry.getValue()));
            }
            return map;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class f<T> implements s1<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41306a;

        f(com.annimon.stream.function.q qVar) {
            this.f41306a = qVar;
        }

        @Override // com.annimon.stream.function.s1
        public double c(T t4) {
            return ((Double) this.f41306a.apply(t4)).doubleValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, T, K] */
    /* compiled from: Collectors.java */
    static class f0<A, K, T> implements com.annimon.stream.function.a<Map<K, A>, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.a f41308b;

        f0(com.annimon.stream.function.q qVar, com.annimon.stream.a aVar) {
            this.f41307a = qVar;
            this.f41308b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, A> map, T t4) {
            Object l4 = com.annimon.stream.i.l(this.f41307a.apply(t4), ProtectedSandApp.s("\u07bb"));
            Object obj = map.get(l4);
            if (obj == null) {
                obj = this.f41308b.supplier().get();
                map.put(l4, obj);
            }
            this.f41308b.accumulator().accept(obj, t4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class g<T> implements com.annimon.stream.function.a<long[], T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t1 f41309a;

        g(t1 t1Var) {
            this.f41309a = t1Var;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(long[] jArr, T t4) {
            jArr[0] = jArr[0] + 1;
            jArr[1] = jArr[1] + this.f41309a.c(t4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Collectors.java */
    static class g0<R, T> implements com.annimon.stream.function.a<R, T> {
        g0() {
        }

        /* JADX WARN: Incorrect types in method signature: (TR;TT;)V */
        public void a(Collection collection, Object obj) {
            collection.add(obj);
        }

        @Override // com.annimon.stream.function.a
        public void accept(Object obj, Object obj2) {
            ((Collection) obj).add(obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class h<T> implements com.annimon.stream.function.a<long[], T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u1 f41310a;

        h(u1 u1Var) {
            this.f41310a = u1Var;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(long[] jArr, T t4) {
            jArr[0] = jArr[0] + 1;
            jArr[1] = this.f41310a.applyAsLong(t4) + jArr[1];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A] */
    /* compiled from: Collectors.java */
    static class h0<A> implements a1<v0<A>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.a f41311a;

        h0(com.annimon.stream.a aVar) {
            this.f41311a = aVar;
        }

        @Override // com.annimon.stream.function.a1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0<A> get() {
            return new v0<>(this.f41311a.supplier().get(), this.f41311a.supplier().get());
        }
    }

    /* compiled from: Collectors.java */
    static class i implements com.annimon.stream.function.q<long[], Double> {
        i() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double apply(long[] jArr) {
            long j4 = jArr[0];
            return j4 == 0 ? Double.valueOf(com.google.firebase.remoteconfig.p.f60679p) : Double.valueOf(jArr[1] / j4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, T] */
    /* compiled from: Collectors.java */
    static class i0<A, T> implements com.annimon.stream.function.a<v0<A>, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.a f41312a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f41313b;

        i0(com.annimon.stream.function.a aVar, z0 z0Var) {
            this.f41312a = aVar;
            this.f41313b = z0Var;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(v0<A> v0Var, T t4) {
            this.f41312a.accept(this.f41313b.test(t4) ? v0Var.f41324a : v0Var.f41325b, t4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class j<T> implements com.annimon.stream.function.a<double[], T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s1 f41314a;

        j(s1 s1Var) {
            this.f41314a = s1Var;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(double[] dArr, T t4) {
            dArr[0] = dArr[0] + 1.0d;
            dArr[1] = this.f41314a.c(t4) + dArr[1];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, D] */
    /* compiled from: Collectors.java */
    static class j0<A, D> implements com.annimon.stream.function.q<v0<A>, Map<Boolean, D>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.a f41315a;

        j0(com.annimon.stream.a aVar) {
            this.f41315a = aVar;
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Boolean, D> apply(v0<A> v0Var) {
            com.annimon.stream.function.q finisher = this.f41315a.finisher();
            if (finisher == null) {
                finisher = b.h();
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put(Boolean.TRUE, finisher.apply(v0Var.f41324a));
            hashMap.put(Boolean.FALSE, finisher.apply(v0Var.f41325b));
            return hashMap;
        }
    }

    /* compiled from: Collectors.java */
    static class k implements a1<long[]> {
        k() {
        }

        public long[] a() {
            return new long[]{0, 0};
        }

        @Override // com.annimon.stream.function.a1
        public long[] get() {
            return new long[]{0, 0};
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Collectors.java */
    static class k0<K, V> implements a1<Map<K, V>> {
        k0() {
        }

        public Map<K, V> a() {
            return new HashMap();
        }

        @Override // com.annimon.stream.function.a1
        public Object get() {
            return new HashMap();
        }
    }

    /* compiled from: Collectors.java */
    static class l implements com.annimon.stream.function.q<double[], Double> {
        l() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double apply(double[] dArr) {
            double d5 = dArr[0];
            return d5 == com.google.firebase.remoteconfig.p.f60679p ? Double.valueOf(com.google.firebase.remoteconfig.p.f60679p) : Double.valueOf(dArr[1] / d5);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Collectors.java */
    static class l0<K, V> implements v1<Map<K, V>> {
        l0() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> apply(Map<K, V> map) {
            com.annimon.stream.i.m(map.keySet());
            com.annimon.stream.i.m(map.values());
            return Collections.unmodifiableMap(map);
        }
    }

    /* compiled from: Collectors.java */
    static class m implements a1<int[]> {
        m() {
        }

        public int[] a() {
            return new int[]{0};
        }

        @Override // com.annimon.stream.function.a1
        public int[] get() {
            return new int[]{0};
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, R] */
    /* compiled from: Collectors.java */
    static class m0<A, R> implements com.annimon.stream.function.q<A, R> {
        m0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.annimon.stream.function.q
        public R apply(A a5) {
            return a5;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class n<T> implements com.annimon.stream.function.a<int[], T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t1 f41316a;

        n(t1 t1Var) {
            this.f41316a = t1Var;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(int[] iArr, T t4) {
            iArr[0] = this.f41316a.c(t4) + iArr[0];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class n0<T> implements a1<List<T>> {
        n0() {
        }

        public List<T> a() {
            return new ArrayList();
        }

        @Override // com.annimon.stream.function.a1
        public Object get() {
            return new ArrayList();
        }
    }

    /* compiled from: Collectors.java */
    static class o implements com.annimon.stream.function.q<int[], Integer> {
        o() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(int[] iArr) {
            return Integer.valueOf(iArr[0]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class o0<T> implements com.annimon.stream.function.a<List<T>, T> {
        o0() {
        }

        public void a(List<T> list, T t4) {
            list.add(t4);
        }

        @Override // com.annimon.stream.function.a
        public void accept(Object obj, Object obj2) {
            ((List) obj).add(obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class p<T> implements com.annimon.stream.function.a<long[], T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u1 f41317a;

        p(u1 u1Var) {
            this.f41317a = u1Var;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(long[] jArr, T t4) {
            jArr[0] = this.f41317a.applyAsLong(t4) + jArr[0];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class p0<T> implements v1<List<T>> {
        p0() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            com.annimon.stream.i.m(list);
            return Collections.unmodifiableList(list);
        }
    }

    /* compiled from: Collectors.java */
    static class q implements com.annimon.stream.function.q<long[], Long> {
        q() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(long[] jArr) {
            return Long.valueOf(jArr[0]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class q0<T> implements a1<Set<T>> {
        q0() {
        }

        public Set<T> a() {
            return new HashSet();
        }

        @Override // com.annimon.stream.function.a1
        public Object get() {
            return new HashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class r<T> implements com.annimon.stream.function.a<double[], T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s1 f41318a;

        r(s1 s1Var) {
            this.f41318a = s1Var;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(double[] dArr, T t4) {
            dArr[0] = this.f41318a.c(t4) + dArr[0];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class r0<T> implements com.annimon.stream.function.a<Set<T>, T> {
        r0() {
        }

        public void a(Set<T> set, T t4) {
            set.add(t4);
        }

        @Override // com.annimon.stream.function.a
        public void accept(Object obj, Object obj2) {
            ((Set) obj).add(obj2);
        }
    }

    /* compiled from: Collectors.java */
    static class s implements com.annimon.stream.function.q<double[], Double> {
        s() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double apply(double[] dArr) {
            return Double.valueOf(dArr[0]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class s0<T> implements v1<Set<T>> {
        s0() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<T> apply(Set<T> set) {
            com.annimon.stream.i.m(set);
            return Collections.unmodifiableSet(set);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class t<T> implements u1<T> {
        t() {
        }

        @Override // com.annimon.stream.function.u1
        public long applyAsLong(T t4) {
            return 1L;
        }
    }

    /* compiled from: Collectors.java */
    private static final class t0<T, A, R> implements com.annimon.stream.a<T, A, R> {

        /* renamed from: a, reason: collision with root package name */
        private final a1<A> f41319a;

        /* renamed from: b, reason: collision with root package name */
        private final com.annimon.stream.function.a<A, T> f41320b;

        /* renamed from: c, reason: collision with root package name */
        private final com.annimon.stream.function.q<A, R> f41321c;

        public t0(a1<A> a1Var, com.annimon.stream.function.a<A, T> aVar) {
            this(a1Var, aVar, null);
        }

        @Override // com.annimon.stream.a
        public com.annimon.stream.function.a<A, T> accumulator() {
            return this.f41320b;
        }

        @Override // com.annimon.stream.a
        public com.annimon.stream.function.q<A, R> finisher() {
            return this.f41321c;
        }

        @Override // com.annimon.stream.a
        public a1<A> supplier() {
            return this.f41319a;
        }

        public t0(a1<A> a1Var, com.annimon.stream.function.a<A, T> aVar, com.annimon.stream.function.q<A, R> qVar) {
            this.f41319a = a1Var;
            this.f41320b = aVar;
            this.f41321c = qVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class u<T> implements a1<u0<T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f41322a;

        u(Object obj) {
            this.f41322a = obj;
        }

        @Override // com.annimon.stream.function.a1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0<T> get() {
            return new u0<>(this.f41322a);
        }
    }

    /* compiled from: Collectors.java */
    private static final class u0<A> {

        /* renamed from: a, reason: collision with root package name */
        A f41323a;

        u0(A a5) {
            this.f41323a = a5;
        }
    }

    /* compiled from: Collectors.java */
    static class v implements a1<double[]> {
        v() {
        }

        public double[] a() {
            return new double[]{com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p};
        }

        @Override // com.annimon.stream.function.a1
        public double[] get() {
            return new double[]{com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p};
        }
    }

    /* compiled from: Collectors.java */
    private static final class v0<A> {

        /* renamed from: a, reason: collision with root package name */
        final A f41324a;

        /* renamed from: b, reason: collision with root package name */
        final A f41325b;

        v0(A a5, A a6) {
            this.f41324a = a5;
            this.f41325b = a6;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class w<T> implements com.annimon.stream.function.a<u0<T>, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.c f41326a;

        w(com.annimon.stream.function.c cVar) {
            this.f41326a = cVar;
        }

        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(u0<T> u0Var, T t4) {
            u0Var.f41323a = this.f41326a.apply(u0Var.f41323a, t4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collectors.java */
    static class x<T> implements com.annimon.stream.function.q<u0<T>, T> {
        x() {
        }

        public T a(u0<T> u0Var) {
            return u0Var.f41323a;
        }

        @Override // com.annimon.stream.function.q
        public Object apply(Object obj) {
            return ((u0) obj).f41323a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Collectors.java */
    static class y<R> implements a1<u0<R>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f41327a;

        y(Object obj) {
            this.f41327a = obj;
        }

        @Override // com.annimon.stream.function.a1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0<R> get() {
            return new u0<>(this.f41327a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Collectors.java */
    static class z<R, T> implements com.annimon.stream.function.a<u0<R>, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.c f41328a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.annimon.stream.function.q f41329b;

        z(com.annimon.stream.function.c cVar, com.annimon.stream.function.q qVar) {
            this.f41328a = cVar;
            this.f41329b = qVar;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [A, java.lang.Object] */
        @Override // com.annimon.stream.function.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(u0<R> u0Var, T t4) {
            u0Var.f41323a = this.f41328a.apply(u0Var.f41323a, this.f41329b.apply(t4));
        }
    }

    private b() {
    }

    public static <T, R> com.annimon.stream.a<T, ?, R> A(R r4, com.annimon.stream.function.q<? super T, ? extends R> qVar, com.annimon.stream.function.c<R> cVar) {
        return new t0(new y(r4), new z(cVar, qVar), new a0());
    }

    public static <T> com.annimon.stream.a<T, ?, Double> B(s1<? super T> s1Var) {
        return new t0(f41287b, new r(s1Var), new s());
    }

    public static <T> com.annimon.stream.a<T, ?, Integer> C(t1<? super T> t1Var) {
        return new t0(new m(), new n(t1Var), new o());
    }

    public static <T> com.annimon.stream.a<T, ?, Long> D(u1<? super T> u1Var) {
        return new t0(f41286a, new p(u1Var), new q());
    }

    public static <T, R extends Collection<T>> com.annimon.stream.a<T, ?, R> E(a1<R> a1Var) {
        return new t0(a1Var, new g0(), null);
    }

    public static <T> com.annimon.stream.a<T, ?, List<T>> F() {
        return new t0(new n0(), new o0(), null);
    }

    public static <T, K> com.annimon.stream.a<T, ?, Map<K, T>> G(com.annimon.stream.function.q<? super T, ? extends K> qVar) {
        return H(qVar, v1.a.a());
    }

    public static <T, K, V> com.annimon.stream.a<T, ?, Map<K, V>> H(com.annimon.stream.function.q<? super T, ? extends K> qVar, com.annimon.stream.function.q<? super T, ? extends V> qVar2) {
        return K(qVar, qVar2, new k0());
    }

    public static <T, K, V> com.annimon.stream.a<T, ?, Map<K, V>> I(com.annimon.stream.function.q<? super T, ? extends K> qVar, com.annimon.stream.function.q<? super T, ? extends V> qVar2, com.annimon.stream.function.c<V> cVar) {
        return J(qVar, qVar2, cVar, new k0());
    }

    public static <T, K, V, M extends Map<K, V>> com.annimon.stream.a<T, ?, M> J(com.annimon.stream.function.q<? super T, ? extends K> qVar, com.annimon.stream.function.q<? super T, ? extends V> qVar2, com.annimon.stream.function.c<V> cVar, a1<M> a1Var) {
        return new t0(a1Var, new C0683b(qVar, qVar2, cVar), null);
    }

    public static <T, K, V, M extends Map<K, V>> com.annimon.stream.a<T, ?, M> K(com.annimon.stream.function.q<? super T, ? extends K> qVar, com.annimon.stream.function.q<? super T, ? extends V> qVar2, a1<M> a1Var) {
        return new t0(a1Var, new a(qVar, qVar2), null);
    }

    public static <T> com.annimon.stream.a<T, ?, Set<T>> L() {
        return new t0(new q0(), new r0(), null);
    }

    public static <T> com.annimon.stream.a<T, ?, List<T>> M() {
        return i(F(), new p0());
    }

    public static <T, K, V> com.annimon.stream.a<T, ?, Map<K, V>> N(com.annimon.stream.function.q<? super T, ? extends K> qVar, com.annimon.stream.function.q<? super T, ? extends V> qVar2) {
        return i(H(qVar, qVar2), new l0());
    }

    public static <T, K, V> com.annimon.stream.a<T, ?, Map<K, V>> O(com.annimon.stream.function.q<? super T, ? extends K> qVar, com.annimon.stream.function.q<? super T, ? extends V> qVar2, com.annimon.stream.function.c<V> cVar) {
        return i(J(qVar, qVar2, cVar, new k0()), new l0());
    }

    private static <K, V> v1<Map<K, V>> P() {
        return new l0();
    }

    public static <T> com.annimon.stream.a<T, ?, Set<T>> Q() {
        return i(L(), new s0());
    }

    @Deprecated
    public static <T> com.annimon.stream.a<T, ?, Double> c(com.annimon.stream.function.q<? super T, Double> qVar) {
        return d(new f(qVar));
    }

    public static <T> com.annimon.stream.a<T, ?, Double> d(s1<? super T> s1Var) {
        return new t0(f41287b, new j(s1Var), new l());
    }

    private static <T> com.annimon.stream.a<T, ?, Double> e(com.annimon.stream.function.a<long[], T> aVar) {
        return new t0(f41286a, aVar, new i());
    }

    public static <T> com.annimon.stream.a<T, ?, Double> f(t1<? super T> t1Var) {
        return e(new g(t1Var));
    }

    public static <T> com.annimon.stream.a<T, ?, Double> g(u1<? super T> u1Var) {
        return e(new h(u1Var));
    }

    static <A, R> com.annimon.stream.function.q<A, R> h() {
        return new m0();
    }

    public static <T, A, IR, OR> com.annimon.stream.a<T, A, OR> i(com.annimon.stream.a<T, A, IR> aVar, com.annimon.stream.function.q<IR, OR> qVar) {
        com.annimon.stream.function.q<A, IR> finisher = aVar.finisher();
        if (finisher == null) {
            finisher = new m0<>();
        }
        return new t0(aVar.supplier(), aVar.accumulator(), q.a.a(finisher, qVar));
    }

    public static <T> com.annimon.stream.a<T, ?, Long> j() {
        return D(new t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalStateException k(Object obj, Object obj2, Object obj3) {
        return new IllegalStateException(String.format(ProtectedSandApp.s("\u07bc"), obj, obj2, obj3));
    }

    public static <T, A, R> com.annimon.stream.a<T, ?, R> l(z0<? super T> z0Var, com.annimon.stream.a<? super T, A, R> aVar) {
        return new t0(aVar.supplier(), new b0(z0Var, aVar.accumulator()), aVar.finisher());
    }

    public static <T, U, A, R> com.annimon.stream.a<T, ?, R> m(com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.p<? extends U>> qVar, com.annimon.stream.a<? super U, A, R> aVar) {
        return new t0(aVar.supplier(), new d0(qVar, aVar.accumulator()), aVar.finisher());
    }

    public static <T, K> com.annimon.stream.a<T, ?, Map<K, List<T>>> n(com.annimon.stream.function.q<? super T, ? extends K> qVar) {
        return o(qVar, F());
    }

    public static <T, K, A, D> com.annimon.stream.a<T, ?, Map<K, D>> o(com.annimon.stream.function.q<? super T, ? extends K> qVar, com.annimon.stream.a<? super T, A, D> aVar) {
        return p(qVar, new k0(), aVar);
    }

    public static <T, K, D, A, M extends Map<K, D>> com.annimon.stream.a<T, ?, M> p(com.annimon.stream.function.q<? super T, ? extends K> qVar, a1<M> a1Var, com.annimon.stream.a<? super T, A, D> aVar) {
        com.annimon.stream.function.q<A, D> finisher = aVar.finisher();
        return new t0(a1Var, new f0(qVar, aVar), finisher != null ? new e0(finisher) : null);
    }

    private static <K, V> a1<Map<K, V>> q() {
        return new k0();
    }

    public static com.annimon.stream.a<CharSequence, ?, String> r() {
        return t("", "", "");
    }

    public static com.annimon.stream.a<CharSequence, ?, String> s(CharSequence charSequence) {
        return t(charSequence, "", "");
    }

    public static com.annimon.stream.a<CharSequence, ?, String> t(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return u(charSequence, charSequence2, charSequence3, charSequence2.toString() + charSequence3.toString());
    }

    public static com.annimon.stream.a<CharSequence, ?, String> u(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str) {
        return new t0(new c(), new d(charSequence, charSequence2), new e(str, charSequence3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void v(Map<K, V> map, K k4, V v4, com.annimon.stream.function.c<V> cVar) {
        V v5 = map.get(k4);
        if (v5 != null) {
            v4 = (V) cVar.apply(v5, v4);
        }
        if (v4 == null) {
            map.remove(k4);
        } else {
            map.put(k4, v4);
        }
    }

    public static <T, U, A, R> com.annimon.stream.a<T, ?, R> w(com.annimon.stream.function.q<? super T, ? extends U> qVar, com.annimon.stream.a<? super U, A, R> aVar) {
        return new t0(aVar.supplier(), new c0(aVar.accumulator(), qVar), aVar.finisher());
    }

    public static <T> com.annimon.stream.a<T, ?, Map<Boolean, List<T>>> x(z0<? super T> z0Var) {
        return y(z0Var, F());
    }

    public static <T, D, A> com.annimon.stream.a<T, ?, Map<Boolean, D>> y(z0<? super T> z0Var, com.annimon.stream.a<? super T, A, D> aVar) {
        return new t0(new h0(aVar), new i0(aVar.accumulator(), z0Var), new j0(aVar));
    }

    public static <T> com.annimon.stream.a<T, ?, T> z(T t4, com.annimon.stream.function.c<T> cVar) {
        return new t0(new u(t4), new w(cVar), new x());
    }
}
