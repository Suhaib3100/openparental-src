package android.content.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: ByteBufferWriter.java */
/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7516a = 1024;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7517b = 16384;

    /* renamed from: c, reason: collision with root package name */
    private static final float f7518c = 0.5f;

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f7519d = new ThreadLocal<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Class<?> f7520e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f7521f;

    static {
        Class<?> f6 = f("java.io.FileOutputStream");
        f7520e = f6;
        f7521f = c(f6);
    }

    private t() {
    }

    static void a() {
        f7519d.set(null);
    }

    private static byte[] b() {
        SoftReference<byte[]> softReference = f7519d.get();
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
            if (m4.S()) {
                return m4.W(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] d(int i5) {
        int max = Math.max(i5, 1024);
        byte[] b6 = b();
        if (b6 == null || e(max, b6.length)) {
            b6 = new byte[max];
            if (max <= 16384) {
                g(b6);
            }
        }
        return b6;
    }

    private static boolean e(int i5, int i6) {
        return i6 < i5 && ((float) i6) < ((float) i5) * 0.5f;
    }

    private static Class<?> f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void g(byte[] bArr) {
        f7519d.set(new SoftReference<>(bArr));
    }

    static void h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!i(byteBuffer, outputStream)) {
                byte[] d6 = d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), d6.length);
                    byteBuffer.get(d6, 0, min);
                    outputStream.write(d6, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    private static boolean i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j5 = f7521f;
        if (j5 < 0 || !f7520e.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) m4.O(outputStream, j5);
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
