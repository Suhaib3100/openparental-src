package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableBoolean extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f5992q = 1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5993p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableBoolean> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            return new ObservableBoolean(parcel.readInt() == 1);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean[] newArray(int i5) {
            return new ObservableBoolean[i5];
        }
    }

    public ObservableBoolean(boolean z5) {
        this.f5993p = z5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f5993p;
    }

    public void f(boolean z5) {
        if (z5 != this.f5993p) {
            this.f5993p = z5;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f5993p ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(u... uVarArr) {
        super(uVarArr);
    }
}
