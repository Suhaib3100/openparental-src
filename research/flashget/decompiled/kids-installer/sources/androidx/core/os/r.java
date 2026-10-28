package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class r {

    /* compiled from: ParcelableCompat.java */
    static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final s<T> f4989a;

        a(s<T> sVar) {
            this.f4989a = sVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f4989a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i5) {
            return this.f4989a.newArray(i5);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f4989a.createFromParcel(parcel, classLoader);
        }
    }

    private r() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(s<T> sVar) {
        return new a(sVar);
    }
}
