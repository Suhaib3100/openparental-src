package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzes extends zzei {
    private final zzdn zza;
    private final Level zzb;
    private final Set zzc;
    private final zzea zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzes(String str, @NullableDecl String str2, boolean z4, zzdn zzdnVar, boolean z5, boolean z6) {
        super(str2);
        Set set;
        zzea zzeaVar;
        Level level = Level.ALL;
        set = zzeu.zza;
        zzeaVar = zzeu.zzb;
        this.zza = zzdnVar;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzeaVar;
    }
}
