package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i4 = 0;
        short s4 = 0;
        int i5 = 0;
        double d5 = 0.0d;
        double d6 = 0.0d;
        float f4 = 0.0f;
        long j4 = 0;
        int i6 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s4 = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d5 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d6 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f4 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i6 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbe(str, i4, s4, d5, d6, f4, j4, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i4) {
        return new zzbe[i4];
    }
}
