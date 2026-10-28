package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@o0 Status status) {
        super(status);
    }

    @o0
    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(@o0 Activity activity, int i5) throws IntentSender.SendIntentException {
        getStatus().startResolutionForResult(activity, i5);
    }
}
