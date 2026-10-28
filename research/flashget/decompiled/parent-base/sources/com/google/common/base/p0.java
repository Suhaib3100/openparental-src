package com.google.common.base;

import com.google.common.base.f;
import java.util.BitSet;

/* compiled from: SmallCharMatcher.java */
@d9.c
@o
/* loaded from: classes6.dex */
final class p0 extends f.v {

    /* renamed from: g, reason: collision with root package name */
    static final int f54997g = 1023;

    /* renamed from: h, reason: collision with root package name */
    private static final int f54998h = -862048943;

    /* renamed from: i, reason: collision with root package name */
    private static final int f54999i = 461845907;

    /* renamed from: j, reason: collision with root package name */
    private static final double f55000j = 0.5d;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f55001d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f55002e;

    /* renamed from: f, reason: collision with root package name */
    private final long f55003f;

    private p0(char[] cArr, long j4, boolean z4, String str) {
        super(str);
        this.f55001d = cArr;
        this.f55003f = j4;
        this.f55002e = z4;
    }

    private boolean Y(int i4) {
        return 1 == ((this.f55003f >> i4) & 1);
    }

    @d9.d
    static int Z(int i4) {
        if (i4 == 1) {
            return 2;
        }
        int highestOneBit = Integer.highestOneBit(i4 - 1) << 1;
        while (highestOneBit * f55000j < i4) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    static f a0(BitSet bitSet, String str) {
        int i4;
        int cardinality = bitSet.cardinality();
        boolean z4 = bitSet.get(0);
        int Z = Z(cardinality);
        char[] cArr = new char[Z];
        int i5 = Z - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j4 = 0;
        while (nextSetBit != -1) {
            long j5 = (1 << nextSetBit) | j4;
            int b02 = b0(nextSetBit);
            while (true) {
                i4 = b02 & i5;
                if (cArr[i4] == 0) {
                    break;
                }
                b02 = i4 + 1;
            }
            cArr[i4] = (char) nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            j4 = j5;
        }
        return new p0(cArr, j4, z4, str);
    }

    static int b0(int i4) {
        return Integer.rotateLeft(i4 * (-862048943), 15) * f54999i;
    }

    @Override // com.google.common.base.f
    public boolean B(char c5) {
        if (c5 == 0) {
            return this.f55002e;
        }
        if (!Y(c5)) {
            return false;
        }
        int length = this.f55001d.length - 1;
        int b02 = b0(c5) & length;
        int i4 = b02;
        do {
            char c6 = this.f55001d[i4];
            if (c6 == 0) {
                return false;
            }
            if (c6 == c5) {
                return true;
            }
            i4 = (i4 + 1) & length;
        } while (i4 != b02);
        return false;
    }

    @Override // com.google.common.base.f
    void Q(BitSet bitSet) {
        if (this.f55002e) {
            bitSet.set(0);
        }
        for (char c5 : this.f55001d) {
            if (c5 != 0) {
                bitSet.set(c5);
            }
        }
    }
}
