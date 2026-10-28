package com.tencent.liteav.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes7.dex */
public class ThreadUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object sLock = new Object();
    private static boolean sThreadAssertsDisabled;
    private static Handler sUiThreadHandler;
    private static boolean sWillOverride;

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }

    public static void checkUiThread() {
        if (!sThreadAssertsDisabled && !runningOnUiThread()) {
            throw new IllegalStateException(ProtectedSandApp.s("劓\u0001"));
        }
    }

    public static Handler getUiThreadHandler() {
        Handler handler;
        synchronized (sLock) {
            try {
                if (sUiThreadHandler == null) {
                    if (sWillOverride) {
                        throw new RuntimeException(ProtectedSandApp.s("劔\u0001"));
                    }
                    sUiThreadHandler = new Handler(Looper.getMainLooper());
                }
                handler = sUiThreadHandler;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    private static boolean isThreadPriorityAudio(int i4) {
        return Process.getThreadPriority(i4) == -19;
    }

    @Deprecated
    public static <T> FutureTask<T> postOnUiThread(FutureTask<T> futureTask) {
        getUiThreadHandler().post(futureTask);
        return futureTask;
    }

    @Deprecated
    public static void postOnUiThreadDelayed(Runnable runnable, long j4) {
        getUiThreadHandler().postDelayed(runnable, j4);
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(FutureTask<T> futureTask) {
        if (runningOnUiThread()) {
            futureTask.run();
        } else {
            postOnUiThread((FutureTask) futureTask);
        }
        return futureTask;
    }

    @Deprecated
    public static void runOnUiThreadBlocking(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
            return;
        }
        FutureTask futureTask = new FutureTask(runnable, null);
        postOnUiThread(futureTask);
        try {
            futureTask.get();
        } catch (Exception e4) {
            throw new RuntimeException(ProtectedSandApp.s("劖\u0001"), e4);
        }
    }

    @Deprecated
    public static <T> T runOnUiThreadBlockingNoException(Callable<T> callable) {
        try {
            return (T) runOnUiThreadBlocking(callable);
        } catch (ExecutionException e4) {
            throw new RuntimeException(ProtectedSandApp.s("劗\u0001"), e4);
        }
    }

    public static boolean runningOnUiThread() {
        return getUiThreadHandler().getLooper() == Looper.myLooper();
    }

    public static void setThreadAssertsDisabledForTesting(boolean z4) {
        sThreadAssertsDisabled = z4;
    }

    public static void setThreadPriorityAudio(int i4) {
        Process.setThreadPriority(i4, -19);
    }

    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            try {
                if (looper == null) {
                    sUiThreadHandler = null;
                    return;
                }
                Handler handler = sUiThreadHandler;
                if (handler != null && handler.getLooper() != looper) {
                    throw new RuntimeException(ProtectedSandApp.s("劘\u0001") + sUiThreadHandler.getLooper() + ProtectedSandApp.s("劙\u0001") + Looper.getMainLooper() + ProtectedSandApp.s("劚\u0001") + looper);
                }
                sUiThreadHandler = new Handler(looper);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setWillOverrideUiThread(boolean z4) {
        synchronized (sLock) {
            sWillOverride = z4;
        }
    }

    @Deprecated
    public static void postOnUiThread(Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(Callable<T> callable) {
        return runOnUiThread(new FutureTask(callable));
    }

    @Deprecated
    public static void runOnUiThread(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
        } else {
            getUiThreadHandler().post(runnable);
        }
    }

    @Deprecated
    public static <T> T runOnUiThreadBlocking(Callable<T> callable) throws ExecutionException {
        FutureTask futureTask = new FutureTask(callable);
        runOnUiThread(futureTask);
        try {
            return (T) futureTask.get();
        } catch (InterruptedException e4) {
            throw new RuntimeException(ProtectedSandApp.s("劕\u0001"), e4);
        }
    }
}
