package com.google.android.libraries.places.internal;

import android.location.Location;
import androidx.annotation.b1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzcj implements PlacesClient {
    private final zzbn zza;
    private final zzbd zzb;
    private final zzbi zzc;
    private final zzel zzd;
    private final zzas zze;

    zzcj(zzbn zzbnVar, zzbd zzbdVar, zzbi zzbiVar, zzel zzelVar, zzas zzasVar) {
        this.zza = zzbnVar;
        this.zzb = zzbdVar;
        this.zzc = zzbiVar;
        this.zzd = zzelVar;
        this.zze = zzasVar;
    }

    private static void zzg(zzba zzbaVar, @q0 zzbb zzbbVar) {
        zzba.zza(zzbaVar, zzba.zzb(ProtectedSandApp.s("\ue84a")));
        zzax.zza();
        zzax.zza();
        zzba.zza(zzbaVar, zzba.zzb(ProtectedSandApp.s("\ue84b")));
        zzax.zza();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPhotoResponse> fetchPhoto(final FetchPhotoRequest fetchPhotoRequest) {
        try {
            zzha.zzc(fetchPhotoRequest, ProtectedSandApp.s("\ue84c"));
            zzax.zza();
            final zzbb zza = zzbb.zza();
            return this.zza.zza(fetchPhotoRequest).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzcd
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzcj.this.zzc(fetchPhotoRequest, zza, task);
                }
            }).continueWithTask(zzch.zza);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPlaceResponse> fetchPlace(final FetchPlaceRequest fetchPlaceRequest) {
        try {
            zzha.zzc(fetchPlaceRequest, ProtectedSandApp.s("\ue84c"));
            zzax.zza();
            final zzbb zza = zzbb.zza();
            return this.zza.zzb(fetchPlaceRequest).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzce
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzcj.this.zzd(fetchPlaceRequest, zza, task);
                }
            }).continueWithTask(zzch.zza);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindAutocompletePredictionsResponse> findAutocompletePredictions(final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        try {
            zzha.zzc(findAutocompletePredictionsRequest, ProtectedSandApp.s("\ue84c"));
            zzax.zza();
            final zzbb zza = zzbb.zza();
            return this.zza.zzc(findAutocompletePredictionsRequest).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzcf
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzcj.this.zze(findAutocompletePredictionsRequest, zza, task);
                }
            }).continueWithTask(zzch.zza);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    @b1(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public final Task<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        return zza(findCurrentPlaceRequest, null);
    }

    @b1(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE"})
    public final Task zza(final FindCurrentPlaceRequest findCurrentPlaceRequest, @q0 String str) {
        try {
            zzha.zzc(findCurrentPlaceRequest, ProtectedSandApp.s("\ue84c"));
            final long zza = this.zze.zza();
            zzax.zza();
            final zzbb zza2 = zzbb.zza();
            final String str2 = null;
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).onSuccessTask(new SuccessContinuation(findCurrentPlaceRequest, str2) { // from class: com.google.android.libraries.places.internal.zzci
                public final /* synthetic */ FindCurrentPlaceRequest zzb;

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return zzcj.this.zzb(this.zzb, null, (Location) obj);
                }
            }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzcg
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzcj.this.zzf(findCurrentPlaceRequest, zza, zza2, task);
                }
            }).continueWithTask(zzch.zza);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    final /* synthetic */ Task zzb(FindCurrentPlaceRequest findCurrentPlaceRequest, String str, Location location) throws Exception {
        zzha.zzc(location, ProtectedSandApp.s("\ue84d"));
        return this.zza.zzd(findCurrentPlaceRequest, location, this.zzc.zza(null));
    }

    final /* synthetic */ FetchPhotoResponse zzc(FetchPhotoRequest fetchPhotoRequest, zzbb zzbbVar, Task task) throws Exception {
        this.zzd.zza(fetchPhotoRequest);
        zzg(zzba.zzb(ProtectedSandApp.s("\ue84e")), zzbbVar);
        return (FetchPhotoResponse) task.getResult();
    }

    final /* synthetic */ FetchPlaceResponse zzd(FetchPlaceRequest fetchPlaceRequest, zzbb zzbbVar, Task task) throws Exception {
        this.zzd.zzc(fetchPlaceRequest);
        zzg(zzba.zzb(ProtectedSandApp.s("\ue84f")), zzbbVar);
        return (FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ FindAutocompletePredictionsResponse zze(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzbb zzbbVar, Task task) throws Exception {
        this.zzd.zze(findAutocompletePredictionsRequest);
        zzg(zzba.zzb(ProtectedSandApp.s("\ue850")), zzbbVar);
        return (FindAutocompletePredictionsResponse) task.getResult();
    }

    final /* synthetic */ FindCurrentPlaceResponse zzf(FindCurrentPlaceRequest findCurrentPlaceRequest, long j4, zzbb zzbbVar, Task task) throws Exception {
        this.zzd.zzg(findCurrentPlaceRequest, task, j4, this.zze.zza());
        zzg(zzba.zzb(ProtectedSandApp.s("\ue851")), zzbbVar);
        return (FindCurrentPlaceResponse) task.getResult();
    }
}
