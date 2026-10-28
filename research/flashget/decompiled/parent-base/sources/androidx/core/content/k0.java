package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.unusedapprestrictions.a;
import androidx.core.app.unusedapprestrictions.b;

/* compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
/* loaded from: classes3.dex */
class k0 implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    @o0
    androidx.concurrent.futures.f<Integer> f26022c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f26023d;

    /* renamed from: b, reason: collision with root package name */
    @q0
    @m1
    androidx.core.app.unusedapprestrictions.b f26021b = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26024e = false;

    /* compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
    class a extends a.b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void m(boolean z4, boolean z5) throws RemoteException {
            if (!z4) {
                k0.this.f26022c.p(0);
            } else if (z5) {
                k0.this.f26022c.p(3);
            } else {
                k0.this.f26022c.p(2);
            }
        }
    }

    k0(@o0 Context context) {
        this.f26023d = context;
    }

    private androidx.core.app.unusedapprestrictions.a c() {
        return new a();
    }

    public void a(@o0 androidx.concurrent.futures.f<Integer> fVar) {
        if (this.f26024e) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f26024e = true;
        this.f26022c = fVar;
        this.f26023d.bindService(new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService").setPackage(f0.b(this.f26023d.getPackageManager())), this, 1);
    }

    public void b() {
        if (!this.f26024e) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f26024e = false;
        this.f26023d.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.b E = b.AbstractBinderC0409b.E(iBinder);
        this.f26021b = E;
        try {
            E.s(new a());
        } catch (RemoteException unused) {
            this.f26022c.p(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f26021b = null;
    }
}
