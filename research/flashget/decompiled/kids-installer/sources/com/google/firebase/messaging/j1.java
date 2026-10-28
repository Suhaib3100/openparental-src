package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.m1;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes2.dex */
class j1 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f17315a;

    /* compiled from: WithinAppServiceBinder.java */
    interface a {
        Task<Void> a(Intent intent);
    }

    j1(a aVar) {
        this.f17315a = aVar;
    }

    void c(final m1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException(ProtectedSandApp.s("ᡢ"));
        }
        Log.isLoggable(ProtectedSandApp.s("ᡡ"), 3);
        this.f17315a.a(aVar.f17346a).addOnCompleteListener(new h(), new OnCompleteListener() { // from class: com.google.firebase.messaging.i1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                m1.a.this.d();
            }
        });
    }
}
