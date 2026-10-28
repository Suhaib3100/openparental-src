package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableShort extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f6007q = 1;

    /* renamed from: p, reason: collision with root package name */
    private short f6008p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableShort> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableShort[] newArray(int i5) {
            return new ObservableShort[i5];
        }
    }

    public ObservableShort(short s5) {
        this.f6008p = s5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short e() {
        return this.f6008p;
    }

    public void f(short s5) {
        if (s5 != this.f6008p) {
            this.f6008p = s5;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f6008p);
    }

    public ObservableShort() {
    }

    public ObservableShort(u... uVarArr) {
        super(uVarArr);
    }
}
