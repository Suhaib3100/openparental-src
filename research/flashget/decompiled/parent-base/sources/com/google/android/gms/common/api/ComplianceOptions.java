package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "ComplianceOptionsCreator")
/* loaded from: classes5.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    @o0
    public static final ComplianceOptions zza;

    @SafeParcelable.Field(getter = "getCallerProductId", id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDataOwnerProductId", id = 2)
    private final int zzc;

    @SafeParcelable.Field(getter = "getProcessingReason", id = 3)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "isUserData", id = 4)
    private final boolean zze;

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public static final class Builder {
        private int zza = -1;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = true;

        @o0
        @KeepForSdk
        public ComplianceOptions build() {
            return new ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @o0
        @KeepForSdk
        public Builder setCallerProductId(int i4) {
            this.zza = i4;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder setDataOwnerProductId(int i4) {
            this.zzb = i4;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder setIsUserData(boolean z4) {
            this.zzd = z4;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder setProcessingReason(int i4) {
            this.zzc = i4;
            return this;
        }
    }

    static {
        Builder newBuilder = newBuilder();
        newBuilder.setCallerProductId(-1);
        newBuilder.setDataOwnerProductId(-1);
        newBuilder.setProcessingReason(0);
        newBuilder.setIsUserData(true);
        zza = newBuilder.build();
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    ComplianceOptions(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) int i6, @SafeParcelable.Param(id = 4) boolean z4) {
        this.zzb = i4;
        this.zzc = i5;
        this.zzd = i6;
        this.zze = z4;
    }

    @o0
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(@q0 Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze));
    }

    @o0
    @KeepForSdk
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setCallerProductId(this.zzb);
        builder.setDataOwnerProductId(this.zzc);
        builder.setProcessingReason(this.zzd);
        builder.setIsUserData(this.zze);
        return builder;
    }

    @o0
    public final String toString() {
        int i4 = this.zzb;
        int length = String.valueOf(i4).length();
        int i5 = this.zzc;
        int length2 = String.valueOf(i5).length();
        int i6 = this.zzd;
        int length3 = String.valueOf(i6).length();
        boolean z4 = this.zze;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z4).length() + 1);
        sb.append(ProtectedSandApp.s("즯"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("즰"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("즱"));
        sb.append(i6);
        sb.append(ProtectedSandApp.s("즲"));
        sb.append(z4);
        sb.append(ProtectedSandApp.s("즳"));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    @KeepForSdk
    public static final Builder newBuilder(@o0 Context context) {
        return newBuilder();
    }
}
