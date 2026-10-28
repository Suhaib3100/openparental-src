package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b1;
import androidx.annotation.e1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class AppMeasurementSdk {
    private final zzef zza;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
    @KeepForSdk
    public static final class ConditionalUserProperty {

        @o0
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = ProtectedSandApp.s("ຣ");

        @o0
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = ProtectedSandApp.s("\u0ea4");

        @o0
        @KeepForSdk
        public static final String ACTIVE = ProtectedSandApp.s("ລ");

        @o0
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = ProtectedSandApp.s("\u0ea6");

        @o0
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = ProtectedSandApp.s("ວ");

        @o0
        @KeepForSdk
        public static final String VALUE = ProtectedSandApp.s("ຨ");

        @o0
        @KeepForSdk
        public static final String TIME_TO_LIVE = ProtectedSandApp.s("ຩ");

        @o0
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = ProtectedSandApp.s("ສ");

        @o0
        @KeepForSdk
        public static final String NAME = ProtectedSandApp.s("ຫ");

        @o0
        @KeepForSdk
        public static final String ORIGIN = ProtectedSandApp.s("ຬ");

        @o0
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = ProtectedSandApp.s("ອ");

        @o0
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = ProtectedSandApp.s("ຮ");

        @o0
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = ProtectedSandApp.s("ຯ");

        @o0
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = ProtectedSandApp.s("ະ");

        @o0
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = ProtectedSandApp.s("ັ");

        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface EventInterceptor extends zzhf {
        @Override // com.google.android.gms.measurement.internal.zzhf
        @n1
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j5);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface OnEventListener extends zzhg {
        @Override // com.google.android.gms.measurement.internal.zzhg
        @n1
        @ShowFirstParty
        @KeepForSdk
        void onEvent(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j5);
    }

    public AppMeasurementSdk(zzef zzefVar) {
        this.zza = zzefVar;
    }

    @ShowFirstParty
    @o0
    @KeepForSdk
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk getInstance(@o0 Context context) {
        return zzef.zzg(context, null, null, null, null).zzd();
    }

    @KeepForSdk
    public void beginAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zza.zzv(str);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @q0 String str2, @q0 Bundle bundle) {
        this.zza.zzw(str, str2, bundle);
    }

    @KeepForSdk
    public void endAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zza.zzx(str);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.zza.zzb();
    }

    @q0
    @KeepForSdk
    public String getAppIdOrigin() {
        return this.zza.zzk();
    }

    @q0
    @KeepForSdk
    public String getAppInstanceId() {
        return this.zza.zzm();
    }

    @n1
    @o0
    @KeepForSdk
    public List<Bundle> getConditionalUserProperties(@q0 String str, @e1(max = 23, min = 1) @q0 String str2) {
        return this.zza.zzq(str, str2);
    }

    @q0
    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.zza.zzn();
    }

    @q0
    @KeepForSdk
    public String getCurrentScreenName() {
        return this.zza.zzo();
    }

    @q0
    @KeepForSdk
    public String getGmpAppId() {
        return this.zza.zzp();
    }

    @n1
    @KeepForSdk
    public int getMaxUserProperties(@e1(min = 1) @o0 String str) {
        return this.zza.zza(str);
    }

    @n1
    @o0
    @KeepForSdk
    public Map<String, Object> getUserProperties(@q0 String str, @e1(max = 24, min = 1) @q0 String str2, boolean z5) {
        return this.zza.zzr(str, str2, z5);
    }

    @KeepForSdk
    public void logEvent(@o0 String str, @o0 String str2, @q0 Bundle bundle) {
        this.zza.zzz(str, str2, bundle);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@o0 String str, @o0 String str2, @q0 Bundle bundle, long j5) {
        this.zza.zzA(str, str2, bundle, j5);
    }

    @q0
    @KeepForSdk
    public void performAction(@o0 Bundle bundle) {
        this.zza.zzc(bundle, false);
    }

    @q0
    @KeepForSdk
    public Bundle performActionWithResponse(@o0 Bundle bundle) {
        return this.zza.zzc(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zza.zzC(onEventListener);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@o0 Bundle bundle) {
        this.zza.zzE(bundle);
    }

    @KeepForSdk
    public void setConsent(@o0 Bundle bundle) {
        this.zza.zzF(bundle);
    }

    @KeepForSdk
    public void setCurrentScreen(@o0 Activity activity, @e1(max = 36, min = 1) @q0 String str, @e1(max = 36, min = 1) @q0 String str2) {
        this.zza.zzH(activity, str, str2);
    }

    @n1
    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(@o0 EventInterceptor eventInterceptor) {
        this.zza.zzK(eventInterceptor);
    }

    @KeepForSdk
    public void setMeasurementEnabled(@q0 Boolean bool) {
        this.zza.zzL(bool);
    }

    @KeepForSdk
    public void setUserProperty(@o0 String str, @o0 String str2, @o0 Object obj) {
        this.zza.zzO(str, str2, obj, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zza.zzP(onEventListener);
    }

    public final void zza(boolean z5) {
        this.zza.zzI(z5);
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z5) {
        this.zza.zzL(Boolean.valueOf(z5));
    }

    @o0
    @KeepForSdk
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk getInstance(@o0 Context context, @o0 String str, @o0 String str2, @q0 String str3, @o0 Bundle bundle) {
        return zzef.zzg(context, str, str2, str3, bundle).zzd();
    }
}
