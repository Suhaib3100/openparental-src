package com.android.billingclient.api;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzcf;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40740a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40741b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f40742c;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @s6
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f40743a;

        private a(JSONObject jSONObject) {
            this.f40743a = jSONObject;
        }

        @androidx.annotation.o0
        public List<String> a() {
            JSONArray optJSONArray;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = this.f40743a;
            String s4 = ProtectedSandApp.s("נ");
            if (jSONObject.has(s4) && (optJSONArray = this.f40743a.optJSONArray(s4)) != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList.add(optJSONArray.optString(i4));
                }
            }
            return arrayList;
        }

        @androidx.annotation.o0
        public String b() {
            return this.f40743a.optString(ProtectedSandApp.s("ס"));
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* renamed from: g1, reason: collision with root package name */
        public static final int f40744g1 = 0;

        /* renamed from: h1, reason: collision with root package name */
        public static final int f40745h1 = 1;

        /* renamed from: i1, reason: collision with root package name */
        public static final int f40746i1 = 2;
    }

    public w0(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) throws JSONException {
        this.f40740a = str;
        this.f40741b = str2;
        this.f40742c = new JSONObject(str);
        zzcf.zzk();
    }

    private final ArrayList q() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f40742c;
        String s4 = ProtectedSandApp.s("ע");
        if (jSONObject.has(s4)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(s4);
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList.add(optJSONArray.optString(i4));
                }
            }
        } else {
            String s5 = ProtectedSandApp.s("ף");
            if (jSONObject.has(s5)) {
                arrayList.add(jSONObject.optString(s5));
            }
        }
        return arrayList;
    }

    @androidx.annotation.q0
    public com.android.billingclient.api.a a() {
        JSONObject jSONObject = this.f40742c;
        String optString = jSONObject.optString(ProtectedSandApp.s("פ"));
        String optString2 = jSONObject.optString(ProtectedSandApp.s("ץ"));
        if (optString == null && optString2 == null) {
            return null;
        }
        return new com.android.billingclient.api.a(optString, optString2);
    }

    @androidx.annotation.o0
    public String b() {
        return this.f40742c.optString(ProtectedSandApp.s("צ"));
    }

    @androidx.annotation.q0
    public String c() {
        String optString = this.f40742c.optString(ProtectedSandApp.s("ק"));
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    @androidx.annotation.o0
    public String d() {
        return this.f40740a;
    }

    @androidx.annotation.o0
    public String e() {
        return this.f40742c.optString(ProtectedSandApp.s("ר"));
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return TextUtils.equals(this.f40740a, w0Var.d()) && TextUtils.equals(this.f40741b, w0Var.l());
    }

    @androidx.annotation.q0
    @s6
    public a f() {
        JSONObject optJSONObject = this.f40742c.optJSONObject(ProtectedSandApp.s("ש"));
        if (optJSONObject == null) {
            return null;
        }
        return new a(optJSONObject);
    }

    @androidx.annotation.o0
    public List<String> g() {
        return q();
    }

    public int h() {
        return this.f40742c.optInt(ProtectedSandApp.s("ת"), 1) != 4 ? 1 : 2;
    }

    public int hashCode() {
        return this.f40740a.hashCode();
    }

    public long i() {
        return this.f40742c.optLong(ProtectedSandApp.s("\u05eb"));
    }

    @androidx.annotation.o0
    public String j() {
        JSONObject jSONObject = this.f40742c;
        return jSONObject.optString(ProtectedSandApp.s("\u05ed"), jSONObject.optString(ProtectedSandApp.s("\u05ec")));
    }

    public int k() {
        return this.f40742c.optInt(ProtectedSandApp.s("\u05ee"), 1);
    }

    @androidx.annotation.o0
    public String l() {
        return this.f40741b;
    }

    @androidx.annotation.o0
    @Deprecated
    public ArrayList<String> m() {
        return q();
    }

    public boolean n() {
        return this.f40742c.optBoolean(ProtectedSandApp.s("ׯ"), true);
    }

    public boolean o() {
        return this.f40742c.optBoolean(ProtectedSandApp.s("װ"));
    }

    public boolean p() {
        return this.f40742c.optBoolean(ProtectedSandApp.s("ױ"));
    }

    @androidx.annotation.o0
    public String toString() {
        return ProtectedSandApp.s("ײ").concat(String.valueOf(this.f40740a));
    }
}
