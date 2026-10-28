package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.j;
import androidx.work.impl.utils.h;
import androidx.work.s;

/* loaded from: classes3.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    static final String f36031b = "androidx.work.impl.background.systemalarm.UpdateProxies";

    /* renamed from: c, reason: collision with root package name */
    static final String f36032c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";

    /* renamed from: d, reason: collision with root package name */
    static final String f36033d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";

    /* renamed from: e, reason: collision with root package name */
    static final String f36034e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";

    /* renamed from: f, reason: collision with root package name */
    static final String f36035f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    /* renamed from: a, reason: collision with root package name */
    static final String f36030a = s.f("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f36036b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f36037c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f36038d;

        a(final Intent val$intent, final Context val$context, final BroadcastReceiver.PendingResult val$pendingResult) {
            this.f36036b = val$intent;
            this.f36037c = val$context;
            this.f36038d = val$pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f36036b.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f36036b.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f36036b.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f36036b.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                s.c().a(ConstraintProxyUpdateReceiver.f36030a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                h.c(this.f36037c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                h.c(this.f36037c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                h.c(this.f36037c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                h.c(this.f36037c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f36038d.finish();
            }
        }
    }

    public static Intent a(Context context, boolean batteryNotLowProxyEnabled, boolean batteryChargingProxyEnabled, boolean storageNotLowProxyEnabled, boolean networkStateProxyEnabled) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", batteryNotLowProxyEnabled).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", batteryChargingProxyEnabled).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", storageNotLowProxyEnabled).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", networkStateProxyEnabled);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@o0 final Context context, @q0 final Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            j.H(context).O().b(new a(intent, context, goAsync()));
        } else {
            s.c().a(f36030a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
