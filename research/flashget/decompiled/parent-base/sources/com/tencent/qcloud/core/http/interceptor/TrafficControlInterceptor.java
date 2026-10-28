package com.tencent.qcloud.core.http.interceptor;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.task.TaskExecutors;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.w;

/* loaded from: classes7.dex */
public class TrafficControlInterceptor implements w {
    private TrafficStrategy uploadTrafficStrategy = new ModerateTrafficStrategy(ProtectedSandApp.s("婭\u0001"), TaskExecutors.UPLOAD_THREAD_COUNT);
    private TrafficStrategy downloadTrafficStrategy = new AggressiveTrafficStrategy(ProtectedSandApp.s("婮\u0001"), TaskExecutors.DOWNLOAD_THREAD_COUNT);

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
        private long boostModeExhaustedTime = System.nanoTime() + BOOST_MODE_DURATION;
        private AtomicInteger concurrent;
        private ResizableSemaphore controller;
        private final int maxConcurrent;
        private final String name;

        TrafficStrategy(String str, int i4, int i5) {
            this.name = str;
            this.maxConcurrent = i5;
            this.controller = new ResizableSemaphore(i4, true);
            this.concurrent = new AtomicInteger(i4);
            COSLogger.dProcess(ProtectedSandApp.s("婪\u0001"), str + ProtectedSandApp.s("婩\u0001") + i4);
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
                    COSLogger.dProcess(ProtectedSandApp.s("婪\u0001"), this.name + ProtectedSandApp.s("婫\u0001") + i4);
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
            COSLogger.dProcess(ProtectedSandApp.s("婪\u0001"), c.a(new StringBuilder(), this.name, ProtectedSandApp.s("婬\u0001")), d0Var, Double.valueOf(d5));
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

    private f0 processRequest(w.a aVar, d0 d0Var) throws IOException {
        return aVar.c(d0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    @Override // okhttp3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.f0 intercept(okhttp3.w.a r9) throws java.io.IOException {
        /*
            r8 = this;
            okhttp3.d0 r0 = r9.getRequest()
            com.tencent.qcloud.core.task.TaskManager r1 = com.tencent.qcloud.core.task.TaskManager.getInstance()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Object r2 = r0.p(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.qcloud.core.task.QCloudTask r1 = r1.get(r2)
            com.tencent.qcloud.core.http.HttpTask r1 = (com.tencent.qcloud.core.http.HttpTask) r1
            if (r1 == 0) goto Lcc
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto Lcc
            com.tencent.qcloud.core.http.interceptor.TrafficControlInterceptor$TrafficStrategy r2 = r8.getSuitableStrategy(r1)
            if (r2 == 0) goto L27
            r2.waitForPermit()
        L27:
            java.lang.String r3 = "婯\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            java.lang.String r5 = "婰\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            com.tencent.qcloud.core.logger.COSLogger.iNetwork(r5, r3, r4)
            r3 = 0
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> L78 java.io.IOException -> L7a com.tencent.qcloud.core.common.QCloudServiceException -> L7c com.tencent.qcloud.core.common.QCloudClientException -> L7e
            okhttp3.f0 r9 = r8.processRequest(r9, r0)     // Catch: java.lang.Exception -> L78 java.io.IOException -> L7a com.tencent.qcloud.core.common.QCloudServiceException -> L7c com.tencent.qcloud.core.common.QCloudClientException -> L7e
            boolean r6 = r1.isDownloadTask()     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            if (r6 == 0) goto L59
            r1.convertResponse(r9)     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            goto L59
        L4d:
            r1 = move-exception
            r3 = r9
            goto L80
        L50:
            r1 = move-exception
            r3 = r9
            goto L86
        L53:
            r1 = move-exception
            r3 = r9
            goto L88
        L56:
            r1 = move-exception
            r3 = r9
            goto L9d
        L59:
            if (r2 == 0) goto L77
            boolean r6 = r9.r1()     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            if (r6 == 0) goto L74
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            long r6 = r6 - r4
            long r3 = r3.toMillis(r6)     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            double r3 = r8.getAverageStreamingSpeed(r1, r3)     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            r2.reportSpeed(r0, r3)     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
            goto L77
        L74:
            r2.reportException(r0, r3)     // Catch: java.lang.Exception -> L4d java.io.IOException -> L50 com.tencent.qcloud.core.common.QCloudServiceException -> L53 com.tencent.qcloud.core.common.QCloudClientException -> L56
        L77:
            return r9
        L78:
            r1 = move-exception
            goto L80
        L7a:
            r1 = move-exception
            goto L86
        L7c:
            r1 = move-exception
            goto L88
        L7e:
            r1 = move-exception
            goto L9d
        L80:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r1)
            goto Lb1
        L86:
            r9 = r1
            goto Lb1
        L88:
            java.lang.Throwable r9 = r1.getCause()
            boolean r9 = r9 instanceof java.io.IOException
            if (r9 == 0) goto L97
            java.lang.Throwable r9 = r1.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto Lb1
        L97:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r1)
            goto Lb1
        L9d:
            java.lang.Throwable r9 = r1.getCause()
            boolean r9 = r9 instanceof java.io.IOException
            if (r9 == 0) goto Lac
            java.lang.Throwable r9 = r1.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto Lb1
        Lac:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r1)
        Lb1:
            if (r2 == 0) goto Lc0
            boolean r1 = com.tencent.qcloud.core.http.HttpUtil.isNetworkTimeoutError(r9)
            if (r1 == 0) goto Lbd
            r2.reportTimeOut(r0)
            goto Lc0
        Lbd:
            r2.reportException(r0, r9)
        Lc0:
            if (r3 == 0) goto Lcb
            okhttp3.g0 r0 = r3.o()
            if (r0 == 0) goto Lcb
            r3.close()
        Lcb:
            throw r9
        Lcc:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "婱\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.interceptor.TrafficControlInterceptor.intercept(okhttp3.w$a):okhttp3.f0");
    }
}
