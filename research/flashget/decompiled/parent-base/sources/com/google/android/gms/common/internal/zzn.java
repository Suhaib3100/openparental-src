package com.google.android.gms.common.internal;

import android.content.ComponentName;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzn {

    @q0
    private final String zza;

    @q0
    private final String zzb;

    @q0
    private final ComponentName zzc;
    private final int zzd;
    private final boolean zze;

    public zzn(ComponentName componentName, int i4) {
        this.zza = null;
        this.zzb = null;
        Preconditions.checkNotNull(componentName);
        this.zzc = componentName;
        this.zzd = 4225;
        this.zze = false;
    }

    public final boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.equal(this.zza, zznVar.zza) && Objects.equal(this.zzb, zznVar.zzb) && Objects.equal(this.zzc, zznVar.zzc) && this.zze == zznVar.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, 4225, Boolean.valueOf(this.zze));
    }

    public final String toString() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.zzc;
        Preconditions.checkNotNull(componentName);
        return componentName.flattenToString();
    }

    @q0
    public final String zza() {
        return this.zza;
    }

    @q0
    public final String zzb() {
        return this.zzb;
    }

    @q0
    public final ComponentName zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public zzn(String str, int i4, boolean z4) {
        this(str, ProtectedSandApp.s("쭚"), 4225, false);
    }

    public zzn(String str, String str2, int i4, boolean z4) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        Preconditions.checkNotEmpty(str2);
        this.zzb = str2;
        this.zzc = null;
        this.zzd = 4225;
        this.zze = z4;
    }
}
