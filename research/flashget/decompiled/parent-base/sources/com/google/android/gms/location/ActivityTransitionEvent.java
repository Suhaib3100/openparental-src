package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityTransitionEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getElapsedRealTimeNanos", id = 3)
    private final long zzc;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) long j4) {
        ActivityTransition.zza(i5);
        this.zza = i4;
        this.zzb = i5;
        this.zzc = j4;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.zza == activityTransitionEvent.zza && this.zzb == activityTransitionEvent.zzb && this.zzc == activityTransitionEvent.zzc;
    }

    public int getActivityType() {
        return this.zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzc;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i4 = this.zza;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(ProtectedSandApp.s("\ud99e"));
        sb2.append(i4);
        sb.append(sb2.toString());
        String s4 = ProtectedSandApp.s("\ud99f");
        sb.append(s4);
        int i5 = this.zzb;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append(ProtectedSandApp.s("\ud9a0"));
        sb3.append(i5);
        sb.append(sb3.toString());
        sb.append(s4);
        long j4 = this.zzc;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append(ProtectedSandApp.s("\ud9a1"));
        sb4.append(j4);
        sb.append(sb4.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
