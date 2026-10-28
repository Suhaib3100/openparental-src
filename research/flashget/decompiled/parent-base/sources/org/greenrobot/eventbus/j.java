package org.greenrobot.eventbus;

/* compiled from: PendingPostQueue.java */
/* loaded from: classes6.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private i f86854a;

    /* renamed from: b, reason: collision with root package name */
    private i f86855b;

    j() {
    }

    synchronized void a(i iVar) {
        try {
            if (iVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            i iVar2 = this.f86855b;
            if (iVar2 != null) {
                iVar2.f86853c = iVar;
                this.f86855b = iVar;
            } else {
                if (this.f86854a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f86855b = iVar;
                this.f86854a = iVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized i b() {
        i iVar;
        iVar = this.f86854a;
        if (iVar != null) {
            i iVar2 = iVar.f86853c;
            this.f86854a = iVar2;
            if (iVar2 == null) {
                this.f86855b = null;
            }
        }
        return iVar;
    }

    synchronized i c(int i4) throws InterruptedException {
        try {
            if (this.f86854a == null) {
                wait(i4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b();
    }
}
