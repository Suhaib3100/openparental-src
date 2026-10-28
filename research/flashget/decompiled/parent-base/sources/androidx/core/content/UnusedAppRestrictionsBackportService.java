package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.unusedapprestrictions.b;

/* loaded from: classes3.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25967c = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* renamed from: b, reason: collision with root package name */
    private b.AbstractBinderC0409b f25968b = new a();

    class a extends b.AbstractBinderC0409b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void s(@q0 androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a(new j0(aVar));
        }
    }

    protected abstract void a(@o0 j0 j0Var);

    @Override // android.app.Service
    @q0
    public IBinder onBind(@q0 Intent intent) {
        return this.f25968b;
    }
}
