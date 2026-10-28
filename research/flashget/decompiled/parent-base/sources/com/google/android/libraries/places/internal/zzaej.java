package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaej implements zzafd {
    private static final zzaep zza = new zzaeh();
    private final zzaep zzb;

    public zzaej() {
        zzaep zzaepVar;
        zzadg zza2 = zzadg.zza();
        try {
            zzaepVar = (zzaep) Class.forName(ProtectedSandApp.s("\ue7a8")).getDeclaredMethod(ProtectedSandApp.s("\ue7a9"), null).invoke(null, null);
        } catch (Exception unused) {
            zzaepVar = zza;
        }
        zzaei zzaeiVar = new zzaei(zza2, zzaepVar);
        zzads.zzf(zzaeiVar, ProtectedSandApp.s("\ue7aa"));
        this.zzb = zzaeiVar;
    }

    private static boolean zzb(zzaeo zzaeoVar) {
        return zzaeoVar.zzc() == 1;
    }

    @Override // com.google.android.libraries.places.internal.zzafd
    public final zzafc zza(Class cls) {
        zzafe.zzE(cls);
        zzaeo zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzadk.class.isAssignableFrom(cls) ? zzaev.zzg(zzafe.zzB(), zzadc.zzb(), zzb.zza()) : zzaev.zzg(zzafe.zzz(), zzadc.zza(), zzb.zza()) : zzadk.class.isAssignableFrom(cls) ? zzb(zzb) ? zzaeu.zzg(cls, zzb, zzaex.zzb(), zzaef.zzd(), zzafe.zzB(), zzadc.zzb(), zzaen.zzb()) : zzaeu.zzg(cls, zzb, zzaex.zzb(), zzaef.zzd(), zzafe.zzB(), null, zzaen.zzb()) : zzb(zzb) ? zzaeu.zzg(cls, zzb, zzaex.zza(), zzaef.zzc(), zzafe.zzz(), zzadc.zza(), zzaen.zza()) : zzaeu.zzg(cls, zzb, zzaex.zza(), zzaef.zzc(), zzafe.zzA(), null, zzaen.zza());
    }
}
