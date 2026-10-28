package com.tencent.beacon.event.c;

import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.open.BeaconEvent;
import java.util.Map;

/* compiled from: EventBeanParser.java */
/* loaded from: classes6.dex */
public final class a {
    @q0
    public static EventBean a(BeaconEvent beaconEvent) {
        Map<String, String> a5 = com.tencent.beacon.base.net.b.d.a(beaconEvent.getCode(), beaconEvent.getParams());
        if (a5 == null) {
            return null;
        }
        EventBean eventBean = new EventBean();
        String code = beaconEvent.getCode();
        eventBean.setEventCode(code);
        eventBean.setAppKey(beaconEvent.getAppKey());
        eventBean.setApn(com.tencent.beacon.a.c.e.l().r());
        eventBean.setSrcIp(com.tencent.beacon.a.c.c.c().a());
        eventBean.setEventCode(code);
        eventBean.setValueType(0);
        eventBean.setEventValue(a5);
        String str = beaconEvent.getParams().get(ProtectedSandApp.s("㊮\u0001"));
        if (!TextUtils.isEmpty(str)) {
            eventBean.setEventTime(Long.parseLong(str));
        }
        eventBean.setEventResult(beaconEvent.isSucceed());
        eventBean.setEventType(d.a(beaconEvent.getType()));
        eventBean.setReserved("");
        return eventBean;
    }
}
