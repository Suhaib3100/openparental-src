package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: LittleEndianByteArray.java */
@k
/* loaded from: classes6.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final c f57042a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f57043b = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LittleEndianByteArray.java */
    private static abstract class b implements c {
        public static final b INSTANCE = new a(ProtectedSandApp.s("\uf64d"), 0);
        private static final /* synthetic */ b[] $VALUES = $values();

        /* compiled from: LittleEndianByteArray.java */
        enum a extends b {
            a(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.hash.x.c
            public long getLongLittleEndian(byte[] bArr, int i4) {
                return com.google.common.primitives.n.j(bArr[i4 + 7], bArr[i4 + 6], bArr[i4 + 5], bArr[i4 + 4], bArr[i4 + 3], bArr[i4 + 2], bArr[i4 + 1], bArr[i4]);
            }

            @Override // com.google.common.hash.x.c
            public void putLongLittleEndian(byte[] bArr, int i4, long j4) {
                long j5 = 255;
                for (int i5 = 0; i5 < 8; i5++) {
                    bArr[i4 + i5] = (byte) ((j4 & j5) >> (i5 * 8));
                    j5 <<= 8;
                }
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{INSTANCE};
        }

        private b(String str, int i4) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: LittleEndianByteArray.java */
    private interface c {
        long getLongLittleEndian(byte[] bArr, int i4);

        void putLongLittleEndian(byte[] bArr, int i4, long j4);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LittleEndianByteArray.java */
    private static abstract class d implements c {
        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final Unsafe theUnsafe;
        public static final d UNSAFE_LITTLE_ENDIAN = new a(ProtectedSandApp.s("\uf64e"), 0);
        public static final d UNSAFE_BIG_ENDIAN = new b(ProtectedSandApp.s("\uf64f"), 1);
        private static final /* synthetic */ d[] $VALUES = $values();

        /* compiled from: LittleEndianByteArray.java */
        enum a extends d {
            a(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.hash.x.c
            public long getLongLittleEndian(byte[] bArr, int i4) {
                return d.theUnsafe.getLong(bArr, i4 + d.BYTE_ARRAY_BASE_OFFSET);
            }

            @Override // com.google.common.hash.x.c
            public void putLongLittleEndian(byte[] bArr, int i4, long j4) {
                d.theUnsafe.putLong(bArr, i4 + d.BYTE_ARRAY_BASE_OFFSET, j4);
            }
        }

        /* compiled from: LittleEndianByteArray.java */
        enum b extends d {
            b(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.hash.x.c
            public long getLongLittleEndian(byte[] bArr, int i4) {
                return Long.reverseBytes(d.theUnsafe.getLong(bArr, i4 + d.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.x.c
            public void putLongLittleEndian(byte[] bArr, int i4, long j4) {
                d.theUnsafe.putLong(bArr, i4 + d.BYTE_ARRAY_BASE_OFFSET, Long.reverseBytes(j4));
            }
        }

        /* compiled from: LittleEndianByteArray.java */
        class c implements PrivilegedExceptionAction<Unsafe> {
            c() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError(ProtectedSandApp.s("\uf651"));
            }
        }

        private static /* synthetic */ d[] $values() {
            return new d[]{UNSAFE_LITTLE_ENDIAN, UNSAFE_BIG_ENDIAN};
        }

        static {
            Unsafe unsafe = getUnsafe();
            theUnsafe = unsafe;
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private d(String str, int i4) {
        }

        private static Unsafe getUnsafe() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e4) {
                    throw new RuntimeException(ProtectedSandApp.s("\uf650"), e4.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new c());
            }
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    static {
        c cVar = b.INSTANCE;
        try {
            if (ProtectedSandApp.s("\uf653").equals(System.getProperty(ProtectedSandApp.s("\uf652")))) {
                cVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? d.UNSAFE_LITTLE_ENDIAN : d.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f57042a = cVar;
    }

    private x() {
    }

    static int a(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    static long b(byte[] bArr, int i4) {
        return f57042a.getLongLittleEndian(bArr, i4);
    }

    static long c(byte[] bArr, int i4, int i5) {
        long j4 = 0;
        for (int i6 = 0; i6 < Math.min(i5, 8); i6++) {
            j4 |= (bArr[i4 + i6] & 255) << (i6 * 8);
        }
        return j4;
    }

    static void d(byte[] bArr, int i4, long j4) {
        f57042a.putLongLittleEndian(bArr, i4, j4);
    }

    static boolean e() {
        return f57042a instanceof d;
    }
}
