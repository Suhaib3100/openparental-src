package com.android.billingclient.api;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@t6
/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40353a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40354b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40355c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40356d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40357e;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* renamed from: j1, reason: collision with root package name */
        @t6
        public static final int f40358j1 = 0;

        /* renamed from: k1, reason: collision with root package name */
        @t6
        public static final int f40359k1 = 2;

        /* renamed from: l1, reason: collision with root package name */
        @t6
        public static final int f40360l1 = 3;

        /* renamed from: m1, reason: collision with root package name */
        @t6
        public static final int f40361m1 = 4;
    }

    e1(String str) throws JSONException {
        this.f40353a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f40354b = jSONObject.optString(ProtectedSandApp.s("α"));
        String optString = jSONObject.optString(ProtectedSandApp.s("β"));
        this.f40355c = optString;
        String s4 = ProtectedSandApp.s("γ");
        this.f40356d = jSONObject.has(s4) ? jSONObject.optInt(s4) : 0;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ε"));
        }
        this.f40357e = jSONObject.optString(ProtectedSandApp.s("δ"));
    }

    @androidx.annotation.o0
    @androidx.annotation.m1
    public static e1 a(@androidx.annotation.o0 String str) throws JSONException {
        return new e1(str);
    }

    @t6
    @androidx.annotation.o0
    public String b() {
        return this.f40354b;
    }

    @t6
    @androidx.annotation.o0
    public String c() {
        return this.f40355c;
    }

    @androidx.annotation.q0
    public String d() {
        return this.f40357e;
    }

    @t6
    public int e() {
        return this.f40356d;
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            return TextUtils.equals(this.f40353a, ((e1) obj).f40353a);
        }
        return false;
    }

    public int hashCode() {
        return this.f40353a.hashCode();
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ζ"));
        sb.append(this.f40354b);
        sb.append(ProtectedSandApp.s("η"));
        sb.append(this.f40355c);
        sb.append(ProtectedSandApp.s("θ"));
        return android.support.v4.media.b.a(sb, this.f40356d, ProtectedSandApp.s("ι"));
    }
}
