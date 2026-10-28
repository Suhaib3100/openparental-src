package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: CompactHashing.java */
@w0
@d9.c
/* loaded from: classes6.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    static final byte f55701a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f55702b = 5;

    /* renamed from: c, reason: collision with root package name */
    static final int f55703c = 32;

    /* renamed from: d, reason: collision with root package name */
    static final int f55704d = 31;

    /* renamed from: e, reason: collision with root package name */
    static final int f55705e = 1073741823;

    /* renamed from: f, reason: collision with root package name */
    static final int f55706f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f55707g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f55708h = 256;

    /* renamed from: i, reason: collision with root package name */
    private static final int f55709i = 255;

    /* renamed from: j, reason: collision with root package name */
    private static final int f55710j = 65536;

    /* renamed from: k, reason: collision with root package name */
    private static final int f55711k = 65535;

    private f0() {
    }

    static Object a(int i4) {
        if (i4 < 2 || i4 > 1073741824 || Integer.highestOneBit(i4) != i4) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(52, ProtectedSandApp.s("\uf4b5"), i4));
        }
        return i4 <= 256 ? new byte[i4] : i4 <= 65536 ? new short[i4] : new int[i4];
    }

    static int b(int i4, int i5) {
        return i4 & (~i5);
    }

    static int c(int i4, int i5) {
        return i4 & i5;
    }

    static int d(int i4, int i5, int i6) {
        return (i4 & (~i6)) | (i5 & i6);
    }

    static int e(int i4) {
        return (i4 + 1) * (i4 < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        i(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = d(r13[r5], r9, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int f(@zc.a java.lang.Object r9, @zc.a java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, @zc.a java.lang.Object[] r15) {
        /*
            int r0 = com.google.common.collect.x2.d(r9)
            r1 = r0 & r11
            int r2 = h(r12, r1)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = com.google.common.base.f0.a(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = com.google.common.base.f0.a(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            i(r12, r1, r9)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = d(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.f0.f(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int h(Object obj, int i4) {
        return obj instanceof byte[] ? ((byte[]) obj)[i4] & 255 : obj instanceof short[] ? ((short[]) obj)[i4] & kotlin.g2.f75095e : ((int[]) obj)[i4];
    }

    static void i(Object obj, int i4, int i5) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i4] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i4] = (short) i5;
        } else {
            ((int[]) obj)[i4] = i5;
        }
    }

    static int j(int i4) {
        return Math.max(4, x2.a(i4 + 1, 1.0d));
    }
}
