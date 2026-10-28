package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeo {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzen zzd;

    public zzeo(zzen zzenVar) {
        this.zzd = zzenVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            Object obj = strArr[i5];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i5];
                    if (str2 == null) {
                        str2 = strArr2[i5] + ProtectedSandApp.s("ར") + strArr[i5] + ProtectedSandApp.s("ལ");
                        strArr3[i5] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String zza(Object[] objArr) {
        if (objArr == null) {
            return ProtectedSandApp.s("ཤ");
        }
        StringBuilder a6 = r.a(ProtectedSandApp.s("ཥ"));
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (a6.length() != 1) {
                    a6.append(ProtectedSandApp.s("ས"));
                }
                a6.append(zzb2);
            }
        }
        a6.append(ProtectedSandApp.s("ཧ"));
        return a6.toString();
    }

    protected final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder a6 = r.a(ProtectedSandApp.s("ཨ"));
        for (String str : bundle.keySet()) {
            if (a6.length() != 8) {
                a6.append(ProtectedSandApp.s("ཀྵ"));
            }
            a6.append(zze(str));
            a6.append(ProtectedSandApp.s("ཪ"));
            Object obj = bundle.get(str);
            a6.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        a6.append(ProtectedSandApp.s("ཫ"));
        return a6.toString();
    }

    protected final String zzc(zzau zzauVar) {
        if (!this.zzd.zza()) {
            return zzauVar.toString();
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ཬ"));
        sb.append(zzauVar.zzc);
        sb.append(ProtectedSandApp.s("\u0f6d"));
        sb.append(zzd(zzauVar.zza));
        sb.append(ProtectedSandApp.s("\u0f6e"));
        zzas zzasVar = zzauVar.zzb;
        sb.append(zzasVar == null ? null : !this.zzd.zza() ? zzasVar.toString() : zzb(zzasVar.zzc()));
        return sb.toString();
    }

    protected final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhc.zzc, zzhc.zza, zza);
    }

    protected final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhd.zzb, zzhd.zza, zzb);
    }

    protected final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith(ProtectedSandApp.s("\u0f6f")) ? e.a(ProtectedSandApp.s("\u0f70"), str, ProtectedSandApp.s("ཱ")) : zzg(str, zzhe.zzb, zzhe.zza, zzc);
    }
}
