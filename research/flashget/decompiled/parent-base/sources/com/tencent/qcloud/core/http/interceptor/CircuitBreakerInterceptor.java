package com.tencent.qcloud.core.http.interceptor;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.task.TaskManager;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.w;

/* loaded from: classes7.dex */
public class CircuitBreakerInterceptor implements w {
    private static final int THRESHOLD_STATE_SWITCH_FOR_CONTINUOUS_FAIL = 5;
    private static final int THRESHOLD_STATE_SWITCH_FOR_CONTINUOUS_SUCCESS = 2;
    private static final long TIMEOUT_FOR_OPEN_STATE = 10000;
    private static final long TIMEOUT_FOR_RESET_ALL = 60000;
    private long entryOpenStateTimestamp;
    private long recentErrorTimestamp;
    private AtomicInteger failedCount = new AtomicInteger(0);
    private AtomicInteger successCount = new AtomicInteger(0);
    private State state = State.CLOSED;
    private FootprintWriter footprintWriter = new FootprintWriter();

    private static class FootprintWriter {
        private Set<String> tasks;

        private FootprintWriter() {
            this.tasks = new HashSet();
        }

        String getResourceId(HttpTask httpTask) {
            HttpRequest request = httpTask.request();
            return request.method() + request.url().getHost() + ProtectedSandApp.s("娌\u0001") + request.url().getPath();
        }

        boolean noRecords(HttpTask httpTask) {
            return !this.tasks.contains(getResourceId(httpTask));
        }

        void remember(HttpTask httpTask) {
            this.tasks.add(getResourceId(httpTask));
        }
    }

    enum State {
        OPEN,
        CLOSED,
        HALF_OPENED
    }

    @Override // okhttp3.w
    public f0 intercept(w.a aVar) throws IOException {
        State state;
        boolean noRecords;
        d0 request = aVar.getRequest();
        HttpTask httpTask = (HttpTask) TaskManager.getInstance().get((String) request.p(Object.class));
        if (httpTask == null || httpTask.isCanceled()) {
            throw new IOException(ProtectedSandApp.s("娘\u0001"));
        }
        synchronized (CircuitBreakerInterceptor.class) {
            try {
                State state2 = this.state;
                state = State.OPEN;
                if (state2 == state && TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.entryOpenStateTimestamp) > 10000) {
                    this.state = State.HALF_OPENED;
                }
                if (this.recentErrorTimestamp > 0 && TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.recentErrorTimestamp) > 60000) {
                    this.state = State.CLOSED;
                    this.successCount.set(0);
                    this.failedCount.set(0);
                    this.recentErrorTimestamp = 0L;
                }
                noRecords = this.footprintWriter.noRecords(httpTask);
                if (noRecords) {
                    this.footprintWriter.remember(httpTask);
                }
            } finally {
            }
        }
        if (this.state == state && ((httpTask.isDownloadTask() || httpTask.isUploadTask()) && !noRecords)) {
            COSLogger.iNetwork(ProtectedSandApp.s("娐\u0001"), ProtectedSandApp.s("娑\u0001"), request);
            throw new CircuitBreakerDeniedException(ProtectedSandApp.s("娒\u0001"));
        }
        try {
            f0 c5 = aVar.c(request);
            synchronized (CircuitBreakerInterceptor.class) {
                try {
                    State state3 = this.state;
                    State state4 = State.HALF_OPENED;
                    if (state3 != state4 || this.successCount.incrementAndGet() < 2) {
                        State state5 = this.state;
                        if (state5 == state) {
                            COSLogger.iNetwork(ProtectedSandApp.s("娐\u0001"), ProtectedSandApp.s("娔\u0001"));
                            this.state = state4;
                            this.successCount.set(1);
                        } else if (state5 == State.CLOSED) {
                            int i4 = this.failedCount.get();
                            if (i4 > 0) {
                                this.failedCount.set(Math.max(i4 - 2, 0));
                            }
                            COSLogger.iNetwork(ProtectedSandApp.s("娐\u0001"), ProtectedSandApp.s("娕\u0001"));
                        }
                    } else {
                        COSLogger.iNetwork(ProtectedSandApp.s("娐\u0001"), ProtectedSandApp.s("娓\u0001"));
                        this.state = State.CLOSED;
                        this.failedCount.set(0);
                    }
                } finally {
                }
            }
            return c5;
        } catch (IOException e4) {
            synchronized (CircuitBreakerInterceptor.class) {
                try {
                    this.recentErrorTimestamp = System.nanoTime();
                    if (this.state == State.CLOSED && this.failedCount.incrementAndGet() >= 5) {
                        COSLogger.iNetwork(ProtectedSandApp.s("娐\u0001"), ProtectedSandApp.s("娖\u0001"));
                        this.state = State.OPEN;
                        this.entryOpenStateTimestamp = System.nanoTime();
                        throw e4;
                    }
                    if (this.state == State.HALF_OPENED) {
                        COSLogger.iNetwork(ProtectedSandApp.s("娐\u0001"), ProtectedSandApp.s("娖\u0001"));
                        this.state = State.OPEN;
                        this.entryOpenStateTimestamp = System.nanoTime();
                    } else {
                        COSLogger.iNetwork(ProtectedSandApp.s("娐\u0001"), ProtectedSandApp.s("娗\u0001"), Integer.valueOf(this.failedCount.get()));
                    }
                    throw e4;
                } finally {
                }
            }
        }
    }
}
