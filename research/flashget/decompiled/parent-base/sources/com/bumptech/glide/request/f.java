package com.bumptech.glide.request;

/* compiled from: RequestCoordinator.java */
/* loaded from: classes3.dex */
public interface f {

    /* compiled from: RequestCoordinator.java */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z4) {
            this.isComplete = z4;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean b(e eVar);

    boolean c(e eVar);

    void d(e eVar);

    void f(e eVar);

    f getRoot();

    boolean i(e eVar);
}
