package com.tencent.beacon.event.b;

import androidx.annotation.q0;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.open.BeaconEvent;

/* compiled from: EventHandler.java */
/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private c f71480a;

    abstract BeaconEvent a(BeaconEvent beaconEvent);

    public void a(c cVar) {
        this.f71480a = cVar;
    }

    @q0
    public final EventBean b(BeaconEvent beaconEvent) {
        BeaconEvent a5 = a(beaconEvent);
        c cVar = this.f71480a;
        return cVar != null ? cVar.b(a5) : com.tencent.beacon.event.c.a.a(a5);
    }
}
