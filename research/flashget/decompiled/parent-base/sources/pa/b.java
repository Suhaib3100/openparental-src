package pa;

import com.google.zxing.NotFoundException;
import com.google.zxing.p;

/* compiled from: MonochromeRectangleDetector.java */
@Deprecated
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final int f88678b = 32;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f88679a;

    public b(com.google.zxing.common.b bVar) {
        this.f88679a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068 A[EDGE_INSN: B:67:0x0068->B:47:0x0068 BREAK  A[LOOP:3: B:39:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0031 A[EDGE_INSN: B:81:0x0031->B:21:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:75:0x001c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int[] a(int r5, int r6, int r7, int r8, boolean r9) {
        /*
            r4 = this;
            int r0 = r7 + r8
            int r0 = r0 / 2
            r1 = r0
        L5:
            if (r1 < r7) goto L3a
            com.google.zxing.common.b r2 = r4.f88679a
            if (r9 == 0) goto L12
            boolean r2 = r2.f(r1, r5)
            if (r2 == 0) goto L1b
            goto L18
        L12:
            boolean r2 = r2.f(r5, r1)
            if (r2 == 0) goto L1b
        L18:
            int r1 = r1 + (-1)
            goto L5
        L1b:
            r2 = r1
        L1c:
            int r2 = r2 + (-1)
            if (r2 < r7) goto L31
            com.google.zxing.common.b r3 = r4.f88679a
            if (r9 == 0) goto L2b
            boolean r3 = r3.f(r2, r5)
            if (r3 == 0) goto L1c
            goto L31
        L2b:
            boolean r3 = r3.f(r5, r2)
            if (r3 == 0) goto L1c
        L31:
            int r3 = r1 - r2
            if (r2 < r7) goto L3a
            if (r3 <= r6) goto L38
            goto L3a
        L38:
            r1 = r2
            goto L5
        L3a:
            int r1 = r1 + 1
        L3c:
            if (r0 >= r8) goto L71
            com.google.zxing.common.b r7 = r4.f88679a
            if (r9 == 0) goto L49
            boolean r7 = r7.f(r0, r5)
            if (r7 == 0) goto L52
            goto L4f
        L49:
            boolean r7 = r7.f(r5, r0)
            if (r7 == 0) goto L52
        L4f:
            int r0 = r0 + 1
            goto L3c
        L52:
            r7 = r0
        L53:
            int r7 = r7 + 1
            if (r7 >= r8) goto L68
            com.google.zxing.common.b r2 = r4.f88679a
            if (r9 == 0) goto L62
            boolean r2 = r2.f(r7, r5)
            if (r2 == 0) goto L53
            goto L68
        L62:
            boolean r2 = r2.f(r5, r7)
            if (r2 == 0) goto L53
        L68:
            int r2 = r7 - r0
            if (r7 >= r8) goto L71
            if (r2 <= r6) goto L6f
            goto L71
        L6f:
            r0 = r7
            goto L3c
        L71:
            int r0 = r0 + (-1)
            if (r0 <= r1) goto L7a
            int[] r5 = new int[]{r1, r0}
            return r5
        L7a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.b.a(int, int, int, int, boolean):int[]");
    }

    private p c(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14) throws NotFoundException {
        int[] iArr = null;
        int i15 = i4;
        int i16 = i10;
        while (i16 < i13 && i16 >= i12 && i15 < i7 && i15 >= i6) {
            int[] a5 = i5 == 0 ? a(i16, i14, i6, i7, true) : a(i15, i14, i12, i13, false);
            if (a5 == null) {
                if (iArr == null) {
                    throw NotFoundException.a();
                }
                if (i5 == 0) {
                    int i17 = i16 - i11;
                    int i18 = iArr[0];
                    if (i18 >= i4) {
                        return new p(iArr[1], i17);
                    }
                    if (iArr[1] > i4) {
                        return new p(iArr[i11 <= 0 ? (char) 1 : (char) 0], i17);
                    }
                    return new p(i18, i17);
                }
                int i19 = i15 - i5;
                int i20 = iArr[0];
                if (i20 >= i10) {
                    return new p(i19, iArr[1]);
                }
                if (iArr[1] > i10) {
                    return new p(i19, iArr[i5 >= 0 ? (char) 1 : (char) 0]);
                }
                return new p(i19, i20);
            }
            i16 += i11;
            i15 += i5;
            iArr = a5;
        }
        throw NotFoundException.a();
    }

    public p[] b() throws NotFoundException {
        int k4 = this.f88679a.k();
        int o4 = this.f88679a.o();
        int i4 = k4 / 2;
        int i5 = o4 / 2;
        int max = Math.max(1, k4 / 256);
        int max2 = Math.max(1, o4 / 256);
        int i6 = -max;
        int i7 = i5 / 2;
        int d5 = ((int) c(i5, 0, 0, o4, i4, i6, 0, k4, i7).d()) - 1;
        int i10 = i4 / 2;
        p c5 = c(i5, -max2, 0, o4, i4, 0, d5, k4, i10);
        int c6 = ((int) c5.c()) - 1;
        p c7 = c(i5, max2, c6, o4, i4, 0, d5, k4, i10);
        int c10 = ((int) c7.c()) + 1;
        p c11 = c(i5, 0, c6, c10, i4, max, d5, k4, i7);
        return new p[]{c(i5, 0, c6, c10, i4, i6, d5, ((int) c11.d()) + 1, i5 / 4), c5, c7, c11};
    }
}
