package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UShort;
import kotlin.UShortArray;

/* compiled from: UArraySorting.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w1 {
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.ExperimentalUnsignedTypes
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int a(long[] r6, int r7, int r8) {
        /*
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = kotlin.ULongArray.u(r6, r0)
        L8:
            if (r7 > r8) goto L37
        La:
            long r2 = kotlin.ULongArray.u(r6, r7)
            int r2 = kotlin.s1.a(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = kotlin.ULongArray.u(r6, r8)
            int r2 = kotlin.s1.a(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = kotlin.ULongArray.u(r6, r7)
            long r4 = kotlin.ULongArray.u(r6, r8)
            r6[r7] = r4
            r6[r8] = r2
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L37:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.w1.a(long[], int, int):int");
    }

    @ExperimentalUnsignedTypes
    private static final int b(byte[] bArr, int i5, int i6) {
        int i7;
        byte u5 = UByteArray.u(bArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (true) {
                int u6 = UByteArray.u(bArr, i5) & UByte.f27220r;
                i7 = u5 & UByte.f27220r;
                if (kotlin.jvm.internal.l0.t(u6, i7) >= 0) {
                    break;
                }
                i5++;
            }
            while (kotlin.jvm.internal.l0.t(UByteArray.u(bArr, i6) & UByte.f27220r, i7) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                byte u7 = UByteArray.u(bArr, i5);
                bArr[i5] = UByteArray.u(bArr, i6);
                bArr[i6] = u7;
                i5++;
                i6--;
            }
        }
        return i5;
    }

    @ExperimentalUnsignedTypes
    private static final int c(short[] sArr, int i5, int i6) {
        int i7;
        short u5 = UShortArray.u(sArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (true) {
                int u6 = UShortArray.u(sArr, i5) & UShort.f23340r;
                i7 = u5 & UShort.f23340r;
                if (kotlin.jvm.internal.l0.t(u6, i7) >= 0) {
                    break;
                }
                i5++;
            }
            while (kotlin.jvm.internal.l0.t(UShortArray.u(sArr, i6) & UShort.f23340r, i7) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                short u7 = UShortArray.u(sArr, i5);
                sArr[i5] = UShortArray.u(sArr, i6);
                sArr[i6] = u7;
                i5++;
                i6--;
            }
        }
        return i5;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.ExperimentalUnsignedTypes
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int d(int[] r3, int r4, int r5) {
        /*
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = kotlin.UIntArray.u(r3, r0)
        L8:
            if (r4 > r5) goto L37
        La:
            int r1 = kotlin.UIntArray.u(r3, r4)
            int r1 = kotlin.q1.a(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = kotlin.UIntArray.u(r3, r5)
            int r1 = kotlin.q1.a(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = kotlin.UIntArray.u(r3, r4)
            int r2 = kotlin.UIntArray.u(r3, r5)
            r3[r4] = r2
            r3[r5] = r1
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L37:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.w1.d(int[], int, int):int");
    }

    @ExperimentalUnsignedTypes
    private static final void e(long[] jArr, int i5, int i6) {
        int a6 = a(jArr, i5, i6);
        int i7 = a6 - 1;
        if (i5 < i7) {
            e(jArr, i5, i7);
        }
        if (a6 < i6) {
            e(jArr, a6, i6);
        }
    }

    @ExperimentalUnsignedTypes
    private static final void f(byte[] bArr, int i5, int i6) {
        int b6 = b(bArr, i5, i6);
        int i7 = b6 - 1;
        if (i5 < i7) {
            f(bArr, i5, i7);
        }
        if (b6 < i6) {
            f(bArr, b6, i6);
        }
    }

    @ExperimentalUnsignedTypes
    private static final void g(short[] sArr, int i5, int i6) {
        int c6 = c(sArr, i5, i6);
        int i7 = c6 - 1;
        if (i5 < i7) {
            g(sArr, i5, i7);
        }
        if (c6 < i6) {
            g(sArr, c6, i6);
        }
    }

    @ExperimentalUnsignedTypes
    private static final void h(int[] iArr, int i5, int i6) {
        int d6 = d(iArr, i5, i6);
        int i7 = d6 - 1;
        if (i5 < i7) {
            h(iArr, i5, i7);
        }
        if (d6 < i6) {
            h(iArr, d6, i6);
        }
    }

    @ExperimentalUnsignedTypes
    public static final void i(@d5.d long[] jArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(jArr, ProtectedSandApp.s("㸆"));
        e(jArr, i5, i6 - 1);
    }

    @ExperimentalUnsignedTypes
    public static final void j(@d5.d byte[] bArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("㸇"));
        f(bArr, i5, i6 - 1);
    }

    @ExperimentalUnsignedTypes
    public static final void k(@d5.d short[] sArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sArr, ProtectedSandApp.s("㸈"));
        g(sArr, i5, i6 - 1);
    }

    @ExperimentalUnsignedTypes
    public static final void l(@d5.d int[] iArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("㸉"));
        h(iArr, i5, i6 - 1);
    }
}
