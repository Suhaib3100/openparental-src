package com.google.common.cache;

import java.util.concurrent.Executor;

/* compiled from: RemovalListeners.java */
@d9.c
@g
/* loaded from: classes6.dex */
public final class u {
    private u() {
    }

    public static <K, V> r<K, V> c(final r<K, V> rVar, final Executor executor) {
        rVar.getClass();
        executor.getClass();
        return new r() { // from class: com.google.common.cache.t
            @Override // com.google.common.cache.r
            public final void onRemoval(v vVar) {
                u.e(executor, rVar, vVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Executor executor, final r rVar, final v vVar) {
        executor.execute(new Runnable() { // from class: com.google.common.cache.s
            @Override // java.lang.Runnable
            public final void run() {
                r.this.onRemoval(vVar);
            }
        });
    }
}
