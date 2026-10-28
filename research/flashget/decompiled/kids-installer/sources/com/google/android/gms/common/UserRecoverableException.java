package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(@o0 String str, @o0 Intent intent) {
        super(str);
        this.zza = intent;
    }

    @o0
    public Intent getIntent() {
        return new Intent(this.zza);
    }
}
