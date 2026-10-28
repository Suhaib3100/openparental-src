package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.core.app.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getJson", id = 2)
    private final String zzb;
    private static final String zza = ProtectedSandApp.s("\udaf2");

    @o0
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzk();

    @SafeParcelable.Constructor
    public MapStyleOptions(@SafeParcelable.Param(id = 2) @o0 String str) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("\udaf3"));
        this.zzb = str;
    }

    @o0
    public static MapStyleOptions loadRawResourceStyle(@o0 Context context, int i4) throws Resources.NotFoundException {
        try {
            return new MapStyleOptions(new String(IOUtils.readInputStreamFully(context.getResources().openRawResource(i4)), ProtectedSandApp.s("\udaf4")));
        } catch (IOException e4) {
            throw new Resources.NotFoundException(i0.a(ProtectedSandApp.s("\udaf5"), i4, ProtectedSandApp.s("\udaf6"), e4.toString()));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        String str = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
