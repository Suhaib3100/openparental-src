package com.tencent.beacon.base.net.call;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackageV2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class JceRequestEntity {
    private static final String TAG = ProtectedSandApp.s("ㆆ\u0001");
    private final String appKey;
    private final byte[] content;
    private final String domain;
    private final Map<String, String> header;
    private final int port;
    private final int requestCmd;
    private final int responseCmd;
    private final RequestType type;
    private final String url;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f71333a;

        /* renamed from: b, reason: collision with root package name */
        private int f71334b;

        /* renamed from: c, reason: collision with root package name */
        private String f71335c;

        /* renamed from: d, reason: collision with root package name */
        private int f71336d;

        /* renamed from: e, reason: collision with root package name */
        private int f71337e;

        /* renamed from: f, reason: collision with root package name */
        private RequestType f71338f;

        /* renamed from: g, reason: collision with root package name */
        private String f71339g;

        /* renamed from: h, reason: collision with root package name */
        private Map<String, String> f71340h = new ConcurrentHashMap(5);

        /* renamed from: i, reason: collision with root package name */
        private Map<String, String> f71341i = new LinkedHashMap(10);

        /* renamed from: j, reason: collision with root package name */
        private byte[] f71342j;

        /* renamed from: k, reason: collision with root package name */
        private AbstractJceStruct f71343k;

        public a a(RequestType requestType) {
            this.f71338f = requestType;
            return this;
        }

        public a b(String str) {
            this.f71333a = str;
            return this;
        }

        public a a(String str, int i4) {
            this.f71339g = str;
            this.f71334b = i4;
            return this;
        }

        public a b(int i4) {
            this.f71337e = i4;
            return this;
        }

        public a b(String str, String str2) {
            if (str2 == null) {
                str2 = "";
            }
            this.f71341i.put(str, str2);
            return this;
        }

        public a a(@o0 String str, String str2) {
            this.f71340h.put(str, str2);
            return this;
        }

        public a a(int i4) {
            this.f71336d = i4;
            return this;
        }

        public a a(Map<String, String> map) {
            if (map != null) {
                this.f71341i.putAll(map);
            }
            return this;
        }

        public a a(String str) {
            this.f71335c = str;
            return this;
        }

        public a a(AbstractJceStruct abstractJceStruct) {
            this.f71343k = abstractJceStruct;
            return this;
        }

        public JceRequestEntity a() {
            if (TextUtils.isEmpty(this.f71333a) && TextUtils.isEmpty(this.f71339g)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ㅻ\u0001"));
            }
            if (!TextUtils.isEmpty(this.f71335c)) {
                com.tencent.beacon.base.net.c d5 = com.tencent.beacon.base.net.c.d();
                this.f71340h.putAll(com.tencent.beacon.base.net.b.d.a());
                if (this.f71338f == RequestType.EVENT) {
                    this.f71342j = d5.f71321f.c().a((RequestPackageV2) this.f71343k);
                } else {
                    AbstractJceStruct abstractJceStruct = this.f71343k;
                    this.f71342j = d5.f71320e.c().a(com.tencent.beacon.base.net.b.d.a(this.f71336d, abstractJceStruct == null ? "".getBytes() : abstractJceStruct.toByteArray(), this.f71341i, this.f71335c));
                }
                return new JceRequestEntity(this.f71338f, this.f71333a, this.f71339g, this.f71334b, this.f71335c, this.f71342j, this.f71340h, this.f71336d, this.f71337e);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ㅼ\u0001"));
        }
    }

    public static a builder() {
        return new a();
    }

    public String getAppKey() {
        return this.appKey;
    }

    public byte[] getContent() {
        return this.content;
    }

    public String getDomain() {
        return this.domain;
    }

    public Map<String, String> getHeader() {
        return this.header;
    }

    public int getPort() {
        return this.port;
    }

    public int getRequestCmd() {
        return this.requestCmd;
    }

    public int getResponseCmd() {
        return this.responseCmd;
    }

    public RequestType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ㅽ\u0001"));
        sb.append(this.type);
        sb.append(ProtectedSandApp.s("ㅾ\u0001"));
        sb.append(this.url);
        sb.append(ProtectedSandApp.s("ㅿ\u0001"));
        sb.append(this.domain);
        sb.append(ProtectedSandApp.s("ㆀ\u0001"));
        sb.append(this.port);
        sb.append(ProtectedSandApp.s("ㆁ\u0001"));
        sb.append(this.appKey);
        sb.append(ProtectedSandApp.s("ㆂ\u0001"));
        sb.append(this.content.length);
        sb.append(ProtectedSandApp.s("ㆃ\u0001"));
        sb.append(this.header);
        sb.append(ProtectedSandApp.s("ㆄ\u0001"));
        sb.append(this.requestCmd);
        sb.append(ProtectedSandApp.s("ㆅ\u0001"));
        return androidx.view.e.a(sb, this.responseCmd, '}');
    }

    private JceRequestEntity(RequestType requestType, String str, String str2, int i4, String str3, byte[] bArr, Map<String, String> map, int i5, int i6) {
        this.type = requestType;
        this.url = str;
        this.domain = str2;
        this.port = i4;
        this.appKey = str3;
        this.content = bArr;
        this.header = map;
        this.requestCmd = i5;
        this.responseCmd = i6;
    }
}
