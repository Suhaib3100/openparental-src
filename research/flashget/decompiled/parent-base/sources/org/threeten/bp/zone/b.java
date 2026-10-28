package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.s;
import org.threeten.bp.zone.f;

/* compiled from: StandardZoneRules.java */
/* loaded from: classes9.dex */
final class b extends f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long f88414i = 3044319355680032515L;

    /* renamed from: j, reason: collision with root package name */
    private static final int f88415j = 2100;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f88416b;

    /* renamed from: c, reason: collision with root package name */
    private final s[] f88417c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f88418d;

    /* renamed from: e, reason: collision with root package name */
    private final org.threeten.bp.h[] f88419e;

    /* renamed from: f, reason: collision with root package name */
    private final s[] f88420f;

    /* renamed from: g, reason: collision with root package name */
    private final e[] f88421g;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentMap<Integer, d[]> f88422h = new ConcurrentHashMap();

    b(s sVar, s sVar2, List<d> list, List<d> list2, List<e> list3) {
        this.f88416b = new long[list.size()];
        s[] sVarArr = new s[list.size() + 1];
        this.f88417c = sVarArr;
        sVarArr[0] = sVar;
        int i4 = 0;
        while (i4 < list.size()) {
            this.f88416b[i4] = list.get(i4).o();
            int i5 = i4 + 1;
            this.f88417c[i5] = list.get(i4).g();
            i4 = i5;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sVar2);
        for (d dVar : list2) {
            if (dVar.j()) {
                arrayList.add(dVar.c());
                arrayList.add(dVar.b());
            } else {
                arrayList.add(dVar.b());
                arrayList.add(dVar.c());
            }
            arrayList2.add(dVar.g());
        }
        this.f88419e = (org.threeten.bp.h[]) arrayList.toArray(new org.threeten.bp.h[arrayList.size()]);
        this.f88420f = (s[]) arrayList2.toArray(new s[arrayList2.size()]);
        this.f88418d = new long[list2.size()];
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.f88418d[i6] = list2.get(i6).f().q();
        }
        if (list3.size() > 15) {
            throw new IllegalArgumentException("Too many transition rules");
        }
        this.f88421g = (e[]) list3.toArray(new e[list3.size()]);
    }

    private Object p(org.threeten.bp.h hVar, d dVar) {
        org.threeten.bp.h c5 = dVar.c();
        return dVar.j() ? hVar.r(c5) ? dVar.h() : hVar.r(dVar.b()) ? dVar : dVar.g() : !hVar.r(c5) ? dVar.g() : hVar.r(dVar.b()) ? dVar.h() : dVar;
    }

    private d[] q(int i4) {
        Integer valueOf = Integer.valueOf(i4);
        d[] dVarArr = this.f88422h.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f88421g;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i5 = 0; i5 < eVarArr.length; i5++) {
            dVarArr2[i5] = eVarArr[i5].b(i4);
        }
        if (i4 < f88415j) {
            this.f88422h.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    private int r(long j4, s sVar) {
        return org.threeten.bp.g.z0(ng.d.e(j4 + sVar.v(), 86400L)).i0();
    }

    private Object s(org.threeten.bp.h hVar) {
        int i4 = 0;
        if (this.f88421g.length > 0) {
            org.threeten.bp.h[] hVarArr = this.f88419e;
            if (hVarArr.length == 0 || hVar.q(hVarArr[hVarArr.length - 1])) {
                d[] q4 = q(hVar.a0());
                int length = q4.length;
                Object obj = null;
                while (i4 < length) {
                    d dVar = q4[i4];
                    Object p4 = p(hVar, dVar);
                    if ((p4 instanceof d) || p4.equals(dVar.h())) {
                        return p4;
                    }
                    i4++;
                    obj = p4;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f88419e, hVar);
        if (binarySearch == -1) {
            return this.f88420f[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            Object[] objArr = this.f88419e;
            if (binarySearch < objArr.length - 1) {
                int i5 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i5])) {
                    binarySearch = i5;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.f88420f[(binarySearch / 2) + 1];
        }
        org.threeten.bp.h[] hVarArr2 = this.f88419e;
        org.threeten.bp.h hVar2 = hVarArr2[binarySearch];
        org.threeten.bp.h hVar3 = hVarArr2[binarySearch + 1];
        s[] sVarArr = this.f88420f;
        int i6 = binarySearch / 2;
        s sVar = sVarArr[i6];
        s sVar2 = sVarArr[i6 + 1];
        return sVar2.v() > sVar.v() ? new d(hVar2, sVar, sVar2) : new d(hVar3, sVar, sVar2);
    }

    static b t(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i4 = 0; i4 < readInt; i4++) {
            jArr[i4] = a.b(dataInput);
        }
        int i5 = readInt + 1;
        s[] sVarArr = new s[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            sVarArr[i6] = a.d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i7 = 0; i7 < readInt2; i7++) {
            jArr2[i7] = a.b(dataInput);
        }
        int i10 = readInt2 + 1;
        s[] sVarArr2 = new s[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sVarArr2[i11] = a.d(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = new e[readByte];
        for (int i12 = 0; i12 < readByte; i12++) {
            eVarArr[i12] = e.m(dataInput);
        }
        return new b(jArr, sVarArr, jArr2, sVarArr2, eVarArr);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // org.threeten.bp.zone.f
    public org.threeten.bp.e a(org.threeten.bp.f fVar) {
        return org.threeten.bp.e.K(b(fVar).v() - d(fVar).v());
    }

    @Override // org.threeten.bp.zone.f
    public s b(org.threeten.bp.f fVar) {
        long q4 = fVar.q();
        if (this.f88421g.length > 0) {
            long[] jArr = this.f88418d;
            if (jArr.length == 0 || q4 > jArr[jArr.length - 1]) {
                d[] q5 = q(r(q4, this.f88420f[r7.length - 1]));
                d dVar = null;
                for (int i4 = 0; i4 < q5.length; i4++) {
                    dVar = q5[i4];
                    if (q4 < dVar.o()) {
                        return dVar.h();
                    }
                }
                return dVar.g();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f88418d, q4);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f88420f[binarySearch + 1];
    }

    @Override // org.threeten.bp.zone.f
    public s c(org.threeten.bp.h hVar) {
        Object s4 = s(hVar);
        return s4 instanceof d ? ((d) s4).h() : (s) s4;
    }

    @Override // org.threeten.bp.zone.f
    public s d(org.threeten.bp.f fVar) {
        int binarySearch = Arrays.binarySearch(this.f88416b, fVar.q());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f88417c[binarySearch + 1];
    }

    @Override // org.threeten.bp.zone.f
    public d e(org.threeten.bp.h hVar) {
        Object s4 = s(hVar);
        if (s4 instanceof d) {
            return (d) s4;
        }
        return null;
    }

    @Override // org.threeten.bp.zone.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.f88416b, bVar.f88416b) && Arrays.equals(this.f88417c, bVar.f88417c) && Arrays.equals(this.f88418d, bVar.f88418d) && Arrays.equals(this.f88420f, bVar.f88420f) && Arrays.equals(this.f88421g, bVar.f88421g);
        }
        if (!(obj instanceof f.a)) {
            return false;
        }
        if (j()) {
            org.threeten.bp.f fVar = org.threeten.bp.f.f88077d;
            if (b(fVar).equals(((f.a) obj).b(fVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.zone.f
    public List<e> f() {
        return Collections.unmodifiableList(Arrays.asList(this.f88421g));
    }

    @Override // org.threeten.bp.zone.f
    public List<d> g() {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            long[] jArr = this.f88418d;
            if (i4 >= jArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            long j4 = jArr[i4];
            s[] sVarArr = this.f88420f;
            s sVar = sVarArr[i4];
            i4++;
            arrayList.add(new d(j4, sVar, sVarArr[i4]));
        }
    }

    @Override // org.threeten.bp.zone.f
    public List<s> h(org.threeten.bp.h hVar) {
        Object s4 = s(hVar);
        return s4 instanceof d ? ((d) s4).i() : Collections.singletonList((s) s4);
    }

    @Override // org.threeten.bp.zone.f
    public int hashCode() {
        return (((Arrays.hashCode(this.f88416b) ^ Arrays.hashCode(this.f88417c)) ^ Arrays.hashCode(this.f88418d)) ^ Arrays.hashCode(this.f88420f)) ^ Arrays.hashCode(this.f88421g);
    }

    @Override // org.threeten.bp.zone.f
    public boolean i(org.threeten.bp.f fVar) {
        return !d(fVar).equals(b(fVar));
    }

    @Override // org.threeten.bp.zone.f
    public boolean j() {
        return this.f88418d.length == 0 && this.f88421g.length == 0 && this.f88420f[0].equals(this.f88417c[0]);
    }

    @Override // org.threeten.bp.zone.f
    public boolean k(org.threeten.bp.h hVar, s sVar) {
        return h(hVar).contains(sVar);
    }

    @Override // org.threeten.bp.zone.f
    public d l(org.threeten.bp.f fVar) {
        if (this.f88418d.length == 0) {
            return null;
        }
        long q4 = fVar.q();
        long[] jArr = this.f88418d;
        if (q4 < jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, q4);
            int i4 = binarySearch < 0 ? (-binarySearch) - 1 : binarySearch + 1;
            long j4 = this.f88418d[i4];
            s[] sVarArr = this.f88420f;
            return new d(j4, sVarArr[i4], sVarArr[i4 + 1]);
        }
        if (this.f88421g.length == 0) {
            return null;
        }
        int r4 = r(q4, this.f88420f[r11.length - 1]);
        for (d dVar : q(r4)) {
            if (q4 < dVar.o()) {
                return dVar;
            }
        }
        if (r4 < 999999999) {
            return q(r4 + 1)[0];
        }
        return null;
    }

    @Override // org.threeten.bp.zone.f
    public d o(org.threeten.bp.f fVar) {
        if (this.f88418d.length == 0) {
            return null;
        }
        long q4 = fVar.q();
        if (fVar.r() > 0 && q4 < Long.MAX_VALUE) {
            q4++;
        }
        long j4 = this.f88418d[r11.length - 1];
        if (this.f88421g.length > 0 && q4 > j4) {
            s sVar = this.f88420f[r11.length - 1];
            int r4 = r(q4, sVar);
            d[] q5 = q(r4);
            for (int length = q5.length - 1; length >= 0; length--) {
                if (q4 > q5[length].o()) {
                    return q5[length];
                }
            }
            int i4 = r4 - 1;
            if (i4 > r(j4, sVar)) {
                return q(i4)[r11.length - 1];
            }
        }
        int binarySearch = Arrays.binarySearch(this.f88418d, q4);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch <= 0) {
            return null;
        }
        int i5 = binarySearch - 1;
        long j5 = this.f88418d[i5];
        s[] sVarArr = this.f88420f;
        return new d(j5, sVarArr[i5], sVarArr[binarySearch]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StandardZoneRules[currentStandardOffset=");
        sb.append(this.f88417c[r1.length - 1]);
        sb.append("]");
        return sb.toString();
    }

    void u(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f88416b.length);
        for (long j4 : this.f88416b) {
            a.f(j4, dataOutput);
        }
        for (s sVar : this.f88417c) {
            a.h(sVar, dataOutput);
        }
        dataOutput.writeInt(this.f88418d.length);
        for (long j5 : this.f88418d) {
            a.f(j5, dataOutput);
        }
        for (s sVar2 : this.f88420f) {
            a.h(sVar2, dataOutput);
        }
        dataOutput.writeByte(this.f88421g.length);
        for (e eVar : this.f88421g) {
            eVar.n(dataOutput);
        }
    }

    private b(long[] jArr, s[] sVarArr, long[] jArr2, s[] sVarArr2, e[] eVarArr) {
        this.f88416b = jArr;
        this.f88417c = sVarArr;
        this.f88418d = jArr2;
        this.f88420f = sVarArr2;
        this.f88421g = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < jArr2.length) {
            int i5 = i4 + 1;
            d dVar = new d(jArr2[i4], sVarArr2[i4], sVarArr2[i5]);
            if (dVar.j()) {
                arrayList.add(dVar.c());
                arrayList.add(dVar.b());
            } else {
                arrayList.add(dVar.b());
                arrayList.add(dVar.c());
            }
            i4 = i5;
        }
        this.f88419e = (org.threeten.bp.h[]) arrayList.toArray(new org.threeten.bp.h[arrayList.size()]);
    }
}
