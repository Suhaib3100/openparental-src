package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.engine.a;
import net.time4j.engine.j0;
import net.time4j.engine.n0;
import net.time4j.engine.w;

/* compiled from: AbstractMetric.java */
/* loaded from: classes7.dex */
public abstract class b<U extends w, P extends net.time4j.engine.a<U>> implements l0<U, P>, Comparator<U> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f82707d = 1000000;

    /* renamed from: e, reason: collision with root package name */
    private static final double f82708e = 1209600.0d;

    /* renamed from: b, reason: collision with root package name */
    private final List<U> f82709b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82710c;

    /* compiled from: AbstractMetric.java */
    /* renamed from: net.time4j.engine.b$b, reason: collision with other inner class name */
    private static class C1291b<U extends w, P extends net.time4j.engine.a<U>> implements l0<U, P> {

        /* renamed from: b, reason: collision with root package name */
        private final b<U, P> f82711b;

        /* renamed from: c, reason: collision with root package name */
        private final int f82712c;

        @Override // net.time4j.engine.l0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public <T extends m0<? super U, T>> P a(T t4, T t5) {
            return (P) this.f82711b.n(t4, t5, this.f82712c);
        }

        @Override // net.time4j.engine.l0
        public l0<U, P> d() {
            return this;
        }

        private C1291b(b<U, P> bVar) {
            this.f82711b = bVar;
            int size = ((b) bVar).f82709b.size() - 1;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                } else if (Double.compare(((w) ((b) this.f82711b).f82709b.get(size)).getLength(), b.f82708e) > 0) {
                    break;
                } else {
                    size--;
                }
            }
            this.f82712c = size;
        }
    }

    protected b(boolean z4, U... uArr) {
        this(Arrays.asList(uArr), z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends m0<? super U, T>> double B(j0<? super U, T> j0Var, U u4) {
        return j0Var.u0(u4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends m0<? super U, T>> void C(j0<? super U, T> j0Var, List<U> list, List<n0.a<U>> list2) {
        n0.a z4;
        j0Var.getClass();
        j0.b bVar = new j0.b();
        for (int size = list.size() - 1; size >= 0; size--) {
            if (size > 0) {
                U u4 = list.get(size);
                U u5 = list.get(size - 1);
                long y4 = y(j0Var, u5, u4);
                if (y4 < 1000000 && j0Var.C0(u5, u4) && (z4 = z(list2, u4)) != null) {
                    long a5 = z4.a();
                    long j4 = a5 / y4;
                    if (j4 > 0) {
                        long j5 = a5 % y4;
                        if (j5 == 0) {
                            E(list2, u4);
                        } else {
                            D(list2, bVar, j5, u4);
                        }
                        n0.a z5 = z(list2, u5);
                        if (z5 == null) {
                            D(list2, bVar, j4, u5);
                        } else {
                            D(list2, bVar, net.time4j.base.c.f(z5.a(), j4), u5);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <U> void D(List<n0.a<U>> list, Comparator<? super U> comparator, long j4, U u4) {
        n0.a<U> c5 = n0.a.c(j4, u4);
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            U b5 = list.get(i5).b();
            if (b5.equals(u4)) {
                list.set(i5, c5);
                return;
            }
            if (i4 == i5 && comparator.compare(b5, u4) < 0) {
                i4++;
            }
        }
        list.add(i4, c5);
    }

    private static <U> void E(List<n0.a<U>> list, U u4) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (list.get(i4).b().equals(u4)) {
                list.remove(i4);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends m0<? super U, T>> P n(T t4, T t5, int i4) {
        T t6;
        boolean z4;
        T t7 = t5;
        if (t7.equals(t4)) {
            return t();
        }
        int i5 = 0;
        if (t4.compareTo(t5) > 0) {
            t6 = t4;
            z4 = true;
        } else {
            t6 = t7;
            z4 = false;
            t7 = t4;
        }
        ArrayList arrayList = new ArrayList(10);
        j0<? super U, T> y4 = t4.y();
        int size = this.f82709b.size();
        while (i5 < size) {
            U u4 = this.f82709b.get(i5);
            if (y4.u0(u4) >= 1.0d || i5 >= size - 1) {
                int i6 = i5 + 1;
                long j4 = 1;
                while (i6 < size) {
                    U u5 = this.f82709b.get(i6);
                    j4 *= y(y4, u4, u5);
                    if (j4 >= 1000000 || !y4.C0(u4, u5)) {
                        break;
                    }
                    i6++;
                    u4 = u5;
                }
                i5 = i6 - 1;
                long Y = t7.Y(t6, u4);
                if (Y < 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("鋷\u0001"));
                }
                for (long j5 = 0; Y > j5; j5 = 0) {
                    m0 W = t7.W(Y, u4);
                    if (i5 > i4 || i5 == size - 1 || W.U(Y, u4).equals(t7)) {
                        arrayList.add(F(n0.a.c(Y, u4)));
                        t7 = W;
                        break;
                    }
                    Y--;
                }
            }
            i5++;
        }
        if (this.f82710c) {
            C(y4, this.f82709b, arrayList);
        }
        return u(arrayList, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends m0<? super U, T>> long y(j0<? super U, T> j0Var, U u4, U u5) {
        return Math.round(j0Var.u0(u4) / j0Var.u0(u5));
    }

    private static <U> n0.a<U> z(List<n0.a<U>> list, U u4) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            n0.a<U> aVar = list.get(i4);
            if (aVar.b().equals(u4)) {
                return aVar;
            }
        }
        return null;
    }

    protected n0.a<U> F(n0.a<U> aVar) {
        return aVar;
    }

    @Override // net.time4j.engine.l0
    public l0<U, P> d() {
        return new C1291b();
    }

    @Override // net.time4j.engine.l0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public <T extends m0<? super U, T>> P a(T t4, T t5) {
        return n(t4, t5, -1);
    }

    @Override // java.util.Comparator
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compare(U u4, U u5) {
        return Double.compare(u5.getLength(), u4.getLength());
    }

    protected abstract P t();

    protected abstract P u(List<n0.a<U>> list, boolean z4);

    protected b(boolean z4, Collection<? extends U> collection) {
        this(new ArrayList(collection), z4);
    }

    private b(List<U> list, boolean z4) {
        if (!list.isEmpty()) {
            Collections.sort(list, this);
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                U u4 = list.get(i4);
                i4++;
                for (int i5 = i4; i5 < size; i5++) {
                    if (u4.equals(list.get(i5))) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("鋵\u0001") + u4);
                    }
                }
            }
            this.f82709b = Collections.unmodifiableList(list);
            this.f82710c = z4;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鋶\u0001"));
    }
}
