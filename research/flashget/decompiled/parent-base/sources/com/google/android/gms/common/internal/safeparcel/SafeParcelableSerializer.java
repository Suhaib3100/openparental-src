package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.common.zzah;
import java.util.ArrayList;
import java.util.Iterator;
import net.minidev.json.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @o0
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromBytes(@o0 byte[] bArr, @o0 Parcelable.Creator<T> creator) {
        Preconditions.checkNotNull(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @q0
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromIntentExtra(@o0 Intent intent, @o0 String str, @o0 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    @o0
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromString(@o0 String str, @o0 Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    @q0
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(@o0 Bundle bundle, @o0 String str, @o0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        a aVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            aVar.add(deserializeFromBytes((byte[]) arrayList.get(i4), creator));
        }
        return aVar;
    }

    @q0
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(@o0 Bundle bundle, @o0 String str, @o0 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    @q0
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBytes(@q0 byte[] bArr, @o0 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @q0
    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(@o0 Intent intent, @o0 String str, @o0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        a aVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            aVar.add(deserializeFromBytes((byte[]) arrayList.get(i4), creator));
        }
        return aVar;
    }

    @q0
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(@o0 Intent intent, @o0 String str, @o0 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToBundle(@o0 Iterable<T> iterable, @o0 Bundle bundle, @o0 String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToBundleSafe(@o0 Iterable<T> iterable, @o0 Bundle bundle, @o0 String str) {
        bundle.putByteArray(str, serializeIterableToBytes(iterable));
    }

    @o0
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeIterableToBytes(@o0 Iterable<T> iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzah.zzo(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToIntentExtra(@o0 Iterable<T> iterable, @o0 Intent intent, @o0 String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(@o0 Iterable<T> iterable, @o0 Intent intent, @o0 String str) {
        intent.putExtra(str, serializeIterableToBytes(iterable));
    }

    @o0
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeToBytes(@o0 T t4) {
        Parcel obtain = Parcel.obtain();
        t4.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeToIntentExtra(@o0 T t4, @o0 Intent intent, @o0 String str) {
        intent.putExtra(str, serializeToBytes(t4));
    }

    @o0
    @KeepForSdk
    public static <T extends SafeParcelable> String serializeToString(@o0 T t4) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(t4));
    }
}
