package com.google.android.libraries.places.internal;

import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import dalvik.system.VMStack;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzjv extends zzjq {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzjp zzc;

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    final class zza {
        zza() {
        }

        static boolean zza() {
            return zzjv.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z4 = true;
        if (str != null && !ProtectedSandApp.s("\uea0a").equals(str)) {
            z4 = false;
        }
        zzb = z4;
        zzc = new zzjp() { // from class: com.google.android.libraries.places.internal.zzjv.1
            @Override // com.google.android.libraries.places.internal.zzjp
            public zziv zza(Class<?> cls, int i4) {
                return zziv.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzjp
            public String zzb(Class cls) {
                StackTraceElement zza2;
                if (zzjv.zza) {
                    try {
                        if (cls.equals(zzjv.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzjv.zzb || (zza2 = zzks.zza(cls, 1)) == null) {
                    return null;
                }
                return zza2.getClassName();
            }
        };
    }

    static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzt() {
        try {
            Class.forName(ProtectedSandApp.s("\uea0b")).getMethod(ProtectedSandApp.s("\uea0c"), null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzjq
    protected zzja zze(String str) {
        return zzjy.zzb(str);
    }

    @Override // com.google.android.libraries.places.internal.zzjq
    protected zzjp zzh() {
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzjq
    protected zzke zzj() {
        return zzjz.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzjq
    protected String zzm() {
        return ProtectedSandApp.s("\uea0d");
    }
}
