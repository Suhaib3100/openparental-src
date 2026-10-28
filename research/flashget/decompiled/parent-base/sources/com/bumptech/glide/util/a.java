package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f44942a = 16384;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f44943b = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f44947a;

        /* renamed from: b, reason: collision with root package name */
        final int f44948b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f44949c;

        b(@o0 byte[] bArr, int i4, int i5) {
            this.f44949c = bArr;
            this.f44947a = i4;
            this.f44948b = i5;
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
                throw new IOException(ProtectedSandApp.s("ગ"));
            }
            if (length == 0) {
                throw new IOException(ProtectedSandApp.s("ખ"));
            }
            randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("ક"));
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
        byte[] andSet = f44943b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                f44943b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
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

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @o0
    public static byte[] e(@o0 ByteBuffer byteBuffer) {
        b c5 = c(byteBuffer);
        if (c5 != null && c5.f44947a == 0 && c5.f44948b == c5.f44949c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(@o0 ByteBuffer byteBuffer, @o0 File file) throws IOException {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("ઘ"));
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
    public static InputStream g(@o0 ByteBuffer byteBuffer) {
        return new C0755a(byteBuffer);
    }

    public static void h(@o0 ByteBuffer byteBuffer, @o0 OutputStream outputStream) throws IOException {
        b c5 = c(byteBuffer);
        if (c5 != null) {
            byte[] bArr = c5.f44949c;
            int i4 = c5.f44947a;
            outputStream.write(bArr, i4, c5.f44948b + i4);
            return;
        }
        byte[] andSet = f44943b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, min);
            outputStream.write(andSet, 0, min);
        }
        f44943b.set(andSet);
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    private static class C0755a extends InputStream {

        /* renamed from: d, reason: collision with root package name */
        private static final int f44944d = -1;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final ByteBuffer f44945b;

        /* renamed from: c, reason: collision with root package name */
        private int f44946c = -1;

        C0755a(@o0 ByteBuffer byteBuffer) {
            this.f44945b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f44945b.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i4) {
            this.f44946c = this.f44945b.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f44945b.hasRemaining()) {
                return this.f44945b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i4 = this.f44946c;
            if (i4 == -1) {
                throw new IOException(ProtectedSandApp.s("ઔ"));
            }
            this.f44945b.position(i4);
        }

        @Override // java.io.InputStream
        public long skip(long j4) {
            if (!this.f44945b.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j4, available());
            this.f44945b.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(@o0 byte[] bArr, int i4, int i5) {
            if (!this.f44945b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i5, available());
            this.f44945b.get(bArr, i4, min);
            return min;
        }
    }
}
