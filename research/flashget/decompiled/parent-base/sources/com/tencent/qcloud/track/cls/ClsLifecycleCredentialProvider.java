package com.tencent.qcloud.track.cls;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public abstract class ClsLifecycleCredentialProvider {
    private volatile ClsSessionCredentials credentials;
    private ReentrantLock lock = new ReentrantLock();

    private synchronized ClsSessionCredentials safeGetCredentials() {
        return this.credentials;
    }

    private synchronized void safeSetCredentials(ClsSessionCredentials clsSessionCredentials) {
        this.credentials = clsSessionCredentials;
    }

    protected abstract ClsSessionCredentials fetchNewCredentials() throws ClsAuthenticationException;

    public synchronized void forceInvalidationCredential() {
        safeSetCredentials(null);
    }

    public ClsSessionCredentials getCredentials() throws ClsAuthenticationException {
        ClsSessionCredentials safeGetCredentials = safeGetCredentials();
        if (safeGetCredentials != null && safeGetCredentials.isValid()) {
            return safeGetCredentials;
        }
        refresh();
        return safeGetCredentials();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refresh() throws com.tencent.qcloud.track.cls.ClsAuthenticationException {
        /*
            r7 = this;
            java.lang.String r0 = "孴\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r1 = "孵\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r2 = 0
            java.util.concurrent.locks.ReentrantLock r3 = r7.lock     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            r5 = 20
            boolean r2 = r3.tryLock(r5, r4)     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            if (r2 == 0) goto L59
            com.tencent.qcloud.track.cls.ClsSessionCredentials r3 = r7.safeGetCredentials()     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            if (r3 == 0) goto L2a
            boolean r3 = r3.isValid()     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            if (r3 != 0) goto L35
            goto L2a
        L26:
            r0 = move-exception
            goto L7b
        L28:
            r1 = move-exception
            goto L65
        L2a:
            r3 = 0
            r7.safeSetCredentials(r3)     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            com.tencent.qcloud.track.cls.ClsSessionCredentials r3 = r7.fetchNewCredentials()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3d
            r7.safeSetCredentials(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3d
        L35:
            if (r2 == 0) goto L3c
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            r0.unlock()
        L3c:
            return
        L3d:
            r3 = move-exception
            boolean r4 = r3 instanceof com.tencent.qcloud.track.cls.ClsAuthenticationException     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            if (r4 == 0) goto L43
            throw r3     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
        L43:
            com.tencent.qcloud.track.cls.ClsAuthenticationException r4 = new com.tencent.qcloud.track.cls.ClsAuthenticationException     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            java.lang.String r1 = r3.getMessage()     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            r5.append(r1)     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            throw r4     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
        L59:
            com.tencent.qcloud.track.cls.ClsAuthenticationException r1 = new com.tencent.qcloud.track.cls.ClsAuthenticationException     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            java.lang.String r3 = "孶\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
            throw r1     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
        L65:
            com.tencent.qcloud.track.cls.ClsAuthenticationException r3 = new com.tencent.qcloud.track.cls.ClsAuthenticationException     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L26
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L26
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L26
        L7b:
            if (r2 == 0) goto L82
            java.util.concurrent.locks.ReentrantLock r1 = r7.lock
            r1.unlock()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.track.cls.ClsLifecycleCredentialProvider.refresh():void");
    }
}
