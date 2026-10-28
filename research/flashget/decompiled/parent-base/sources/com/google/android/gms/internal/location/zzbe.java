package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    @SafeParcelable.Field(getter = "getRequestId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getExpirationTime", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getType", id = 3)
    private final short zzc;

    @SafeParcelable.Field(getter = "getLatitude", id = 4)
    private final double zzd;

    @SafeParcelable.Field(getter = "getLongitude", id = 5)
    private final double zze;

    @SafeParcelable.Field(getter = "getRadius", id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getTransitionTypes", id = 7)
    private final int zzg;

    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", id = 8)
    private final int zzh;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", id = 9)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 3) short s4, @SafeParcelable.Param(id = 4) double d5, @SafeParcelable.Param(id = 5) double d6, @SafeParcelable.Param(id = 6) float f4, @SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 8) int i5, @SafeParcelable.Param(id = 9) int i6) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String s5 = ProtectedSandApp.s("텥");
            throw new IllegalArgumentException(length != 0 ? s5.concat(valueOf) : new String(s5));
        }
        if (f4 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append(ProtectedSandApp.s("텤"));
            sb.append(f4);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d5 > 90.0d || d5 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append(ProtectedSandApp.s("텣"));
            sb2.append(d5);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d6 > 180.0d || d6 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append(ProtectedSandApp.s("텢"));
            sb3.append(d6);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            throw new IllegalArgumentException(a.a(46, ProtectedSandApp.s("텡"), i4));
        }
        this.zzc = s4;
        this.zza = str;
        this.zzd = d5;
        this.zze = d6;
        this.zzf = f4;
        this.zzb = j4;
        this.zzg = i7;
        this.zzh = i5;
        this.zzi = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s4 = this.zzc;
        return String.format(locale, ProtectedSandApp.s("텫"), s4 != -1 ? s4 != 1 ? ProtectedSandApp.s("텦") : ProtectedSandApp.s("텧") : ProtectedSandApp.s("텨"), this.zza.replaceAll(ProtectedSandApp.s("텩"), ProtectedSandApp.s("텪")), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
