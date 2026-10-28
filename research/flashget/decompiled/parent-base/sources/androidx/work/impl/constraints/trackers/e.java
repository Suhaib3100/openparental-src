package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.work.s;

/* compiled from: NetworkStateTracker.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class e extends d<androidx.work.impl.constraints.b> {

    /* renamed from: j, reason: collision with root package name */
    static final String f36140j = s.f("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f36141g;

    /* renamed from: h, reason: collision with root package name */
    @x0(24)
    private b f36142h;

    /* renamed from: i, reason: collision with root package name */
    private a f36143i;

    /* compiled from: NetworkStateTracker.java */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            s.c().a(e.f36140j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* compiled from: NetworkStateTracker.java */
    @x0(24)
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@o0 Network network, @o0 NetworkCapabilities capabilities) {
            s.c().a(e.f36140j, String.format("Network capabilities changed: %s", capabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@o0 Network network) {
            s.c().a(e.f36140j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(@o0 Context context, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(context, taskExecutor);
        this.f36141g = (ConnectivityManager) this.f36134b.getSystemService("connectivity");
        this.f36142h = new b();
    }

    private static boolean j() {
        return true;
    }

    @Override // androidx.work.impl.constraints.trackers.d
    public void e() {
        try {
            s.c().a(f36140j, "Registering network callback", new Throwable[0]);
            this.f36141g.registerDefaultNetworkCallback(this.f36142h);
        } catch (IllegalArgumentException | SecurityException e4) {
            s.c().b(f36140j, "Received exception while registering network callback", e4);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.d
    public void f() {
        try {
            s.c().a(f36140j, "Unregistering network callback", new Throwable[0]);
            this.f36141g.unregisterNetworkCallback(this.f36142h);
        } catch (IllegalArgumentException | SecurityException e4) {
            s.c().b(f36140j, "Received exception while unregistering network callback", e4);
        }
    }

    androidx.work.impl.constraints.b g() {
        NetworkInfo activeNetworkInfo = this.f36141g.getActiveNetworkInfo();
        boolean z4 = false;
        boolean z5 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i4 = i();
        boolean isActiveNetworkMetered = this.f36141g.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z4 = true;
        }
        return new androidx.work.impl.constraints.b(z5, i4, isActiveNetworkMetered, z4);
    }

    @Override // androidx.work.impl.constraints.trackers.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.work.impl.constraints.b b() {
        return g();
    }

    @m1
    boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f36141g.getNetworkCapabilities(this.f36141g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e4) {
            s.c().b(f36140j, "Unable to validate active network", e4);
            return false;
        }
    }
}
