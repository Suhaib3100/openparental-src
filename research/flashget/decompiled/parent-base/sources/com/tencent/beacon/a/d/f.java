package com.tencent.beacon.a.d;

/* compiled from: PropertiesFile.java */
/* loaded from: classes6.dex */
class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f71127a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f71128b;

    f(g gVar, Runnable runnable) {
        this.f71128b = gVar;
        this.f71127a = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r2.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r2 != null) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "゚\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.tencent.beacon.a.d.g r1 = r6.f71128b
            monitor-enter(r1)
            r2 = 0
            com.tencent.beacon.a.d.g r3 = r6.f71128b     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            java.nio.channels.FileChannel r3 = com.tencent.beacon.a.d.g.e(r3)     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            java.nio.channels.FileLock r2 = r3.lock()     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            java.lang.Runnable r3 = r6.f71127a     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            r3.run()     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            if (r2 == 0) goto L58
            goto L52
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            r0 = move-exception
            goto L5a
        L20:
            java.lang.String r4 = "゛\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L1e
            r5.append(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1e
            com.tencent.beacon.base.util.c.b(r4, r0)     // Catch: java.lang.Throwable -> L1e
            com.tencent.beacon.a.b.j r0 = com.tencent.beacon.a.b.j.e()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "゜\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            java.lang.String r5 = "ゝ\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r0.a(r4, r5, r3)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L58
        L52:
            r2.release()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            goto L58
        L56:
            r0 = move-exception
            goto L60
        L58:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            return
        L5a:
            if (r2 == 0) goto L5f
            r2.release()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5f
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L56
        L60:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.f.run():void");
    }
}
