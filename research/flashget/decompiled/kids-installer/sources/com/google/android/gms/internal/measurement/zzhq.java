package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.b0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhq {

    @b0("PhenotypeConstants.class")
    private static final androidx.collection.a zza = new androidx.collection.a();

    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            androidx.collection.a aVar = zza;
            String s5 = ProtectedSandApp.s("ඥ");
            Uri uri = (Uri) aVar.get(s5);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse(ProtectedSandApp.s("ඦ").concat(String.valueOf(Uri.encode(s5))));
            aVar.put(s5, parse);
            return parse;
        }
    }
}
