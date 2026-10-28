package com.google.android.gms.cloudmessaging;

import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z5) throws ClassNotFoundException {
        if (!ProtectedSandApp.s("৬").equals(str)) {
            return super.loadClass(str, z5);
        }
        Log.isLoggable(ProtectedSandApp.s("৭"), 3);
        return zzd.class;
    }
}
