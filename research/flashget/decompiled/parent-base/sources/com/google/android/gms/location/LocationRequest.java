package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.a;
import org.apache.commons.lang3.time.e;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", id = 1)
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", id = 4)
    boolean zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", id = 5)
    long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", id = 6)
    int zzf;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", id = 7)
    float zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", id = 8)
    long zzh;

    @SafeParcelable.Field(defaultValue = "false", id = 9)
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this.zza = 102;
        this.zzb = e.f86241c;
        this.zzc = 600000L;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = 0.0f;
        this.zzh = 0L;
        this.zzi = false;
    }

    @o0
    public static LocationRequest create() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    private static void zza(long j4) {
        if (j4 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append(ProtectedSandApp.s("\ud9d9"));
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean equals(@q0 Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j4 = this.zzh;
        long j5 = this.zzb;
        return j4 < j5 ? j5 : j4;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    @o0
    public LocationRequest setExpirationDuration(long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j4 <= Long.MAX_VALUE - elapsedRealtime ? j4 + elapsedRealtime : Long.MAX_VALUE;
        this.zze = j5;
        if (j5 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @o0
    public LocationRequest setExpirationTime(long j4) {
        this.zze = j4;
        if (j4 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @o0
    public LocationRequest setFastestInterval(long j4) {
        zza(j4);
        this.zzd = true;
        this.zzc = j4;
        return this;
    }

    @o0
    public LocationRequest setInterval(long j4) {
        zza(j4);
        this.zzb = j4;
        if (!this.zzd) {
            this.zzc = (long) (j4 / 6.0d);
        }
        return this;
    }

    @o0
    public LocationRequest setMaxWaitTime(long j4) {
        zza(j4);
        this.zzh = j4;
        return this;
    }

    @o0
    public LocationRequest setNumUpdates(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(a.a(31, ProtectedSandApp.s("\ud9da"), i4));
        }
        this.zzf = i4;
        return this;
    }

    @o0
    public LocationRequest setPriority(int i4) {
        if (i4 != 100 && i4 != 102 && i4 != 104 && i4 != 105) {
            throw new IllegalArgumentException(a.a(28, ProtectedSandApp.s("\ud9db"), i4));
        }
        this.zza = i4;
        return this;
    }

    @o0
    public LocationRequest setSmallestDisplacement(float f4) {
        if (f4 >= 0.0f) {
            this.zzg = f4;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append(ProtectedSandApp.s("\ud9dc"));
        sb.append(f4);
        throw new IllegalArgumentException(sb.toString());
    }

    @o0
    public LocationRequest setWaitForAccurateLocation(boolean z4) {
        this.zzi = z4;
        return this;
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\ud9dd"));
        int i4 = this.zza;
        sb.append(i4 != 100 ? i4 != 102 ? i4 != 104 ? i4 != 105 ? ProtectedSandApp.s("\ud9de") : ProtectedSandApp.s("\ud9df") : ProtectedSandApp.s("\ud9e0") : ProtectedSandApp.s("\ud9e1") : ProtectedSandApp.s("\ud9e2"));
        int i5 = this.zza;
        String s4 = ProtectedSandApp.s("\ud9e3");
        if (i5 != 105) {
            sb.append(ProtectedSandApp.s("\ud9e4"));
            sb.append(this.zzb);
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("\ud9e5"));
        sb.append(this.zzc);
        sb.append(s4);
        if (this.zzh > this.zzb) {
            sb.append(ProtectedSandApp.s("\ud9e6"));
            sb.append(this.zzh);
            sb.append(s4);
        }
        if (this.zzg > 0.0f) {
            sb.append(ProtectedSandApp.s("\ud9e7"));
            sb.append(this.zzg);
            sb.append(ProtectedSandApp.s("\ud9e8"));
        }
        long j4 = this.zze;
        if (j4 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(ProtectedSandApp.s("\ud9e9"));
            sb.append(j4 - elapsedRealtime);
            sb.append(s4);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(ProtectedSandApp.s("\ud9ea"));
            sb.append(this.zzf);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 3) long j5, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) long j6, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) float f4, @SafeParcelable.Param(id = 8) long j7, @SafeParcelable.Param(id = 9) boolean z5) {
        this.zza = i4;
        this.zzb = j4;
        this.zzc = j5;
        this.zzd = z4;
        this.zze = j6;
        this.zzf = i5;
        this.zzg = f4;
        this.zzh = j7;
        this.zzi = z5;
    }
}
