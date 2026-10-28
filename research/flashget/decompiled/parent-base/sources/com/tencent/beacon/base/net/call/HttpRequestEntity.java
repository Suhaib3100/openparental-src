package com.tencent.beacon.base.net.call;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.BodyType;
import com.tencent.beacon.base.net.HttpMethod;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class HttpRequestEntity {
    private BodyType bodyType;
    private byte[] content;
    private final Map<String, String> formParams;
    private final Map<String, String> headers;
    private String json;
    private final HttpMethod method;
    private final String tag;
    private final String url;

    /* synthetic */ HttpRequestEntity(HttpMethod httpMethod, String str, Map map, BodyType bodyType, String str2, Map map2, byte[] bArr, String str3, d dVar) {
        this(httpMethod, str, map, bodyType, str2, map2, bArr, str3);
    }

    public static a builder() {
        return new a();
    }

    public BodyType bodyType() {
        return this.bodyType;
    }

    public byte[] content() {
        return this.content;
    }

    public Map<String, String> formParams() {
        return this.formParams;
    }

    public Map<String, String> headers() {
        return this.headers;
    }

    public String json() {
        return this.json;
    }

    public HttpMethod method() {
        return this.method;
    }

    public String tag() {
        return this.tag;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ㅳ\u0001"));
        sb.append(this.url);
        sb.append(ProtectedSandApp.s("ㅴ\u0001"));
        sb.append(this.method);
        sb.append(ProtectedSandApp.s("ㅵ\u0001"));
        sb.append(this.headers);
        sb.append(ProtectedSandApp.s("ㅶ\u0001"));
        sb.append(this.formParams);
        sb.append(ProtectedSandApp.s("ㅷ\u0001"));
        sb.append(this.bodyType);
        sb.append(ProtectedSandApp.s("ㅸ\u0001"));
        sb.append(this.json);
        sb.append(ProtectedSandApp.s("ㅹ\u0001"));
        return android.support.v4.media.c.a(sb, this.tag, ProtectedSandApp.s("ㅺ\u0001"));
    }

    public String url() {
        return this.url;
    }

    private HttpRequestEntity(HttpMethod httpMethod, String str, Map<String, String> map, BodyType bodyType, String str2, Map<String, String> map2, byte[] bArr, String str3) {
        this.method = httpMethod;
        this.url = str;
        this.headers = map;
        this.bodyType = bodyType;
        this.json = str2;
        this.formParams = map2;
        this.content = bArr;
        this.tag = str3;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private HttpMethod f71325a;

        /* renamed from: b, reason: collision with root package name */
        private String f71326b;

        /* renamed from: c, reason: collision with root package name */
        private String f71327c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, String> f71328d = new HashMap(3);

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f71329e = new HashMap(3);

        /* renamed from: f, reason: collision with root package name */
        private String f71330f;

        /* renamed from: g, reason: collision with root package name */
        private BodyType f71331g;

        /* renamed from: h, reason: collision with root package name */
        private byte[] f71332h;

        private void a(BodyType bodyType) {
            if (this.f71331g == null) {
                this.f71331g = bodyType;
            }
            if (this.f71331g != bodyType) {
                throw new IllegalStateException(ProtectedSandApp.s("ㅬ\u0001"));
            }
        }

        public a b(@o0 String str) {
            this.f71326b = str;
            return this;
        }

        public a a(HttpMethod httpMethod) {
            this.f71325a = httpMethod;
            return this;
        }

        public a a(@o0 Map<String, String> map) {
            a(BodyType.FORM);
            this.f71328d.putAll(map);
            return this;
        }

        public a a(String str) {
            this.f71327c = str;
            return this;
        }

        public HttpRequestEntity a() {
            if (this.f71325a != null) {
                if (!TextUtils.isEmpty(this.f71326b)) {
                    BodyType bodyType = this.f71331g;
                    if (bodyType != null) {
                        int i4 = d.f71347a[bodyType.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3 && this.f71332h == null) {
                                    throw new NullPointerException(ProtectedSandApp.s("ㅭ\u0001"));
                                }
                            } else if (this.f71328d.isEmpty()) {
                                throw new NullPointerException(ProtectedSandApp.s("ㅮ\u0001"));
                            }
                        } else if (TextUtils.isEmpty(this.f71330f)) {
                            throw new NullPointerException(ProtectedSandApp.s("ㅯ\u0001"));
                        }
                        return new HttpRequestEntity(this.f71325a, this.f71326b, this.f71329e, this.f71331g, this.f71330f, this.f71328d, this.f71332h, this.f71327c, null);
                    }
                    throw new NullPointerException(ProtectedSandApp.s("ㅰ\u0001"));
                }
                throw new NullPointerException(ProtectedSandApp.s("ㅱ\u0001"));
            }
            throw new NullPointerException(ProtectedSandApp.s("ㅲ\u0001"));
        }
    }
}
