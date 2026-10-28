package com.tencent.liteav.base.util;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class CustomHandler extends Handler {
    private static final long TIMEOUT_QUIT_LOOPER = TimeUnit.SECONDS.toMillis(30);
    private Runnable mQuitLooperTimeoutRunnable;
    private final String mTAG;
    private final Handler mUIHandler;

    public CustomHandler(Looper looper) {
        this(looper, null);
    }

    static /* synthetic */ boolean lambda$quitLooper$2(CustomHandler customHandler) {
        LiteavLog.i(customHandler.mTAG, ProtectedSandApp.s("卓\u0001"));
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            customHandler.getLooper().quitSafely();
        } else {
            customHandler.getLooper().quit();
        }
        customHandler.mUIHandler.removeCallbacks(customHandler.mQuitLooperTimeoutRunnable);
        return false;
    }

    static /* synthetic */ void lambda$quitLooper$3(CustomHandler customHandler, MessageQueue.IdleHandler idleHandler) {
        if (customHandler.getLooper() == Looper.getMainLooper()) {
            LiteavLog.e(customHandler.mTAG, ProtectedSandApp.s("協\u0001"));
        } else {
            LiteavLog.i(customHandler.mTAG, ProtectedSandApp.s("单\u0001"));
            Looper.myQueue().addIdleHandler(idleHandler);
        }
    }

    static /* synthetic */ void lambda$runAndWaitDone$0(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    static /* synthetic */ void lambda$runAndWaitDone$1(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    public boolean isCurrentThread() {
        return Looper.myLooper() != null && Looper.myLooper() == getLooper();
    }

    public boolean postDelayedTask(Runnable runnable, long j4) {
        return postDelayed(runnable, j4);
    }

    public boolean postTask(Runnable runnable) {
        return post(runnable);
    }

    public void quitLooper() {
        post(d.a(this, c.a(this)));
        this.mUIHandler.postDelayed(this.mQuitLooperTimeoutRunnable, TIMEOUT_QUIT_LOOPER);
    }

    public void quitLooperAndWaitDone() {
        quitLooper();
        try {
            getLooper().getThread().join();
        } catch (InterruptedException unused) {
        }
    }

    public boolean runAndWaitDone(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean post = post(a.a(runnable, countDownLatch));
        if (post) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return post;
    }

    public boolean runOrPost(Runnable runnable) {
        return runOrPost(runnable, 0);
    }

    public CustomHandler(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mQuitLooperTimeoutRunnable = new Runnable() { // from class: com.tencent.liteav.base.util.CustomHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                LiteavLog.e(CustomHandler.this.mTAG, ProtectedSandApp.s("协\u0001"));
            }
        };
        String str = ProtectedSandApp.s("卐\u0001") + hashCode();
        this.mTAG = str;
        LiteavLog.i(str, ProtectedSandApp.s("卑\u0001") + Thread.currentThread().getName() + ProtectedSandApp.s("卒\u0001"));
    }

    public boolean runOrPost(Runnable runnable, int i4) {
        if (!getLooper().getThread().isAlive()) {
            return false;
        }
        if (Looper.myLooper() != getLooper() || i4 != 0) {
            return i4 == 0 ? post(runnable) : postDelayed(runnable, i4);
        }
        runnable.run();
        return true;
    }

    public boolean runAndWaitDone(Runnable runnable, long j4) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean post = post(b.a(runnable, countDownLatch));
        if (post) {
            try {
                countDownLatch.await(j4, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return post;
    }
}
