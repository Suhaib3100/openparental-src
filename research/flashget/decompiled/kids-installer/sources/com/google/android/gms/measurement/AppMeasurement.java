package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.b1;
import androidx.annotation.e1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zziq;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final String CRASH_ORIGIN = ProtectedSandApp.s("ພ");

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final String FCM_ORIGIN = ProtectedSandApp.s("ຟ");

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final String FIAM_ORIGIN = ProtectedSandApp.s("ຠ");
    private static volatile AppMeasurement zza;
    private final zzd zzb;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;

        @Keep
        @ShowFirstParty
        @o0
        @KeepForSdk
        public String mAppId;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;

        @Keep
        @o0
        public String mExpiredEventName;

        @Keep
        @o0
        public Bundle mExpiredEventParams;

        @Keep
        @ShowFirstParty
        @o0
        @KeepForSdk
        public String mName;

        @Keep
        @ShowFirstParty
        @o0
        @KeepForSdk
        public String mOrigin;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;

        @Keep
        @o0
        public String mTimedOutEventName;

        @Keep
        @o0
        public Bundle mTimedOutEventParams;

        @Keep
        @ShowFirstParty
        @o0
        @KeepForSdk
        public String mTriggerEventName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;

        @Keep
        @o0
        public String mTriggeredEventName;

        @Keep
        @o0
        public Bundle mTriggeredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;

        @Keep
        @ShowFirstParty
        @o0
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @m1
        ConditionalUserProperty(@o0 Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) zzgz.zza(bundle, ProtectedSandApp.s("\u0e7e"), String.class, null);
            this.mOrigin = (String) zzgz.zza(bundle, ProtectedSandApp.s("\u0e7f"), String.class, null);
            this.mName = (String) zzgz.zza(bundle, ProtectedSandApp.s("\u0e80"), String.class, null);
            this.mValue = zzgz.zza(bundle, ProtectedSandApp.s("ກ"), Object.class, null);
            this.mTriggerEventName = (String) zzgz.zza(bundle, ProtectedSandApp.s("ຂ"), String.class, null);
            this.mTriggerTimeout = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("\u0e83"), Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzgz.zza(bundle, ProtectedSandApp.s("ຄ"), String.class, null);
            this.mTimedOutEventParams = (Bundle) zzgz.zza(bundle, ProtectedSandApp.s("\u0e85"), Bundle.class, null);
            this.mTriggeredEventName = (String) zzgz.zza(bundle, ProtectedSandApp.s("ຆ"), String.class, null);
            this.mTriggeredEventParams = (Bundle) zzgz.zza(bundle, ProtectedSandApp.s("ງ"), Bundle.class, null);
            this.mTimeToLive = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("ຈ"), Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzgz.zza(bundle, ProtectedSandApp.s("ຉ"), String.class, null);
            this.mExpiredEventParams = (Bundle) zzgz.zza(bundle, ProtectedSandApp.s("ຊ"), Bundle.class, null);
            this.mActive = ((Boolean) zzgz.zza(bundle, ProtectedSandApp.s("\u0e8b"), Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("ຌ"), Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("ຍ"), Long.class, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty(@o0 ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object zza = zziq.zza(obj);
                this.mValue = zza;
                if (zza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
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

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
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

    public AppMeasurement(zzgd zzgdVar) {
        this.zzb = new zza(zzgdVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    @ShowFirstParty
    @o0
    @KeepForSdk
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(@o0 Context context) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                if (zza == null) {
                    zzil zzilVar = (zzil) FirebaseAnalytics.class.getDeclaredMethod(ProtectedSandApp.s("ຎ"), Context.class, Bundle.class).invoke(null, context, null);
                    if (zzilVar != null) {
                        zza = new AppMeasurement(zzilVar);
                    } else {
                        zza = new AppMeasurement(zzgd.zzp(context, new zzcl(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return zza;
    }

    @Keep
    public void beginAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zzb.zzp(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @o0 String str2, @o0 Bundle bundle) {
        this.zzb.zzq(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zzb.zzr(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzb.zzb();
    }

    @Keep
    @o0
    public String getAppInstanceId() {
        return this.zzb.zzh();
    }

    @o0
    @KeepForSdk
    public Boolean getBoolean() {
        return this.zzb.zzc();
    }

    @n1
    @Keep
    @ShowFirstParty
    @o0
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@o0 String str, @e1(max = 23, min = 1) @o0 String str2) {
        List zzm = this.zzb.zzm(str, str2);
        ArrayList arrayList = new ArrayList(zzm == null ? 0 : zzm.size());
        Iterator it = zzm.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    @o0
    public String getCurrentScreenClass() {
        return this.zzb.zzi();
    }

    @Keep
    @o0
    public String getCurrentScreenName() {
        return this.zzb.zzj();
    }

    @o0
    @KeepForSdk
    public Double getDouble() {
        return this.zzb.zzd();
    }

    @Keep
    @o0
    public String getGmpAppId() {
        return this.zzb.zzk();
    }

    @o0
    @KeepForSdk
    public Integer getInteger() {
        return this.zzb.zze();
    }

    @o0
    @KeepForSdk
    public Long getLong() {
        return this.zzb.zzf();
    }

    @n1
    @Keep
    @ShowFirstParty
    @KeepForSdk
    public int getMaxUserProperties(@e1(min = 1) @o0 String str) {
        return this.zzb.zza(str);
    }

    @o0
    @KeepForSdk
    public String getString() {
        return this.zzb.zzl();
    }

    @n1
    @Keep
    @m1
    @o0
    protected Map<String, Object> getUserProperties(@o0 String str, @e1(max = 24, min = 1) @o0 String str2, boolean z5) {
        return this.zzb.zzo(str, str2, z5);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@o0 String str, @o0 String str2, @o0 Bundle bundle) {
        this.zzb.zzs(str, str2, bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    public void logEventInternalNoInterceptor(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j5) {
        this.zzb.zzt(str, str2, bundle, j5);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zzb.zzu(onEventListener);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@o0 ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        zzd zzdVar = this.zzb;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(ProtectedSandApp.s("ຏ"), str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(ProtectedSandApp.s("ຐ"), str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(ProtectedSandApp.s("ຑ"), str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzgz.zzb(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(ProtectedSandApp.s("ຒ"), str4);
        }
        bundle.putLong(ProtectedSandApp.s("ຓ"), conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(ProtectedSandApp.s("ດ"), str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(ProtectedSandApp.s("ຕ"), bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(ProtectedSandApp.s("ຖ"), str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(ProtectedSandApp.s("ທ"), bundle3);
        }
        bundle.putLong(ProtectedSandApp.s("ຘ"), conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(ProtectedSandApp.s("ນ"), str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(ProtectedSandApp.s("ບ"), bundle4);
        }
        bundle.putLong(ProtectedSandApp.s("ປ"), conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(ProtectedSandApp.s("ຜ"), conditionalUserProperty.mActive);
        bundle.putLong(ProtectedSandApp.s("ຝ"), conditionalUserProperty.mTriggeredTimestamp);
        zzdVar.zzv(bundle);
    }

    @n1
    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(@o0 EventInterceptor eventInterceptor) {
        this.zzb.zzw(eventInterceptor);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zzb.zzx(onEventListener);
    }

    public AppMeasurement(zzil zzilVar) {
        this.zzb = new zzb(zzilVar);
    }

    @n1
    @ShowFirstParty
    @o0
    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z5) {
        return this.zzb.zzn(z5);
    }
}
