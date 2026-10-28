package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.k1;

/* compiled from: DurationFormatUtils.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f86253a = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";

    /* renamed from: b, reason: collision with root package name */
    static final Object f86254b = "y";

    /* renamed from: c, reason: collision with root package name */
    static final Object f86255c = "M";

    /* renamed from: d, reason: collision with root package name */
    static final Object f86256d = "d";

    /* renamed from: e, reason: collision with root package name */
    static final Object f86257e = "H";

    /* renamed from: f, reason: collision with root package name */
    static final Object f86258f = "m";

    /* renamed from: g, reason: collision with root package name */
    static final Object f86259g = "s";

    /* renamed from: h, reason: collision with root package name */
    static final Object f86260h = "S";

    static String a(a[] aVarArr, long j4, long j5, long j6, long j7, long j10, long j11, long j12, boolean z4) {
        int i4;
        int i5;
        long j13;
        a[] aVarArr2 = aVarArr;
        long j14 = j12;
        StringBuilder sb = new StringBuilder();
        int length = aVarArr2.length;
        int i6 = 0;
        boolean z5 = false;
        while (i6 < length) {
            a aVar = aVarArr2[i6];
            Object c5 = aVar.c();
            int b5 = aVar.b();
            if (c5 instanceof StringBuilder) {
                sb.append(c5.toString());
                j13 = j14;
                i5 = length;
                i4 = i6;
            } else {
                if (c5.equals(f86254b)) {
                    sb.append(k(j4, z4, b5));
                } else if (c5.equals(f86255c)) {
                    sb.append(k(j5, z4, b5));
                } else if (c5.equals(f86256d)) {
                    i4 = i6;
                    sb.append(k(j6, z4, b5));
                    j13 = j14;
                    i5 = length;
                    z5 = false;
                } else {
                    i4 = i6;
                    if (c5.equals(f86257e)) {
                        i5 = length;
                        sb.append(k(j7, z4, b5));
                    } else {
                        i5 = length;
                        if (c5.equals(f86258f)) {
                            sb.append(k(j10, z4, b5));
                        } else {
                            if (c5.equals(f86259g)) {
                                sb.append(k(j11, z4, b5));
                                j13 = j12;
                                z5 = true;
                            } else if (c5.equals(f86260h)) {
                                if (z5) {
                                    j13 = j12;
                                    sb.append(k(j13, true, z4 ? Math.max(3, b5) : 3));
                                } else {
                                    j13 = j12;
                                    sb.append(k(j13, z4, b5));
                                }
                                z5 = false;
                            } else {
                                j13 = j12;
                            }
                            i6 = i4 + 1;
                            j14 = j13;
                            length = i5;
                            aVarArr2 = aVarArr;
                        }
                    }
                    j13 = j14;
                    z5 = false;
                    i6 = i4 + 1;
                    j14 = j13;
                    length = i5;
                    aVarArr2 = aVarArr;
                }
                j13 = j14;
                i5 = length;
                i4 = i6;
                z5 = false;
            }
            i6 = i4 + 1;
            j14 = j13;
            length = i5;
            aVarArr2 = aVarArr;
        }
        return sb.toString();
    }

    public static String b(long j4, String str) {
        return c(j4, str, true);
    }

    public static String c(long j4, String str, boolean z4) {
        long j5;
        long j6;
        long j7;
        long j10;
        long j11;
        long j12;
        k1.r(0L, Long.MAX_VALUE, j4, "durationMillis must not be negative");
        a[] j13 = j(str);
        if (a.a(j13, f86256d)) {
            long j14 = j4 / 86400000;
            j5 = j4 - (86400000 * j14);
            j6 = j14;
        } else {
            j5 = j4;
            j6 = 0;
        }
        if (a.a(j13, f86257e)) {
            long j15 = j5 / e.f86241c;
            j5 -= e.f86241c * j15;
            j7 = j15;
        } else {
            j7 = 0;
        }
        if (a.a(j13, f86258f)) {
            long j16 = j5 / 60000;
            j5 -= 60000 * j16;
            j10 = j16;
        } else {
            j10 = 0;
        }
        if (a.a(j13, f86259g)) {
            long j17 = j5 / 1000;
            j12 = j5 - (1000 * j17);
            j11 = j17;
        } else {
            j11 = 0;
            j12 = j5;
        }
        return a(j13, 0L, 0L, j6, j7, j10, j11, j12, z4);
    }

    public static String d(long j4) {
        return c(j4, "HH:mm:ss.SSS", true);
    }

    public static String e(long j4) {
        return c(j4, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'", false);
    }

    public static String f(long j4, boolean z4, boolean z5) {
        String c5 = c(j4, "d' days 'H' hours 'm' minutes 's' seconds'", true);
        if (z4) {
            c5 = androidx.constraintlayout.core.motion.key.c.a(" ", c5);
            String n22 = b1.n2(c5, " 0 days", "");
            if (n22.length() != c5.length()) {
                String n23 = b1.n2(n22, " 0 hours", "");
                if (n23.length() != n22.length()) {
                    c5 = b1.n2(n23, " 0 minutes", "");
                    if (c5.length() != c5.length()) {
                        c5 = b1.n2(c5, " 0 seconds", "");
                    }
                } else {
                    c5 = n22;
                }
            }
            if (!c5.isEmpty()) {
                c5 = c5.substring(1);
            }
        }
        if (z5) {
            String n24 = b1.n2(c5, " 0 seconds", "");
            if (n24.length() != c5.length()) {
                c5 = b1.n2(n24, " 0 minutes", "");
                if (c5.length() != n24.length()) {
                    String n25 = b1.n2(c5, " 0 hours", "");
                    if (n25.length() != c5.length()) {
                        c5 = b1.n2(n25, " 0 days", "");
                    }
                } else {
                    c5 = n24;
                }
            }
        }
        return b1.n2(b1.n2(b1.n2(b1.n2(" " + c5, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String g(long j4, long j5, String str) {
        return h(j4, j5, str, true, TimeZone.getDefault());
    }

    public static String h(long j4, long j5, String str, boolean z4, TimeZone timeZone) {
        int i4 = 0;
        k1.B(j4 <= j5, "startMillis must not be greater than endMillis", new Object[0]);
        a[] j6 = j(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j4));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j5));
        int i5 = calendar2.get(14) - calendar.get(14);
        int i6 = calendar2.get(13) - calendar.get(13);
        int i7 = calendar2.get(12) - calendar.get(12);
        int i10 = calendar2.get(11) - calendar.get(11);
        int i11 = calendar2.get(5) - calendar.get(5);
        int i12 = calendar2.get(2) - calendar.get(2);
        int i13 = calendar2.get(1) - calendar.get(1);
        while (i5 < 0) {
            i5 += 1000;
            i6--;
        }
        while (i6 < 0) {
            i6 += 60;
            i7--;
        }
        while (i7 < 0) {
            i7 += 60;
            i10--;
        }
        while (i10 < 0) {
            i10 += 24;
            i11--;
        }
        if (a.a(j6, f86255c)) {
            while (i11 < 0) {
                i11 += calendar.getActualMaximum(5);
                i12--;
                calendar.add(2, 1);
            }
            while (i12 < 0) {
                i12 += 12;
                i13--;
            }
            if (!a.a(j6, f86254b) && i13 != 0) {
                while (i13 != 0) {
                    i12 += i13 * 12;
                    i13 = 0;
                }
            }
        } else {
            if (!a.a(j6, f86254b)) {
                int i14 = calendar2.get(1);
                if (i12 < 0) {
                    i14--;
                }
                while (calendar.get(1) != i14) {
                    int actualMaximum = (calendar.getActualMaximum(6) - calendar.get(6)) + i11;
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum++;
                    }
                    calendar.add(1, 1);
                    i11 = calendar.get(6) + actualMaximum;
                }
                i13 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                i11 += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i12 = 0;
            while (i11 < 0) {
                i11 += calendar.getActualMaximum(5);
                i12--;
                calendar.add(2, 1);
            }
        }
        if (!a.a(j6, f86256d)) {
            i10 += i11 * 24;
            i11 = 0;
        }
        if (!a.a(j6, f86257e)) {
            i7 += i10 * 60;
            i10 = 0;
        }
        if (!a.a(j6, f86258f)) {
            i6 += i7 * 60;
            i7 = 0;
        }
        if (a.a(j6, f86259g)) {
            i4 = i6;
        } else {
            i5 += i6 * 1000;
        }
        return a(j6, i13, i12, i11, i10, i7, i4, i5, z4);
    }

    public static String i(long j4, long j5) {
        return h(j4, j5, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'", false, TimeZone.getDefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static org.apache.commons.lang3.time.f.a[] j(java.lang.String r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.length()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
            r6 = r5
        Lf:
            int r7 = r9.length()
            if (r3 >= r7) goto L9f
            char r7 = r9.charAt(r3)
            r8 = 39
            if (r4 == 0) goto L24
            if (r7 == r8) goto L24
            r5.append(r7)
            goto L9b
        L24:
            if (r7 == r8) goto L6b
            r8 = 72
            if (r7 == r8) goto L68
            r8 = 77
            if (r7 == r8) goto L65
            r8 = 83
            if (r7 == r8) goto L62
            r8 = 100
            if (r7 == r8) goto L5f
            r8 = 109(0x6d, float:1.53E-43)
            if (r7 == r8) goto L5c
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L59
            r8 = 121(0x79, float:1.7E-43)
            if (r7 == r8) goto L56
            if (r5 != 0) goto L51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            org.apache.commons.lang3.time.f$a r8 = new org.apache.commons.lang3.time.f$a
            r8.<init>(r5)
            r0.add(r8)
        L51:
            r5.append(r7)
        L54:
            r7 = r2
            goto L80
        L56:
            java.lang.Object r7 = org.apache.commons.lang3.time.f.f86254b
            goto L80
        L59:
            java.lang.Object r7 = org.apache.commons.lang3.time.f.f86259g
            goto L80
        L5c:
            java.lang.Object r7 = org.apache.commons.lang3.time.f.f86258f
            goto L80
        L5f:
            java.lang.Object r7 = org.apache.commons.lang3.time.f.f86256d
            goto L80
        L62:
            java.lang.Object r7 = org.apache.commons.lang3.time.f.f86260h
            goto L80
        L65:
            java.lang.Object r7 = org.apache.commons.lang3.time.f.f86255c
            goto L80
        L68:
            java.lang.Object r7 = org.apache.commons.lang3.time.f.f86257e
            goto L80
        L6b:
            if (r4 == 0) goto L71
            r4 = r1
            r5 = r2
            r7 = r5
            goto L80
        L71:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            org.apache.commons.lang3.time.f$a r4 = new org.apache.commons.lang3.time.f$a
            r4.<init>(r5)
            r0.add(r4)
            r4 = 1
            goto L54
        L80:
            if (r7 == 0) goto L9b
            if (r6 == 0) goto L92
            java.lang.Object r5 = r6.c()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L92
            r6.d()
            goto L9a
        L92:
            org.apache.commons.lang3.time.f$a r6 = new org.apache.commons.lang3.time.f$a
            r6.<init>(r7)
            r0.add(r6)
        L9a:
            r5 = r2
        L9b:
            int r3 = r3 + 1
            goto Lf
        L9f:
            if (r4 != 0) goto Laa
            org.apache.commons.lang3.time.f$a[] r9 = new org.apache.commons.lang3.time.f.a[r1]
            java.lang.Object[] r9 = r0.toArray(r9)
            org.apache.commons.lang3.time.f$a[] r9 = (org.apache.commons.lang3.time.f.a[]) r9
            return r9
        Laa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unmatched quote in format: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.f.j(java.lang.String):org.apache.commons.lang3.time.f$a[]");
    }

    private static String k(long j4, boolean z4, int i4) {
        String l4 = Long.toString(j4);
        return z4 ? b1.z1(l4, i4, '0') : l4;
    }

    /* compiled from: DurationFormatUtils.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f86261a;

        /* renamed from: b, reason: collision with root package name */
        private int f86262b;

        a(Object obj) {
            this.f86261a = obj;
            this.f86262b = 1;
        }

        static boolean a(a[] aVarArr, Object obj) {
            for (a aVar : aVarArr) {
                if (aVar.c() == obj) {
                    return true;
                }
            }
            return false;
        }

        int b() {
            return this.f86262b;
        }

        Object c() {
            return this.f86261a;
        }

        void d() {
            this.f86262b++;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f86261a.getClass() != aVar.f86261a.getClass() || this.f86262b != aVar.f86262b) {
                return false;
            }
            Object obj2 = this.f86261a;
            return obj2 instanceof StringBuilder ? obj2.toString().equals(aVar.f86261a.toString()) : obj2 instanceof Number ? obj2.equals(aVar.f86261a) : obj2 == aVar.f86261a;
        }

        public int hashCode() {
            return this.f86261a.hashCode();
        }

        public String toString() {
            return b1.Z1(this.f86261a.toString(), this.f86262b);
        }

        a(Object obj, int i4) {
            this.f86261a = obj;
            this.f86262b = i4;
        }
    }
}
