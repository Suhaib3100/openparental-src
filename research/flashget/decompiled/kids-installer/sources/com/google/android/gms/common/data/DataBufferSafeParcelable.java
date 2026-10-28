package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes4.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zaa = {ProtectedSandApp.s("ⵤ")};
    private final Parcelable.Creator<T> zab;

    @KeepForSdk
    public DataBufferSafeParcelable(@o0 DataHolder dataHolder, @o0 Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void addValue(@o0 DataHolder.Builder builder, @o0 T t5) {
        Parcel obtain = Parcel.obtain();
        t5.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("ⵥ"), obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    @o0
    @KeepForSdk
    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @o0
    @KeepForSdk
    public T get(int i5) {
        DataHolder dataHolder = (DataHolder) Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray(ProtectedSandApp.s("ⵦ"), i5, dataHolder.getWindowIndex(i5));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.zab.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
