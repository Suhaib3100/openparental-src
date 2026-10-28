package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzjt;
import java.util.List;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgd {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zza extends zzjt<zza, C0797zza> implements zzle {
        private static final zza zzc;
        private static volatile zzll<zza> zzd;
        private zzkc<zzb> zze = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        /* renamed from: com.google.android.gms.internal.measurement.zzgd$zza$zza, reason: collision with other inner class name */
        public static final class C0797zza extends zzjt.zzb<zza, C0797zza> implements zzle {
            private C0797zza() {
                super(zza.zzc);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zze.size();
        }

        public final List<zzb> zzd() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzgf.zza[i4 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0797zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("푗"), zzb.class};
                    return zzjt.zza(zzc, ProtectedSandApp.s("푘"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zza> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzllVar = zzd;
                                if (zzllVar == null) {
                                    zzllVar = new zzjt.zza<>(zzc);
                                    zzd = zzllVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzllVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzb extends zzjt<zzb, zza> implements zzle {
        private static final zzb zzc;
        private static volatile zzll<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzkc<zzd> zzg = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzb, zza> implements zzle {
            private zza() {
                super(zzb.zzc);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjt.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzgf.zza[i4 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("푙"), ProtectedSandApp.s("푚"), ProtectedSandApp.s("푛"), zzd.class};
                    return zzjt.zza(zzc, ProtectedSandApp.s("표"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzb> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzllVar = zzd;
                                if (zzllVar == null) {
                                    zzllVar = new zzjt.zza<>(zzc);
                                    zzd = zzllVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzllVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzc extends zzjt<zzc, zza> implements zzle {
        private static final zzc zzc;
        private static volatile zzll<zzc> zzd;
        private int zze;
        private zzkc<zzd> zzf = zzjt.zzch();
        private zza zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzc, zza> implements zzle {
            private zza() {
                super(zzc.zzc);
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjt.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public final zza zza() {
            zza zzaVar = this.zzg;
            return zzaVar == null ? zza.zzc() : zzaVar;
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzgf.zza[i4 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("푝"), ProtectedSandApp.s("푞"), zzd.class, ProtectedSandApp.s("푟")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("푠"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzc> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzllVar = zzd;
                                if (zzllVar == null) {
                                    zzllVar = new zzjt.zza<>(zzc);
                                    zzd = zzllVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzllVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzd extends zzjt<zzd, zzb> implements zzle {
        private static final zzd zzc;
        private static volatile zzll<zzd> zzd;
        private int zze;
        private int zzf;
        private zzkc<zzd> zzg = zzjt.zzch();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zza implements zzjy {
            zza(0),
            zzb(1),
            zzc(2),
            zzd(3),
            zze(4);

            private final int zzg;

            zza(int i4) {
                this.zzg = i4;
            }

            public static zzjx zzb() {
                return zzgh.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return ProtectedSandApp.s("푦") + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("푧") + this.zzg + ProtectedSandApp.s("푨") + name() + m0.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzg;
            }

            public static zza zza(int i4) {
                if (i4 == 0) {
                    return zza;
                }
                if (i4 == 1) {
                    return zzb;
                }
                if (i4 == 2) {
                    return zzc;
                }
                if (i4 == 3) {
                    return zzd;
                }
                if (i4 != 4) {
                    return null;
                }
                return zze;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zzb extends zzjt.zzb<zzd, zzb> implements zzle {
            private zzb() {
                super(zzd.zzc);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjt.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public final double zza() {
            return this.zzk;
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            return zza2 == null ? zza.zza : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzgf.zza[i4 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("푩"), ProtectedSandApp.s("푪"), zza.zzb(), ProtectedSandApp.s("푫"), zzd.class, ProtectedSandApp.s("푬"), ProtectedSandApp.s("푭"), ProtectedSandApp.s("푮"), ProtectedSandApp.s("푯")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("푰"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzd> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzllVar = zzd;
                                if (zzllVar == null) {
                                    zzllVar = new zzjt.zza<>(zzc);
                                    zzd = zzllVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzllVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
