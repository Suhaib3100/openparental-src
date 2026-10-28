package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        CameraPosition cameraPosition = null;
        Float f4 = null;
        Float f5 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        int i4 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    b5 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 3:
                    b6 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 4:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.createParcelable(parcel, readHeader, CameraPosition.CREATOR);
                    break;
                case 6:
                    b7 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 7:
                    b10 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 8:
                    b11 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 9:
                    b12 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 10:
                    b13 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 11:
                    b14 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 12:
                    b15 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 13:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 14:
                    b16 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 15:
                    b17 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 16:
                    f4 = SafeParcelReader.readFloatObject(parcel, readHeader);
                    break;
                case 17:
                    f5 = SafeParcelReader.readFloatObject(parcel, readHeader);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, readHeader, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b18 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 20:
                    num = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 21:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GoogleMapOptions(b5, b6, i4, cameraPosition, b7, b10, b11, b12, b13, b14, b15, b16, b17, f4, f5, latLngBounds, b18, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new GoogleMapOptions[i4];
    }
}
