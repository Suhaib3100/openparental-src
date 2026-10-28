package com.google.android.gms.dynamite;

import com.flashget.kidsdownloader.ProtectedSandApp;
import dalvik.system.PathClassLoader;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class zzc extends PathClassLoader {
    zzc(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z5) throws ClassNotFoundException {
        if (!str.startsWith(ProtectedSandApp.s("ೣ")) && !str.startsWith(ProtectedSandApp.s("\u0ce4"))) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z5);
    }
}
