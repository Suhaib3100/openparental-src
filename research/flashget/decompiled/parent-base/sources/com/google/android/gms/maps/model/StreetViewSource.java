package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "StreetViewSourceCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class StreetViewSource extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;
    private static final String zza = ProtectedSandApp.s("\udb11");

    @o0
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzy();

    @o0
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);

    @o0
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);

    @SafeParcelable.Constructor
    public StreetViewSource(@SafeParcelable.Param(id = 2) int i4) {
        this.zzb = i4;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.zzb == ((StreetViewSource) obj).zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb));
    }

    @o0
    public String toString() {
        String s4;
        int i4 = this.zzb;
        if (i4 == 0) {
            s4 = ProtectedSandApp.s("\udb14");
        } else if (i4 != 1) {
            s4 = String.format(ProtectedSandApp.s("\udb12"), Integer.valueOf(i4));
        } else {
            s4 = ProtectedSandApp.s("\udb13");
        }
        return String.format(ProtectedSandApp.s("\udb15"), s4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i5);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
