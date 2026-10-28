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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;

    @o0
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @o0
        public ActivityTransition build() {
            Preconditions.checkState(this.zza != -1, ProtectedSandApp.s("\ud998"));
            Preconditions.checkState(this.zzb != -1, ProtectedSandApp.s("\ud999"));
            return new ActivityTransition(this.zza, this.zzb);
        }

        @o0
        public Builder setActivityTransition(int i4) {
            ActivityTransition.zza(i4);
            this.zzb = i4;
            return this;
        }

        @o0
        public Builder setActivityType(int i4) {
            this.zza = i4;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    ActivityTransition(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5) {
        this.zza = i4;
        this.zzb = i5;
    }

    public static void zza(int i4) {
        boolean z4 = false;
        if (i4 >= 0 && i4 <= 1) {
            z4 = true;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append(ProtectedSandApp.s("\ud99a"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ud99b"));
        Preconditions.checkArgument(z4, sb.toString());
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.zza == activityTransition.zza && this.zzb == activityTransition.zzb;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @o0
    public String toString() {
        int i4 = this.zza;
        int i5 = this.zzb;
        StringBuilder sb = new StringBuilder(75);
        sb.append(ProtectedSandApp.s("\ud99c"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ud99d"));
        sb.append(i5);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
