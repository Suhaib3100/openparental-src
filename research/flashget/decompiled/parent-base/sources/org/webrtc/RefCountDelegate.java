package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @androidx.annotation.q0
    private final Runnable releaseCallback;

    public RefCountDelegate(@androidx.annotation.q0 Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }

    boolean safeRetain() {
        int i4 = this.refCount.get();
        while (i4 != 0) {
            if (this.refCount.weakCompareAndSet(i4, i4 + 1)) {
                return true;
            }
            i4 = this.refCount.get();
        }
        return false;
    }
}
