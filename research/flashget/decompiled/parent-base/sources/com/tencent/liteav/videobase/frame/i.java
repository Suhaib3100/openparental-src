package com.tencent.liteav.videobase.frame;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public abstract class i {
    private static final String TAG = ProtectedSandApp.s("唒\u0001");
    private static final com.tencent.liteav.base.b.a sThrottler = new com.tencent.liteav.base.b.a(TimeUnit.SECONDS.toMillis(1));
    private final g mRecycler;
    private String mStackTrace;
    private final AtomicInteger mRefCnt = new AtomicInteger(0);
    private long mLastUsedTimestamp = -1;

    public i(g gVar) {
        this.mRecycler = gVar;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.mRecycler == null || this.mRefCnt.get() == 0) {
            return;
        }
        LiteavLog.e(sThrottler, ProtectedSandApp.s("唒\u0001"), ProtectedSandApp.s("唓\u0001"), Integer.valueOf(this.mRefCnt.get()), this.mStackTrace);
    }

    public long getLastUsedTimestamp() {
        return this.mLastUsedTimestamp;
    }

    public void release() {
        g gVar;
        if (this.mRefCnt.decrementAndGet() != 0 || (gVar = this.mRecycler) == null) {
            return;
        }
        gVar.a(this);
    }

    public int retain() {
        this.mStackTrace = null;
        return this.mRefCnt.addAndGet(1);
    }

    public void updateLastUsedTimestamp(long j4) {
        this.mLastUsedTimestamp = j4;
    }
}
