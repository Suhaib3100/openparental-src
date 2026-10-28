package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\rR(\u0010\u001b\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0014\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/l0;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lkotlin/k2;", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "", "c", "Z", "a", "()Z", "d", "(Z)V", "b", "hasPendingForeground", "Lcom/google/firebase/sessions/i0;", "lifecycleClient", "Lcom/google/firebase/sessions/i0;", "()Lcom/google/firebase/sessions/i0;", "e", "(Lcom/google/firebase/sessions/i0;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSessionsActivityLifecycleCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionsActivityLifecycleCallbacks.kt\ncom/google/firebase/sessions/SessionsActivityLifecycleCallbacks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes6.dex */
public final class l0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final l0 f60930b = new l0();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean hasPendingForeground;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static i0 lifecycleClient;

    private l0() {
    }

    @m1
    public static /* synthetic */ void b() {
    }

    public final boolean a() {
        return hasPendingForeground;
    }

    @fg.m
    public final i0 c() {
        return lifecycleClient;
    }

    public final void d(boolean z4) {
        hasPendingForeground = z4;
    }

    public final void e(@fg.m i0 i0Var) {
        lifecycleClient = i0Var;
        if (i0Var == null || !hasPendingForeground) {
            return;
        }
        hasPendingForeground = false;
        i0Var.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@fg.l Activity activity, @fg.m Bundle savedInstanceState) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ԍ\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@fg.l Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ԍ\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@fg.l Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ԍ\u0001"));
        i0 i0Var = lifecycleClient;
        if (i0Var != null) {
            i0Var.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@fg.l Activity activity) {
        k2 k2Var;
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ԍ\u0001"));
        i0 i0Var = lifecycleClient;
        if (i0Var != null) {
            i0Var.k();
            k2Var = k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            hasPendingForeground = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@fg.l Activity activity, @fg.l Bundle outState) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ԍ\u0001"));
        kotlin.jvm.internal.l0.p(outState, ProtectedSandApp.s("Ԏ\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@fg.l Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ԍ\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@fg.l Activity activity) {
        kotlin.jvm.internal.l0.p(activity, ProtectedSandApp.s("ԍ\u0001"));
    }
}
