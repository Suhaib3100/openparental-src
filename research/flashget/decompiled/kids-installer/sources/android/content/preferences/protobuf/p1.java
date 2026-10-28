package android.content.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* compiled from: IterableByteBufferInputStream.java */
/* loaded from: classes.dex */
class p1 extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private Iterator<ByteBuffer> f7459o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f7460p;

    /* renamed from: q, reason: collision with root package name */
    private int f7461q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f7462r;

    /* renamed from: s, reason: collision with root package name */
    private int f7463s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7464t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f7465u;

    /* renamed from: v, reason: collision with root package name */
    private int f7466v;

    /* renamed from: w, reason: collision with root package name */
    private long f7467w;

    p1(Iterable<ByteBuffer> iterable) {
        this.f7459o = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f7461q++;
        }
        this.f7462r = -1;
        if (a()) {
            return;
        }
        this.f7460p = o1.f7443e;
        this.f7462r = 0;
        this.f7463s = 0;
        this.f7467w = 0L;
    }

    private boolean a() {
        this.f7462r++;
        if (!this.f7459o.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f7459o.next();
        this.f7460p = next;
        this.f7463s = next.position();
        if (this.f7460p.hasArray()) {
            this.f7464t = true;
            this.f7465u = this.f7460p.array();
            this.f7466v = this.f7460p.arrayOffset();
        } else {
            this.f7464t = false;
            this.f7467w = m4.i(this.f7460p);
            this.f7465u = null;
        }
        return true;
    }

    private void b(int i5) {
        int i6 = this.f7463s + i5;
        this.f7463s = i6;
        if (i6 == this.f7460p.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f7462r == this.f7461q) {
            return -1;
        }
        if (this.f7464t) {
            int i5 = this.f7465u[this.f7463s + this.f7466v] & UByte.f27220r;
            b(1);
            return i5;
        }
        int y5 = m4.y(this.f7463s + this.f7467w) & UByte.f27220r;
        b(1);
        return y5;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        if (this.f7462r == this.f7461q) {
            return -1;
        }
        int limit = this.f7460p.limit();
        int i7 = this.f7463s;
        int i8 = limit - i7;
        if (i6 > i8) {
            i6 = i8;
        }
        if (this.f7464t) {
            System.arraycopy(this.f7465u, i7 + this.f7466v, bArr, i5, i6);
            b(i6);
        } else {
            int position = this.f7460p.position();
            this.f7460p.position(this.f7463s);
            this.f7460p.get(bArr, i5, i6);
            this.f7460p.position(position);
            b(i6);
        }
        return i6;
    }
}
