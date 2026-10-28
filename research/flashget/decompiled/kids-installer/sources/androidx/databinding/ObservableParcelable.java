package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class ObservableParcelable<T extends Parcelable> extends x<T> implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    static final long f6006r = 1;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableParcelable> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable[] newArray(int i5) {
            return new ObservableParcelable[i5];
        }
    }

    public ObservableParcelable(T t5) {
        super(t5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable((Parcelable) e(), 0);
    }

    public ObservableParcelable() {
    }
}
