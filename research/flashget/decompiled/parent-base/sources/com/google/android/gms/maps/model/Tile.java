package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "TileCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class Tile extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<Tile> CREATOR = new zzae();

    @q0
    @SafeParcelable.Field(id = 4)
    public final byte[] data;

    @SafeParcelable.Field(id = 3)
    public final int height;

    @SafeParcelable.Field(id = 2)
    public final int width;

    @SafeParcelable.Constructor
    public Tile(@SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) int i5, @q0 @SafeParcelable.Param(id = 4) byte[] bArr) {
        this.width = i4;
        this.height = i5;
        this.data = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.width;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i5);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
