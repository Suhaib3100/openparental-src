package org.greenrobot.eventbus;

/* compiled from: PendingPostQueue.java */
/* loaded from: classes5.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private i f32181a;

    /* renamed from: b, reason: collision with root package name */
    private i f32182b;

    j() {
    }

    synchronized void a(i iVar) {
        try {
            if (iVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            i iVar2 = this.f32182b;
            if (iVar2 != null) {
                iVar2.f32180c = iVar;
                this.f32182b = iVar;
            } else {
                if (this.f32181a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f32182b = iVar;
                this.f32181a = iVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized i b() {
        i iVar;
        iVar = this.f32181a;
        if (iVar != null) {
            i iVar2 = iVar.f32180c;
            this.f32181a = iVar2;
            if (iVar2 == null) {
                this.f32182b = null;
            }
        }
        return iVar;
    }

    synchronized i c(int i5) throws InterruptedException {
        if (this.f32181a == null) {
            wait(i5);
        }
        return b();
    }
}
