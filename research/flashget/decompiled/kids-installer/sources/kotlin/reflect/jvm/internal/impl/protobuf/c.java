package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: BoundedByteString.java */
/* loaded from: classes6.dex */
class c extends n {

    /* renamed from: s, reason: collision with root package name */
    private final int f25687s;

    /* renamed from: t, reason: collision with root package name */
    private final int f25688t;

    /* compiled from: BoundedByteString.java */
    /* loaded from: classes5.dex */
    private class b implements d.a {

        /* renamed from: o, reason: collision with root package name */
        private int f25689o;

        /* renamed from: p, reason: collision with root package name */
        private final int f25690p;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            int i5 = this.f25689o;
            if (i5 >= this.f25690p) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f25756q;
            this.f25689o = i5 + 1;
            return bArr[i5];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25689o < this.f25690p;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int L = c.this.L();
            this.f25689o = L;
            this.f25690p = L + c.this.size();
        }
    }

    c(byte[] bArr, int i5, int i6) {
        super(bArr);
        if (i5 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.common.data.a.a(29, ProtectedSandApp.s("蘪"), i5));
        }
        if (i6 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.common.data.a.a(29, ProtectedSandApp.s("蘩"), i5));
        }
        if (i5 + i6 <= bArr.length) {
            this.f25687s = i5;
            this.f25688t = i6;
            return;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append(ProtectedSandApp.s("蘧"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("蘨"));
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public byte J(int i5) {
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(com.google.android.gms.common.data.a.a(28, ProtectedSandApp.s("蘭"), i5));
        }
        if (i5 < size()) {
            return this.f25756q[this.f25687s + i5];
        }
        int size = size();
        StringBuilder sb = new StringBuilder(41);
        sb.append(ProtectedSandApp.s("蘫"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("蘬"));
        sb.append(size);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    protected int L() {
        return this.f25687s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void q(byte[] bArr, int i5, int i6, int i7) {
        System.arraycopy(this.f25756q, L() + i5, bArr, i6, i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f25688t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: u */
    public d.a iterator() {
        return new b();
    }
}
