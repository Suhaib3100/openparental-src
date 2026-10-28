package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.p;

/* compiled from: BoundingBox.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f63172a;

    /* renamed from: b, reason: collision with root package name */
    private final p f63173b;

    /* renamed from: c, reason: collision with root package name */
    private final p f63174c;

    /* renamed from: d, reason: collision with root package name */
    private final p f63175d;

    /* renamed from: e, reason: collision with root package name */
    private final p f63176e;

    /* renamed from: f, reason: collision with root package name */
    private final int f63177f;

    /* renamed from: g, reason: collision with root package name */
    private final int f63178g;

    /* renamed from: h, reason: collision with root package name */
    private final int f63179h;

    /* renamed from: i, reason: collision with root package name */
    private final int f63180i;

    c(com.google.zxing.common.b bVar, p pVar, p pVar2, p pVar3, p pVar4) throws NotFoundException {
        boolean z4 = pVar == null || pVar2 == null;
        boolean z5 = pVar3 == null || pVar4 == null;
        if (z4 && z5) {
            throw NotFoundException.a();
        }
        if (z4) {
            pVar = new p(0.0f, pVar3.d());
            pVar2 = new p(0.0f, pVar4.d());
        } else if (z5) {
            pVar3 = new p(bVar.o() - 1, pVar.d());
            pVar4 = new p(bVar.o() - 1, pVar2.d());
        }
        this.f63172a = bVar;
        this.f63173b = pVar;
        this.f63174c = pVar2;
        this.f63175d = pVar3;
        this.f63176e = pVar4;
        this.f63177f = (int) Math.min(pVar.c(), pVar2.c());
        this.f63178g = (int) Math.max(pVar3.c(), pVar4.c());
        this.f63179h = (int) Math.min(pVar.d(), pVar3.d());
        this.f63180i = (int) Math.max(pVar2.d(), pVar4.d());
    }

    static c j(c cVar, c cVar2) throws NotFoundException {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f63172a, cVar.f63173b, cVar.f63174c, cVar2.f63175d, cVar2.f63176e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.google.zxing.pdf417.decoder.c a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.p r0 = r12.f63173b
            com.google.zxing.p r1 = r12.f63174c
            com.google.zxing.p r2 = r12.f63175d
            com.google.zxing.p r3 = r12.f63176e
            if (r13 <= 0) goto L2a
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.google.zxing.p r13 = new com.google.zxing.p
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L27
            r8 = r13
        L25:
            r10 = r2
            goto L2c
        L27:
            r10 = r13
            r8 = r0
            goto L2c
        L2a:
            r8 = r0
            goto L25
        L2c:
            if (r14 <= 0) goto L5d
            if (r15 == 0) goto L33
            com.google.zxing.p r13 = r12.f63174c
            goto L35
        L33:
            com.google.zxing.p r13 = r12.f63176e
        L35:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.google.zxing.common.b r14 = r12.f63172a
            int r14 = r14.k()
            if (r0 < r14) goto L4b
            com.google.zxing.common.b r14 = r12.f63172a
            int r14 = r14.k()
            int r0 = r14 + (-1)
        L4b:
            com.google.zxing.p r14 = new com.google.zxing.p
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L5a
            r9 = r14
        L58:
            r11 = r3
            goto L5f
        L5a:
            r11 = r14
            r9 = r1
            goto L5f
        L5d:
            r9 = r1
            goto L58
        L5f:
            com.google.zxing.pdf417.decoder.c r13 = new com.google.zxing.pdf417.decoder.c
            com.google.zxing.common.b r7 = r12.f63172a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.c.a(int, int, boolean):com.google.zxing.pdf417.decoder.c");
    }

    p b() {
        return this.f63174c;
    }

    p c() {
        return this.f63176e;
    }

    int d() {
        return this.f63178g;
    }

    int e() {
        return this.f63180i;
    }

    int f() {
        return this.f63177f;
    }

    int g() {
        return this.f63179h;
    }

    p h() {
        return this.f63173b;
    }

    p i() {
        return this.f63175d;
    }

    c(c cVar) {
        this.f63172a = cVar.f63172a;
        this.f63173b = cVar.f63173b;
        this.f63174c = cVar.f63174c;
        this.f63175d = cVar.f63175d;
        this.f63176e = cVar.f63176e;
        this.f63177f = cVar.f63177f;
        this.f63178g = cVar.f63178g;
        this.f63179h = cVar.f63179h;
        this.f63180i = cVar.f63180i;
    }
}
