package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzjg;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzjr<T extends zzjg> {
    private static String zza = ProtectedSandApp.s("퓹");

    static <T extends zzjg> T zza(Class<T> cls) {
        String format;
        ClassLoader classLoader = zzjr.class.getClassLoader();
        if (cls.equals(zzjg.class)) {
            format = zza;
        } else {
            if (!cls.getPackage().equals(zzjr.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format(ProtectedSandApp.s("퓺"), cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return cls.cast(((zzjr) Class.forName(format, true, classLoader).getConstructor(null).newInstance(null)).zza());
                } catch (IllegalAccessException e4) {
                    throw new IllegalStateException(e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(e5);
                }
            } catch (InstantiationException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzjr.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzjr) it.next()).zza()));
                } catch (ServiceConfigurationError e10) {
                    Logger.getLogger(zzjc.class.getName()).logp(Level.SEVERE, ProtectedSandApp.s("퓼"), ProtectedSandApp.s("퓽"), ProtectedSandApp.s("퓻").concat(cls.getSimpleName()), (Throwable) e10);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod(ProtectedSandApp.s("퓾"), Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    protected abstract T zza();
}
