package com.tencent.qcloud.core.http.interceptor;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.NetworkProxy;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.task.TaskExecutors;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.d0;
import okhttp3.f0;

/* loaded from: classes7.dex */
public class QCloudTrafficControlInterceptor {
    private TrafficStrategy uploadTrafficStrategy = new ModerateTrafficStrategy(ProtectedSandApp.s("娻\u0001"), TaskExecutors.UPLOAD_THREAD_COUNT);
    private TrafficStrategy downloadTrafficStrategy = new AggressiveTrafficStrategy(ProtectedSandApp.s("娼\u0001"), TaskExecutors.DOWNLOAD_THREAD_COUNT);

    private static class AggressiveTrafficStrategy extends TrafficStrategy {
        AggressiveTrafficStrategy(String str, int i4) {
            super(str, i4, i4);
        }
    }

    private static class ModerateTrafficStrategy extends TrafficStrategy {
        ModerateTrafficStrategy(String str, int i4) {
            super(str, 1, i4);
        }
    }

    private static class ResizableSemaphore extends Semaphore {
        ResizableSemaphore(int i4, boolean z4) {
            super(i4, z4);
        }

        @Override // java.util.concurrent.Semaphore
        protected void reducePermits(int i4) {
            super.reducePermits(i4);
        }
    }

    private static abstract class TrafficStrategy {
        static final long BOOST_MODE_DURATION = TimeUnit.SECONDS.toNanos(3);
        static final int SINGLE_THREAD_SAFE_SPEED = 100;
        private long boostModeExhaustedTime;
        private AtomicInteger concurrent;
        private ResizableSemaphore controller;
        private final int maxConcurrent;
        private final String name;

        TrafficStrategy(String str, int i4, int i5) {
            this.name = str;
            this.maxConcurrent = i5;
            this.controller = new ResizableSemaphore(i4, true);
            this.concurrent = new AtomicInteger(i4);
            COSLogger.dProcess(ProtectedSandApp.s("娸\u0001"), str + ProtectedSandApp.s("娷\u0001") + i4);
        }

