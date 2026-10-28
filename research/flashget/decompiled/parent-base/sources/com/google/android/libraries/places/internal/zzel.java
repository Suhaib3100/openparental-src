package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public interface zzel {
    void zza(FetchPhotoRequest fetchPhotoRequest);

    void zzb(Task task, long j4, long j5);

    void zzc(FetchPlaceRequest fetchPlaceRequest);

    void zzd(Task task, long j4, long j5);

    void zze(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    void zzf(Task task, long j4, long j5);

    void zzg(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j4, long j5);

    void zzh(Task task, long j4, long j5);
}
