package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.t;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    Bundle A;

    /* renamed from: o, reason: collision with root package name */
    final String f8119o;

    /* renamed from: p, reason: collision with root package name */
    final String f8120p;

    /* renamed from: q, reason: collision with root package name */
    final boolean f8121q;

    /* renamed from: r, reason: collision with root package name */
    final int f8122r;

    /* renamed from: s, reason: collision with root package name */
    final int f8123s;

    /* renamed from: t, reason: collision with root package name */
    final String f8124t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f8125u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f8126v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f8127w;

    /* renamed from: x, reason: collision with root package name */
    final Bundle f8128x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f8129y;

    /* renamed from: z, reason: collision with root package name */
    final int f8130z;

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
        public FragmentState[] newArray(int i5) {
            return new FragmentState[i5];
        }
    }

    FragmentState(Fragment fragment) {
        this.f8119o = fragment.getClass().getName();
        this.f8120p = fragment.mWho;
        this.f8121q = fragment.mFromLayout;
        this.f8122r = fragment.mFragmentId;
        this.f8123s = fragment.mContainerId;
        this.f8124t = fragment.mTag;
        this.f8125u = fragment.mRetainInstance;
        this.f8126v = fragment.mRemoving;
        this.f8127w = fragment.mDetached;
        this.f8128x = fragment.mArguments;
        this.f8129y = fragment.mHidden;
        this.f8130z = fragment.mMaxState.ordinal();
    }

    @androidx.annotation.o0
    Fragment a(@androidx.annotation.o0 l lVar, @androidx.annotation.o0 ClassLoader classLoader) {
        Fragment a6 = lVar.a(classLoader, this.f8119o);
        Bundle bundle = this.f8128x;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a6.setArguments(this.f8128x);
        a6.mWho = this.f8120p;
        a6.mFromLayout = this.f8121q;
        a6.mRestored = true;
        a6.mFragmentId = this.f8122r;
        a6.mContainerId = this.f8123s;
        a6.mTag = this.f8124t;
        a6.mRetainInstance = this.f8125u;
        a6.mRemoving = this.f8126v;
        a6.mDetached = this.f8127w;
        a6.mHidden = this.f8129y;
        a6.mMaxState = t.c.values()[this.f8130z];
        Bundle bundle2 = this.A;
        if (bundle2 != null) {
            a6.mSavedFragmentState = bundle2;
        } else {
            a6.mSavedFragmentState = new Bundle();
        }
        return a6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f8119o);
        sb.append(" (");
        sb.append(this.f8120p);
        sb.append(")}:");
        if (this.f8121q) {
            sb.append(" fromLayout");
        }
        if (this.f8123s != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8123s));
        }
        String str = this.f8124t;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f8124t);
        }
        if (this.f8125u) {
            sb.append(" retainInstance");
        }
        if (this.f8126v) {
            sb.append(" removing");
        }
        if (this.f8127w) {
            sb.append(" detached");
        }
        if (this.f8129y) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f8119o);
        parcel.writeString(this.f8120p);
        parcel.writeInt(this.f8121q ? 1 : 0);
        parcel.writeInt(this.f8122r);
        parcel.writeInt(this.f8123s);
        parcel.writeString(this.f8124t);
        parcel.writeInt(this.f8125u ? 1 : 0);
        parcel.writeInt(this.f8126v ? 1 : 0);
        parcel.writeInt(this.f8127w ? 1 : 0);
        parcel.writeBundle(this.f8128x);
        parcel.writeInt(this.f8129y ? 1 : 0);
        parcel.writeBundle(this.A);
        parcel.writeInt(this.f8130z);
    }

    FragmentState(Parcel parcel) {
        this.f8119o = parcel.readString();
        this.f8120p = parcel.readString();
        this.f8121q = parcel.readInt() != 0;
        this.f8122r = parcel.readInt();
        this.f8123s = parcel.readInt();
        this.f8124t = parcel.readString();
        this.f8125u = parcel.readInt() != 0;
        this.f8126v = parcel.readInt() != 0;
        this.f8127w = parcel.readInt() != 0;
        this.f8128x = parcel.readBundle();
        this.f8129y = parcel.readInt() != 0;
        this.A = parcel.readBundle();
        this.f8130z = parcel.readInt();
    }
}
