package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzga extends zzfq implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    zzga(String str, String str2) {
        MessageDigest zzb = zzb(ProtectedSandApp.s("큳"));
        this.zza = zzb;
        this.zzb = zzb.getDigestLength();
        this.zzd = ProtectedSandApp.s("클");
        this.zzc = zzc(zzb);
    }

    private static MessageDigest zzb(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }

    private static boolean zzc(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzfu
    public final zzfv zza() {
        zzfy zzfyVar = null;
        if (this.zzc) {
            try {
                return new zzfz((MessageDigest) this.zza.clone(), this.zzb, zzfyVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzfz(zzb(this.zza.getAlgorithm()), this.zzb, zzfyVar);
    }
}
