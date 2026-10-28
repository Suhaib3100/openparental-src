package com.google.android.gms.common.signatureverification;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class SignatureVerificationConfigurationProvider {
    private static final SignatureVerificationConfiguration zza;

    static {
        SignatureVerificationConfiguration zzc;
        zzc = zzd.zzc();
        zza = zzc;
    }

    private SignatureVerificationConfigurationProvider() {
    }

    @o0
    public static SignatureVerificationConfiguration zza() {
        return zza;
    }
}
