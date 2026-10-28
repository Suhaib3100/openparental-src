package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public class LocationServices {

    @o0
    public static final Api<Api.ApiOptions.NoOptions> API;

    @o0
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi;

    @o0
    @Deprecated
    public static final GeofencingApi GeofencingApi;

    @o0
    @Deprecated
    public static final SettingsApi SettingsApi;
    private static final Api.ClientKey<com.google.android.gms.internal.location.zzaz> zza;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, Api.ApiOptions.NoOptions> zzb;

    static {
        Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzbh zzbhVar = new zzbh();
        zzb = zzbhVar;
        API = new Api<>(ProtectedSandApp.s("\ud9ee"), zzbhVar, clientKey);
        FusedLocationApi = new com.google.android.gms.internal.location.zzz();
        GeofencingApi = new com.google.android.gms.internal.location.zzaf();
        SettingsApi = new com.google.android.gms.internal.location.zzbi();
    }

    private LocationServices() {
    }

    @o0
    public static FusedLocationProviderClient getFusedLocationProviderClient(@o0 Activity activity) {
        return new FusedLocationProviderClient(activity);
    }

    @o0
    public static GeofencingClient getGeofencingClient(@o0 Activity activity) {
        return new GeofencingClient(activity);
    }

    @o0
    public static SettingsClient getSettingsClient(@o0 Activity activity) {
        return new SettingsClient(activity);
    }

    public static com.google.android.gms.internal.location.zzaz zza(GoogleApiClient googleApiClient) {
        Preconditions.checkArgument(googleApiClient != null, ProtectedSandApp.s("\ud9ef"));
        com.google.android.gms.internal.location.zzaz zzazVar = (com.google.android.gms.internal.location.zzaz) googleApiClient.getClient(zza);
        Preconditions.checkState(zzazVar != null, ProtectedSandApp.s("\ud9f0"));
        return zzazVar;
    }

    @o0
    public static FusedLocationProviderClient getFusedLocationProviderClient(@o0 Context context) {
        return new FusedLocationProviderClient(context);
    }

    @o0
    public static GeofencingClient getGeofencingClient(@o0 Context context) {
        return new GeofencingClient(context);
    }

    @o0
    public static SettingsClient getSettingsClient(@o0 Context context) {
        return new SettingsClient(context);
    }
}
