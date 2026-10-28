package com.google.android.gms.common.internal;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import f9.f;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@f("Use canonical fakes instead. go/cheezhead-testing-methodology")
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes5.dex */
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @ResultIgnorabilityUnspecified
    @o0
    @KeepForSdk
    Task<Void> log(@o0 TelemetryData telemetryData);
}
