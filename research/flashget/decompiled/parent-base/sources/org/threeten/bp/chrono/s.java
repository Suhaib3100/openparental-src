package org.threeten.bp.chrono;

import androidx.compose.animation.core.k1;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.DateTimeException;

/* compiled from: JapaneseEra.java */
/* loaded from: classes9.dex */
public final class s extends ng.a implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    static final int f88028e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final s f88029f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f88030g;

    /* renamed from: h, reason: collision with root package name */
    public static final s f88031h;

    /* renamed from: i, reason: collision with root package name */
    public static final s f88032i;

    /* renamed from: j, reason: collision with root package name */
    public static final s f88033j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f88034k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final long f88035l = 1466499369062886794L;

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicReference<s[]> f88036m;

    /* renamed from: b, reason: collision with root package name */
    private final int f88037b;

    /* renamed from: c, reason: collision with root package name */
    private final transient org.threeten.bp.g f88038c;

    /* renamed from: d, reason: collision with root package name */
    private final transient String f88039d;

    static {
        s sVar = new s(-1, org.threeten.bp.g.x0(1868, 9, 8), "Meiji");
        f88029f = sVar;
        s sVar2 = new s(0, org.threeten.bp.g.x0(1912, 7, 30), "Taisho");
        f88030g = sVar2;
        s sVar3 = new s(1, org.threeten.bp.g.x0(1926, 12, 25), "Showa");
        f88031h = sVar3;
        s sVar4 = new s(2, org.threeten.bp.g.x0(1989, 1, 8), "Heisei");
        f88032i = sVar4;
        s sVar5 = new s(3, org.threeten.bp.g.x0(2019, 5, 1), "Reiwa");
        f88033j = sVar5;
        f88036m = new AtomicReference<>(new s[]{sVar, sVar2, sVar3, sVar4, sVar5});
    }

    private s(int i4, org.threeten.bp.g gVar, String str) {
        this.f88037b = i4;
        this.f88038c = gVar;
        this.f88039d = str;
    }

    static s m(org.threeten.bp.g gVar) {
        if (gVar.s(f88029f.f88038c)) {
            throw new DateTimeException("Date too early: " + gVar);
        }
        s[] sVarArr = f88036m.get();
        for (int length = sVarArr.length - 1; length >= 0; length--) {
            s sVar = sVarArr[length];
            if (gVar.compareTo(sVar.f88038c) >= 0) {
                return sVar;
            }
        }
        return null;
    }

    public static s n(int i4) {
        s[] sVarArr = f88036m.get();
        if (i4 < f88029f.f88037b || i4 > sVarArr[sVarArr.length - 1].f88037b) {
            throw new DateTimeException("japaneseEra is invalid");
        }
        return sVarArr[i4 + 1];
    }

    private static int o(int i4) {
        return i4 + 1;
    }

    static s p(DataInput dataInput) throws IOException {
        return n(dataInput.readByte());
    }

    public static s q(org.threeten.bp.g gVar, String str) {
        AtomicReference<s[]> atomicReference = f88036m;
        s[] sVarArr = atomicReference.get();
        if (sVarArr.length > 5) {
            throw new DateTimeException("Only one additional Japanese era can be added");
        }
        ng.d.j(gVar, "since");
        ng.d.j(str, "name");
        if (!gVar.r(f88033j.f88038c)) {
            throw new DateTimeException("Invalid since date for additional Japanese era, must be after Reiwa");
        }
        s sVar = new s(4, gVar, str);
        s[] sVarArr2 = (s[]) Arrays.copyOf(sVarArr, 6);
        sVarArr2[5] = sVar;
        if (k1.a(atomicReference, sVarArr, sVarArr2)) {
            return sVar;
        }
        throw new DateTimeException("Only one additional Japanese era can be added");
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return n(this.f88037b);
        } catch (DateTimeException e4) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e4);
            throw invalidObjectException;
        }
    }

    public static s s(String str) {
        ng.d.j(str, "japaneseEra");
        for (s sVar : f88036m.get()) {
            if (str.equals(sVar.f88039d)) {
                return sVar;
            }
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Era not found: ", str));
    }

    public static s[] t() {
        s[] sVarArr = f88036m.get();
        return (s[]) Arrays.copyOf(sVarArr, sVarArr.length);
    }

    private Object writeReplace() {
        return new w((byte) 2, this);
    }

    @Override // org.threeten.bp.chrono.k
    public int getValue() {
        return this.f88037b;
    }

    org.threeten.bp.g l() {
        int i4 = this.f88037b;
        int i5 = i4 + 1;
        s[] t4 = t();
        return i5 >= t4.length + (-1) ? org.threeten.bp.g.f88224g : t4[i4 + 2].f88038c.m0(1L);
    }

    org.threeten.bp.g r() {
        return this.f88038c;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
        return jVar == aVar ? q.f88014g.B(aVar) : super.range(jVar);
    }

    public String toString() {
        return this.f88039d;
    }

    void u(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f88037b);
    }
}
