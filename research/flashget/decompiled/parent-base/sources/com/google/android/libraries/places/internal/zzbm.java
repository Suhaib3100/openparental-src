package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzbm {
    static ApiException zza(VolleyError volleyError) {
        int i4 = volleyError instanceof NetworkError ? 7 : volleyError instanceof TimeoutError ? 15 : ((volleyError instanceof ServerError) || (volleyError instanceof ParseError)) ? 8 : volleyError instanceof AuthFailureError ? PlacesStatusCodes.REQUEST_DENIED : 13;
        l lVar = volleyError.f40811b;
        return new ApiException(new Status(i4, String.format(ProtectedSandApp.s("\ue83c"), lVar == null ? ProtectedSandApp.s("\ue83b") : String.valueOf(lVar.f40899a), volleyError)));
    }
}
