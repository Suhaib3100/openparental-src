package com.tencent.cos.xml.s3;

import android.support.v4.media.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;
import okio.r0;

/* loaded from: classes7.dex */
public class Base64Codec implements Codec {
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private static final int OFFSET_OF_0 = -4;
    private static final int OFFSET_OF_PLUS = -19;
    private static final int OFFSET_OF_SLASH = -16;
    private static final int OFFSET_OF_a = 71;
    private static final byte PAD = 61;
    private final byte[] alphabets;

    private static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i4 = 0; i4 <= 122; i4++) {
                if (i4 >= 65 && i4 <= 90) {
                    bArr[i4] = (byte) (i4 - 65);
                } else if (i4 >= 48 && i4 <= 57) {
                    bArr[i4] = (byte) (i4 + 4);
                } else if (i4 == 43) {
                    bArr[i4] = (byte) (i4 + 19);
                } else if (i4 == 47) {
                    bArr[i4] = (byte) (i4 + 16);
                } else if (i4 < 97 || i4 > 122) {
                    bArr[i4] = -1;
                } else {
                    bArr[i4] = (byte) (i4 - 71);
                }
            }
            return bArr;
        }
    }

    Base64Codec() {
        this.alphabets = CodecUtils.toBytesDirect(ProtectedSandApp.s("仝\u0001"));
    }

    @Override // com.tencent.cos.xml.s3.Codec
    public byte[] decode(byte[] bArr, int i4) {
        int i5;
        if (i4 % 4 != 0) {
            throw new IllegalArgumentException(a.a(ProtectedSandApp.s("仟\u0001"), i4));
        }
        int i6 = i4 - 1;
        int i7 = 0;
        while (true) {
            i5 = 2;
            if (i7 >= 2 || i6 <= -1 || bArr[i6] != 61) {
                break;
            }
            i6--;
            i7++;
        }
        if (i7 == 0) {
            i5 = 3;
        } else if (i7 != 1) {
            if (i7 != 2) {
                throw new Error(ProtectedSandApp.s("仞\u0001"));
            }
            i5 = 1;
        }
        int i10 = ((i4 / 4) * 3) - (3 - i5);
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10 - (i5 % 3)) {
            decode4bytes(bArr, i11, bArr2, i12);
            i11 += 4;
            i12 += 3;
        }
        if (i5 < 3) {
            decode1to3bytes(i5, bArr, i11, bArr2, i12);
        }
        return bArr2;
    }

    void decode1to3bytes(int i4, byte[] bArr, int i5, byte[] bArr2, int i6) {
        int i7 = i6 + 1;
        int pos = pos(bArr[i5]) << 2;
        int i10 = i5 + 2;
        int pos2 = pos(bArr[i5 + 1]);
        bArr2[i6] = (byte) (pos | ((pos2 >>> 4) & 3));
        if (i4 == 1) {
            CodecUtils.sanityCheckLastPos(pos2, 15);
            return;
        }
        int i11 = i6 + 2;
        int i12 = i5 + 3;
        int pos3 = pos(bArr[i10]);
        bArr2[i7] = (byte) (((pos2 & 15) << 4) | (15 & (pos3 >>> 2)));
        if (i4 == 2) {
            CodecUtils.sanityCheckLastPos(pos3, 3);
        } else {
            bArr2[i11] = (byte) (((pos3 & 3) << 6) | pos(bArr[i12]));
        }
    }

    void decode4bytes(byte[] bArr, int i4, byte[] bArr2, int i5) {
        int pos = pos(bArr[i4]) << 2;
        int pos2 = pos(bArr[i4 + 1]);
        bArr2[i5] = (byte) (pos | ((pos2 >>> 4) & 3));
        int pos3 = pos(bArr[i4 + 2]);
        bArr2[i5 + 1] = (byte) (((pos2 & 15) << 4) | ((pos3 >>> 2) & 15));
        bArr2[i5 + 2] = (byte) (pos(bArr[i4 + 3]) | ((pos3 & 3) << 6));
    }

    @Override // com.tencent.cos.xml.s3.Codec
    public byte[] encode(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i4 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i5 = 0;
            while (i4 < bArr.length) {
                encode3bytes(bArr, i4, bArr2, i5);
                i4 += 3;
                i5 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i6 = 0;
        while (i4 < bArr.length - length2) {
            encode3bytes(bArr, i4, bArr3, i6);
            i4 += 3;
            i6 += 4;
        }
        if (length2 == 1) {
            encode1byte(bArr, i4, bArr3, i6);
        } else {
            if (length2 != 2) {
                throw new IllegalStateException();
            }
            encode2bytes(bArr, i4, bArr3, i6);
        }
        return bArr3;
    }

    void encode1byte(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.alphabets;
        byte b5 = bArr[i4];
        bArr2[i5] = bArr3[(b5 >>> 2) & 63];
        bArr2[i5 + 1] = bArr3[(b5 & 3) << 4];
        bArr2[i5 + 2] = 61;
        bArr2[i5 + 3] = 61;
    }

    void encode2bytes(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.alphabets;
        int i6 = i4 + 1;
        byte b5 = bArr[i4];
        bArr2[i5] = bArr3[(b5 >>> 2) & 63];
        byte b6 = bArr[i6];
        bArr2[i5 + 1] = bArr3[((b5 & 3) << 4) | ((b6 >>> 4) & 15)];
        bArr2[i5 + 2] = bArr3[(b6 & c.f54871q) << 2];
        bArr2[i5 + 3] = 61;
    }

    void encode3bytes(byte[] bArr, int i4, byte[] bArr2, int i5) {
        byte[] bArr3 = this.alphabets;
        byte b5 = bArr[i4];
        bArr2[i5] = bArr3[(b5 >>> 2) & 63];
        byte b6 = bArr[i4 + 1];
        bArr2[i5 + 1] = bArr3[((b5 & 3) << 4) | ((b6 >>> 4) & 15)];
        int i6 = (b6 & c.f54871q) << 2;
        byte b7 = bArr[i4 + 2];
        bArr2[i5 + 2] = bArr3[((b7 >>> 6) & 3) | i6];
        bArr2[i5 + 3] = bArr3[b7 & r0.f85265a];
    }

    protected int pos(byte b5) {
        byte b6 = LazyHolder.DECODED[b5];
        if (b6 > -1) {
            return b6;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("仠\u0001") + ((char) b5) + ProtectedSandApp.s("仡\u0001"));
    }

    protected Base64Codec(byte[] bArr) {
        this.alphabets = bArr;
    }
}
