package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b1;
import androidx.annotation.e1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class AppMeasurementSdk {
    private final zzdy zza;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
    @KeepForSdk
    public static final class ConditionalUserProperty {

        @o0
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = ProtectedSandApp.s("\udb55");

        @o0
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = ProtectedSandApp.s("\udb56");

        @o0
        @KeepForSdk
        public static final String ACTIVE = ProtectedSandApp.s("\udb57");

        @o0
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = ProtectedSandApp.s("\udb58");

        @o0
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = ProtectedSandApp.s("\udb59");

        @o0
        @KeepForSdk
        public static final String VALUE = ProtectedSandApp.s("\udb5a");

        @o0
        @KeepForSdk
        public static final String TIME_TO_LIVE = ProtectedSandApp.s("\udb5b");

        @o0
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = ProtectedSandApp.s("\udb5c");

        @o0
        @KeepForSdk
        public static final String NAME = ProtectedSandApp.s("\udb5d");

        @o0
        @KeepForSdk
        public static final String ORIGIN = ProtectedSandApp.s("\udb5e");

        @o0
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = ProtectedSandApp.s("\udb5f");

        @o0
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = ProtectedSandApp.s("\udb60");

        @o0
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = ProtectedSandApp.s("\udb61");

        @o0
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = ProtectedSandApp.s("\udb62");

        @o0
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = ProtectedSandApp.s("\udb63");

        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzjm {
        @Override // com.google.android.gms.measurement.internal.zzjm
        @n1
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j4);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzjl {
        @Override // com.google.android.gms.measurement.internal.zzjl
        @n1
        @ShowFirstParty
        @KeepForSdk
        void onEvent(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j4);
    }

    public AppMeasurementSdk(zzdy zzdyVar) {
        this.zza = zzdyVar;
    }

    @ShowFirstParty
    @o0
    @KeepForSdk
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk getInstance(@o0 Context context) {
        return zzdy.zza(context).zzb();
    }

    @KeepForSdk
    public void beginAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zza.zzb(str);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @q0 String str2, @q0 Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @KeepForSdk
    public void endAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zza.zzc(str);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.zza.zza();
    }

    @q0
    @KeepForSdk
    public String getAppIdOrigin() {
        return this.zza.zzd();
    }

    @q0
    @KeepForSdk
    public String getAppInstanceId() {
        return this.zza.zzf();
    }

    @n1
    @o0
    @KeepForSdk
    public List<Bundle> getConditionalUserProperties(@q0 String str, @e1(max = 23, min = 1) @q0 String str2) {
        return this.zza.zza(str, str2);
    }

    @q0
    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.zza.zzg();
    }

    @q0
    @KeepForSdk
    public String getCurrentScreenName() {
        return this.zza.zzh();
    }

    @q0
    @KeepForSdk
    public String getGmpAppId() {
        return this.zza.zzi();
    }

    @n1
    @KeepForSdk
    public int getMaxUserProperties(@e1(min = 1) @o0 String str) {
        return this.zza.zza(str);
    }

    @n1
    @o0
    @KeepForSdk
    public Map<String, Object> getUserProperties(@q0 String str, @e1(max = 24, min = 1) @q0 String str2, boolean z4) {
        return this.zza.zza(str, str2, z4);
    }

    @KeepForSdk
    public void logEvent(@o0 String str, @o0 String str2, @q0 Bundle bundle) {
        this.zza.zzb(str, str2, bundle);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@o0 String str, @o0 String str2, @q0 Bundle bundle, long j4) {
        this.zza.zza(str, str2, bundle, j4);
    }

    @KeepForSdk
    public void performAction(@o0 Bundle bundle) {
        this.zza.zza(bundle, false);
    }

    @q0
    @KeepForSdk
    public Bundle performActionWithResponse(@o0 Bundle bundle) {
        return this.zza.zza(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zza.zza(onEventListener);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@o0 Bundle bundle) {
        this.zza.zza(bundle);
    }

    @KeepForSdk
    public void setConsent(@o0 Bundle bundle) {
        this.zza.zzb(bundle);
    }

    @KeepForSdk
    public void setCurrentScreen(@o0 Activity activity, @e1(max = 36, min = 1) @q0 String str, @e1(max = 36, min = 1) @q0 String str2) {
        this.zza.zza(activity, str, str2);
    }

    @n1
    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(@o0 EventInterceptor eventInterceptor) {
        this.zza.zza(eventInterceptor);
    }

    @KeepForSdk
    public void setMeasurementEnabled(@q0 Boolean bool) {
        this.zza.zza(bool);
    }

    @KeepForSdk
    public void setUserProperty(@o0 String str, @o0 String str2, @o0 Object obj) {
        this.zza.zza(str, str2, obj, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zza.zzb(onEventListener);
    }

    public final void zza(boolean z4) {
        this.zza.zza(z4);
    }

    @o0
    @KeepForSdk
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk getInstance(@o0 Context context, @o0 String str, @o0 String str2, @q0 String str3, @o0 Bundle bundle) {
        return zzdy.zza(context, str, str2, str3, bundle).zzb();
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z4) {
        this.zza.zza(Boolean.valueOf(z4));
    }
}
