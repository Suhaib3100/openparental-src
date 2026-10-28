package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableChar extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    static final long f5996q = 1;

    /* renamed from: p, reason: collision with root package name */
    private char f5997p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableChar> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableChar[] newArray(int i5) {
            return new ObservableChar[i5];
        }
    }

    public ObservableChar(char c6) {
        this.f5997p = c6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public char e() {
        return this.f5997p;
    }

    public void f(char c6) {
        if (c6 != this.f5997p) {
            this.f5997p = c6;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f5997p);
    }

    public ObservableChar() {
    }

    public ObservableChar(u... uVarArr) {
        super(uVarArr);
    }
}
