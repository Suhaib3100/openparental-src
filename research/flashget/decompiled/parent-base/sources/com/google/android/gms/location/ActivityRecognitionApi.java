package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.b1;
import androidx.annotation.o0;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public interface ActivityRecognitionApi {
    @o0
    @b1("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    PendingResult<Status> removeActivityUpdates(@o0 GoogleApiClient googleApiClient, @o0 PendingIntent pendingIntent);

    @o0
    @b1("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    PendingResult<Status> requestActivityUpdates(@o0 GoogleApiClient googleApiClient, long j4, @o0 PendingIntent pendingIntent);
}
