package com.tencent.qcloud.core.http.interceptor;

import androidx.compose.runtime.changelist.j;
import androidx.work.z;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.task.RetryStrategy;
import com.tencent.qcloud.core.task.TaskManager;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.w;
import okio.o;

/* loaded from: classes7.dex */
public class RetryInterceptor implements w {
    private static final int MIN_CLOCK_SKEWED_OFFSET = 600;
    private static volatile Map<String, HostReliable> hostReliables = new HashMap();
    private RetryStrategy.WeightAndReliableAddition additionComputer = new RetryStrategy.WeightAndReliableAddition();
    private RetryStrategy retryStrategy;

    private static class HostReliable {
        private static final int defaultReliable = 2;
        private final String host;
        private final int maxReliable;
        private final int minReliable;
        private int reliable;
        private final long resetPeriod;

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void decreaseReliable() {
            int i4 = this.reliable;
            if (i4 > 0) {
                this.reliable = i4 - 1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized int getReliable() {
            return this.reliable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void increaseReliable() {
            int i4 = this.reliable;
            if (i4 < 4) {
                this.reliable = i4 + 1;
            }
        }

        private synchronized void resetReliable() {
            this.reliable = 2;
        }

        private synchronized void zeroReliable() {
            this.reliable = 0;
        }

        private HostReliable(String str) {
            this.maxReliable = 4;
            this.minReliable = 0;
            this.resetPeriod = z.f36621h;
            this.host = str;
            this.reliable = 2;
            new Timer(j.a(str, ProtectedSandApp.s("婋\u0001"))).schedule(new TimerTask() { // from class: com.tencent.qcloud.core.http.interceptor.RetryInterceptor.HostReliable.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                }
            }, z.f36621h, z.f36621h);
        }
    }

    public RetryInterceptor(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private okhttp3.d0 buildNewRangeRequest(okhttp3.d0 r11, long r12, com.tencent.qcloud.core.http.HttpTask r14) {
        /*
            r10 = this;
            java.lang.String r0 = "婌\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r1 = "婍\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r2 = r11.i(r1)
            java.lang.String r3 = ""
            r4 = -1
            if (r2 == 0) goto L4b
            java.lang.String r6 = "婎\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            java.lang.String r2 = r2.replace(r6, r3)
            java.lang.String r6 = "婏\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            java.lang.String[] r2 = r2.split(r6)
            int r6 = r2.length
            if (r6 <= 0) goto L39
            r6 = 0
            r6 = r2[r6]     // Catch: java.lang.NumberFormatException -> L35
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L35
            goto L3a
        L35:
            r6 = move-exception
            r6.printStackTrace()
        L39:
            r6 = r4
        L3a:
            int r8 = r2.length
            r9 = 1
            if (r8 <= r9) goto L49
            r2 = r2[r9]     // Catch: java.lang.NumberFormatException -> L45
            long r8 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L45
            goto L4d
        L45:
            r2 = move-exception
            r2.printStackTrace()
        L49:
            r8 = r4
            goto L4d
        L4b:
            r6 = r4
            r8 = r6
        L4d:
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L52
            long r12 = r12 + r6
        L52:
            okhttp3.d0$a r2 = new okhttp3.d0$a
            r2.<init>(r11)
            okhttp3.u r11 = r11.k()
            okhttp3.u$a r11 = r11.m()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            int r13 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r13 != 0) goto L68
            goto L6c
        L68:
            java.lang.String r3 = java.lang.String.valueOf(r8)
        L6c:
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r3}
            java.lang.String r13 = "婐\u0001"
            java.lang.String r13 = com.flashget.parentalcontrol.ProtectedSandApp.s(r13)
            java.lang.String r12 = java.lang.String.format(r13, r12)
            com.tencent.qcloud.core.http.QCloudHttpRequest r13 = r14.newRangeSignRequest(r12)     // Catch: java.lang.Exception -> L88
            r11.m(r1, r12)     // Catch: java.lang.Exception -> L88
            java.lang.String r12 = r13.header(r0)     // Catch: java.lang.Exception -> L88
            r11.m(r0, r12)     // Catch: java.lang.Exception -> L88
        L88:
            okhttp3.u r11 = r11.i()
            r2.o(r11)
            okhttp3.d0 r11 = r2.b()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.interceptor.RetryInterceptor.buildNewRangeRequest(okhttp3.d0, long, com.tencent.qcloud.core.http.HttpTask):okhttp3.d0");
    }

    private void decreaseHostAccess(String str) {
        HostReliable hostReliable = hostReliables.get(str);
        if (hostReliable != null) {
            hostReliable.decreaseReliable();
        } else {
            hostReliables.put(str, new HostReliable(str));
        }
    }

    private f0 executeTaskOnce(w.a aVar, d0 d0Var, HttpTask httpTask) throws IOException {
        try {
            if (httpTask.isCanceled()) {
                throw new IOException(ProtectedSandApp.s("婑\u0001"));
            }
            if (httpTask.isResponseFilePathConverter()) {
                long transferBodySize = httpTask.getTransferBodySize();
                if (transferBodySize > 0) {
                    d0Var = buildNewRangeRequest(d0Var, transferBodySize, httpTask);
                }
            }
            return processSingleRequest(aVar, d0Var);
        } catch (ProtocolException e4) {
            if (e4.getMessage() != null && e4.getMessage().contains(ProtectedSandApp.s("婒\u0001"))) {
                return new f0.a().E(d0Var).y(e4.toString()).g(204).B(c0.HTTP_1_1).c();
            }
            e4.printStackTrace();
            throw e4;
        } catch (IOException e5) {
            e5.printStackTrace();
            throw e5;
        }
    }

    private int getHostReliable(String str) {
        HostReliable hostReliable = hostReliables.get(str);
        if (hostReliable != null) {
            return hostReliable.getReliable();
        }
        return 2;
    }

    private void increaseHostReliable(String str) {
        HostReliable hostReliable = hostReliables.get(str);
        if (hostReliable != null) {
            hostReliable.increaseReliable();
        } else {
            hostReliables.put(str, new HostReliable(str));
        }
    }

    private boolean isRecoverable(IOException iOException) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return iOException instanceof SocketTimeoutException;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return !(iOException.getCause() instanceof QCloudServiceException) || ((QCloudServiceException) iOException.getCause()).getStatusCode() >= 500;
    }

    private boolean isUserCancelled(IOException iOException) {
        return (iOException == null || iOException.getMessage() == null || !iOException.getMessage().toLowerCase(Locale.ROOT).equals(ProtectedSandApp.s("婓\u0001"))) ? false : true;
    }

    private boolean shouldRetry(d0 d0Var, f0 f0Var, int i4, int i5, long j4, IOException iOException, int i6) {
        if (isUserCancelled(iOException)) {
            return false;
        }
        int hostReliable = getHostReliable(d0Var.q().getHost());
        int retryAddition = this.additionComputer.getRetryAddition(i5, hostReliable);
        COSLogger.iNetwork(ProtectedSandApp.s("婕\u0001"), String.format(Locale.ENGLISH, ProtectedSandApp.s("婔\u0001"), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(hostReliable), Integer.valueOf(retryAddition)));
        if (!this.retryStrategy.shouldRetry(i4, System.nanoTime() - j4, retryAddition) || !this.retryStrategy.getQCloudHttpRetryHandler().shouldRetry(d0Var, f0Var, iOException)) {
            return false;
        }
        if (iOException == null || !isRecoverable(iOException)) {
            return i6 == 500 || i6 == 502 || i6 == 503 || i6 == 504;
        }
        return true;
    }

    String getClockSkewError(f0 f0Var, int i4) {
        String s4 = ProtectedSandApp.s("婖\u0001");
        if (f0Var == null || i4 != 403) {
            return null;
        }
        boolean equals = f0Var.getRequest().m().toUpperCase(Locale.ROOT).equals(ProtectedSandApp.s("婗\u0001"));
        String s5 = ProtectedSandApp.s("婘\u0001");
        if (equals) {
            return s5;
        }
        g0 o4 = f0Var.o();
        if (o4 == null) {
            return null;
        }
        try {
            o source = o4.getSource();
            source.h1(Long.MAX_VALUE);
            String X2 = source.r().g().X2(Charset.forName(ProtectedSandApp.s("婙\u0001")));
            Pattern compile = Pattern.compile(ProtectedSandApp.s("婚\u0001"));
            Pattern compile2 = Pattern.compile(ProtectedSandApp.s("婛\u0001"));
            Matcher matcher = compile.matcher(X2);
            Matcher matcher2 = compile2.matcher(X2);
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(1);
            if (s4.equals(group)) {
                return s4;
            }
            if (!ProtectedSandApp.s("婜\u0001").equals(group)) {
                return null;
            }
            if (matcher2.find()) {
                return s5;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // okhttp3.w
    public f0 intercept(w.a aVar) throws IOException {
        d0 request = aVar.getRequest();
        return processRequest(aVar, request, (HttpTask) TaskManager.getInstance().get((String) request.p(Object.class)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0210, code lost:
    
        com.tencent.qcloud.core.logger.COSLogger.iNetwork(r6, com.flashget.parentalcontrol.ProtectedSandApp.s("婨\u0001"), r14, r0, java.lang.Integer.valueOf(r19));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Exception, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    okhttp3.f0 processRequest(okhttp3.w.a r22, okhttp3.d0 r23, @androidx.annotation.q0 com.tencent.qcloud.core.http.HttpTask r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.interceptor.RetryInterceptor.processRequest(okhttp3.w$a, okhttp3.d0, com.tencent.qcloud.core.http.HttpTask):okhttp3.f0");
    }

    f0 processSingleRequest(w.a aVar, d0 d0Var) throws IOException {
        return aVar.c(d0Var);
    }
}
