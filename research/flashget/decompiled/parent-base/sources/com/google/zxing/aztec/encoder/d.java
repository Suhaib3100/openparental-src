package com.google.zxing.aztec.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: HighLevelEncoder.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    static final int f62626c = 0;

    /* renamed from: d, reason: collision with root package name */
    static final int f62627d = 1;

    /* renamed from: e, reason: collision with root package name */
    static final int f62628e = 2;

    /* renamed from: f, reason: collision with root package name */
    static final int f62629f = 3;

    /* renamed from: g, reason: collision with root package name */
    static final int f62630g = 4;

    /* renamed from: i, reason: collision with root package name */
    private static final int[][] f62632i;

    /* renamed from: j, reason: collision with root package name */
    static final int[][] f62633j;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f62634a;

    /* renamed from: b, reason: collision with root package name */
    static final String[] f62625b = {ProtectedSandApp.s("ऽ\u0001"), ProtectedSandApp.s("ा\u0001"), ProtectedSandApp.s("ि\u0001"), ProtectedSandApp.s("ऻ\u0001"), ProtectedSandApp.s("़\u0001")};

    /* renamed from: h, reason: collision with root package name */
    static final int[][] f62631h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* compiled from: HighLevelEncoder.java */
    class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.e() - fVar2.e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f62632i = iArr;
        iArr[0][32] = 1;
        for (int i4 = 65; i4 <= 90; i4++) {
            f62632i[0][i4] = i4 - 63;
        }
        f62632i[1][32] = 1;
        for (int i5 = 97; i5 <= 122; i5++) {
            f62632i[1][i5] = i5 - 95;
        }
        f62632i[2][32] = 1;
        for (int i6 = 48; i6 <= 57; i6++) {
            f62632i[2][i6] = i6 - 46;
        }
        int[] iArr2 = f62632i[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i7 = 0; i7 < 28; i7++) {
            f62632i[3][iArr3[i7]] = i7;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i10 = 0; i10 < 31; i10++) {
            int i11 = iArr4[i10];
            if (i11 > 0) {
                f62632i[4][i11] = i10;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f62633j = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f62633j;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr) {
        this.f62634a = bArr;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(fVar);
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.h(fVar)) {
                    break;
                }
                if (fVar.h(fVar2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i4, Collection<f> collection) {
        char c5 = (char) (this.f62634a[i4] & 255);
        boolean z4 = f62632i[fVar.f()][c5] > 0;
        f fVar2 = null;
        for (int i5 = 0; i5 <= 4; i5++) {
            int i6 = f62632i[i5][c5];
            if (i6 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.c(i4);
                }
                if (!z4 || i5 == fVar.f() || i5 == 2) {
                    collection.add(fVar2.i(i5, i6));
                }
                if (!z4 && f62633j[fVar.f()][i5] >= 0) {
                    collection.add(fVar2.j(i5, i6));
                }
            }
        }
        if (fVar.d() > 0 || f62632i[fVar.f()][c5] == 0) {
            collection.add(fVar.a(i4));
        }
    }

    private static void d(f fVar, int i4, int i5, Collection<f> collection) {
        f c5 = fVar.c(i4);
        collection.add(c5.i(4, i5));
        if (fVar.f() != 4) {
            collection.add(c5.j(4, i5));
        }
        if (i5 == 3 || i5 == 4) {
            collection.add(c5.i(2, 16 - i5).i(2, 1));
        }
        if (fVar.d() > 0) {
            collection.add(fVar.a(i4).a(i4 + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i4) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i4, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i4, i5, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.zxing.common.a a() {
        /*
            r8 = this;
            com.google.zxing.aztec.encoder.f r0 = com.google.zxing.aztec.encoder.f.f62638e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L8:
            byte[] r3 = r8.f62634a
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = r1
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = r1
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.e(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            com.google.zxing.aztec.encoder.d$a r1 = new com.google.zxing.aztec.encoder.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.google.zxing.aztec.encoder.f r0 = (com.google.zxing.aztec.encoder.f) r0
            byte[] r1 = r8.f62634a
            com.google.zxing.common.a r0 = r0.k(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.d.a():com.google.zxing.common.a");
    }
}
