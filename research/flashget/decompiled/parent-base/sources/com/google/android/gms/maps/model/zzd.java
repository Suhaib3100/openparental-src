package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzba;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "FeatureLayerOptionsCreator")
/* loaded from: classes5.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    private static final zzba zza = zzba.zzi(ProtectedSandApp.s("\udb20"), ProtectedSandApp.s("\udb21"), ProtectedSandApp.s("\udb22"), ProtectedSandApp.s("\udb23"), ProtectedSandApp.s("\udb24"), ProtectedSandApp.s("\udb25"), new String[0]);

    @SafeParcelable.Field(getter = "getFeatureType", id = 1)
    private final String zzb;

    @SafeParcelable.Constructor
    zzd(@SafeParcelable.Param(id = 1) String str) {
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String str = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
