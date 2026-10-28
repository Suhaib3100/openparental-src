package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.c1;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

/* compiled from: VersionedParcelStream.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
class f extends VersionedParcel {
    private static final Charset C = Charset.forName("UTF-16");
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 3;
    private static final int H = 4;
    private static final int I = 5;
    private static final int J = 6;
    private static final int K = 7;
    private static final int L = 8;
    private static final int M = 9;
    private static final int N = 10;
    private static final int O = 11;
    private static final int P = 12;
    private static final int Q = 13;
    private static final int R = 14;
    private int A;
    int B;

    /* renamed from: t, reason: collision with root package name */
    private final DataInputStream f35461t;

    /* renamed from: u, reason: collision with root package name */
    private final DataOutputStream f35462u;

    /* renamed from: v, reason: collision with root package name */
    private DataInputStream f35463v;

    /* renamed from: w, reason: collision with root package name */
    private DataOutputStream f35464w;

    /* renamed from: x, reason: collision with root package name */
    private b f35465x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f35466y;

    /* renamed from: z, reason: collision with root package name */
    int f35467z;

    /* compiled from: VersionedParcelStream.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final ByteArrayOutputStream f35469a;

        /* renamed from: b, reason: collision with root package name */
        final DataOutputStream f35470b;

        /* renamed from: c, reason: collision with root package name */
        private final int f35471c;

        /* renamed from: d, reason: collision with root package name */
        private final DataOutputStream f35472d;

        b(int i4, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f35469a = byteArrayOutputStream;
            this.f35470b = new DataOutputStream(byteArrayOutputStream);
            this.f35471c = i4;
            this.f35472d = dataOutputStream;
        }

        void a() throws IOException {
            this.f35470b.flush();
            int size = this.f35469a.size();
            this.f35472d.writeInt((this.f35471c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f35472d.writeInt(size);
            }
            this.f35469a.writeTo(this.f35472d);
        }
    }

    public f(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    private void o1(int i4, String str, Bundle bundle) {
        switch (i4) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException(android.support.v4.media.a.a("Unknown type ", i4));
        }
    }

    private void p1(Object obj) {
        if (obj == null) {
            L0(0);
            return;
        }
        if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            L0(3);
            e1((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
        } else if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d5) {
        try {
            this.f35464w.writeDouble(d5);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i4) {
        while (true) {
            try {
                int i5 = this.A;
                if (i5 == i4) {
                    return true;
                }
                if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                    return false;
                }
                if (this.f35467z < this.B) {
                    this.f35461t.skip(r2 - r1);
                }
                this.B = -1;
                int readInt = this.f35461t.readInt();
                this.f35467z = 0;
                int i6 = readInt & 65535;
                if (i6 == 65535) {
                    i6 = this.f35461t.readInt();
                }
                this.A = (readInt >> 16) & 65535;
                this.B = i6;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        try {
            return this.f35463v.readFloat();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f4) {
        try {
            this.f35464w.writeFloat(f4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        try {
            return this.f35463v.readInt();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i4) {
        try {
            this.f35464w.writeInt(i4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        try {
            return this.f35463v.readLong();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j4) {
        try {
            this.f35464w.writeLong(j4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        if (!this.f35466y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        b bVar = this.f35465x;
        if (bVar != null) {
            try {
                if (bVar.f35469a.size() != 0) {
                    this.f35465x.a();
                }
                this.f35465x = null;
            } catch (IOException e4) {
                throw new VersionedParcel.ParcelException(e4);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        return new f(this.f35463v, this.f35464w, this.f35449a, this.f35450b, this.f35451c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        try {
            int readInt = this.f35463v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f35463v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(C);
                this.f35464w.writeInt(bytes.length);
                this.f35464w.write(bytes);
            } else {
                this.f35464w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        if (!this.f35466y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean i() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i4) {
        a();
        b bVar = new b(i4, this.f35462u);
        this.f35465x = bVar;
        this.f35464w = bVar.f35470b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        if (!this.f35466y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void j0(boolean z4, boolean z5) {
        if (!z4) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f35466y = z5;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        try {
            return this.f35463v.readBoolean();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z4) {
        try {
            this.f35464w.writeBoolean(z4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        int L2 = L();
        if (L2 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i4 = 0; i4 < L2; i4++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f35464w.writeInt(-1);
                return;
            }
            Set<String> keySet = bundle.keySet();
            this.f35464w.writeInt(keySet.size());
            for (String str : keySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        try {
            int readInt = this.f35463v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f35463v.readFully(bArr);
            return bArr;
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f35464w.writeInt(bArr.length);
                this.f35464w.write(bArr);
            } else {
                this.f35464w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i4, int i5) {
        try {
            if (bArr != null) {
                this.f35464w.writeInt(i5);
                this.f35464w.write(bArr, i4, i5);
            } else {
                this.f35464w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        try {
            return this.f35463v.readDouble();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        if (!this.f35466y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    private f(InputStream inputStream, OutputStream outputStream, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f35467z = 0;
        this.A = -1;
        this.B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f35461t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f35462u = dataOutputStream;
        this.f35463v = dataInputStream;
        this.f35464w = dataOutputStream;
    }

    /* compiled from: VersionedParcelStream.java */
    class a extends FilterInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            f fVar = f.this;
            int i4 = fVar.B;
            if (i4 != -1 && fVar.f35467z >= i4) {
                throw new IOException();
            }
            int read = super.read();
            f.this.f35467z++;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j4) throws IOException {
            f fVar = f.this;
            int i4 = fVar.B;
            if (i4 != -1 && fVar.f35467z >= i4) {
                throw new IOException();
            }
            long skip = super.skip(j4);
            if (skip > 0) {
                f.this.f35467z += (int) skip;
            }
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            f fVar = f.this;
            int i6 = fVar.B;
            if (i6 != -1 && fVar.f35467z >= i6) {
                throw new IOException();
            }
            int read = super.read(bArr, i4, i5);
            if (read > 0) {
                f.this.f35467z += read;
            }
            return read;
        }
    }
}
