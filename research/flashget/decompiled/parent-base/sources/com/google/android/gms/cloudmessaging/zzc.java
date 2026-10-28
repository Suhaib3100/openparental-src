package com.google.android.gms.cloudmessaging;

import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z4) throws ClassNotFoundException {
        if (!Objects.equals(str, ProtectedSandApp.s("죦"))) {
            return super.loadClass(str, z4);
        }
        Log.isLoggable(ProtectedSandApp.s("죧"), 3);
        return zzd.class;
    }
}
