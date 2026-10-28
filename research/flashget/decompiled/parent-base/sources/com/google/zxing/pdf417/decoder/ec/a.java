package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;

/* compiled from: ErrorCorrection.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f63214a = b.f63215f;

    private int[] b(c cVar) throws ChecksumException {
        int e4 = cVar.e();
        int[] iArr = new int[e4];
        int i4 = 0;
        for (int i5 = 1; i5 < this.f63214a.e() && i4 < e4; i5++) {
            if (cVar.b(i5) == 0) {
                iArr[i4] = this.f63214a.g(i5);
                i4++;
            }
        }
        if (i4 == e4) {
            return iArr;
        }
        throw ChecksumException.a();
    }

    private int[] c(c cVar, c cVar2, int[] iArr) {
        int e4 = cVar2.e();
        int[] iArr2 = new int[e4];
        for (int i4 = 1; i4 <= e4; i4++) {
            iArr2[e4 - i4] = this.f63214a.i(i4, cVar2.c(i4));
        }
        c cVar3 = new c(this.f63214a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            int g4 = this.f63214a.g(iArr[i5]);
            iArr3[i5] = this.f63214a.i(this.f63214a.j(0, cVar.b(g4)), this.f63214a.g(cVar3.b(g4)));
        }
        return iArr3;
    }

    private c[] d(c cVar, c cVar2, int i4) throws ChecksumException {
        if (cVar.e() < cVar2.e()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        c f4 = this.f63214a.f();
        c d5 = this.f63214a.d();
        while (true) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
            c cVar4 = d5;
            c cVar5 = f4;
            f4 = cVar4;
            if (cVar.e() < i4 / 2) {
                int c5 = f4.c(0);
                if (c5 == 0) {
                    throw ChecksumException.a();
                }
                int g4 = this.f63214a.g(c5);
                return new c[]{f4.g(g4), cVar.g(g4)};
            }
            if (cVar.f()) {
                throw ChecksumException.a();
            }
            c f5 = this.f63214a.f();
            int g5 = this.f63214a.g(cVar.c(cVar.e()));
            while (cVar2.e() >= cVar.e() && !cVar2.f()) {
                int e4 = cVar2.e() - cVar.e();
                int i5 = this.f63214a.i(cVar2.c(cVar2.e()), g5);
                f5 = f5.a(this.f63214a.b(e4, i5));
                cVar2 = cVar2.k(cVar.i(e4, i5));
            }
            d5 = f5.h(f4).k(cVar5).j();
        }
    }

    public int a(int[] iArr, int i4, int[] iArr2) throws ChecksumException {
        c cVar = new c(this.f63214a, iArr);
        int[] iArr3 = new int[i4];
        boolean z4 = false;
        for (int i5 = i4; i5 > 0; i5--) {
            int b5 = cVar.b(this.f63214a.c(i5));
            iArr3[i4 - i5] = b5;
            if (b5 != 0) {
                z4 = true;
            }
        }
        if (!z4) {
            return 0;
        }
        c d5 = this.f63214a.d();
        if (iArr2 != null) {
            for (int i6 : iArr2) {
                int c5 = this.f63214a.c((iArr.length - 1) - i6);
                b bVar = this.f63214a;
                d5 = d5.h(new c(bVar, new int[]{bVar.j(0, c5), 1}));
            }
        }
        c[] d6 = d(this.f63214a.b(i4, 1), new c(this.f63214a, iArr3), i4);
        c cVar2 = d6[0];
        c cVar3 = d6[1];
        int[] b6 = b(cVar2);
        int[] c6 = c(cVar3, cVar2, b6);
        for (int i7 = 0; i7 < b6.length; i7++) {
            int length = (iArr.length - 1) - this.f63214a.h(b6[i7]);
            if (length < 0) {
                throw ChecksumException.a();
            }
            iArr[length] = this.f63214a.j(iArr[length], c6[i7]);
        }
        return b6.length;
    }
}
