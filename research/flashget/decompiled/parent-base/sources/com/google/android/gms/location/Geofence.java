package com.google.android.gms.location;

import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@VisibleForTesting
/* loaded from: classes5.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @VisibleForTesting
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @o0
        public Geofence build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ud9c1"));
            }
            int i4 = this.zzb;
            if (i4 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ud9c0"));
            }
            if ((i4 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ud9bc"));
            }
            long j4 = this.zzc;
            if (j4 == Long.MIN_VALUE) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ud9bf"));
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ud9be"));
            }
            int i5 = this.zzh;
            if (i5 >= 0) {
                return new com.google.android.gms.internal.location.zzbe(str, i4, (short) 1, this.zze, this.zzf, this.zzg, j4, i5, this.zzi);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\ud9bd"));
        }

        @o0
        public Builder setCircularRegion(@x(from = -90.0d, to = 90.0d) double d5, @x(from = -180.0d, to = 180.0d) double d6, @x(from = 0.0d, fromInclusive = false) float f4) {
            boolean z4 = d5 >= -90.0d && d5 <= 90.0d;
            StringBuilder sb = new StringBuilder(42);
            sb.append(ProtectedSandApp.s("\ud9c2"));
            sb.append(d5);
            Preconditions.checkArgument(z4, sb.toString());
            boolean z5 = d6 >= -180.0d && d6 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append(ProtectedSandApp.s("\ud9c3"));
            sb2.append(d6);
            Preconditions.checkArgument(z5, sb2.toString());
            boolean z6 = f4 > 0.0f;
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append(ProtectedSandApp.s("\ud9c4"));
            sb3.append(f4);
            Preconditions.checkArgument(z6, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d5;
            this.zzf = d6;
            this.zzg = f4;
            return this;
        }

        @o0
        public Builder setExpirationDuration(long j4) {
            if (j4 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j4;
            }
            return this;
        }

        @o0
        public Builder setLoiteringDelay(int i4) {
            this.zzi = i4;
            return this;
        }

        @o0
        public Builder setNotificationResponsiveness(@g0(from = 0) int i4) {
            this.zzh = i4;
            return this;
        }

        @o0
        public Builder setRequestId(@o0 String str) {
            this.zza = (String) Preconditions.checkNotNull(str, ProtectedSandApp.s("\ud9c5"));
            return this;
        }

        @o0
        public Builder setTransitionTypes(@TransitionTypes int i4) {
            this.zzb = i4;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface GeofenceTransition {
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface TransitionTypes {
    }

    @o0
    String getRequestId();
}
