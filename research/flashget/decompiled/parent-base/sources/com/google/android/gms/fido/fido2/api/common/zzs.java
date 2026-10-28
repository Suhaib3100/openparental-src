package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "CableAuthenticationExtensionCreator")
/* loaded from: classes5.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @o0
    @SafeParcelable.Field(getter = "getCableAuthentication", id = 1)
    private final List zza;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) @o0 List list) {
        this.zza = (List) Preconditions.checkNotNull(list);
    }

    public final boolean equals(@q0 Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.zza.containsAll(zzsVar.zza) && zzsVar.zza.containsAll(this.zza);
    }

    public final int hashCode() {
        return Objects.hashCode(new HashSet(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        List list = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
