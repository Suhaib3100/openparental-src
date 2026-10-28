package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(@o0 Activity activity, int i4) throws IntentSender.SendIntentException;
}
