package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zaa = {ProtectedSandApp.s("쪛")};
    private final Parcelable.Creator zab;

    @KeepForSdk
    public DataBufferSafeParcelable(@o0 DataHolder dataHolder, @o0 Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void addValue(@o0 DataHolder.Builder builder, @o0 T t4) {
        Parcel obtain = Parcel.obtain();
        t4.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("쪛"), obtain.marshall());
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
    public T get(int i4) {
        DataHolder dataHolder = (DataHolder) Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray(ProtectedSandApp.s("쪛"), i4, dataHolder.getWindowIndex(i4));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t4 = (T) this.zab.createFromParcel(obtain);
        obtain.recycle();
        return t4;
    }
}
