package oa;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import com.google.zxing.n;

/* compiled from: AztecReader.java */
/* loaded from: classes6.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[LOOP:0: B:24:0x005e->B:25:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // com.google.zxing.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.zxing.n a(com.google.zxing.c r11, java.util.Map<com.google.zxing.d, ?> r12) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        /*
            r10 = this;
            com.google.zxing.aztec.detector.a r0 = new com.google.zxing.aztec.detector.a
            com.google.zxing.common.b r11 = r11.b()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            oa.a r2 = r0.b(r11)     // Catch: com.google.zxing.FormatException -> L25 com.google.zxing.NotFoundException -> L28
            com.google.zxing.p[] r3 = r2.b()     // Catch: com.google.zxing.FormatException -> L25 com.google.zxing.NotFoundException -> L28
            com.google.zxing.aztec.decoder.a r4 = new com.google.zxing.aztec.decoder.a     // Catch: com.google.zxing.FormatException -> L21 com.google.zxing.NotFoundException -> L23
            r4.<init>()     // Catch: com.google.zxing.FormatException -> L21 com.google.zxing.NotFoundException -> L23
            com.google.zxing.common.e r2 = r4.c(r2)     // Catch: com.google.zxing.FormatException -> L21 com.google.zxing.NotFoundException -> L23
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L31
        L21:
            r2 = move-exception
            goto L2b
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r3 = r1
            goto L2b
        L28:
            r2 = move-exception
            r3 = r1
            goto L2f
        L2b:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L31
        L2f:
            r4 = r3
            r3 = r1
        L31:
            if (r1 != 0) goto L45
            r1 = 1
            oa.a r0 = r0.b(r1)     // Catch: com.google.zxing.FormatException -> L47 com.google.zxing.NotFoundException -> L49
            com.google.zxing.p[] r4 = r0.b()     // Catch: com.google.zxing.FormatException -> L47 com.google.zxing.NotFoundException -> L49
            com.google.zxing.aztec.decoder.a r1 = new com.google.zxing.aztec.decoder.a     // Catch: com.google.zxing.FormatException -> L47 com.google.zxing.NotFoundException -> L49
            r1.<init>()     // Catch: com.google.zxing.FormatException -> L47 com.google.zxing.NotFoundException -> L49
            com.google.zxing.common.e r1 = r1.c(r0)     // Catch: com.google.zxing.FormatException -> L47 com.google.zxing.NotFoundException -> L49
        L45:
            r6 = r4
            goto L51
        L47:
            r11 = move-exception
            goto L4a
        L49:
            r11 = move-exception
        L4a:
            if (r2 != 0) goto L50
            if (r3 == 0) goto L4f
            throw r3
        L4f:
            throw r11
        L50:
            throw r2
        L51:
            if (r12 == 0) goto L68
            com.google.zxing.d r0 = com.google.zxing.d.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            com.google.zxing.q r12 = (com.google.zxing.q) r12
            if (r12 == 0) goto L68
            int r0 = r6.length
        L5e:
            if (r11 >= r0) goto L68
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L5e
        L68:
            com.google.zxing.n r11 = new com.google.zxing.n
            java.lang.String r3 = r1.j()
            byte[] r4 = r1.g()
            int r5 = r1.e()
            com.google.zxing.a r7 = com.google.zxing.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.a()
            if (r12 == 0) goto L8b
            com.google.zxing.o r0 = com.google.zxing.o.BYTE_SEGMENTS
            r11.j(r0, r12)
        L8b:
            java.lang.String r12 = r1.b()
            if (r12 == 0) goto L96
            com.google.zxing.o r0 = com.google.zxing.o.ERROR_CORRECTION_LEVEL
            r11.j(r0, r12)
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.b.a(com.google.zxing.c, java.util.Map):com.google.zxing.n");
    }

    @Override // com.google.zxing.m
    public n c(com.google.zxing.c cVar) throws NotFoundException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.m
    public void reset() {
    }
}
