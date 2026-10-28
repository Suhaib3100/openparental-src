package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.unusedapprestrictions.b;

/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: p, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4528p = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* renamed from: o, reason: collision with root package name */
    private b.AbstractBinderC0031b f4529o = new a();

    /* loaded from: classes3.dex */
    class a extends b.AbstractBinderC0031b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void a(@q0 androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a(new u(aVar));
        }
    }

    protected abstract void a(@o0 u uVar);

    @Override // android.app.Service
    @q0
    public IBinder onBind(@q0 Intent intent) {
        return this.f4529o;
    }
}
