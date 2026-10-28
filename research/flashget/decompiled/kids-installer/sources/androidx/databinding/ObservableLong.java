package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableLong extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f6004q = 1;

    /* renamed from: p, reason: collision with root package name */
    private long f6005p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableLong> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableLong[] newArray(int i5) {
            return new ObservableLong[i5];
        }
    }

    public ObservableLong(long j5) {
        this.f6005p = j5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f6005p;
    }

    public void f(long j5) {
        if (j5 != this.f6005p) {
            this.f6005p = j5;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f6005p);
    }

    public ObservableLong() {
    }

    public ObservableLong(u... uVarArr) {
        super(uVarArr);
    }
}
