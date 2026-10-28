package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        int i5 = 0;
        float f12 = 1.0f;
        float f13 = 0.5f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 6:
                    f4 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    f5 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    f6 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 12:
                    f13 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 13:
                    f7 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 14:
                    f12 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 15:
                    f10 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 16:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 17:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 18:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 19:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    f11 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new MarkerOptions(latLng, str, str2, iBinder, f4, f5, z4, z5, z6, f6, f13, f7, f12, f10, i4, iBinder2, i5, str3, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new MarkerOptions[i4];
    }
}
