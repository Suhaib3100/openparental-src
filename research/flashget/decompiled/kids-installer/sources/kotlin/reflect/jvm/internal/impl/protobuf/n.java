package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: LiteralByteString.java */
/* loaded from: classes5.dex */
class n extends d {

    /* renamed from: q, reason: collision with root package name */
    protected final byte[] f25756q;

    /* renamed from: r, reason: collision with root package name */
    private int f25757r = 0;

    /* compiled from: LiteralByteString.java */
    private class b implements d.a {

        /* renamed from: o, reason: collision with root package name */
        private int f25758o;

        /* renamed from: p, reason: collision with root package name */
        private final int f25759p;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            try {
                byte[] bArr = n.this.f25756q;
                int i5 = this.f25758o;
                this.f25758o = i5 + 1;
                return bArr[i5];
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new NoSuchElementException(e6.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25758o < this.f25759p;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f25758o = 0;
            this.f25759p = n.this.size();
        }
    }

    n(byte[] bArr) {
        this.f25756q = bArr;
    }

    static int M(int i5, byte[] bArr, int i6, int i7) {
        for (int i8 = i6; i8 < i6 + i7; i8++) {
            i5 = (i5 * 31) + bArr[i8];
        }
        return i5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int A() {
        return this.f25757r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String C(String str) throws UnsupportedEncodingException {
        return new String(this.f25756q, L(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void I(OutputStream outputStream, int i5, int i6) throws IOException {
        outputStream.write(this.f25756q, L() + i5, i6);
    }

    public byte J(int i5) {
        return this.f25756q[i5];
    }

    boolean K(n nVar, int i5, int i6) {
        if (i6 > nVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append(ProtectedSandApp.s("佘"));
            sb.append(i6);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i5 + i6 > nVar.size()) {
            int size2 = nVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append(ProtectedSandApp.s("佖"));
            sb2.append(i5);
            String s5 = ProtectedSandApp.s("佗");
            sb2.append(s5);
            sb2.append(i6);
            sb2.append(s5);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f25756q;
        byte[] bArr2 = nVar.f25756q;
        int L = L() + i6;
        int L2 = L();
        int L3 = nVar.L() + i5;
        while (L2 < L) {
            if (bArr[L2] != bArr2[L3]) {
                return false;
            }
            L2++;
            L3++;
        }
        return true;
    }

    protected int L() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof n) {
            return K((n) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder(valueOf.length() + 49), ProtectedSandApp.s("余"), valueOf));
    }

    public int hashCode() {
        int i5 = this.f25757r;
        if (i5 == 0) {
            int size = size();
            i5 = y(size, 0, size);
            if (i5 == 0) {
                i5 = 1;
            }
            this.f25757r = i5;
        }
        return i5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void q(byte[] bArr, int i5, int i6, int i7) {
        System.arraycopy(this.f25756q, i5, bArr, i6, i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int r() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean s() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f25756q.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean t() {
        int L = L();
        return v.f(this.f25756q, L, size() + L);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public e v() {
        return e.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int y(int i5, int i6, int i7) {
        return M(i5, this.f25756q, L() + i6, i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int z(int i5, int i6, int i7) {
        int L = L() + i6;
        return v.g(i5, this.f25756q, L, i7 + L);
    }
}
