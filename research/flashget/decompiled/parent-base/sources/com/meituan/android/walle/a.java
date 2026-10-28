package com.meituan.android.walle;

import androidx.collection.n1;
import androidx.collection.p0;
import androidx.compose.foundation.text.q;
import androidx.compose.runtime.snapshots.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ApkUtil.java */
/* loaded from: classes6.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f69998a = 3617552046287187010L;

    /* renamed from: b, reason: collision with root package name */
    public static final long f69999b = 2334950737559900225L;

    /* renamed from: c, reason: collision with root package name */
    private static final int f70000c = 32;

    /* renamed from: d, reason: collision with root package name */
    public static final int f70001d = 1896449818;

    /* renamed from: e, reason: collision with root package name */
    public static final int f70002e = 1903654775;

    /* renamed from: f, reason: collision with root package name */
    public static final String f70003f = ProtectedSandApp.s("ᡜ\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final int f70004g = 22;

    /* renamed from: h, reason: collision with root package name */
    private static final int f70005h = 101010256;

    /* renamed from: i, reason: collision with root package name */
    private static final int f70006i = 65535;

    /* renamed from: j, reason: collision with root package name */
    private static final int f70007j = 20;

    private a() {
    }

    private static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᡉ\u0001"));
        }
    }

    public static e<ByteBuffer, Long> b(FileChannel fileChannel) throws IOException, SignatureNotFoundException {
        return c(fileChannel, d(fileChannel));
    }

    public static e<ByteBuffer, Long> c(FileChannel fileChannel, long j4) throws IOException, SignatureNotFoundException {
        if (j4 < 32) {
            throw new SignatureNotFoundException(p0.a(ProtectedSandApp.s("ᡏ\u0001"), j4));
        }
        fileChannel.position(j4 - 24);
        ByteBuffer allocate = ByteBuffer.allocate(24);
        fileChannel.read(allocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        if (allocate.getLong(8) != f69999b || allocate.getLong(16) != f69998a) {
            throw new SignatureNotFoundException(ProtectedSandApp.s("ᡎ\u0001"));
        }
        long j5 = allocate.getLong(0);
        if (j5 < allocate.capacity() || j5 > 2147483639) {
            throw new SignatureNotFoundException(p0.a(ProtectedSandApp.s("ᡍ\u0001"), j5));
        }
        int i4 = (int) (8 + j5);
        long j6 = j4 - i4;
        if (j6 < 0) {
            throw new SignatureNotFoundException(p0.a(ProtectedSandApp.s("ᡌ\u0001"), j6));
        }
        fileChannel.position(j6);
        ByteBuffer allocate2 = ByteBuffer.allocate(i4);
        fileChannel.read(allocate2);
        allocate2.order(byteOrder);
        long j7 = allocate2.getLong(0);
        if (j7 == j5) {
            return e.c(allocate2, Long.valueOf(j6));
        }
        StringBuilder a5 = f0.a(ProtectedSandApp.s("ᡊ\u0001"), j7, ProtectedSandApp.s("ᡋ\u0001"));
        a5.append(j5);
        throw new SignatureNotFoundException(a5.toString());
    }

    public static long d(FileChannel fileChannel) throws IOException {
        return e(fileChannel, h(fileChannel));
    }

    public static long e(FileChannel fileChannel, long j4) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j4) - 6);
        fileChannel.read(allocate);
        return allocate.getInt(0);
    }

    public static Map<Integer, ByteBuffer> f(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        a(byteBuffer);
        ByteBuffer i4 = i(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i5 = 0;
        while (i4.hasRemaining()) {
            i5++;
            if (i4.remaining() < 8) {
                throw new SignatureNotFoundException(android.support.v4.media.a.a(ProtectedSandApp.s("ᡓ\u0001"), i5));
            }
            long j4 = i4.getLong();
            String s4 = ProtectedSandApp.s("ᡐ\u0001");
            String s5 = ProtectedSandApp.s("ᡑ\u0001");
            if (j4 < 4 || j4 > 2147483647L) {
                throw new SignatureNotFoundException(s5 + i5 + s4 + j4);
            }
            int i6 = (int) j4;
            int position = i4.position() + i6;
            if (i6 > i4.remaining()) {
                StringBuilder a5 = n1.a(s5, i5, s4, i6, ProtectedSandApp.s("ᡒ\u0001"));
                a5.append(i4.remaining());
                throw new SignatureNotFoundException(a5.toString());
            }
            linkedHashMap.put(Integer.valueOf(i4.getInt()), g(i4, i6 - 4));
            i4.position(position);
        }
        return linkedHashMap;
    }

    private static ByteBuffer g(ByteBuffer byteBuffer, int i4) throws BufferUnderflowException {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ᡔ\u0001"), i4));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i5 = i4 + position;
        if (i5 < position || i5 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i5);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i5);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static long h(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException(ProtectedSandApp.s("ᡖ\u0001"));
        }
        long j4 = size - 22;
        long min = Math.min(j4, okhttp3.internal.ws.g.f84969s);
        int i4 = 0;
        while (true) {
            long j5 = i4;
            if (j5 > min) {
                throw new IOException(ProtectedSandApp.s("ᡕ\u0001"));
            }
            long j6 = j4 - j5;
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel.position(j6);
            fileChannel.read(allocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            if (allocate.getInt(0) == f70005h) {
                ByteBuffer allocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j6 + 20);
                fileChannel.read(allocate2);
                allocate2.order(byteOrder);
                short s4 = allocate2.getShort(0);
                if (s4 == i4) {
                    return s4;
                }
            }
            i4++;
        }
    }

    private static ByteBuffer i(ByteBuffer byteBuffer, int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ᡛ\u0001"), i4));
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("ᡙ\u0001"), i5, ProtectedSandApp.s("ᡚ\u0001"), i4));
        }
        int capacity = byteBuffer.capacity();
        if (i5 > byteBuffer.capacity()) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("ᡗ\u0001"), i5, ProtectedSandApp.s("ᡘ\u0001"), capacity));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i5);
            byteBuffer.position(i4);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }
}
