package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzay {
    private final String zza;
    private final Set zzb;
    private final boolean zzc;

    private zzay(String str, Set set, boolean z4, boolean z5, boolean z6, boolean z7, boolean z10) {
        this.zza = ProtectedSandApp.s("쿽");
        this.zzb = set;
        this.zzc = z7;
    }

    @SideEffectFree
    public final zzaq zza(String str, long j4) {
        final Class<Long> cls = Long.class;
        return new zzaq(this.zza, str, Long.valueOf(j4), new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzav
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzaw
        }), true);
    }

    @SideEffectFree
    public final zzaq zzb(String str, String str2) {
        final Class<String> cls = String.class;
        return new zzaq(this.zza, str, str2, new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzat
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzau
        }), true);
    }

    @SideEffectFree
    public final zzaq zzc(String str, boolean z4) {
        final Class<Boolean> cls = Boolean.class;
        return new zzaq(this.zza, str, Boolean.valueOf(z4), new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzar
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzas
        }), true);
    }

    public final zzay zzd() {
        return new zzay(this.zza, this.zzb, false, false, false, true, false);
    }

    public final zzay zze(Set set) {
        return new zzay(this.zza, set, false, false, false, this.zzc, false);
    }

    public zzay(String str) {
        this(ProtectedSandApp.s("쿽"), zzcf.zzk(), false, false, false, false, false);
    }
}
