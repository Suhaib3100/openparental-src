package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.s;

/* compiled from: BroadcastReceiverConstraintTracker.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final String f36129h = s.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f36130g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(@o0 Context context, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(context, taskExecutor);
        this.f36130g = new a();
    }

    @Override // androidx.work.impl.constraints.trackers.d
    public void e() {
        s.c().a(f36129h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f36134b.registerReceiver(this.f36130g, g());
    }

    @Override // androidx.work.impl.constraints.trackers.d
    public void f() {
        s.c().a(f36129h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f36134b.unregisterReceiver(this.f36130g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, @o0 Intent intent);
}
