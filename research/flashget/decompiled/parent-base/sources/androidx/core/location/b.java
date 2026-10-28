package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.x0;

/* compiled from: GnssStatusWrapper.java */
@c1({c1.a.LIBRARY})
@x0(24)
/* loaded from: classes3.dex */
class b extends androidx.core.location.a {

    /* renamed from: i, reason: collision with root package name */
    private final GnssStatus f26344i;

    /* compiled from: GnssStatusWrapper.java */
    @x0(26)
    static class a {
        private a() {
        }

        static float a(GnssStatus gnssStatus, int i4) {
            return gnssStatus.getCarrierFrequencyHz(i4);
        }

        static boolean b(GnssStatus gnssStatus, int i4) {
            return gnssStatus.hasCarrierFrequencyHz(i4);
        }
    }

    /* compiled from: GnssStatusWrapper.java */
    @x0(30)
    /* renamed from: androidx.core.location.b$b, reason: collision with other inner class name */
    static class C0417b {
        private C0417b() {
        }

        static float a(GnssStatus gnssStatus, int i4) {
            return gnssStatus.getBasebandCn0DbHz(i4);
        }

        static boolean b(GnssStatus gnssStatus, int i4) {
            return gnssStatus.hasBasebandCn0DbHz(i4);
        }
    }

    b(Object obj) {
        GnssStatus gnssStatus = (GnssStatus) obj;
        gnssStatus.getClass();
        this.f26344i = gnssStatus;
    }

    @Override // androidx.core.location.a
    public float a(int i4) {
        return this.f26344i.getAzimuthDegrees(i4);
    }

    @Override // androidx.core.location.a
    public float b(int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0417b.a(this.f26344i, i4);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.f26344i, i4);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float d(int i4) {
        return this.f26344i.getCn0DbHz(i4);
    }

    @Override // androidx.core.location.a
    public int e(int i4) {
        return this.f26344i.getConstellationType(i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f26344i.equals(((b) obj).f26344i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i4) {
        return this.f26344i.getElevationDegrees(i4);
    }

    @Override // androidx.core.location.a
    public int g() {
        return this.f26344i.getSatelliteCount();
    }

    @Override // androidx.core.location.a
    public int h(int i4) {
        return this.f26344i.getSvid(i4);
    }

    public int hashCode() {
        return this.f26344i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i4) {
        return this.f26344i.hasAlmanacData(i4);
    }

    @Override // androidx.core.location.a
    public boolean j(int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0417b.b(this.f26344i, i4);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(this.f26344i, i4);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public boolean l(int i4) {
        return this.f26344i.hasEphemerisData(i4);
    }

    @Override // androidx.core.location.a
    public boolean m(int i4) {
        return this.f26344i.usedInFix(i4);
    }
}
