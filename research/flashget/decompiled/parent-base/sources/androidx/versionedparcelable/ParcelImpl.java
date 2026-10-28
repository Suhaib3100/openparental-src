package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.c1;

@c1({c1.a.LIBRARY})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final g f35432b;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        public ParcelImpl a(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] b(int i4) {
            return new ParcelImpl[i4];
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i4) {
            return new ParcelImpl[i4];
        }
    }

    public ParcelImpl(g gVar) {
        this.f35432b = gVar;
    }

    public <T extends g> T a() {
        return (T) this.f35432b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        new e(parcel).l1(this.f35432b);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f35432b = new e(parcel).g0();
    }
}
