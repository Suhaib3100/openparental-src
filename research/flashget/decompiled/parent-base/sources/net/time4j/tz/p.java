package net.time4j.tz;

import androidx.collection.m1;
import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ZonalOffset.java */
/* loaded from: classes7.dex */
public final class p implements Comparable<p>, k, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<Integer, p> f83642e;

    /* renamed from: f, reason: collision with root package name */
    private static final BigDecimal f83643f;

    /* renamed from: g, reason: collision with root package name */
    private static final BigDecimal f83644g;

    /* renamed from: h, reason: collision with root package name */
    private static final BigDecimal f83645h;

    /* renamed from: i, reason: collision with root package name */
    private static final BigDecimal f83646i;

    /* renamed from: j, reason: collision with root package name */
    private static final BigDecimal f83647j;

    /* renamed from: k, reason: collision with root package name */
    private static final BigDecimal f83648k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f83649l;
    private static final long serialVersionUID = -1410512619471503090L;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f83650b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f83651c;

    /* renamed from: d, reason: collision with root package name */
    private final transient String f83652d;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f83642e = concurrentHashMap;
        f83643f = new BigDecimal(60);
        f83644g = new BigDecimal(MMKV.ExpireInHour);
        f83645h = new BigDecimal(-180);
        f83646i = new BigDecimal(180);
        f83647j = new BigDecimal(240);
        f83648k = new BigDecimal(1000000000);
        p pVar = new p(0, 0);
        f83649l = pVar;
        concurrentHashMap.put(0, pVar);
    }

    private p(int i4, int i5) {
        if (i5 != 0) {
            if (Math.abs(i5) > 999999999) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鶚\u0001"), i5));
            }
            if (i4 < -39600 || i4 > 39600) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鶙\u0001"), i4));
            }
            if ((i4 < 0 && i5 > 0) || (i4 > 0 && i5 < 0)) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("鶗\u0001"), i4, ProtectedSandApp.s("鶘\u0001"), i5));
            }
        } else if (i4 < -64800 || i4 > 64800) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鶖\u0001"), i4));
        }
        boolean z4 = i4 < 0 || i5 < 0;
        StringBuilder sb = new StringBuilder();
        sb.append(z4 ? '-' : '+');
        int abs = Math.abs(i4);
        int i6 = abs / MMKV.ExpireInHour;
        int i7 = (abs / 60) % 60;
        int i10 = abs % 60;
        if (i6 < 10) {
            sb.append('0');
        }
        sb.append(i6);
        sb.append(':');
        if (i7 < 10) {
            sb.append('0');
        }
        sb.append(i7);
        if (i10 != 0 || i5 != 0) {
            sb.append(':');
            if (i10 < 10) {
                sb.append('0');
            }
            sb.append(i10);
            if (i5 != 0) {
                sb.append('.');
                String valueOf = String.valueOf(Math.abs(i5));
                int length = 9 - valueOf.length();
                for (int i11 = 0; i11 < length; i11++) {
                    sb.append('0');
                }
                sb.append(valueOf);
            }
        }
        this.f83652d = sb.toString();
        this.f83650b = i4;
        this.f83651c = i5;
    }

    public static p a(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(f83646i) > 0 || bigDecimal.compareTo(f83645h) < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶛\u0001") + bigDecimal);
        }
        BigDecimal multiply = bigDecimal.multiply(f83647j);
        BigDecimal scale = multiply.setScale(0, RoundingMode.DOWN);
        BigDecimal multiply2 = multiply.subtract(scale).setScale(9, RoundingMode.HALF_UP).multiply(f83648k);
        int intValueExact = scale.intValueExact();
        int intValueExact2 = multiply2.intValueExact();
        return intValueExact2 == 0 ? p(intValueExact, 0) : intValueExact2 == 1000000000 ? p(intValueExact + 1, 0) : intValueExact2 == -1000000000 ? p(intValueExact - 1, 0) : new p(intValueExact, intValueExact2);
    }

    public static p b(f fVar, int i4, int i5, double d5) {
        if (fVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鶟\u0001"));
        }
        if (i4 < 0 || i4 > 180) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶞\u0001"));
        }
        if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶝\u0001"));
        }
        if (Double.compare(d5, com.google.firebase.remoteconfig.p.f60679p) < 0 || Double.compare(d5, 60.0d) >= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶜\u0001"));
        }
        BigDecimal valueOf = BigDecimal.valueOf(i4);
        if (i5 != 0) {
            valueOf = valueOf.add(BigDecimal.valueOf(i5).setScale(15, RoundingMode.UNNECESSARY).divide(f83643f, RoundingMode.HALF_UP));
        }
        if (d5 != com.google.firebase.remoteconfig.p.f60679p) {
            valueOf = valueOf.add(BigDecimal.valueOf(d5).setScale(15, RoundingMode.FLOOR).divide(f83644g, RoundingMode.HALF_UP));
        }
        if (fVar == f.BEHIND_UTC) {
            valueOf = valueOf.negate();
        }
        return a(valueOf);
    }

    private static String d(int i4, int i5) {
        return m1.a(ProtectedSandApp.s("鶠\u0001"), i4, ProtectedSandApp.s("鶡\u0001"), i5, ']');
    }

    public static p m(f fVar, int i4) {
        return n(fVar, i4, 0);
    }

    public static p n(f fVar, int i4, int i5) {
        if (fVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鶟\u0001"));
        }
        if (i4 < 0 || i4 > 18) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶤\u0001") + d(i4, i5));
        }
        if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶣\u0001") + d(i4, i5));
        }
        if (i4 == 18 && i5 != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶢\u0001") + d(i4, i5));
        }
        int i6 = (i5 * 60) + (i4 * MMKV.ExpireInHour);
        if (fVar == f.BEHIND_UTC) {
            i6 = -i6;
        }
        return p(i6, 0);
    }

    public static p o(int i4) {
        return p(i4, 0);
    }

    public static p p(int i4, int i5) {
        if (i5 != 0) {
            return new p(i4, i5);
        }
        if (i4 == 0) {
            return f83649l;
        }
        if (i4 % w.b.f22438j != 0) {
            return new p(i4, 0);
        }
        Integer valueOf = Integer.valueOf(i4);
        ConcurrentMap<Integer, p> concurrentMap = f83642e;
        p pVar = concurrentMap.get(valueOf);
        if (pVar != null) {
            return pVar;
        }
        concurrentMap.putIfAbsent(valueOf, new p(i4, 0));
        return concurrentMap.get(valueOf);
    }

    private static int q(String str, int i4, int i5) {
        int min = Math.min(str.length() - i4, i5);
        int i6 = -1;
        for (int i7 = 0; i7 < min; i7++) {
            char charAt = str.charAt(i4 + i7);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i6 = i6 == -1 ? charAt - '0' : (charAt - '0') + (i6 * 10);
        }
        return i6;
    }

    public static p r(String str) {
        return s(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(ProtectedSandApp.s("鶥\u0001"));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static net.time4j.tz.p s(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.tz.p.s(java.lang.String, boolean):net.time4j.tz.p");
    }

    private Object writeReplace() {
        return new SPX(this, 15);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        int i4 = this.f83650b;
        int i5 = pVar.f83650b;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        int i6 = this.f83651c - pVar.f83651c;
        if (i6 < 0) {
            return -1;
        }
        return i6 == 0 ? 0 : 1;
    }

    @Override // net.time4j.tz.k
    public String canonical() {
        if (this.f83650b == 0 && this.f83651c == 0) {
            return ProtectedSandApp.s("鶦\u0001");
        }
        return ProtectedSandApp.s("鶧\u0001") + this.f83652d;
    }

    public int e() {
        return Math.abs(this.f83650b) / MMKV.ExpireInHour;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f83650b == pVar.f83650b && this.f83651c == pVar.f83651c;
    }

    public int f() {
        return (Math.abs(this.f83650b) / 60) % 60;
    }

    public int g() {
        return Math.abs(this.f83650b) % 60;
    }

    public int h() {
        return this.f83651c;
    }

    public int hashCode() {
        return (this.f83651c % 64000) + (~this.f83650b);
    }

    public int i() {
        return this.f83650b;
    }

    j j() {
        return j.i0(this);
    }

    public f k() {
        return (this.f83650b < 0 || this.f83651c < 0) ? f.BEHIND_UTC : f.AHEAD_OF_UTC;
    }

    public String l(Locale locale) {
        boolean z4 = this.f83650b == 0 && this.f83651c == 0;
        try {
            return l.f83576x.d(z4, locale);
        } catch (Throwable unused) {
            return z4 ? ProtectedSandApp.s("鶨\u0001") : ProtectedSandApp.s("鶫\u0001");
        }
    }

    public String toString() {
        return this.f83652d;
    }
}
