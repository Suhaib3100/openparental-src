package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.s;
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
    private final DataInputStream f10323t;

    /* renamed from: u, reason: collision with root package name */
    private final DataOutputStream f10324u;

    /* renamed from: v, reason: collision with root package name */
    private DataInputStream f10325v;

    /* renamed from: w, reason: collision with root package name */
    private DataOutputStream f10326w;

    /* renamed from: x, reason: collision with root package name */
    private b f10327x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10328y;

    /* renamed from: z, reason: collision with root package name */
    int f10329z;

    /* compiled from: VersionedParcelStream.java */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final ByteArrayOutputStream f10331a;

        /* renamed from: b, reason: collision with root package name */
        final DataOutputStream f10332b;

        /* renamed from: c, reason: collision with root package name */
        private final int f10333c;

        /* renamed from: d, reason: collision with root package name */
        private final DataOutputStream f10334d;

        b(int i5, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f10331a = byteArrayOutputStream;
            this.f10332b = new DataOutputStream(byteArrayOutputStream);
            this.f10333c = i5;
            this.f10334d = dataOutputStream;
        }

        void a() throws IOException {
            this.f10332b.flush();
            int size = this.f10331a.size();
            this.f10334d.writeInt((this.f10333c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f10334d.writeInt(size);
            }
            this.f10331a.writeTo(this.f10334d);
        }
    }

    public f(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    private void o1(int i5, String str, Bundle bundle) {
        switch (i5) {
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
                throw new RuntimeException(s.a("Unknown type ", i5));
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
    public void C0(double d6) {
        try {
            this.f10326w.writeDouble(d6);
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i5) {
        while (true) {
            try {
                int i6 = this.A;
                if (i6 == i5) {
                    return true;
                }
                if (String.valueOf(i6).compareTo(String.valueOf(i5)) > 0) {
                    return false;
                }
                if (this.f10329z < this.B) {
                    this.f10323t.skip(r2 - r1);
                }
                this.B = -1;
                int readInt = this.f10323t.readInt();
                this.f10329z = 0;
                int i7 = readInt & 65535;
                if (i7 == 65535) {
                    i7 = this.f10323t.readInt();
                }
                this.A = (readInt >> 16) & 65535;
                this.B = i7;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        try {
            return this.f10325v.readFloat();
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f6) {
        try {
            this.f10326w.writeFloat(f6);
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        try {
            return this.f10325v.readInt();
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i5) {
        try {
            this.f10326w.writeInt(i5);
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        try {
            return this.f10325v.readLong();
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j5) {
        try {
            this.f10326w.writeLong(j5);
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        if (!this.f10328y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        b bVar = this.f10327x;
        if (bVar != null) {
            try {
                if (bVar.f10331a.size() != 0) {
                    this.f10327x.a();
                }
                this.f10327x = null;
            } catch (IOException e6) {
                throw new VersionedParcel.ParcelException(e6);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        return new f(this.f10325v, this.f10326w, this.f10311a, this.f10312b, this.f10313c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        try {
            int readInt = this.f10325v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f10325v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
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
                this.f10326w.writeInt(bytes.length);
                this.f10326w.write(bytes);
            } else {
                this.f10326w.writeInt(-1);
            }
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        if (!this.f10328y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean i() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i5) {
        a();
        b bVar = new b(i5, this.f10324u);
        this.f10327x = bVar;
        this.f10326w = bVar.f10332b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        if (!this.f10328y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void j0(boolean z5, boolean z6) {
        if (!z5) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f10328y = z6;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        try {
            return this.f10325v.readBoolean();
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z5) {
        try {
            this.f10326w.writeBoolean(z5);
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        int L2 = L();
        if (L2 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i5 = 0; i5 < L2; i5++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f10326w.writeInt(-1);
                return;
            }
            Set<String> keySet = bundle.keySet();
            this.f10326w.writeInt(keySet.size());
            for (String str : keySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        try {
            int readInt = this.f10325v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f10325v.readFully(bArr);
            return bArr;
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f10326w.writeInt(bArr.length);
                this.f10326w.write(bArr);
            } else {
                this.f10326w.writeInt(-1);
            }
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i5, int i6) {
        try {
            if (bArr != null) {
                this.f10326w.writeInt(i6);
                this.f10326w.write(bArr, i5, i6);
            } else {
                this.f10326w.writeInt(-1);
            }
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        try {
            return this.f10325v.readDouble();
        } catch (IOException e6) {
            throw new VersionedParcel.ParcelException(e6);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        if (!this.f10328y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    private f(InputStream inputStream, OutputStream outputStream, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f10329z = 0;
        this.A = -1;
        this.B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f10323t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f10324u = dataOutputStream;
        this.f10325v = dataInputStream;
        this.f10326w = dataOutputStream;
    }

    /* compiled from: VersionedParcelStream.java */
    /* loaded from: classes.dex */
    class a extends FilterInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            f fVar = f.this;
            int i5 = fVar.B;
            if (i5 != -1 && fVar.f10329z >= i5) {
                throw new IOException();
            }
            int read = super.read();
            f.this.f10329z++;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j5) throws IOException {
            f fVar = f.this;
            int i5 = fVar.B;
            if (i5 != -1 && fVar.f10329z >= i5) {
                throw new IOException();
            }
            long skip = super.skip(j5);
            if (skip > 0) {
                f.this.f10329z += (int) skip;
            }
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) throws IOException {
            f fVar = f.this;
            int i7 = fVar.B;
            if (i7 != -1 && fVar.f10329z >= i7) {
                throw new IOException();
            }
            int read = super.read(bArr, i5, i6);
            if (read > 0) {
                f.this.f10329z += read;
            }
            return read;
        }
    }
}
