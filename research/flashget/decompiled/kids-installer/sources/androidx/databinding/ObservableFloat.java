package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f6000q = 1;

    /* renamed from: p, reason: collision with root package name */
    private float f6001p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableFloat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableFloat[] newArray(int i5) {
            return new ObservableFloat[i5];
        }
    }

    public ObservableFloat(float f6) {
        this.f6001p = f6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.f6001p;
    }

    public void f(float f6) {
        if (f6 != this.f6001p) {
            this.f6001p = f6;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeFloat(this.f6001p);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(u... uVarArr) {
        super(uVarArr);
    }
}
