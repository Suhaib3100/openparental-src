package org.apache.log4j.spi;

import java.io.Serializable;
import org.apache.log4j.Category;

/* loaded from: classes3.dex */
public class ThrowableInformation implements Serializable {
    static final long serialVersionUID = -4748765566864322735L;
    private transient Category category;
    private String[] rep;
    private transient Throwable throwable;

    public ThrowableInformation(Throwable th) {
        this.throwable = th;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:9:0x0011, B:11:0x001d, B:12:0x0026, B:14:0x002e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:9:0x0011, B:11:0x001d, B:12:0x0026, B:14:0x002e), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String[] getThrowableStrRep() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String[] r0 = r2.rep     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L2e
            org.apache.log4j.Category r0 = r2.category     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1a
            org.apache.log4j.spi.LoggerRepository r0 = r0.getLoggerRepository()     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0 instanceof org.apache.log4j.spi.ThrowableRendererSupport     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            org.apache.log4j.spi.ThrowableRendererSupport r0 = (org.apache.log4j.spi.ThrowableRendererSupport) r0     // Catch: java.lang.Throwable -> L18
            org.apache.log4j.spi.ThrowableRenderer r0 = r0.getThrowableRenderer()     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            goto L38
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L26
            java.lang.Throwable r0 = r2.throwable     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r0 = org.apache.log4j.DefaultThrowableRenderer.render(r0)     // Catch: java.lang.Throwable -> L18
            r2.rep = r0     // Catch: java.lang.Throwable -> L18
            goto L2e
        L26:
            java.lang.Throwable r1 = r2.throwable     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r0 = r0.doRender(r1)     // Catch: java.lang.Throwable -> L18
            r2.rep = r0     // Catch: java.lang.Throwable -> L18
        L2e:
            java.lang.String[] r0 = r2.rep     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return r0
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.log4j.spi.ThrowableInformation.getThrowableStrRep():java.lang.String[]");
    }

    public ThrowableInformation(Throwable th, Category category) {
        this.throwable = th;
        this.category = category;
    }

    public ThrowableInformation(String[] strArr) {
        if (strArr != null) {
            this.rep = (String[]) strArr.clone();
        }
    }
}
