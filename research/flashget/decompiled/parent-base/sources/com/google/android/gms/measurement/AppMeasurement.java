package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.b1;
import androidx.annotation.e1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public class AppMeasurement {

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final String CRASH_ORIGIN = ProtectedSandApp.s("\udb50");

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final String FCM_ORIGIN = ProtectedSandApp.s("\udb51");

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final String FIAM_ORIGIN = ProtectedSandApp.s("\udb52");
    private static volatile AppMeasurement zza;
    private final zza zzb;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
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
            this.mAppId = (String) zzjf.zza(bundle, ProtectedSandApp.s("\udb30"), String.class, null);
            this.mOrigin = (String) zzjf.zza(bundle, ProtectedSandApp.s("\udb31"), String.class, null);
            this.mName = (String) zzjf.zza(bundle, ProtectedSandApp.s("\udb32"), String.class, null);
            this.mValue = zzjf.zza(bundle, ProtectedSandApp.s("\udb33"), Object.class, null);
            this.mTriggerEventName = (String) zzjf.zza(bundle, ProtectedSandApp.s("\udb34"), String.class, null);
            this.mTriggerTimeout = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("\udb35"), Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzjf.zza(bundle, ProtectedSandApp.s("\udb36"), String.class, null);
            this.mTimedOutEventParams = (Bundle) zzjf.zza(bundle, ProtectedSandApp.s("\udb37"), Bundle.class, null);
            this.mTriggeredEventName = (String) zzjf.zza(bundle, ProtectedSandApp.s("\udb38"), String.class, null);
            this.mTriggeredEventParams = (Bundle) zzjf.zza(bundle, ProtectedSandApp.s("\udb39"), Bundle.class, null);
            this.mTimeToLive = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("\udb3a"), Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzjf.zza(bundle, ProtectedSandApp.s("\udb3b"), String.class, null);
            this.mExpiredEventParams = (Bundle) zzjf.zza(bundle, ProtectedSandApp.s("\udb3c"), Bundle.class, null);
            this.mActive = ((Boolean) zzjf.zza(bundle, ProtectedSandApp.s("\udb3d"), Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("\udb3e"), Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("\udb3f"), Long.class, 0L)).longValue();
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
                Object zza = zzlh.zza(obj);
                this.mValue = zza;
                if (zza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzjm {
        @Override // com.google.android.gms.measurement.internal.zzjm
        @n1
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j4);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzjl {
        @Override // com.google.android.gms.measurement.internal.zzjl
        @n1
        @ShowFirstParty
        @KeepForSdk
        void onEvent(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
    static abstract class zza implements zzlb {
        abstract Boolean zza();

        abstract Map<String, Object> zza(boolean z4);

        abstract Double zzb();

        abstract Integer zzc();

        abstract Long zzd();

        abstract String zze();

        private zza() {
        }
    }

    private AppMeasurement(zzhy zzhyVar) {
        this.zzb = new zzb(zzhyVar);
    }

    @Keep
    @Deprecated
    @ShowFirstParty
    @o0
    @KeepForSdk
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(@o0 Context context) {
        return zza(context, null, null);
    }

    @m1
    private static AppMeasurement zza(Context context, String str, String str2) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (zza == null) {
                        zzlb zza2 = zza(context, null);
                        if (zza2 != null) {
                            zza = new AppMeasurement(zza2);
                        } else {
                            zza = new AppMeasurement(zzhy.zza(context, new zzdw(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    @Keep
    public void beginAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zzb.zzb(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @o0 String str2, @o0 Bundle bundle) {
        this.zzb.zza(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@e1(min = 1) @o0 String str) {
        this.zzb.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzb.zzf();
    }

    @Keep
    @o0
    public String getAppInstanceId() {
        return this.zzb.zzg();
    }

    @o0
    @KeepForSdk
    public Boolean getBoolean() {
        return this.zzb.zza();
    }

    @n1
    @Keep
    @ShowFirstParty
    @o0
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@o0 String str, @e1(max = 23, min = 1) @o0 String str2) {
        List<Bundle> zza2 = this.zzb.zza(str, str2);
        ArrayList arrayList = new ArrayList(zza2 == null ? 0 : zza2.size());
        Iterator<Bundle> it = zza2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    @o0
    public String getCurrentScreenClass() {
        return this.zzb.zzh();
    }

    @Keep
    @o0
    public String getCurrentScreenName() {
        return this.zzb.zzi();
    }

    @o0
    @KeepForSdk
    public Double getDouble() {
        return this.zzb.zzb();
    }

    @Keep
    @o0
    public String getGmpAppId() {
        return this.zzb.zzj();
    }

    @o0
    @KeepForSdk
    public Integer getInteger() {
        return this.zzb.zzc();
    }

    @o0
    @KeepForSdk
    public Long getLong() {
        return this.zzb.zzd();
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
        return this.zzb.zze();
    }

    @n1
    @ShowFirstParty
    @o0
    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z4) {
        return this.zzb.zza(z4);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@o0 String str, @o0 String str2, @o0 Bundle bundle) {
        this.zzb.zzb(str, str2, bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    public void logEventInternalNoInterceptor(@o0 String str, @o0 String str2, @o0 Bundle bundle, long j4) {
        this.zzb.zza(str, str2, bundle, j4);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zzb.zza(onEventListener);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@o0 ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        zza zzaVar = this.zzb;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(ProtectedSandApp.s("\udb41"), str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(ProtectedSandApp.s("\udb42"), str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(ProtectedSandApp.s("\udb43"), str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzjf.zza(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(ProtectedSandApp.s("\udb44"), str4);
        }
        bundle.putLong(ProtectedSandApp.s("\udb45"), conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(ProtectedSandApp.s("\udb46"), str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(ProtectedSandApp.s("\udb47"), bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(ProtectedSandApp.s("\udb48"), str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(ProtectedSandApp.s("\udb49"), bundle3);
        }
        bundle.putLong(ProtectedSandApp.s("\udb4a"), conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(ProtectedSandApp.s("\udb4b"), str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(ProtectedSandApp.s("\udb4c"), bundle4);
        }
        bundle.putLong(ProtectedSandApp.s("\udb4d"), conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(ProtectedSandApp.s("\udb4e"), conditionalUserProperty.mActive);
        bundle.putLong(ProtectedSandApp.s("\udb4f"), conditionalUserProperty.mTriggeredTimestamp);
        zzaVar.zza(bundle);
    }

    @n1
    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(@o0 EventInterceptor eventInterceptor) {
        this.zzb.zza(eventInterceptor);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@o0 OnEventListener onEventListener) {
        this.zzb.zzb(onEventListener);
    }

    @n1
    @Keep
    @m1
    @o0
    protected Map<String, Object> getUserProperties(@o0 String str, @e1(max = 24, min = 1) @o0 String str2, boolean z4) {
        return this.zzb.zza(str, str2, z4);
    }

    private AppMeasurement(zzlb zzlbVar) {
        this.zzb = new com.google.android.gms.measurement.zza(zzlbVar);
    }

    private static zzlb zza(Context context, Bundle bundle) {
        return (zzlb) FirebaseAnalytics.class.getDeclaredMethod(ProtectedSandApp.s("\udb40"), Context.class, Bundle.class).invoke(null, context, null);
    }
}
