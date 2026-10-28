package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.AbstractC1450w;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final String f29843b;

    /* renamed from: c, reason: collision with root package name */
    final String f29844c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f29845d;

    /* renamed from: e, reason: collision with root package name */
    final int f29846e;

    /* renamed from: f, reason: collision with root package name */
    final int f29847f;

    /* renamed from: g, reason: collision with root package name */
    final String f29848g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f29849h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f29850i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f29851j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f29852k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f29853l;

    /* renamed from: m, reason: collision with root package name */
    final int f29854m;

    /* renamed from: n, reason: collision with root package name */
    Bundle f29855n;

    class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i4) {
            return new FragmentState[i4];
        }
    }

    FragmentState(Fragment fragment) {
        this.f29843b = fragment.getClass().getName();
        this.f29844c = fragment.mWho;
        this.f29845d = fragment.mFromLayout;
        this.f29846e = fragment.mFragmentId;
        this.f29847f = fragment.mContainerId;
        this.f29848g = fragment.mTag;
        this.f29849h = fragment.mRetainInstance;
        this.f29850i = fragment.mRemoving;
        this.f29851j = fragment.mDetached;
        this.f29852k = fragment.mArguments;
        this.f29853l = fragment.mHidden;
        this.f29854m = fragment.mMaxState.ordinal();
    }

    @androidx.annotation.o0
    Fragment a(@androidx.annotation.o0 n nVar, @androidx.annotation.o0 ClassLoader classLoader) {
        Fragment instantiate = nVar.instantiate(classLoader, this.f29843b);
        Bundle bundle = this.f29852k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(this.f29852k);
        instantiate.mWho = this.f29844c;
        instantiate.mFromLayout = this.f29845d;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.f29846e;
        instantiate.mContainerId = this.f29847f;
        instantiate.mTag = this.f29848g;
        instantiate.mRetainInstance = this.f29849h;
        instantiate.mRemoving = this.f29850i;
        instantiate.mDetached = this.f29851j;
        instantiate.mHidden = this.f29853l;
        instantiate.mMaxState = AbstractC1450w.b.values()[this.f29854m];
        Bundle bundle2 = this.f29855n;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        return instantiate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(128, "FragmentState{");
        a5.append(this.f29843b);
        a5.append(" (");
        a5.append(this.f29844c);
        a5.append(")}:");
        if (this.f29845d) {
            a5.append(" fromLayout");
        }
        if (this.f29847f != 0) {
            a5.append(" id=0x");
            a5.append(Integer.toHexString(this.f29847f));
        }
        String str = this.f29848g;
        if (str != null && !str.isEmpty()) {
            a5.append(" tag=");
            a5.append(this.f29848g);
        }
        if (this.f29849h) {
            a5.append(" retainInstance");
        }
        if (this.f29850i) {
            a5.append(" removing");
        }
        if (this.f29851j) {
            a5.append(" detached");
        }
        if (this.f29853l) {
            a5.append(" hidden");
        }
        return a5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f29843b);
        parcel.writeString(this.f29844c);
        parcel.writeInt(this.f29845d ? 1 : 0);
        parcel.writeInt(this.f29846e);
        parcel.writeInt(this.f29847f);
        parcel.writeString(this.f29848g);
        parcel.writeInt(this.f29849h ? 1 : 0);
        parcel.writeInt(this.f29850i ? 1 : 0);
        parcel.writeInt(this.f29851j ? 1 : 0);
        parcel.writeBundle(this.f29852k);
        parcel.writeInt(this.f29853l ? 1 : 0);
        parcel.writeBundle(this.f29855n);
        parcel.writeInt(this.f29854m);
    }

    FragmentState(Parcel parcel) {
        this.f29843b = parcel.readString();
        this.f29844c = parcel.readString();
        this.f29845d = parcel.readInt() != 0;
        this.f29846e = parcel.readInt();
        this.f29847f = parcel.readInt();
        this.f29848g = parcel.readString();
        this.f29849h = parcel.readInt() != 0;
        this.f29850i = parcel.readInt() != 0;
        this.f29851j = parcel.readInt() != 0;
        this.f29852k = parcel.readBundle();
        this.f29853l = parcel.readInt() != 0;
        this.f29855n = parcel.readBundle();
        this.f29854m = parcel.readInt();
    }
}
