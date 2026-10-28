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
/* loaded from: classes3.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final List<String> f29730b;

    /* renamed from: c, reason: collision with root package name */
    final List<BackStackRecordState> f29731c;

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
        public BackStackState[] newArray(int i4) {
            return new BackStackState[i4];
        }
    }

    BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.f29730b = list;
        this.f29731c = list2;
    }

    @androidx.annotation.o0
    List<b> a(@androidx.annotation.o0 FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.f29730b.size());
        for (String str : this.f29730b) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                FragmentState C = fragmentManager.H0().C(str, null);
                if (C != null) {
                    Fragment a5 = C.a(fragmentManager.G0(), fragmentManager.J0().f().getClassLoader());
                    hashMap.put(a5.mWho, a5);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BackStackRecordState> it = this.f29731c.iterator();
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
    public void writeToParcel(@androidx.annotation.o0 Parcel parcel, int i4) {
        parcel.writeStringList(this.f29730b);
        parcel.writeTypedList(this.f29731c);
    }

    BackStackState(@androidx.annotation.o0 Parcel parcel) {
        this.f29730b = parcel.createStringArrayList();
        this.f29731c = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
