package com.google.zxing.oned.rss.expanded;

import androidx.core.graphics.y;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.n;
import com.google.zxing.oned.r;
import com.google.zxing.oned.rss.expanded.decoders.j;
import com.google.zxing.oned.rss.f;
import com.google.zxing.p;
import com.luck.picture.lib.config.PictureConfig;
import com.tencent.beacon.event.open.EventResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: RSSExpandedReader.java */
/* loaded from: classes6.dex */
public final class d extends com.google.zxing.oned.rss.a {
    private static final int A = 11;

    /* renamed from: t, reason: collision with root package name */
    private static final int f63094t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static final int f63095u = 1;

    /* renamed from: v, reason: collision with root package name */
    private static final int f63096v = 2;

    /* renamed from: w, reason: collision with root package name */
    private static final int f63097w = 3;

    /* renamed from: x, reason: collision with root package name */
    private static final int f63098x = 4;

    /* renamed from: y, reason: collision with root package name */
    private static final int f63099y = 5;

    /* renamed from: k, reason: collision with root package name */
    private final List<b> f63101k = new ArrayList(11);

    /* renamed from: l, reason: collision with root package name */
    private final List<c> f63102l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private final int[] f63103m = new int[2];

    /* renamed from: n, reason: collision with root package name */
    private boolean f63104n;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f63089o = {7, 5, 4, 3, 1};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f63090p = {4, 20, 52, 104, 204};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f63091q = {0, 348, 1388, 2948, 3988};

