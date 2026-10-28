package org.mp4parser.aspectj.lang;

/* loaded from: classes9.dex */
public class NoAspectBoundException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    Throwable f87677b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NoAspectBoundException(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L3
            goto L19
        L3:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Exception while initializing "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L19:
            r2.<init>(r3)
            r2.f87677b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mp4parser.aspectj.lang.NoAspectBoundException.<init>(java.lang.String, java.lang.Throwable):void");
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f87677b;
    }

    public NoAspectBoundException() {
    }
}
