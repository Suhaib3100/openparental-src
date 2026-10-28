package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/k0;", "Lcom/google/firebase/sessions/j0;", "Lcom/google/firebase/g;", "firebaseApp", "<init>", "(Lcom/google/firebase/g;)V", "Landroid/content/Context;", "appContext", "Landroid/content/ServiceConnection;", "serviceConnection", "", "b", "(Landroid/content/Context;Landroid/content/ServiceConnection;)Ljava/lang/Object;", "Landroid/os/Messenger;", "callback", "Lkotlin/k2;", "a", "(Landroid/os/Messenger;Landroid/content/ServiceConnection;)V", "Lcom/google/firebase/g;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class k0 implements j0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.google.firebase.g firebaseApp;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    @Deprecated
    public static final String f60920c = ProtectedSandApp.s("Ԅ\u0001");

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final a f60919b = new a();

    /* compiled from: SessionLifecycleServiceBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/k0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public k0(@fg.l com.google.firebase.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("ԅ\u0001"));
        this.firebaseApp = gVar;
    }

    private final Object b(Context appContext, ServiceConnection serviceConnection) {
        try {
            appContext.unbindService(serviceConnection);
            return k2.f75408a;
        } catch (IllegalArgumentException e4) {
            return Integer.valueOf(Log.w(ProtectedSandApp.s("Ԅ\u0001"), ProtectedSandApp.s("Ԇ\u0001"), e4));
        }
    }

    @Override // com.google.firebase.sessions.j0
    public void a(@fg.l Messenger callback, @fg.l ServiceConnection serviceConnection) {
        boolean z4;
        kotlin.jvm.internal.l0.p(callback, ProtectedSandApp.s("ԇ\u0001"));
        kotlin.jvm.internal.l0.p(serviceConnection, ProtectedSandApp.s("Ԉ\u0001"));
        Context applicationContext = this.firebaseApp.n().getApplicationContext();
        kotlin.jvm.internal.l0.o(applicationContext, ProtectedSandApp.s("ԉ\u0001"));
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(ProtectedSandApp.s("Ԋ\u0001"), callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            z4 = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException unused) {
            z4 = false;
        }
        if (z4) {
            return;
        }
        b(applicationContext, serviceConnection);
    }
}
