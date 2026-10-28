package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzee {
    private static final zzeg zza = zzb(zzeg.zzd);

    private static zzeg zzb(String[] strArr) {
        zzeg zzegVar;
        try {
            zzegVar = zzeh.zza();
        } catch (NoClassDefFoundError unused) {
            zzegVar = null;
        }
        if (zzegVar != null) {
            return zzegVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzeg) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(ProtectedSandApp.s("큒"));
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, ProtectedSandApp.s("큓")).toString());
    }
}
