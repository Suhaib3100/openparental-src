package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.w;
import java.nio.ByteBuffer;

/* compiled from: Utf8Safe.java */
/* loaded from: classes3.dex */
public final class a0 extends w {

    /* compiled from: Utf8Safe.java */
    static class a extends IllegalArgumentException {
        a(int i4, int i5) {
            super(androidx.compose.foundation.text.q.a("Unpaired surrogate at index ", i4, " of ", i5));
        }
    }

    private static int f(CharSequence charSequence) {
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
                    i5 += k(charSequence, i4);
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

    public static String g(byte[] bArr, int i4, int i5) {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i6 = i4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i4 < i6) {
            byte b5 = bArr[i4];
            if (!w.a.g(b5)) {
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
            if (w.a.g(b6)) {
                int i12 = i10 + 1;
                cArr[i10] = (char) b6;
                while (i11 < i6) {
                    byte b7 = bArr[i11];
                    if (!w.a.g(b7)) {
                        break;
                    }
                    i11++;
                    cArr[i12] = (char) b7;
                    i12++;
                }
                i10 = i12;
                i4 = i11;
            } else if (w.a.i(b6)) {
                if (i11 >= i6) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i4 += 2;
                w.a.d(b6, bArr[i11], cArr, i10);
                i10++;
            } else if (w.a.h(b6)) {
                if (i11 >= i6 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i13 = i4 + 2;
                i4 += 3;
                w.a.c(b6, bArr[i11], bArr[i13], cArr, i10);
                i10++;
            } else {
                if (i11 >= i6 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b10 = bArr[i11];
                int i14 = i4 + 3;
                byte b11 = bArr[i4 + 2];
                i4 += 4;
                w.a.a(b6, b10, b11, bArr[i14], cArr, i10);
                i10 += 2;
            }
        }
        return new String(cArr, 0, i10);
    }

    public static String h(ByteBuffer byteBuffer, int i4, int i5) {
        if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i6 = i4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i4 < i6) {
            byte b5 = byteBuffer.get(i4);
            if (!w.a.g(b5)) {
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
            if (w.a.g(b6)) {
                int i12 = i10 + 1;
                cArr[i10] = (char) b6;
                while (i11 < i6) {
                    byte b7 = byteBuffer.get(i11);
                    if (!w.a.g(b7)) {
                        break;
                    }
                    i11++;
                    cArr[i12] = (char) b7;
                    i12++;
                }
                i10 = i12;
                i4 = i11;
            } else if (w.a.i(b6)) {
                if (i11 >= i6) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i4 += 2;
                w.a.d(b6, byteBuffer.get(i11), cArr, i10);
                i10++;
            } else if (w.a.h(b6)) {
                if (i11 >= i6 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i13 = i4 + 2;
                i4 += 3;
                w.a.c(b6, byteBuffer.get(i11), byteBuffer.get(i13), cArr, i10);
                i10++;
            } else {
                if (i11 >= i6 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b10 = byteBuffer.get(i11);
                int i14 = i4 + 3;
                byte b11 = byteBuffer.get(i4 + 2);
                i4 += 4;
                w.a.a(b6, b10, b11, byteBuffer.get(i14), cArr, i10);
                i10 += 2;
            }
        }
        return new String(cArr, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int i(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.a0.i(java.lang.CharSequence, byte[], int, int):int");
    }

    private static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                    throw new a(i5, length);
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

    private static int k(CharSequence charSequence, int i4) {
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
                        throw new a(i4, length);
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public String a(ByteBuffer byteBuffer, int i4, int i5) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? g(byteBuffer.array(), byteBuffer.arrayOffset() + i4, i5) : h(byteBuffer, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            j(charSequence, byteBuffer);
        } else {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public int c(CharSequence charSequence) {
        return f(charSequence);
    }
}
