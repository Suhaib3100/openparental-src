package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.LifecycleService;
import androidx.work.impl.foreground.b;
import androidx.work.s;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemForegroundService extends LifecycleService implements b.InterfaceC0641b {

    /* renamed from: g, reason: collision with root package name */
    private static final String f36173g = s.f("SystemFgService");

    /* renamed from: h, reason: collision with root package name */
    @q0
    private static SystemForegroundService f36174h = null;

    /* renamed from: c, reason: collision with root package name */
    private Handler f36175c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36176d;

    /* renamed from: e, reason: collision with root package name */
    androidx.work.impl.foreground.b f36177e;

    /* renamed from: f, reason: collision with root package name */
    NotificationManager f36178f;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36179b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Notification f36180c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f36181d;

        a(final int val$notificationId, final Notification val$notification, final int val$notificationType) {
            this.f36179b = val$notificationId;
            this.f36180c = val$notification;
            this.f36181d = val$notificationType;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f36179b, this.f36180c, this.f36181d);
            } else {
                SystemForegroundService.this.startForeground(this.f36179b, this.f36180c);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36183b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Notification f36184c;

        b(final int val$notificationId, final Notification val$notification) {
            this.f36183b = val$notificationId;
            this.f36184c = val$notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f36178f.notify(this.f36183b, this.f36184c);
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36186b;

        c(final int val$notificationId) {
            this.f36186b = val$notificationId;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f36178f.cancel(this.f36186b);
        }
    }

    @q0
    public static SystemForegroundService e() {
        return f36174h;
    }

    @l0
    private void f() {
        this.f36175c = new Handler(Looper.getMainLooper());
        this.f36178f = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f36177e = bVar;
        bVar.o(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0641b
    public void a(final int notificationId, @o0 final Notification notification) {
        this.f36175c.post(new b(notificationId, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0641b
    public void c(final int notificationId, final int notificationType, @o0 final Notification notification) {
        this.f36175c.post(new a(notificationId, notification, notificationType));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0641b
    public void d(final int notificationId) {
        this.f36175c.post(new c(notificationId));
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f36174h = this;
        f();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f36177e.m();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public int onStartCommand(@q0 Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.f36176d) {
            s.c().d(f36173g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f36177e.m();
            f();
            this.f36176d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f36177e.n(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0641b
    @l0
    public void stop() {
        this.f36176d = true;
        s.c().a(f36173g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f36174h = null;
        stopSelf();
    }
}
