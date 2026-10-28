package org.threeten.bp;

import androidx.collection.r2;
import androidx.constraintlayout.core.motion.utils.w;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: ZoneOffset.java */
/* loaded from: classes9.dex */
public final class s extends r implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g, Comparable<s>, Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final int f88332j = 3600;

    /* renamed from: k, reason: collision with root package name */
    private static final int f88333k = 60;

    /* renamed from: l, reason: collision with root package name */
    private static final int f88334l = 60;

    /* renamed from: n, reason: collision with root package name */
    private static final long f88336n = 2357656521762053153L;

    /* renamed from: e, reason: collision with root package name */
    private final int f88340e;

    /* renamed from: f, reason: collision with root package name */
    private final transient String f88341f;

    /* renamed from: g, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<s> f88329g = new a();

    /* renamed from: h, reason: collision with root package name */
    private static final ConcurrentMap<Integer, s> f88330h = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap<String, s> f88331i = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final s f88337o = A(0);

    /* renamed from: p, reason: collision with root package name */
    public static final s f88338p = A(-64800);

    /* renamed from: m, reason: collision with root package name */
    private static final int f88335m = 64800;

    /* renamed from: q, reason: collision with root package name */
    public static final s f88339q = A(f88335m);

    /* compiled from: ZoneOffset.java */
    class a implements org.threeten.bp.temporal.l<s> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(org.threeten.bp.temporal.f fVar) {
            return s.u(fVar);
        }
    }

    private s(int i4) {
        this.f88340e = i4;
        this.f88341f = s(i4);
    }

    public static s A(int i4) {
        if (Math.abs(i4) > f88335m) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i4 % w.b.f22438j != 0) {
            return new s(i4);
        }
        Integer valueOf = Integer.valueOf(i4);
        ConcurrentMap<Integer, s> concurrentMap = f88330h;
        s sVar = concurrentMap.get(valueOf);
        if (sVar != null) {
            return sVar;
        }
        concurrentMap.putIfAbsent(valueOf, new s(i4));
        s sVar2 = concurrentMap.get(valueOf);
        f88331i.putIfAbsent(sVar2.f88341f, sVar2);
        return sVar2;
    }

    private static int B(CharSequence charSequence, int i4, boolean z4) {
        if (z4 && charSequence.charAt(i4 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i4);
        char charAt2 = charSequence.charAt(i4 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    static s C(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? A(dataInput.readInt()) : A(readByte * 900);
    }

    private static int E(int i4, int i5, int i6) {
        return (i5 * 60) + (i4 * 3600) + i6;
    }

    private static void G(int i4, int i5, int i6) {
        if (i4 < -18 || i4 > 18) {
            throw new DateTimeException(r2.a("Zone offset hours not in valid range: value ", i4, " is not in the range -18 to 18"));
        }
        if (i4 > 0) {
            if (i5 < 0 || i6 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i4 < 0) {
            if (i5 > 0 || i6 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i5 > 0 && i6 < 0) || (i5 < 0 && i6 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i5) > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i5) + " is not in the range 0 to 59");
        }
        if (Math.abs(i6) > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i6) + " is not in the range 0 to 59");
        }
        if (Math.abs(i4) == 18) {
            if (Math.abs(i5) > 0 || Math.abs(i6) > 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static String s(int i4) {
        if (i4 == 0) {
            return "Z";
        }
        int abs = Math.abs(i4);
        StringBuilder sb = new StringBuilder();
        int i5 = abs / 3600;
        int i6 = (abs / 60) % 60;
        sb.append(i4 < 0 ? "-" : "+");
        sb.append(i5 < 10 ? "0" : "");
        sb.append(i5);
        sb.append(i6 < 10 ? ":0" : ":");
        sb.append(i6);
        int i7 = abs % 60;
        if (i7 != 0) {
            sb.append(i7 < 10 ? ":0" : ":");
            sb.append(i7);
        }
        return sb.toString();
    }

    public static s u(org.threeten.bp.temporal.f fVar) {
        s sVar = (s) fVar.query(org.threeten.bp.temporal.k.d());
        if (sVar != null) {
            return sVar;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.threeten.bp.s w(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            ng.d.j(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.s> r0 = org.threeten.bp.s.f88331i
            java.lang.Object r0 = r0.get(r7)
            org.threeten.bp.s r0 = (org.threeten.bp.s) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = B(r7, r2, r3)
            int r1 = B(r7, r6, r2)
            int r2 = B(r7, r5, r2)
            goto L85
        L37:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = B(r7, r2, r3)
            int r1 = B(r7, r1, r3)
            int r2 = B(r7, r4, r3)
            goto L85
        L50:
            int r0 = B(r7, r2, r3)
            int r1 = B(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = B(r7, r2, r3)
            int r1 = B(r7, r1, r3)
            goto L58
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L7f:
            int r0 = B(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            org.threeten.bp.s r7 = z(r7, r0, r1)
            return r7
        La8:
            org.threeten.bp.s r7 = z(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.w(java.lang.String):org.threeten.bp.s");
    }

    private Object writeReplace() {
        return new o((byte) 8, this);
    }

    public static s x(int i4) {
        return z(i4, 0, 0);
    }

    public static s y(int i4, int i5) {
        return z(i4, i5, 0);
    }

    public static s z(int i4, int i5, int i6) {
        G(i4, i5, i6);
        return A(E(i4, i5, i6));
    }

    void J(DataOutput dataOutput) throws IOException {
        int i4 = this.f88340e;
        int i5 = i4 % w.b.f22438j == 0 ? i4 / w.b.f22438j : 127;
        dataOutput.writeByte(i5);
        if (i5 == 127) {
            dataOutput.writeInt(i4);
        }
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.OFFSET_SECONDS, this.f88340e);
    }

    @Override // org.threeten.bp.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f88340e == ((s) obj).f88340e;
    }

    @Override // org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return this.f88340e;
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
        return range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return this.f88340e;
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new DateTimeException(c.a("Unsupported field: ", jVar));
        }
        return jVar.getFrom(this);
    }

    @Override // org.threeten.bp.r
    public int hashCode() {
        return this.f88340e;
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS : jVar != null && jVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.r
    public String j() {
        return this.f88341f;
    }

    @Override // org.threeten.bp.r
    public org.threeten.bp.zone.f l() {
        return org.threeten.bp.zone.f.m(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.f()) {
            return this;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.e() || lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.g()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.r
    void r(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        J(dataOutput);
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return jVar.range();
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
        return jVar.rangeRefinedBy(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(s sVar) {
        return sVar.f88340e - this.f88340e;
    }

    @Override // org.threeten.bp.r
    public String toString() {
        return this.f88341f;
    }

    public int v() {
        return this.f88340e;
    }
}
