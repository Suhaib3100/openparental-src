package androidx.content.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: IterableByteBufferInputStream.java */
/* loaded from: classes3.dex */
class q1 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private Iterator<ByteBuffer> f28915b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer f28916c;

    /* renamed from: d, reason: collision with root package name */
    private int f28917d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f28918e;

    /* renamed from: f, reason: collision with root package name */
    private int f28919f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28920g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f28921h;

    /* renamed from: i, reason: collision with root package name */
    private int f28922i;

    /* renamed from: j, reason: collision with root package name */
    private long f28923j;

    q1(Iterable<ByteBuffer> iterable) {
        this.f28915b = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f28917d++;
        }
        this.f28918e = -1;
        if (a()) {
            return;
        }
        this.f28916c = p1.f28851e;
        this.f28918e = 0;
        this.f28919f = 0;
        this.f28923j = 0L;
    }

    private boolean a() {
        this.f28918e++;
        if (!this.f28915b.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f28915b.next();
        this.f28916c = next;
        this.f28919f = next.position();
        if (this.f28916c.hasArray()) {
            this.f28920g = true;
            this.f28921h = this.f28916c.array();
            this.f28922i = this.f28916c.arrayOffset();
        } else {
            this.f28920g = false;
            this.f28923j = p4.i(this.f28916c);
            this.f28921h = null;
        }
        return true;
    }

    private void b(int i4) {
        int i5 = this.f28919f + i4;
        this.f28919f = i5;
        if (i5 == this.f28916c.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f28918e == this.f28917d) {
            return -1;
        }
        if (this.f28920g) {
            int i4 = this.f28921h[this.f28919f + this.f28922i] & 255;
            b(1);
            return i4;
        }
        int y4 = p4.y(this.f28919f + this.f28923j) & 255;
        b(1);
        return y4;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (this.f28918e == this.f28917d) {
            return -1;
        }
        int limit = this.f28916c.limit();
        int i6 = this.f28919f;
        int i7 = limit - i6;
        if (i5 > i7) {
            i5 = i7;
        }
        if (this.f28920g) {
            System.arraycopy(this.f28921h, i6 + this.f28922i, bArr, i4, i5);
            b(i5);
        } else {
            int position = this.f28916c.position();
            this.f28916c.position(this.f28919f);
            this.f28916c.get(bArr, i4, i5);
            this.f28916c.position(position);
            b(i5);
        }
        return i5;
    }
}
