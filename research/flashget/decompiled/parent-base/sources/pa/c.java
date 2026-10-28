package pa;

import com.google.zxing.NotFoundException;
import com.google.zxing.p;

/* compiled from: WhiteRectangleDetector.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    private static final int f88680h = 10;

    /* renamed from: i, reason: collision with root package name */
    private static final int f88681i = 1;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f88682a;

    /* renamed from: b, reason: collision with root package name */
    private final int f88683b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88684c;

    /* renamed from: d, reason: collision with root package name */
    private final int f88685d;

    /* renamed from: e, reason: collision with root package name */
    private final int f88686e;

    /* renamed from: f, reason: collision with root package name */
    private final int f88687f;

    /* renamed from: g, reason: collision with root package name */
    private final int f88688g;

    public c(com.google.zxing.common.b bVar) throws NotFoundException {
        this(bVar, 10, bVar.o() / 2, bVar.k() / 2);
    }

    private p[] a(p pVar, p pVar2, p pVar3, p pVar4) {
        float c5 = pVar.c();
        float d5 = pVar.d();
        float c6 = pVar2.c();
        float d6 = pVar2.d();
        float c7 = pVar3.c();
        float d7 = pVar3.d();
        float c10 = pVar4.c();
        float d10 = pVar4.d();
        return c5 < ((float) this.f88684c) / 2.0f ? new p[]{new p(c10 - 1.0f, d10 + 1.0f), new p(c6 + 1.0f, d6 + 1.0f), new p(c7 - 1.0f, d7 - 1.0f), new p(c5 + 1.0f, d5 - 1.0f)} : new p[]{new p(c10 + 1.0f, d10 + 1.0f), new p(c6 + 1.0f, d6 - 1.0f), new p(c7 - 1.0f, d7 + 1.0f), new p(c5 - 1.0f, d5 - 1.0f)};
    }

    private boolean b(int i4, int i5, int i6, boolean z4) {
        if (z4) {
            while (i4 <= i5) {
                if (this.f88682a.f(i4, i6)) {
                    return true;
                }
                i4++;
            }
            return false;
        }
        while (i4 <= i5) {
            if (this.f88682a.f(i6, i4)) {
                return true;
            }
            i4++;
        }
        return false;
    }

    private p d(float f4, float f5, float f6, float f7) {
        int c5 = a.c(a.a(f4, f5, f6, f7));
        float f10 = c5;
        float f11 = (f6 - f4) / f10;
        float f12 = (f7 - f5) / f10;
        for (int i4 = 0; i4 < c5; i4++) {
            float f13 = i4;
            int c6 = a.c((f13 * f11) + f4);
            int c7 = a.c((f13 * f12) + f5);
            if (this.f88682a.f(c6, c7)) {
                return new p(c6, c7);
            }
        }
        return null;
    }

    public p[] c() throws NotFoundException {
        int i4 = this.f88685d;
        int i5 = this.f88686e;
        int i6 = this.f88688g;
        int i7 = this.f88687f;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z10 = false;
        boolean z11 = true;
        while (z11) {
            boolean z12 = false;
            boolean z13 = true;
            while (true) {
                if ((z13 || !z5) && i5 < this.f88684c) {
                    z13 = b(i6, i7, i5, false);
                    if (z13) {
                        i5++;
                        z5 = true;
                        z12 = true;
                    } else if (!z5) {
                        i5++;
                    }
                }
            }
            if (i5 < this.f88684c) {
                boolean z14 = true;
                while (true) {
                    if ((z14 || !z6) && i7 < this.f88683b) {
                        z14 = b(i4, i5, i7, true);
                        if (z14) {
                            i7++;
                            z6 = true;
                            z12 = true;
                        } else if (!z6) {
                            i7++;
                        }
                    }
                }
                if (i7 < this.f88683b) {
                    boolean z15 = true;
                    while (true) {
                        if ((z15 || !z7) && i4 >= 0) {
                            z15 = b(i6, i7, i4, false);
                            if (z15) {
                                i4--;
                                z7 = true;
                                z12 = true;
                            } else if (!z7) {
                                i4--;
                            }
                        }
                    }
                    if (i4 >= 0) {
                        z11 = z12;
                        boolean z16 = true;
                        while (true) {
                            if ((z16 || !z10) && i6 >= 0) {
                                z16 = b(i4, i5, i6, true);
                                if (z16) {
                                    i6--;
                                    z11 = true;
                                    z10 = true;
                                } else if (!z10) {
                                    i6--;
                                }
                            }
                        }
                        if (i6 < 0) {
                        }
                    }
                }
            }
            z4 = true;
            break;
        }
        if (z4) {
            throw NotFoundException.a();
        }
        int i10 = i5 - i4;
        p pVar = null;
        p pVar2 = null;
        for (int i11 = 1; pVar2 == null && i11 < i10; i11++) {
            pVar2 = d(i4, i7 - i11, i4 + i11, i7);
        }
        if (pVar2 == null) {
            throw NotFoundException.a();
        }
        p pVar3 = null;
        for (int i12 = 1; pVar3 == null && i12 < i10; i12++) {
            pVar3 = d(i4, i6 + i12, i4 + i12, i6);
        }
        if (pVar3 == null) {
            throw NotFoundException.a();
        }
        p pVar4 = null;
        for (int i13 = 1; pVar4 == null && i13 < i10; i13++) {
            pVar4 = d(i5, i6 + i13, i5 - i13, i6);
        }
        if (pVar4 == null) {
            throw NotFoundException.a();
        }
        for (int i14 = 1; pVar == null && i14 < i10; i14++) {
            pVar = d(i5, i7 - i14, i5 - i14, i7);
        }
        if (pVar != null) {
            return a(pVar, pVar2, pVar4, pVar3);
        }
        throw NotFoundException.a();
    }

    public c(com.google.zxing.common.b bVar, int i4, int i5, int i6) throws NotFoundException {
        this.f88682a = bVar;
        int k4 = bVar.k();
        this.f88683b = k4;
        int o4 = bVar.o();
        this.f88684c = o4;
        int i7 = i4 / 2;
        int i10 = i5 - i7;
        this.f88685d = i10;
        int i11 = i5 + i7;
        this.f88686e = i11;
        int i12 = i6 - i7;
        this.f88688g = i12;
        int i13 = i6 + i7;
        this.f88687f = i13;
        if (i12 < 0 || i10 < 0 || i13 >= k4 || i11 >= o4) {
            throw NotFoundException.a();
        }
    }
}
