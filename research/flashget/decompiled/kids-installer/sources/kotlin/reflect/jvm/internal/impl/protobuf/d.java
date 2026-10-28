package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ByteString.java */
/* loaded from: classes5.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: o, reason: collision with root package name */
    public static final d f25692o = new n(new byte[0]);

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f25693p = false;

    /* compiled from: ByteString.java */
    public interface a extends Iterator<Byte> {
        byte b();
    }

    d() {
    }

    private static d b(Iterator<d> it, int i5) {
        if (i5 == 1) {
            return it.next();
        }
        int i6 = i5 >>> 1;
        return b(it, i6).f(b(it, i5 - i6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static d g(Iterable<d> iterable) {
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
        return r02.isEmpty() ? f25692o : b(r02.iterator(), r02.size());
    }

    public static d h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static d i(byte[] bArr, int i5, int i6) {
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i5, bArr2, 0, i6);
        return new n(bArr2);
    }

    public static d o(String str) {
        try {
            return new n(str.getBytes(ProtectedSandApp.s("伯")));
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("估"), e6);
        }
    }

    public static b x() {
        return new b(128);
    }

    protected abstract int A();

    public byte[] B() {
        int size = size();
        if (size == 0) {
            return i.f25745a;
        }
        byte[] bArr = new byte[size];
        q(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String C(String str) throws UnsupportedEncodingException;

    public String E() {
        try {
            return C(ProtectedSandApp.s("伱"));
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("伲"), e6);
        }
    }

    void H(OutputStream outputStream, int i5, int i6) throws IOException {
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(30, ProtectedSandApp.s("伵"), i5));
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(23, ProtectedSandApp.s("伴"), i6));
        }
        int i7 = i5 + i6;
        if (i7 > size()) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(39, ProtectedSandApp.s("伳"), i7));
        }
        if (i6 > 0) {
            I(outputStream, i5, i6);
        }
    }

    abstract void I(OutputStream outputStream, int i5, int i6) throws IOException;

    public d f(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return s.M(this, dVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append(ProtectedSandApp.s("伶"));
        sb.append(size);
        sb.append(ProtectedSandApp.s("伷"));
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void p(byte[] bArr, int i5, int i6, int i7) {
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(30, ProtectedSandApp.s("似"), i5));
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(30, ProtectedSandApp.s("伻"), i6));
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(23, ProtectedSandApp.s("伺"), i7));
        }
        int i8 = i5 + i7;
        if (i8 > size()) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(34, ProtectedSandApp.s("伹"), i8));
        }
        int i9 = i6 + i7;
        if (i9 > bArr.length) {
            throw new IndexOutOfBoundsException(com.google.android.gms.common.data.a.a(34, ProtectedSandApp.s("伸"), i9));
        }
        if (i7 > 0) {
            q(bArr, i5, i6, i7);
        }
    }

    protected abstract void q(byte[] bArr, int i5, int i6, int i7);

    protected abstract int r();

    protected abstract boolean s();

    public abstract int size();

    public abstract boolean t();

    public String toString() {
        return String.format(ProtectedSandApp.s("伽"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public abstract a iterator();

    public abstract e v();

    protected abstract int y(int i5, int i6, int i7);

    protected abstract int z(int i5, int i6, int i7);

    /* compiled from: ByteString.java */
    public static final class b extends OutputStream {

        /* renamed from: t, reason: collision with root package name */
        private static final byte[] f25694t = new byte[0];

        /* renamed from: o, reason: collision with root package name */
        private final int f25695o;

        /* renamed from: p, reason: collision with root package name */
        private final ArrayList<d> f25696p;

        /* renamed from: q, reason: collision with root package name */
        private int f25697q;

        /* renamed from: r, reason: collision with root package name */
        private byte[] f25698r;

        /* renamed from: s, reason: collision with root package name */
        private int f25699s;

        b(int i5) {
            if (i5 < 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("伭"));
            }
            this.f25695o = i5;
            this.f25696p = new ArrayList<>();
            this.f25698r = new byte[i5];
        }

        private byte[] a(byte[] bArr, int i5) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i5));
            return bArr2;
        }

        private void b(int i5) {
            this.f25696p.add(new n(this.f25698r));
            int length = this.f25697q + this.f25698r.length;
            this.f25697q = length;
            this.f25698r = new byte[Math.max(this.f25695o, Math.max(i5, length >>> 1))];
            this.f25699s = 0;
        }

        private void c() {
            int i5 = this.f25699s;
            byte[] bArr = this.f25698r;
            if (i5 >= bArr.length) {
                this.f25696p.add(new n(this.f25698r));
                this.f25698r = f25694t;
            } else if (i5 > 0) {
                this.f25696p.add(new n(a(bArr, i5)));
            }
            this.f25697q += this.f25699s;
            this.f25699s = 0;
        }

        public synchronized int d() {
            return this.f25697q + this.f25699s;
        }

        public synchronized d e() {
            c();
            return d.g(this.f25696p);
        }

        public String toString() {
            return String.format(ProtectedSandApp.s("伮"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i5) {
            if (this.f25699s == this.f25698r.length) {
                b(1);
            }
            byte[] bArr = this.f25698r;
            int i6 = this.f25699s;
            this.f25699s = i6 + 1;
            bArr[i6] = (byte) i5;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i5, int i6) {
            byte[] bArr2 = this.f25698r;
            int length = bArr2.length;
            int i7 = this.f25699s;
            if (i6 <= length - i7) {
                System.arraycopy(bArr, i5, bArr2, i7, i6);
                this.f25699s += i6;
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr, i5, bArr2, i7, length2);
                int i8 = i6 - length2;
                b(i8);
                System.arraycopy(bArr, i5 + length2, this.f25698r, 0, i8);
                this.f25699s = i8;
            }
        }
    }
}
