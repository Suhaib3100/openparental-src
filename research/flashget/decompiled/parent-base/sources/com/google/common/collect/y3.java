package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import com.google.common.collect.s6;
import com.google.common.collect.t6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ImmutableTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class y3<R, C, V> extends q<R, C, V> implements Serializable {

    /* compiled from: ImmutableTable.java */
    @f9.f
    public static final class a<R, C, V> {

        /* renamed from: a, reason: collision with root package name */
        private final List<s6.a<R, C, V>> f56645a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        private Comparator<? super R> f56646b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        private Comparator<? super C> f56647c;

        public y3<R, C, V> a() {
            return b();
        }

        public y3<R, C, V> b() {
            int size = this.f56645a.size();
            return size != 0 ? size != 1 ? x5.C(this.f56645a, this.f56646b, this.f56647c) : new f6((s6.a) c4.z(this.f56645a)) : (y3<R, C, V>) o6.f56075h;
        }

        @f9.a
        a<R, C, V> c(a<R, C, V> aVar) {
            this.f56645a.addAll(aVar.f56645a);
            return this;
        }

        @f9.a
        public a<R, C, V> d(Comparator<? super C> comparator) {
            this.f56647c = (Comparator) com.google.common.base.l0.F(comparator, ProtectedSandApp.s("\uf57f"));
            return this;
        }

        @f9.a
        public a<R, C, V> e(Comparator<? super R> comparator) {
            this.f56646b = (Comparator) com.google.common.base.l0.F(comparator, ProtectedSandApp.s("\uf580"));
            return this;
        }

        @f9.a
        public a<R, C, V> f(s6.a<? extends R, ? extends C, ? extends V> aVar) {
            if (aVar instanceof t6.c) {
                t6.c cVar = (t6.c) aVar;
                com.google.common.base.l0.F(cVar.a(), ProtectedSandApp.s("\uf581"));
                com.google.common.base.l0.F(cVar.b(), ProtectedSandApp.s("\uf582"));
                com.google.common.base.l0.F(cVar.getValue(), ProtectedSandApp.s("\uf583"));
                this.f56645a.add(aVar);
            } else {
                g(aVar.a(), aVar.b(), aVar.getValue());
            }
            return this;
        }

        @f9.a
        public a<R, C, V> g(R r4, C c5, V v4) {
            this.f56645a.add(y3.g(r4, c5, v4));
            return this;
        }

        @f9.a
        public a<R, C, V> h(s6<? extends R, ? extends C, ? extends V> s6Var) {
            Iterator<s6.a<? extends R, ? extends C, ? extends V>> it = s6Var.B1().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }
    }

    /* compiled from: ImmutableTable.java */
    static final class b implements Serializable {

        /* renamed from: g, reason: collision with root package name */
        private static final long f56648g = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f56649b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f56650c;

        /* renamed from: d, reason: collision with root package name */
        private final Object[] f56651d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f56652e;

        /* renamed from: f, reason: collision with root package name */
        private final int[] f56653f;

        private b(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f56649b = objArr;
            this.f56650c = objArr2;
            this.f56651d = objArr3;
            this.f56652e = iArr;
            this.f56653f = iArr2;
        }

        static b a(y3<?, ?, ?> y3Var, int[] iArr, int[] iArr2) {
            return new b(y3Var.i().toArray(), y3Var.q2().toArray(), y3Var.values().toArray(), iArr, iArr2);
        }

        Object b() {
            Object[] objArr = this.f56651d;
            if (objArr.length == 0) {
                return o6.f56075h;
            }
            int i4 = 0;
            if (objArr.length == 1) {
                return new f6(this.f56649b[0], this.f56650c[0], objArr[0]);
            }
            f3.a aVar = new f3.a(objArr.length);
            while (true) {
                Object[] objArr2 = this.f56651d;
                if (i4 >= objArr2.length) {
                    return x5.E(aVar.e(), q3.F(this.f56649b), q3.F(this.f56650c));
                }
                aVar.j(y3.g(this.f56649b[this.f56652e[i4]], this.f56650c[this.f56653f[i4]], objArr2[i4]));
                i4++;
            }
        }
    }

    y3() {
    }

    public static <R, C, V> a<R, C, V> e() {
        return new a<>();
    }

    static <R, C, V> s6.a<R, C, V> g(R r4, C c5, V v4) {
        return t6.c(com.google.common.base.l0.F(r4, ProtectedSandApp.s("\uf4bd")), com.google.common.base.l0.F(c5, ProtectedSandApp.s("\uf4be")), com.google.common.base.l0.F(v4, ProtectedSandApp.s("\uf4bf")));
    }

    public static <R, C, V> y3<R, C, V> n(s6<? extends R, ? extends C, ? extends V> s6Var) {
        return s6Var instanceof y3 ? (y3) s6Var : o(s6Var.B1());
    }

    static <R, C, V> y3<R, C, V> o(Iterable<? extends s6.a<? extends R, ? extends C, ? extends V>> iterable) {
        a aVar = new a();
        Iterator<? extends s6.a<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            aVar.f(it.next());
        }
        return aVar.b();
    }

    public static <R, C, V> y3<R, C, V> s() {
        return (y3<R, C, V>) o6.f56075h;
    }

    public static <R, C, V> y3<R, C, V> t(R r4, C c5, V v4) {
        return new f6(r4, c5, v4);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ boolean A2(@zc.a Object obj) {
        return super.A2(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final V D1(R r4, C c5, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
        return L(obj, obj2) != null;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    public /* bridge */ /* synthetic */ Object L(@zc.a Object obj, @zc.a Object obj2) {
        return super.L(obj, obj2);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ boolean S(@zc.a Object obj) {
        return super.S(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean containsValue(@zc.a Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.q
    final Iterator<V> d() {
        throw new AssertionError(ProtectedSandApp.s("\uf4c0"));
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void e1(s6<? extends R, ? extends C, ? extends V> s6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean equals(@zc.a Object obj) {
        return t6.b(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final e7<s6.a<R, C, V>> a() {
        throw new AssertionError(ProtectedSandApp.s("\uf4c0"));
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public q3<s6.a<R, C, V>> B1() {
        return (q3) super.B1();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.s6
    /* renamed from: j */
    public h3<R, V> n1(C c5) {
        com.google.common.base.l0.F(c5, ProtectedSandApp.s("\uf4be"));
        return (h3) com.google.common.base.d0.a((h3) j1().get(c5), r5.f56307o);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public q3<C> q2() {
        return j1().keySet();
    }

    @Override // com.google.common.collect.s6
    /* renamed from: l */
    public abstract h3<C, Map<R, V>> j1();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q
    /* renamed from: p */
    public abstract q3<s6.a<R, C, V>> b();

    abstract b q();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q
    /* renamed from: r */
    public abstract b3<V> c();

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final V remove(@zc.a Object obj, @zc.a Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.s6
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public h3<C, V> i3(R r4) {
        com.google.common.base.l0.F(r4, ProtectedSandApp.s("\uf4bd"));
        return (h3) com.google.common.base.d0.a((h3) m().get(r4), r5.f56307o);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public q3<R> i() {
        return m().keySet();
    }

    @Override // com.google.common.collect.s6
    /* renamed from: w */
    public abstract h3<R, Map<C, V>> m();

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public b3<V> values() {
        return (b3) super.values();
    }

    final Object y() {
        return q();
    }
}
