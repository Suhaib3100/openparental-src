package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: LiteralByteString.java */
/* loaded from: classes7.dex */
class n extends d {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f77738d;

    /* renamed from: e, reason: collision with root package name */
    private int f77739e = 0;

    /* compiled from: LiteralByteString.java */
    private class b implements d.a {

        /* renamed from: b, reason: collision with root package name */
        private int f77740b;

        /* renamed from: c, reason: collision with root package name */
        private final int f77741c;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(q());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77740b < this.f77741c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte q() {
            try {
                byte[] bArr = n.this.f77738d;
                int i4 = this.f77740b;
                this.f77740b = i4 + 1;
                return bArr[i4];
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new NoSuchElementException(e4.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f77740b = 0;
            this.f77741c = n.this.size();
        }
    }

    n(byte[] bArr) {
        this.f77738d = bArr;
    }

    static int Q(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int A(int i4, int i5, int i6) {
        int P = P() + i5;
        return v.g(i4, this.f77738d, P, i6 + P);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int D() {
        return this.f77739e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String G(String str) throws UnsupportedEncodingException {
        return new String(this.f77738d, P(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void K(OutputStream outputStream, int i4, int i5) throws IOException {
        outputStream.write(this.f77738d, P() + i4, i5);
    }

    public byte L(int i4) {
        return this.f77738d[i4];
    }

    boolean O(n nVar, int i4, int i5) {
        if (i5 > nVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append(ProtectedSandApp.s("皿\u0001"));
            sb.append(i5);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i4 + i5 > nVar.size()) {
            int size2 = nVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append(ProtectedSandApp.s("皽\u0001"));
            sb2.append(i4);
            String s4 = ProtectedSandApp.s("皾\u0001");
            sb2.append(s4);
            sb2.append(i5);
            sb2.append(s4);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f77738d;
        byte[] bArr2 = nVar.f77738d;
        int P = P() + i5;
        int P2 = P();
        int P3 = nVar.P() + i4;
        while (P2 < P) {
            if (bArr[P2] != bArr2[P3]) {
                return false;
            }
            P2++;
            P3++;
        }
        return true;
    }

    protected int P() {
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
            return O((n) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder(valueOf.length() + 49), ProtectedSandApp.s("盀\u0001"), valueOf));
    }

    public int hashCode() {
        int i4 = this.f77739e;
        if (i4 == 0) {
            int size = size();
            i4 = x(size, 0, size);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f77739e = i4;
        }
        return i4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void m(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.f77738d, i4, bArr, i5, i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int p() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean q() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean r() {
        int P = P();
        return v.f(this.f77738d, P, size() + P);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: s */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f77738d.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public e v() {
        return e.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x(int i4, int i5, int i6) {
        return Q(i4, this.f77738d, P() + i5, i6);
    }
}
