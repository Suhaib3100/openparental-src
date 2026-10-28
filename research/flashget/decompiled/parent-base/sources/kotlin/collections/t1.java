package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.g2;

/* compiled from: UArraySorting.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\t\u001a'\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001c\u0010\u000e\u001a'\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\u0013\u001a'\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lkotlin/t1;", "array", "", "left", "right", "b", "([BII)I", "Lkotlin/k2;", "f", "([BII)V", "Lkotlin/h2;", "c", "([SII)I", "g", "([SII)V", "Lkotlin/x1;", "d", "([III)I", "h", "([III)V", "Lkotlin/b2;", "a", "([JII)I", "e", "([JII)V", "fromIndex", "toIndex", "j", "k", "l", "i", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class t1 {
    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0025 */
    @kotlin.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int a(long[] r6, int r7, int r8) {
        /*
            int r0 = r7 + r8
            int r0 = r0 / 2
            r0 = r6[r0]
            long r0 = kotlin.a2.h(r0)
        La:
            if (r7 > r8) goto L41
        Lc:
            r2 = r6[r7]
            long r2 = kotlin.a2.h(r2)
            int r2 = androidx.collection.j1.a(r2, r0)
            if (r2 >= 0) goto L1b
            int r7 = r7 + 1
            goto Lc
        L1b:
            r2 = r6[r8]
            long r2 = kotlin.a2.h(r2)
            int r2 = androidx.collection.j1.a(r2, r0)
            if (r2 <= 0) goto L2a
            int r8 = r8 + (-1)
            goto L1b
        L2a:
            if (r7 > r8) goto La
            r2 = r6[r7]
            long r2 = kotlin.a2.h(r2)
            r4 = r6[r8]
            long r4 = kotlin.a2.h(r4)
            r6[r7] = r4
            r6[r8] = r2
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto La
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.t1.a(long[], int, int):int");
    }

    @kotlin.t
    private static final int b(byte[] bArr, int i4, int i5) {
        int i6;
        byte h4 = kotlin.s1.h(bArr[(i4 + i5) / 2]);
        while (i4 <= i5) {
            while (true) {
                i6 = h4 & 255;
                if (kotlin.jvm.internal.l0.t(kotlin.s1.h(bArr[i4]) & 255, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (kotlin.jvm.internal.l0.t(kotlin.s1.h(bArr[i5]) & 255, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                byte h5 = kotlin.s1.h(bArr[i4]);
                bArr[i4] = kotlin.s1.h(bArr[i5]);
                bArr[i5] = h5;
                i4++;
                i5--;
            }
        }
        return i4;
    }

    @kotlin.t
    private static final int c(short[] sArr, int i4, int i5) {
        int i6;
        short h4 = g2.h(sArr[(i4 + i5) / 2]);
        while (i4 <= i5) {
            while (true) {
                int h5 = g2.h(sArr[i4]) & g2.f75095e;
                i6 = h4 & g2.f75095e;
                if (kotlin.jvm.internal.l0.t(h5, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (kotlin.jvm.internal.l0.t(g2.h(sArr[i5]) & g2.f75095e, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                short h6 = g2.h(sArr[i4]);
                sArr[i4] = g2.h(sArr[i5]);
                sArr[i5] = h6;
                i4++;
                i5--;
            }
        }
        return i4;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0025 */
    @kotlin.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int d(int[] r3, int r4, int r5) {
        /*
            int r0 = r4 + r5
            int r0 = r0 / 2
            r0 = r3[r0]
            int r0 = kotlin.w1.h(r0)
        La:
            if (r4 > r5) goto L41
        Lc:
            r1 = r3[r4]
            int r1 = kotlin.w1.h(r1)
            int r1 = kotlin.r1.a(r1, r0)
            if (r1 >= 0) goto L1b
            int r4 = r4 + 1
            goto Lc
        L1b:
            r1 = r3[r5]
            int r1 = kotlin.w1.h(r1)
            int r1 = kotlin.r1.a(r1, r0)
            if (r1 <= 0) goto L2a
            int r5 = r5 + (-1)
            goto L1b
        L2a:
            if (r4 > r5) goto La
            r1 = r3[r4]
            int r1 = kotlin.w1.h(r1)
            r2 = r3[r5]
            int r2 = kotlin.w1.h(r2)
            r3[r4] = r2
            r3[r5] = r1
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto La
        L41:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.t1.d(int[], int, int):int");
    }

    @kotlin.t
    private static final void e(long[] jArr, int i4, int i5) {
        int a5 = a(jArr, i4, i5);
        int i6 = a5 - 1;
        if (i4 < i6) {
            e(jArr, i4, i6);
        }
        if (a5 < i5) {
            e(jArr, a5, i5);
        }
    }

    @kotlin.t
    private static final void f(byte[] bArr, int i4, int i5) {
        int b5 = b(bArr, i4, i5);
        int i6 = b5 - 1;
        if (i4 < i6) {
            f(bArr, i4, i6);
        }
        if (b5 < i5) {
            f(bArr, b5, i5);
        }
    }

    @kotlin.t
    private static final void g(short[] sArr, int i4, int i5) {
        int c5 = c(sArr, i4, i5);
        int i6 = c5 - 1;
        if (i4 < i6) {
            g(sArr, i4, i6);
        }
        if (c5 < i5) {
            g(sArr, c5, i5);
        }
    }

    @kotlin.t
    private static final void h(int[] iArr, int i4, int i5) {
        int d5 = d(iArr, i4, i5);
        int i6 = d5 - 1;
        if (i4 < i6) {
            h(iArr, i4, i6);
        }
        if (d5 < i5) {
            h(iArr, d5, i5);
        }
    }

    @kotlin.t
    public static final void i(@fg.l long[] jArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(jArr, ProtectedSandApp.s("戓\u0001"));
        e(jArr, i4, i5 - 1);
    }

    @kotlin.t
    public static final void j(@fg.l byte[] bArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("戓\u0001"));
        f(bArr, i4, i5 - 1);
    }

    @kotlin.t
    public static final void k(@fg.l short[] sArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(sArr, ProtectedSandApp.s("戓\u0001"));
        g(sArr, i4, i5 - 1);
    }

    @kotlin.t
    public static final void l(@fg.l int[] iArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("戓\u0001"));
        h(iArr, i4, i5 - 1);
    }
}
