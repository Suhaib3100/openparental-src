package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.d0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.e;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DisplayNotification.java */
/* loaded from: classes6.dex */
class g {

    /* renamed from: d, reason: collision with root package name */
    private static final int f60130d = 5;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f60131a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f60132b;

    /* renamed from: c, reason: collision with root package name */
    private final q0 f60133c;

    public g(Context context, q0 q0Var, ExecutorService executorService) {
        this.f60131a = executorService;
        this.f60132b = context;
        this.f60133c = q0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f60132b.getSystemService(ProtectedSandApp.s("ȿ\u0001"))).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f60132b.getSystemService(ProtectedSandApp.s("ɀ\u0001"))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(e.a aVar) {
        Log.isLoggable(ProtectedSandApp.s("Ɂ\u0001"), 3);
        ((NotificationManager) this.f60132b.getSystemService(ProtectedSandApp.s("ɂ\u0001"))).notify(aVar.f60025b, aVar.f60026c, aVar.f60024a.h());
    }

    @androidx.annotation.q0
    private l0 d() {
        l0 d5 = l0.d(this.f60133c.p(ProtectedSandApp.s("Ƀ\u0001")));
        if (d5 != null) {
            d5.g(this.f60131a);
        }
        return d5;
    }

    private void e(d0.n nVar, @androidx.annotation.q0 l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(l0Var.e(), 5L, TimeUnit.SECONDS);
            nVar.b0(bitmap);
            nVar.z0(new d0.k().D(bitmap).B(null));
        } catch (InterruptedException unused) {
            l0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e4) {
            Objects.toString(e4.getCause());
        } catch (TimeoutException unused2) {
            l0Var.close();
        }
    }

    boolean a() {
        if (this.f60133c.a(ProtectedSandApp.s("Ʉ\u0001"))) {
            return true;
        }
        if (b()) {
            return false;
        }
        l0 d5 = d();
        e.a e4 = e.e(this.f60132b, this.f60133c);
        e(e4.f60024a, d5);
        c(e4);
        return true;
    }
}
