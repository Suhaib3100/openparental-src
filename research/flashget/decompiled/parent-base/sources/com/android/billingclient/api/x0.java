package com.android.billingclient.api;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40763a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40764b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f40765c;

    public x0(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) throws JSONException {
        this.f40763a = str;
        this.f40764b = str2;
        this.f40765c = new JSONObject(str);
    }

    private final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f40765c;
        String s4 = ProtectedSandApp.s("\u05f6");
        if (jSONObject.has(s4)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(s4);
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList.add(optJSONArray.optString(i4));
                }
            }
        } else {
            String s5 = ProtectedSandApp.s("\u05f7");
            if (jSONObject.has(s5)) {
                arrayList.add(jSONObject.optString(s5));
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40765c.optString(ProtectedSandApp.s("\u05f8"));
    }

    @androidx.annotation.o0
    public String b() {
        return this.f40763a;
    }

    @androidx.annotation.o0
    public List<String> c() {
        return i();
    }

    public long d() {
        return this.f40765c.optLong(ProtectedSandApp.s("\u05f9"));
    }

    @androidx.annotation.o0
    public String e() {
        JSONObject jSONObject = this.f40765c;
        return jSONObject.optString(ProtectedSandApp.s("\u05fb"), jSONObject.optString(ProtectedSandApp.s("\u05fa")));
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return TextUtils.equals(this.f40763a, x0Var.b()) && TextUtils.equals(this.f40764b, x0Var.g());
    }

    public int f() {
        return this.f40765c.optInt(ProtectedSandApp.s("\u05fc"), 1);
    }

    @androidx.annotation.o0
    public String g() {
        return this.f40764b;
    }

    @androidx.annotation.o0
    @Deprecated
    public ArrayList<String> h() {
        return i();
    }

    public int hashCode() {
        return this.f40763a.hashCode();
    }

    @androidx.annotation.o0
    public String toString() {
        return ProtectedSandApp.s("\u05fd").concat(String.valueOf(this.f40763a));
    }
}
