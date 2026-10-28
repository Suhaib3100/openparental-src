package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.d;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgh {
    private static final AtomicReference<String[]> zza = new AtomicReference<>();
    private static final AtomicReference<String[]> zzb = new AtomicReference<>();
    private static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzgk zzd;

    public zzgh(zzgk zzgkVar) {
        this.zzd = zzgkVar;
    }

    private final String zza(Object[] objArr) {
        if (objArr == null) {
            return ProtectedSandApp.s("\ude5b");
        }
        StringBuilder a5 = j4.a(ProtectedSandApp.s("\ude5c"));
        for (Object obj : objArr) {
            String zza2 = obj instanceof Bundle ? zza((Bundle) obj) : String.valueOf(obj);
            if (zza2 != null) {
                if (a5.length() != 1) {
                    a5.append(ProtectedSandApp.s("\ude5d"));
                }
                a5.append(zza2);
            }
        }
        a5.append(ProtectedSandApp.s("\ude5e"));
        return a5.toString();
    }

    protected final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zzjk.zzb, zzjk.zza, zzb);
    }

    protected final String zzc(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith(ProtectedSandApp.s("\ude65")) ? d.a(ProtectedSandApp.s("\ude66"), str, ProtectedSandApp.s("\ude5a")) : zza(str, zzjj.zzb, zzjj.zza, zzc);
    }

    protected final String zza(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder a5 = j4.a(ProtectedSandApp.s("\ude5f"));
        for (String str : bundle.keySet()) {
            if (a5.length() != 8) {
                a5.append(ProtectedSandApp.s("\ude5d"));
            }
            a5.append(zzb(str));
            a5.append(ProtectedSandApp.s("\ude60"));
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zza(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            a5.append(valueOf);
        }
        a5.append(ProtectedSandApp.s("\ude61"));
        return a5.toString();
    }

    protected final String zza(zzbf zzbfVar) {
        String str = null;
        if (zzbfVar == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return zzbfVar.toString();
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\ude62"));
        sb.append(zzbfVar.zzc);
        sb.append(ProtectedSandApp.s("\ude63"));
        sb.append(zza(zzbfVar.zza));
        sb.append(ProtectedSandApp.s("\ude64"));
        zzbe zzbeVar = zzbfVar.zzb;
        if (zzbeVar != null) {
            if (!this.zzd.zza()) {
                str = zzbeVar.toString();
            } else {
                str = zza(zzbeVar.zzb());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    protected final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zzji.zzc, zzji.zza, zza);
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (Objects.equals(str, strArr[i4])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i4] == null) {
                            strArr3[i4] = strArr2[i4] + ProtectedSandApp.s("\ude59") + strArr[i4] + ProtectedSandApp.s("\ude5a");
                        }
                        str2 = strArr3[i4];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }
}
