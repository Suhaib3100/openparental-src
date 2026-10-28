package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.m2;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0016R(\u0010\u0018\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/k0;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Lkotlin/m2;", "onActivityResumed", "onActivityPaused", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityStarted", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "", "p", "Z", "a", "()Z", "d", "(Z)V", "getHasPendingForeground$com_google_firebase_firebase_sessions$annotations", "()V", "hasPendingForeground", "Lcom/google/firebase/sessions/h0;", "lifecycleClient", "q", "Lcom/google/firebase/sessions/h0;", "c", "()Lcom/google/firebase/sessions/h0;", "e", "(Lcom/google/firebase/sessions/h0;)V", "<init>", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final k0 f18650o = new k0();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static boolean hasPendingForeground;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private static h0 lifecycleClient;

    private k0() {
    }

    @m1
    public static /* synthetic */ void b() {
    }

    public final boolean a() {
        return hasPendingForeground;
    }

    @d5.e
    public final h0 c() {
        return lifecycleClient;
    }

    public final void d(boolean z5) {
        hasPendingForeground = z5;
    }

    public final void e(@d5.e h0 h0Var) {
        lifecycleClient = h0Var;
        if (h0Var == null || !hasPendingForeground) {
            return;
        }
        hasPendingForeground = false;
        h0Var.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@d5.d Activity activity, @d5.e Bundle bundle) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("᪻"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@d5.d Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("᪼"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@d5.d Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("᪽"));
        h0 h0Var = lifecycleClient;
        if (h0Var != null) {
            h0Var.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@d5.d Activity activity) {
        m2 m2Var;
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("᪾"));
        h0 h0Var = lifecycleClient;
        if (h0Var != null) {
            h0Var.k();
            m2Var = m2.f23662a;
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            hasPendingForeground = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@d5.d Activity activity, @d5.d Bundle bundle) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ᪿ"));
        kotlin.jvm.internal.l0.p(bundle, ProtectedSandApp.s("ᫀ"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@d5.d Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("᫁"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@d5.d Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("᫂"));
    }
}
