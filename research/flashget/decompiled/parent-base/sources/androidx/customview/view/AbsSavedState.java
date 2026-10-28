package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final Parcelable f28332b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbsSavedState f28331c = new AnonymousClass1(null);
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    class AnonymousClass1 extends AbsSavedState {
        AnonymousClass1() {
            super((AnonymousClass1) null);
        }
    }

    class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f28331c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbsSavedState[] newArray(int i4) {
            return new AbsSavedState[i4];
        }
    }

    /* synthetic */ AbsSavedState(AnonymousClass1 anonymousClass1) {
        this();
    }

    @q0
    public final Parcelable a() {
        return this.f28332b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f28332b, i4);
    }

    private AbsSavedState() {
        this.f28332b = null;
    }

    protected AbsSavedState(@o0 Parcelable parcelable) {
        if (parcelable != null) {
            this.f28332b = parcelable == f28331c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(@o0 Parcel parcel) {
        this(parcel, null);
    }

    protected AbsSavedState(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f28332b = readParcelable == null ? f28331c : readParcelable;
    }
}
