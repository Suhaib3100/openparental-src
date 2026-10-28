package com.google.firebase.messaging;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: ByteStreams.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f59993a = 8192;

    /* renamed from: b, reason: collision with root package name */
    private static final int f59994b = 2147483639;

    /* renamed from: c, reason: collision with root package name */
    private static final int f59995c = 20;

    private c() {
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

    static byte[] b() {
        return new byte[8192];
    }

    public static InputStream c(InputStream inputStream, long j4) {
        return new a(inputStream, j4);
    }

    private static int d(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        return f(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] f(InputStream inputStream, Queue<byte[]> queue, int i4) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i4) * 2));
        while (i4 < f59994b) {
            int min2 = Math.min(min, f59994b - i4);
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
            min = d(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(queue, f59994b);
        }
        throw new OutOfMemoryError(ProtectedSandApp.s("ƴ\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteStreams.java */
    static final class a extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        private long f59996b;

        /* renamed from: c, reason: collision with root package name */
        private long f59997c;

        a(InputStream inputStream, long j4) {
            super(inputStream);
            this.f59997c = -1L;
            this.f59996b = j4;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f59996b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i4) {
            ((FilterInputStream) this).in.mark(i4);
            this.f59997c = this.f59996b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f59996b == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f59996b--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException(ProtectedSandApp.s("Ƭ\u0001"));
            }
            if (this.f59997c == -1) {
                throw new IOException(ProtectedSandApp.s("ƫ\u0001"));
            }
            ((FilterInputStream) this).in.reset();
            this.f59996b = this.f59997c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j4) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j4, this.f59996b));
            this.f59996b -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            long j4 = this.f59996b;
            if (j4 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i4, (int) Math.min(i5, j4));
            if (read != -1) {
                this.f59996b -= read;
            }
            return read;
        }
    }
}
