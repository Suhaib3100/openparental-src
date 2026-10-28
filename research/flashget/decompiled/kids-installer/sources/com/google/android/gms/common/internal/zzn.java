package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzn {
    private static final Uri zza = new Uri.Builder().scheme(ProtectedSandApp.s("\u0bbd")).authority(ProtectedSandApp.s("ா")).build();

    @q0
    private final String zzb;

    @q0
    private final String zzc;

    @q0
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzn(ComponentName componentName, int i5) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = i5;
        this.zzf = false;
    }

    public final boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.equal(this.zzb, zznVar.zzb) && Objects.equal(this.zzc, zznVar.zzc) && Objects.equal(this.zzd, zznVar.zzd) && this.zze == zznVar.zze && this.zzf == zznVar.zzf;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zzd);
        return this.zzd.flattenToString();
    }

    public final int zza() {
        return this.zze;
    }

    @q0
    public final ComponentName zzb() {
        return this.zzd;
    }

    public final Intent zzc(Context context) {
        Bundle bundle;
        if (this.zzb == null) {
            return new Intent().setComponent(this.zzd);
        }
        if (this.zzf) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(ProtectedSandApp.s("ீ"), this.zzb);
            try {
                bundle = context.getContentResolver().call(zza, ProtectedSandApp.s("ு"), (String) null, bundle2);
            } catch (IllegalArgumentException e6) {
                ProtectedSandApp.s("ூ").concat(e6.toString());
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable(ProtectedSandApp.s("\u0bc3")) : null;
            if (r1 == null) {
                ProtectedSandApp.s("\u0bc4").concat(String.valueOf(this.zzb));
            }
        }
        return r1 != null ? r1 : new Intent(this.zzb).setPackage(this.zzc);
    }

    @q0
    public final String zzd() {
        return this.zzc;
    }

    public zzn(String str, int i5, boolean z5) {
        this(str, ProtectedSandApp.s("ி"), i5, false);
    }

    public zzn(String str, String str2, int i5, boolean z5) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = i5;
        this.zzf = z5;
    }
}
