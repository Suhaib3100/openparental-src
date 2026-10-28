package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzjt;
import java.util.List;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzfo {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zza extends zzjt<zza, C0791zza> implements zzle {
        private static final zza zzc;
        private static volatile zzll<zza> zzd;
        private int zze;
        private int zzf;
        private zzkc<zze> zzg = zzjt.zzch();
        private zzkc<zzb> zzh = zzjt.zzch();
        private boolean zzi;
        private boolean zzj;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        /* renamed from: com.google.android.gms.internal.measurement.zzfo$zza$zza, reason: collision with other inner class name */
        public static final class C0791zza extends zzjt.zzb<zza, C0791zza> implements zzle {
            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            private C0791zza() {
                super(zza.zzc);
            }

            public final C0791zza zza(int i4, zzb.zza zzaVar) {
                zzak();
                zza.zza((zza) this.zza, i4, (zzb) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zze zzb(int i4) {
                return ((zza) this.zza).zzb(i4);
            }

            public final C0791zza zza(int i4, zze.zza zzaVar) {
                zzak();
                zza.zza((zza) this.zza, i4, (zze) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zzb zza(int i4) {
                return ((zza) this.zza).zza(i4);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final zzb zza(int i4) {
            return this.zzh.get(i4);
        }

        public final zze zzb(int i4) {
            return this.zzg.get(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfn.zza[i4 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0791zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("팑"), ProtectedSandApp.s("팒"), ProtectedSandApp.s("팓"), zze.class, ProtectedSandApp.s("팔"), zzb.class, ProtectedSandApp.s("팕"), ProtectedSandApp.s("팖")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("팗"), objArr);
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

        static /* synthetic */ void zza(zza zzaVar, int i4, zzb zzbVar) {
            zzbVar.getClass();
            zzkc<zzb> zzkcVar = zzaVar.zzh;
            if (!zzkcVar.zzc()) {
                zzaVar.zzh = zzjt.zza(zzkcVar);
            }
            zzaVar.zzh.set(i4, zzbVar);
        }

        static /* synthetic */ void zza(zza zzaVar, int i4, zze zzeVar) {
            zzeVar.getClass();
            zzkc<zze> zzkcVar = zzaVar.zzg;
            if (!zzkcVar.zzc()) {
                zzaVar.zzg = zzjt.zza(zzkcVar);
            }
            zzaVar.zzg.set(i4, zzeVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzb extends zzjt<zzb, zza> implements zzle {
        private static final zzb zzc;
        private static volatile zzll<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzkc<zzc> zzh = zzjt.zzch();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzb, zza> implements zzle {
            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }

            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(String str) {
                zzak();
                zzb.zza((zzb) this.zza, str);
                return this;
            }

            public final zza zza(int i4, zzc zzcVar) {
                zzak();
                zzb.zza((zzb) this.zza, i4, zzcVar);
                return this;
            }

            public final zzc zza(int i4) {
                return ((zzb) this.zza).zza(i4);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjt.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzc() {
            return zzc.zzcc();
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzdVar = this.zzj;
            return zzdVar == null ? zzd.zzc() : zzdVar;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 64) != 0;
        }

        public final zzc zza(int i4) {
            return this.zzh.get(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfn.zza[i4 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("팘"), ProtectedSandApp.s("팙"), ProtectedSandApp.s("팚"), ProtectedSandApp.s("팛"), zzc.class, ProtectedSandApp.s("팜"), ProtectedSandApp.s("팝"), ProtectedSandApp.s("팞"), ProtectedSandApp.s("팟"), ProtectedSandApp.s("팠")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("팡"), objArr);
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

        static /* synthetic */ void zza(zzb zzbVar, String str) {
            str.getClass();
            zzbVar.zze |= 2;
            zzbVar.zzg = str;
        }

        static /* synthetic */ void zza(zzb zzbVar, int i4, zzc zzcVar) {
            zzcVar.getClass();
            zzkc<zzc> zzkcVar = zzbVar.zzh;
            if (!zzkcVar.zzc()) {
                zzbVar.zzh = zzjt.zza(zzkcVar);
            }
            zzbVar.zzh.set(i4, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzc extends zzjt<zzc, zza> implements zzle {
        private static final zzc zzc;
        private static volatile zzll<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzc, zza> implements zzle {
            public final zza zza(String str) {
                zzak();
                zzc.zza((zzc) this.zza, str);
                return this;
            }

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

        public static zzc zzb() {
            return zzc;
        }

        public final zzd zzc() {
            zzd zzdVar = this.zzg;
            return zzdVar == null ? zzd.zzc() : zzdVar;
        }

        public final zzf zzd() {
            zzf zzfVar = this.zzf;
            return zzfVar == null ? zzf.zzd() : zzfVar;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfn.zza[i4 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("팢"), ProtectedSandApp.s("팣"), ProtectedSandApp.s("팤"), ProtectedSandApp.s("팥"), ProtectedSandApp.s("팦")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("팧"), objArr);
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

        static /* synthetic */ void zza(zzc zzcVar, String str) {
            str.getClass();
            zzcVar.zze |= 8;
            zzcVar.zzi = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zze extends zzjt<zze, zza> implements zzle {
        private static final zze zzc;
        private static volatile zzll<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zze, zza> implements zzle {
            public final zza zza(String str) {
                zzak();
                zze.zza((zze) this.zza, str);
                return this;
            }

            private zza() {
                super(zze.zzc);
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjt.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        public static zza zzc() {
            return zzc.zzcc();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzcVar = this.zzh;
            return zzcVar == null ? zzc.zzb() : zzcVar;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 32) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfn.zza[i4 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("팷"), ProtectedSandApp.s("팸"), ProtectedSandApp.s("팹"), ProtectedSandApp.s("팺"), ProtectedSandApp.s("팻"), ProtectedSandApp.s("팼"), ProtectedSandApp.s("팽")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("팾"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zze> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zze.class) {
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

        static /* synthetic */ void zza(zze zzeVar, String str) {
            str.getClass();
            zzeVar.zze |= 2;
            zzeVar.zzg = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzf extends zzjt<zzf, zza> implements zzle {
        private static final zzf zzc;
        private static volatile zzll<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzkc<String> zzi = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzf, zza> implements zzle {
            private zza() {
                super(zzf.zzc);
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zzb implements zzjy {
            zza(0),
            zzb(1),
            zzc(2),
            zzd(3),
            zze(4),
            zzf(5),
            zzg(6);

            private final int zzi;

            zzb(int i4) {
                this.zzi = i4;
            }

            public static zzjx zzb() {
                return zzfq.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return ProtectedSandApp.s("퍆") + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("퍇") + this.zzi + ProtectedSandApp.s("퍈") + name() + m0.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzi;
            }

            public static zzb zza(int i4) {
                switch (i4) {
                    case 0:
                        return zza;
                    case 1:
                        return zzb;
                    case 2:
                        return zzc;
                    case 3:
                        return zzd;
                    case 4:
                        return zze;
                    case 5:
                        return zzf;
                    case 6:
                        return zzg;
                    default:
                        return null;
                }
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjt.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        public final zzb zzb() {
            zzb zza2 = zzb.zza(this.zzf);
            return zza2 == null ? zzb.zza : zza2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfn.zza[i4 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("퍉"), ProtectedSandApp.s("퍊"), zzb.zzb(), ProtectedSandApp.s("퍋"), ProtectedSandApp.s("퍌"), ProtectedSandApp.s("퍍")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("퍎"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzf> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzf.class) {
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
    public static final class zzd extends zzjt<zzd, zza> implements zzle {
        private static final zzd zzc;
        private static volatile zzll<zzd> zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzd, zza> implements zzle {
            private zza() {
                super(zzd.zzc);
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zzb implements zzjy {
            zza(0),
            zzb(1),
            zzc(2),
            zzd(3),
            zze(4);

            private final int zzg;

            zzb(int i4) {
                this.zzg = i4;
            }

            public static zzjx zzb() {
                return zzfp.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return ProtectedSandApp.s("팭") + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("팮") + this.zzg + ProtectedSandApp.s("팯") + name() + m0.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzg;
            }

            public static zzb zza(int i4) {
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

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjt.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zzd zzc() {
            return zzc;
        }

        public final zzb zza() {
            zzb zza2 = zzb.zza(this.zzf);
            return zza2 == null ? zzb.zza : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfn.zza[i4 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("팰"), ProtectedSandApp.s("팱"), zzb.zzb(), ProtectedSandApp.s("팲"), ProtectedSandApp.s("팳"), ProtectedSandApp.s("팴"), ProtectedSandApp.s("팵")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("팶"), objArr);
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
