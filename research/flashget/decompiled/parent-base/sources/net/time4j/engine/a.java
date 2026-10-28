package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import net.time4j.engine.n0;
import net.time4j.engine.w;

/* compiled from: AbstractDuration.java */
/* loaded from: classes7.dex */
public abstract class a<U extends w> implements n0<U> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f82706b = 1000000;

    private <T extends m0<? super U, T>> T g(T t4, n0<U> n0Var, boolean z4) {
        j0 y4 = t4.y();
        List<n0.a<U>> f4 = n0Var.f();
        boolean d5 = n0Var.d();
        if (z4) {
            d5 = !n0Var.d();
        }
        if (d5) {
            int size = f4.size() - 1;
            T t5 = t4;
            while (size >= 0) {
                n0.a<U> aVar = f4.get(size);
                U b5 = aVar.b();
                long a5 = aVar.a();
                size--;
                while (size >= 0) {
                    n0.a<U> aVar2 = f4.get(size);
                    U b6 = aVar2.b();
                    long a6 = aVar2.a();
                    long i4 = i(y4, b6, b5);
                    if (!Double.isNaN(i4) && a6 < 2147483647L && i4 > 1 && i4 < 1000000 && y4.C0(b6, b5)) {
                        a5 = net.time4j.base.c.f(a5, net.time4j.base.c.i(a6, i4));
                        size--;
                    }
                    t5 = (T) t5.W(net.time4j.base.c.k(a5), b5);
                }
                t5 = (T) t5.W(net.time4j.base.c.k(a5), b5);
            }
            return t5;
        }
        int size2 = f4.size();
        int i5 = 0;
        m0 m0Var = t4;
        while (i5 < size2) {
            n0.a<U> aVar3 = f4.get(i5);
            U b7 = aVar3.b();
            long a7 = aVar3.a();
            i5++;
            while (i5 < size2) {
                n0.a<U> aVar4 = f4.get(i5);
                U b10 = aVar4.b();
                long i6 = i(y4, b7, b10);
                if (!Double.isNaN(i6)) {
                    if (a7 >= 2147483647L) {
                        break;
                    }
                    if (i6 <= 1) {
                        break;
                    }
                    if (i6 < 1000000 && y4.C0(b7, b10)) {
                        a7 = net.time4j.base.c.f(aVar4.a(), net.time4j.base.c.i(a7, i6));
                        i5++;
                        b7 = b10;
                    }
                    m0Var = m0Var.W(a7, b7);
                } else {
                    break;
                }
            }
            m0Var = m0Var.W(a7, b7);
        }
        return (T) m0Var;
    }

    private static <U> long i(j0<U, ?> j0Var, U u4, U u5) {
        return Math.round(j0Var.u0(u4) / j0Var.u0(u5));
    }

    @Override // net.time4j.engine.n0
    public final <T extends m0<? super U, T>> T a(T t4) {
        return (T) g(t4, this, true);
    }

    @Override // net.time4j.engine.n0
    public final <T extends m0<? super U, T>> T b(T t4) {
        return (T) g(t4, this, false);
    }

    @Override // net.time4j.engine.n0
    public boolean c() {
        return (d() || isEmpty()) ? false : true;
    }

    @Override // net.time4j.engine.n0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean contains(U u4) {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            n0.a aVar = (n0.a) it.next();
            if (aVar.b().equals(u4)) {
                return aVar.a() > 0;
            }
        }
        return false;
    }

    @Override // net.time4j.engine.n0
    public boolean isEmpty() {
        List<n0.a<U>> f4 = f();
        int size = f4.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((n0.a) f4.get(i4)).a() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // net.time4j.engine.n0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public long e(U u4) {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            n0.a aVar = (n0.a) it.next();
            if (aVar.b().equals(u4)) {
                return aVar.a();
            }
        }
        return 0L;
    }

    public abstract a<U> k();

    public String toString() {
        if (isEmpty()) {
            return ProtectedSandApp.s("鋫\u0001");
        }
        StringBuilder sb = new StringBuilder();
        if (d()) {
            sb.append('-');
        }
        sb.append('P');
        int size = f().size();
        for (int i4 = 0; i4 < size; i4++) {
            n0.a aVar = (n0.a) f().get(i4);
            if (i4 > 0) {
                sb.append(',');
            }
            sb.append(aVar.a());
            sb.append('{');
            sb.append(aVar.b());
            sb.append('}');
        }
        return sb.toString();
    }
}
