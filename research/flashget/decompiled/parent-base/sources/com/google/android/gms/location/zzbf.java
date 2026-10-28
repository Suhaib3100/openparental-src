package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class zzbf implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i4 = 102;
        long j4 = 3600000;
        long j5 = 600000;
        boolean z4 = false;
        boolean z5 = false;
        long j6 = Long.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        float f4 = 0.0f;
        long j7 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    j5 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    j6 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    f4 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 9:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationRequest(i4, j4, j5, z4, j6, i5, f4, j7, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i4) {
        return new LocationRequest[i4];
    }
}
