package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.l0;
import androidx.view.AbstractC1450w;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final class BackStackRecordState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    final int[] f29716b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<String> f29717c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f29718d;

    /* renamed from: e, reason: collision with root package name */
    final int[] f29719e;

    /* renamed from: f, reason: collision with root package name */
    final int f29720f;

    /* renamed from: g, reason: collision with root package name */
    final String f29721g;

    /* renamed from: h, reason: collision with root package name */
    final int f29722h;

    /* renamed from: i, reason: collision with root package name */
    final int f29723i;

    /* renamed from: j, reason: collision with root package name */
    final CharSequence f29724j;

    /* renamed from: k, reason: collision with root package name */
    final int f29725k;

    /* renamed from: l, reason: collision with root package name */
    final CharSequence f29726l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList<String> f29727m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList<String> f29728n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f29729o;

    /* renamed from: p, reason: collision with root package name */
    private static final String f29715p = "FragmentManager";
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    class a implements Parcelable.Creator<BackStackRecordState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i4) {
            return new BackStackRecordState[i4];
        }
    }

    BackStackRecordState(b bVar) {
        int size = bVar.f29993c.size();
        this.f29716b = new int[size * 6];
        if (!bVar.f29999i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f29717c = new ArrayList<>(size);
        this.f29718d = new int[size];
        this.f29719e = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            l0.a aVar = bVar.f29993c.get(i5);
            int i6 = i4 + 1;
            this.f29716b[i4] = aVar.f30010a;
            ArrayList<String> arrayList = this.f29717c;
            Fragment fragment = aVar.f30011b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f29716b;
            iArr[i6] = aVar.f30012c ? 1 : 0;
            iArr[i4 + 2] = aVar.f30013d;
            iArr[i4 + 3] = aVar.f30014e;
            int i7 = i4 + 5;
            iArr[i4 + 4] = aVar.f30015f;
            i4 += 6;
            iArr[i7] = aVar.f30016g;
            this.f29718d[i5] = aVar.f30017h.ordinal();
            this.f29719e[i5] = aVar.f30018i.ordinal();
        }
        this.f29720f = bVar.f29998h;
        this.f29721g = bVar.f30001k;
        this.f29722h = bVar.P;
        this.f29723i = bVar.f30002l;
        this.f29724j = bVar.f30003m;
        this.f29725k = bVar.f30004n;
        this.f29726l = bVar.f30005o;
        this.f29727m = bVar.f30006p;
        this.f29728n = bVar.f30007q;
        this.f29729o = bVar.f30008r;
    }

    private void a(@androidx.annotation.o0 b bVar) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i4 >= this.f29716b.length) {
                bVar.f29998h = this.f29720f;
                bVar.f30001k = this.f29721g;
                bVar.f29999i = true;
                bVar.f30002l = this.f29723i;
                bVar.f30003m = this.f29724j;
                bVar.f30004n = this.f29725k;
                bVar.f30005o = this.f29726l;
                bVar.f30006p = this.f29727m;
                bVar.f30007q = this.f29728n;
                bVar.f30008r = this.f29729o;
                return;
            }
            l0.a aVar = new l0.a();
            int i6 = i4 + 1;
            aVar.f30010a = this.f29716b[i4];
            if (FragmentManager.W0(2)) {
                Objects.toString(bVar);
                int i7 = this.f29716b[i6];
            }
            aVar.f30017h = AbstractC1450w.b.values()[this.f29718d[i5]];
            aVar.f30018i = AbstractC1450w.b.values()[this.f29719e[i5]];
            int[] iArr = this.f29716b;
            int i10 = i4 + 2;
            if (iArr[i6] == 0) {
                z4 = false;
            }
            aVar.f30012c = z4;
            int i11 = iArr[i10];
            aVar.f30013d = i11;
            int i12 = iArr[i4 + 3];
            aVar.f30014e = i12;
            int i13 = i4 + 5;
            int i14 = iArr[i4 + 4];
            aVar.f30015f = i14;
            i4 += 6;
            int i15 = iArr[i13];
            aVar.f30016g = i15;
            bVar.f29994d = i11;
            bVar.f29995e = i12;
            bVar.f29996f = i14;
            bVar.f29997g = i15;
            bVar.n(aVar);
            i5++;
        }
    }

    @androidx.annotation.o0
    public b b(@androidx.annotation.o0 FragmentManager fragmentManager) {
        b bVar = new b(fragmentManager);
        a(bVar);
        bVar.P = this.f29722h;
        for (int i4 = 0; i4 < this.f29717c.size(); i4++) {
            String str = this.f29717c.get(i4);
            if (str != null) {
                bVar.f29993c.get(i4).f30011b = fragmentManager.o0(str);
            }
        }
        bVar.V(1);
        return bVar;
    }

    @androidx.annotation.o0
    public b c(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Map<String, Fragment> map) {
        b bVar = new b(fragmentManager);
        a(bVar);
        for (int i4 = 0; i4 < this.f29717c.size(); i4++) {
            String str = this.f29717c.get(i4);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException(c.a(new StringBuilder("Restoring FragmentTransaction "), this.f29721g, " failed due to missing saved state for Fragment (", str, ")"));
                }
                bVar.f29993c.get(i4).f30011b = fragment;
            }
        }
        return bVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f29716b);
        parcel.writeStringList(this.f29717c);
        parcel.writeIntArray(this.f29718d);
        parcel.writeIntArray(this.f29719e);
        parcel.writeInt(this.f29720f);
        parcel.writeString(this.f29721g);
        parcel.writeInt(this.f29722h);
        parcel.writeInt(this.f29723i);
        TextUtils.writeToParcel(this.f29724j, parcel, 0);
        parcel.writeInt(this.f29725k);
        TextUtils.writeToParcel(this.f29726l, parcel, 0);
        parcel.writeStringList(this.f29727m);
        parcel.writeStringList(this.f29728n);
        parcel.writeInt(this.f29729o ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f29716b = parcel.createIntArray();
        this.f29717c = parcel.createStringArrayList();
        this.f29718d = parcel.createIntArray();
        this.f29719e = parcel.createIntArray();
        this.f29720f = parcel.readInt();
        this.f29721g = parcel.readString();
        this.f29722h = parcel.readInt();
        this.f29723i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f29724j = (CharSequence) creator.createFromParcel(parcel);
        this.f29725k = parcel.readInt();
        this.f29726l = (CharSequence) creator.createFromParcel(parcel);
        this.f29727m = parcel.createStringArrayList();
        this.f29728n = parcel.createStringArrayList();
        this.f29729o = parcel.readInt() != 0;
    }
}
