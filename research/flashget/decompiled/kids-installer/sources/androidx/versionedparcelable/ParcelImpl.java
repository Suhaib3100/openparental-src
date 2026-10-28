package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.c1;

@c1({c1.a.LIBRARY})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final g f10294o;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        public ParcelImpl a(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] b(int i5) {
            return new ParcelImpl[i5];
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i5) {
            return new ParcelImpl[i5];
        }
    }

    public ParcelImpl(g gVar) {
        this.f10294o = gVar;
    }

    public <T extends g> T a() {
        return (T) this.f10294o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        new e(parcel).l1(this.f10294o);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f10294o = new e(parcel).g0();
    }
}
