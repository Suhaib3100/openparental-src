package com.google.android.libraries.places.internal;

import com.android.volley.q;
import com.android.volley.toolbox.t;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzbr extends t {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbr(zzbs zzbsVar, int i4, String str, JSONObject jSONObject, q.b bVar, q.a aVar, Map map) {
        super(0, str, null, bVar, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.n
    public final Map getHeaders() {
        return this.zza;
    }
}
