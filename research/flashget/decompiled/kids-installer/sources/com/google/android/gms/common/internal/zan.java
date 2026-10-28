package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zan implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        String str2 = null;
        int i9 = -1;
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
                    i7 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    j5 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    j6 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new MethodInvocation(i5, i6, i7, j5, j6, str, str2, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i5) {
        return new MethodInvocation[i5];
    }
}
