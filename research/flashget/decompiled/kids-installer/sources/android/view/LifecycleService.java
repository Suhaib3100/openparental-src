package android.view;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* loaded from: classes3.dex */
public class LifecycleService extends Service implements a0 {

    /* renamed from: o, reason: collision with root package name */
    private final y0 f8409o = new y0(this);

    @Override // android.view.a0
    @o0
    public t getLifecycle() {
        return this.f8409o.a();
    }

    @Override // android.app.Service
    @q0
    @i
    public IBinder onBind(@o0 Intent intent) {
        this.f8409o.b();
        return null;
    }

    @Override // android.app.Service
    @i
    public void onCreate() {
        this.f8409o.c();
        super.onCreate();
    }

    @Override // android.app.Service
    @i
    public void onDestroy() {
        this.f8409o.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @i
    public void onStart(@q0 Intent intent, int i5) {
        this.f8409o.e();
        super.onStart(intent, i5);
    }

    @Override // android.app.Service
    @i
    public int onStartCommand(@q0 Intent intent, int i5, int i6) {
        return super.onStartCommand(intent, i5, i6);
    }
}
