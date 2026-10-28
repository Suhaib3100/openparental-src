package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableByte extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f5994q = 1;

    /* renamed from: p, reason: collision with root package name */
    private byte f5995p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableByte> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableByte[] newArray(int i5) {
            return new ObservableByte[i5];
        }
    }

    public ObservableByte(byte b6) {
        this.f5995p = b6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte e() {
        return this.f5995p;
    }

    public void f(byte b6) {
        if (b6 != this.f5995p) {
            this.f5995p = b6;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.f5995p);
    }

    public ObservableByte() {
    }

    public ObservableByte(u... uVarArr) {
        super(uVarArr);
    }
}
