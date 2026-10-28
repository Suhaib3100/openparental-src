package androidx.core.os;

import android.os.Parcel;

/* compiled from: ParcelableCompatCreatorCallbacks.java */
@Deprecated
/* loaded from: classes3.dex */
public interface y<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i4);
}
