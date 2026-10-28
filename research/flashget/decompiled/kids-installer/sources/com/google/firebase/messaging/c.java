package com.google.firebase.messaging;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: ByteStreams.java */
/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17127a = 8192;

    /* renamed from: b, reason: collision with root package name */
    private static final int f17128b = 2147483639;

    /* renamed from: c, reason: collision with root package name */
    private static final int f17129c = 20;

    private c() {
    }

    private static byte[] a(Queue<byte[]> queue, int i5) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i5) {
            return remove;
        }
        int length = i5 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i5);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i5 - length, min);
            length -= min;
        }
        return copyOf;
    }

    static byte[] b() {
        return new byte[8192];
    }

    public static InputStream c(InputStream inputStream, long j5) {
        return new a(inputStream, j5);
    }

    private static int d(long j5) {
        if (j5 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j5 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j5;
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        return f(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] f(InputStream inputStream, Queue<byte[]> queue, int i5) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i5) * 2));
        while (i5 < f17128b) {
            int min2 = Math.min(min, f17128b - i5);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i6 = 0;
            while (i6 < min2) {
                int read = inputStream.read(bArr, i6, min2 - i6);
                if (read == -1) {
                    return a(queue, i5);
                }
                i6 += read;
                i5 += read;
            }
            min = d(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(queue, f17128b);
        }
        throw new OutOfMemoryError(ProtectedSandApp.s("ᜳ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteStreams.java */
    static final class a extends FilterInputStream {

        /* renamed from: o, reason: collision with root package name */
        private long f17130o;

        /* renamed from: p, reason: collision with root package name */
        private long f17131p;

        a(InputStream inputStream, long j5) {
            super(inputStream);
            this.f17131p = -1L;
            this.f17130o = j5;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f17130o);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i5) {
            ((FilterInputStream) this).in.mark(i5);
            this.f17131p = this.f17130o;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f17130o == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f17130o--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException(ProtectedSandApp.s("ᜬ"));
            }
            if (this.f17131p == -1) {
                throw new IOException(ProtectedSandApp.s("ᜫ"));
            }
            ((FilterInputStream) this).in.reset();
            this.f17130o = this.f17131p;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j5) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j5, this.f17130o));
            this.f17130o -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) throws IOException {
            long j5 = this.f17130o;
            if (j5 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i5, (int) Math.min(i6, j5));
            if (read != -1) {
                this.f17130o -= read;
            }
            return read;
        }
    }
}
