package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Comparator;
import net.time4j.engine.n0;
import net.time4j.z;

/* compiled from: StdNormalizer.java */
/* loaded from: classes7.dex */
class v0<U extends z> implements net.time4j.engine.f0<U>, Comparator<n0.a<? extends net.time4j.engine.w>> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f83683c = 1000000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f83684d = 1000000000;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f83685b;

    /* compiled from: StdNormalizer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83686a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83687b;

        static {
            int[] iArr = new int[j.values().length];
            f83687b = iArr;
            try {
                iArr[j.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83687b[j.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83687b[j.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83687b[j.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83687b[j.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83687b[j.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[h.values().length];
            f83686a = iArr2;
            try {
                iArr2[h.MILLENNIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83686a[h.CENTURIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83686a[h.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83686a[h.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f83686a[h.QUARTERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f83686a[h.MONTHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f83686a[h.WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f83686a[h.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private v0(boolean z4) {
        this.f83685b = z4;
    }

    static Comparator<n0.a<? extends net.time4j.engine.w>> a() {
        return new v0(false);
    }

    static int e(net.time4j.engine.w wVar, net.time4j.engine.w wVar2) {
        int compare = Double.compare(wVar2.getLength(), wVar.getLength());
        if (compare != 0 || wVar.equals(wVar2)) {
            return compare;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鸂\u0001"));
    }

    static v0<h> n() {
        return new v0<>(false);
    }

    static v0<j> o() {
        return new v0<>(false);
    }

    static v0<z> t() {
        return new v0<>(true);
    }

    @Override // java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(n0.a<? extends net.time4j.engine.w> aVar, n0.a<? extends net.time4j.engine.w> aVar2) {
        return e(aVar.b(), aVar2.b());
    }

    @Override // net.time4j.engine.f0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public p<U> d(net.time4j.engine.n0<? extends U> n0Var) {
        long j4;
        long j5;
        long j6;
        long j7;
        long j10;
        long j11;
        long j12;
        long f4;
        int size = n0Var.f().size();
        ArrayList arrayList = new ArrayList(size);
        int i4 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        while (i4 < size) {
            n0.a<? extends U> aVar = n0Var.f().get(i4);
            long j21 = j16;
            j16 = aVar.a();
            U b5 = aVar.b();
            int i5 = size;
            long j22 = j14;
            if (b5 instanceof h) {
                switch (a.f83686a[((h) h.class.cast(b5)).ordinal()]) {
                    case 1:
                        j13 = net.time4j.base.c.f(net.time4j.base.c.i(j16, 1000L), j13);
                        break;
                    case 2:
                        j13 = net.time4j.base.c.f(net.time4j.base.c.i(j16, 100L), j13);
                        break;
                    case 3:
                        j13 = net.time4j.base.c.f(net.time4j.base.c.i(j16, 10L), j13);
                        break;
                    case 4:
                        j13 = net.time4j.base.c.f(j16, j13);
                        break;
                    case 5:
                        f4 = net.time4j.base.c.f(net.time4j.base.c.i(j16, 3L), j18);
                        j18 = f4;
                        break;
                    case 6:
                        f4 = net.time4j.base.c.f(j16, j18);
                        j18 = f4;
                        break;
                    case 7:
                        j20 = j16;
                        break;
                    case 8:
                        j19 = j16;
                        break;
                    default:
                        throw new UnsupportedOperationException(b5.toString());
                }
            } else if (b5 instanceof j) {
                switch (a.f83687b[((j) j.class.cast(b5)).ordinal()]) {
                    case 1:
                        j14 = j16;
                        j16 = j21;
                        continue;
                        i4++;
                        size = i5;
                    case 2:
                        j15 = j16;
                        break;
                    case 3:
                        j14 = j22;
                        continue;
                        i4++;
                        size = i5;
                    case 4:
                        j17 = net.time4j.base.c.f(net.time4j.base.c.i(j16, 1000000L), j17);
                        break;
                    case 5:
                        j17 = net.time4j.base.c.f(net.time4j.base.c.i(j16, 1000L), j17);
                        break;
                    case 6:
                        j17 = net.time4j.base.c.f(j16, j17);
                        break;
                    default:
                        throw new UnsupportedOperationException(b5.toString());
                }
            } else {
                arrayList.add(n0.a.c(j16, b5));
            }
            j16 = j21;
            j14 = j22;
            continue;
            i4++;
            size = i5;
        }
        long j23 = j14;
        long j24 = j16;
        if ((j23 | j15 | j24 | j17) != 0) {
            long j25 = j17 % 1000000000;
            long f5 = net.time4j.base.c.f(j24, j17 / 1000000000);
            j7 = f5 % 60;
            long f6 = net.time4j.base.c.f(j15, f5 / 60);
            j6 = f6 % 60;
            j5 = net.time4j.base.c.f(j23, f6 / 60);
            if (this.f83685b) {
                j4 = net.time4j.base.c.f(j19, j5 / 24);
                j10 = j25;
                j5 %= 24;
            } else {
                j4 = j19;
                j10 = j25;
            }
        } else {
            j4 = j19;
            j5 = 0;
            j6 = 0;
            j7 = 0;
            j10 = 0;
        }
        if ((j13 | j18 | j4) != 0) {
            j12 = j7;
            long f7 = net.time4j.base.c.f(j13, j18 / 12);
            long j26 = j18 % 12;
            j11 = j6;
            long f10 = net.time4j.base.c.f(net.time4j.base.c.i(j20, 7L), j4);
            if (f7 != 0) {
                arrayList.add(n0.a.c(f7, h.YEARS));
            }
            if (j26 != 0) {
                arrayList.add(n0.a.c(j26, h.MONTHS));
            }
            if (f10 != 0) {
                arrayList.add(n0.a.c(f10, h.DAYS));
            }
        } else {
            j11 = j6;
            j12 = j7;
            long j27 = j20;
            if (j27 != 0) {
                arrayList.add(n0.a.c(j27, h.WEEKS));
            }
        }
        if (j5 != 0) {
            arrayList.add(n0.a.c(j5, j.HOURS));
        }
        if (j11 != 0) {
            arrayList.add(n0.a.c(j11, j.MINUTES));
        }
        if (j12 != 0) {
            arrayList.add(n0.a.c(j12, j.SECONDS));
        }
        long j28 = j10;
        if (j28 != 0) {
            arrayList.add(n0.a.c(j28, j.NANOS));
        }
        return new p<>(arrayList, n0Var.d());
    }
}
