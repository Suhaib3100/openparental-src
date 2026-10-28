package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.n;
import com.google.zxing.oned.r;
import com.google.zxing.p;
import com.google.zxing.q;
import com.tencent.rtmp.TXLiveConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: RSS14Reader.java */
/* loaded from: classes6.dex */
public final class e extends a {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f63074m = {1, 10, 34, 70, 126};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f63075n = {4, 20, 48, 81};

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f63076o = {0, 161, 961, TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC, 2715};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f63077p = {0, 336, 1036, 1516};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f63078q = {8, 6, 4, 3, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f63079r = {2, 4, 6, 8};

    /* renamed from: s, reason: collision with root package name */
    private static final int[][] f63080s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: k, reason: collision with root package name */
    private final List<d> f63081k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final List<d> f63082l = new ArrayList();

    private static void s(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        for (d dVar2 : collection) {
            if (dVar2.b() == dVar.b()) {
                dVar2.e();
                return;
            }
        }
        collection.add(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0028, code lost:
    
        if (r1 < 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x002a, code lost:
    
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x002d, code lost:
    
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0044, code lost:
    
        if (r1 < 4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.e.t(boolean, int):void");
    }

    private static boolean u(d dVar, d dVar2) {
        int a5 = ((dVar2.a() * 16) + dVar.a()) % 79;
        int c5 = dVar2.d().c() + (dVar.d().c() * 9);
        if (c5 > 72) {
            c5--;
        }
        if (c5 > 8) {
            c5--;
        }
        return a5 == c5;
    }

    private static n v(d dVar, d dVar2) {
        String valueOf = String.valueOf((dVar.b() * 4537077) + dVar2.b());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i4 = 0;
        for (int i5 = 0; i5 < 13; i5++) {
            int charAt = sb.charAt(i5) - '0';
            if ((i5 & 1) == 0) {
                charAt *= 3;
            }
            i4 += charAt;
        }
        int i6 = 10 - (i4 % 10);
        if (i6 == 10) {
            i6 = 0;
        }
        sb.append(i6);
        p[] a5 = dVar.d().a();
        p[] a6 = dVar2.d().a();
        return new n(sb.toString(), null, new p[]{a5[0], a5[1], a6[0], a6[1]}, com.google.zxing.a.RSS_14);
    }

    private b w(com.google.zxing.common.a aVar, c cVar, boolean z4) throws NotFoundException {
        int[] j4 = j();
        Arrays.fill(j4, 0);
        if (z4) {
            r.g(aVar, cVar.b()[0], j4);
        } else {
            r.f(aVar, cVar.b()[1], j4);
            int i4 = 0;
            for (int length = j4.length - 1; i4 < length; length--) {
                int i5 = j4[i4];
                j4[i4] = j4[length];
                j4[length] = i5;
                i4++;
            }
        }
        int i6 = z4 ? 16 : 15;
        float d5 = pa.a.d(j4) / i6;
        int[] n4 = n();
        int[] l4 = l();
        float[] o4 = o();
        float[] m4 = m();
        for (int i7 = 0; i7 < j4.length; i7++) {
            float f4 = j4[i7] / d5;
            int i10 = (int) (0.5f + f4);
            if (i10 <= 0) {
                i10 = 1;
            } else if (i10 > 8) {
                i10 = 8;
            }
            int i11 = i7 / 2;
            if ((i7 & 1) == 0) {
                n4[i11] = i10;
                o4[i11] = f4 - i10;
            } else {
                l4[i11] = i10;
                m4[i11] = f4 - i10;
            }
        }
        t(z4, i6);
        int i12 = 0;
        int i13 = 0;
        for (int length2 = n4.length - 1; length2 >= 0; length2--) {
            int i14 = n4[length2];
            i12 = (i12 * 9) + i14;
            i13 += i14;
        }
        int i15 = 0;
        int i16 = 0;
        for (int length3 = l4.length - 1; length3 >= 0; length3--) {
            int i17 = l4[length3];
            i15 = (i15 * 9) + i17;
            i16 += i17;
        }
        int i18 = (i15 * 3) + i12;
        if (!z4) {
            if ((i16 & 1) != 0 || i16 > 10 || i16 < 4) {
                throw NotFoundException.a();
            }
            int i19 = (10 - i16) / 2;
            int i20 = f63079r[i19];
            return new b((f.b(l4, 9 - i20, false) * f63075n[i19]) + f.b(n4, i20, true) + f63077p[i19], i18);
        }
        if ((i13 & 1) != 0 || i13 > 12 || i13 < 4) {
            throw NotFoundException.a();
        }
        int i21 = (12 - i13) / 2;
        int i22 = f63078q[i21];
        return new b((f.b(n4, i22, false) * f63074m[i21]) + f.b(l4, 9 - i22, true) + f63076o[i21], i18);
    }

    private d x(com.google.zxing.common.a aVar, boolean z4, int i4, Map<com.google.zxing.d, ?> map) {
        try {
            c z5 = z(aVar, i4, z4, y(aVar, z4));
            q qVar = map == null ? null : (q) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
            if (qVar != null) {
                int[] b5 = z5.b();
                float f4 = ((b5[0] + b5[1]) - 1) / 2.0f;
                if (z4) {
                    f4 = (aVar.o() - 1) - f4;
                }
                qVar.a(new p(f4, i4));
            }
            b w4 = w(aVar, z5, true);
            b w5 = w(aVar, z5, false);
            return new d((w4.b() * 1597) + w5.b(), (w5.a() * 4) + w4.a(), z5);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private int[] y(com.google.zxing.common.a aVar, boolean z4) throws NotFoundException {
        int[] k4 = k();
        k4[0] = 0;
        k4[1] = 0;
        k4[2] = 0;
        k4[3] = 0;
        int o4 = aVar.o();
        int i4 = 0;
        boolean z5 = false;
        while (i4 < o4) {
            z5 = !aVar.k(i4);
            if (z4 == z5) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        int i6 = i4;
        while (i4 < o4) {
            if (aVar.k(i4) != z5) {
                k4[i5] = k4[i5] + 1;
            } else {
                if (i5 != 3) {
                    i5++;
                } else {
                    if (a.q(k4)) {
                        return new int[]{i6, i4};
                    }
                    i6 += k4[0] + k4[1];
                    k4[0] = k4[2];
                    k4[1] = k4[3];
                    k4[2] = 0;
                    k4[3] = 0;
                    i5--;
                }
                k4[i5] = 1;
                z5 = !z5;
            }
            i4++;
        }
        throw NotFoundException.a();
    }

    private c z(com.google.zxing.common.a aVar, int i4, boolean z4, int[] iArr) throws NotFoundException {
        int i5;
        int i6;
        boolean k4 = aVar.k(iArr[0]);
        int i7 = iArr[0] - 1;
        while (i7 >= 0 && k4 != aVar.k(i7)) {
            i7--;
        }
        int i10 = i7 + 1;
        int i11 = iArr[0] - i10;
        int[] k5 = k();
        System.arraycopy(k5, 0, k5, 1, k5.length - 1);
        k5[0] = i11;
        int r4 = a.r(k5, f63080s);
        int i12 = iArr[1];
        if (z4) {
            int o4 = (aVar.o() - 1) - i10;
            i5 = (aVar.o() - 1) - i12;
            i6 = o4;
        } else {
            i5 = i12;
            i6 = i10;
        }
        return new c(r4, new int[]{i10, iArr[1]}, i6, i5, i4);
    }

    @Override // com.google.zxing.oned.r
    public n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        s(this.f63081k, x(aVar, false, i4, map));
        aVar.s();
        s(this.f63082l, x(aVar, true, i4, map));
        aVar.s();
        for (d dVar : this.f63081k) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f63082l) {
                    if (dVar2.c() > 1 && u(dVar, dVar2)) {
                        return v(dVar, dVar2);
                    }
                }
            }
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.m
    public void reset() {
        this.f63081k.clear();
        this.f63082l.clear();
    }
}
