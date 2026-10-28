package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import com.google.common.collect.i6;
import com.google.common.collect.j5;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: ImmutableRangeMap.java */
@w0
@d9.c
@d9.a
/* loaded from: classes6.dex */
public class o3<K extends Comparable<?>, V> implements l5<K, V>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final o3<Comparable<?>, Object> f55992d = new o3<>(f3.H(), q5.f56234f);

    /* renamed from: e, reason: collision with root package name */
    private static final long f55993e = 0;

    /* renamed from: b, reason: collision with root package name */
    private final transient f3<j5<K>> f55994b;

    /* renamed from: c, reason: collision with root package name */
    private final transient f3<V> f55995c;

    /* compiled from: ImmutableRangeMap.java */
    class a extends f3<j5<K>> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f55996d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f55997e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j5 f55998f;

        a(int i4, int i5, j5 j5Var) {
            this.f55996d = i4;
            this.f55997e = i5;
            this.f55998f = j5Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public j5<K> get(int i4) {
            com.google.common.base.l0.C(i4, this.f55996d);
            return (i4 == 0 || i4 == this.f55996d + (-1)) ? ((j5) o3.this.f55994b.get(i4 + this.f55997e)).s(this.f55998f) : (j5) o3.this.f55994b.get(i4 + this.f55997e);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55996d;
        }
    }

    /* compiled from: ImmutableRangeMap.java */
    class b extends o3<K, V> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j5 f56000f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o3 f56001g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o3 o3Var, f3 f3Var, f3 f3Var2, j5 j5Var, o3 o3Var2) {
            super(f3Var, f3Var2);
            this.f56000f = j5Var;
            this.f56001g = o3Var2;
        }

        @Override // com.google.common.collect.o3, com.google.common.collect.l5
        public /* bridge */ /* synthetic */ Map e() {
            return super.e();
        }

        @Override // com.google.common.collect.o3, com.google.common.collect.l5
        public /* bridge */ /* synthetic */ Map g() {
            return super.g();
        }

        @Override // com.google.common.collect.o3, com.google.common.collect.l5
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public o3<K, V> d(j5<K> j5Var) {
            return this.f56000f.t(j5Var) ? this.f56001g.d(j5Var.s(this.f56000f)) : o3.p();
        }
    }

    /* compiled from: ImmutableRangeMap.java */
    @f9.f
    public static final class c<K extends Comparable<?>, V> {

        /* renamed from: a, reason: collision with root package name */
        private final List<Map.Entry<j5<K>, V>> f56002a = new ArrayList();

        public o3<K, V> a() {
            Collections.sort(this.f56002a, j5.C().t0());
            f3.a aVar = new f3.a(this.f56002a.size());
            f3.a aVar2 = new f3.a(this.f56002a.size());
            for (int i4 = 0; i4 < this.f56002a.size(); i4++) {
                j5<K> key = this.f56002a.get(i4).getKey();
                if (i4 > 0) {
                    j5<K> key2 = this.f56002a.get(i4 - 1).getKey();
                    if (key.t(key2) && !key.s(key2).u()) {
                        String valueOf = String.valueOf(key2);
                        String valueOf2 = String.valueOf(key);
                        throw new IllegalArgumentException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 47, ProtectedSandApp.s("\uf505"), valueOf, ProtectedSandApp.s("\uf506"), valueOf2));
                    }
                }
                aVar.j(key);
                aVar2.j(this.f56002a.get(i4).getValue());
            }
            return new o3<>(aVar.e(), aVar2.e());
        }

        @f9.a
        c<K, V> b(c<K, V> cVar) {
            this.f56002a.addAll(cVar.f56002a);
            return this;
        }

        @f9.a
        public c<K, V> c(j5<K> j5Var, V v4) {
            j5Var.getClass();
            v4.getClass();
            com.google.common.base.l0.u(!j5Var.u(), ProtectedSandApp.s("\uf507"), j5Var);
            this.f56002a.add(new c3(j5Var, v4));
            return this;
        }

        @f9.a
        public c<K, V> d(l5<K, ? extends V> l5Var) {
            for (Map.Entry<j5<K>, ? extends V> entry : l5Var.e().entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* compiled from: ImmutableRangeMap.java */
    private static class d<K extends Comparable<?>, V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56003c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final h3<j5<K>, V> f56004b;

        d(h3<j5<K>, V> h3Var) {
            this.f56004b = h3Var;
        }

        Object a() {
            c cVar = new c();
            e7<Map.Entry<j5<K>, V>> it = this.f56004b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<j5<K>, V> next = it.next();
                cVar.c(next.getKey(), next.getValue());
            }
            return cVar.a();
        }

        Object b() {
            return this.f56004b.isEmpty() ? o3.p() : a();
        }
    }

    o3(f3<j5<K>> f3Var, f3<V> f3Var2) {
        this.f55994b = f3Var;
        this.f55995c = f3Var2;
    }

    public static <K extends Comparable<?>, V> c<K, V> n() {
        return new c<>();
    }

    public static <K extends Comparable<?>, V> o3<K, V> o(l5<K, ? extends V> l5Var) {
        if (l5Var instanceof o3) {
            return (o3) l5Var;
        }
        Map<j5<K>, ? extends V> e4 = l5Var.e();
        f3.a aVar = new f3.a(e4.size());
        f3.a aVar2 = new f3.a(e4.size());
        for (Map.Entry<j5<K>, ? extends V> entry : e4.entrySet()) {
            aVar.j(entry.getKey());
            aVar2.j(entry.getValue());
        }
        return new o3<>(aVar.e(), aVar2.e());
    }

    public static <K extends Comparable<?>, V> o3<K, V> p() {
        return (o3<K, V>) f55992d;
    }

    public static <K extends Comparable<?>, V> o3<K, V> q(j5<K> j5Var, V v4) {
        return new o3<>(f3.I(j5Var), f3.I(v4));
    }

    @Override // com.google.common.collect.l5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void a(j5<K> j5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l5
    public j5<K> c() {
        if (this.f55994b.isEmpty()) {
            throw new NoSuchElementException();
        }
        return j5.k(this.f55994b.get(0).f55872b, this.f55994b.get(r1.size() - 1).f55873c);
    }

    @Override // com.google.common.collect.l5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l5
    public boolean equals(@zc.a Object obj) {
        if (obj instanceof l5) {
            return e().equals(((l5) obj).e());
        }
        return false;
    }

    @Override // com.google.common.collect.l5
    @zc.a
    public Map.Entry<j5<K>, V> f(K k4) {
        int a5 = i6.a(this.f55994b, j5.w(), q0.d(k4), i6.c.ANY_PRESENT, i6.b.NEXT_LOWER);
        if (a5 == -1) {
            return null;
        }
        j5<K> j5Var = this.f55994b.get(a5);
        if (j5Var.i(k4)) {
            return p4.O(j5Var, this.f55995c.get(a5));
        }
        return null;
    }

    @Override // com.google.common.collect.l5
    @zc.a
    public V h(K k4) {
        int a5 = i6.a(this.f55994b, j5.w(), q0.d(k4), i6.c.ANY_PRESENT, i6.b.NEXT_LOWER);
        if (a5 != -1 && this.f55994b.get(a5).i(k4)) {
            return this.f55995c.get(a5);
        }
        return null;
    }

    @Override // com.google.common.collect.l5
    public int hashCode() {
        return e().hashCode();
    }

    @Override // com.google.common.collect.l5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void i(l5<K, V> l5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void j(j5<K> j5Var, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void k(j5<K> j5Var, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l5
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public h3<j5<K>, V> g() {
        return this.f55994b.isEmpty() ? h3.t() : new s3(new v5(this.f55994b.Z(), j5.C().v0()), this.f55995c.Z(), null);
    }

    @Override // com.google.common.collect.l5
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public h3<j5<K>, V> e() {
        return this.f55994b.isEmpty() ? h3.t() : new s3(new v5(this.f55994b, j5.C()), this.f55995c, null);
    }

    @Override // com.google.common.collect.l5
    /* renamed from: r */
    public o3<K, V> d(j5<K> j5Var) {
        j5Var.getClass();
        if (j5Var.u()) {
            return (o3<K, V>) f55992d;
        }
        if (this.f55994b.isEmpty() || j5Var.n(c())) {
            return this;
        }
        f3<j5<K>> f3Var = this.f55994b;
        j5.d dVar = j5.d.f55878b;
        q0<K> q0Var = j5Var.f55872b;
        i6.c cVar = i6.c.FIRST_AFTER;
        i6.b bVar = i6.b.NEXT_HIGHER;
        int a5 = i6.a(f3Var, dVar, q0Var, cVar, bVar);
        int a6 = i6.a(this.f55994b, j5.b.f55875b, j5Var.f55873c, i6.c.ANY_PRESENT, bVar);
        return a5 >= a6 ? (o3<K, V>) f55992d : new b(this, new a(a6 - a5, a5, j5Var), this.f55995c.subList(a5, a6), j5Var, this);
    }

    Object s() {
        return new d(e());
    }

    @Override // com.google.common.collect.l5
    public String toString() {
        return e().toString();
    }
}
