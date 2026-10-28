package android.content.preferences.protobuf;

import java.nio.ByteBuffer;
import okio.r0;

/* compiled from: Utf8.java */
/* loaded from: classes.dex */
final class n4 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f7432a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f7433b = -9187201950435737472L;

    /* renamed from: c, reason: collision with root package name */
    static final int f7434c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7435d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7436e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7437f = 16;

    /* compiled from: Utf8.java */
    private static class a {
        private a() {
        }

        static boolean b(byte b6) {
            return b6 >= 0;
        }

        static void c(byte b6, char[] cArr, int i5) {
            cArr[i5] = (char) b6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b6, byte b7, byte b8, byte b9, char[] cArr, int i5) throws InvalidProtocolBufferException {
            if (!m(b7)) {
                if ((((b7 + 112) + (b6 << 28)) >> 30) == 0 && !m(b8) && !m(b9)) {
                    int i6 = ((b6 & 7) << 18) | ((b7 & r0.f31710a) << 12) | ((b8 & r0.f31710a) << 6) | (b9 & r0.f31710a);
                    cArr[i5] = l(i6);
                    cArr[i5 + 1] = q(i6);
                    return;
                }
            }
            throw InvalidProtocolBufferException.d();
        }

        private static void i(byte b6, char[] cArr, int i5) {
            cArr[i5] = (char) b6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b6, byte b7, byte b8, char[] cArr, int i5) throws InvalidProtocolBufferException {
            if (m(b7) || ((b6 == -32 && b7 < -96) || ((b6 == -19 && b7 >= -96) || m(b8)))) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i5] = (char) (((b6 & 15) << 12) | ((b7 & r0.f31710a) << 6) | (b8 & r0.f31710a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b6, byte b7, char[] cArr, int i5) throws InvalidProtocolBufferException {
            if (b6 < -62 || m(b7)) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i5] = (char) (((b6 & 31) << 6) | (b7 & r0.f31710a));
        }

        private static char l(int i5) {
            return (char) ((i5 >>> 10) + r0.f31713d);
        }

        private static boolean m(byte b6) {
            return b6 > -65;
        }

        private static boolean n(byte b6) {
            return b6 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b6) {
            return b6 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b6) {
            return b6 < -32;
        }

        private static char q(int i5) {
            return (char) ((i5 & 1023) + r0.f31714e);
        }

        private static int r(byte b6) {
            return b6 & r0.f31710a;
        }
    }

    /* compiled from: Utf8.java */
    static abstract class b {
        b() {
        }

        private static int m(ByteBuffer byteBuffer, int i5, int i6) {
            int m5 = i5 + n4.m(byteBuffer, i5, i6);
            while (m5 < i6) {
                int i7 = m5 + 1;
                byte b6 = byteBuffer.get(m5);
                if (b6 < 0) {
                    if (b6 < -32) {
                        if (i7 >= i6) {
                            return b6;
                        }
                        if (b6 < -62 || byteBuffer.get(i7) > -65) {
                            return -1;
                        }
                        i7++;
                    } else {
                        if (b6 >= -16) {
                            if (i7 >= i6 - 2) {
                                return n4.q(byteBuffer, b6, i7, i6 - i7);
                            }
                            int i8 = i7 + 1;
                            byte b7 = byteBuffer.get(i7);
                            if (b7 <= -65) {
                                if ((((b7 + 112) + (b6 << 28)) >> 30) == 0) {
                                    int i9 = i8 + 1;
                                    if (byteBuffer.get(i8) <= -65) {
                                        i7 = i9 + 1;
                                        if (byteBuffer.get(i9) > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i7 >= i6 - 1) {
                            return n4.q(byteBuffer, b6, i7, i6 - i7);
                        }
                        int i10 = i7 + 1;
                        byte b8 = byteBuffer.get(i7);
                        if (b8 > -65 || ((b6 == -32 && b8 < -96) || ((b6 == -19 && b8 >= -96) || byteBuffer.get(i10) > -65))) {
                            return -1;
                        }
                        m5 = i10 + 1;
                    }
                }
                m5 = i7;
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int i5, int i6) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i5, i6);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i5, i6) : c(byteBuffer, i5, i6);
        }

        abstract String b(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException;

        final String c(ByteBuffer byteBuffer, int i5, int i6) throws InvalidProtocolBufferException {
            if ((i5 | i6 | ((byteBuffer.limit() - i5) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
            int i7 = i5 + i6;
            char[] cArr = new char[i6];
            int i8 = 0;
            while (i5 < i7) {
                byte b6 = byteBuffer.get(i5);
                if (!(b6 >= 0)) {
                    break;
                }
                i5++;
                cArr[i8] = (char) b6;
                i8++;
            }
            int i9 = i8;
            while (i5 < i7) {
                int i10 = i5 + 1;
                byte b7 = byteBuffer.get(i5);
                if (b7 >= 0) {
                    int i11 = i9 + 1;
                    cArr[i9] = (char) b7;
                    while (i10 < i7) {
                        byte b8 = byteBuffer.get(i10);
                        if (!(b8 >= 0)) {
                            break;
                        }
                        i10++;
                        cArr[i11] = (char) b8;
                        i11++;
                    }
                    i5 = i10;
                    i9 = i11;
                } else if (a.p(b7)) {
                    if (i10 >= i7) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a.k(b7, byteBuffer.get(i10), cArr, i9);
                    i5 = i10 + 1;
                    i9++;
                } else if (a.o(b7)) {
                    if (i10 >= i7 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i12 = i10 + 1;
                    a.j(b7, byteBuffer.get(i10), byteBuffer.get(i12), cArr, i9);
                    i5 = i12 + 1;
                    i9++;
                } else {
                    if (i10 >= i7 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i13 = i10 + 1;
                    byte b9 = byteBuffer.get(i10);
                    int i14 = i13 + 1;
                    a.h(b7, b9, byteBuffer.get(i13), byteBuffer.get(i14), cArr, i9);
                    i5 = i14 + 1;
                    i9 = i9 + 1 + 1;
                }
            }
            return new String(cArr, 0, i9);
        }

        abstract String d(ByteBuffer byteBuffer, int i5, int i6) throws InvalidProtocolBufferException;

        abstract int e(CharSequence charSequence, byte[] bArr, int i5, int i6);

        final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(n4.i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                h(charSequence, byteBuffer);
            } else {
                g(charSequence, byteBuffer);
            }
        }

        final void g(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                                    int i8 = position + 1;
                                    try {
                                        byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                        int i9 = i8 + 1;
                                        byteBuffer.put(i8, (byte) (((codePoint >>> 12) & 63) | 128));
                                        int i10 = i9 + 1;
                                        byteBuffer.put(i9, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(i10, (byte) ((codePoint & 63) | 128));
                                        position = i10;
                                        i5 = i7;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        position = i8;
                                        i5 = i7;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (Math.max(i5, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i5 = i7;
                                }
                            } catch (IndexOutOfBoundsException unused4) {
                            }
                        }
                        throw new d(i5, length);
                    }
                    int i11 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position = i11 + 1;
                    byteBuffer.put(i11, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                }
                i5++;
                position++;
            }
            byteBuffer.position(position);
        }

        abstract void h(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean i(ByteBuffer byteBuffer, int i5, int i6) {
            return k(0, byteBuffer, i5, i6) == 0;
        }

        final boolean j(byte[] bArr, int i5, int i6) {
            return l(0, bArr, i5, i6) == 0;
        }

        final int k(int i5, ByteBuffer byteBuffer, int i6, int i7) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? o(i5, byteBuffer, i6, i7) : n(i5, byteBuffer, i6, i7);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return l(i5, byteBuffer.array(), i6 + arrayOffset, arrayOffset + i7);
        }

        abstract int l(int i5, byte[] bArr, int i6, int i7);

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
                int r7 = android.content.preferences.protobuf.n4.a(r0, r9)
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
                int r7 = android.content.preferences.protobuf.n4.a(r0, r1)
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
                int r7 = android.content.preferences.protobuf.n4.b(r0, r1, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n4.b.n(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int o(int i5, ByteBuffer byteBuffer, int i6, int i7);
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes3.dex */
    static final class c extends b {
        c() {
        }

        private static int p(byte[] bArr, int i5, int i6) {
            while (i5 < i6 && bArr[i5] >= 0) {
                i5++;
            }
            if (i5 >= i6) {
                return 0;
            }
            return q(bArr, i5, i6);
        }

        private static int q(byte[] bArr, int i5, int i6) {
            while (i5 < i6) {
                int i7 = i5 + 1;
                byte b6 = bArr[i5];
                if (b6 < 0) {
                    if (b6 < -32) {
                        if (i7 >= i6) {
                            return b6;
                        }
                        if (b6 >= -62) {
                            i5 = i7 + 1;
                            if (bArr[i7] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b6 < -16) {
                        if (i7 >= i6 - 1) {
                            return n4.r(bArr, i7, i6);
                        }
                        int i8 = i7 + 1;
                        byte b7 = bArr[i7];
                        if (b7 <= -65 && ((b6 != -32 || b7 >= -96) && (b6 != -19 || b7 < -96))) {
                            i5 = i8 + 1;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i7 >= i6 - 2) {
                        return n4.r(bArr, i7, i6);
                    }
                    int i9 = i7 + 1;
                    byte b8 = bArr[i7];
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b6 << 28)) >> 30) == 0) {
                            int i10 = i9 + 1;
                            if (bArr[i9] <= -65) {
                                i7 = i10 + 1;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i5 = i7;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
        String b(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException {
            if ((i5 | i6 | ((bArr.length - i5) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
            int i7 = i5 + i6;
            char[] cArr = new char[i6];
            int i8 = 0;
            while (i5 < i7) {
                byte b6 = bArr[i5];
                if (!(b6 >= 0)) {
                    break;
                }
                i5++;
                cArr[i8] = (char) b6;
                i8++;
            }
            int i9 = i8;
            while (i5 < i7) {
                int i10 = i5 + 1;
                byte b7 = bArr[i5];
                if (b7 >= 0) {
                    int i11 = i9 + 1;
                    cArr[i9] = (char) b7;
                    while (i10 < i7) {
                        byte b8 = bArr[i10];
                        if (!(b8 >= 0)) {
                            break;
                        }
                        i10++;
                        cArr[i11] = (char) b8;
                        i11++;
                    }
                    i5 = i10;
                    i9 = i11;
                } else if (a.p(b7)) {
                    if (i10 >= i7) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a.k(b7, bArr[i10], cArr, i9);
                    i5 = i10 + 1;
                    i9++;
                } else if (a.o(b7)) {
                    if (i10 >= i7 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i12 = i10 + 1;
                    a.j(b7, bArr[i10], bArr[i12], cArr, i9);
                    i5 = i12 + 1;
                    i9++;
                } else {
                    if (i10 >= i7 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i13 = i10 + 1;
                    byte b9 = bArr[i10];
                    int i14 = i13 + 1;
                    a.h(b7, b9, bArr[i13], bArr[i14], cArr, i9);
                    i5 = i14 + 1;
                    i9 = i9 + 1 + 1;
                }
            }
            return new String(cArr, 0, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
        String d(ByteBuffer byteBuffer, int i5, int i6) throws InvalidProtocolBufferException {
            return c(byteBuffer, i5, i6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.n4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n4.c.e(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
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
        @Override // androidx.datastore.preferences.protobuf.n4.b
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
                int r7 = android.content.preferences.protobuf.n4.a(r0, r9)
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
                int r7 = android.content.preferences.protobuf.n4.a(r0, r1)
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
                int r7 = android.content.preferences.protobuf.n4.b(r0, r1, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n4.c.l(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
        int o(int i5, ByteBuffer byteBuffer, int i6, int i7) {
            return n(i5, byteBuffer, i6, i7);
        }
    }

    /* compiled from: Utf8.java */
    static class d extends IllegalArgumentException {
        d(int i5, int i6) {
            super(v.a("Unpaired surrogate at index ", i5, " of ", i6));
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes3.dex */
    static final class e extends b {
        e() {
        }

        static boolean p() {
            return m4.S() && m4.T();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int q(long r8, int r10) {
            /*
                int r0 = s(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r10 <= 0) goto L1a
                long r4 = r8 + r2
                byte r1 = android.content.preferences.protobuf.m4.y(r8)
                if (r1 < 0) goto L19
                int r10 = r10 + (-1)
                r8 = r4
                goto L9
            L19:
                r8 = r4
            L1a:
                if (r10 != 0) goto L1d
                return r0
            L1d:
                int r10 = r10 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r10 != 0) goto L29
                return r1
            L29:
                int r10 = r10 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r8
                byte r8 = android.content.preferences.protobuf.m4.y(r8)
                if (r8 <= r4) goto L37
                goto L39
            L37:
                r8 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r10 >= r6) goto L46
                int r8 = u(r8, r1, r10)
                return r8
            L46:
                int r10 = r10 + (-2)
                long r6 = r8 + r2
                byte r8 = android.content.preferences.protobuf.m4.y(r8)
                if (r8 > r4) goto L63
                r9 = -96
                if (r1 != r0) goto L56
                if (r8 < r9) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r8 >= r9) goto L63
            L5c:
                long r2 = r2 + r6
                byte r8 = android.content.preferences.protobuf.m4.y(r6)
                if (r8 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r10 >= r0) goto L6c
                int r8 = u(r8, r1, r10)
                return r8
            L6c:
                int r10 = r10 + (-3)
                long r6 = r8 + r2
                byte r8 = android.content.preferences.protobuf.m4.y(r8)
                if (r8 > r4) goto L8e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r8 = r8 + r9
                int r8 = r8 >> 30
                if (r8 != 0) goto L8e
                long r8 = r6 + r2
                byte r0 = android.content.preferences.protobuf.m4.y(r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r8
                byte r8 = android.content.preferences.protobuf.m4.y(r8)
                if (r8 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n4.e.q(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int r(byte[] r8, long r9, int r11) {
            /*
                int r0 = t(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = android.content.preferences.protobuf.m4.A(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = android.content.preferences.protobuf.m4.A(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = v(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = android.content.preferences.protobuf.m4.A(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = android.content.preferences.protobuf.m4.A(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = v(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = android.content.preferences.protobuf.m4.A(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r9 = r9 + r10
                int r9 = r9 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = android.content.preferences.protobuf.m4.A(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = android.content.preferences.protobuf.m4.A(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n4.e.r(byte[], long, int):int");
        }

        private static int s(long j5, int i5) {
            if (i5 < 16) {
                return 0;
            }
            int i6 = 8 - (((int) j5) & 7);
            int i7 = i6;
            while (i7 > 0) {
                long j6 = 1 + j5;
                if (m4.y(j5) < 0) {
                    return i6 - i7;
                }
                i7--;
                j5 = j6;
            }
            int i8 = i5 - i6;
            while (i8 >= 8 && (m4.K(j5) & n4.f7433b) == 0) {
                j5 += 8;
                i8 -= 8;
            }
            return i5 - i8;
        }

        private static int t(byte[] bArr, long j5, int i5) {
            int i6 = 0;
            if (i5 < 16) {
                return 0;
            }
            while (i6 < i5) {
                long j6 = 1 + j5;
                if (m4.A(bArr, j5) < 0) {
                    return i6;
                }
                i6++;
                j5 = j6;
            }
            return i5;
        }

        private static int u(long j5, int i5, int i6) {
            if (i6 == 0) {
                return n4.d(i5);
            }
            if (i6 == 1) {
                return n4.o(i5, m4.y(j5));
            }
            if (i6 == 2) {
                return n4.p(i5, m4.y(j5), m4.y(j5 + 1));
            }
            throw new AssertionError();
        }

        private static int v(byte[] bArr, int i5, long j5, int i6) {
            if (i6 == 0) {
                return n4.d(i5);
            }
            if (i6 == 1) {
                return n4.o(i5, m4.A(bArr, j5));
            }
            if (i6 == 2) {
                return n4.p(i5, m4.A(bArr, j5), m4.A(bArr, j5 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
        String b(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException {
            if ((i5 | i6 | ((bArr.length - i5) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
            int i7 = i5 + i6;
            char[] cArr = new char[i6];
            int i8 = 0;
            while (i5 < i7) {
                byte A = m4.A(bArr, i5);
                if (!(A >= 0)) {
                    break;
                }
                i5++;
                cArr[i8] = (char) A;
                i8++;
            }
            int i9 = i8;
            while (i5 < i7) {
                int i10 = i5 + 1;
                byte A2 = m4.A(bArr, i5);
                if (A2 >= 0) {
                    int i11 = i9 + 1;
                    cArr[i9] = (char) A2;
                    while (i10 < i7) {
                        byte A3 = m4.A(bArr, i10);
                        if (!(A3 >= 0)) {
                            break;
                        }
                        i10++;
                        cArr[i11] = (char) A3;
                        i11++;
                    }
                    i5 = i10;
                    i9 = i11;
                } else if (a.p(A2)) {
                    if (i10 >= i7) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a.k(A2, m4.A(bArr, i10), cArr, i9);
                    i5 = i10 + 1;
                    i9++;
                } else if (a.o(A2)) {
                    if (i10 >= i7 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i12 = i10 + 1;
                    a.j(A2, m4.A(bArr, i10), m4.A(bArr, i12), cArr, i9);
                    i5 = i12 + 1;
                    i9++;
                } else {
                    if (i10 >= i7 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i13 = i10 + 1;
                    byte A4 = m4.A(bArr, i10);
                    int i14 = i13 + 1;
                    a.h(A2, A4, m4.A(bArr, i13), m4.A(bArr, i14), cArr, i9);
                    i5 = i14 + 1;
                    i9 = i9 + 1 + 1;
                }
            }
            return new String(cArr, 0, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
        String d(ByteBuffer byteBuffer, int i5, int i6) throws InvalidProtocolBufferException {
            if ((i5 | i6 | ((byteBuffer.limit() - i5) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
            long i7 = m4.i(byteBuffer) + i5;
            long j5 = i6 + i7;
            char[] cArr = new char[i6];
            int i8 = 0;
            while (i7 < j5) {
                byte y5 = m4.y(i7);
                if (!(y5 >= 0)) {
                    break;
                }
                i7++;
                cArr[i8] = (char) y5;
                i8++;
            }
            while (true) {
                int i9 = i8;
                while (i7 < j5) {
                    long j6 = i7 + 1;
                    byte y6 = m4.y(i7);
                    if (y6 >= 0) {
                        int i10 = i9 + 1;
                        cArr[i9] = (char) y6;
                        while (j6 < j5) {
                            byte y7 = m4.y(j6);
                            if (!(y7 >= 0)) {
                                break;
                            }
                            j6++;
                            cArr[i10] = (char) y7;
                            i10++;
                        }
                        i9 = i10;
                        i7 = j6;
                    } else if (a.p(y6)) {
                        if (j6 >= j5) {
                            throw InvalidProtocolBufferException.d();
                        }
                        i7 = j6 + 1;
                        a.k(y6, m4.y(j6), cArr, i9);
                        i9++;
                    } else if (a.o(y6)) {
                        if (j6 >= j5 - 1) {
                            throw InvalidProtocolBufferException.d();
                        }
                        long j7 = j6 + 1;
                        a.j(y6, m4.y(j6), m4.y(j7), cArr, i9);
                        i9++;
                        i7 = j7 + 1;
                    } else {
                        if (j6 >= j5 - 2) {
                            throw InvalidProtocolBufferException.d();
                        }
                        long j8 = j6 + 1;
                        byte y8 = m4.y(j6);
                        long j9 = j8 + 1;
                        byte y9 = m4.y(j8);
                        i7 = j9 + 1;
                        a.h(y6, y8, y9, m4.y(j9), cArr, i9);
                        i8 = i9 + 1 + 1;
                    }
                }
                return new String(cArr, 0, i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
        int e(CharSequence charSequence, byte[] bArr, int i5, int i6) {
            char c6;
            long j5;
            long j6;
            long j7;
            char c7;
            int i7;
            char charAt;
            long j8 = i5;
            long j9 = i6 + j8;
            int length = charSequence.length();
            if (length > i6 || bArr.length - i6 < i5) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i5 + i6));
            }
            int i8 = 0;
            while (true) {
                c6 = 128;
                j5 = 1;
                if (i8 >= length || (charAt = charSequence.charAt(i8)) >= 128) {
                    break;
                }
                m4.d0(bArr, j8, (byte) charAt);
                i8++;
                j8 = 1 + j8;
            }
            if (i8 == length) {
                return (int) j8;
            }
            while (i8 < length) {
                char charAt2 = charSequence.charAt(i8);
                if (charAt2 < c6 && j8 < j9) {
                    long j10 = j8 + j5;
                    m4.d0(bArr, j8, (byte) charAt2);
                    j7 = j5;
                    j6 = j10;
                    c7 = c6;
                } else if (charAt2 < 2048 && j8 <= j9 - 2) {
                    long j11 = j8 + j5;
                    m4.d0(bArr, j8, (byte) ((charAt2 >>> 6) | 960));
                    long j12 = j11 + j5;
                    m4.d0(bArr, j11, (byte) ((charAt2 & '?') | 128));
                    long j13 = j5;
                    c7 = 128;
                    j6 = j12;
                    j7 = j13;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j8 > j9 - 3) {
                        if (j8 > j9 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i7 = i8 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i7)))) {
                                throw new d(i8, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j8);
                        }
                        int i9 = i8 + 1;
                        if (i9 != length) {
                            char charAt3 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j14 = j8 + 1;
                                m4.d0(bArr, j8, (byte) ((codePoint >>> 18) | 240));
                                long j15 = j14 + 1;
                                c7 = 128;
                                m4.d0(bArr, j14, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j16 = j15 + 1;
                                m4.d0(bArr, j15, (byte) (((codePoint >>> 6) & 63) | 128));
                                j7 = 1;
                                j6 = j16 + 1;
                                m4.d0(bArr, j16, (byte) ((codePoint & 63) | 128));
                                i8 = i9;
                            } else {
                                i8 = i9;
                            }
                        }
                        throw new d(i8 - 1, length);
                    }
                    long j17 = j8 + j5;
                    m4.d0(bArr, j8, (byte) ((charAt2 >>> '\f') | 480));
                    long j18 = j17 + j5;
                    m4.d0(bArr, j17, (byte) (((charAt2 >>> 6) & 63) | 128));
                    m4.d0(bArr, j18, (byte) ((charAt2 & '?') | 128));
                    j6 = j18 + 1;
                    j7 = 1;
                    c7 = 128;
                }
                i8++;
                c6 = c7;
                long j19 = j7;
                j8 = j6;
                j5 = j19;
            }
            return (int) j8;
        }

        @Override // androidx.datastore.preferences.protobuf.n4.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            char c6;
            long j5;
            int i5;
            int i6;
            long j6;
            char c7;
            char charAt;
            long i7 = m4.i(byteBuffer);
            long position = byteBuffer.position() + i7;
            long limit = byteBuffer.limit() + i7;
            int length = charSequence.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i8 = 0;
            while (true) {
                c6 = 128;
                if (i8 >= length || (charAt = charSequence.charAt(i8)) >= 128) {
                    break;
                }
                m4.b0(position, (byte) charAt);
                i8++;
                position++;
            }
            if (i8 == length) {
                byteBuffer.position((int) (position - i7));
                return;
            }
            while (i8 < length) {
                char charAt2 = charSequence.charAt(i8);
                if (charAt2 >= c6 || position >= limit) {
                    if (charAt2 >= 2048 || position > limit - 2) {
                        j5 = i7;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            if (position > limit - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i5 = i8 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i5)))) {
                                    throw new d(i8, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                            i6 = i8 + 1;
                            if (i6 != length) {
                                char charAt3 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j6 = limit;
                                    long j7 = position + 1;
                                    m4.b0(position, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = j7 + 1;
                                    c7 = 128;
                                    m4.b0(j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = j8 + 1;
                                    m4.b0(j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    m4.b0(j9, (byte) ((codePoint & 63) | 128));
                                    position = j9 + 1;
                                } else {
                                    i8 = i6;
                                }
                            }
                            throw new d(i8 - 1, length);
                        }
                        long j10 = position + 1;
                        m4.b0(position, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j10 + 1;
                        m4.b0(j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        m4.b0(j11, (byte) ((charAt2 & '?') | 128));
                        position = j11 + 1;
                    } else {
                        j5 = i7;
                        long j12 = position + 1;
                        m4.b0(position, (byte) ((charAt2 >>> 6) | 960));
                        m4.b0(j12, (byte) ((charAt2 & '?') | 128));
                        position = j12 + 1;
                    }
                    j6 = limit;
                    i6 = i8;
                    c7 = 128;
                } else {
                    m4.b0(position, (byte) charAt2);
                    j6 = limit;
                    i6 = i8;
                    c7 = c6;
                    position++;
                    j5 = i7;
                }
                c6 = c7;
                i7 = j5;
                limit = j6;
                i8 = i6 + 1;
            }
            byteBuffer.position((int) (position - i7));
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        
            if (android.content.preferences.protobuf.m4.A(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (android.content.preferences.protobuf.m4.A(r13, r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.n4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n4.e.l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        
            if (android.content.preferences.protobuf.m4.y(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
        
            if (android.content.preferences.protobuf.m4.y(r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.n4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int o(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n4.e.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f7432a = (!e.p() || android.content.preferences.protobuf.e.c()) ? new c() : new e();
    }

    private n4() {
    }

    static int d(int i5) {
        if (i5 > -12) {
            return -1;
        }
        return i5;
    }

    static String g(ByteBuffer byteBuffer, int i5, int i6) throws InvalidProtocolBufferException {
        return f7432a.a(byteBuffer, i5, i6);
    }

    static String h(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException {
        return f7432a.b(bArr, i5, i6);
    }

    static int i(CharSequence charSequence, byte[] bArr, int i5, int i6) {
        return f7432a.e(charSequence, bArr, i5, i6);
    }

    static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f7432a.f(charSequence, byteBuffer);
    }

    static int k(CharSequence charSequence) {
        int length = charSequence.length();
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 < length) {
                char charAt = charSequence.charAt(i5);
                if (charAt >= 2048) {
                    i6 += l(charSequence, i5);
                    break;
                }
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                break;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    private static int l(CharSequence charSequence, int i5) {
        int length = charSequence.length();
        int i6 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
            } else {
                i6 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i5) < 65536) {
                        throw new d(i5, length);
                    }
                    i5++;
                }
            }
            i5++;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(ByteBuffer byteBuffer, int i5, int i6) {
        int i7 = i6 - 7;
        int i8 = i5;
        while (i8 < i7 && (byteBuffer.getLong(i8) & f7433b) == 0) {
            i8 += 8;
        }
        return i8 - i5;
    }

    private static int n(int i5) {
        if (i5 > -12) {
            return -1;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i5, int i6) {
        if (i5 > -12 || i6 > -65) {
            return -1;
        }
        return i5 ^ (i6 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(int i5, int i6, int i7) {
        if (i5 > -12 || i6 > -65 || i7 > -65) {
            return -1;
        }
        return (i5 ^ (i6 << 8)) ^ (i7 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(ByteBuffer byteBuffer, int i5, int i6, int i7) {
        if (i7 == 0) {
            if (i5 > -12) {
                return -1;
            }
            return i5;
        }
        if (i7 == 1) {
            return o(i5, byteBuffer.get(i6));
        }
        if (i7 == 2) {
            return p(i5, byteBuffer.get(i6), byteBuffer.get(i6 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr, int i5, int i6) {
        byte b6 = bArr[i5 - 1];
        int i7 = i6 - i5;
        if (i7 == 0) {
            if (b6 > -12) {
                return -1;
            }
            return b6;
        }
        if (i7 == 1) {
            return o(b6, bArr[i5]);
        }
        if (i7 == 2) {
            return p(b6, bArr[i5], bArr[i5 + 1]);
        }
        throw new AssertionError();
    }

    static boolean s(ByteBuffer byteBuffer) {
        return f7432a.i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean t(byte[] bArr) {
        return f7432a.j(bArr, 0, bArr.length);
    }

    public static boolean u(byte[] bArr, int i5, int i6) {
        return f7432a.j(bArr, i5, i6);
    }

    static int v(int i5, ByteBuffer byteBuffer, int i6, int i7) {
        return f7432a.k(i5, byteBuffer, i6, i7);
    }

    public static int w(int i5, byte[] bArr, int i6, int i7) {
        return f7432a.l(i5, bArr, i6, i7);
    }
}
