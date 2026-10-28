package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudClientException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public abstract class BasicLifecycleCredentialProvider implements QCloudCredentialProvider {
    private volatile QCloudLifecycleCredentials credentials;
    private ReentrantLock lock = new ReentrantLock();

    private synchronized QCloudLifecycleCredentials safeGetCredentials() {
        return this.credentials;
    }

    private synchronized void safeSetCredentials(QCloudLifecycleCredentials qCloudLifecycleCredentials) {
        this.credentials = qCloudLifecycleCredentials;
    }

    protected abstract QCloudLifecycleCredentials fetchNewCredentials() throws QCloudClientException;

    public synchronized void forceInvalidationCredential() {
        safeSetCredentials(null);
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    public QCloudCredentials getCredentials() throws QCloudClientException {
        QCloudLifecycleCredentials safeGetCredentials = safeGetCredentials();
        if (safeGetCredentials != null && safeGetCredentials.isValid()) {
            return safeGetCredentials;
        }
        refresh();
        return safeGetCredentials();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refresh() throws com.tencent.qcloud.core.common.QCloudClientException {
        /*
            r6 = this;
            java.lang.String r0 = "墾\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r1 = 0
            java.util.concurrent.locks.ReentrantLock r2 = r6.lock     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r4 = 20
            boolean r1 = r2.tryLock(r4, r3)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            if (r1 == 0) goto L5c
            com.tencent.qcloud.core.auth.QCloudLifecycleCredentials r2 = r6.safeGetCredentials()     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            if (r2 == 0) goto L24
            boolean r2 = r2.isValid()     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            if (r2 != 0) goto L2f
            goto L24
        L20:
            r0 = move-exception
            goto L82
        L22:
            r0 = move-exception
            goto L6d
        L24:
            r2 = 0
            r6.safeSetCredentials(r2)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            com.tencent.qcloud.core.auth.QCloudLifecycleCredentials r2 = r6.fetchNewCredentials()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L37
            r6.safeSetCredentials(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L37
        L2f:
            if (r1 == 0) goto L36
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r0.unlock()
        L36:
            return
        L37:
            r2 = move-exception
            boolean r3 = r2 instanceof com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            if (r3 == 0) goto L3d
            throw r2     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
        L3d:
            com.tencent.qcloud.core.common.QCloudClientException r3 = new com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r4.append(r0)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            com.tencent.qcloud.core.common.QCloudAuthenticationException r4 = new com.tencent.qcloud.core.common.QCloudAuthenticationException     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            throw r3     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
        L5c:
            com.tencent.qcloud.core.common.QCloudClientException r0 = new com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            com.tencent.qcloud.core.common.QCloudAuthenticationException r2 = new com.tencent.qcloud.core.common.QCloudAuthenticationException     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            java.lang.String r3 = "墿\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            throw r0     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
        L6d:
            com.tencent.qcloud.core.common.QCloudClientException r2 = new com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "壀\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L20
            com.tencent.qcloud.core.common.QCloudAuthenticationException r4 = new com.tencent.qcloud.core.common.QCloudAuthenticationException     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L20
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L82:
            if (r1 == 0) goto L89
            java.util.concurrent.locks.ReentrantLock r1 = r6.lock
            r1.unlock()
        L89:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider.refresh():void");
    }
}
