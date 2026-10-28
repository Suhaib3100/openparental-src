package com.google.common.io;

import android.support.v4.media.session.PlaybackStateCompat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: ByteStreams.java */
@p
@d9.c
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f57119a = 8192;

    /* renamed from: b, reason: collision with root package name */
    private static final int f57120b = 524288;

    /* renamed from: c, reason: collision with root package name */
    private static final int f57121c = 2147483639;

    /* renamed from: d, reason: collision with root package name */
    private static final int f57122d = 20;

    /* renamed from: e, reason: collision with root package name */
    private static final OutputStream f57123e = new a();

    /* compiled from: ByteStreams.java */
    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return ProtectedSandApp.s("\uf699");
        }

        @Override // java.io.OutputStream
        public void write(int i4) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            bArr.getClass();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) {
            bArr.getClass();
            l0.f0(i4, i5 + i4, bArr.length);
        }
    }

    private g() {
    }

    private static byte[] a(Queue<byte[]> queue, int i4) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i4) {
            return remove;
        }
        int length = i4 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i4);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i4 - length, min);
            length -= min;
        }
        return copyOf;
    }

    @f9.a
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j4 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j4;
            }
            outputStream.write(bArr, 0, read);
            j4 += read;
        }
    }

    @f9.a
    public static long c(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        readableByteChannel.getClass();
        writableByteChannel.getClass();
        long j4 = 0;
        if (!(readableByteChannel instanceof FileChannel)) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[8192]);
            while (readableByteChannel.read(wrap) != -1) {
                wrap.flip();
                while (wrap.hasRemaining()) {
                    j4 += writableByteChannel.write(wrap);
                }
                wrap.clear();
            }
            return j4;
        }
        FileChannel fileChannel = (FileChannel) readableByteChannel;
        long position = fileChannel.position();
        long j5 = position;
        while (true) {
            long transferTo = fileChannel.transferTo(j5, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, writableByteChannel);
            j5 += transferTo;
            fileChannel.position(j5);
            if (transferTo <= 0 && j5 >= fileChannel.size()) {
                return j5 - position;
            }
        }
    }

    static byte[] d() {
        return new byte[8192];
    }

    @d9.a
    @f9.a
    public static long e(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j4 = 0;
        while (true) {
            long read = inputStream.read(bArr);
            if (read == -1) {
                return j4;
            }
            j4 += read;
        }
    }

    @d9.a
    public static InputStream f(InputStream inputStream, long j4) {
        return new d(inputStream, j4);
    }

    @d9.a
    public static com.google.common.io.b g(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.getClass();
        return new b(byteArrayInputStream);
    }

    @d9.a
    public static com.google.common.io.b h(byte[] bArr) {
        return g(new ByteArrayInputStream(bArr));
    }

    @d9.a
    public static com.google.common.io.b i(byte[] bArr, int i4) {
        l0.d0(i4, bArr.length);
        return g(new ByteArrayInputStream(bArr, i4, bArr.length - i4));
    }

    @d9.a
    public static com.google.common.io.c j() {
        return l(new ByteArrayOutputStream());
    }

    @d9.a
    public static com.google.common.io.c k(int i4) {
        if (i4 >= 0) {
            return l(new ByteArrayOutputStream(i4));
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\uf69d"), Integer.valueOf(i4)));
    }

    @d9.a
    public static com.google.common.io.c l(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.getClass();
        return new c(byteArrayOutputStream);
    }

    @d9.a
    public static OutputStream m() {
        return f57123e;
    }

    @d9.a
    @f9.a
    public static int n(InputStream inputStream, byte[] bArr, int i4, int i5) throws IOException {
        inputStream.getClass();
        bArr.getClass();
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(String.format(ProtectedSandApp.s("\uf69e"), Integer.valueOf(i5)));
        }
        l0.f0(i4, i4 + i5, bArr.length);
        int i6 = 0;
        while (i6 < i5) {
            int read = inputStream.read(bArr, i4 + i6, i5 - i6);
            if (read == -1) {
                break;
            }
            i6 += read;
        }
        return i6;
    }

    @f9.a
    @d9.a
    @c0
    public static <T> T o(InputStream inputStream, com.google.common.io.d<T> dVar) throws IOException {
        int read;
        inputStream.getClass();
        dVar.getClass();
        byte[] bArr = new byte[8192];
        do {
            read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
        } while (dVar.b(bArr, 0, read));
        return dVar.a();
    }

    @d9.a
    public static void p(InputStream inputStream, byte[] bArr) throws IOException {
        q(inputStream, bArr, 0, bArr.length);
    }

    @d9.a
    public static void q(InputStream inputStream, byte[] bArr, int i4, int i5) throws IOException {
        int n4 = n(inputStream, bArr, i4, i5);
        if (n4 == i5) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append(ProtectedSandApp.s("\uf69f"));
        sb.append(n4);
        sb.append(ProtectedSandApp.s("\uf6a0"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\uf6a1"));
        throw new EOFException(sb.toString());
    }

    @d9.a
    public static void r(InputStream inputStream, long j4) throws IOException {
        long t4 = t(inputStream, j4);
        if (t4 >= j4) {
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(ProtectedSandApp.s("\uf6a2"));
        sb.append(t4);
        sb.append(ProtectedSandApp.s("\uf6a0"));
        throw new EOFException(android.support.v4.media.session.b.a(sb, j4, ProtectedSandApp.s("\uf6a1")));
    }

    private static long s(InputStream inputStream, long j4) throws IOException {
        int available = inputStream.available();
        if (available == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(available, j4));
    }

    static long t(InputStream inputStream, long j4) throws IOException {
        byte[] bArr = null;
        long j5 = 0;
        while (j5 < j4) {
            long j6 = j4 - j5;
            long s4 = s(inputStream, j6);
            if (s4 == 0) {
                int min = (int) Math.min(j6, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                s4 = inputStream.read(bArr, 0, min);
                if (s4 == -1) {
                    break;
                }
            }
            j5 += s4;
        }
        return j5;
    }

    public static byte[] u(InputStream inputStream) throws IOException {
        inputStream.getClass();
        return w(inputStream, new ArrayDeque(20), 0);
    }

    static byte[] v(InputStream inputStream, long j4) throws IOException {
        l0.p(j4 >= 0, ProtectedSandApp.s("\uf6a3"), j4);
        if (j4 > 2147483639) {
            StringBuilder sb = new StringBuilder(62);
            sb.append(j4);
            sb.append(ProtectedSandApp.s("\uf6a4"));
            throw new OutOfMemoryError(sb.toString());
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        int i5 = i4;
        while (i5 > 0) {
            int i6 = i4 - i5;
            int read = inputStream.read(bArr, i6, i5);
            if (read == -1) {
                return Arrays.copyOf(bArr, i6);
            }
            i5 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) read2});
        return w(inputStream, arrayDeque, i4 + 1);
    }

    private static byte[] w(InputStream inputStream, Queue<byte[]> queue, int i4) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i4) * 2));
        while (i4 < f57121c) {
            int min2 = Math.min(min, f57121c - i4);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i5 = 0;
            while (i5 < min2) {
                int read = inputStream.read(bArr, i5, min2 - i5);
                if (read == -1) {
                    return a(queue, i4);
                }
                i5 += read;
                i4 += read;
            }
            min = com.google.common.math.f.u(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, f57121c);
        }
        throw new OutOfMemoryError(ProtectedSandApp.s("\uf6a5"));
    }

    /* compiled from: ByteStreams.java */
    private static class b implements com.google.common.io.b {

        /* renamed from: b, reason: collision with root package name */
        final DataInput f57124b;

        b(ByteArrayInputStream byteArrayInputStream) {
            this.f57124b = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f57124b.readBoolean();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public byte readByte() {
            try {
                return this.f57124b.readByte();
            } catch (EOFException e4) {
                throw new IllegalStateException(e4);
            } catch (IOException e5) {
                throw new AssertionError(e5);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public char readChar() {
            try {
                return this.f57124b.readChar();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public double readDouble() {
            try {
                return this.f57124b.readDouble();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public float readFloat() {
            try {
                return this.f57124b.readFloat();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.f57124b.readFully(bArr);
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int readInt() {
            try {
                return this.f57124b.readInt();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        @zc.a
        public String readLine() {
            try {
                return this.f57124b.readLine();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public long readLong() {
            try {
                return this.f57124b.readLong();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public short readShort() {
            try {
                return this.f57124b.readShort();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public String readUTF() {
            try {
                return this.f57124b.readUTF();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f57124b.readUnsignedByte();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f57124b.readUnsignedShort();
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int skipBytes(int i4) {
            try {
                return this.f57124b.skipBytes(i4);
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public void readFully(byte[] bArr, int i4, int i5) {
            try {
                this.f57124b.readFully(bArr, i4, i5);
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }
    }

    /* compiled from: ByteStreams.java */
    private static class c implements com.google.common.io.c {

        /* renamed from: b, reason: collision with root package name */
        final DataOutput f57125b;

        /* renamed from: c, reason: collision with root package name */
        final ByteArrayOutputStream f57126c;

        c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f57126c = byteArrayOutputStream;
            this.f57125b = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.c
        public byte[] m() {
            return this.f57126c.toByteArray();
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void write(int i4) {
            try {
                this.f57125b.write(i4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeBoolean(boolean z4) {
            try {
                this.f57125b.writeBoolean(z4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeByte(int i4) {
            try {
                this.f57125b.writeByte(i4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.f57125b.writeBytes(str);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeChar(int i4) {
            try {
                this.f57125b.writeChar(i4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.f57125b.writeChars(str);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeDouble(double d5) {
            try {
                this.f57125b.writeDouble(d5);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeFloat(float f4) {
            try {
                this.f57125b.writeFloat(f4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeInt(int i4) {
            try {
                this.f57125b.writeInt(i4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeLong(long j4) {
            try {
                this.f57125b.writeLong(j4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeShort(int i4) {
            try {
                this.f57125b.writeShort(i4);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.f57125b.writeUTF(str);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.f57125b.write(bArr);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void write(byte[] bArr, int i4, int i5) {
            try {
                this.f57125b.write(bArr, i4, i5);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    /* compiled from: ByteStreams.java */
    private static final class d extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        private long f57127b;

        /* renamed from: c, reason: collision with root package name */
        private long f57128c;

        d(InputStream inputStream, long j4) {
            super(inputStream);
            this.f57128c = -1L;
            inputStream.getClass();
            l0.e(j4 >= 0, ProtectedSandApp.s("\uf69a"));
            this.f57127b = j4;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f57127b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i4) {
            ((FilterInputStream) this).in.mark(i4);
            this.f57128c = this.f57127b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f57127b == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f57127b--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException(ProtectedSandApp.s("\uf69c"));
            }
            if (this.f57128c == -1) {
                throw new IOException(ProtectedSandApp.s("\uf69b"));
            }
            ((FilterInputStream) this).in.reset();
            this.f57127b = this.f57128c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j4) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j4, this.f57127b));
            this.f57127b -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            long j4 = this.f57127b;
            if (j4 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i4, (int) Math.min(i5, j4));
            if (read != -1) {
                this.f57127b -= read;
            }
            return read;
        }
    }
}
