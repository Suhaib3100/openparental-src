package com.google.firebase.messaging;

import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: RequestDeduplicator.java */
/* loaded from: classes2.dex */
class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17630a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<String, Task<String>> f17631b = new androidx.collection.a();

    /* compiled from: RequestDeduplicator.java */
    interface a {
        Task<String> start();
    }

    v0(Executor executor) {
        this.f17630a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f17631b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f17631b.get(str);
        if (task != null) {
            Log.isLoggable(ProtectedSandApp.s("ᢼ"), 3);
            return task;
        }
        Log.isLoggable(ProtectedSandApp.s("ᢽ"), 3);
        Task continueWithTask = aVar.start().continueWithTask(this.f17630a, new Continuation() { // from class: com.google.firebase.messaging.u0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task c6;
                c6 = v0.this.c(str, task2);
                return c6;
            }
        });
        this.f17631b.put(str, continueWithTask);
        return continueWithTask;
    }
}
