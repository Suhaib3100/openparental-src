package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.c1;

/* compiled from: GnssStatusWrapper.java */
@androidx.annotation.c1({c1.a.LIBRARY})
@androidx.annotation.x0(24)
/* loaded from: classes3.dex */
class d extends androidx.core.location.a {

    /* renamed from: i, reason: collision with root package name */
    private final GnssStatus f4838i;

    /* compiled from: GnssStatusWrapper.java */
    @androidx.annotation.x0(26)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static float a(GnssStatus gnssStatus, int i5) {
            float carrierFrequencyHz;
            carrierFrequencyHz = gnssStatus.getCarrierFrequencyHz(i5);
            return carrierFrequencyHz;
        }

        @androidx.annotation.u
        static boolean b(GnssStatus gnssStatus, int i5) {
            boolean hasCarrierFrequencyHz;
            hasCarrierFrequencyHz = gnssStatus.hasCarrierFrequencyHz(i5);
            return hasCarrierFrequencyHz;
        }
    }

    /* compiled from: GnssStatusWrapper.java */
    @androidx.annotation.x0(30)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static float a(GnssStatus gnssStatus, int i5) {
            float basebandCn0DbHz;
            basebandCn0DbHz = gnssStatus.getBasebandCn0DbHz(i5);
            return basebandCn0DbHz;
        }

        @androidx.annotation.u
        static boolean b(GnssStatus gnssStatus, int i5) {
            boolean hasBasebandCn0DbHz;
            hasBasebandCn0DbHz = gnssStatus.hasBasebandCn0DbHz(i5);
            return hasBasebandCn0DbHz;
        }
    }

    d(Object obj) {
        GnssStatus gnssStatus = (GnssStatus) obj;
        gnssStatus.getClass();
        this.f4838i = gnssStatus;
    }

    @Override // androidx.core.location.a
    public float a(int i5) {
        return this.f4838i.getAzimuthDegrees(i5);
    }

    @Override // androidx.core.location.a
    public float b(int i5) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(this.f4838i, i5);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i5) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.f4838i, i5);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float d(int i5) {
        return this.f4838i.getCn0DbHz(i5);
    }

    @Override // androidx.core.location.a
    public int e(int i5) {
        return this.f4838i.getConstellationType(i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f4838i.equals(((d) obj).f4838i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i5) {
        return this.f4838i.getElevationDegrees(i5);
    }

    @Override // androidx.core.location.a
    public int g() {
        return this.f4838i.getSatelliteCount();
    }

    @Override // androidx.core.location.a
    public int h(int i5) {
        return this.f4838i.getSvid(i5);
    }

    public int hashCode() {
        return this.f4838i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i5) {
        return this.f4838i.hasAlmanacData(i5);
    }

    @Override // androidx.core.location.a
    public boolean j(int i5) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.b(this.f4838i, i5);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i5) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(this.f4838i, i5);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public boolean l(int i5) {
        return this.f4838i.hasEphemerisData(i5);
    }

    @Override // androidx.core.location.a
    public boolean m(int i5) {
        return this.f4838i.usedInFix(i5);
    }
}
