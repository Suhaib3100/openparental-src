package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzat extends zzs {
    public static final Parcelable.Creator<zzat> CREATOR = new zzas();

    zzat(Place place, double d5) {
        super(place, d5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(getPlace(), i4);
        parcel.writeDouble(getLikelihood());
    }
}
