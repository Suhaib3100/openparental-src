package android.content.preferences.protobuf;

import android.content.preferences.protobuf.w;
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
import kotlin.UByte;

/* compiled from: NioByteString.java */
/* loaded from: classes3.dex */
final class u2 extends w.i {

    /* renamed from: w, reason: collision with root package name */
    private final ByteBuffer f7530w;

    u2(ByteBuffer byteBuffer) {
        o1.e(byteBuffer, "buffer");
        this.f7530w = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void C0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer D0(int i5, int i6) {
        if (i5 < this.f7530w.position() || i6 > this.f7530w.limit() || i5 > i6) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        ByteBuffer slice = this.f7530w.slice();
        slice.position(i5 - this.f7530w.position());
        slice.limit(i6 - this.f7530w.position());
        return slice;
    }

    private Object E0() {
        return w.u(this.f7530w.slice());
    }

    @Override // android.content.preferences.protobuf.w
    public void A(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f7530w.slice());
    }

    @Override // android.content.preferences.protobuf.w
    protected void E(byte[] bArr, int i5, int i6, int i7) {
        ByteBuffer slice = this.f7530w.slice();
        slice.position(i5);
        slice.get(bArr, i6, i7);
    }

    @Override // android.content.preferences.protobuf.w
    public byte J(int i5) {
        return i(i5);
    }

    @Override // android.content.preferences.protobuf.w
    public boolean L() {
        return n4.s(this.f7530w);
    }

    @Override // android.content.preferences.protobuf.w
    public z O() {
        return z.o(this.f7530w, true);
    }

    @Override // android.content.preferences.protobuf.w
    public InputStream P() {
        return new a();
    }

    @Override // android.content.preferences.protobuf.w
    protected int S(int i5, int i6, int i7) {
        for (int i8 = i6; i8 < i6 + i7; i8++) {
            i5 = (i5 * 31) + this.f7530w.get(i8);
        }
        return i5;
    }

    @Override // android.content.preferences.protobuf.w
    protected int T(int i5, int i6, int i7) {
        return n4.v(i5, this.f7530w, i6, i7 + i6);
    }

    @Override // android.content.preferences.protobuf.w
    public w c0(int i5, int i6) {
        try {
            return new u2(D0(i5, i6));
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw e6;
        } catch (IndexOutOfBoundsException e7) {
            throw new ArrayIndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // android.content.preferences.protobuf.w
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (size() != wVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof u2 ? this.f7530w.equals(((u2) obj).f7530w) : obj instanceof i3 ? obj.equals(this) : this.f7530w.equals(wVar.f());
    }

    @Override // android.content.preferences.protobuf.w
    public ByteBuffer f() {
        return this.f7530w.asReadOnlyBuffer();
    }

    @Override // android.content.preferences.protobuf.w
    public List<ByteBuffer> g() {
        return Collections.singletonList(f());
    }

    @Override // android.content.preferences.protobuf.w
    public byte i(int i5) {
        try {
            return this.f7530w.get(i5);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw e6;
        } catch (IndexOutOfBoundsException e7) {
            throw new ArrayIndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // android.content.preferences.protobuf.w
    protected String n0(Charset charset) {
        byte[] f02;
        int length;
        int i5;
        if (this.f7530w.hasArray()) {
            f02 = this.f7530w.array();
            i5 = this.f7530w.position() + this.f7530w.arrayOffset();
            length = this.f7530w.remaining();
        } else {
            f02 = f0();
            length = f02.length;
            i5 = 0;
        }
        return new String(f02, i5, length, charset);
    }

    @Override // android.content.preferences.protobuf.w
    public int size() {
        return this.f7530w.remaining();
    }

    @Override // android.content.preferences.protobuf.w
    void u0(u uVar) throws IOException {
        uVar.W(this.f7530w.slice());
    }

    @Override // android.content.preferences.protobuf.w
    public void v0(OutputStream outputStream) throws IOException {
        outputStream.write(f0());
    }

    @Override // android.content.preferences.protobuf.w
    void x0(OutputStream outputStream, int i5, int i6) throws IOException {
        if (!this.f7530w.hasArray()) {
            t.h(D0(i5, i6 + i5), outputStream);
            return;
        }
        outputStream.write(this.f7530w.array(), this.f7530w.position() + this.f7530w.arrayOffset() + i5, i6);
    }

    @Override // androidx.datastore.preferences.protobuf.w.i
    boolean z0(w wVar, int i5, int i6) {
        return c0(0, i6).equals(wVar.c0(i5, i6 + i5));
    }

    /* compiled from: NioByteString.java */
    /* loaded from: classes.dex */
    class a extends InputStream {

        /* renamed from: o, reason: collision with root package name */
        private final ByteBuffer f7531o;

        a() {
            this.f7531o = u2.this.f7530w.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f7531o.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i5) {
            this.f7531o.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f7531o.hasRemaining()) {
                return this.f7531o.get() & UByte.f27220r;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f7531o.reset();
            } catch (InvalidMarkException e6) {
                throw new IOException(e6);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) throws IOException {
            if (!this.f7531o.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i6, this.f7531o.remaining());
            this.f7531o.get(bArr, i5, min);
            return min;
        }
    }
}
