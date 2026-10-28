package androidx.content.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: ByteBufferWriter.java */
/* loaded from: classes3.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28979a = 1024;

    /* renamed from: b, reason: collision with root package name */
    private static final int f28980b = 16384;

    /* renamed from: c, reason: collision with root package name */
    private static final float f28981c = 0.5f;

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f28982d = new ThreadLocal<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Class<?> f28983e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f28984f;

    static {
        Class<?> f4 = f("java.io.FileOutputStream");
        f28983e = f4;
        f28984f = c(f4);
    }

    private u() {
    }

    static void a() {
        f28982d.set(null);
    }

    private static byte[] b() {
        SoftReference<byte[]> softReference = f28982d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static long c(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (p4.S()) {
                return p4.W(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] d(int i4) {
        int max = Math.max(i4, 1024);
        byte[] b5 = b();
        if (b5 == null || e(max, b5.length)) {
            b5 = new byte[max];
            if (max <= 16384) {
                g(b5);
            }
        }
        return b5;
    }

    private static boolean e(int i4, int i5) {
        return i5 < i4 && ((float) i5) < ((float) i4) * 0.5f;
    }

    private static Class<?> f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void g(byte[] bArr) {
        f28982d.set(new SoftReference<>(bArr));
    }

    static void h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!i(byteBuffer, outputStream)) {
                byte[] d5 = d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), d5.length);
                    byteBuffer.get(d5, 0, min);
                    outputStream.write(d5, 0, min);
                }
            }
            byteBuffer.position(position);
        } catch (Throwable th) {
            byteBuffer.position(position);
            throw th;
        }
    }

    private static boolean i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j4 = f28984f;
        if (j4 < 0 || !f28983e.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) p4.O(outputStream, j4);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
