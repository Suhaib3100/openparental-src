package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* loaded from: classes5.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzy();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "isLockScreenSolved", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "getMinAgeOfLockScreen", id = 3)
    private final long zzc;

    @SafeParcelable.Field(getter = "isChallengeAllowed", id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    DeviceMetaData(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) boolean z4, @SafeParcelable.Param(id = 3) long j4, @SafeParcelable.Param(id = 4) boolean z5) {
        this.zza = i4;
        this.zzb = z4;
        this.zzc = j4;
        this.zzd = z5;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
