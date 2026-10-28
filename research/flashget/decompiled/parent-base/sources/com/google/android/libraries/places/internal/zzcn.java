package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzcn {
    private Bitmap zza;

    public final zzcp zza() {
        zzha.zzi(this.zza != null, ProtectedSandApp.s("\ue858"));
        return new zzcp(this.zza, null);
    }

    public final zzcn zzb(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }
}
