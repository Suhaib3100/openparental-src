package org.threeten.bp.format;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.work.i0;
import com.tencent.mmkv.MMKV;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.format.m;

/* compiled from: DateTimeFormatterBuilder.java */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    private static final org.threeten.bp.temporal.l<org.threeten.bp.r> f88127h = new a();

    /* renamed from: i, reason: collision with root package name */
    private static final Map<Character, org.threeten.bp.temporal.j> f88128i;

    /* renamed from: j, reason: collision with root package name */
    static final Comparator<String> f88129j;

    /* renamed from: a, reason: collision with root package name */
    private d f88130a;

    /* renamed from: b, reason: collision with root package name */
    private final d f88131b;

    /* renamed from: c, reason: collision with root package name */
    private final List<h> f88132c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f88133d;

    /* renamed from: e, reason: collision with root package name */
    private int f88134e;

    /* renamed from: f, reason: collision with root package name */
    private char f88135f;

    /* renamed from: g, reason: collision with root package name */
    private int f88136g;

    /* compiled from: DateTimeFormatterBuilder.java */
    class a implements org.threeten.bp.temporal.l<org.threeten.bp.r> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.r a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.r rVar = (org.threeten.bp.r) fVar.query(org.threeten.bp.temporal.k.g());
            if (rVar == null || (rVar instanceof org.threeten.bp.s)) {
                return null;
            }
            return rVar;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    class b extends org.threeten.bp.format.g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m.b f88137b;

        b(m.b bVar) {
            this.f88137b = bVar;
        }

        @Override // org.threeten.bp.format.g
        public String c(org.threeten.bp.temporal.j jVar, long j4, org.threeten.bp.format.n nVar, Locale locale) {
            return this.f88137b.a(j4, nVar);
        }

        @Override // org.threeten.bp.format.g
        public Iterator<Map.Entry<String, Long>> d(org.threeten.bp.temporal.j jVar, org.threeten.bp.format.n nVar, Locale locale) {
            return this.f88137b.b(nVar);
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    class c implements Comparator<String> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C1367d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88139a;

        static {
            int[] iArr = new int[org.threeten.bp.format.k.values().length];
            f88139a = iArr;
            try {
                iArr[org.threeten.bp.format.k.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88139a[org.threeten.bp.format.k.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88139a[org.threeten.bp.format.k.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88139a[org.threeten.bp.format.k.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class e implements h {

        /* renamed from: b, reason: collision with root package name */
        private final char f88140b;

        e(char c5) {
            this.f88140b = c5;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            if (i4 == charSequence.length()) {
                return ~i4;
            }
            return !eVar.c(this.f88140b, charSequence.charAt(i4)) ? ~i4 : i4 + 1;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            sb.append(this.f88140b);
            return true;
        }

        public String toString() {
            if (this.f88140b == '\'') {
                return "''";
            }
            return "'" + this.f88140b + "'";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class f implements h {

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.format.n f88141b;

        f(org.threeten.bp.format.n nVar) {
            this.f88141b = nVar;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            if (i4 < 0 || i4 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            org.threeten.bp.chrono.j jVar = null;
            int i5 = -1;
            for (org.threeten.bp.chrono.j jVar2 : org.threeten.bp.chrono.j.q()) {
                String t4 = jVar2.t();
                int length = t4.length();
                if (length > i5 && eVar.v(charSequence, i4, t4, 0, length)) {
                    jVar = jVar2;
                    i5 = length;
                }
            }
            if (jVar == null) {
                return ~i4;
            }
            eVar.q(jVar);
            return i4 + i5;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            org.threeten.bp.chrono.j jVar = (org.threeten.bp.chrono.j) fVar.g(org.threeten.bp.temporal.k.a());
            if (jVar == null) {
                return false;
            }
            if (this.f88141b == null) {
                sb.append(jVar.t());
                return true;
            }
            try {
                sb.append(ResourceBundle.getBundle("org.threeten.bp.format.ChronologyText", fVar.c(), d.class.getClassLoader()).getString(jVar.t()));
                return true;
            } catch (MissingResourceException unused) {
                sb.append(jVar.t());
                return true;
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class g implements h {

        /* renamed from: b, reason: collision with root package name */
        private final h[] f88142b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f88143c;

        g(List<h> list, boolean z4) {
            this((h[]) list.toArray(new h[list.size()]), z4);
        }

        public g a(boolean z4) {
            return z4 == this.f88143c ? this : new g(this.f88142b, z4);
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            if (!this.f88143c) {
                for (h hVar : this.f88142b) {
                    i4 = hVar.parse(eVar, charSequence, i4);
                    if (i4 < 0) {
                        break;
                    }
                }
                return i4;
            }
            eVar.u();
            int i5 = i4;
            for (h hVar2 : this.f88142b) {
                i5 = hVar2.parse(eVar, charSequence, i5);
                if (i5 < 0) {
                    eVar.g(false);
                    return i4;
                }
            }
            eVar.g(true);
            return i5;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f88143c) {
                fVar.j();
            }
            try {
                for (h hVar : this.f88142b) {
                    if (!hVar.print(fVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f88143c) {
                    fVar.b();
                }
                return true;
            } finally {
                if (this.f88143c) {
                    fVar.b();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f88142b != null) {
                sb.append(this.f88143c ? "[" : "(");
                for (h hVar : this.f88142b) {
                    sb.append(hVar);
                }
                sb.append(this.f88143c ? "]" : ")");
            }
            return sb.toString();
        }

        g(h[] hVarArr, boolean z4) {
            this.f88142b = hVarArr;
            this.f88143c = z4;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    interface h {
        int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4);

        boolean print(org.threeten.bp.format.f fVar, StringBuilder sb);
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static class i implements h {

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.temporal.j f88144b;

        /* renamed from: c, reason: collision with root package name */
        private final long f88145c;

        i(org.threeten.bp.temporal.j jVar, long j4) {
            this.f88144b = jVar;
            this.f88145c = j4;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            if (eVar.j(this.f88144b) == null) {
                eVar.r(this.f88144b, this.f88145c, i4, i4);
            }
            return i4;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            return true;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class j implements h {

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.temporal.j f88146b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88147c;

        /* renamed from: d, reason: collision with root package name */
        private final int f88148d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f88149e;

        j(org.threeten.bp.temporal.j jVar, int i4, int i5, boolean z4) {
            ng.d.j(jVar, "field");
            if (!jVar.range().g()) {
                throw new IllegalArgumentException(org.threeten.bp.c.a("Field must have a fixed set of values: ", jVar));
            }
            if (i4 < 0 || i4 > 9) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Minimum width must be from 0 to 9 inclusive but was ", i4));
            }
            if (i5 < 1 || i5 > 9) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Maximum width must be from 1 to 9 inclusive but was ", i5));
            }
            if (i5 < i4) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Maximum width must exceed or equal the minimum width but ", i5, " < ", i4));
            }
            this.f88146b = jVar;
            this.f88147c = i4;
            this.f88148d = i5;
            this.f88149e = z4;
        }

        private long a(BigDecimal bigDecimal) {
            org.threeten.bp.temporal.n range = this.f88146b.range();
            BigDecimal valueOf = BigDecimal.valueOf(range.e());
            return bigDecimal.multiply(BigDecimal.valueOf(range.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        private BigDecimal b(long j4) {
            org.threeten.bp.temporal.n range = this.f88146b.range();
            range.b(j4, this.f88146b);
            BigDecimal valueOf = BigDecimal.valueOf(range.e());
            BigDecimal divide = BigDecimal.valueOf(j4).subtract(valueOf).divide(BigDecimal.valueOf(range.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return divide.compareTo(bigDecimal) == 0 ? bigDecimal : com.google.android.gms.internal.measurement.a.a(divide);
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            int i5 = 0;
            int i6 = eVar.m() ? this.f88147c : 0;
            int i7 = eVar.m() ? this.f88148d : 9;
            int length = charSequence.length();
            if (i4 == length) {
                return i6 > 0 ? ~i4 : i4;
            }
            if (this.f88149e) {
                if (charSequence.charAt(i4) != eVar.k().e()) {
                    return i6 > 0 ? ~i4 : i4;
                }
                i4++;
            }
            int i10 = i4;
            int i11 = i6 + i10;
            if (i11 > length) {
                return ~i10;
            }
            int min = Math.min(i7 + i10, length);
            int i12 = i10;
            while (true) {
                if (i12 >= min) {
                    break;
                }
                int i13 = i12 + 1;
                int b5 = eVar.k().b(charSequence.charAt(i12));
                if (b5 >= 0) {
                    i5 = (i5 * 10) + b5;
                    i12 = i13;
                } else if (i13 < i11) {
                    return ~i10;
                }
            }
            return eVar.r(this.f88146b, a(new BigDecimal(i5).movePointLeft(i12 - i10)), i10, i12);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            Long f4 = fVar.f(this.f88146b);
            if (f4 == null) {
                return false;
            }
            org.threeten.bp.format.h d5 = fVar.d();
            BigDecimal b5 = b(f4.longValue());
            if (b5.scale() != 0) {
                String a5 = d5.a(b5.setScale(Math.min(Math.max(b5.scale(), this.f88147c), this.f88148d), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f88149e) {
                    sb.append(d5.e());
                }
                sb.append(a5);
                return true;
            }
            if (this.f88147c <= 0) {
                return true;
            }
            if (this.f88149e) {
                sb.append(d5.e());
            }
            for (int i4 = 0; i4 < this.f88147c; i4++) {
                sb.append(d5.h());
            }
            return true;
        }

        public String toString() {
            return "Fraction(" + this.f88146b + "," + this.f88147c + "," + this.f88148d + (this.f88149e ? ",DecimalPoint" : "") + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class k implements h {

        /* renamed from: c, reason: collision with root package name */
        private static final long f88150c = 315569520000L;

        /* renamed from: d, reason: collision with root package name */
        private static final long f88151d = 62167219200L;

        /* renamed from: b, reason: collision with root package name */
        private final int f88152b;

        k(int i4) {
            this.f88152b = i4;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            int i5;
            int i6;
            eVar.getClass();
            org.threeten.bp.format.e eVar2 = new org.threeten.bp.format.e(eVar);
            int i7 = this.f88152b;
            int i10 = 0;
            int i11 = i7 < 0 ? 0 : i7;
            if (i7 < 0) {
                i7 = 9;
            }
            d h4 = new d().a(org.threeten.bp.format.c.f88101h).h('T');
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.HOUR_OF_DAY;
            d h5 = h4.u(aVar, 2).h(':');
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.MINUTE_OF_HOUR;
            d h6 = h5.u(aVar2, 2).h(':');
            org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.SECOND_OF_MINUTE;
            d u4 = h6.u(aVar3, 2);
            org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.NANO_OF_SECOND;
            int parse = u4.d(aVar4, i11, i7, true).h('Z').P().C(false).parse(eVar2, charSequence, i4);
            if (parse < 0) {
                return parse;
            }
            long longValue = eVar2.j(org.threeten.bp.temporal.a.YEAR).longValue();
            int intValue = eVar2.j(org.threeten.bp.temporal.a.MONTH_OF_YEAR).intValue();
            int intValue2 = eVar2.j(org.threeten.bp.temporal.a.DAY_OF_MONTH).intValue();
            int intValue3 = eVar2.j(aVar).intValue();
            int intValue4 = eVar2.j(aVar2).intValue();
            Long j4 = eVar2.j(aVar3);
            Long j5 = eVar2.j(aVar4);
            int intValue5 = j4 != null ? j4.intValue() : 0;
            int intValue6 = j5 != null ? j5.intValue() : 0;
            int i12 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i5 = 0;
                i6 = intValue5;
                i10 = 1;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                eVar.s();
                i6 = 59;
                i5 = intValue3;
            } else {
                i5 = intValue3;
                i6 = intValue5;
            }
            try {
                return eVar.r(aVar4, intValue6, i4, eVar.r(org.threeten.bp.temporal.a.INSTANT_SECONDS, ng.d.o(longValue / i0.f35991f, f88150c) + org.threeten.bp.h.u0(i12, intValue, intValue2, i5, intValue4, i6, 0).F0(i10).z(org.threeten.bp.s.f88337o), i4, parse));
            } catch (RuntimeException unused) {
                return ~i4;
            }
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            Long f4 = fVar.f(org.threeten.bp.temporal.a.INSTANT_SECONDS);
            org.threeten.bp.temporal.f e4 = fVar.e();
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.NANO_OF_SECOND;
            Long valueOf = e4.isSupported(aVar) ? Long.valueOf(fVar.e().getLong(aVar)) : 0L;
            int i4 = 0;
            if (f4 == null) {
                return false;
            }
            long longValue = f4.longValue();
            int checkValidIntValue = aVar.checkValidIntValue(valueOf.longValue());
            if (longValue >= -62167219200L) {
                long j4 = longValue - 253402300800L;
                long e5 = 1 + ng.d.e(j4, f88150c);
                org.threeten.bp.h z02 = org.threeten.bp.h.z0(ng.d.h(j4, f88150c) - f88151d, 0, org.threeten.bp.s.f88337o);
                if (e5 > 0) {
                    sb.append('+');
                    sb.append(e5);
                }
                sb.append(z02);
                if (z02.Z() == 0) {
                    sb.append(":00");
                }
            } else {
                long j5 = longValue + f88151d;
                long j6 = j5 / f88150c;
                long j7 = j5 % f88150c;
                org.threeten.bp.h z03 = org.threeten.bp.h.z0(j7 - f88151d, 0, org.threeten.bp.s.f88337o);
                int length = sb.length();
                sb.append(z03);
                if (z03.Z() == 0) {
                    sb.append(":00");
                }
                if (j6 < 0) {
                    if (z03.a0() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j6 - 1));
                    } else if (j7 == 0) {
                        sb.insert(length, j6);
                    } else {
                        sb.insert(length + 1, Math.abs(j6));
                    }
                }
            }
            int i5 = this.f88152b;
            if (i5 == -2) {
                if (checkValidIntValue != 0) {
                    sb.append('.');
                    if (checkValidIntValue % 1000000 == 0) {
                        sb.append(Integer.toString((checkValidIntValue / 1000000) + 1000).substring(1));
                    } else if (checkValidIntValue % 1000 == 0) {
                        sb.append(Integer.toString((checkValidIntValue / 1000) + 1000000).substring(1));
                    } else {
                        sb.append(Integer.toString(checkValidIntValue + 1000000000).substring(1));
                    }
                }
            } else if (i5 > 0 || (i5 == -1 && checkValidIntValue > 0)) {
                sb.append('.');
                int i6 = 100000000;
                while (true) {
                    int i7 = this.f88152b;
                    if ((i7 != -1 || checkValidIntValue <= 0) && i4 >= i7) {
                        break;
                    }
                    int i10 = checkValidIntValue / i6;
                    sb.append((char) (i10 + 48));
                    checkValidIntValue -= i10 * i6;
                    i6 /= 10;
                    i4++;
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class l implements h {

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.format.n f88153b;

        public l(org.threeten.bp.format.n nVar) {
            this.f88153b = nVar;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            char charAt;
            if (!eVar.v(charSequence, i4, "GMT", 0, 3)) {
                return ~i4;
            }
            int i5 = i4 + 3;
            if (this.f88153b == org.threeten.bp.format.n.FULL) {
                return new o("", "+HH:MM:ss").parse(eVar, charSequence, i5);
            }
            int length = charSequence.length();
            if (i5 == length) {
                return eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, 0L, i5, i5);
            }
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 != '+' && charAt2 != '-') {
                return eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, 0L, i5, i5);
            }
            int i6 = charAt2 == '-' ? -1 : 1;
            if (i5 == length) {
                return ~i5;
            }
            int i7 = i4 + 4;
            char charAt3 = charSequence.charAt(i7);
            if (charAt3 < '0' || charAt3 > '9') {
                return ~i7;
            }
            int i10 = i4 + 5;
            int i11 = charAt3 - '0';
            if (i10 != length && (charAt = charSequence.charAt(i10)) >= '0' && charAt <= '9') {
                i11 = (i11 * 10) + (charAt - '0');
                if (i11 > 23) {
                    return ~i10;
                }
                i10 = i4 + 6;
            }
            int i12 = i10;
            if (i12 == length || charSequence.charAt(i12) != ':') {
                return eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, i6 * MMKV.ExpireInHour * i11, i12, i12);
            }
            int i13 = i12 + 1;
            int i14 = length - 2;
            if (i13 > i14) {
                return ~i13;
            }
            char charAt4 = charSequence.charAt(i13);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i13;
            }
            int i15 = i12 + 2;
            int i16 = charAt4 - '0';
            char charAt5 = charSequence.charAt(i15);
            if (charAt5 < '0' || charAt5 > '9') {
                return ~i15;
            }
            int i17 = i12 + 3;
            if ((charAt5 - '0') + (i16 * 10) > 59) {
                return ~i17;
            }
            if (i17 == length || charSequence.charAt(i17) != ':') {
                return eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, ((r12 * 60) + (i11 * MMKV.ExpireInHour)) * i6, i17, i17);
            }
            int i18 = i12 + 4;
            if (i18 > i14) {
                return ~i18;
            }
            char charAt6 = charSequence.charAt(i18);
            if (charAt6 < '0' || charAt6 > '9') {
                return ~i18;
            }
            int i19 = i12 + 5;
            int i20 = charAt6 - '0';
            char charAt7 = charSequence.charAt(i19);
            if (charAt7 < '0' || charAt7 > '9') {
                return ~i19;
            }
            int i21 = i12 + 6;
            return (charAt7 - '0') + (i20 * 10) > 59 ? ~i21 : eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, ((r12 * 60) + (i11 * MMKV.ExpireInHour) + r6) * i6, i21, i21);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            Long f4 = fVar.f(org.threeten.bp.temporal.a.OFFSET_SECONDS);
            if (f4 == null) {
                return false;
            }
            sb.append("GMT");
            if (this.f88153b == org.threeten.bp.format.n.FULL) {
                return new o("", "+HH:MM:ss").print(fVar, sb);
            }
            int r4 = ng.d.r(f4.longValue());
            if (r4 == 0) {
                return true;
            }
            int abs = Math.abs((r4 / MMKV.ExpireInHour) % 100);
            int abs2 = Math.abs((r4 / 60) % 60);
            int abs3 = Math.abs(r4 % 60);
            sb.append(r4 < 0 ? "-" : "+");
            sb.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs2 / 10) + 48));
            sb.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs3 / 10) + 48));
            sb.append((char) ((abs3 % 10) + 48));
            return true;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class m implements h {

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.format.i f88154b;

        /* renamed from: c, reason: collision with root package name */
        private final org.threeten.bp.format.i f88155c;

        m(org.threeten.bp.format.i iVar, org.threeten.bp.format.i iVar2) {
            this.f88154b = iVar;
            this.f88155c = iVar2;
        }

        private org.threeten.bp.format.c a(Locale locale, org.threeten.bp.chrono.j jVar) {
            return new org.threeten.bp.format.l().b(this.f88154b, this.f88155c, jVar, locale);
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            return a(eVar.i(), eVar.h()).C(false).parse(eVar, charSequence, i4);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            return a(fVar.c(), org.threeten.bp.chrono.j.p(fVar.e())).C(false).print(fVar, sb);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Localized(");
            Object obj = this.f88154b;
            if (obj == null) {
                obj = "";
            }
            sb.append(obj);
            sb.append(",");
            Object obj2 = this.f88155c;
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, obj2 != null ? obj2 : "", ")");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static class n implements h {

        /* renamed from: g, reason: collision with root package name */
        static final int[] f88156g = {0, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.Q2, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: b, reason: collision with root package name */
        final org.threeten.bp.temporal.j f88157b;

        /* renamed from: c, reason: collision with root package name */
        final int f88158c;

        /* renamed from: d, reason: collision with root package name */
        final int f88159d;

        /* renamed from: e, reason: collision with root package name */
        final org.threeten.bp.format.k f88160e;

        /* renamed from: f, reason: collision with root package name */
        final int f88161f;

        /* synthetic */ n(org.threeten.bp.temporal.j jVar, int i4, int i5, org.threeten.bp.format.k kVar, int i6, a aVar) {
            this(jVar, i4, i5, kVar, i6);
        }

        long a(org.threeten.bp.format.f fVar, long j4) {
            return j4;
        }

        boolean b(org.threeten.bp.format.e eVar) {
            int i4 = this.f88161f;
            return i4 == -1 || (i4 > 0 && this.f88158c == this.f88159d && this.f88160e == org.threeten.bp.format.k.NOT_NEGATIVE);
        }

        int c(org.threeten.bp.format.e eVar, long j4, int i4, int i5) {
            return eVar.r(this.f88157b, j4, i4, i5);
        }

        n d() {
            return this.f88161f == -1 ? this : new n(this.f88157b, this.f88158c, this.f88159d, this.f88160e, -1);
        }

        n e(int i4) {
            return new n(this.f88157b, this.f88158c, this.f88159d, this.f88160e, this.f88161f + i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
        @Override // org.threeten.bp.format.d.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parse(org.threeten.bp.format.e r20, java.lang.CharSequence r21, int r22) {
            /*
                Method dump skipped, instructions count: 393
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.n.parse(org.threeten.bp.format.e, java.lang.CharSequence, int):int");
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            Long f4 = fVar.f(this.f88157b);
            if (f4 == null) {
                return false;
            }
            long a5 = a(fVar, f4.longValue());
            org.threeten.bp.format.h d5 = fVar.d();
            String l4 = a5 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(a5));
            if (l4.length() > this.f88159d) {
                throw new DateTimeException("Field " + this.f88157b + " cannot be printed as the value " + a5 + " exceeds the maximum print width of " + this.f88159d);
            }
            String a6 = d5.a(l4);
            if (a5 >= 0) {
                int i4 = C1367d.f88139a[this.f88160e.ordinal()];
                if (i4 == 1) {
                    if (this.f88158c < 19 && a5 >= f88156g[r4]) {
                        sb.append(d5.g());
                    }
                } else if (i4 == 2) {
                    sb.append(d5.g());
                }
            } else {
                int i5 = C1367d.f88139a[this.f88160e.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    sb.append(d5.f());
                } else if (i5 == 4) {
                    throw new DateTimeException("Field " + this.f88157b + " cannot be printed as the value " + a5 + " cannot be negative according to the SignStyle");
                }
            }
            for (int i6 = 0; i6 < this.f88158c - a6.length(); i6++) {
                sb.append(d5.h());
            }
            sb.append(a6);
            return true;
        }

        public String toString() {
            int i4 = this.f88158c;
            if (i4 == 1 && this.f88159d == 19 && this.f88160e == org.threeten.bp.format.k.NORMAL) {
                return "Value(" + this.f88157b + ")";
            }
            if (i4 == this.f88159d && this.f88160e == org.threeten.bp.format.k.NOT_NEGATIVE) {
                StringBuilder sb = new StringBuilder("Value(");
                sb.append(this.f88157b);
                sb.append(",");
                return android.support.v4.media.b.a(sb, this.f88158c, ")");
            }
            return "Value(" + this.f88157b + "," + this.f88158c + "," + this.f88159d + "," + this.f88160e + ")";
        }

        n(org.threeten.bp.temporal.j jVar, int i4, int i5, org.threeten.bp.format.k kVar) {
            this.f88157b = jVar;
            this.f88158c = i4;
            this.f88159d = i5;
            this.f88160e = kVar;
            this.f88161f = 0;
        }

        private n(org.threeten.bp.temporal.j jVar, int i4, int i5, org.threeten.bp.format.k kVar, int i6) {
            this.f88157b = jVar;
            this.f88158c = i4;
            this.f88159d = i5;
            this.f88160e = kVar;
            this.f88161f = i6;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class o implements h {

        /* renamed from: d, reason: collision with root package name */
        static final String[] f88162d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: e, reason: collision with root package name */
        static final o f88163e = new o("Z", "+HH:MM:ss");

        /* renamed from: f, reason: collision with root package name */
        static final o f88164f = new o("0", "+HH:MM:ss");

        /* renamed from: b, reason: collision with root package name */
        private final String f88165b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88166c;

        o(String str, String str2) {
            ng.d.j(str, "noOffsetText");
            ng.d.j(str2, "pattern");
            this.f88165b = str;
            this.f88166c = a(str2);
        }

        private int a(String str) {
            int i4 = 0;
            while (true) {
                String[] strArr = f88162d;
                if (i4 >= strArr.length) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Invalid zone offset pattern: ", str));
                }
                if (strArr[i4].equals(str)) {
                    return i4;
                }
                i4++;
            }
        }

        private boolean b(int[] iArr, int i4, CharSequence charSequence, boolean z4) {
            int i5 = this.f88166c;
            if ((i5 + 3) / 2 < i4) {
                return false;
            }
            int i6 = iArr[0];
            if (i5 % 2 == 0 && i4 > 1) {
                int i7 = i6 + 1;
                if (i7 > charSequence.length() || charSequence.charAt(i6) != ':') {
                    return z4;
                }
                i6 = i7;
            }
            if (i6 + 2 > charSequence.length()) {
                return z4;
            }
            int i10 = i6 + 1;
            char charAt = charSequence.charAt(i6);
            int i11 = i6 + 2;
            char charAt2 = charSequence.charAt(i10);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                int i12 = (charAt2 - '0') + ((charAt - '0') * 10);
                if (i12 >= 0 && i12 <= 59) {
                    iArr[i4] = i12;
                    iArr[0] = i11;
                    return false;
                }
            }
            return z4;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            int length = charSequence.length();
            int length2 = this.f88165b.length();
            if (length2 == 0) {
                if (i4 == length) {
                    return eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, 0L, i4, i4);
                }
            } else {
                if (i4 == length) {
                    return ~i4;
                }
                if (eVar.v(charSequence, i4, this.f88165b, 0, length2)) {
                    return eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, 0L, i4, i4 + length2);
                }
            }
            char charAt = charSequence.charAt(i4);
            if (charAt == '+' || charAt == '-') {
                int i5 = charAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i4 + 1;
                if (!b(iArr, 1, charSequence, true)) {
                    if (!b(iArr, 2, charSequence, this.f88166c >= 3) && !b(iArr, 3, charSequence, false)) {
                        return eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, ((iArr[2] * 60) + (iArr[1] * 3600) + iArr[3]) * i5, i4, iArr[0]);
                    }
                }
            }
            return length2 == 0 ? eVar.r(org.threeten.bp.temporal.a.OFFSET_SECONDS, 0L, i4, i4 + length2) : ~i4;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            Long f4 = fVar.f(org.threeten.bp.temporal.a.OFFSET_SECONDS);
            if (f4 == null) {
                return false;
            }
            int r4 = ng.d.r(f4.longValue());
            if (r4 == 0) {
                sb.append(this.f88165b);
            } else {
                int abs = Math.abs((r4 / MMKV.ExpireInHour) % 100);
                int abs2 = Math.abs((r4 / 60) % 60);
                int abs3 = Math.abs(r4 % 60);
                int length = sb.length();
                sb.append(r4 < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i4 = this.f88166c;
                if (i4 >= 3 || (i4 >= 1 && abs2 > 0)) {
                    sb.append(i4 % 2 == 0 ? ":" : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i5 = this.f88166c;
                    if (i5 >= 7 || (i5 >= 5 && abs3 > 0)) {
                        sb.append(i5 % 2 == 0 ? ":" : "");
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.f88165b);
                }
            }
            return true;
        }

        public String toString() {
            return androidx.fragment.app.c.a(new StringBuilder("Offset("), f88162d[this.f88166c], ",'", this.f88165b.replace("'", "''"), "')");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class p implements h {

        /* renamed from: b, reason: collision with root package name */
        private final h f88167b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88168c;

        /* renamed from: d, reason: collision with root package name */
        private final char f88169d;

        p(h hVar, int i4, char c5) {
            this.f88167b = hVar;
            this.f88168c = i4;
            this.f88169d = c5;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            boolean m4 = eVar.m();
            boolean l4 = eVar.l();
            if (i4 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            if (i4 == charSequence.length()) {
                return ~i4;
            }
            int i5 = this.f88168c + i4;
            if (i5 > charSequence.length()) {
                if (m4) {
                    return ~i4;
                }
                i5 = charSequence.length();
            }
            int i6 = i4;
            while (i6 < i5) {
                if (!l4) {
                    if (!eVar.c(charSequence.charAt(i6), this.f88169d)) {
                        break;
                    }
                    i6++;
                } else {
                    if (charSequence.charAt(i6) != this.f88169d) {
                        break;
                    }
                    i6++;
                }
            }
            int parse = this.f88167b.parse(eVar, charSequence.subSequence(0, i5), i6);
            return (parse == i5 || !m4) ? parse : ~(i4 + i6);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.f88167b.print(fVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 > this.f88168c) {
                StringBuilder a5 = androidx.collection.s.a("Cannot print as output of ", length2, " characters exceeds pad width of ");
                a5.append(this.f88168c);
                throw new DateTimeException(a5.toString());
            }
            for (int i4 = 0; i4 < this.f88168c - length2; i4++) {
                sb.insert(length, this.f88169d);
            }
            return true;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("Pad(");
            sb.append(this.f88167b);
            sb.append(",");
            sb.append(this.f88168c);
            if (this.f88169d == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f88169d + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    enum r implements h {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                eVar.n(true);
            } else if (ordinal == 1) {
                eVar.n(false);
            } else if (ordinal == 2) {
                eVar.t(true);
            } else if (ordinal == 3) {
                eVar.t(false);
            }
            return i4;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class s implements h {

        /* renamed from: b, reason: collision with root package name */
        private final String f88173b;

        s(String str) {
            this.f88173b = str;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            if (i4 > charSequence.length() || i4 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f88173b;
            return !eVar.v(charSequence, i4, str, 0, str.length()) ? ~i4 : this.f88173b.length() + i4;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            sb.append(this.f88173b);
            return true;
        }

        public String toString() {
            return android.support.v4.media.d.a("'", this.f88173b.replace("'", "''"), "'");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class t implements h {

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.temporal.j f88174b;

        /* renamed from: c, reason: collision with root package name */
        private final org.threeten.bp.format.n f88175c;

        /* renamed from: d, reason: collision with root package name */
        private final org.threeten.bp.format.g f88176d;

        /* renamed from: e, reason: collision with root package name */
        private volatile n f88177e;

        t(org.threeten.bp.temporal.j jVar, org.threeten.bp.format.n nVar, org.threeten.bp.format.g gVar) {
            this.f88174b = jVar;
            this.f88175c = nVar;
            this.f88176d = gVar;
        }

        private n a() {
            if (this.f88177e == null) {
                this.f88177e = new n(this.f88174b, 1, 19, org.threeten.bp.format.k.NORMAL);
            }
            return this.f88177e;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            int length = charSequence.length();
            if (i4 < 0 || i4 > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> d5 = this.f88176d.d(this.f88174b, eVar.m() ? this.f88175c : null, eVar.i());
            if (d5 != null) {
                while (d5.hasNext()) {
                    Map.Entry<String, Long> next = d5.next();
                    String key = next.getKey();
                    if (eVar.v(key, 0, charSequence, i4, key.length())) {
                        return eVar.r(this.f88174b, next.getValue().longValue(), i4, key.length() + i4);
                    }
                }
                if (eVar.m()) {
                    return ~i4;
                }
            }
            return a().parse(eVar, charSequence, i4);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            Long f4 = fVar.f(this.f88174b);
            if (f4 == null) {
                return false;
            }
            String c5 = this.f88176d.c(this.f88174b, f4.longValue(), this.f88175c, fVar.c());
            if (c5 == null) {
                return a().print(fVar, sb);
            }
            sb.append(c5);
            return true;
        }

        public String toString() {
            if (this.f88175c == org.threeten.bp.format.n.FULL) {
                return "Text(" + this.f88174b + ")";
            }
            return "Text(" + this.f88174b + "," + this.f88175c + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class u implements h {

        /* renamed from: b, reason: collision with root package name */
        private final char f88178b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88179c;

        public u(char c5, int i4) {
            this.f88178b = c5;
            this.f88179c = i4;
        }

        private h a(org.threeten.bp.temporal.o oVar) {
            char c5 = this.f88178b;
            if (c5 == 'W') {
                return new n(oVar.h(), 1, 2, org.threeten.bp.format.k.NOT_NEGATIVE);
            }
            if (c5 == 'Y') {
                if (this.f88179c == 2) {
                    return new q(oVar.g(), 2, 2, 0, q.f88170j);
                }
                org.threeten.bp.temporal.j g4 = oVar.g();
                int i4 = this.f88179c;
                return new n(g4, i4, 19, i4 < 4 ? org.threeten.bp.format.k.NORMAL : org.threeten.bp.format.k.EXCEEDS_PAD, -1, null);
            }
            if (c5 == 'c') {
                return new n(oVar.b(), this.f88179c, 2, org.threeten.bp.format.k.NOT_NEGATIVE);
            }
            if (c5 == 'e') {
                return new n(oVar.b(), this.f88179c, 2, org.threeten.bp.format.k.NOT_NEGATIVE);
            }
            if (c5 != 'w') {
                return null;
            }
            return new n(oVar.i(), this.f88179c, 2, org.threeten.bp.format.k.NOT_NEGATIVE);
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            return a(org.threeten.bp.temporal.o.e(eVar.i())).parse(eVar, charSequence, i4);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            return a(org.threeten.bp.temporal.o.e(fVar.c())).print(fVar, sb);
        }

        public String toString() {
            StringBuilder a5 = androidx.fragment.app.a.a(30, "Localized(");
            char c5 = this.f88178b;
            if (c5 == 'Y') {
                int i4 = this.f88179c;
                if (i4 == 1) {
                    a5.append("WeekBasedYear");
                } else if (i4 == 2) {
                    a5.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    a5.append("WeekBasedYear,");
                    a5.append(this.f88179c);
                    a5.append(",19,");
                    a5.append(this.f88179c < 4 ? org.threeten.bp.format.k.NORMAL : org.threeten.bp.format.k.EXCEEDS_PAD);
                }
            } else {
                if (c5 == 'c' || c5 == 'e') {
                    a5.append("DayOfWeek");
                } else if (c5 == 'w') {
                    a5.append("WeekOfWeekBasedYear");
                } else if (c5 == 'W') {
                    a5.append("WeekOfMonth");
                }
                a5.append(",");
                a5.append(this.f88179c);
            }
            a5.append(")");
            return a5.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class v implements h {

        /* renamed from: d, reason: collision with root package name */
        private static volatile Map.Entry<Integer, a> f88180d;

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.temporal.l<org.threeten.bp.r> f88181b;

        /* renamed from: c, reason: collision with root package name */
        private final String f88182c;

        /* compiled from: DateTimeFormatterBuilder.java */
        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            final int f88183a;

            /* renamed from: b, reason: collision with root package name */
            private final Map<CharSequence, a> f88184b;

            /* renamed from: c, reason: collision with root package name */
            private final Map<String, a> f88185c;

            /* synthetic */ a(int i4, a aVar) {
                this(i4);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(String str) {
                int length = str.length();
                int i4 = this.f88183a;
                if (length == i4) {
                    this.f88184b.put(str, null);
                    this.f88185c.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i4) {
                    String substring = str.substring(0, i4);
                    a aVar = this.f88184b.get(substring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.f88184b.put(substring, aVar);
                        this.f88185c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(CharSequence charSequence, boolean z4) {
                return z4 ? this.f88184b.get(charSequence) : this.f88185c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            private a(int i4) {
                this.f88184b = new HashMap();
                this.f88185c = new HashMap();
                this.f88183a = i4;
            }
        }

        v(org.threeten.bp.temporal.l<org.threeten.bp.r> lVar, String str) {
            this.f88181b = lVar;
            this.f88182c = str;
        }

        private org.threeten.bp.r a(Set<String> set, String str, boolean z4) {
            if (str == null) {
                return null;
            }
            if (z4) {
                if (set.contains(str)) {
                    return org.threeten.bp.r.n(str);
                }
                return null;
            }
            for (String str2 : set) {
                if (str2.equalsIgnoreCase(str)) {
                    return org.threeten.bp.r.n(str2);
                }
            }
            return null;
        }

        private int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4, int i5) {
            String upperCase = charSequence.subSequence(i4, i5).toString().toUpperCase();
            eVar.getClass();
            org.threeten.bp.format.e eVar2 = new org.threeten.bp.format.e(eVar);
            if (i5 < charSequence.length() && eVar.c(charSequence.charAt(i5), 'Z')) {
                eVar.p(org.threeten.bp.r.p(upperCase, org.threeten.bp.s.f88337o));
                return i5;
            }
            int parse = o.f88163e.parse(eVar2, charSequence, i5);
            if (parse < 0) {
                eVar.p(org.threeten.bp.r.p(upperCase, org.threeten.bp.s.f88337o));
                return i5;
            }
            eVar.p(org.threeten.bp.r.p(upperCase, org.threeten.bp.s.A((int) eVar2.j(org.threeten.bp.temporal.a.OFFSET_SECONDS).longValue())));
            return parse;
        }

        private static a c(Set<String> set) {
            ArrayList arrayList = new ArrayList(set);
            Collections.sort(arrayList, d.f88129j);
            a aVar = new a(((String) arrayList.get(0)).length(), null);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.c((String) it.next());
            }
            return aVar;
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            int i5;
            int length = charSequence.length();
            if (i4 > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i4 == length) {
                return ~i4;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt == '+' || charAt == '-') {
                eVar.getClass();
                org.threeten.bp.format.e eVar2 = new org.threeten.bp.format.e(eVar);
                int parse = o.f88163e.parse(eVar2, charSequence, i4);
                if (parse < 0) {
                    return parse;
                }
                eVar.p(org.threeten.bp.s.A((int) eVar2.j(org.threeten.bp.temporal.a.OFFSET_SECONDS).longValue()));
                return parse;
            }
            int i6 = i4 + 2;
            if (length >= i6) {
                char charAt2 = charSequence.charAt(i4 + 1);
                if (eVar.c(charAt, 'U') && eVar.c(charAt2, 'T')) {
                    int i7 = i4 + 3;
                    return (length < i7 || !eVar.c(charSequence.charAt(i6), 'C')) ? b(eVar, charSequence, i4, i6) : b(eVar, charSequence, i4, i7);
                }
                if (eVar.c(charAt, 'G') && length >= (i5 = i4 + 3) && eVar.c(charAt2, 'M') && eVar.c(charSequence.charAt(i6), 'T')) {
                    return b(eVar, charSequence, i4, i5);
                }
            }
            Set<String> a5 = org.threeten.bp.zone.i.a();
            int size = a5.size();
            Map.Entry<Integer, a> entry = f88180d;
            if (entry == null || entry.getKey().intValue() != size) {
                synchronized (this) {
                    try {
                        entry = f88180d;
                        if (entry != null) {
                            if (entry.getKey().intValue() != size) {
                            }
                        }
                        entry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), c(a5));
                        f88180d = entry;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            a value = entry.getValue();
            String str = null;
            String str2 = null;
            while (value != null) {
                int i10 = value.f88183a + i4;
                if (i10 > length) {
                    break;
                }
                String charSequence2 = charSequence.subSequence(i4, i10).toString();
                value = value.d(charSequence2, eVar.l());
                str2 = str;
                str = charSequence2;
            }
            org.threeten.bp.r a6 = a(a5, str, eVar.l());
            if (a6 == null) {
                a6 = a(a5, str2, eVar.l());
                if (a6 == null) {
                    if (!eVar.c(charAt, 'Z')) {
                        return ~i4;
                    }
                    eVar.p(org.threeten.bp.s.f88337o);
                    return i4 + 1;
                }
                str = str2;
            }
            eVar.p(a6);
            return str.length() + i4;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            org.threeten.bp.r rVar = (org.threeten.bp.r) fVar.g(this.f88181b);
            if (rVar == null) {
                return false;
            }
            sb.append(rVar.j());
            return true;
        }

        public String toString() {
            return this.f88182c;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class w implements h {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<String> f88186c = new a();

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.format.n f88187b;

        /* compiled from: DateTimeFormatterBuilder.java */
        class a implements Comparator<String> {
            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        w(org.threeten.bp.format.n nVar) {
            this.f88187b = (org.threeten.bp.format.n) ng.d.j(nVar, "textStyle");
        }

        private int a(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4, String str) {
            int length = str.length();
            int i5 = i4 + length;
            if (i5 >= charSequence.length()) {
                eVar.p(org.threeten.bp.r.n(str));
                return i5;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt != '+' && charAt != '-') {
                eVar.p(org.threeten.bp.r.n(str));
                return i5;
            }
            eVar.getClass();
            org.threeten.bp.format.e eVar2 = new org.threeten.bp.format.e(eVar);
            try {
                int parse = o.f88164f.parse(eVar2, charSequence, i5);
                if (parse < 0) {
                    eVar.p(org.threeten.bp.r.n(str));
                    return i5;
                }
                org.threeten.bp.s A = org.threeten.bp.s.A((int) eVar2.j(org.threeten.bp.temporal.a.OFFSET_SECONDS).longValue());
                eVar.p(length == 0 ? A : org.threeten.bp.r.p(str, A));
                return parse;
            } catch (DateTimeException unused) {
                return ~i4;
            }
        }

        @Override // org.threeten.bp.format.d.h
        public int parse(org.threeten.bp.format.e eVar, CharSequence charSequence, int i4) {
            int length = charSequence.length();
            if (i4 > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i4 == length) {
                return ~i4;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt == '+' || charAt == '-') {
                return i4 + 6 > length ? ~i4 : a(eVar, charSequence, i4, "");
            }
            if (eVar.v(charSequence, i4, "GMT", 0, 3)) {
                return a(eVar, charSequence, i4, "GMT");
            }
            if (eVar.v(charSequence, i4, "UTC", 0, 3)) {
                return a(eVar, charSequence, i4, "UTC");
            }
            if (eVar.v(charSequence, i4, "UT", 0, 2)) {
                return a(eVar, charSequence, i4, "UT");
            }
            TreeMap treeMap = new TreeMap(f88186c);
            for (String str : org.threeten.bp.r.h()) {
                treeMap.put(str, str);
                TimeZone timeZone = TimeZone.getTimeZone(str);
                int i5 = this.f88187b.asNormal() == org.threeten.bp.format.n.FULL ? 1 : 0;
                String displayName = timeZone.getDisplayName(false, i5, eVar.i());
                if (str.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, str);
                }
                String displayName2 = timeZone.getDisplayName(true, i5, eVar.i());
                if (str.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, str);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str2 = (String) entry.getKey();
                if (eVar.v(charSequence, i4, str2, 0, str2.length())) {
                    eVar.p(org.threeten.bp.r.n((String) entry.getValue()));
                    return str2.length() + i4;
                }
            }
            if (charAt != 'Z') {
                return ~i4;
            }
            eVar.p(org.threeten.bp.s.f88337o);
            return i4 + 1;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean print(org.threeten.bp.format.f fVar, StringBuilder sb) {
            org.threeten.bp.r rVar = (org.threeten.bp.r) fVar.g(org.threeten.bp.temporal.k.g());
            if (rVar == null) {
                return false;
            }
            if (rVar.m() instanceof org.threeten.bp.s) {
                sb.append(rVar.j());
                return true;
            }
            org.threeten.bp.temporal.f e4 = fVar.e();
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.INSTANT_SECONDS;
            sb.append(TimeZone.getTimeZone(rVar.j()).getDisplayName(e4.isSupported(aVar) ? rVar.l().i(org.threeten.bp.f.G(e4.getLong(aVar))) : false, this.f88187b.asNormal() == org.threeten.bp.format.n.FULL ? 1 : 0, fVar.c()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.f88187b + ")";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f88128i = hashMap;
        hashMap.put('G', org.threeten.bp.temporal.a.ERA);
        hashMap.put('y', org.threeten.bp.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', org.threeten.bp.temporal.a.YEAR);
        org.threeten.bp.temporal.j jVar = org.threeten.bp.temporal.c.f88348b;
        hashMap.put('Q', jVar);
        hashMap.put('q', jVar);
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', org.threeten.bp.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', org.threeten.bp.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', org.threeten.bp.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', org.threeten.bp.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', org.threeten.bp.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', org.threeten.bp.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', org.threeten.bp.temporal.a.SECOND_OF_MINUTE);
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', org.threeten.bp.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', org.threeten.bp.temporal.a.NANO_OF_DAY);
        f88129j = new c();
    }

    public d() {
        this.f88130a = this;
        this.f88132c = new ArrayList();
        this.f88136g = -1;
        this.f88131b = null;
        this.f88133d = false;
    }

    public static String D(org.threeten.bp.format.i iVar, org.threeten.bp.format.i iVar2, org.threeten.bp.chrono.j jVar, Locale locale) {
        ng.d.j(locale, "locale");
        ng.d.j(jVar, "chrono");
        if (iVar == null && iVar2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        DateFormat dateTimeInstance = iVar != null ? iVar2 != null ? DateFormat.getDateTimeInstance(iVar.ordinal(), iVar2.ordinal(), locale) : DateFormat.getDateInstance(iVar.ordinal(), locale) : DateFormat.getTimeInstance(iVar2.ordinal(), locale);
        if (dateTimeInstance instanceof SimpleDateFormat) {
            return ((SimpleDateFormat) dateTimeInstance).toPattern();
        }
        throw new IllegalArgumentException("Unable to determine pattern");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(char r8, int r9, org.threeten.bp.temporal.j r10) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.L(char, int, org.threeten.bp.temporal.j):void");
    }

    private void N(String str) {
        int i4;
        int i5 = 0;
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i6 = i5 + 1;
                while (i6 < str.length() && str.charAt(i6) == charAt) {
                    i6++;
                }
                int i7 = i6 - i5;
                if (charAt == 'p') {
                    if (i6 >= str.length() || (((charAt = str.charAt(i6)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i4 = i7;
                        i7 = 0;
                    } else {
                        int i10 = i6 + 1;
                        while (i10 < str.length() && str.charAt(i10) == charAt) {
                            i10++;
                        }
                        i4 = i10 - i6;
                        i6 = i10;
                    }
                    if (i7 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    G(i7);
                    i7 = i4;
                }
                org.threeten.bp.temporal.j jVar = f88128i.get(Character.valueOf(charAt));
                if (jVar != null) {
                    L(charAt, i7, jVar);
                } else if (charAt == 'z') {
                    if (i7 > 4) {
                        throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Too many pattern letters: ", charAt));
                    }
                    if (i7 == 4) {
                        B(org.threeten.bp.format.n.FULL);
                    } else {
                        B(org.threeten.bp.format.n.SHORT);
                    }
                } else if (charAt != 'V') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i7 < 4) {
                            l("+HHMM", "+0000");
                        } else if (i7 == 4) {
                            k(org.threeten.bp.format.n.FULL);
                        } else {
                            if (i7 != 5) {
                                throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Too many pattern letters: ", charAt));
                            }
                            l("+HH:MM:ss", "Z");
                        }
                    } else if (charAt == 'O') {
                        if (i7 == 1) {
                            k(org.threeten.bp.format.n.SHORT);
                        } else {
                            if (i7 != 4) {
                                throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Pattern letter count must be 1 or 4: ", charAt));
                            }
                            k(org.threeten.bp.format.n.FULL);
                        }
                    } else if (charAt == 'X') {
                        if (i7 > 5) {
                            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Too many pattern letters: ", charAt));
                        }
                        l(o.f88162d[i7 + (i7 == 1 ? 0 : 1)], "Z");
                    } else if (charAt == 'x') {
                        if (i7 > 5) {
                            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Too many pattern letters: ", charAt));
                        }
                        if (i7 == 1) {
                            str2 = "+00";
                        } else if (i7 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        l(o.f88162d[i7 + (i7 == 1 ? 0 : 1)], str2);
                    } else if (charAt == 'W') {
                        if (i7 > 1) {
                            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Too many pattern letters: ", charAt));
                        }
                        g(new u('W', i7));
                    } else if (charAt == 'w') {
                        if (i7 > 2) {
                            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Too many pattern letters: ", charAt));
                        }
                        g(new u('w', i7));
                    } else {
                        if (charAt != 'Y') {
                            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Unknown pattern letter: ", charAt));
                        }
                        g(new u('Y', i7));
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a("Pattern letter count must be 2: ", charAt));
                    }
                    y();
                }
                i5 = i6 - 1;
            } else if (charAt == '\'') {
                int i11 = i5 + 1;
                int i12 = i11;
                while (i12 < str.length()) {
                    if (str.charAt(i12) == '\'') {
                        int i13 = i12 + 1;
                        if (i13 >= str.length() || str.charAt(i13) != '\'') {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                    i12++;
                }
                if (i12 >= str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                String substring = str.substring(i11, i12);
                if (substring.length() == 0) {
                    h('\'');
                } else {
                    i(substring.replace("''", "'"));
                }
                i5 = i12;
            } else if (charAt == '[') {
                F();
            } else if (charAt == ']') {
                if (this.f88130a.f88131b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                E();
            } else {
                if (charAt == '{' || charAt == '}' || charAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
                }
                h(charAt);
            }
            i5++;
        }
    }

    private int g(h hVar) {
        ng.d.j(hVar, "pp");
        d dVar = this.f88130a;
        int i4 = dVar.f88134e;
        if (i4 > 0) {
            if (hVar != null) {
                hVar = new p(hVar, i4, dVar.f88135f);
            }
            d dVar2 = this.f88130a;
            dVar2.f88134e = 0;
            dVar2.f88135f = (char) 0;
        }
        this.f88130a.f88132c.add(hVar);
        this.f88130a.f88136g = -1;
        return r4.f88132c.size() - 1;
    }

    private d s(n nVar) {
        n d5;
        d dVar = this.f88130a;
        int i4 = dVar.f88136g;
        if (i4 < 0 || !(dVar.f88132c.get(i4) instanceof n)) {
            this.f88130a.f88136g = g(nVar);
        } else {
            d dVar2 = this.f88130a;
            int i5 = dVar2.f88136g;
            n nVar2 = (n) dVar2.f88132c.get(i5);
            int i6 = nVar.f88158c;
            int i7 = nVar.f88159d;
            if (i6 == i7 && nVar.f88160e == org.threeten.bp.format.k.NOT_NEGATIVE) {
                d5 = nVar2.e(i7);
                g(nVar.d());
                this.f88130a.f88136g = i5;
            } else {
                d5 = nVar2.d();
                this.f88130a.f88136g = g(nVar);
            }
            this.f88130a.f88132c.set(i5, d5);
        }
        return this;
    }

    public d A() {
        g(new v(f88127h, "ZoneRegionId()"));
        return this;
    }

    public d B(org.threeten.bp.format.n nVar) {
        g(new w(nVar));
        return this;
    }

    public d C(org.threeten.bp.format.n nVar, Set<org.threeten.bp.r> set) {
        ng.d.j(set, "preferredZones");
        g(new w(nVar));
        return this;
    }

    public d E() {
        d dVar = this.f88130a;
        if (dVar.f88131b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dVar.f88132c.size() > 0) {
            d dVar2 = this.f88130a;
            g gVar = new g(dVar2.f88132c, dVar2.f88133d);
            this.f88130a = this.f88130a.f88131b;
            g(gVar);
        } else {
            this.f88130a = this.f88130a.f88131b;
        }
        return this;
    }

    public d F() {
        d dVar = this.f88130a;
        dVar.f88136g = -1;
        this.f88130a = new d(dVar, true);
        return this;
    }

    public d G(int i4) {
        return H(i4, ' ');
    }

    public d H(int i4, char c5) {
        if (i4 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("The pad width must be at least one but was ", i4));
        }
        d dVar = this.f88130a;
        dVar.f88134e = i4;
        dVar.f88135f = c5;
        dVar.f88136g = -1;
        return this;
    }

    public d I() {
        g(r.INSENSITIVE);
        return this;
    }

    public d J() {
        g(r.SENSITIVE);
        return this;
    }

    public d K(org.threeten.bp.temporal.j jVar, long j4) {
        ng.d.j(jVar, "field");
        g(new i(jVar, j4));
        return this;
    }

    public d M() {
        g(r.LENIENT);
        return this;
    }

    public d O() {
        g(r.STRICT);
        return this;
    }

    public org.threeten.bp.format.c P() {
        return Q(Locale.getDefault());
    }

    public org.threeten.bp.format.c Q(Locale locale) {
        ng.d.j(locale, "locale");
        while (this.f88130a.f88131b != null) {
            E();
        }
        return new org.threeten.bp.format.c(new g(this.f88132c, false), locale, org.threeten.bp.format.h.f88212e, org.threeten.bp.format.j.SMART, null, null, null);
    }

    org.threeten.bp.format.c R(org.threeten.bp.format.j jVar) {
        return P().I(jVar);
    }

    public d a(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        g(cVar.C(false));
        return this;
    }

    public d b() {
        g(new f(null));
        return this;
    }

    public d c(org.threeten.bp.format.n nVar) {
        ng.d.j(nVar, "textStyle");
        g(new f(nVar));
        return this;
    }

    public d d(org.threeten.bp.temporal.j jVar, int i4, int i5, boolean z4) {
        g(new j(jVar, i4, i5, z4));
        return this;
    }

    public d e() {
        g(new k(-2));
        return this;
    }

    public d f(int i4) {
        if (i4 < -1 || i4 > 9) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Invalid fractional digits: ", i4));
        }
        g(new k(i4));
        return this;
    }

    public d h(char c5) {
        g(new e(c5));
        return this;
    }

    public d i(String str) {
        ng.d.j(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                g(new e(str.charAt(0)));
            } else {
                g(new s(str));
            }
        }
        return this;
    }

    public d j(org.threeten.bp.format.i iVar, org.threeten.bp.format.i iVar2) {
        if (iVar == null && iVar2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        g(new m(iVar, iVar2));
        return this;
    }

    public d k(org.threeten.bp.format.n nVar) {
        ng.d.j(nVar, "style");
        if (nVar != org.threeten.bp.format.n.FULL && nVar != org.threeten.bp.format.n.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        g(new l(nVar));
        return this;
    }

    public d l(String str, String str2) {
        g(new o(str2, str));
        return this;
    }

    public d m() {
        g(o.f88163e);
        return this;
    }

    public d n(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        g(cVar.C(true));
        return this;
    }

    public d o(String str) {
        ng.d.j(str, "pattern");
        N(str);
        return this;
    }

    public d p(org.threeten.bp.temporal.j jVar) {
        return r(jVar, org.threeten.bp.format.n.FULL);
    }

    public d q(org.threeten.bp.temporal.j jVar, Map<Long, String> map) {
        ng.d.j(jVar, "field");
        ng.d.j(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        org.threeten.bp.format.n nVar = org.threeten.bp.format.n.FULL;
        g(new t(jVar, nVar, new b(new m.b(Collections.singletonMap(nVar, linkedHashMap)))));
        return this;
    }

    public d r(org.threeten.bp.temporal.j jVar, org.threeten.bp.format.n nVar) {
        ng.d.j(jVar, "field");
        ng.d.j(nVar, "textStyle");
        g(new t(jVar, nVar, org.threeten.bp.format.g.b()));
        return this;
    }

    public d t(org.threeten.bp.temporal.j jVar) {
        ng.d.j(jVar, "field");
        s(new n(jVar, 1, 19, org.threeten.bp.format.k.NORMAL));
        return this;
    }

    public d u(org.threeten.bp.temporal.j jVar, int i4) {
        ng.d.j(jVar, "field");
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("The width must be from 1 to 19 inclusive but was ", i4));
        }
        s(new n(jVar, i4, i4, org.threeten.bp.format.k.NOT_NEGATIVE));
        return this;
    }

    public d v(org.threeten.bp.temporal.j jVar, int i4, int i5, org.threeten.bp.format.k kVar) {
        if (i4 == i5 && kVar == org.threeten.bp.format.k.NOT_NEGATIVE) {
            return u(jVar, i5);
        }
        ng.d.j(jVar, "field");
        ng.d.j(kVar, "signStyle");
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("The minimum width must be from 1 to 19 inclusive but was ", i4));
        }
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("The maximum width must be from 1 to 19 inclusive but was ", i5));
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("The maximum width must exceed or equal the minimum width but ", i5, " < ", i4));
        }
        s(new n(jVar, i4, i5, kVar));
        return this;
    }

    public d w(org.threeten.bp.temporal.j jVar, int i4, int i5, int i6) {
        ng.d.j(jVar, "field");
        s(new q(jVar, i4, i5, i6, null));
        return this;
    }

    public d x(org.threeten.bp.temporal.j jVar, int i4, int i5, org.threeten.bp.chrono.c cVar) {
        ng.d.j(jVar, "field");
        ng.d.j(cVar, "baseDate");
        s(new q(jVar, i4, i5, 0, cVar));
        return this;
    }

    public d y() {
        g(new v(org.threeten.bp.temporal.k.g(), "ZoneId()"));
        return this;
    }

    public d z() {
        g(new v(org.threeten.bp.temporal.k.f(), "ZoneOrOffsetId()"));
        return this;
    }

    private d(d dVar, boolean z4) {
        this.f88130a = this;
        this.f88132c = new ArrayList();
        this.f88136g = -1;
        this.f88131b = dVar;
        this.f88133d = z4;
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    static final class q extends n {

        /* renamed from: j, reason: collision with root package name */
        static final org.threeten.bp.g f88170j = org.threeten.bp.g.x0(2000, 1, 1);

        /* renamed from: h, reason: collision with root package name */
        private final int f88171h;

        /* renamed from: i, reason: collision with root package name */
        private final org.threeten.bp.chrono.c f88172i;

        q(org.threeten.bp.temporal.j jVar, int i4, int i5, int i6, org.threeten.bp.chrono.c cVar) {
            super(jVar, i4, i5, org.threeten.bp.format.k.NOT_NEGATIVE);
            if (i4 < 1 || i4 > 10) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("The width must be from 1 to 10 inclusive but was ", i4));
            }
            if (i5 < 1 || i5 > 10) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("The maxWidth must be from 1 to 10 inclusive but was ", i5));
            }
            if (i5 < i4) {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
            if (cVar == null) {
                long j4 = i6;
                if (!jVar.range().j(j4)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j4 + n.f88156g[i4] > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.f88171h = i6;
            this.f88172i = cVar;
        }

        @Override // org.threeten.bp.format.d.n
        long a(org.threeten.bp.format.f fVar, long j4) {
            long abs = Math.abs(j4);
            int i4 = this.f88171h;
            if (this.f88172i != null) {
                i4 = org.threeten.bp.chrono.j.p(fVar.e()).d(this.f88172i).get(this.f88157b);
            }
            if (j4 >= i4) {
                int i5 = n.f88156g[this.f88158c];
                if (j4 < i4 + i5) {
                    return abs % i5;
                }
            }
            return abs % n.f88156g[this.f88159d];
        }

        @Override // org.threeten.bp.format.d.n
        boolean b(org.threeten.bp.format.e eVar) {
            if (eVar.m()) {
                return super.b(eVar);
            }
            return false;
        }

        @Override // org.threeten.bp.format.d.n
        int c(org.threeten.bp.format.e eVar, long j4, int i4, int i5) {
            int i6 = this.f88171h;
            if (this.f88172i != null) {
                i6 = eVar.h().d(this.f88172i).get(this.f88157b);
                eVar.b(this, j4, i4, i5);
            }
            int i7 = i5 - i4;
            int i10 = this.f88158c;
            if (i7 == i10 && j4 >= 0) {
                long j5 = n.f88156g[i10];
                long j6 = i6;
                long j7 = j6 - (j6 % j5);
                j4 = i6 > 0 ? j7 + j4 : j7 - j4;
                if (j4 < j6) {
                    j4 += j5;
                }
            }
            return eVar.r(this.f88157b, j4, i4, i5);
        }

        @Override // org.threeten.bp.format.d.n
        n d() {
            return this.f88161f == -1 ? this : new q(this.f88157b, this.f88158c, this.f88159d, this.f88171h, this.f88172i, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.threeten.bp.format.d.n
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public q e(int i4) {
            return new q(this.f88157b, this.f88158c, this.f88159d, this.f88171h, this.f88172i, this.f88161f + i4);
        }

        @Override // org.threeten.bp.format.d.n
        public String toString() {
            StringBuilder sb = new StringBuilder("ReducedValue(");
            sb.append(this.f88157b);
            sb.append(",");
            sb.append(this.f88158c);
            sb.append(",");
            sb.append(this.f88159d);
            sb.append(",");
            Object obj = this.f88172i;
            if (obj == null) {
                obj = Integer.valueOf(this.f88171h);
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        private q(org.threeten.bp.temporal.j jVar, int i4, int i5, int i6, org.threeten.bp.chrono.c cVar, int i7) {
            super(jVar, i4, i5, org.threeten.bp.format.k.NOT_NEGATIVE, i7, null);
            this.f88171h = i6;
            this.f88172i = cVar;
        }
    }
}
