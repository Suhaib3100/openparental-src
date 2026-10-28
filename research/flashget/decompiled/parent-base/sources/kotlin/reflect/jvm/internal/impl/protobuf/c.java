package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: BoundedByteString.java */
/* loaded from: classes7.dex */
class c extends n {

    /* renamed from: f, reason: collision with root package name */
    private final int f77669f;

    /* renamed from: g, reason: collision with root package name */
    private final int f77670g;

    /* compiled from: BoundedByteString.java */
    private class b implements d.a {

        /* renamed from: b, reason: collision with root package name */
        private int f77671b;

        /* renamed from: c, reason: collision with root package name */
        private final int f77672c;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(q());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77671b < this.f77672c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte q() {
            int i4 = this.f77671b;
            if (i4 >= this.f77672c) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f77738d;
            this.f77671b = i4 + 1;
            return bArr[i4];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int P = c.this.P();
            this.f77671b = P;
            this.f77672c = P + c.this.size();
        }
    }

    c(byte[] bArr, int i4, int i5) {
        super(bArr);
        if (i4 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(29, ProtectedSandApp.s("盄\u0001"), i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(29, ProtectedSandApp.s("盃\u0001"), i4));
        }
        if (i4 + i5 <= bArr.length) {
            this.f77669f = i4;
            this.f77670g = i5;
            return;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append(ProtectedSandApp.s("盁\u0001"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("盂\u0001"));
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public byte L(int i4) {
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(28, ProtectedSandApp.s("盇\u0001"), i4));
        }
        if (i4 < size()) {
            return this.f77738d[this.f77669f + i4];
        }
        int size = size();
        StringBuilder sb = new StringBuilder(41);
        sb.append(ProtectedSandApp.s("盅\u0001"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("盆\u0001"));
        sb.append(size);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    protected int P() {
        return this.f77669f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void m(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.f77738d, P() + i4, bArr, i5, i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: s */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f77670g;
    }
}
