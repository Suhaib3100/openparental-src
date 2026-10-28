package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    ArrayList<String> f8111o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f8112p;

    /* renamed from: q, reason: collision with root package name */
    BackStackRecordState[] f8113q;

    /* renamed from: r, reason: collision with root package name */
    int f8114r;

    /* renamed from: s, reason: collision with root package name */
    String f8115s;

    /* renamed from: t, reason: collision with root package name */
    ArrayList<String> f8116t;

    /* renamed from: u, reason: collision with root package name */
    ArrayList<BackStackState> f8117u;

    /* renamed from: v, reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f8118v;

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
        public FragmentManagerState[] newArray(int i5) {
            return new FragmentManagerState[i5];
        }
    }

    public FragmentManagerState() {
        this.f8115s = null;
        this.f8116t = new ArrayList<>();
        this.f8117u = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f8111o);
        parcel.writeStringList(this.f8112p);
        parcel.writeTypedArray(this.f8113q, i5);
        parcel.writeInt(this.f8114r);
        parcel.writeString(this.f8115s);
        parcel.writeStringList(this.f8116t);
        parcel.writeTypedList(this.f8117u);
        parcel.writeTypedList(this.f8118v);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f8115s = null;
        this.f8116t = new ArrayList<>();
        this.f8117u = new ArrayList<>();
        this.f8111o = parcel.createStringArrayList();
        this.f8112p = parcel.createStringArrayList();
        this.f8113q = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f8114r = parcel.readInt();
        this.f8115s = parcel.readString();
        this.f8116t = parcel.createStringArrayList();
        this.f8117u = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f8118v = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
