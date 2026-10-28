package com.tencent.beacon.event;

import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.C1434k;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.open.EventResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: EventManager.java */
/* loaded from: classes6.dex */
public class e implements i, com.tencent.beacon.a.a.d {

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.beacon.event.a.a f71525b;

    /* renamed from: c, reason: collision with root package name */
    private final h f71526c;

    /* renamed from: d, reason: collision with root package name */
    private final h f71527d;

    /* renamed from: e, reason: collision with root package name */
    private long f71528e = 2000;

    /* renamed from: f, reason: collision with root package name */
    private long f71529f = C1434k.f30360a;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f71524a = com.tencent.beacon.a.b.b.a().a(3000);

    public e() {
        com.tencent.beacon.event.a.a a5 = com.tencent.beacon.event.a.a.a();
        this.f71525b = a5;
        this.f71526c = new h(2000, a5, true);
        this.f71527d = new h(1000, a5, false);
        com.tencent.beacon.a.a.b.a().a(11, this);
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    @Override // com.tencent.beacon.event.i
    public void b(String str, @o0 EventBean eventBean) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㌏\u0001"), ProtectedSandApp.s("㌓\u0001"), eventBean.getEventCode(), str);
        com.tencent.beacon.a.b.b.a().a(new b(this, eventBean, str));
    }

    @Override // com.tencent.beacon.event.i
    public EventResult c(@q0 String str, @o0 EventBean eventBean) {
        boolean a5 = a(new a(this, eventBean));
        Object[] objArr = {eventBean.getEventCode(), eventBean.getAppKey(), Boolean.valueOf(a5)};
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㌕\u0001"), 1, ProtectedSandApp.s("㌔\u0001"), objArr);
        if (!a5) {
            return EventResult.a.a(103);
        }
        if (TextUtils.isEmpty(str)) {
            str = ProtectedSandApp.s("㌖\u0001");
        }
        return EventResult.a.a(Long.parseLong(str));
    }

    @Override // com.tencent.beacon.event.i
    public void a(String str, @o0 EventBean eventBean) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㌏\u0001"), ProtectedSandApp.s("㌓\u0001"), eventBean.getEventCode(), str);
        com.tencent.beacon.a.b.b.a().a(new c(this, eventBean, str));
    }

    public void a(EventBean eventBean, String str) {
        Map<String, String> eventValue = eventBean.getEventValue();
        eventValue.put(ProtectedSandApp.s("㌑\u0001"), ProtectedSandApp.s("㌒\u0001"));
        eventBean.setEventValue(eventValue);
        if (com.tencent.beacon.d.b.b().u()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(eventBean);
            com.tencent.beacon.base.net.c.d().b(com.tencent.beacon.event.c.d.a((List<EventBean>) arrayList, true)).a(new d(this, eventBean, str), com.tencent.beacon.a.b.b.b());
            return;
        }
        c(str, eventBean);
    }

    @Override // com.tencent.beacon.event.i
    public void a(boolean z4) {
        if (z4) {
            this.f71527d.run();
            this.f71526c.run();
        } else {
            com.tencent.beacon.a.b.b.a().a(this.f71527d);
            com.tencent.beacon.a.b.b.a().a(this.f71526c);
        }
    }

    @Override // com.tencent.beacon.event.i
    public void a() {
        com.tencent.beacon.a.b.b.a().a(2000, 0L, this.f71528e, this.f71526c);
        com.tencent.beacon.a.b.b.a().a(1000, 0L, this.f71529f, this.f71527d);
    }

    @Override // com.tencent.beacon.event.i
    public void a(boolean z4, int i4) {
        com.tencent.beacon.a.b.b.a().a(2000, z4, i4);
        com.tencent.beacon.a.b.b.a().a(1000, z4, i4);
    }

    @Override // com.tencent.beacon.event.i
    public void a(int i4) {
        int i5;
        int i6;
        if (com.tencent.beacon.d.b.b().n()) {
            i5 = com.tencent.beacon.d.b.b().h();
            i6 = com.tencent.beacon.d.b.b().f();
        } else {
            i5 = 0;
            i6 = 0;
        }
        com.tencent.beacon.base.util.c.a(String.format(ProtectedSandApp.s("㌉\u0001"), Integer.valueOf(i5), Integer.valueOf(i6)), new Object[0]);
        com.tencent.beacon.a.b.b.a().a(2000, i5, i4);
        com.tencent.beacon.a.b.b.a().a(1000, i6, i4);
    }

    @Override // com.tencent.beacon.event.i
    public boolean a(Runnable runnable) {
        return this.f71524a.post(runnable);
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        int i4 = cVar.f71020a;
        if (i4 == 2) {
            Map map = (Map) cVar.f71021b.get(ProtectedSandApp.s("㌌\u0001"));
            if (map != null) {
                if (this.f71528e == 2000) {
                    this.f71528e = com.tencent.beacon.base.util.b.a((String) map.get(ProtectedSandApp.s("㌍\u0001")), this.f71528e, 1000L, i0.f35991f);
                }
                if (this.f71529f == C1434k.f30360a) {
                    this.f71529f = com.tencent.beacon.base.util.b.a((String) map.get(ProtectedSandApp.s("㌎\u0001")), this.f71529f, 2000L, org.apache.commons.lang3.time.e.f86241c);
                }
            }
        } else if (i4 == 11) {
            Object obj = cVar.f71021b.get(ProtectedSandApp.s("㌊\u0001"));
            if (obj != null) {
                long longValue = ((Long) obj).longValue();
                if (longValue >= 1000 && longValue <= i0.f35991f) {
                    this.f71528e = longValue;
                }
            }
            Object obj2 = cVar.f71021b.get(ProtectedSandApp.s("㌋\u0001"));
            if (obj2 != null) {
                long longValue2 = ((Long) obj2).longValue();
                if (longValue2 >= 2000 && longValue2 <= org.apache.commons.lang3.time.e.f86241c) {
                    this.f71529f = longValue2;
                }
            }
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㌏\u0001"), ProtectedSandApp.s("㌐\u0001"), Long.valueOf(this.f71528e), Long.valueOf(this.f71529f));
    }
}
