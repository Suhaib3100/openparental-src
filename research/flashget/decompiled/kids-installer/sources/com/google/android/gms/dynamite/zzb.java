package com.google.android.gms.dynamite;

import android.os.Looper;
import androidx.annotation.b0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzb {

    @q0
    @b0("DynamiteLoaderV2ClassLoader.class")
    private static volatile ClassLoader zza;

    @q0
    @b0("DynamiteLoaderV2ClassLoader.class")
    private static volatile Thread zzb;

    @q0
    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (zza == null) {
                zza = zzb();
            }
            classLoader = zza;
        }
        return classLoader;
    }

    @q0
    private static synchronized ClassLoader zzb() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (zzb == null) {
                zzb = zzc();
                if (zzb == null) {
                    return null;
                }
            }
            synchronized (zzb) {
                try {
                    classLoader = zzb.getContextClassLoader();
                } catch (SecurityException e6) {
                    e6.getMessage();
                }
            }
            return classLoader;
        }
    }

    @q0
    private static synchronized Thread zzc() {
        SecurityException e6;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i6];
                        if (ProtectedSandApp.s("\u0cdf").equals(threadGroup.getName())) {
                            break;
                        }
                        i6++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, ProtectedSandApp.s("ೠ"));
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i5 >= activeCount) {
                            thread2 = null;
                            break;
                        }
                        thread2 = threadArr[i5];
                        if (ProtectedSandApp.s("ೡ").equals(thread2.getName())) {
                            break;
                        }
                        i5++;
                    }
                } catch (SecurityException e7) {
                    e6 = e7;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new zza(threadGroup, ProtectedSandApp.s("ೢ"));
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e8) {
                            e6 = e8;
                            e6.getMessage();
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (SecurityException e9) {
                        e6 = e9;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
