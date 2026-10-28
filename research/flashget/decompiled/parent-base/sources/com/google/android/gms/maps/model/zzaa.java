package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StampStyle stampStyle = null;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        float f4 = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                f4 = SafeParcelReader.readFloat(parcel, readHeader);
            } else if (fieldId == 3) {
                i4 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 4) {
                i5 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 5) {
                z4 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                stampStyle = (StampStyle) SafeParcelReader.createParcelable(parcel, readHeader, StampStyle.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new StrokeStyle(f4, i4, i5, z4, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new StrokeStyle[i4];
    }
}
