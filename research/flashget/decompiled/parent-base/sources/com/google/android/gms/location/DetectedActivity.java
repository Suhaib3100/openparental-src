package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "DetectedActivityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;

    @SafeParcelable.Field(id = 1)
    int zzb;

    @SafeParcelable.Field(id = 2)
    int zzc;

    @o0
    public static final Comparator<DetectedActivity> zza = new zzq();

    @o0
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5) {
        this.zzb = i4;
        this.zzc = i5;
    }

    @ShowFirstParty
    public final boolean equals(@q0 Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.zzb == detectedActivity.zzb && this.zzc == detectedActivity.zzc) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int i4 = this.zzb;
        if (i4 > 22 || i4 < 0) {
            return 4;
        }
        return i4;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @o0
    public String toString() {
        int type = getType();
        String num = type != 0 ? type != 1 ? type != 2 ? type != 3 ? type != 4 ? type != 5 ? type != 7 ? type != 8 ? type != 16 ? type != 17 ? Integer.toString(type) : ProtectedSandApp.s("\ud9ac") : ProtectedSandApp.s("\ud9ad") : ProtectedSandApp.s("\ud9ae") : ProtectedSandApp.s("\ud9af") : ProtectedSandApp.s("\ud9b0") : ProtectedSandApp.s("\ud9b1") : ProtectedSandApp.s("\ud9b2") : ProtectedSandApp.s("\ud9b3") : ProtectedSandApp.s("\ud9b4") : ProtectedSandApp.s("\ud9b5");
        int i4 = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 48);
        sb.append(ProtectedSandApp.s("\ud9b6"));
        sb.append(num);
        sb.append(ProtectedSandApp.s("\ud9b7"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ud9b8"));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
