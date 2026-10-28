package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import okio.r0;

/* compiled from: Utf8.java */
/* loaded from: classes3.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static w f29391a;

    /* compiled from: Utf8.java */
    static class a {
        a() {
        }

        static void a(byte b5, byte b6, byte b7, byte b10, char[] cArr, int i4) throws IllegalArgumentException {
            if (!f(b6)) {
                if ((((b6 + 112) + (b5 << com.google.common.base.c.F)) >> 30) == 0 && !f(b7) && !f(b10)) {
                    int i5 = ((b5 & 7) << 18) | ((b6 & r0.f85265a) << 12) | ((b7 & r0.f85265a) << 6) | (b10 & r0.f85265a);
                    cArr[i4] = e(i5);
                    cArr[i4 + 1] = j(i5);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        static void b(byte b5, char[] cArr, int i4) {
            cArr[i4] = (char) b5;
        }

        static void c(byte b5, byte b6, byte b7, char[] cArr, int i4) throws IllegalArgumentException {
            if (f(b6) || ((b5 == -32 && b6 < -96) || ((b5 == -19 && b6 >= -96) || f(b7)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i4] = (char) (((b5 & com.google.common.base.c.f54871q) << 12) | ((b6 & r0.f85265a) << 6) | (b7 & r0.f85265a));
        }

        static void d(byte b5, byte b6, char[] cArr, int i4) throws IllegalArgumentException {
            if (b5 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (f(b6)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i4] = (char) (((b5 & com.google.common.base.c.I) << 6) | (b6 & r0.f85265a));
        }

        private static char e(int i4) {
            return (char) ((i4 >>> 10) + r0.f85268d);
        }

        private static boolean f(byte b5) {
            return b5 > -65;
        }

        static boolean g(byte b5) {
            return b5 >= 0;
        }

        static boolean h(byte b5) {
            return b5 < -16;
        }

        static boolean i(byte b5) {
            return b5 < -32;
        }

        private static char j(int i4) {
            return (char) ((i4 & 1023) + r0.f85269e);
        }

        private static int k(byte b5) {
            return b5 & r0.f85265a;
        }
    }

    /* compiled from: Utf8.java */
    static class b extends IllegalArgumentException {
        b(int i4, int i5) {
            super(androidx.compose.foundation.text.q.a("Unpaired surrogate at index ", i4, " of ", i5));
        }
    }

    public static w d() {
        if (f29391a == null) {
            f29391a = new a0();
        }
        return f29391a;
    }

    public static void e(w wVar) {
        f29391a = wVar;
    }

    public abstract String a(ByteBuffer byteBuffer, int i4, int i5);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}
