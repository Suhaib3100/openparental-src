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
/* loaded from: classes.dex */
class v implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    @o0
    androidx.concurrent.futures.g<Integer> f4678b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4679c;

    /* renamed from: a, reason: collision with root package name */
    @q0
    @m1
    androidx.core.app.unusedapprestrictions.b f4677a = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4680d = false;

    /* compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
    /* loaded from: classes3.dex */
    class a extends a.b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void c(boolean z5, boolean z6) throws RemoteException {
            if (!z5) {
                v.this.f4678b.A(0);
            } else if (z6) {
                v.this.f4678b.A(3);
            } else {
                v.this.f4678b.A(2);
            }
        }
    }

    v(@o0 Context context) {
        this.f4679c = context;
    }

    private androidx.core.app.unusedapprestrictions.a c() {
        return new a();
    }

    public void a(@o0 androidx.concurrent.futures.g<Integer> gVar) {
        if (this.f4680d) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f4680d = true;
        this.f4678b = gVar;
        this.f4679c.bindService(new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService").setPackage(q.b(this.f4679c.getPackageManager())), this, 1);
    }

    public void b() {
        if (!this.f4680d) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f4680d = false;
        this.f4679c.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.b d6 = b.AbstractBinderC0031b.d(iBinder);
        this.f4677a = d6;
        try {
            d6.a(new a());
        } catch (RemoteException unused) {
            this.f4678b.A(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f4677a = null;
    }
}
