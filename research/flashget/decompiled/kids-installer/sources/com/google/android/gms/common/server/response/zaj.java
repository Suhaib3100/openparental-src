package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaj implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        int i8 = 0;
        String str = null;
        String str2 = null;
        com.google.android.gms.common.server.converter.zaa zaaVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i6 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    i7 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    zaaVar = (com.google.android.gms.common.server.converter.zaa) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.common.server.converter.zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new FastJsonResponse.Field(i5, i6, z5, i7, z6, str, i8, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i5) {
        return new FastJsonResponse.Field[i5];
    }
}
