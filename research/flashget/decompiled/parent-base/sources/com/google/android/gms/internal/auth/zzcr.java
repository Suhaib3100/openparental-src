package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.annotation.b0;
import androidx.collection.a;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzcr {

    @b0("PhenotypeConstants.class")
    private static final a zza = new a();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            a aVar = zza;
            String s4 = ProtectedSandApp.s("켈");
            Uri uri = (Uri) aVar.get(s4);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse(ProtectedSandApp.s("켉").concat(String.valueOf(Uri.encode(s4))));
            aVar.put(s4, parse);
            return parse;
        }
    }
}
