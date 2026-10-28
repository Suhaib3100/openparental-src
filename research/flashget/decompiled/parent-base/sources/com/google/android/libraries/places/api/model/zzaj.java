package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaj extends zzj {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzai();

    zzaj(int i4, int i5) {
        super(i4, i5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(getHours());
        parcel.writeInt(getMinutes());
    }
}
