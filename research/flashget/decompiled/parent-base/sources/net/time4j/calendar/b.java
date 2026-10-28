package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* compiled from: AstronomicalHijriData.java */
/* loaded from: classes7.dex */
final class b implements o<HijriCalendar> {

    /* renamed from: j, reason: collision with root package name */
    static final b f82361j;

    /* renamed from: a, reason: collision with root package name */
    private final String f82362a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82363b;

    /* renamed from: c, reason: collision with root package name */
    private final String f82364c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82365d;

    /* renamed from: e, reason: collision with root package name */
    private final int f82366e;

    /* renamed from: f, reason: collision with root package name */
    private final long f82367f;

    /* renamed from: g, reason: collision with root package name */
    private final long f82368g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f82369h;

    /* renamed from: i, reason: collision with root package name */
    private final long[] f82370i;

    static {
        try {
            f82361j = new b(ProtectedSandApp.s("賣\u0001"));
        } catch (IOException e4) {
            throw new IllegalStateException(e4);
        }
    }

    b(x xVar) {
        this.f82362a = ProtectedSandApp.s("賵\u0001") + xVar.name();
        int i4 = 0;
        this.f82363b = 0;
        this.f82364c = xVar.version();
        int d5 = xVar.d();
        this.f82365d = d5;
        int b5 = xVar.b();
        this.f82366e = b5;
        if (b5 < d5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("賸\u0001"));
        }
        if (xVar.name().startsWith(ProtectedSandApp.s("賶\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("賷\u0001"));
        }
        this.f82367f = xVar.a().b();
        int i5 = ((b5 - d5) + 1) * 12;
        this.f82369h = new int[i5];
        this.f82370i = new long[i5];
        long j4 = 0;
        while (d5 <= this.f82366e) {
            for (int i6 = 1; i6 <= 12; i6++) {
                int c5 = xVar.c(d5, i6);
                this.f82369h[i4] = c5;
                this.f82370i[i4] = this.f82367f + j4;
                j4 += c5;
                i4++;
            }
            d5++;
        }
        this.f82368g = (this.f82367f + j4) - 1;
    }

    private static int j(long j4, long[] jArr) {
        int length = jArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) / 2;
            if (jArr[i5] <= j4) {
                i4 = i5 + 1;
            } else {
                length = i5 - 1;
            }
        }
        return i4 - 1;
    }

    @Override // net.time4j.engine.l
    public List<net.time4j.engine.j> a() {
        return Collections.singletonList(y.ANNO_HEGIRAE);
    }

    @Override // net.time4j.calendar.o
    public int b(net.time4j.engine.j jVar, int i4, int i5) {
        if (jVar != y.ANNO_HEGIRAE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("賻\u0001") + jVar);
        }
        int i6 = (((i4 - this.f82365d) * 12) + i5) - 1;
        if (i6 >= 0) {
            int[] iArr = this.f82369h;
            if (i6 < iArr.length) {
                return iArr[i6];
            }
        }
        throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("賹\u0001"), i4, ProtectedSandApp.s("賺\u0001"), i5));
    }

    @Override // net.time4j.calendar.o
    public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
        int i7;
        return jVar == y.ANNO_HEGIRAE && i4 >= (i7 = this.f82365d) && i4 <= this.f82366e && i5 >= 1 && i5 <= 12 && i6 >= 1 && (((i4 - i7) * 12) + i5) - 1 < this.f82369h.length && i6 <= b(jVar, i4, i5);
    }

    @Override // net.time4j.engine.l
    public long d() {
        return net.time4j.base.c.m(this.f82368g, this.f82363b);
    }

    @Override // net.time4j.engine.l
    public long g() {
        return net.time4j.base.c.m(this.f82367f, this.f82363b);
    }

    @Override // net.time4j.calendar.o
    public int h(net.time4j.engine.j jVar, int i4) {
        if (jVar != y.ANNO_HEGIRAE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("賻\u0001") + jVar);
        }
        if (i4 < this.f82365d || i4 > this.f82366e) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("賽\u0001"), i4));
        }
        int i5 = 0;
        for (int i6 = 1; i6 <= 12; i6++) {
            int i7 = (((i4 - this.f82365d) * 12) + i6) - 1;
            int[] iArr = this.f82369h;
            if (i7 >= iArr.length) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("購\u0001"), i4));
            }
            i5 += iArr[i7];
        }
        return i5;
    }

    String i() {
        return this.f82364c;
    }

    @Override // net.time4j.engine.l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public long f(HijriCalendar hijriCalendar) {
        if (hijriCalendar.getVariant().equals(this.f82362a)) {
            return net.time4j.base.c.m((this.f82370i[(hijriCalendar.t0().getValue() + ((hijriCalendar.o() - this.f82365d) * 12)) - 1] + hijriCalendar.t()) - 1, this.f82363b);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("賾\u0001") + hijriCalendar + ProtectedSandApp.s("賿\u0001"));
    }

    @Override // net.time4j.engine.l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public HijriCalendar e(long j4) {
        long f4 = net.time4j.base.c.f(j4, this.f82363b);
        int j5 = j(f4, this.f82370i);
        if (j5 >= 0) {
            long[] jArr = this.f82370i;
            if (j5 < jArr.length - 1 || jArr[j5] + this.f82369h[j5] > f4) {
                return HijriCalendar.E0(this.f82362a, (j5 / 12) + this.f82365d, (j5 % 12) + 1, (int) ((f4 - jArr[j5]) + 1));
            }
        }
        throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("贀\u0001"), j4));
    }

    b(String str) throws IOException {
        Throwable th;
        InputStream inputStream;
        String s4 = ProtectedSandApp.s("賤\u0001");
        String s5 = ProtectedSandApp.s("賥\u0001");
        v a5 = v.a(str);
        this.f82362a = str;
        String b5 = a5.b();
        this.f82363b = a5.c();
        String str2 = ProtectedSandApp.s("賦\u0001") + b5.replace('-', '_') + ProtectedSandApp.s("賧\u0001");
        InputStream e4 = net.time4j.base.d.c().e(net.time4j.base.d.c().f(ProtectedSandApp.s("賨\u0001"), b.class, str2), true);
        e4 = e4 == null ? net.time4j.base.d.c().d(b.class, str2, true) : e4;
        try {
            try {
                Properties properties = new Properties();
                properties.load(e4);
                String property = properties.getProperty(ProtectedSandApp.s("賩\u0001"));
                try {
                    if (b5.equals(property)) {
                        this.f82364c = properties.getProperty(ProtectedSandApp.s("質\u0001"), ProtectedSandApp.s("賫\u0001"));
                        long longValue = ((Long) net.time4j.format.expert.n.f82986g.f(properties.getProperty(ProtectedSandApp.s("賬\u0001"), "")).r(net.time4j.engine.b0.UTC)).longValue();
                        this.f82367f = longValue;
                        int parseInt = Integer.parseInt(properties.getProperty(ProtectedSandApp.s("賭\u0001"), ProtectedSandApp.s("賮\u0001")));
                        this.f82365d = parseInt;
                        int parseInt2 = Integer.parseInt(properties.getProperty(ProtectedSandApp.s("賯\u0001"), ProtectedSandApp.s("賰\u0001")));
                        this.f82366e = parseInt2;
                        int i4 = ((parseInt2 - parseInt) + 1) * 12;
                        int[] iArr = new int[i4];
                        long[] jArr = new long[i4];
                        int i5 = 0;
                        while (true) {
                            if (parseInt > parseInt2) {
                                inputStream = e4;
                                break;
                            }
                            String property2 = properties.getProperty(String.valueOf(parseInt));
                            if (property2 != null) {
                                String[] split = property2.split(ProtectedSandApp.s("賱\u0001"));
                                int i6 = 0;
                                while (i6 < Math.min(split.length, 12)) {
                                    int parseInt3 = Integer.parseInt(split[i6]);
                                    iArr[i5] = parseInt3;
                                    jArr[i5] = longValue;
                                    longValue += parseInt3;
                                    i5++;
                                    i6++;
                                    e4 = e4;
                                    parseInt2 = parseInt2;
                                }
                                int i7 = parseInt2;
                                inputStream = e4;
                                if (split.length < 12) {
                                    int[] iArr2 = new int[i5];
                                    long[] jArr2 = new long[i5];
                                    System.arraycopy(iArr, 0, iArr2, 0, i5);
                                    System.arraycopy(jArr, 0, jArr2, 0, i5);
                                    iArr = iArr2;
                                    jArr = jArr2;
                                    break;
                                }
                                parseInt++;
                                e4 = inputStream;
                                parseInt2 = i7;
                            } else {
                                throw new IOException(s4 + str2 + ProtectedSandApp.s("賲\u0001") + parseInt + ProtectedSandApp.s("賳\u0001"));
                            }
                        }
                        this.f82368g = longValue - 1;
                        this.f82369h = iArr;
                        this.f82370i = jArr;
                        try {
                            inputStream.close();
                            return;
                        } catch (IOException e5) {
                            e5.printStackTrace(System.err);
                            return;
                        }
                    }
                    throw new IOException(s5 + b5 + ProtectedSandApp.s("賴\u0001") + property);
                } catch (NumberFormatException e6) {
                    e = e6;
                    throw new IOException(s4 + str2, e);
                } catch (ParseException e7) {
                    e = e7;
                    throw new IOException(s4 + str2, e);
                }
            } catch (Throwable th2) {
                th = th2;
                th = th;
                try {
                    r16.close();
                    throw th;
                } catch (IOException e10) {
                    e10.printStackTrace(System.err);
                    throw th;
                }
            }
        } catch (NumberFormatException e11) {
            e = e11;
        } catch (ParseException e12) {
            e = e12;
        } catch (Throwable th3) {
            th = th3;
            InputStream inputStream2 = e4;
            th = th;
            inputStream2.close();
            throw th;
        }
    }
}
