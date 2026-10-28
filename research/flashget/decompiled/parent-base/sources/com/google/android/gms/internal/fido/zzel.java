package com.google.android.gms.internal.fido;

import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import dalvik.system.VMStack;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzel extends zzeg {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzef zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    final class zza {
        zza() {
        }

        static boolean zza() {
            return zzel.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z4 = true;
        if (str != null && !ProtectedSandApp.s("큗").equals(str)) {
            z4 = false;
        }
        zzb = z4;
        zzc = new zzef() { // from class: com.google.android.gms.internal.fido.zzel.1
            @Override // com.google.android.gms.internal.fido.zzef
            public zzdj zza(Class<?> cls, int i4) {
                return zzdj.zza;
            }

            @Override // com.google.android.gms.internal.fido.zzef
            public String zzb(Class cls) {
                StackTraceElement zza2;
                if (zzel.zza) {
                    try {
                        if (cls.equals(zzel.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzel.zzb || (zza2 = zzfj.zza(cls, 1)) == null) {
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
            Class.forName(ProtectedSandApp.s("큘")).getMethod(ProtectedSandApp.s("큙"), null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected zzdp zze(String str) {
        return zzeo.zzb(str);
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected zzef zzh() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected zzev zzj() {
        return zzep.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected String zzm() {
        return ProtectedSandApp.s("큚");
    }
}
