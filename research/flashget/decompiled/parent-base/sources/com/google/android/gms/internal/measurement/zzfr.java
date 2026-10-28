package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzjt;
import java.util.Collections;
import java.util.List;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzfr {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zza extends zzjt<zza, zzb> implements zzle {
        private static final zza zzc;
        private static volatile zzll<zza> zzd;
        private int zze;
        private boolean zzi;
        private zzkc<C0792zza> zzf = zzjt.zzch();
        private zzkc<zzc> zzg = zzjt.zzch();
        private zzkc<zzf> zzh = zzjt.zzch();
        private zzkc<C0792zza> zzj = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zza, reason: collision with other inner class name */
        public static final class C0792zza extends zzjt<C0792zza, C0793zza> implements zzle {
            private static final C0792zza zzc;
            private static volatile zzll<C0792zza> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zza$zza, reason: collision with other inner class name */
            public static final class C0793zza extends zzjt.zzb<C0792zza, C0793zza> implements zzle {
                private C0793zza() {
                    super(C0792zza.zzc);
                }
            }

            static {
                C0792zza c0792zza = new C0792zza();
                zzc = c0792zza;
                zzjt.zza((Class<C0792zza>) C0792zza.class, c0792zza);
            }

            private C0792zza() {
            }

            public final zzd zzb() {
                zzd zza = zzd.zza(this.zzg);
                return zza == null ? zzd.zza : zza;
            }

            public final zze zzc() {
                zze zza = zze.zza(this.zzf);
                return zza == null ? zze.zza : zza;
            }

            @Override // com.google.android.gms.internal.measurement.zzjt
            protected final Object zza(int i4, Object obj, Object obj2) {
                switch (zzft.zza[i4 - 1]) {
                    case 1:
                        return new C0792zza();
                    case 2:
                        return new C0793zza();
                    case 3:
                        Object[] objArr = {ProtectedSandApp.s("퍏"), ProtectedSandApp.s("퍐"), zze.zzb(), ProtectedSandApp.s("퍑"), zzd.zzb()};
                        return zzjt.zza(zzc, ProtectedSandApp.s("퍒"), objArr);
                    case 4:
                        return zzc;
                    case 5:
                        zzll<C0792zza> zzllVar = zzd;
                        if (zzllVar == null) {
                            synchronized (C0792zza.class) {
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
        public static final class zzb extends zzjt.zzb<zza, zzb> implements zzle {
            private zzb() {
                super(zza.zzc);
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zzc extends zzjt<zzc, C0794zza> implements zzle {
            private static final zzc zzc;
            private static volatile zzll<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zzc$zza, reason: collision with other inner class name */
            public static final class C0794zza extends zzjt.zzb<zzc, C0794zza> implements zzle {
                private C0794zza() {
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

            public final zze zzb() {
                zze zza = zze.zza(this.zzg);
                return zza == null ? zze.zza : zza;
            }

            public final zze zzc() {
                zze zza = zze.zza(this.zzf);
                return zza == null ? zze.zza : zza;
            }

            @Override // com.google.android.gms.internal.measurement.zzjt
            protected final Object zza(int i4, Object obj, Object obj2) {
                switch (zzft.zza[i4 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C0794zza();
                    case 3:
                        Object[] objArr = {ProtectedSandApp.s("퍓"), ProtectedSandApp.s("퍔"), zze.zzb(), ProtectedSandApp.s("퍕"), zze.zzb()};
                        return zzjt.zza(zzc, ProtectedSandApp.s("퍖"), objArr);
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
        public enum zzd implements zzjy {
            zza(0),
            zzb(1),
            zzc(2);

            private final int zze;

            zzd(int i4) {
                this.zze = i4;
            }

            public static zzjx zzb() {
                return zzfu.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return ProtectedSandApp.s("퍚") + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("퍛") + this.zze + ProtectedSandApp.s("퍜") + name() + m0.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zze;
            }

            public static zzd zza(int i4) {
                if (i4 == 0) {
                    return zza;
                }
                if (i4 == 1) {
                    return zzb;
                }
                if (i4 != 2) {
                    return null;
                }
                return zzc;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zze implements zzjy {
            zza(0),
            zzb(1),
            zzc(2),
            zzd(3),
            zze(4);

            private final int zzg;

            zze(int i4) {
                this.zzg = i4;
            }

            public static zzjx zzb() {
                return zzfv.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return ProtectedSandApp.s("퍢") + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("퍣") + this.zzg + ProtectedSandApp.s("퍤") + name() + m0.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzg;
            }

            public static zze zza(int i4) {
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
        public static final class zzf extends zzjt<zzf, C0795zza> implements zzle {
            private static final zzf zzc;
            private static volatile zzll<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zzf$zza, reason: collision with other inner class name */
            public static final class C0795zza extends zzjt.zzb<zzf, C0795zza> implements zzle {
                private C0795zza() {
                    super(zzf.zzc);
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzc = zzfVar;
                zzjt.zza((Class<zzf>) zzf.class, zzfVar);
            }

            private zzf() {
            }

            public final String zzb() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.measurement.zzjt
            protected final Object zza(int i4, Object obj, Object obj2) {
                switch (zzft.zza[i4 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0795zza();
                    case 3:
                        Object[] objArr = {ProtectedSandApp.s("퍥"), ProtectedSandApp.s("퍦"), ProtectedSandApp.s("퍧")};
                        return zzjt.zza(zzc, ProtectedSandApp.s("퍨"), objArr);
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

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzb() {
            return zzc;
        }

        public final List<zzf> zzc() {
            return this.zzh;
        }

        public final List<C0792zza> zzd() {
            return this.zzf;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final List<C0792zza> zzf() {
            return this.zzj;
        }

        public final boolean zzg() {
            return this.zzi;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("퍩"), ProtectedSandApp.s("퍪"), C0792zza.class, ProtectedSandApp.s("퍫"), zzc.class, ProtectedSandApp.s("퍬"), zzf.class, ProtectedSandApp.s("퍭"), ProtectedSandApp.s("퍮"), C0792zza.class};
                    return zzjt.zza(zzc, ProtectedSandApp.s("퍯"), objArr);
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
        private zzkc<zzg> zzg = zzjt.zzch();
        private boolean zzh;

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

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("퍰"), ProtectedSandApp.s("퍱"), ProtectedSandApp.s("퍲"), zzg.class, ProtectedSandApp.s("퍳")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("퍴"), objArr);
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
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzc, zza> implements zzle {
            public final int zza() {
                return ((zzc) this.zza).zza();
            }

            public final String zzb() {
                return ((zzc) this.zza).zzc();
            }

            public final boolean zzc() {
                return ((zzc) this.zza).zzd();
            }

            public final boolean zzd() {
                return ((zzc) this.zza).zze();
            }

            public final boolean zze() {
                return ((zzc) this.zza).zzf();
            }

            public final boolean zzf() {
                return ((zzc) this.zza).zzg();
            }

            public final boolean zzg() {
                return ((zzc) this.zza).zzh();
            }

            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(String str) {
                zzak();
                zzc.zza((zzc) this.zza, str);
                return this;
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjt.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public final int zza() {
            return this.zzi;
        }

        public final String zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return this.zzg;
        }

        public final boolean zze() {
            return this.zzh;
        }

        public final boolean zzf() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("퍵"), ProtectedSandApp.s("퍶"), ProtectedSandApp.s("퍷"), ProtectedSandApp.s("퍸"), ProtectedSandApp.s("퍹")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("퍺"), objArr);
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
            zzcVar.zze |= 1;
            zzcVar.zzf = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzd extends zzjt<zzd, zza> implements zzle {
        private static final zzd zzc;
        private static volatile zzll<zzd> zzd;
        private int zze;
        private long zzf;
        private int zzh;
        private boolean zzm;
        private zza zzr;
        private zzf zzs;
        private zzi zzt;
        private zzg zzu;
        private zze zzv;
        private String zzg = "";
        private zzkc<zzh> zzi = zzjt.zzch();
        private zzkc<zzc> zzj = zzjt.zzch();
        private zzkc<zzfo.zza> zzk = zzjt.zzch();
        private String zzl = "";
        private zzkc<zzgd.zzc> zzn = zzjt.zzch();
        private zzkc<zzb> zzo = zzjt.zzch();
        private String zzp = "";
        private String zzq = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzd, zza> implements zzle {
            public final int zza() {
                return ((zzd) this.zza).zzb();
            }

            public final zza zzb() {
                zzak();
                zzd.zza((zzd) this.zza);
                return this;
            }

            public final String zzc() {
                return ((zzd) this.zza).zzj();
            }

            public final List<zzfo.zza> zzd() {
                return Collections.unmodifiableList(((zzd) this.zza).zzk());
            }

            public final List<zzb> zze() {
                return Collections.unmodifiableList(((zzd) this.zza).zzl());
            }

            private zza() {
                super(zzd.zzc);
            }

            public final zzc zza(int i4) {
                return ((zzd) this.zza).zza(i4);
            }

            public final zza zza(int i4, zzc.zza zzaVar) {
                zzak();
                zzd.zza((zzd) this.zza, i4, (zzc) ((zzjt) zzaVar.zzai()));
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjt.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static zzd zzg() {
            return zzc;
        }

        public final int zza() {
            return this.zzn.size();
        }

        public final int zzb() {
            return this.zzj.size();
        }

        public final long zzc() {
            return this.zzf;
        }

        public final zza zzd() {
            zza zzaVar = this.zzr;
            return zzaVar == null ? zza.zzb() : zzaVar;
        }

        public final zzi zzh() {
            zzi zziVar = this.zzt;
            return zziVar == null ? zzi.zzc() : zziVar;
        }

        public final String zzi() {
            return this.zzg;
        }

        public final String zzj() {
            return this.zzp;
        }

        public final List<zzfo.zza> zzk() {
            return this.zzk;
        }

        public final List<zzb> zzl() {
            return this.zzo;
        }

        public final List<zzgd.zzc> zzm() {
            return this.zzn;
        }

        public final List<zzh> zzn() {
            return this.zzi;
        }

        public final boolean zzo() {
            return (this.zze & 128) != 0;
        }

        public final boolean zzp() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzq() {
            return (this.zze & 512) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 1) != 0;
        }

        public final zzc zza(int i4) {
            return this.zzj.get(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, ProtectedSandApp.s("펍"), new Object[]{ProtectedSandApp.s("퍻"), ProtectedSandApp.s("퍼"), ProtectedSandApp.s("퍽"), ProtectedSandApp.s("퍾"), ProtectedSandApp.s("퍿"), zzh.class, ProtectedSandApp.s("펀"), zzc.class, ProtectedSandApp.s("펁"), zzfo.zza.class, ProtectedSandApp.s("펂"), ProtectedSandApp.s("펃"), ProtectedSandApp.s("펄"), zzgd.zzc.class, ProtectedSandApp.s("펅"), zzb.class, ProtectedSandApp.s("펆"), ProtectedSandApp.s("펇"), ProtectedSandApp.s("펈"), ProtectedSandApp.s("펉"), ProtectedSandApp.s("펊"), ProtectedSandApp.s("펋"), ProtectedSandApp.s("펌")});
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

        static /* synthetic */ void zza(zzd zzdVar) {
            zzdVar.zzk = zzjt.zzch();
        }

        static /* synthetic */ void zza(zzd zzdVar, int i4, zzc zzcVar) {
            zzcVar.getClass();
            zzkc<zzc> zzkcVar = zzdVar.zzj;
            if (!zzkcVar.zzc()) {
                zzdVar.zzj = zzjt.zza(zzkcVar);
            }
            zzdVar.zzj.set(i4, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zze extends zzjt<zze, zza> implements zzle {
        private static final zze zzc;
        private static volatile zzll<zze> zzd;
        private zzkc<String> zze = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zze, zza> implements zzle {
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

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펎")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("펏"), objArr);
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
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzf extends zzjt<zzf, zza> implements zzle {
        private static final zzf zzc;
        private static volatile zzll<zzf> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzf, zza> implements zzle {
            private zza() {
                super(zzf.zzc);
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjt.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펐"), ProtectedSandApp.s("펑"), ProtectedSandApp.s("펒"), ProtectedSandApp.s("펓")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("펔"), objArr);
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
    public static final class zzg extends zzjt<zzg, zza> implements zzle {
        private static final zzg zzc;
        private static volatile zzll<zzg> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzg, zza> implements zzle {
            private zza() {
                super(zzg.zzc);
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjt.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펕"), ProtectedSandApp.s("펖"), ProtectedSandApp.s("펗")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("페"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzg> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzg.class) {
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
    public static final class zzh extends zzjt<zzh, zza> implements zzle {
        private static final zzh zzc;
        private static volatile zzll<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzh, zza> implements zzle {
            private zza() {
                super(zzh.zzc);
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjt.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }

        public final String zzb() {
            return this.zzf;
        }

        public final String zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펙"), ProtectedSandApp.s("펚"), ProtectedSandApp.s("펛")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("펜"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzh> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzh.class) {
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
    public static final class zzi extends zzjt<zzi, zza> implements zzle {
        private static final zzi zzc;
        private static volatile zzll<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzi, zza> implements zzle {
            private zza() {
                super(zzi.zzc);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzjt.zza((Class<zzi>) zzi.class, zziVar);
        }

        private zzi() {
        }

        public static zzi zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zzi;
        }

        public final String zzd() {
            return this.zzg;
        }

        public final String zze() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzft.zza[i4 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펝"), ProtectedSandApp.s("펞"), ProtectedSandApp.s("펟"), ProtectedSandApp.s("펠"), ProtectedSandApp.s("펡")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("펢"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzi> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzi.class) {
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
