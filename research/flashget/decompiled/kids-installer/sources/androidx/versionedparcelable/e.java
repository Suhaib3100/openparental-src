package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.c1;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
class e extends VersionedParcel {
    private static final boolean B = false;
    private static final String C = "VersionedParcelParcel";
    private int A;

    /* renamed from: t, reason: collision with root package name */
    private final SparseIntArray f10316t;

    /* renamed from: u, reason: collision with root package name */
    private final Parcel f10317u;

    /* renamed from: v, reason: collision with root package name */
    private final int f10318v;

    /* renamed from: w, reason: collision with root package name */
    private final int f10319w;

    /* renamed from: x, reason: collision with root package name */
    private final String f10320x;

    /* renamed from: y, reason: collision with root package name */
    private int f10321y;

    /* renamed from: z, reason: collision with root package name */
    private int f10322z;

    e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d6) {
        this.f10317u.writeDouble(d6);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i5) {
        while (this.f10322z < this.f10319w) {
            int i6 = this.A;
            if (i6 == i5) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i5)) > 0) {
                return false;
            }
            this.f10317u.setDataPosition(this.f10322z);
            int readInt = this.f10317u.readInt();
            this.A = this.f10317u.readInt();
            this.f10322z += readInt;
        }
        return this.A == i5;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        return this.f10317u.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f6) {
        this.f10317u.writeFloat(f6);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        return this.f10317u.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i5) {
        this.f10317u.writeInt(i5);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        return this.f10317u.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j5) {
        this.f10317u.writeLong(j5);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return (T) this.f10317u.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        this.f10317u.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i5 = this.f10321y;
        if (i5 >= 0) {
            int i6 = this.f10316t.get(i5);
            int dataPosition = this.f10317u.dataPosition();
            this.f10317u.setDataPosition(i6);
            this.f10317u.writeInt(dataPosition - i6);
            this.f10317u.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        Parcel parcel = this.f10317u;
        int dataPosition = parcel.dataPosition();
        int i5 = this.f10322z;
        if (i5 == this.f10318v) {
            i5 = this.f10319w;
        }
        return new e(parcel, dataPosition, i5, androidx.concurrent.futures.a.a(new StringBuilder(), this.f10320x, "  "), this.f10311a, this.f10312b, this.f10313c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        return this.f10317u.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return this.f10317u.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        this.f10317u.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        this.f10317u.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i5) {
        a();
        this.f10321y = i5;
        this.f10316t.put(i5, this.f10317u.dataPosition());
        L0(0);
        L0(i5);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        this.f10317u.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        return this.f10317u.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z5) {
        this.f10317u.writeInt(z5 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        return this.f10317u.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        this.f10317u.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        int readInt = this.f10317u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f10317u.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f10317u.writeInt(-1);
        } else {
            this.f10317u.writeInt(bArr.length);
            this.f10317u.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f10317u);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i5, int i6) {
        if (bArr == null) {
            this.f10317u.writeInt(-1);
        } else {
            this.f10317u.writeInt(bArr.length);
            this.f10317u.writeByteArray(bArr, i5, i6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        return this.f10317u.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f10317u, 0);
    }

    private e(Parcel parcel, int i5, int i6, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f10316t = new SparseIntArray();
        this.f10321y = -1;
        this.A = -1;
        this.f10317u = parcel;
        this.f10318v = i5;
        this.f10319w = i6;
        this.f10322z = i5;
        this.f10320x = str;
    }
}
