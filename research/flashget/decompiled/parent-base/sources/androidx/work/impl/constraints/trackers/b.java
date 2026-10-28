package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.s;

/* compiled from: BatteryNotLowTracker.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f36127i = s.f("BatteryNotLowTracker");

    /* renamed from: j, reason: collision with root package name */
    static final float f36128j = 0.15f;

    public b(@o0 Context context, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // androidx.work.impl.constraints.trackers.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.c
    public void h(Context context, @o0 Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        s.c().a(f36127i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f36134b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > f36128j);
        }
        s.c().b(f36127i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
