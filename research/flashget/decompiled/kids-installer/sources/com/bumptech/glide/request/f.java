package com.bumptech.glide.request;

/* compiled from: RequestCoordinator.java */
/* loaded from: classes.dex */
public interface f {

    /* compiled from: RequestCoordinator.java */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z5) {
            this.isComplete = z5;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    void a(e eVar);

    boolean b();

    boolean c(e eVar);

    boolean e(e eVar);

    void g(e eVar);

    f getRoot();

    boolean j(e eVar);
}
