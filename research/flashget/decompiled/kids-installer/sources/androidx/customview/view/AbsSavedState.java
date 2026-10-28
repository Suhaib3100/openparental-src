package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    private final Parcelable f5939o;

    /* renamed from: p, reason: collision with root package name */
    public static final AbsSavedState f5938p = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    static class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        a() {
        }

        public AbsSavedState a(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f5938p;
            }
            throw new IllegalStateException("superState must be null");
        }

        public AbsSavedState[] c(int i5) {
            return new AbsSavedState[i5];
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i5) {
            return new AbsSavedState[i5];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }
    }

    @q0
    public final Parcelable a() {
        return this.f5939o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f5939o, i5);
    }

    private AbsSavedState() {
        this.f5939o = null;
    }

    protected AbsSavedState(@o0 Parcelable parcelable) {
        if (parcelable != null) {
            this.f5939o = parcelable == f5938p ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(@o0 Parcel parcel) {
        this(parcel, null);
    }

    protected AbsSavedState(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f5939o = readParcelable == null ? f5938p : readParcelable;
    }
}
