package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.view.LifecycleService;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.s;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemAlarmService extends LifecycleService implements e.c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f36041e = s.f("SystemAlarmService");

    /* renamed from: c, reason: collision with root package name */
    private e f36042c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36043d;

    @l0
    private void e() {
        e eVar = new e(this, null, null);
        this.f36042c = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    @l0
    public void b() {
        this.f36043d = true;
        s.c().a(f36041e, "All commands completed in dispatcher", new Throwable[0]);
        androidx.work.impl.utils.s.a();
        stopSelf();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f36043d = false;
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f36043d = true;
        this.f36042c.j();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.f36043d) {
            s.c().d(f36041e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f36042c.j();
            e();
            this.f36043d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f36042c.a(intent, startId);
        return 3;
    }
}
