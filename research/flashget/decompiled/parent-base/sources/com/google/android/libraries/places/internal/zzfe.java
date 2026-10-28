package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.q0;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzfe extends zzfc {
    public static final Parcelable.Creator<zzfe> CREATOR = new zzfd();

    zzfe(AutocompleteActivityMode autocompleteActivityMode, zzhs zzhsVar, zzfj zzfjVar, @q0 String str, @q0 String str2, @q0 LocationBias locationBias, @q0 LocationRestriction locationRestriction, zzhs zzhsVar2, @q0 TypeFilter typeFilter, int i4, int i5) {
        super(autocompleteActivityMode, zzhsVar, zzfjVar, str, str2, locationBias, locationRestriction, zzhsVar2, typeFilter, i4, i5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(zzh(), i4);
        parcel.writeList(zzj());
        parcel.writeParcelable(zzf(), i4);
        if (zzl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzl());
        }
        if (zzk() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzk());
        }
        parcel.writeParcelable(zzc(), i4);
        parcel.writeParcelable(zzd(), i4);
        parcel.writeList(zzi());
        parcel.writeParcelable(zze(), i4);
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
    }
}
