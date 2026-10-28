package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12136a = 16384;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f12137b = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f12141a;

        /* renamed from: b, reason: collision with root package name */
        final int f12142b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f12143c;

        b(@o0 byte[] bArr, int i5, int i6) {
            this.f12143c = bArr;
            this.f12141a = i5;
            this.f12142b = i6;
        }
    }

    private a() {
    }

    @o0
    public static ByteBuffer a(@o0 File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException(ProtectedSandApp.s("ȣ"));
            }
            if (length == 0) {
                throw new IOException(ProtectedSandApp.s("Ȣ"));
            }
            randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("ȡ"));
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @o0
    public static ByteBuffer b(@o0 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f12137b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                f12137b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }

    @q0
    private static b c(@o0 ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    @o0
    public static byte[] d(@o0 ByteBuffer byteBuffer) {
        b c6 = c(byteBuffer);
        if (c6 != null && c6.f12141a == 0 && c6.f12142b == c6.f12143c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void e(@o0 ByteBuffer byteBuffer, @o0 File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("Ȥ"));
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @o0
    public static InputStream f(@o0 ByteBuffer byteBuffer) {
        return new C0154a(byteBuffer);
    }

    public static void g(@o0 ByteBuffer byteBuffer, @o0 OutputStream outputStream) throws IOException {
        b c6 = c(byteBuffer);
        if (c6 != null) {
            byte[] bArr = c6.f12143c;
            int i5 = c6.f12141a;
            outputStream.write(bArr, i5, c6.f12142b + i5);
            return;
        }
        byte[] andSet = f12137b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, min);
            outputStream.write(andSet, 0, min);
        }
        f12137b.set(andSet);
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    private static class C0154a extends InputStream {

        /* renamed from: q, reason: collision with root package name */
        private static final int f12138q = -1;

        /* renamed from: o, reason: collision with root package name */
        @o0
        private final ByteBuffer f12139o;

        /* renamed from: p, reason: collision with root package name */
        private int f12140p = -1;

        C0154a(@o0 ByteBuffer byteBuffer) {
            this.f12139o = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f12139o.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i5) {
            this.f12140p = this.f12139o.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f12139o.hasRemaining()) {
                return this.f12139o.get() & UByte.f27220r;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i5 = this.f12140p;
            if (i5 == -1) {
                throw new IOException(ProtectedSandApp.s("Ƞ"));
            }
            this.f12139o.position(i5);
        }

        @Override // java.io.InputStream
        public long skip(long j5) throws IOException {
            if (!this.f12139o.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j5, available());
            this.f12139o.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(@o0 byte[] bArr, int i5, int i6) throws IOException {
            if (!this.f12139o.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i6, available());
            this.f12139o.get(bArr, i5, min);
            return min;
        }
    }
}
