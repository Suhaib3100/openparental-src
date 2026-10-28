package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.b0;
import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhk {

    @b0("PhenotypeConstants.class")
    private static final androidx.collection.a<String, Uri> zza = new androidx.collection.a<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzhk.class) {
            androidx.collection.a<String, Uri> aVar = zza;
            uri = aVar.get(str);
            if (uri == null) {
                uri = Uri.parse(ProtectedSandApp.s("풌") + Uri.encode(str));
                aVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        String s4 = ProtectedSandApp.s("풍");
        if (!str.contains(s4)) {
            return z3.a(str, s4, context.getPackageName());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("풎").concat(str));
    }

    public static boolean zza(String str, String str2) {
        if (str.equals(ProtectedSandApp.s("풏")) || str.equals(ProtectedSandApp.s("풐"))) {
            return str2.contains(ProtectedSandApp.s("풑")) || str2.contains(ProtectedSandApp.s("풒"));
        }
        return false;
    }
}
