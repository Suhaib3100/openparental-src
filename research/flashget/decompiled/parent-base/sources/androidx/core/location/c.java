package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.c1;
import java.util.Iterator;

/* compiled from: GpsStatusWrapper.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
class c extends a {

    /* renamed from: n, reason: collision with root package name */
    private static final int f26347n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f26348o = 32;

    /* renamed from: p, reason: collision with root package name */
    private static final int f26349p = 33;

    /* renamed from: q, reason: collision with root package name */
    private static final int f26350q = 64;

    /* renamed from: r, reason: collision with root package name */
    private static final int f26351r = -87;

    /* renamed from: s, reason: collision with root package name */
    private static final int f26352s = 64;

    /* renamed from: t, reason: collision with root package name */
    private static final int f26353t = 24;

    /* renamed from: u, reason: collision with root package name */
    private static final int f26354u = 193;

    /* renamed from: v, reason: collision with root package name */
    private static final int f26355v = 200;

    /* renamed from: w, reason: collision with root package name */
    private static final int f26356w = 200;

    /* renamed from: x, reason: collision with root package name */
    private static final int f26357x = 35;

    /* renamed from: i, reason: collision with root package name */
    private final GpsStatus f26358i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f26359j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private Iterator<GpsSatellite> f26360k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f26361l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private GpsSatellite f26362m;

    c(GpsStatus gpsStatus) {
        gpsStatus.getClass();
        this.f26358i = gpsStatus;
        this.f26359j = -1;
        this.f26360k = gpsStatus.getSatellites().iterator();
        this.f26361l = -1;
        this.f26362m = null;
    }

    private static int p(int i4) {
        if (i4 > 0 && i4 <= 32) {
            return 1;
        }
        if (i4 >= 33 && i4 <= 64) {
            return 2;
        }
        if (i4 > 64 && i4 <= 88) {
            return 3;
        }
        if (i4 <= 200 || i4 > 235) {
            return (i4 < f26354u || i4 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite q(int i4) {
        GpsSatellite gpsSatellite;
        synchronized (this.f26358i) {
            try {
                if (i4 < this.f26361l) {
                    this.f26360k = this.f26358i.getSatellites().iterator();
                    this.f26361l = -1;
                }
                while (true) {
                    int i5 = this.f26361l;
                    if (i5 >= i4) {
                        break;
                    }
                    this.f26361l = i5 + 1;
                    if (!this.f26360k.hasNext()) {
                        this.f26362m = null;
                        break;
                    }
                    this.f26362m = this.f26360k.next();
                }
                gpsSatellite = this.f26362m;
            } catch (Throwable th) {
                throw th;
            }
        }
        gpsSatellite.getClass();
        return gpsSatellite;
    }

    private static int r(int i4) {
        int p4 = p(i4);
        return p4 != 2 ? p4 != 3 ? p4 != 5 ? i4 : i4 - 200 : i4 - 64 : i4 + 87;
    }

    @Override // androidx.core.location.a
    public float a(int i4) {
        return q(i4).getAzimuth();
    }

    @Override // androidx.core.location.a
    public float b(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float d(int i4) {
        return q(i4).getSnr();
    }

    @Override // androidx.core.location.a
    public int e(int i4) {
        return p(q(i4).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f26358i.equals(((c) obj).f26358i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i4) {
        return q(i4).getElevation();
    }

    @Override // androidx.core.location.a
    public int g() {
        int i4;
        synchronized (this.f26358i) {
            try {
                if (this.f26359j == -1) {
                    for (GpsSatellite gpsSatellite : this.f26358i.getSatellites()) {
                        this.f26359j++;
                    }
                    this.f26359j++;
                }
                i4 = this.f26359j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    @Override // androidx.core.location.a
    public int h(int i4) {
        return r(q(i4).getPrn());
    }

    public int hashCode() {
        return this.f26358i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i4) {
        return q(i4).hasAlmanac();
    }

    @Override // androidx.core.location.a
    public boolean j(int i4) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i4) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean l(int i4) {
        return q(i4).hasEphemeris();
    }

    @Override // androidx.core.location.a
    public boolean m(int i4) {
        return q(i4).usedInFix();
    }
}
