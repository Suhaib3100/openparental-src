package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: NioByteString.java */
/* loaded from: classes3.dex */
final class x2 extends w.i {

    /* renamed from: j, reason: collision with root package name */
    private final ByteBuffer f29055j;

    x2(ByteBuffer byteBuffer) {
        p1.e(byteBuffer, "buffer");
        this.f29055j = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void D0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer E0(int i4, int i5) {
        if (i4 < this.f29055j.position() || i5 > this.f29055j.limit() || i4 > i5) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        ByteBuffer slice = this.f29055j.slice();
        slice.position(i4 - this.f29055j.position());
        slice.limit(i5 - this.f29055j.position());
        return slice;
    }

    private Object F0() {
        return w.s(this.f29055j.slice());
    }

    @Override // androidx.content.preferences.protobuf.w
    public void D(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f29055j.slice());
    }

    @Override // androidx.content.preferences.protobuf.w
    protected void H(byte[] bArr, int i4, int i5, int i6) {
        ByteBuffer slice = this.f29055j.slice();
        slice.position(i4);
        slice.get(bArr, i5, i6);
    }

    @Override // androidx.content.preferences.protobuf.w
    public byte L(int i4) {
        return i(i4);
    }

    @Override // androidx.content.preferences.protobuf.w
    public boolean P() {
        return q4.s(this.f29055j);
    }

    @Override // androidx.content.preferences.protobuf.w
    public z S() {
        return z.o(this.f29055j, true);
    }

    @Override // androidx.content.preferences.protobuf.w
    public InputStream T() {
        return new a();
    }

    @Override // androidx.content.preferences.protobuf.w
    protected int W(int i4, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + this.f29055j.get(i7);
        }
        return i4;
    }

    @Override // androidx.content.preferences.protobuf.w
    protected int X(int i4, int i5, int i6) {
        return q4.v(i4, this.f29055j, i5, i6 + i5);
    }

    @Override // androidx.content.preferences.protobuf.w
    public ByteBuffer c() {
        return this.f29055j.asReadOnlyBuffer();
    }

    @Override // androidx.content.preferences.protobuf.w
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f29055j.remaining() != wVar.size()) {
            return false;
        }
        if (this.f29055j.remaining() == 0) {
            return true;
        }
        return obj instanceof x2 ? this.f29055j.equals(((x2) obj).f29055j) : obj instanceof l3 ? obj.equals(this) : this.f29055j.equals(wVar.c());
    }

    @Override // androidx.content.preferences.protobuf.w
    public List<ByteBuffer> f() {
        return Collections.singletonList(this.f29055j.asReadOnlyBuffer());
    }

    @Override // androidx.content.preferences.protobuf.w
    public w h0(int i4, int i5) {
        try {
            return new x2(E0(i4, i5));
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e5) {
            throw new ArrayIndexOutOfBoundsException(e5.getMessage());
        }
    }

    @Override // androidx.content.preferences.protobuf.w
    public byte i(int i4) {
        try {
            return this.f29055j.get(i4);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e5) {
            throw new ArrayIndexOutOfBoundsException(e5.getMessage());
        }
    }

    @Override // androidx.content.preferences.protobuf.w
    protected String m0(Charset charset) {
        byte[] i02;
        int length;
        int i4;
        if (this.f29055j.hasArray()) {
            i02 = this.f29055j.array();
            i4 = this.f29055j.position() + this.f29055j.arrayOffset();
            length = this.f29055j.remaining();
        } else {
            i02 = i0();
            length = i02.length;
            i4 = 0;
        }
        return new String(i02, i4, length, charset);
    }

    @Override // androidx.content.preferences.protobuf.w
    public int size() {
        return this.f29055j.remaining();
    }

    @Override // androidx.content.preferences.protobuf.w
    void t0(v vVar) throws IOException {
        vVar.W(this.f29055j.slice());
    }

    @Override // androidx.content.preferences.protobuf.w
    public void u0(OutputStream outputStream) throws IOException {
        outputStream.write(i0());
    }

    @Override // androidx.content.preferences.protobuf.w
    void w0(OutputStream outputStream, int i4, int i5) throws IOException {
        if (!this.f29055j.hasArray()) {
            u.h(E0(i4, i5 + i4), outputStream);
            return;
        }
        outputStream.write(this.f29055j.array(), this.f29055j.position() + this.f29055j.arrayOffset() + i4, i5);
    }

    @Override // androidx.datastore.preferences.protobuf.w.i
    boolean y0(w wVar, int i4, int i5) {
        return h0(0, i5).equals(wVar.h0(i4, i5 + i4));
    }

    /* compiled from: NioByteString.java */
    class a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        private final ByteBuffer f29056b;

        a() {
            this.f29056b = x2.this.f29055j.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f29056b.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i4) {
            this.f29056b.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f29056b.hasRemaining()) {
                return this.f29056b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f29056b.reset();
            } catch (InvalidMarkException e4) {
                throw new IOException(e4);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            if (!this.f29056b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i5, this.f29056b.remaining());
            this.f29056b.get(bArr, i4, min);
            return min;
        }
    }
}