        private synchronized void adjustConcurrent(int i4, boolean z4) {
            try {
                int i5 = i4 - this.concurrent.get();
                if (i5 != 0) {
                    this.concurrent.set(i4);
                    if (i5 <= 0) {
                        this.controller.reducePermits(i5 * (-1));
                        if (z4) {
                            this.controller.release();
                        }
                    } else if (z4) {
                        this.controller.release(i5 + 1);
                    }
                    COSLogger.dProcess(ProtectedSandApp.s("娸\u0001"), this.name + ProtectedSandApp.s("娹\u0001") + i4);
                } else if (z4) {
                    this.controller.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        void reportException(d0 d0Var, IOException iOException) {
            this.controller.release();
        }

        void reportSpeed(d0 d0Var, double d5) {
            if (d5 <= p.f60679p) {
                this.controller.release();
                return;
            }
            COSLogger.dProcess(ProtectedSandApp.s("娸\u0001"), c.a(new StringBuilder(), this.name, ProtectedSandApp.s("娺\u0001")), d0Var, Double.valueOf(d5));
            int i4 = this.concurrent.get();
            if (d5 > 240.0d && i4 < this.maxConcurrent) {
                this.boostModeExhaustedTime = System.nanoTime() + BOOST_MODE_DURATION;
                adjustConcurrent(i4 + 1, true);
                return;
            }
            if (d5 > 120.0d && this.boostModeExhaustedTime > 0) {
                this.boostModeExhaustedTime = System.nanoTime() + BOOST_MODE_DURATION;
                this.controller.release();
            } else if (d5 <= p.f60679p || i4 <= 1 || d5 >= 70.0d) {
                this.controller.release();
            } else {
                adjustConcurrent(i4 - 1, true);
            }
        }

        void reportTimeOut(d0 d0Var) {
            adjustConcurrent(1, true);
        }

        void waitForPermit() {
            try {
                if (this.concurrent.get() > 1 && System.nanoTime() > this.boostModeExhaustedTime) {
                    adjustConcurrent(1, false);
                }
                this.controller.acquire();
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }
    }

    private double getAverageStreamingSpeed(HttpTask httpTask, long j4) {
        return j4 == 0 ? p.f60679p : (httpTask.getTransferBodySize() / 1024.0d) / (j4 / 1000.0d);
    }

    private TrafficStrategy getSuitableStrategy(HttpTask httpTask) {
        if (!httpTask.isEnableTraffic()) {
            return null;
        }
        if (httpTask.isDownloadTask()) {
            return this.downloadTrafficStrategy;
        }
        if (httpTask.isUploadTask()) {
            return this.uploadTrafficStrategy;
        }
        return null;
    }

    private f0 processRequest(NetworkProxy networkProxy, d0 d0Var) throws IOException {
        return networkProxy.callHttpRequest(d0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.f0 intercept(com.tencent.qcloud.core.http.NetworkProxy r8, okhttp3.d0 r9) throws java.io.IOException {
        /*
            r7 = this;
            com.tencent.qcloud.core.task.TaskManager r0 = com.tencent.qcloud.core.task.TaskManager.getInstance()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r1 = r9.p(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.qcloud.core.task.QCloudTask r0 = r0.get(r1)
            com.tencent.qcloud.core.http.HttpTask r0 = (com.tencent.qcloud.core.http.HttpTask) r0
            if (r0 == 0) goto Lc8
            boolean r1 = r0.isCanceled()
            if (r1 != 0) goto Lc8
            com.tencent.qcloud.core.http.interceptor.QCloudTrafficControlInterceptor$TrafficStrategy r1 = r7.getSuitableStrategy(r0)
            if (r1 == 0) goto L23
            r1.waitForPermit()
        L23:
            java.lang.String r2 = "娽\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r9}
            java.lang.String r4 = "娾\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            com.tencent.qcloud.core.logger.COSLogger.iNetwork(r4, r2, r3)
            r2 = 0
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> L74 java.io.IOException -> L76 com.tencent.qcloud.core.common.QCloudServiceException -> L78 com.tencent.qcloud.core.common.QCloudClientException -> L7a
            okhttp3.f0 r8 = r7.processRequest(r8, r9)     // Catch: java.lang.Exception -> L74 java.io.IOException -> L76 com.tencent.qcloud.core.common.QCloudServiceException -> L78 com.tencent.qcloud.core.common.QCloudClientException -> L7a
            boolean r5 = r0.isDownloadTask()     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            if (r5 == 0) goto L55
            r0.convertResponse(r8)     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            goto L55
        L49:
            r0 = move-exception
            r2 = r8
            goto L7c
        L4c:
            r0 = move-exception
            r2 = r8
            goto L82
        L4f:
            r0 = move-exception
            r2 = r8
            goto L84
        L52:
            r0 = move-exception
            r2 = r8
            goto L99
        L55:
            if (r1 == 0) goto L73
            boolean r5 = r8.r1()     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            if (r5 == 0) goto L70
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            long r5 = r5 - r3
            long r2 = r2.toMillis(r5)     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            double r2 = r7.getAverageStreamingSpeed(r0, r2)     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            r1.reportSpeed(r9, r2)     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
            goto L73
        L70:
            r1.reportException(r9, r2)     // Catch: java.lang.Exception -> L49 java.io.IOException -> L4c com.tencent.qcloud.core.common.QCloudServiceException -> L4f com.tencent.qcloud.core.common.QCloudClientException -> L52
        L73:
            return r8
        L74:
            r0 = move-exception
            goto L7c
        L76:
            r0 = move-exception
            goto L82
        L78:
            r0 = move-exception
            goto L84
        L7a:
            r0 = move-exception
            goto L99
        L7c:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r0)
            goto Lad
        L82:
            r8 = r0
            goto Lad
        L84:
            java.lang.Throwable r8 = r0.getCause()
            boolean r8 = r8 instanceof java.io.IOException
            if (r8 == 0) goto L93
            java.lang.Throwable r8 = r0.getCause()
            java.io.IOException r8 = (java.io.IOException) r8
            goto Lad
        L93:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r0)
            goto Lad
        L99:
            java.lang.Throwable r8 = r0.getCause()
            boolean r8 = r8 instanceof java.io.IOException
            if (r8 == 0) goto La8
            java.lang.Throwable r8 = r0.getCause()
            java.io.IOException r8 = (java.io.IOException) r8
            goto Lad
        La8:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r0)
        Lad:
            if (r1 == 0) goto Lbc
            boolean r0 = com.tencent.qcloud.core.http.HttpUtil.isNetworkTimeoutError(r8)
            if (r0 == 0) goto Lb9
            r1.reportTimeOut(r9)
            goto Lbc
        Lb9:
            r1.reportException(r9, r8)
        Lbc:
            if (r2 == 0) goto Lc7
            okhttp3.g0 r9 = r2.o()
            if (r9 == 0) goto Lc7
            r2.close()
        Lc7:
            throw r8
        Lc8:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "娿\u0001"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.interceptor.QCloudTrafficControlInterceptor.intercept(com.tencent.qcloud.core.http.NetworkProxy, okhttp3.d0):okhttp3.f0");
    }
}
