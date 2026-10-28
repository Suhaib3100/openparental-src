package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class x {

    /* compiled from: ParcelableCompat.java */
    static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final y<T> f26557a;

        a(y<T> yVar) {
            this.f26557a = yVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f26557a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i4) {
            return this.f26557a.newArray(i4);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f26557a.createFromParcel(parcel, classLoader);
        }
    }

    private x() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(y<T> yVar) {
        return new a(yVar);
    }
}
