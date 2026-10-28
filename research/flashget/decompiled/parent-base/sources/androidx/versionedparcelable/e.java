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
    private final SparseIntArray f35454t;

    /* renamed from: u, reason: collision with root package name */
    private final Parcel f35455u;

    /* renamed from: v, reason: collision with root package name */
    private final int f35456v;

    /* renamed from: w, reason: collision with root package name */
    private final int f35457w;

    /* renamed from: x, reason: collision with root package name */
    private final String f35458x;

    /* renamed from: y, reason: collision with root package name */
    private int f35459y;

    /* renamed from: z, reason: collision with root package name */
    private int f35460z;

    e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d5) {
        this.f35455u.writeDouble(d5);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i4) {
        while (this.f35460z < this.f35457w) {
            int i5 = this.A;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f35455u.setDataPosition(this.f35460z);
            int readInt = this.f35455u.readInt();
            this.A = this.f35455u.readInt();
            this.f35460z += readInt;
        }
        return this.A == i4;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        return this.f35455u.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f4) {
        this.f35455u.writeFloat(f4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        return this.f35455u.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i4) {
        this.f35455u.writeInt(i4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        return this.f35455u.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j4) {
        this.f35455u.writeLong(j4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return (T) this.f35455u.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        this.f35455u.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i4 = this.f35459y;
        if (i4 >= 0) {
            int i5 = this.f35454t.get(i4);
            int dataPosition = this.f35455u.dataPosition();
            this.f35455u.setDataPosition(i5);
            this.f35455u.writeInt(dataPosition - i5);
            this.f35455u.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        Parcel parcel = this.f35455u;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f35460z;
        if (i4 == this.f35456v) {
            i4 = this.f35457w;
        }
        return new e(parcel, dataPosition, i4, android.support.v4.media.c.a(new StringBuilder(), this.f35458x, "  "), this.f35449a, this.f35450b, this.f35451c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        return this.f35455u.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return this.f35455u.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        this.f35455u.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        this.f35455u.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i4) {
        a();
        this.f35459y = i4;
        this.f35454t.put(i4, this.f35455u.dataPosition());
        L0(0);
        L0(i4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        this.f35455u.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        return this.f35455u.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z4) {
        this.f35455u.writeInt(z4 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        return this.f35455u.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        this.f35455u.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        int readInt = this.f35455u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f35455u.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f35455u.writeInt(-1);
        } else {
            this.f35455u.writeInt(bArr.length);
            this.f35455u.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f35455u);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            this.f35455u.writeInt(-1);
        } else {
            this.f35455u.writeInt(bArr.length);
            this.f35455u.writeByteArray(bArr, i4, i5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        return this.f35455u.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f35455u, 0);
    }

    private e(Parcel parcel, int i4, int i5, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f35454t = new SparseIntArray();
        this.f35459y = -1;
        this.A = -1;
        this.f35455u = parcel;
        this.f35456v = i4;
        this.f35457w = i5;
        this.f35460z = i4;
        this.f35458x = str;
    }
}
