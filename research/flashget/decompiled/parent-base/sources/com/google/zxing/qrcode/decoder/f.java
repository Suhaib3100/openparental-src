package com.google.zxing.qrcode.decoder;

/* compiled from: ErrorCorrectionLevel.java */
/* loaded from: classes6.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final f[] FOR_BITS;
    private final int bits;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        FOR_BITS = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i4) {
        this.bits = i4;
    }

    public static f forBits(int i4) {
        if (i4 >= 0) {
            f[] fVarArr = FOR_BITS;
            if (i4 < fVarArr.length) {
                return fVarArr[i4];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
