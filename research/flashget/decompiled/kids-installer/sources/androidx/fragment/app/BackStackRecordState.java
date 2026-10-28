package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.t;
import androidx.fragment.app.f0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    private static final String C = "FragmentManager";
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    final ArrayList<String> A;
    final boolean B;

    /* renamed from: o, reason: collision with root package name */
    final int[] f7994o;

    /* renamed from: p, reason: collision with root package name */
    final ArrayList<String> f7995p;

    /* renamed from: q, reason: collision with root package name */
    final int[] f7996q;

    /* renamed from: r, reason: collision with root package name */
    final int[] f7997r;

    /* renamed from: s, reason: collision with root package name */
    final int f7998s;

    /* renamed from: t, reason: collision with root package name */
    final String f7999t;

    /* renamed from: u, reason: collision with root package name */
    final int f8000u;

    /* renamed from: v, reason: collision with root package name */
    final int f8001v;

    /* renamed from: w, reason: collision with root package name */
    final CharSequence f8002w;

    /* renamed from: x, reason: collision with root package name */
    final int f8003x;

    /* renamed from: y, reason: collision with root package name */
    final CharSequence f8004y;

    /* renamed from: z, reason: collision with root package name */
    final ArrayList<String> f8005z;

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
        public BackStackRecordState[] newArray(int i5) {
            return new BackStackRecordState[i5];
        }
    }

    BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f8238c.size();
        this.f7994o = new int[size * 6];
        if (!aVar.f8244i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f7995p = new ArrayList<>(size);
        this.f7996q = new int[size];
        this.f7997r = new int[size];
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            f0.a aVar2 = aVar.f8238c.get(i5);
            int i7 = i6 + 1;
            this.f7994o[i6] = aVar2.f8255a;
            ArrayList<String> arrayList = this.f7995p;
            Fragment fragment = aVar2.f8256b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f7994o;
            int i8 = i7 + 1;
            iArr[i7] = aVar2.f8257c ? 1 : 0;
            int i9 = i8 + 1;
            iArr[i8] = aVar2.f8258d;
            int i10 = i9 + 1;
            iArr[i9] = aVar2.f8259e;
            int i11 = i10 + 1;
            iArr[i10] = aVar2.f8260f;
            iArr[i11] = aVar2.f8261g;
            this.f7996q[i5] = aVar2.f8262h.ordinal();
            this.f7997r[i5] = aVar2.f8263i.ordinal();
            i5++;
            i6 = i11 + 1;
        }
        this.f7998s = aVar.f8243h;
        this.f7999t = aVar.f8246k;
        this.f8000u = aVar.P;
        this.f8001v = aVar.f8247l;
        this.f8002w = aVar.f8248m;
        this.f8003x = aVar.f8249n;
        this.f8004y = aVar.f8250o;
        this.f8005z = aVar.f8251p;
        this.A = aVar.f8252q;
        this.B = aVar.f8253r;
    }

    private void a(@androidx.annotation.o0 androidx.fragment.app.a aVar) {
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 >= this.f7994o.length) {
                aVar.f8243h = this.f7998s;
                aVar.f8246k = this.f7999t;
                aVar.f8244i = true;
                aVar.f8247l = this.f8001v;
                aVar.f8248m = this.f8002w;
                aVar.f8249n = this.f8003x;
                aVar.f8250o = this.f8004y;
                aVar.f8251p = this.f8005z;
                aVar.f8252q = this.A;
                aVar.f8253r = this.B;
                return;
            }
            f0.a aVar2 = new f0.a();
            int i7 = i5 + 1;
            aVar2.f8255a = this.f7994o[i5];
            if (FragmentManager.W0(2)) {
                Objects.toString(aVar);
                int i8 = this.f7994o[i7];
            }
            aVar2.f8262h = t.c.values()[this.f7996q[i6]];
            aVar2.f8263i = t.c.values()[this.f7997r[i6]];
            int[] iArr = this.f7994o;
            int i9 = i7 + 1;
            if (iArr[i7] == 0) {
                z5 = false;
            }
            aVar2.f8257c = z5;
            int i10 = i9 + 1;
            int i11 = iArr[i9];
            aVar2.f8258d = i11;
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            aVar2.f8259e = i13;
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            aVar2.f8260f = i15;
            int i16 = iArr[i14];
            aVar2.f8261g = i16;
            aVar.f8239d = i11;
            aVar.f8240e = i13;
            aVar.f8241f = i15;
            aVar.f8242g = i16;
            aVar.i(aVar2);
            i6++;
            i5 = i14 + 1;
        }
    }

    @androidx.annotation.o0
    public androidx.fragment.app.a b(@androidx.annotation.o0 FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.P = this.f8000u;
        for (int i5 = 0; i5 < this.f7995p.size(); i5++) {
            String str = this.f7995p.get(i5);
            if (str != null) {
                aVar.f8238c.get(i5).f8256b = fragmentManager.o0(str);
            }
        }
        aVar.Q(1);
        return aVar;
    }

    @androidx.annotation.o0
    public androidx.fragment.app.a c(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Map<String, Fragment> map) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        for (int i5 = 0; i5 < this.f7995p.size(); i5++) {
            String str = this.f7995p.get(i5);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f7999t + " failed due to missing saved state for Fragment (" + str + ")");
                }
                aVar.f8238c.get(i5).f8256b = fragment;
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeIntArray(this.f7994o);
        parcel.writeStringList(this.f7995p);
        parcel.writeIntArray(this.f7996q);
        parcel.writeIntArray(this.f7997r);
        parcel.writeInt(this.f7998s);
        parcel.writeString(this.f7999t);
        parcel.writeInt(this.f8000u);
        parcel.writeInt(this.f8001v);
        TextUtils.writeToParcel(this.f8002w, parcel, 0);
        parcel.writeInt(this.f8003x);
        TextUtils.writeToParcel(this.f8004y, parcel, 0);
        parcel.writeStringList(this.f8005z);
        parcel.writeStringList(this.A);
        parcel.writeInt(this.B ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f7994o = parcel.createIntArray();
        this.f7995p = parcel.createStringArrayList();
        this.f7996q = parcel.createIntArray();
        this.f7997r = parcel.createIntArray();
        this.f7998s = parcel.readInt();
        this.f7999t = parcel.readString();
        this.f8000u = parcel.readInt();
        this.f8001v = parcel.readInt();
        this.f8002w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8003x = parcel.readInt();
        this.f8004y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8005z = parcel.createStringArrayList();
        this.A = parcel.createStringArrayList();
        this.B = parcel.readInt() != 0;
    }
}
