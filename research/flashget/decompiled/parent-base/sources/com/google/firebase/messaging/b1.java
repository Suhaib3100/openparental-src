package com.google.firebase.messaging;

import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: RequestDeduplicator.java */
/* loaded from: classes6.dex */
class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f59991a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<String, Task<String>> f59992b = new androidx.collection.a();

    /* compiled from: RequestDeduplicator.java */
    interface a {
        Task<String> start();
    }

    b1(Executor executor) {
        this.f59991a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f59992b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f59992b.get(str);
        if (task != null) {
            Log.isLoggable(ProtectedSandApp.s("Ƨ\u0001"), 3);
            return task;
        }
        Log.isLoggable(ProtectedSandApp.s("Ƨ\u0001"), 3);
        Task continueWithTask = aVar.start().continueWithTask(this.f59991a, new Continuation() { // from class: com.google.firebase.messaging.a1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task c5;
                c5 = b1.this.c(str, task2);
                return c5;
            }
        });
        this.f59992b.put(str, continueWithTask);
        return continueWithTask;
    }
}
