package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/j0;", "Lcom/google/firebase/sessions/i0;", "Landroid/os/Messenger;", "callback", "Landroid/content/ServiceConnection;", "serviceConnection", "Lkotlin/m2;", "a", "Lcom/google/firebase/g;", "b", "Lcom/google/firebase/g;", "firebaseApp", "<init>", "(Lcom/google/firebase/g;)V", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class j0 implements i0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.g firebaseApp;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final String f18648d = ProtectedSandApp.s("⮙");

    public j0(@d5.d com.google.firebase.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("⮚"));
        this.firebaseApp = gVar;
    }

    @Override // com.google.firebase.sessions.i0
    public void a(@d5.d Messenger messenger, @d5.d ServiceConnection serviceConnection) {
        kotlin.jvm.internal.l0.p(messenger, ProtectedSandApp.s("⮛"));
        kotlin.jvm.internal.l0.p(serviceConnection, ProtectedSandApp.s("⮜"));
        Context applicationContext = this.firebaseApp.n().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(ProtectedSandApp.s("⮝"), messenger);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
