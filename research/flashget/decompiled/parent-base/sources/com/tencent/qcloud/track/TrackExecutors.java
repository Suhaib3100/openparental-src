package com.tencent.qcloud.track;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class TrackExecutors {
    public static final ThreadPoolExecutor COMMAND_EXECUTOR;

    static final class TaskThreadFactory implements ThreadFactory {
        private final AtomicInteger increment = new AtomicInteger(1);
        private final int priority;
        private final String tag;

        TaskThreadFactory(String str, int i4) {
            this.tag = str;
            this.priority = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, ProtectedSandApp.s("孲\u0001") + this.tag + this.increment.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(this.priority);
            return thread;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(Integer.MAX_VALUE), new TaskThreadFactory(ProtectedSandApp.s("孳\u0001"), 5));
        COMMAND_EXECUTOR = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
