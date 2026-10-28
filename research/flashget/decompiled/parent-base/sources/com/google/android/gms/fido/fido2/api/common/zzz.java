package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "GoogleMultiAssertionExtensionCreator")
/* loaded from: classes5.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();

    @SafeParcelable.Field(getter = "getRequestForMultiAssertion", id = 1)
    private final boolean zza;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 1) boolean z4) {
        this.zza = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z4))).booleanValue();
    }

    public final boolean equals(@q0 Object obj) {
        return (obj instanceof zzz) && this.zza == ((zzz) obj).zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        boolean z4 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z4);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
