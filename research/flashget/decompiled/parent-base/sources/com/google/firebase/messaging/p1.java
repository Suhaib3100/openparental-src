package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s1;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes6.dex */
class p1 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f60266a;

    /* compiled from: WithinAppServiceBinder.java */
    interface a {
        Task<Void> a(Intent intent);
    }

    p1(a aVar) {
        this.f60266a = aVar;
    }

    void c(final s1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException(ProtectedSandApp.s("˘\u0001"));
        }
        Log.isLoggable(ProtectedSandApp.s("˗\u0001"), 3);
        this.f60266a.a(aVar.f60321a).addOnCompleteListener(new androidx.credentials.k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.o1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                s1.a.this.d();
            }
        });
    }
}