    /* renamed from: r, reason: collision with root package name */
    private static final int[][] f63092r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: s, reason: collision with root package name */
    private static final int[][] f63093s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, SmsConstants.MAX_USER_DATA_BYTES, 209, HttpStatus.SC_RESET_CONTENT}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, SyslogAppender.LOG_LOCAL1, 197, 169, 85, 44, UserData.IS91_MSG_TYPE_CLI}, new int[]{185, UserData.IS91_MSG_TYPE_SHORT_MESSAGE, PictureConfig.CHOOSE_REQUEST, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, 37, 111, 122, 155}, new int[]{43, 129, SyslogAppender.LOG_LOCAL6, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, SyslogAppender.LOG_LOCAL7, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, 179, 115}, new int[]{SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, EventResult.ERROR_CODE_OTHER, 175}, new int[]{103, 98, 83, 38, 114, UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: z, reason: collision with root package name */
    private static final int[][] f63100z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    private static int A(com.google.zxing.common.a aVar, int i4) {
        return aVar.k(i4) ? aVar.m(aVar.n(i4)) : aVar.n(aVar.m(i4));
    }

    private static boolean C(com.google.zxing.oned.rss.c cVar, boolean z4, boolean z5) {
        return (cVar.c() == 0 && z4 && z5) ? false : true;
    }

    private static boolean D(Iterable<b> iterable, Iterable<c> iterable2) {
        for (c cVar : iterable2) {
            for (b bVar : iterable) {
                Iterator<b> it = cVar.a().iterator();
                while (it.hasNext()) {
                    if (bVar.equals(it.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean E(List<b> list) {
        for (int[] iArr : f63100z) {
            if (list.size() <= iArr.length) {
                for (int i4 = 0; i4 < list.size(); i4++) {
                    if (list.get(i4).a().c() != iArr[i4]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private com.google.zxing.oned.rss.c F(com.google.zxing.common.a aVar, int i4, boolean z4) {
        int i5;
        int i6;
        int i7;
        if (z4) {
            int i10 = this.f63103m[0] - 1;
            while (i10 >= 0 && !aVar.k(i10)) {
                i10--;
            }
            int i11 = i10 + 1;
            int[] iArr = this.f63103m;
            i7 = iArr[0] - i11;
            i5 = iArr[1];
            i6 = i11;
        } else {
            int[] iArr2 = this.f63103m;
            int i12 = iArr2[0];
            int n4 = aVar.n(iArr2[1] + 1);
            i5 = n4;
            i6 = i12;
            i7 = n4 - this.f63103m[1];
        }
        int[] k4 = k();
        System.arraycopy(k4, 0, k4, 1, k4.length - 1);
        k4[0] = i7;
        try {
            return new com.google.zxing.oned.rss.c(com.google.zxing.oned.rss.a.r(k4, f63092r), new int[]{i6, i5}, i6, i5, i4);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void G(Collection<b> collection, Collection<c> collection2) {
        Iterator<c> it = collection2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != collection.size()) {
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    } else if (!collection.contains(it2.next())) {
                        break;
                    }
                }
            }
        }
    }

    private static void I(int[] iArr) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length / 2; i4++) {
            int i5 = iArr[i4];
            int i6 = (length - i4) - 1;
            iArr[i4] = iArr[i6];
            iArr[i6] = i5;
        }
    }

    private void J(int i4) {
        boolean z4;
        int i5 = 0;
        boolean z5 = false;
        while (true) {
            if (i5 >= this.f63102l.size()) {
                z4 = false;
                break;
            }
            c cVar = this.f63102l.get(i5);
            if (cVar.b() > i4) {
                z4 = cVar.c(this.f63101k);
                break;
            } else {
                z5 = cVar.c(this.f63101k);
                i5++;
            }
        }
        if (z4 || z5 || D(this.f63101k, this.f63102l)) {
            return;
        }
        this.f63102l.add(i5, new c(this.f63101k, i4, false));
        G(this.f63101k, this.f63102l);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s(int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.d.s(int):void");
    }

    private boolean t() {
        b bVar = this.f63101k.get(0);
        com.google.zxing.oned.rss.b b5 = bVar.b();
        com.google.zxing.oned.rss.b c5 = bVar.c();
        if (c5 == null) {
            return false;
        }
        int a5 = c5.a();
        int i4 = 2;
        for (int i5 = 1; i5 < this.f63101k.size(); i5++) {
            b bVar2 = this.f63101k.get(i5);
            int a6 = bVar2.b().a() + a5;
            int i6 = i4 + 1;
            com.google.zxing.oned.rss.b c6 = bVar2.c();
            if (c6 != null) {
                a5 = c6.a() + a6;
                i4 += 2;
            } else {
                i4 = i6;
                a5 = a6;
            }
        }
        return y.a(i4, 4, 211, a5 % 211) == b5.b();
    }

    private List<b> u(List<c> list, int i4) throws NotFoundException {
        while (i4 < this.f63102l.size()) {
            c cVar = this.f63102l.get(i4);
            this.f63101k.clear();
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                this.f63101k.addAll(it.next().a());
            }
            this.f63101k.addAll(cVar.a());
            if (E(this.f63101k)) {
                if (t()) {
                    return this.f63101k;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return u(arrayList, i4 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i4++;
        }
        throw NotFoundException.a();
    }

    private List<b> v(boolean z4) {
        List<b> list = null;
        if (this.f63102l.size() > 25) {
            this.f63102l.clear();
            return null;
        }
        this.f63101k.clear();
        if (z4) {
            Collections.reverse(this.f63102l);
        }
        try {
            list = u(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z4) {
            Collections.reverse(this.f63102l);
        }
        return list;
    }

    static n w(List<b> list) throws NotFoundException, FormatException {
        String d5 = j.a(a.a(list)).d();
        p[] a5 = list.get(0).a().a();
        p[] a6 = ((b) androidx.appcompat.view.menu.d.a(list, 1)).a().a();
        return new n(d5, null, new p[]{a5[0], a5[1], a6[0], a6[1]}, com.google.zxing.a.RSS_EXPANDED);
    }

    private void z(com.google.zxing.common.a aVar, List<b> list, int i4) throws NotFoundException {
        int[] k4 = k();
        k4[0] = 0;
        k4[1] = 0;
        k4[2] = 0;
        k4[3] = 0;
        int o4 = aVar.o();
        if (i4 < 0) {
            i4 = list.isEmpty() ? 0 : ((b) androidx.appcompat.view.menu.d.a(list, 1)).a().b()[1];
        }
        boolean z4 = list.size() % 2 != 0;
        if (this.f63104n) {
            z4 = !z4;
        }
        boolean z5 = false;
        while (true) {
            if (i4 >= o4) {
                break;
            }
            boolean k5 = aVar.k(i4);
            boolean z6 = !k5;
            if (k5) {
                z5 = z6;
                break;
            } else {
                i4++;
                z5 = z6;
            }
        }
        int i5 = 0;
        boolean z7 = z5;
        int i6 = i4;
        while (i4 < o4) {
            if (aVar.k(i4) != z7) {
                k4[i5] = k4[i5] + 1;
            } else {
                if (i5 == 3) {
                    if (z4) {
                        I(k4);
                    }
                    if (com.google.zxing.oned.rss.a.q(k4)) {
                        int[] iArr = this.f63103m;
                        iArr[0] = i6;
                        iArr[1] = i4;
                        return;
                    }
                    if (z4) {
                        I(k4);
                    }
                    i6 += k4[0] + k4[1];
                    k4[0] = k4[2];
                    k4[1] = k4[3];
                    k4[2] = 0;
                    k4[3] = 0;
                    i5--;
                } else {
                    i5++;
                }
                k4[i5] = 1;
                z7 = !z7;
            }
            i4++;
        }
        throw NotFoundException.a();
    }

    List<c> B() {
        return this.f63102l;
    }

    b H(com.google.zxing.common.a aVar, List<b> list, int i4) throws NotFoundException {
        com.google.zxing.oned.rss.c F;
        com.google.zxing.oned.rss.b bVar;
        boolean z4 = list.size() % 2 == 0;
        if (this.f63104n) {
            z4 = !z4;
        }
        int i5 = -1;
        boolean z5 = true;
        do {
            z(aVar, list, i5);
            F = F(aVar, i4, z4);
            if (F == null) {
                i5 = A(aVar, this.f63103m[0]);
            } else {
                z5 = false;
            }
        } while (z5);
        com.google.zxing.oned.rss.b x4 = x(aVar, F, z4, true);
        if (!list.isEmpty() && ((b) androidx.appcompat.view.menu.d.a(list, 1)).d()) {
            throw NotFoundException.a();
        }
        try {
            bVar = x(aVar, F, z4, false);
        } catch (NotFoundException unused) {
            bVar = null;
        }
        return new b(x4, bVar, F);
    }

    @Override // com.google.zxing.oned.r
    public n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        this.f63101k.clear();
        this.f63104n = false;
        try {
            return w(y(i4, aVar));
        } catch (NotFoundException unused) {
            this.f63101k.clear();
            this.f63104n = true;
            return w(y(i4, aVar));
        }
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.m
    public void reset() {
        this.f63101k.clear();
        this.f63102l.clear();
    }

    com.google.zxing.oned.rss.b x(com.google.zxing.common.a aVar, com.google.zxing.oned.rss.c cVar, boolean z4, boolean z5) throws NotFoundException {
        int[] j4 = j();
        Arrays.fill(j4, 0);
        if (z5) {
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
        float d5 = pa.a.d(j4) / 17.0f;
        float f4 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(d5 - f4) / f4 > 0.3f) {
            throw NotFoundException.a();
        }
        int[] n4 = n();
        int[] l4 = l();
        float[] o4 = o();
        float[] m4 = m();
        for (int i6 = 0; i6 < j4.length; i6++) {
            float f5 = (j4[i6] * 1.0f) / d5;
            int i7 = (int) (0.5f + f5);
            if (i7 <= 0) {
                if (f5 < 0.3f) {
                    throw NotFoundException.a();
                }
                i7 = 1;
            } else if (i7 > 8) {
                if (f5 > 8.7f) {
                    throw NotFoundException.a();
                }
                i7 = 8;
            }
            int i10 = i6 / 2;
            if ((i6 & 1) == 0) {
                n4[i10] = i7;
                o4[i10] = f5 - i7;
            } else {
                l4[i10] = i7;
                m4[i10] = f5 - i7;
            }
        }
        s(17);
        int c5 = (((cVar.c() * 4) + (z4 ? 0 : 2)) + (!z5 ? 1 : 0)) - 1;
        int i11 = 0;
        int i12 = 0;
        for (int length2 = n4.length - 1; length2 >= 0; length2--) {
            if (C(cVar, z4, z5)) {
                i11 += n4[length2] * f63093s[c5][length2 * 2];
            }
            i12 += n4[length2];
        }
        int i13 = 0;
        for (int length3 = l4.length - 1; length3 >= 0; length3--) {
            if (C(cVar, z4, z5)) {
                i13 += l4[length3] * f63093s[c5][(length3 * 2) + 1];
            }
        }
        int i14 = i11 + i13;
        if ((i12 & 1) != 0 || i12 > 13 || i12 < 4) {
            throw NotFoundException.a();
        }
        int i15 = (13 - i12) / 2;
        int i16 = f63089o[i15];
        return new com.google.zxing.oned.rss.b((f.b(n4, i16, true) * f63090p[i15]) + f.b(l4, 9 - i16, false) + f63091q[i15], i14);
    }

    List<b> y(int i4, com.google.zxing.common.a aVar) throws NotFoundException {
        boolean z4 = false;
        while (!z4) {
            try {
                List<b> list = this.f63101k;
                list.add(H(aVar, list, i4));
            } catch (NotFoundException e4) {
                if (this.f63101k.isEmpty()) {
                    throw e4;
                }
                z4 = true;
            }
        }
        if (t()) {
            return this.f63101k;
        }
        boolean isEmpty = this.f63102l.isEmpty();
        J(i4);
        if (!isEmpty) {
            List<b> v4 = v(false);
            if (v4 != null) {
                return v4;
            }
            List<b> v5 = v(true);
            if (v5 != null) {
                return v5;
            }
        }
        throw NotFoundException.a();
    }
}
