package com.android.volley.toolbox;

import androidx.annotation.q0;
import com.android.volley.ParseError;
import com.android.volley.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonObjectRequest.java */
/* loaded from: classes3.dex */
public class t extends u<JSONObject> {
    public t(String str, q.b<JSONObject> bVar, @q0 q.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.u, com.android.volley.n
    protected com.android.volley.q<JSONObject> parseNetworkResponse(com.android.volley.l lVar) {
        try {
            return com.android.volley.q.c(new JSONObject(new String(lVar.f40900b, m.g(lVar.f40901c, ProtectedSandApp.s("۸")))), m.e(lVar));
        } catch (UnsupportedEncodingException e4) {
            return com.android.volley.q.a(new ParseError(e4));
        } catch (JSONException e5) {
            return com.android.volley.q.a(new ParseError(e5));
        }
    }

    @Deprecated
    public t(String str, @q0 JSONObject jSONObject, q.b<JSONObject> bVar, @q0 q.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    public t(int i4, String str, @q0 JSONObject jSONObject, q.b<JSONObject> bVar, @q0 q.a aVar) {
        super(i4, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
