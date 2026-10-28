package com.tencent.beacon.event.open;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.event.c.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class BeaconEvent {

    /* renamed from: a, reason: collision with root package name */
    private String f71615a;

    /* renamed from: b, reason: collision with root package name */
    private String f71616b;

    /* renamed from: c, reason: collision with root package name */
    private EventType f71617c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f71618d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f71619e;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f71620a;

        /* renamed from: b, reason: collision with root package name */
        private String f71621b;

        /* renamed from: c, reason: collision with root package name */
        private EventType f71622c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f71623d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f71624e;

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public BeaconEvent build() {
            String b5 = d.b(this.f71621b);
            if (TextUtils.isEmpty(this.f71620a)) {
                this.f71620a = c.c().e();
            }
            d.a(b5, this.f71624e);
            return new BeaconEvent(this.f71620a, b5, this.f71622c, this.f71623d, this.f71624e, null);
        }

        public Builder withAppKey(String str) {
            this.f71620a = str;
            return this;
        }

        public Builder withCode(String str) {
            this.f71621b = str;
            return this;
        }

        public Builder withIsSucceed(boolean z4) {
            this.f71623d = z4;
            return this;
        }

        public Builder withParams(Map<String, String> map) {
            if (map != null) {
                this.f71624e.putAll(map);
            }
            return this;
        }

        public Builder withType(EventType eventType) {
            this.f71622c = eventType;
            return this;
        }

        /* synthetic */ Builder(BeaconEvent beaconEvent, a aVar) {
            this(beaconEvent);
        }

        public Builder withParams(@o0 String str, String str2) {
            this.f71624e.put(str, str2);
            return this;
        }

        private Builder() {
            this.f71622c = EventType.NORMAL;
            this.f71623d = true;
            this.f71624e = new HashMap();
        }

        private Builder(BeaconEvent beaconEvent) {
            this.f71622c = EventType.NORMAL;
            this.f71623d = true;
            this.f71624e = new HashMap();
            this.f71620a = beaconEvent.f71615a;
            this.f71621b = beaconEvent.f71616b;
            this.f71622c = beaconEvent.f71617c;
            this.f71623d = beaconEvent.f71618d;
            this.f71624e.putAll(beaconEvent.f71619e);
        }
    }

    /* synthetic */ BeaconEvent(String str, String str2, EventType eventType, boolean z4, Map map, a aVar) {
        this(str, str2, eventType, z4, map);
    }

    public static Builder builder() {
        return new Builder((a) null);
    }

    public static Builder newBuilder(BeaconEvent beaconEvent) {
        return new Builder(beaconEvent, null);
    }

    public String getAppKey() {
        return this.f71615a;
    }

    public String getCode() {
        return this.f71616b;
    }

    public String getLogidPrefix() {
        switch (a.f71633a[this.f71617c.ordinal()]) {
            case 1:
            case 2:
                return ProtectedSandApp.s("㍗\u0001");
            case 3:
            case 4:
                return ProtectedSandApp.s("㍖\u0001");
            case 5:
            case 6:
                return ProtectedSandApp.s("㍕\u0001");
            default:
                return "";
        }
    }

    public Map<String, String> getParams() {
        return this.f71619e;
    }

    public EventType getType() {
        return this.f71617c;
    }

    public boolean isSucceed() {
        return this.f71618d;
    }

    public void setAppKey(String str) {
        this.f71615a = str;
    }

    public void setCode(String str) {
        this.f71616b = str;
    }

    public void setParams(Map<String, String> map) {
        this.f71619e = map;
    }

    public void setSucceed(boolean z4) {
        this.f71618d = z4;
    }

    public void setType(EventType eventType) {
        this.f71617c = eventType;
    }

    public String toString() {
        return super.toString();
    }

    private BeaconEvent(String str, String str2, EventType eventType, boolean z4, Map<String, String> map) {
        this.f71615a = str;
        this.f71616b = str2;
        this.f71617c = eventType;
        this.f71618d = z4;
        this.f71619e = map;
    }
}
