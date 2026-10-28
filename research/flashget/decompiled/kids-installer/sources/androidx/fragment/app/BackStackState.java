package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    final List<String> f8006o;

    /* renamed from: p, reason: collision with root package name */
    final List<BackStackRecordState> f8007p;

    class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i5) {
            return new BackStackState[i5];
        }
    }

    BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.f8006o = list;
        this.f8007p = list2;
    }

    @androidx.annotation.o0
    List<androidx.fragment.app.a> a(@androidx.annotation.o0 FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.f8006o.size());
        for (String str : this.f8006o) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                FragmentState C = fragmentManager.H0().C(str, null);
                if (C != null) {
                    Fragment a6 = C.a(fragmentManager.G0(), fragmentManager.J0().j().getClassLoader());
                    hashMap.put(a6.mWho, a6);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BackStackRecordState> it = this.f8007p.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.o0 Parcel parcel, int i5) {
        parcel.writeStringList(this.f8006o);
        parcel.writeTypedList(this.f8007p);
    }

    BackStackState(@androidx.annotation.o0 Parcel parcel) {
        this.f8006o = parcel.createStringArrayList();
        this.f8007p = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
