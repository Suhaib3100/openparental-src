package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzjo {
    private static final zzjq zza = zzb(zzjq.zzd);

    private static zzjq zzb(String[] strArr) {
        zzjq zzjqVar;
        try {
            zzjqVar = zzjr.zza();
        } catch (NoClassDefFoundError unused) {
            zzjqVar = null;
        }
        if (zzjqVar != null) {
            return zzjqVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzjq) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(ProtectedSandApp.s("\uea05"));
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, ProtectedSandApp.s("\uea06")).toString());
    }
}
