package com.tencent.beacon.event.c;

import android.os.Build;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.util.h;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.pack.EventRecordV2;
import com.tencent.beacon.pack.RequestPackageV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: EventUtils.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f71487a = Pattern.compile(ProtectedSandApp.s("㊯\u0001"));

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f71488b = Pattern.compile(ProtectedSandApp.s("㊰\u0001"));

    /* renamed from: c, reason: collision with root package name */
    private static final Random f71489c = new Random();

    public static boolean a(int i4) {
        return i4 != 0;
    }

    private static EventRecordV2 b(EventBean eventBean) {
        if (eventBean == null) {
            return null;
        }
        EventRecordV2 eventRecordV2 = new EventRecordV2();
        eventRecordV2.appKey = eventBean.getAppKey();
        eventRecordV2.apn = eventBean.getApn() != null ? eventBean.getApn() : "";
        eventRecordV2.srcIp = eventBean.getSrcIp() != null ? eventBean.getSrcIp() : "";
        eventRecordV2.eventCode = eventBean.getEventCode();
        eventRecordV2.valueType = eventBean.getValueType();
        eventRecordV2.mapValue = eventBean.getEventValue();
        eventRecordV2.byteValue = eventBean.getByteValue();
        eventRecordV2.eventTime = eventBean.getEventTime();
        eventRecordV2.eventResult = eventBean.getEventResult();
        eventRecordV2.eventType = eventBean.getEventType();
        eventRecordV2.reserved = eventBean.getReserved();
        return eventRecordV2;
    }

    public static String c(String str) {
        return (str == null || str.length() == 0) ? "" : str;
    }

    public static String d(String str) {
        return (str == null || str.length() == 0) ? ProtectedSandApp.s("㋑\u0001") : str.length() > 50 ? str.substring(0, 50) : str;
    }

    public static String e(String str) {
        String s4 = ProtectedSandApp.s("㋒\u0001");
        if (str == null || str.length() == 0) {
            return s4;
        }
        String trim = str.replace('|', '_').trim();
        if (!g(trim)) {
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㋔\u0001").concat(str), new Object[0]);
            return s4;
        }
        if (trim.length() < 5) {
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㋓\u0001"), new Object[0]);
        }
        return trim.length() > 128 ? trim.substring(0, 128) : trim;
    }

    public static BeaconModule f(String str) throws Exception {
        return (BeaconModule) Class.forName(str).newInstance();
    }

    private static boolean g(String str) {
        int length = str.length();
        boolean z4 = true;
        while (true) {
            length--;
            if (length < 0) {
                return z4;
            }
            char charAt = str.charAt(length);
            if (charAt < ' ' || charAt >= 127) {
                z4 = false;
            }
        }
    }

    public static String a(String str) {
        String s4 = ProtectedSandApp.s("㊳\u0001");
        if (str != null && str.trim().length() != 0) {
            if (g(str.trim())) {
                String trim = str.trim();
                return trim.length() > 16 ? trim.substring(0, 16) : trim;
            }
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㊴\u0001").concat(str), new Object[0]);
        }
        return s4;
    }

    public static RequestPackageV2 a(EventBean eventBean) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eventBean);
        return a(arrayList);
    }

    public static RequestPackageV2 a(List<EventBean> list) {
        RequestPackageV2 requestPackageV2 = new RequestPackageV2();
        requestPackageV2.appVersion = com.tencent.beacon.a.c.b.a();
        requestPackageV2.common = a();
        ArrayList<EventRecordV2> arrayList = new ArrayList<>();
        Iterator<EventBean> it = list.iterator();
        while (it.hasNext()) {
            EventRecordV2 b5 = b(it.next());
            if (b5 != null) {
                arrayList.add(b5);
            }
        }
        requestPackageV2.events = arrayList;
        com.tencent.beacon.a.c.c c5 = com.tencent.beacon.a.c.c.c();
        requestPackageV2.mainAppKey = c5.e();
        requestPackageV2.model = com.tencent.beacon.a.c.g.e().h();
        requestPackageV2.osVersion = com.tencent.beacon.a.c.e.l().t();
        requestPackageV2.packageName = com.tencent.beacon.a.c.b.b();
        requestPackageV2.platformId = c5.g();
        requestPackageV2.sdkId = c5.h();
        requestPackageV2.sdkVersion = c5.i();
        requestPackageV2.reserved = "";
        return requestPackageV2;
    }

    public static String b(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String s4 = ProtectedSandApp.s("㋍\u0001");
        if (isEmpty) {
            if (h.f71372a.get()) {
                j e4 = j.e();
                String s5 = ProtectedSandApp.s("㋎\u0001");
                e4.a(s4, s5);
                h.a(s5);
            }
            return "";
        }
        String trim = str.replace('|', '_').trim();
        if (g(trim)) {
            if (trim.length() <= 128) {
                return trim;
            }
            String concat = str.concat(ProtectedSandApp.s("㋏\u0001"));
            j.e().a(s4, concat);
            h.a(concat);
            return trim.substring(0, 128);
        }
        String concat2 = str.concat(ProtectedSandApp.s("㋐\u0001"));
        j.e().a(s4, concat2);
        h.a(concat2);
        return "";
    }

    private static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        com.tencent.beacon.a.c.e l4 = com.tencent.beacon.a.c.e.l();
        com.tencent.beacon.a.c.c c5 = com.tencent.beacon.a.c.c.c();
        hashMap.put(ProtectedSandApp.s("㊵\u0001"), "" + l4.p());
        hashMap.put(ProtectedSandApp.s("㊶\u0001"), com.tencent.beacon.a.c.b.c(c5.b()));
        hashMap.put(ProtectedSandApp.s("㊷\u0001"), com.tencent.beacon.a.c.b.d());
        hashMap.put(ProtectedSandApp.s("㊸\u0001"), l4.a(c5.b()));
        hashMap.put(ProtectedSandApp.s("㊹\u0001"), String.valueOf(l4.z()));
        hashMap.put(ProtectedSandApp.s("㊼\u0001"), l4.m() ? ProtectedSandApp.s("㊺\u0001") : ProtectedSandApp.s("㊻\u0001"));
        hashMap.put(ProtectedSandApp.s("㊽\u0001"), l4.n());
        hashMap.put(ProtectedSandApp.s("㊾\u0001"), l4.v());
        hashMap.put(ProtectedSandApp.s("㊿\u0001"), l4.F());
        hashMap.put(ProtectedSandApp.s("㋀\u0001"), Build.BRAND);
        hashMap.put(ProtectedSandApp.s("㋁\u0001"), l4.d());
        com.tencent.beacon.a.c.g e4 = com.tencent.beacon.a.c.g.e();
        if (!TextUtils.isEmpty(e4.h())) {
            hashMap.put(ProtectedSandApp.s("㋂\u0001"), e4.h());
        }
        if (!TextUtils.isEmpty(e4.b())) {
            hashMap.put(ProtectedSandApp.s("㋃\u0001"), "" + e4.b());
        }
        if (!TextUtils.isEmpty(e4.d())) {
            hashMap.put(ProtectedSandApp.s("㋄\u0001"), e4.d());
        }
        if (!TextUtils.isEmpty(e4.f())) {
            hashMap.put(ProtectedSandApp.s("㋅\u0001"), e4.f());
        }
        if (!TextUtils.isEmpty(e4.a())) {
            hashMap.put(ProtectedSandApp.s("㋆\u0001"), e4.a());
        }
        if (!TextUtils.isEmpty(e4.j())) {
            hashMap.put(ProtectedSandApp.s("㋇\u0001"), e4.j());
        }
        if (!TextUtils.isEmpty(e4.k())) {
            hashMap.put(ProtectedSandApp.s("㋈\u0001"), e4.k());
        }
        if (!TextUtils.isEmpty(e4.i())) {
            hashMap.put(ProtectedSandApp.s("㋉\u0001"), e4.i());
        }
        return hashMap;
    }

    public static int a(EventType eventType) {
        int i4 = c.f71486a[eventType.ordinal()];
        if (i4 == 3 || i4 == 4) {
            return 1;
        }
        if (i4 != 5) {
            return i4 != 6 ? 0 : 2;
        }
        return 3;
    }

    public static JceRequestEntity a(List<EventBean> list, boolean z4) {
        return JceRequestEntity.builder().a(RequestType.EVENT).a(z4 ? 2 : 1).b(com.tencent.beacon.base.net.b.b.a(false)).a(com.tencent.beacon.base.net.b.b.a(true), 8081).a(com.tencent.beacon.a.c.c.c().e()).a(ProtectedSandApp.s("㊱\u0001"), ProtectedSandApp.s("㊲\u0001")).a(a(list)).a();
    }

    public static void a(String str, Map<String, String> map) {
        if (com.tencent.beacon.base.util.b.a(1) && !f71487a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : map.keySet()) {
                if (f71488b.matcher(str2).matches()) {
                    sb.append(str2);
                    sb.append(ProtectedSandApp.s("㋊\u0001"));
                }
            }
            if (sb.length() == 0) {
                return;
            }
            String format = String.format(ProtectedSandApp.s("㋋\u0001"), str, sb.toString());
            com.tencent.beacon.base.util.c.b(format, new Object[0]);
            j.e().a(ProtectedSandApp.s("㋌\u0001"), format);
        }
    }
}
