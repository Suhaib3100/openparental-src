package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableInt extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f6002q = 1;

    /* renamed from: p, reason: collision with root package name */
    private int f6003p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableInt> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableInt[] newArray(int i5) {
            return new ObservableInt[i5];
        }
    }

    public ObservableInt(int i5) {
        this.f6003p = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f6003p;
    }

    public void f(int i5) {
        if (i5 != this.f6003p) {
            this.f6003p = i5;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f6003p);
    }

    public ObservableInt() {
    }

    public ObservableInt(u... uVarArr) {
        super(uVarArr);
    }
}
