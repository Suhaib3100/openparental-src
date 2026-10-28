package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<String> f29835b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<String> f29836c;

    /* renamed from: d, reason: collision with root package name */
    BackStackRecordState[] f29837d;

    /* renamed from: e, reason: collision with root package name */
    int f29838e;

    /* renamed from: f, reason: collision with root package name */
    String f29839f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<String> f29840g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<BackStackState> f29841h;

    /* renamed from: i, reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f29842i;

    class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i4) {
            return new FragmentManagerState[i4];
        }
    }

    public FragmentManagerState() {
        this.f29839f = null;
        this.f29840g = new ArrayList<>();
        this.f29841h = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f29835b);
        parcel.writeStringList(this.f29836c);
        parcel.writeTypedArray(this.f29837d, i4);
        parcel.writeInt(this.f29838e);
        parcel.writeString(this.f29839f);
        parcel.writeStringList(this.f29840g);
        parcel.writeTypedList(this.f29841h);
        parcel.writeTypedList(this.f29842i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f29839f = null;
        this.f29840g = new ArrayList<>();
        this.f29841h = new ArrayList<>();
        this.f29835b = parcel.createStringArrayList();
        this.f29836c = parcel.createStringArrayList();
        this.f29837d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f29838e = parcel.readInt();
        this.f29839f = parcel.readString();
        this.f29840g = parcel.createStringArrayList();
        this.f29841h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f29842i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
