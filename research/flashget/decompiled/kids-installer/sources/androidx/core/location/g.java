package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.c1;
import java.util.Iterator;

/* compiled from: GpsStatusWrapper.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
class g extends a {

    /* renamed from: n, reason: collision with root package name */
    private static final int f4840n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f4841o = 32;

    /* renamed from: p, reason: collision with root package name */
    private static final int f4842p = 33;

    /* renamed from: q, reason: collision with root package name */
    private static final int f4843q = 64;

    /* renamed from: r, reason: collision with root package name */
    private static final int f4844r = -87;

    /* renamed from: s, reason: collision with root package name */
    private static final int f4845s = 64;

    /* renamed from: t, reason: collision with root package name */
    private static final int f4846t = 24;

    /* renamed from: u, reason: collision with root package name */
    private static final int f4847u = 193;

    /* renamed from: v, reason: collision with root package name */
    private static final int f4848v = 200;

    /* renamed from: w, reason: collision with root package name */
    private static final int f4849w = 200;

    /* renamed from: x, reason: collision with root package name */
    private static final int f4850x = 35;

    /* renamed from: i, reason: collision with root package name */
    private final GpsStatus f4851i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f4852j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private Iterator<GpsSatellite> f4853k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f4854l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private GpsSatellite f4855m;

    g(GpsStatus gpsStatus) {
        gpsStatus.getClass();
        this.f4851i = gpsStatus;
        this.f4852j = -1;
        this.f4853k = gpsStatus.getSatellites().iterator();
        this.f4854l = -1;
        this.f4855m = null;
    }

    private static int p(int i5) {
        if (i5 > 0 && i5 <= 32) {
            return 1;
        }
        if (i5 >= 33 && i5 <= 64) {
            return 2;
        }
        if (i5 > 64 && i5 <= 88) {
            return 3;
        }
        if (i5 <= 200 || i5 > 235) {
            return (i5 < f4847u || i5 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite q(int i5) {
        GpsSatellite gpsSatellite;
        synchronized (this.f4851i) {
            if (i5 < this.f4854l) {
                this.f4853k = this.f4851i.getSatellites().iterator();
                this.f4854l = -1;
            }
            while (true) {
                int i6 = this.f4854l;
                if (i6 >= i5) {
                    break;
                }
                this.f4854l = i6 + 1;
                if (!this.f4853k.hasNext()) {
                    this.f4855m = null;
                    break;
                }
                this.f4855m = this.f4853k.next();
            }
            gpsSatellite = this.f4855m;
        }
        gpsSatellite.getClass();
        return gpsSatellite;
    }

    private static int r(int i5) {
        int p5 = p(i5);
        return p5 != 2 ? p5 != 3 ? p5 != 5 ? i5 : i5 - 200 : i5 - 64 : i5 + 87;
    }

    @Override // androidx.core.location.a
    public float a(int i5) {
        return q(i5).getAzimuth();
    }

    @Override // androidx.core.location.a
    public float b(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float d(int i5) {
        return q(i5).getSnr();
    }

    @Override // androidx.core.location.a
    public int e(int i5) {
        return p(q(i5).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f4851i.equals(((g) obj).f4851i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i5) {
        return q(i5).getElevation();
    }

    @Override // androidx.core.location.a
    public int g() {
        int i5;
        synchronized (this.f4851i) {
            if (this.f4852j == -1) {
                for (GpsSatellite gpsSatellite : this.f4851i.getSatellites()) {
                    this.f4852j++;
                }
                this.f4852j++;
            }
            i5 = this.f4852j;
        }
        return i5;
    }

    @Override // androidx.core.location.a
    public int h(int i5) {
        return r(q(i5).getPrn());
    }

    public int hashCode() {
        return this.f4851i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i5) {
        return q(i5).hasAlmanac();
    }

    @Override // androidx.core.location.a
    public boolean j(int i5) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i5) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean l(int i5) {
        return q(i5).hasEphemeris();
    }

    @Override // androidx.core.location.a
    public boolean m(int i5) {
        return q(i5).usedInFix();
    }
}
