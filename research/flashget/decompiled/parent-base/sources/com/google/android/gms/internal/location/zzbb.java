package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        List<ClientIdentity> list = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z10 = false;
        long j4 = Long.MAX_VALUE;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 5:
                        list = SafeParcelReader.createTypedList(parcel, readHeader, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 7:
                        z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 8:
                        z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 9:
                        z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 10:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 11:
                        z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 12:
                        z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 13:
                        str3 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 14:
                        j4 = SafeParcelReader.readLong(parcel, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, readHeader, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzba(locationRequest, list, str, z4, z5, z6, str2, z7, z10, str3, j4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i4) {
        return new zzba[i4];
    }
}
