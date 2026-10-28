package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "ApiMetadataCreator")
/* loaded from: classes5.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @o0
    public static final ApiMetadata zza;

    @q0
    @SafeParcelable.Field(getter = "getComplianceOptions", id = 1)
    private final ComplianceOptions zzc;

    @SafeParcelable.Field(getter = "isCallbackSupportEnabled", id = 2)
    private final boolean zzd;
    private boolean zze;

    @o0
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zza();
    private static final ApiMetadata zzb = newBuilder().build();

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public static final class Builder {

        @q0
        private ComplianceOptions zza;
        private boolean zzb = false;
        private boolean zzc;

        @o0
        @KeepForSdk
        public ApiMetadata build() {
            ApiMetadata apiMetadata = new ApiMetadata(this.zza, this.zzb);
            apiMetadata.zza(this.zzc);
            return apiMetadata;
        }

        @o0
        @KeepForSdk
        public Builder setCallbackSupportEnabled(boolean z4) {
            this.zzb = z4;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder setComplianceOptions(@q0 ComplianceOptions complianceOptions) {
            this.zza = complianceOptions;
            return this;
        }

        final /* synthetic */ Builder zza(boolean z4) {
            this.zzc = z4;
            return this;
        }
    }

    static {
        Builder newBuilder = newBuilder();
        newBuilder.zza(true);
        zza = newBuilder.build();
    }

    @SafeParcelable.Constructor
    ApiMetadata(@q0 @SafeParcelable.Param(id = 1) ComplianceOptions complianceOptions, @SafeParcelable.Param(id = 2) boolean z4) {
        this.zzc = complianceOptions;
        this.zzd = z4;
    }

    @o0
    @KeepForSdk
    public static final ApiMetadata fromComplianceOptions(@o0 ComplianceOptions complianceOptions) {
        Builder newBuilder = newBuilder();
        newBuilder.setComplianceOptions(complianceOptions);
        return newBuilder.build();
    }

    @o0
    @KeepForSdk
    public static final ApiMetadata getEmptyInstance() {
        return zzb;
    }

    @o0
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(@q0 Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return Objects.equal(this.zzc, apiMetadata.zzc) && this.zze == apiMetadata.zze && this.zzd == apiMetadata.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzd));
    }

    @o0
    @KeepForSdk
    public Builder toBuilder() {
        Builder newBuilder = newBuilder();
        newBuilder.setComplianceOptions(this.zzc);
        newBuilder.setCallbackSupportEnabled(this.zzd);
        newBuilder.zza(this.zze);
        return newBuilder;
    }

    @o0
    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return k0.a(new StringBuilder(valueOf.length() + 31), ProtectedSandApp.s("즥"), valueOf, ProtectedSandApp.s("즦"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        if (this.zze) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i4, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final /* synthetic */ void zza(boolean z4) {
        this.zze = z4;
    }
}
