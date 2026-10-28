package com.android.volley.toolbox;

import androidx.annotation.q0;
import com.android.volley.ParseError;
import com.android.volley.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: JsonArrayRequest.java */
/* loaded from: classes3.dex */
public class s extends u<JSONArray> {
    public s(String str, q.b<JSONArray> bVar, @q0 q.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.u, com.android.volley.n
    protected com.android.volley.q<JSONArray> parseNetworkResponse(com.android.volley.l lVar) {
        try {
            return com.android.volley.q.c(new JSONArray(new String(lVar.f40900b, m.g(lVar.f40901c, ProtectedSandApp.s("۷")))), m.e(lVar));
        } catch (UnsupportedEncodingException e4) {
            return com.android.volley.q.a(new ParseError(e4));
        } catch (JSONException e5) {
            return com.android.volley.q.a(new ParseError(e5));
        }
    }

    public s(int i4, String str, @q0 JSONArray jSONArray, q.b<JSONArray> bVar, @q0 q.a aVar) {
        super(i4, str, jSONArray != null ? jSONArray.toString() : null, bVar, aVar);
    }
}
