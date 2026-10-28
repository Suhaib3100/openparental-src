package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableDouble extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f5998q = 1;

    /* renamed from: p, reason: collision with root package name */
    private double f5999p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableDouble> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableDouble[] newArray(int i5) {
            return new ObservableDouble[i5];
        }
    }

    public ObservableDouble(double d6) {
        this.f5999p = d6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double e() {
        return this.f5999p;
    }

    public void f(double d6) {
        if (d6 != this.f5999p) {
            this.f5999p = d6;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeDouble(this.f5999p);
    }

    public ObservableDouble() {
    }

    public ObservableDouble(u... uVarArr) {
        super(uVarArr);
    }
}
