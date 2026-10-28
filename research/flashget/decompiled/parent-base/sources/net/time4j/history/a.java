package net.time4j.history;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: AncientJulianLeapYears.java */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f83150c;

    /* renamed from: d, reason: collision with root package name */
    private static final h f83151d = h.g(j.AD, 8, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    private static final h f83152e = h.g(j.BC, 45, 1, 1);

    /* renamed from: f, reason: collision with root package name */
    private static final long f83153f = -676021;

    /* renamed from: g, reason: collision with root package name */
    public static final a f83154g;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f83155a;

    /* renamed from: b, reason: collision with root package name */
    private final b f83156b;

    /* compiled from: AncientJulianLeapYears.java */
    /* renamed from: net.time4j.history.a$a, reason: collision with other inner class name */
    class C1299a implements b {
        C1299a() {
        }

        private int a(int i4, int i5) {
            switch (i5) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return c(i4) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("阣\u0001"), i5));
            }
        }

        private int b(h hVar) {
            return hVar.c().annoDomini(hVar.e());
        }

        private boolean c(int i4) {
            return Arrays.binarySearch(a.this.f83155a, i4) >= 0;
        }

        @Override // net.time4j.history.b
        public h fromMJD(long j4) {
            long j5 = a.f83153f;
            if (j4 >= a.f83153f) {
                return c.JULIAN.fromMJD(j4);
            }
            int i4 = 7;
            while (i4 >= -44) {
                j5 -= c(i4) ? 366L : 365L;
                if (j5 <= j4) {
                    int i5 = 1;
                    while (i5 <= 12) {
                        long a5 = a(i4, i5) + j5;
                        if (a5 > j4) {
                            j jVar = i4 <= 0 ? j.BC : j.AD;
                            if (i4 <= 0) {
                                i4 = 1 - i4;
                            }
                            return h.g(jVar, i4, i5, (int) ((j4 - j5) + 1));
                        }
                        i5++;
                        j5 = a5;
                    }
                }
                i4--;
            }
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("阤\u0001"), j4));
        }

        @Override // net.time4j.history.b
        public int getMaximumDayOfMonth(h hVar) {
            if (hVar.compareTo(a.f83151d) >= 0) {
                return c.JULIAN.getMaximumDayOfMonth(hVar);
            }
            if (hVar.compareTo(a.f83152e) >= 0) {
                return a(b(hVar), hVar.d());
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("阤\u0001") + hVar);
        }

        @Override // net.time4j.history.b
        public boolean isValid(h hVar) {
            int b5;
            if (hVar == null || (b5 = b(hVar)) < -44) {
                return false;
            }
            return b5 >= 8 ? c.JULIAN.isValid(hVar) : hVar.b() <= a(b5, hVar.d());
        }

        @Override // net.time4j.history.b
        public long toMJD(h hVar) {
            if (hVar.compareTo(a.f83151d) >= 0) {
                return c.JULIAN.toMJD(hVar);
            }
            if (hVar.compareTo(a.f83152e) < 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("阤\u0001") + hVar);
            }
            int b5 = b(hVar);
            long j4 = a.f83153f;
            for (int i4 = 7; i4 >= b5; i4--) {
                j4 -= c(i4) ? 366L : 365L;
            }
            for (int i5 = 1; i5 < hVar.d(); i5++) {
                j4 += a(b5, i5);
            }
            return (j4 + hVar.b()) - 1;
        }
    }

    static {
        int[] iArr = {42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9};
        f83150c = iArr;
        f83154g = new a(iArr);
    }

    private a(int... iArr) {
        int i4;
        int[] iArr2 = new int[iArr.length];
        int i5 = 0;
        while (true) {
            i4 = 1;
            if (i5 >= iArr.length) {
                break;
            }
            iArr2[i5] = 1 - iArr[i5];
            i5++;
        }
        Arrays.sort(iArr2);
        this.f83155a = iArr2;
        if (iArr2.length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("阧\u0001"));
        }
        int i6 = iArr2[0];
        if (i6 < -44 || iArr2[iArr2.length - 1] >= 8) {
            throw new IllegalArgumentException(ProtectedSandApp.s("阦\u0001") + Arrays.toString(iArr));
        }
        while (i4 < iArr.length) {
            int i7 = iArr2[i4];
            if (i7 == i6) {
                throw new IllegalArgumentException(ProtectedSandApp.s("阥\u0001") + Arrays.toString(iArr));
            }
            i4++;
            i6 = i7;
        }
        this.f83156b = new C1299a();
    }

    public static a f(int... iArr) {
        return Arrays.equals(iArr, f83150c) ? f83154g : new a(iArr);
    }

    b d() {
        return this.f83156b;
    }

    int[] e() {
        return this.f83155a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f83155a == ((a) obj).f83155a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f83155a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < this.f83155a.length; i4++) {
            if (i4 > 0) {
                sb.append(ProtectedSandApp.s("阨\u0001"));
            }
            int i5 = 1 - this.f83155a[i4];
            if (i5 > 0) {
                sb.append(ProtectedSandApp.s("阩\u0001"));
                sb.append(i5);
            } else {
                sb.append(ProtectedSandApp.s("阪\u0001"));
                sb.append(this.f83155a[i4]);
            }
        }
        return sb.toString();
    }
}
