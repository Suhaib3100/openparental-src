package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzkv {
    private static final Logger zza = Logger.getLogger(zzki.class.getName());
    private static final String zzb = ProtectedSandApp.s("จ");

    zzkv() {
    }

    static zzkn zzb(Class cls) {
        String format;
        ClassLoader classLoader = zzkv.class.getClassLoader();
        if (cls.equals(zzkn.class)) {
            format = zzb;
        } else {
            if (!cls.getPackage().equals(zzkv.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format(ProtectedSandApp.s("ฉ"), cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        try {
                            return (zzkn) cls.cast(((zzkv) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                        } catch (IllegalAccessException e6) {
                            throw new IllegalStateException(e6);
                        }
                    } catch (InvocationTargetException e7) {
                        throw new IllegalStateException(e7);
                    }
                } catch (NoSuchMethodException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (InstantiationException e9) {
                throw new IllegalStateException(e9);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzkv.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzkn) cls.cast(((zzkv) it.next()).zza()));
                } catch (ServiceConfigurationError e10) {
                    zza.logp(Level.SEVERE, ProtectedSandApp.s("ช"), ProtectedSandApp.s("ซ"), ProtectedSandApp.s("ฌ").concat(cls.getSimpleName()), (Throwable) e10);
                }
            }
            if (arrayList.size() == 1) {
                return (zzkn) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzkn) cls.getMethod(ProtectedSandApp.s("ญ"), Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    protected abstract zzkn zza();
}
