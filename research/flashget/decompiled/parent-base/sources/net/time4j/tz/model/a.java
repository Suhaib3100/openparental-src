package net.time4j.tz.model;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.d0;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* compiled from: ArrayTransitionModel.java */
/* loaded from: classes7.dex */
final class a extends l {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f83594g = false;
    private static final long serialVersionUID = -5264909488983076587L;

    /* renamed from: c, reason: collision with root package name */
    private final transient q[] f83595c;

    /* renamed from: d, reason: collision with root package name */
    private final transient boolean f83596d;

    /* renamed from: e, reason: collision with root package name */
    private final transient List<q> f83597e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f83598f;

    a(List<q> list, boolean z4, boolean z5) {
        this.f83598f = 0;
        if (list.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("飸\u0001"));
        }
        q[] qVarArr = (q[]) list.toArray(new q[list.size()]);
        boolean z6 = false;
        for (q qVar : qVarArr) {
            z6 = z6 || qVar.d() < 0;
        }
        this.f83596d = z6;
        if (z4) {
            Arrays.sort(qVarArr);
        }
        if (z5) {
            t(qVarArr, list);
        }
        this.f83595c = qVarArr;
        this.f83597e = y(qVarArr, 0L, l.l(1));
    }

    private static int B(long j4, q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) / 2;
            if (qVarArr[i5].e() <= j4) {
                i4 = i5 + 1;
            } else {
                length = i5 - 1;
            }
        }
        return i4;
    }

    private static int C(long j4, q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) / 2;
            if (qVarArr[i5].e() + Math.max(r3.i(), r3.f()) <= j4) {
                i4 = i5 + 1;
            } else {
                length = i5 - 1;
            }
        }
        return i4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("飹\u0001"));
    }

    private static void t(q[] qVarArr, List<q> list) {
        int i4 = qVarArr[0].i();
        for (int i5 = 1; i5 < qVarArr.length; i5++) {
            if (i4 != qVarArr[i5].f()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("飺\u0001") + d0.W0(qVarArr[i5].e(), net.time4j.scale.f.POSIX) + ProtectedSandApp.s("飻\u0001") + qVarArr[i5].e() + ProtectedSandApp.s("飼\u0001") + list);
            }
            i4 = qVarArr[i5].i();
        }
    }

    private Object writeReplace() {
        return new SPX(this, 126);
    }

    private static List<q> y(q[] qVarArr, long j4, long j5) {
        if (j4 > j5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("飽\u0001"));
        }
        int B = B(j4, qVarArr);
        int B2 = B(j5, qVarArr);
        if (B2 == 0) {
            return Collections.emptyList();
        }
        if (B > 0 && qVarArr[B - 1].e() == j4) {
            B--;
        }
        int i4 = B2 - 1;
        if (qVarArr[i4].e() == j5) {
            i4 = B2 - 2;
        }
        if (B > i4) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList((i4 - B) + 1);
        while (B <= i4) {
            arrayList.add(qVarArr[B]);
            B++;
        }
        return Collections.unmodifiableList(arrayList);
    }

    int A(int i4) {
        int min = Math.min(i4, this.f83595c.length);
        q[] qVarArr = new q[min];
        System.arraycopy(this.f83595c, 0, qVarArr, 0, min);
        return Arrays.hashCode(qVarArr);
    }

    void D(int i4, ObjectOutput objectOutput) throws IOException {
        SPX.z(this.f83595c, i4, objectOutput);
    }

    void E(ObjectOutput objectOutput) throws IOException {
        D(this.f83595c.length, objectOutput);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return w(aVar, gVar, null);
    }

    @Override // net.time4j.tz.m
    public List<q> b() {
        return this.f83597e;
    }

    @Override // net.time4j.tz.m
    public List<q> c(net.time4j.base.f fVar, net.time4j.base.f fVar2) {
        return y(this.f83595c, fVar.j(), fVar2.j());
    }

    @Override // net.time4j.tz.m
    public q d(net.time4j.base.f fVar) {
        int B = B(fVar.j(), this.f83595c);
        if (B == 0) {
            return null;
        }
        return this.f83595c[B - 1];
    }

    @Override // net.time4j.tz.model.l, net.time4j.tz.m
    public boolean e() {
        return this.f83596d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.equals(this.f83595c, ((a) obj).f83595c);
        }
        return false;
    }

    @Override // net.time4j.tz.m
    public p f() {
        return p.o(this.f83595c[0].f());
    }

    @Override // net.time4j.tz.m
    public void g(Appendable appendable) throws IOException {
        u(this.f83595c.length, appendable);
    }

    @Override // net.time4j.tz.m
    public List<p> h(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return z(aVar, gVar, null);
    }

    public int hashCode() {
        int i4 = this.f83598f;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.f83595c);
        this.f83598f = hashCode;
        return hashCode;
    }

    @Override // net.time4j.tz.m
    public q i(net.time4j.base.f fVar) {
        int B = B(fVar.j(), this.f83595c);
        q[] qVarArr = this.f83595c;
        if (B == qVarArr.length) {
            return null;
        }
        return qVarArr[B];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        m2.a(a.class, sb, ProtectedSandApp.s("飾\u0001"));
        sb.append(this.f83595c.length);
        sb.append(ProtectedSandApp.s("飿\u0001"));
        return androidx.view.e.a(sb, hashCode(), ']');
    }

    void u(int i4, Appendable appendable) throws IOException {
        for (int i5 = 0; i5 < i4; i5++) {
            l.j(this.f83595c[i5], appendable);
        }
    }

    boolean v(a aVar, int i4, int i5) {
        int min = Math.min(i4, this.f83595c.length);
        if (min != Math.min(i5, aVar.f83595c.length)) {
            return false;
        }
        for (int i6 = 0; i6 < min; i6++) {
            if (!this.f83595c[i6].equals(aVar.f83595c[i6])) {
                return false;
            }
        }
        return true;
    }

    q w(net.time4j.base.a aVar, net.time4j.base.g gVar, j jVar) {
        long s4 = l.s(aVar, gVar);
        int C = C(s4, this.f83595c);
        q[] qVarArr = this.f83595c;
        if (C == qVarArr.length) {
            if (jVar == null) {
                return null;
            }
            return jVar.t(aVar, s4);
        }
        q qVar = qVarArr[C];
        if (qVar.j()) {
            if (qVar.e() + qVar.f() <= s4) {
                return qVar;
            }
        } else if (qVar.k() && qVar.e() + qVar.i() <= s4) {
            return qVar;
        }
        return null;
    }

    q x() {
        return this.f83595c[r0.length - 1];
    }

    List<p> z(net.time4j.base.a aVar, net.time4j.base.g gVar, j jVar) {
        long s4 = l.s(aVar, gVar);
        int C = C(s4, this.f83595c);
        q[] qVarArr = this.f83595c;
        if (C == qVarArr.length) {
            return jVar == null ? l.q(qVarArr[qVarArr.length - 1].i()) : jVar.C(aVar, s4);
        }
        q qVar = qVarArr[C];
        if (qVar.j()) {
            if (qVar.e() + qVar.f() <= s4) {
                return Collections.emptyList();
            }
        } else if (qVar.k() && qVar.e() + qVar.i() <= s4) {
            return l.r(qVar.i(), qVar.f());
        }
        return l.q(qVar.f());
    }

    a(List<q> list) {
        this(list, true, true);
    }
}
