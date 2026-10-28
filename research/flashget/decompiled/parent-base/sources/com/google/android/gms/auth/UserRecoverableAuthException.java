package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@KeepName
/* loaded from: classes5.dex */
public class UserRecoverableAuthException extends GoogleAuthException {

    @q0
    private final Intent zza;

    @q0
    private final PendingIntent zzb;
    private final zzn zzc;

    public UserRecoverableAuthException(@q0 String str, @q0 Intent intent) {
        this(str, intent, null, zzn.zza);
    }

    @o0
    public static UserRecoverableAuthException zza(@q0 String str, @o0 Intent intent, @o0 PendingIntent pendingIntent) {
        Preconditions.checkNotNull(intent);
        Preconditions.checkNotNull(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, zzn.zzb);
    }

    @q0
    public Intent getIntent() {
        Intent intent = this.zza;
        if (intent != null) {
            return new Intent(intent);
        }
        this.zzc.ordinal();
        return null;
    }

    private UserRecoverableAuthException(@q0 String str, @q0 Intent intent, @q0 PendingIntent pendingIntent, zzn zznVar) {
        super(str);
        this.zzb = pendingIntent;
        this.zza = intent;
        this.zzc = (zzn) Preconditions.checkNotNull(zznVar);
    }
}
