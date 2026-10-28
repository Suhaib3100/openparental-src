package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ByteString.java */
/* loaded from: classes7.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: b, reason: collision with root package name */
    public static final d f77674b = new n(new byte[0]);

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f77675c = false;

    /* compiled from: ByteString.java */
    public interface a extends Iterator<Byte> {
        byte q();
    }

    d() {
    }

    private static d b(Iterator<d> it, int i4) {
        if (i4 == 1) {
            return it.next();
        }
        int i5 = i4 >>> 1;
        return b(it, i5).c(b(it, i4 - i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static d f(Iterable<d> iterable) {
        ?? r02;
        if (iterable instanceof Collection) {
            r02 = (Collection) iterable;
        } else {
            r02 = new ArrayList();
            Iterator<d> it = iterable.iterator();
            while (it.hasNext()) {
                r02.add(it.next());
            }
        }
        return r02.isEmpty() ? f77674b : b(r02.iterator(), r02.size());
    }

    public static d h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static d i(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new n(bArr2);
    }

    public static d j(String str) {
        try {
            return new n(str.getBytes(ProtectedSandApp.s("皲\u0001")));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(ProtectedSandApp.s("皳\u0001"), e4);
        }
    }

    public static b w() {
        return new b(128);
    }

    protected abstract int A(int i4, int i5, int i6);

    protected abstract int D();

    public byte[] F() {
        int size = size();
        if (size == 0) {
            return i.f77727a;
        }
        byte[] bArr = new byte[size];
        m(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String G(String str) throws UnsupportedEncodingException;

    public String H() {
        try {
            return G(ProtectedSandApp.s("皲\u0001"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(ProtectedSandApp.s("皳\u0001"), e4);
        }
    }

    void I(OutputStream outputStream, int i4, int i5) throws IOException {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(30, ProtectedSandApp.s("皶\u0001"), i4));
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(23, ProtectedSandApp.s("皵\u0001"), i5));
        }
        int i6 = i4 + i5;
        if (i6 > size()) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(39, ProtectedSandApp.s("皴\u0001"), i6));
        }
        if (i5 > 0) {
            K(outputStream, i4, i5);
        }
    }

    abstract void K(OutputStream outputStream, int i4, int i5) throws IOException;

    public d c(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return s.Q(this, dVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append(ProtectedSandApp.s("皷\u0001"));
        sb.append(size);
        sb.append(ProtectedSandApp.s("皸\u0001"));
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void l(byte[] bArr, int i4, int i5, int i6) {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(30, ProtectedSandApp.s("皶\u0001"), i4));
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(30, ProtectedSandApp.s("皻\u0001"), i5));
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(23, ProtectedSandApp.s("皵\u0001"), i6));
        }
        int i7 = i4 + i6;
        if (i7 > size()) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(34, ProtectedSandApp.s("皺\u0001"), i7));
        }
        int i10 = i5 + i6;
        if (i10 > bArr.length) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(34, ProtectedSandApp.s("皹\u0001"), i10));
        }
        if (i6 > 0) {
            m(bArr, i4, i5, i6);
        }
    }

    protected abstract void m(byte[] bArr, int i4, int i5, int i6);

    protected abstract int p();

    protected abstract boolean q();

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract a iterator();

    public abstract int size();

    public String toString() {
        return String.format(ProtectedSandApp.s("皼\u0001"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract e v();

    protected abstract int x(int i4, int i5, int i6);

    /* compiled from: ByteString.java */
    public static final class b extends OutputStream {

        /* renamed from: g, reason: collision with root package name */
        private static final byte[] f77676g = new byte[0];

        /* renamed from: b, reason: collision with root package name */
        private final int f77677b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<d> f77678c;

        /* renamed from: d, reason: collision with root package name */
        private int f77679d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f77680e;

        /* renamed from: f, reason: collision with root package name */
        private int f77681f;

        b(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("盈\u0001"));
            }
            this.f77677b = i4;
            this.f77678c = new ArrayList<>();
            this.f77680e = new byte[i4];
        }

        private byte[] a(byte[] bArr, int i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i4));
            return bArr2;
        }

        private void b(int i4) {
            this.f77678c.add(new n(this.f77680e));
            int length = this.f77679d + this.f77680e.length;
            this.f77679d = length;
            this.f77680e = new byte[Math.max(this.f77677b, Math.max(i4, length >>> 1))];
            this.f77681f = 0;
        }

        private void c() {
            int i4 = this.f77681f;
            byte[] bArr = this.f77680e;
            if (i4 >= bArr.length) {
                this.f77678c.add(new n(this.f77680e));
                this.f77680e = f77676g;
            } else if (i4 > 0) {
                this.f77678c.add(new n(a(bArr, i4)));
            }
            this.f77679d += this.f77681f;
            this.f77681f = 0;
        }

        public synchronized int d() {
            return this.f77679d + this.f77681f;
        }

        public synchronized d e() {
            c();
            return d.f(this.f77678c);
        }

        public String toString() {
            return String.format(ProtectedSandApp.s("盉\u0001"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i4) {
            try {
                if (this.f77681f == this.f77680e.length) {
                    b(1);
                }
                byte[] bArr = this.f77680e;
                int i5 = this.f77681f;
                this.f77681f = i5 + 1;
                bArr[i5] = (byte) i4;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i4, int i5) {
            try {
                byte[] bArr2 = this.f77680e;
                int length = bArr2.length;
                int i6 = this.f77681f;
                if (i5 <= length - i6) {
                    System.arraycopy(bArr, i4, bArr2, i6, i5);
                    this.f77681f += i5;
                } else {
                    int length2 = bArr2.length - i6;
                    System.arraycopy(bArr, i4, bArr2, i6, length2);
                    int i7 = i5 - length2;
                    b(i7);
                    System.arraycopy(bArr, i4 + length2, this.f77680e, 0, i7);
                    this.f77681f = i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
