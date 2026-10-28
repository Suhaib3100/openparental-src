package com.tencent.beacon.event.c;

import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.event.EventBean;

/* compiled from: EventConverterFactory.java */
/* loaded from: classes6.dex */
public final class b extends c.a<EventBean, com.tencent.beacon.event.a.b> {

    /* renamed from: a, reason: collision with root package name */
    private final C1000b f71484a = new C1000b();

    /* renamed from: b, reason: collision with root package name */
    private final a f71485b = new a();

    /* compiled from: EventConverterFactory.java */
    static final class a implements com.tencent.beacon.base.net.a.c<EventBean, com.tencent.beacon.event.a.b> {
        a() {
        }

        @Override // com.tencent.beacon.base.net.a.c
        public com.tencent.beacon.event.a.b a(EventBean eventBean) {
            com.tencent.beacon.event.a.b bVar = new com.tencent.beacon.event.a.b();
            bVar.f71471b = eventBean.getEventTime();
            bVar.f71473d = eventBean.getAppKey();
            byte[] a5 = com.tencent.beacon.base.util.b.a(eventBean);
            bVar.f71474e = a5;
            if (a5 != null) {
                bVar.f71472c = a5.length;
            }
            return bVar;
        }
    }

    /* compiled from: EventConverterFactory.java */
    /* renamed from: com.tencent.beacon.event.c.b$b, reason: collision with other inner class name */
    static final class C1000b implements com.tencent.beacon.base.net.a.c<com.tencent.beacon.event.a.b, EventBean> {
        C1000b() {
        }

        @Override // com.tencent.beacon.base.net.a.c
        public EventBean a(com.tencent.beacon.event.a.b bVar) {
            Object a5 = com.tencent.beacon.base.util.b.a(bVar.f71474e);
            if (a5 == null || !(a5 instanceof EventBean)) {
                return null;
            }
            EventBean eventBean = (EventBean) a5;
            eventBean.setCid(bVar.f71470a);
            return eventBean;
        }
    }

    private b() {
    }

    public static b a() {
        return new b();
    }

    public com.tencent.beacon.base.net.a.c<EventBean, com.tencent.beacon.event.a.b> b() {
        return this.f71485b;
    }

    public com.tencent.beacon.base.net.a.c<com.tencent.beacon.event.a.b, EventBean> c() {
        return this.f71484a;
    }
}
