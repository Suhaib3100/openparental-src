package com.google.android.gms.common.signatureverification;

import androidx.annotation.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzd {

    @b0("Loader.class")
    private static SignatureVerificationConfiguration zza;

    public static synchronized void zza(SignatureVerificationConfiguration signatureVerificationConfiguration) {
        synchronized (zzd.class) {
            if (zza != null) {
                throw new IllegalStateException(ProtectedSandApp.s("쯃"));
            }
            zza = signatureVerificationConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized SignatureVerificationConfiguration zzc() {
        SignatureVerificationConfiguration signatureVerificationConfiguration;
        synchronized (zzd.class) {
            try {
                if (zza == null) {
                    zza(new zzb());
                }
                signatureVerificationConfiguration = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return signatureVerificationConfiguration;
    }
}
