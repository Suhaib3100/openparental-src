package androidx.content.preferences.protobuf;

import androidx.compose.foundation.text.q;
import java.nio.ByteBuffer;
import okio.r0;

/* compiled from: Utf8.java */
/* loaded from: classes3.dex */
final class q4 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f28925a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f28926b = -9187201950435737472L;

    /* renamed from: c, reason: collision with root package name */
    static final int f28927c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f28928d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f28929e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f28930f = 16;

    /* compiled from: Utf8.java */
    private static class a {
        private a() {
        }

        static void c(byte b5, char[] cArr, int i4) {
            cArr[i4] = (char) b5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b5, byte b6, byte b7, byte b10, char[] cArr, int i4) throws InvalidProtocolBufferException {
            if (!m(b6)) {
                if ((((b6 + 112) + (b5 << com.google.common.base.c.F)) >> 30) == 0 && !m(b7) && !m(b10)) {
                    int i5 = ((b5 & 7) << 18) | ((b6 & r0.f85265a) << 12) | ((b7 & r0.f85265a) << 6) | (b10 & r0.f85265a);
                    cArr[i4] = l(i5);
                    cArr[i4 + 1] = q(i5);
                    return;
                }
            }
            throw InvalidProtocolBufferException.d();
        }

        private static void i(byte b5, char[] cArr, int i4) {
            cArr[i4] = (char) b5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b5, byte b6, byte b7, char[] cArr, int i4) throws InvalidProtocolBufferException {
            if (m(b6) || ((b5 == -32 && b6 < -96) || ((b5 == -19 && b6 >= -96) || m(b7)))) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i4] = (char) (((b5 & com.google.common.base.c.f54871q) << 12) | ((b6 & r0.f85265a) << 6) | (b7 & r0.f85265a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b5, byte b6, char[] cArr, int i4) throws InvalidProtocolBufferException {
            if (b5 < -62 || m(b6)) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i4] = (char) (((b5 & com.google.common.base.c.I) << 6) | (b6 & r0.f85265a));
        }

        private static char l(int i4) {
            return (char) ((i4 >>> 10) + r0.f85268d);
        }

        private static boolean m(byte b5) {
            return b5 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b5) {
            return b5 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b5) {
            return b5 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b5) {
            return b5 < -32;
        }

        private static char q(int i4) {
            return (char) ((i4 & 1023) + r0.f85269e);
        }

        private static int r(byte b5) {
            return b5 & r0.f85265a;
        }
    }

    /* compiled from: Utf8.java */
    static abstract class b {
        b() {
        }

        private static int m(ByteBuffer byteBuffer, int i4, int i5) {
            int m4 = i4 + q4.m(byteBuffer, i4, i5);
            while (m4 < i5) {
                int i6 = m4 + 1;
                byte b5 = byteBuffer.get(m4);
                if (b5 >= 0) {
                    m4 = i6;
                } else if (b5 < -32) {
                    if (i6 >= i5) {
                        return b5;
                    }
                    if (b5 < -62 || byteBuffer.get(i6) > -65) {
                        return -1;
                    }
                    m4 += 2;
                } else {
                    if (b5 >= -16) {
                        if (i6 >= i5 - 2) {
                            return q4.q(byteBuffer, b5, i6, i5 - i6);
                        }
                        int i7 = m4 + 2;
                        byte b6 = byteBuffer.get(i6);
                        if (b6 <= -65) {
                            if ((((b6 + 112) + (b5 << com.google.common.base.c.F)) >> 30) == 0) {
                                int i10 = m4 + 3;
                                if (byteBuffer.get(i7) <= -65) {
                                    m4 += 4;
                                    if (byteBuffer.get(i10) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i6 >= i5 - 1) {
                        return q4.q(byteBuffer, b5, i6, i5 - i6);
                    }
                    int i11 = m4 + 2;
                    byte b7 = byteBuffer.get(i6);
                    if (b7 > -65 || ((b5 == -32 && b7 < -96) || ((b5 == -19 && b7 >= -96) || byteBuffer.get(i11) > -65))) {
                        return -1;
                    }
                    m4 += 3;
                }
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int i4, int i5) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i4, i5);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i4, i5) : c(byteBuffer, i4, i5);
        }

        abstract String b(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException;

        final String c(ByteBuffer byteBuffer, int i4, int i5) throws InvalidProtocolBufferException {
            if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b5 = byteBuffer.get(i4);
                if (!a.n(b5)) {
                    break;
                }
                i4++;
                cArr[i7] = (char) b5;
                i7++;
            }
            int i10 = i7;
            while (i4 < i6) {
                int i11 = i4 + 1;
                byte b6 = byteBuffer.get(i4);
                if (a.n(b6)) {
                    int i12 = i10 + 1;
                    cArr[i10] = (char) b6;
                    while (i11 < i6) {
                        byte b7 = byteBuffer.get(i11);
                        if (!a.n(b7)) {
                            break;
                        }
                        i11++;
                        cArr[i12] = (char) b7;
                        i12++;
                    }
                    i10 = i12;
                    i4 = i11;
                } else if (a.p(b6)) {
                    if (i11 >= i6) {
                        throw InvalidProtocolBufferException.d();
                    }
                    i4 += 2;
                    a.k(b6, byteBuffer.get(i11), cArr, i10);
                    i10++;
                } else if (a.o(b6)) {
                    if (i11 >= i6 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i13 = i4 + 2;
                    i4 += 3;
                    a.j(b6, byteBuffer.get(i11), byteBuffer.get(i13), cArr, i10);
                    i10++;
                } else {
                    if (i11 >= i6 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    byte b10 = byteBuffer.get(i11);
                    int i14 = i4 + 3;
                    byte b11 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    a.h(b6, b10, b11, byteBuffer.get(i14), cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        abstract String d(ByteBuffer byteBuffer, int i4, int i5) throws InvalidProtocolBufferException;

        abstract int e(CharSequence charSequence, byte[] bArr, int i4, int i5);

        final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(q4.i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                h(charSequence, byteBuffer);
            } else {
                g(charSequence, byteBuffer);
            }
        }

        final void g(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i4;
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i5 = 0;
            while (i5 < length) {
                try {
                    char charAt = charSequence.charAt(i5);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i5, (byte) charAt);
                    i5++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (Math.max(i5, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            }
            if (i5 == length) {
                byteBuffer.position(position + i5);
                return;
            }
            position += i5;
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i6 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                        byteBuffer.put(i6, (byte) ((charAt2 & '?') | 128));
                        position = i6;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i6;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (Math.max(i5, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                } else {
                    if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i7 = i5 + 1;
                        if (i7 != length) {
                            try {
                                char charAt3 = charSequence.charAt(i7);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    int i10 = position + 1;
                                    try {
                                        byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                        i4 = position + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        position = i10;
                                        i5 = i7;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (Math.max(i5, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                    try {
                                        byteBuffer.put(i10, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                        i5 = i7;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i5 = i7;
                                        position = i4;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (Math.max(i5, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i5 = i7;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new d(i5, length);
                    }
                    int i11 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position += 2;
                    byteBuffer.put(i11, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                }
                i5++;
                position++;
            }
            byteBuffer.position(position);
        }

        abstract void h(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean i(ByteBuffer byteBuffer, int i4, int i5) {
            return k(0, byteBuffer, i4, i5) == 0;
        }

        final boolean j(byte[] bArr, int i4, int i5) {
            return l(0, bArr, i4, i5) == 0;
        }

        final int k(int i4, ByteBuffer byteBuffer, int i5, int i6) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? o(i4, byteBuffer, i5, i6) : n(i4, byteBuffer, i5, i6);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return l(i4, byteBuffer.array(), i5 + arrayOffset, arrayOffset + i6);
        }

        abstract int l(int i4, byte[] bArr, int i5, int i6);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int n(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = androidx.content.preferences.protobuf.q4.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = androidx.content.preferences.protobuf.q4.a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = androidx.content.preferences.protobuf.q4.b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q4.b.n(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int o(int i4, ByteBuffer byteBuffer, int i5, int i6);
    }

    /* compiled from: Utf8.java */
    static final class c extends b {
        c() {
        }

        private static int p(byte[] bArr, int i4, int i5) {
            while (i4 < i5 && bArr[i4] >= 0) {
                i4++;
            }
            if (i4 >= i5) {
                return 0;
            }
            return q(bArr, i4, i5);
        }

        private static int q(byte[] bArr, int i4, int i5) {
            while (i4 < i5) {
                int i6 = i4 + 1;
                byte b5 = bArr[i4];
                if (b5 < 0) {
                    if (b5 < -32) {
                        if (i6 >= i5) {
                            return b5;
                        }
                        if (b5 >= -62) {
                            i4 += 2;
                            if (bArr[i6] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b5 < -16) {
                        if (i6 >= i5 - 1) {
                            return q4.r(bArr, i6, i5);
                        }
                        int i7 = i4 + 2;
                        byte b6 = bArr[i6];
                        if (b6 <= -65 && ((b5 != -32 || b6 >= -96) && (b5 != -19 || b6 < -96))) {
                            i4 += 3;
                            if (bArr[i7] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i6 >= i5 - 2) {
                        return q4.r(bArr, i6, i5);
                    }
                    int i10 = i4 + 2;
                    byte b7 = bArr[i6];
                    if (b7 <= -65) {
                        if ((((b7 + 112) + (b5 << com.google.common.base.c.F)) >> 30) == 0) {
                            int i11 = i4 + 3;
                            if (bArr[i10] <= -65) {
                                i4 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i4 = i6;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        String b(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException {
            if ((i4 | i5 | ((bArr.length - i4) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b5 = bArr[i4];
                if (!a.n(b5)) {
                    break;
                }
                i4++;
                cArr[i7] = (char) b5;
                i7++;
            }
            int i10 = i7;
            while (i4 < i6) {
                int i11 = i4 + 1;
                byte b6 = bArr[i4];
                if (a.n(b6)) {
                    int i12 = i10 + 1;
                    cArr[i10] = (char) b6;
                    while (i11 < i6) {
                        byte b7 = bArr[i11];
                        if (!a.n(b7)) {
                            break;
                        }
                        i11++;
                        cArr[i12] = (char) b7;
                        i12++;
                    }
                    i10 = i12;
                    i4 = i11;
                } else if (a.p(b6)) {
                    if (i11 >= i6) {
                        throw InvalidProtocolBufferException.d();
                    }
                    i4 += 2;
                    a.k(b6, bArr[i11], cArr, i10);
                    i10++;
                } else if (a.o(b6)) {
                    if (i11 >= i6 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i13 = i4 + 2;
                    i4 += 3;
                    a.j(b6, bArr[i11], bArr[i13], cArr, i10);
                    i10++;
                } else {
                    if (i11 >= i6 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    byte b10 = bArr[i11];
                    int i14 = i4 + 3;
                    byte b11 = bArr[i4 + 2];
                    i4 += 4;
                    a.h(b6, b10, b11, bArr[i14], cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        String d(ByteBuffer byteBuffer, int i4, int i5) throws InvalidProtocolBufferException {
            return c(byteBuffer, i4, i5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.q4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q4.c.e(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            g(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.q4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.content.preferences.protobuf.q4.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.content.preferences.protobuf.q4.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.content.preferences.protobuf.q4.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q4.c.l(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        int o(int i4, ByteBuffer byteBuffer, int i5, int i6) {
            return n(i4, byteBuffer, i5, i6);
        }
    }

    /* compiled from: Utf8.java */
    static class d extends IllegalArgumentException {
        d(int i4, int i5) {
            super(q.a("Unpaired surrogate at index ", i4, " of ", i5));
        }
    }

    /* compiled from: Utf8.java */
    static final class e extends b {
        e() {
        }

        static boolean p() {
            return p4.S() && p4.T();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int q(long r10, int r12) {
            /*
                int r0 = s(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = androidx.content.preferences.protobuf.p4.y(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = androidx.content.preferences.protobuf.p4.y(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = u(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = androidx.content.preferences.protobuf.p4.y(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = androidx.content.preferences.protobuf.p4.y(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = u(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = androidx.content.preferences.protobuf.p4.y(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = androidx.content.preferences.protobuf.p4.y(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = androidx.content.preferences.protobuf.p4.y(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q4.e.q(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int r(byte[] r10, long r11, int r13) {
            /*
                int r0 = t(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.content.preferences.protobuf.p4.A(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = androidx.content.preferences.protobuf.p4.A(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = v(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = androidx.content.preferences.protobuf.p4.A(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = androidx.content.preferences.protobuf.p4.A(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = v(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = androidx.content.preferences.protobuf.p4.A(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.content.preferences.protobuf.p4.A(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.content.preferences.protobuf.p4.A(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q4.e.r(byte[], long, int):int");
        }

        private static int s(long j4, int i4) {
            if (i4 < 16) {
                return 0;
            }
            int i5 = 8 - (((int) j4) & 7);
            int i6 = i5;
            while (i6 > 0) {
                long j5 = 1 + j4;
                if (p4.y(j4) < 0) {
                    return i5 - i6;
                }
                i6--;
                j4 = j5;
            }
            int i7 = i4 - i5;
            while (i7 >= 8 && (p4.K(j4) & (-9187201950435737472L)) == 0) {
                j4 += 8;
                i7 -= 8;
            }
            return i4 - i7;
        }

        private static int t(byte[] bArr, long j4, int i4) {
            int i5 = 0;
            if (i4 < 16) {
                return 0;
            }
            while (i5 < i4) {
                long j5 = 1 + j4;
                if (p4.A(bArr, j4) < 0) {
                    return i5;
                }
                i5++;
                j4 = j5;
            }
            return i4;
        }

        private static int u(long j4, int i4, int i5) {
            if (i5 == 0) {
                return q4.n(i4);
            }
            if (i5 == 1) {
                return q4.o(i4, p4.y(j4));
            }
            if (i5 == 2) {
                return q4.p(i4, p4.y(j4), p4.y(j4 + 1));
            }
            throw new AssertionError();
        }

        private static int v(byte[] bArr, int i4, long j4, int i5) {
            if (i5 == 0) {
                return q4.n(i4);
            }
            if (i5 == 1) {
                return q4.o(i4, p4.A(bArr, j4));
            }
            if (i5 == 2) {
                return q4.p(i4, p4.A(bArr, j4), p4.A(bArr, j4 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        String b(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException {
            if ((i4 | i5 | ((bArr.length - i4) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte A = p4.A(bArr, i4);
                if (!a.n(A)) {
                    break;
                }
                i4++;
                cArr[i7] = (char) A;
                i7++;
            }
            int i10 = i7;
            while (i4 < i6) {
                int i11 = i4 + 1;
                byte A2 = p4.A(bArr, i4);
                if (a.n(A2)) {
                    int i12 = i10 + 1;
                    cArr[i10] = (char) A2;
                    while (i11 < i6) {
                        byte A3 = p4.A(bArr, i11);
                        if (!a.n(A3)) {
                            break;
                        }
                        i11++;
                        cArr[i12] = (char) A3;
                        i12++;
                    }
                    i10 = i12;
                    i4 = i11;
                } else if (a.p(A2)) {
                    if (i11 >= i6) {
                        throw InvalidProtocolBufferException.d();
                    }
                    i4 += 2;
                    a.k(A2, p4.A(bArr, i11), cArr, i10);
                    i10++;
                } else if (a.o(A2)) {
                    if (i11 >= i6 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i13 = i4 + 2;
                    i4 += 3;
                    a.j(A2, p4.A(bArr, i11), p4.A(bArr, i13), cArr, i10);
                    i10++;
                } else {
                    if (i11 >= i6 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    byte A4 = p4.A(bArr, i11);
                    int i14 = i4 + 3;
                    byte A5 = p4.A(bArr, i4 + 2);
                    i4 += 4;
                    a.h(A2, A4, A5, p4.A(bArr, i14), cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        String d(ByteBuffer byteBuffer, int i4, int i5) throws InvalidProtocolBufferException {
            if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            long i6 = p4.i(byteBuffer) + i4;
            long j4 = i5 + i6;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i6 < j4) {
                byte y4 = p4.y(i6);
                if (!a.n(y4)) {
                    break;
                }
                i6++;
                cArr[i7] = (char) y4;
                i7++;
            }
            int i10 = i7;
            while (i6 < j4) {
                long j5 = i6 + 1;
                byte y5 = p4.y(i6);
                if (a.n(y5)) {
                    int i11 = i10 + 1;
                    cArr[i10] = (char) y5;
                    while (j5 < j4) {
                        byte y6 = p4.y(j5);
                        if (!a.n(y6)) {
                            break;
                        }
                        j5++;
                        cArr[i11] = (char) y6;
                        i11++;
                    }
                    i10 = i11;
                    i6 = j5;
                } else if (a.p(y5)) {
                    if (j5 >= j4) {
                        throw InvalidProtocolBufferException.d();
                    }
                    i6 += 2;
                    a.k(y5, p4.y(j5), cArr, i10);
                    i10++;
                } else if (a.o(y5)) {
                    if (j5 >= j4 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    long j6 = 2 + i6;
                    i6 += 3;
                    a.j(y5, p4.y(j5), p4.y(j6), cArr, i10);
                    i10++;
                } else {
                    if (j5 >= j4 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    byte y7 = p4.y(j5);
                    long j7 = 3 + i6;
                    byte y10 = p4.y(2 + i6);
                    i6 += 4;
                    a.h(y5, y7, y10, p4.y(j7), cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        int e(CharSequence charSequence, byte[] bArr, int i4, int i5) {
            long j4;
            String str;
            String str2;
            int i6;
            long j5;
            long j6;
            char charAt;
            long j7 = i4;
            long j10 = i5 + j7;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i5 || bArr.length - i5 < i4) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i4 + i5));
            }
            int i7 = 0;
            while (true) {
                j4 = 1;
                if (i7 >= length || (charAt = charSequence.charAt(i7)) >= 128) {
                    break;
                }
                p4.d0(bArr, j7, (byte) charAt);
                i7++;
                j7 = 1 + j7;
            }
            if (i7 == length) {
                return (int) j7;
            }
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 >= 128 || j7 >= j10) {
                    if (charAt2 >= 2048 || j7 > j10 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j7 > j10 - 3) {
                            if (j7 > j10 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i6 = i7 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i6)))) {
                                    throw new d(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j7);
                            }
                            int i10 = i7 + 1;
                            if (i10 != length) {
                                char charAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j5 = 1;
                                    p4.d0(bArr, j7, (byte) ((codePoint >>> 18) | 240));
                                    j6 = j10;
                                    p4.d0(bArr, j7 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j11 = j7 + 3;
                                    p4.d0(bArr, j7 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j7 += 4;
                                    p4.d0(bArr, j11, (byte) ((codePoint & 63) | 128));
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new d(i7 - 1, length);
                        }
                        p4.d0(bArr, j7, (byte) ((charAt2 >>> '\f') | 480));
                        long j12 = j7 + 2;
                        p4.d0(bArr, j7 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j7 += 3;
                        p4.d0(bArr, j12, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j13 = j7 + j4;
                        p4.d0(bArr, j7, (byte) ((charAt2 >>> 6) | 960));
                        j7 += 2;
                        p4.d0(bArr, j13, (byte) ((charAt2 & '?') | 128));
                    }
                    j6 = j10;
                    j5 = 1;
                } else {
                    p4.d0(bArr, j7, (byte) charAt2);
                    j6 = j10;
                    str2 = str4;
                    j5 = j4;
                    j7 += j4;
                    str = str3;
                }
                i7++;
                str3 = str;
                str4 = str2;
                j4 = j5;
                j10 = j6;
            }
            return (int) j7;
        }

        @Override // androidx.datastore.preferences.protobuf.q4.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j4;
            char c5;
            long j5;
            int i4;
            int i5;
            char c6;
            char charAt;
            long i6 = p4.i(byteBuffer);
            long position = byteBuffer.position() + i6;
            long limit = byteBuffer.limit() + i6;
            int length = charSequence.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i7 = 0;
            while (true) {
                j4 = 1;
                c5 = 128;
                if (i7 >= length || (charAt = charSequence.charAt(i7)) >= 128) {
                    break;
                }
                p4.b0(position, (byte) charAt);
                i7++;
                position = 1 + position;
            }
            if (i7 == length) {
                byteBuffer.position((int) (position - i6));
                return;
            }
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 >= c5 || position >= limit) {
                    if (charAt2 >= 2048 || position > limit - 2) {
                        j5 = i6;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            if (position > limit - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i7 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                                    throw new d(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                            i5 = i7 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    p4.b0(position, (byte) ((codePoint >>> 18) | 240));
                                    c6 = 128;
                                    p4.b0(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j6 = position + 3;
                                    p4.b0(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    position += 4;
                                    p4.b0(j6, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i7 = i5;
                                }
                            }
                            throw new d(i7 - 1, length);
                        }
                        long j7 = position + j4;
                        p4.b0(position, (byte) ((charAt2 >>> '\f') | 480));
                        long j10 = position + 2;
                        p4.b0(j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                        position += 3;
                        p4.b0(j10, (byte) ((charAt2 & '?') | 128));
                    } else {
                        j5 = i6;
                        long j11 = position + j4;
                        p4.b0(position, (byte) ((charAt2 >>> 6) | 960));
                        position += 2;
                        p4.b0(j11, (byte) ((charAt2 & '?') | 128));
                    }
                    i5 = i7;
                    c6 = 128;
                } else {
                    p4.b0(position, (byte) charAt2);
                    j5 = i6;
                    i5 = i7;
                    c6 = c5;
                    position += j4;
                }
                c5 = c6;
                i6 = j5;
                j4 = 1;
                i7 = i5 + 1;
            }
            byteBuffer.position((int) (position - i6));
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            if (androidx.content.preferences.protobuf.p4.A(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (androidx.content.preferences.protobuf.p4.A(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.q4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q4.e.l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (androidx.content.preferences.protobuf.p4.y(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        
            if (androidx.content.preferences.protobuf.p4.y(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
        
            if (androidx.content.preferences.protobuf.p4.y(r0) > (-65)) goto L57;
         */
        @Override // androidx.datastore.preferences.protobuf.q4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int o(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q4.e.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f28925a = (!e.p() || androidx.content.preferences.protobuf.e.c()) ? new c() : new e();
    }

    private q4() {
    }

    static String g(ByteBuffer byteBuffer, int i4, int i5) throws InvalidProtocolBufferException {
        return f28925a.a(byteBuffer, i4, i5);
    }

    static String h(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException {
        return f28925a.b(bArr, i4, i5);
    }

    static int i(CharSequence charSequence, byte[] bArr, int i4, int i5) {
        return f28925a.e(charSequence, bArr, i4, i5);
    }

    static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f28925a.f(charSequence, byteBuffer);
    }

    static int k(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 < length) {
                char charAt = charSequence.charAt(i4);
                if (charAt >= 2048) {
                    i5 += l(charSequence, i4);
                    break;
                }
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + 4294967296L));
    }

    private static int l(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i4) < 65536) {
                        throw new d(i4, length);
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(ByteBuffer byteBuffer, int i4, int i5) {
        int i6 = i5 - 7;
        int i7 = i4;
        while (i7 < i6 && (byteBuffer.getLong(i7) & (-9187201950435737472L)) == 0) {
            i7 += 8;
        }
        return i7 - i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i4) {
        if (i4 > -12) {
            return -1;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i4, int i5) {
        if (i4 > -12 || i5 > -65) {
            return -1;
        }
        return i4 ^ (i5 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(int i4, int i5, int i6) {
        if (i4 > -12 || i5 > -65 || i6 > -65) {
            return -1;
        }
        return (i4 ^ (i5 << 8)) ^ (i6 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(ByteBuffer byteBuffer, int i4, int i5, int i6) {
        if (i6 == 0) {
            return n(i4);
        }
        if (i6 == 1) {
            return o(i4, byteBuffer.get(i5));
        }
        if (i6 == 2) {
            return p(i4, byteBuffer.get(i5), byteBuffer.get(i5 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr, int i4, int i5) {
        byte b5 = bArr[i4 - 1];
        int i6 = i5 - i4;
        if (i6 == 0) {
            return n(b5);
        }
        if (i6 == 1) {
            return o(b5, bArr[i4]);
        }
        if (i6 == 2) {
            return p(b5, bArr[i4], bArr[i4 + 1]);
        }
        throw new AssertionError();
    }

    static boolean s(ByteBuffer byteBuffer) {
        return f28925a.i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean t(byte[] bArr) {
        return f28925a.j(bArr, 0, bArr.length);
    }

    public static boolean u(byte[] bArr, int i4, int i5) {
        return f28925a.j(bArr, i4, i5);
    }

    static int v(int i4, ByteBuffer byteBuffer, int i5, int i6) {
        return f28925a.k(i4, byteBuffer, i5, i6);
    }

    public static int w(int i4, byte[] bArr, int i5, int i6) {
        return f28925a.l(i4, bArr, i5, i6);
    }
}
