package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.x1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.d;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DisplayNotification.java */
/* loaded from: classes2.dex */
class f {

    /* renamed from: d, reason: collision with root package name */
    private static final int f17251d = 5;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f17252a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17253b;

    /* renamed from: c, reason: collision with root package name */
    private final l0 f17254c;

    public f(Context context, l0 l0Var, ExecutorService executorService) {
        this.f17252a = executorService;
        this.f17253b = context;
        this.f17254c = l0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f17253b.getSystemService(ProtectedSandApp.s("᠏"))).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f17253b.getSystemService(ProtectedSandApp.s("᠐"))).getRunningAppProcesses();
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

    private void c(d.a aVar) {
        Log.isLoggable(ProtectedSandApp.s("᠑"), 3);
        ((NotificationManager) this.f17253b.getSystemService(ProtectedSandApp.s("᠒"))).notify(aVar.f17150b, aVar.f17151c, aVar.f17149a.h());
    }

    @androidx.annotation.q0
    private h0 d() {
        h0 d6 = h0.d(this.f17254c.p(ProtectedSandApp.s("᠓")));
        if (d6 != null) {
            d6.j(this.f17252a);
        }
        return d6;
    }

    private void e(x1.g gVar, @androidx.annotation.q0 h0 h0Var) {
        if (h0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(h0Var.e(), 5L, TimeUnit.SECONDS);
            gVar.c0(bitmap);
            gVar.z0(new x1.d().C(bitmap).B(null));
        } catch (InterruptedException unused) {
            h0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e6) {
            Objects.toString(e6.getCause());
        } catch (TimeoutException unused2) {
            h0Var.close();
        }
    }

    boolean a() {
        if (this.f17254c.a(ProtectedSandApp.s("᠔"))) {
            return true;
        }
        if (b()) {
            return false;
        }
        h0 d6 = d();
        d.a e6 = d.e(this.f17253b, this.f17254c);
        e(e6.f17149a, d6);
        c(e6);
        return true;
    }
}
