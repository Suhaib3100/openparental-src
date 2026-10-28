package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.firebase.remoteconfig.p;
import java.util.Collections;
import java.util.List;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzfy {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zza extends zzjt<zza, C0796zza> implements zzle {
        private static final zza zzc;
        private static volatile zzll<zza> zzd;
        private int zze;
        private long zzi;
        private long zzm;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        /* renamed from: com.google.android.gms.internal.measurement.zzfy$zza$zza, reason: collision with other inner class name */
        public static final class C0796zza extends zzjt.zzb<zza, C0796zza> implements zzle {
            public final long zza() {
                return ((zza) this.zza).zza();
            }

            public final long zzb() {
                return ((zza) this.zza).zzb();
            }

            public final C0796zza zzc() {
                zzak();
                zza.zza((zza) this.zza);
                return this;
            }

            public final C0796zza zzd() {
                zzak();
                zza.zzb((zza) this.zza);
                return this;
            }

            public final C0796zza zze() {
                zzak();
                zza.zzc((zza) this.zza);
                return this;
            }

            public final C0796zza zzf() {
                zzak();
                zza.zzd((zza) this.zza);
                return this;
            }

            public final C0796zza zzg() {
                zzak();
                zza.zze((zza) this.zza);
                return this;
            }

            public final C0796zza zzh() {
                zzak();
                zza.zzf((zza) this.zza);
                return this;
            }

            private C0796zza() {
                super(zza.zzc);
            }

            public final C0796zza zza(String str) {
                zzak();
                zza.zza((zza) this.zza, str);
                return this;
            }

            public final C0796zza zzb(String str) {
                zzak();
                zza.zzb((zza) this.zza, str);
                return this;
            }

            public final C0796zza zzc(String str) {
                zzak();
                zza.zzc((zza) this.zza, str);
                return this;
            }

            public final C0796zza zzd(String str) {
                zzak();
                zza.zzd((zza) this.zza, str);
                return this;
            }

            public final C0796zza zze(String str) {
                zzak();
                zza.zze((zza) this.zza, str);
                return this;
            }

            public final C0796zza zzf(String str) {
                zzak();
                zza.zzf((zza) this.zza, str);
                return this;
            }

            public final C0796zza zza(long j4) {
                zzak();
                zza.zza((zza) this.zza, j4);
                return this;
            }

            public final C0796zza zzb(long j4) {
                zzak();
                zza.zzb((zza) this.zza, j4);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static C0796zza zzc() {
            return zzc.zzcc();
        }

        public static zza zze() {
            return zzc;
        }

        public final long zza() {
            return this.zzi;
        }

        public final long zzb() {
            return this.zzm;
        }

        public final String zzf() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzf;
        }

        public final String zzi() {
            return this.zzl;
        }

        public final String zzj() {
            return this.zzk;
        }

        public final String zzk() {
            return this.zzj;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzo() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzp() {
            return (this.zze & 128) != 0;
        }

        public final boolean zzq() {
            return (this.zze & 64) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzs() {
            return (this.zze & 16) != 0;
        }

        static /* synthetic */ void zzb(zza zzaVar) {
            zzaVar.zze &= -3;
            zzaVar.zzg = zzc.zzg;
        }

        static /* synthetic */ void zzc(zza zzaVar) {
            zzaVar.zze &= -2;
            zzaVar.zzf = zzc.zzf;
        }

        static /* synthetic */ void zzd(zza zzaVar) {
            zzaVar.zze &= -65;
            zzaVar.zzl = zzc.zzl;
        }

        static /* synthetic */ void zze(zza zzaVar) {
            zzaVar.zze &= -33;
            zzaVar.zzk = zzc.zzk;
        }

        static /* synthetic */ void zzf(zza zzaVar) {
            zzaVar.zze &= -17;
            zzaVar.zzj = zzc.zzj;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0796zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펣"), ProtectedSandApp.s("펤"), ProtectedSandApp.s("펥"), ProtectedSandApp.s("펦"), ProtectedSandApp.s("펧"), ProtectedSandApp.s("펨"), ProtectedSandApp.s("펩"), ProtectedSandApp.s("펪"), ProtectedSandApp.s("펫")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("펬"), objArr);
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

        static /* synthetic */ void zzb(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 2;
            zzaVar.zzg = str;
        }

        static /* synthetic */ void zzc(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 1;
            zzaVar.zzf = str;
        }

        static /* synthetic */ void zzd(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 64;
            zzaVar.zzl = str;
        }

        static /* synthetic */ void zze(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 32;
            zzaVar.zzk = str;
        }

        static /* synthetic */ void zzf(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 16;
            zzaVar.zzj = str;
        }

        static /* synthetic */ void zzb(zza zzaVar, long j4) {
            zzaVar.zze |= 128;
            zzaVar.zzm = j4;
        }

        static /* synthetic */ void zza(zza zzaVar) {
            zzaVar.zze &= -5;
            zzaVar.zzh = zzc.zzh;
        }

        static /* synthetic */ void zza(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 4;
            zzaVar.zzh = str;
        }

        static /* synthetic */ void zza(zza zzaVar, long j4) {
            zzaVar.zze |= 8;
            zzaVar.zzi = j4;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzb extends zzjt<zzb, zza> implements zzle {
        private static final zzb zzc;
        private static volatile zzll<zzb> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

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

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펭"), ProtectedSandApp.s("펮"), ProtectedSandApp.s("펯"), ProtectedSandApp.s("펰"), ProtectedSandApp.s("펱"), ProtectedSandApp.s("펲"), ProtectedSandApp.s("펳"), ProtectedSandApp.s("펴")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("펵"), objArr);
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
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzc, zza> implements zzle {
            public final zza zza(boolean z4) {
                zzak();
                zzc.zza((zzc) this.zza, z4);
                return this;
            }

            public final zza zzb(boolean z4) {
                zzak();
                zzc.zzb((zzc) this.zza, z4);
                return this;
            }

            public final zza zzc(boolean z4) {
                zzak();
                zzc.zzc((zzc) this.zza, z4);
                return this;
            }

            public final zza zzd(boolean z4) {
                zzak();
                zzc.zzd((zzc) this.zza, z4);
                return this;
            }

            public final zza zze(boolean z4) {
                zzak();
                zzc.zze((zzc) this.zza, z4);
                return this;
            }

            public final zza zzf(boolean z4) {
                zzak();
                zzc.zzf((zzc) this.zza, z4);
                return this;
            }

            public final zza zzg(boolean z4) {
                zzak();
                zzc.zzg((zzc) this.zza, z4);
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

        public static zza zza() {
            return zzc.zzcc();
        }

        public static zzc zzc() {
            return zzc;
        }

        static /* synthetic */ void zzd(zzc zzcVar, boolean z4) {
            zzcVar.zze |= 64;
            zzcVar.zzl = z4;
        }

        static /* synthetic */ void zze(zzc zzcVar, boolean z4) {
            zzcVar.zze |= 2;
            zzcVar.zzg = z4;
        }

        static /* synthetic */ void zzf(zzc zzcVar, boolean z4) {
            zzcVar.zze |= 4;
            zzcVar.zzh = z4;
        }

        static /* synthetic */ void zzg(zzc zzcVar, boolean z4) {
            zzcVar.zze |= 8;
            zzcVar.zzi = z4;
        }

        public final boolean zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return this.zzh;
        }

        public final boolean zzj() {
            return this.zzi;
        }

        static /* synthetic */ void zzb(zzc zzcVar, boolean z4) {
            zzcVar.zze |= 16;
            zzcVar.zzj = z4;
        }

        static /* synthetic */ void zzc(zzc zzcVar, boolean z4) {
            zzcVar.zze |= 1;
            zzcVar.zzf = z4;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펶"), ProtectedSandApp.s("펷"), ProtectedSandApp.s("편"), ProtectedSandApp.s("펹"), ProtectedSandApp.s("펺"), ProtectedSandApp.s("펻"), ProtectedSandApp.s("펼"), ProtectedSandApp.s("펽")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("펾"), objArr);
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

        public final boolean zzd() {
            return this.zzk;
        }

        public final boolean zze() {
            return this.zzj;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return this.zzl;
        }

        static /* synthetic */ void zza(zzc zzcVar, boolean z4) {
            zzcVar.zze |= 32;
            zzcVar.zzk = z4;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzd extends zzjt<zzd, zza> implements zzle {
        private static final zzd zzc;
        private static volatile zzll<zzd> zzd;
        private int zze;
        private int zzf;
        private zzm zzg;
        private zzm zzh;
        private boolean zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzd, zza> implements zzle {
            public final zza zza(int i4) {
                zzak();
                zzd.zza((zzd) this.zza, i4);
                return this;
            }

            private zza() {
                super(zzd.zzc);
            }

            public final zza zza(zzm.zza zzaVar) {
                zzak();
                zzd.zza((zzd) this.zza, (zzm) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zza(boolean z4) {
                zzak();
                zzd.zza((zzd) this.zza, z4);
                return this;
            }

            public final zza zza(zzm zzmVar) {
                zzak();
                zzd.zzb((zzd) this.zza, zzmVar);
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

        public static zza zzb() {
            return zzc.zzcc();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzm zzd() {
            zzm zzmVar = this.zzg;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        public final zzm zze() {
            zzm zzmVar = this.zzh;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        static /* synthetic */ void zzb(zzd zzdVar, zzm zzmVar) {
            zzmVar.getClass();
            zzdVar.zzh = zzmVar;
            zzdVar.zze |= 4;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("펿"), ProtectedSandApp.s("폀"), ProtectedSandApp.s("폁"), ProtectedSandApp.s("폂"), ProtectedSandApp.s("폃")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("폄"), objArr);
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

        static /* synthetic */ void zza(zzd zzdVar, int i4) {
            zzdVar.zze |= 1;
            zzdVar.zzf = i4;
        }

        static /* synthetic */ void zza(zzd zzdVar, zzm zzmVar) {
            zzmVar.getClass();
            zzdVar.zzg = zzmVar;
            zzdVar.zze |= 2;
        }

        static /* synthetic */ void zza(zzd zzdVar, boolean z4) {
            zzdVar.zze |= 8;
            zzdVar.zzi = z4;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zze extends zzjt<zze, zza> implements zzle {
        private static final zze zzc;
        private static volatile zzll<zze> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zze, zza> implements zzle {
            public final zza zza(long j4) {
                zzak();
                zze.zza((zze) this.zza, j4);
                return this;
            }

            private zza() {
                super(zze.zzc);
            }

            public final zza zza(int i4) {
                zzak();
                zze.zza((zze) this.zza, i4);
                return this;
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

        public final long zzb() {
            return this.zzg;
        }

        public final boolean zze() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("폅"), ProtectedSandApp.s("폆"), ProtectedSandApp.s("폇")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("폈"), objArr);
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

        static /* synthetic */ void zza(zze zzeVar, long j4) {
            zzeVar.zze |= 2;
            zzeVar.zzg = j4;
        }

        static /* synthetic */ void zza(zze zzeVar, int i4) {
            zzeVar.zze |= 1;
            zzeVar.zzf = i4;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzf extends zzjt<zzf, zza> implements zzle {
        private static final zzf zzc;
        private static volatile zzll<zzf> zzd;
        private int zze;
        private zzkc<zzh> zzf = zzjt.zzch();
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzf, zza> implements zzle {
            public final int zza() {
                return ((zzf) this.zza).zzb();
            }

            public final long zzb() {
                return ((zzf) this.zza).zzc();
            }

            public final long zzc() {
                return ((zzf) this.zza).zzd();
            }

            public final zza zzd() {
                zzak();
                zzf.zza((zzf) this.zza);
                return this;
            }

            public final String zze() {
                return ((zzf) this.zza).zzg();
            }

            public final List<zzh> zzf() {
                return Collections.unmodifiableList(((zzf) this.zza).zzh());
            }

            public final boolean zzg() {
                return ((zzf) this.zza).zzk();
            }

            private zza() {
                super(zzf.zzc);
            }

            public final zza zza(Iterable<? extends zzh> iterable) {
                zzak();
                zzf.zza((zzf) this.zza, iterable);
                return this;
            }

            public final zza zzb(long j4) {
                zzak();
                zzf.zzb((zzf) this.zza, j4);
                return this;
            }

            public final zza zza(zzh.zza zzaVar) {
                zzak();
                zzf.zza((zzf) this.zza, (zzh) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zzh zzb(int i4) {
                return ((zzf) this.zza).zza(i4);
            }

            public final zza zza(zzh zzhVar) {
                zzak();
                zzf.zza((zzf) this.zza, zzhVar);
                return this;
            }

            public final zza zza(int i4) {
                zzak();
                zzf.zza((zzf) this.zza, i4);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzf.zza((zzf) this.zza, str);
                return this;
            }

            public final zza zza(int i4, zzh.zza zzaVar) {
                zzak();
                zzf.zza((zzf) this.zza, i4, (zzh) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zza(int i4, zzh zzhVar) {
                zzak();
                zzf.zza((zzf) this.zza, i4, zzhVar);
                return this;
            }

            public final zza zza(long j4) {
                zzak();
                zzf.zza((zzf) this.zza, j4);
                return this;
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjt.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        private final void zzl() {
            zzkc<zzh> zzkcVar = this.zzf;
            if (zzkcVar.zzc()) {
                return;
            }
            this.zzf = zzjt.zza(zzkcVar);
        }

        public final int zza() {
            return this.zzj;
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final List<zzh> zzh() {
            return this.zzf;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 2) != 0;
        }

        static /* synthetic */ void zzb(zzf zzfVar, long j4) {
            zzfVar.zze |= 2;
            zzfVar.zzh = j4;
        }

        public final zzh zza(int i4) {
            return this.zzf.get(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("평"), ProtectedSandApp.s("폊"), zzh.class, ProtectedSandApp.s("폋"), ProtectedSandApp.s("폌"), ProtectedSandApp.s("폍"), ProtectedSandApp.s("폎")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("폏"), objArr);
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

        static /* synthetic */ void zza(zzf zzfVar, Iterable iterable) {
            zzfVar.zzl();
            zzib.zza(iterable, zzfVar.zzf);
        }

        static /* synthetic */ void zza(zzf zzfVar, zzh zzhVar) {
            zzhVar.getClass();
            zzfVar.zzl();
            zzfVar.zzf.add(zzhVar);
        }

        static /* synthetic */ void zza(zzf zzfVar) {
            zzfVar.zzf = zzjt.zzch();
        }

        static /* synthetic */ void zza(zzf zzfVar, int i4) {
            zzfVar.zzl();
            zzfVar.zzf.remove(i4);
        }

        static /* synthetic */ void zza(zzf zzfVar, String str) {
            str.getClass();
            zzfVar.zze |= 1;
            zzfVar.zzg = str;
        }

        static /* synthetic */ void zza(zzf zzfVar, int i4, zzh zzhVar) {
            zzhVar.getClass();
            zzfVar.zzl();
            zzfVar.zzf.set(i4, zzhVar);
        }

        static /* synthetic */ void zza(zzf zzfVar, long j4) {
            zzfVar.zze |= 4;
            zzfVar.zzi = j4;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzg extends zzjt<zzg, zza> implements zzle {
        private static final zzg zzc;
        private static volatile zzll<zzg> zzd;
        private int zze;
        private String zzf = "";
        private long zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzg, zza> implements zzle {
            public final zza zza(long j4) {
                zzak();
                zzg.zza((zzg) this.zza, j4);
                return this;
            }

            private zza() {
                super(zzg.zzc);
            }

            public final zza zza(String str) {
                zzak();
                zzg.zza((zzg) this.zza, str);
                return this;
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjt.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zza zza() {
            return zzc.zzcc();
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("폐"), ProtectedSandApp.s("폑"), ProtectedSandApp.s("폒")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("폓"), objArr);
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

        static /* synthetic */ void zza(zzg zzgVar, long j4) {
            zzgVar.zze |= 2;
            zzgVar.zzg = j4;
        }

        static /* synthetic */ void zza(zzg zzgVar, String str) {
            str.getClass();
            zzgVar.zze |= 1;
            zzgVar.zzf = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzh extends zzjt<zzh, zza> implements zzle {
        private static final zzh zzc;
        private static volatile zzll<zzh> zzd;
        private int zze;
        private long zzh;
        private float zzi;
        private double zzj;
        private String zzf = "";
        private String zzg = "";
        private zzkc<zzh> zzk = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzh, zza> implements zzle {
            public final int zza() {
                return ((zzh) this.zza).zzc();
            }

            public final zza zzb() {
                zzak();
                zzh.zza((zzh) this.zza);
                return this;
            }

            public final zza zzc() {
                zzak();
                zzh.zzb((zzh) this.zza);
                return this;
            }

            public final zza zzd() {
                zzak();
                zzh.zzc((zzh) this.zza);
                return this;
            }

            public final zza zze() {
                zzak();
                zzh.zzd((zzh) this.zza);
                return this;
            }

            public final String zzf() {
                return ((zzh) this.zza).zzg();
            }

            public final String zzg() {
                return ((zzh) this.zza).zzh();
            }

            private zza() {
                super(zzh.zzc);
            }

            public final zza zza(Iterable<? extends zzh> iterable) {
                zzak();
                zzh.zza((zzh) this.zza, iterable);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzh.zzb((zzh) this.zza, str);
                return this;
            }

            public final zza zza(zza zzaVar) {
                zzak();
                zzh.zza((zzh) this.zza, (zzh) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zza(double d5) {
                zzak();
                zzh.zza((zzh) this.zza, d5);
                return this;
            }

            public final zza zza(long j4) {
                zzak();
                zzh.zza((zzh) this.zza, j4);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzh.zza((zzh) this.zza, str);
                return this;
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjt.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        private final void zzo() {
            zzkc<zzh> zzkcVar = this.zzk;
            if (zzkcVar.zzc()) {
                return;
            }
            this.zzk = zzjt.zza(zzkcVar);
        }

        public final double zza() {
            return this.zzj;
        }

        public final float zzb() {
            return this.zzi;
        }

        public final int zzc() {
            return this.zzk.size();
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzf;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final List<zzh> zzi() {
            return this.zzk;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 2) != 0;
        }

        static /* synthetic */ void zzb(zzh zzhVar) {
            zzhVar.zze &= -5;
            zzhVar.zzh = 0L;
        }

        static /* synthetic */ void zzc(zzh zzhVar) {
            zzhVar.zzk = zzjt.zzch();
        }

        static /* synthetic */ void zzd(zzh zzhVar) {
            zzhVar.zze &= -3;
            zzhVar.zzg = zzc.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("폔"), ProtectedSandApp.s("폕"), ProtectedSandApp.s("폖"), ProtectedSandApp.s("폗"), ProtectedSandApp.s("폘"), ProtectedSandApp.s("폙"), ProtectedSandApp.s("폚"), zzh.class};
                    return zzjt.zza(zzc, ProtectedSandApp.s("폛"), objArr);
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

        static /* synthetic */ void zzb(zzh zzhVar, String str) {
            str.getClass();
            zzhVar.zze |= 2;
            zzhVar.zzg = str;
        }

        static /* synthetic */ void zza(zzh zzhVar, Iterable iterable) {
            zzhVar.zzo();
            zzib.zza(iterable, zzhVar.zzk);
        }

        static /* synthetic */ void zza(zzh zzhVar, zzh zzhVar2) {
            zzhVar2.getClass();
            zzhVar.zzo();
            zzhVar.zzk.add(zzhVar2);
        }

        static /* synthetic */ void zza(zzh zzhVar) {
            zzhVar.zze &= -17;
            zzhVar.zzj = p.f60679p;
        }

        static /* synthetic */ void zza(zzh zzhVar, double d5) {
            zzhVar.zze |= 16;
            zzhVar.zzj = d5;
        }

        static /* synthetic */ void zza(zzh zzhVar, long j4) {
            zzhVar.zze |= 4;
            zzhVar.zzh = j4;
        }

        static /* synthetic */ void zza(zzh zzhVar, String str) {
            str.getClass();
            zzhVar.zze |= 1;
            zzhVar.zzf = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzi extends zzjt<zzi, zza> implements zzle {
        private static final zzi zzc;
        private static volatile zzll<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zzb zzh;

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

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("폜"), ProtectedSandApp.s("폝"), ProtectedSandApp.s("폞"), ProtectedSandApp.s("폟")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("폠"), objArr);
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

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzj extends zzjt<zzj, zza> implements zzle {
        private static final zzj zzc;
        private static volatile zzll<zzj> zzd;
        private int zze;
        private zzkc<zzk> zzf = zzjt.zzch();
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzj, zza> implements zzle {
            public final int zza() {
                return ((zzj) this.zza).zza();
            }

            public final zza zzb() {
                zzak();
                zzj.zzb((zzj) this.zza);
                return this;
            }

            public final String zzc() {
                return ((zzj) this.zza).zzd();
            }

            public final List<zzk> zzd() {
                return Collections.unmodifiableList(((zzj) this.zza).zzf());
            }

            private zza() {
                super(zzj.zzc);
            }

            public final zza zza(Iterable<? extends zzk> iterable) {
                zzak();
                zzj.zza((zzj) this.zza, iterable);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzj.zzb((zzj) this.zza, str);
                return this;
            }

            public final zza zza(zzk.zza zzaVar) {
                zzak();
                zzj.zza((zzj) this.zza, (zzk) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzj.zza((zzj) this.zza, str);
                return this;
            }

            public final zzk zza(int i4) {
                return ((zzj) this.zza).zza(0);
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zzb implements zzjy {
            zza(0),
            zzb(1);

            private final int zzd;

            zzb(int i4) {
                this.zzd = i4;
            }

            public static zzjx zzb() {
                return zzgb.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return ProtectedSandApp.s("폣") + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("폤") + this.zzd + ProtectedSandApp.s("폥") + name() + m0.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzd;
            }

            public static zzb zza(int i4) {
                if (i4 == 0) {
                    return zza;
                }
                if (i4 != 1) {
                    return null;
                }
                return zzb;
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzc = zzjVar;
            zzjt.zza((Class<zzj>) zzj.class, zzjVar);
        }

        private zzj() {
        }

        public static zza zzb() {
            return zzc.zzcc();
        }

        private final void zzi() {
            zzkc<zzk> zzkcVar = this.zzf;
            if (zzkcVar.zzc()) {
                return;
            }
            this.zzf = zzjt.zza(zzkcVar);
        }

        public final int zza() {
            return this.zzf.size();
        }

        public final String zzd() {
            return this.zzg;
        }

        public final String zze() {
            return this.zzh;
        }

        public final List<zzk> zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public static zza zza(zzj zzjVar) {
            return zzc.zza(zzjVar);
        }

        static /* synthetic */ void zzb(zzj zzjVar) {
            zzjVar.zzf = zzjt.zzch();
        }

        static /* synthetic */ void zzb(zzj zzjVar, String str) {
            str.getClass();
            zzjVar.zze |= 2;
            zzjVar.zzh = str;
        }

        public final zzk zza(int i4) {
            return this.zzf.get(0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("폦"), ProtectedSandApp.s("폧"), zzk.class, ProtectedSandApp.s("폨"), ProtectedSandApp.s("폩"), ProtectedSandApp.s("폪"), zzb.zzb()};
                    return zzjt.zza(zzc, ProtectedSandApp.s("폫"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzj> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzj.class) {
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

        static /* synthetic */ void zza(zzj zzjVar, Iterable iterable) {
            zzjVar.zzi();
            zzib.zza(iterable, zzjVar.zzf);
        }

        static /* synthetic */ void zza(zzj zzjVar, zzk zzkVar) {
            zzkVar.getClass();
            zzjVar.zzi();
            zzjVar.zzf.add(zzkVar);
        }

        static /* synthetic */ void zza(zzj zzjVar, String str) {
            str.getClass();
            zzjVar.zze |= 1;
            zzjVar.zzg = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzk extends zzjt<zzk, zza> implements zzle {
        private static final zzk zzc;
        private static volatile zzll<zzk> zzd;
        private long zzab;
        private int zzac;
        private boolean zzaf;
        private int zzai;
        private int zzaj;
        private int zzak;
        private long zzam;
        private long zzan;
        private int zzaq;
        private zzl zzas;
        private long zzau;
        private long zzav;
        private int zzay;
        private boolean zzaz;
        private boolean zzbb;
        private zzi zzbc;
        private long zzbg;
        private boolean zzbh;
        private boolean zzbj;
        private int zzbl;
        private zzc zzbn;
        private int zzbo;
        private zza zzbp;
        private int zze;
        private int zzf;
        private int zzg;
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private int zzs;
        private long zzw;
        private long zzx;
        private boolean zzz;
        private zzkc<zzf> zzh = zzjt.zzch();
        private zzkc<zzo> zzi = zzjt.zzch();
        private String zzo = "";
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzt = "";
        private String zzu = "";
        private String zzv = "";
        private String zzy = "";
        private String zzaa = "";
        private String zzad = "";
        private String zzae = "";
        private zzkc<zzd> zzag = zzjt.zzch();
        private String zzah = "";
        private String zzal = "";
        private String zzao = "";
        private String zzap = "";
        private String zzar = "";
        private zzka zzat = zzjt.zzcf();
        private String zzaw = "";
        private String zzax = "";
        private String zzba = "";
        private String zzbd = "";
        private zzkc<String> zzbe = zzjt.zzch();
        private String zzbf = "";
        private String zzbi = "";
        private String zzbk = "";
        private String zzbm = "";
        private String zzbq = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzk, zza> implements zzle {
            public final int zza() {
                return ((zzk) this.zza).zza();
            }

            public final List<zzf> zzaa() {
                return Collections.unmodifiableList(((zzk) this.zza).zzar());
            }

            public final List<zzo> zzab() {
                return Collections.unmodifiableList(((zzk) this.zza).zzas());
            }

            public final boolean zzac() {
                return ((zzk) this.zza).zzau();
            }

            public final boolean zzad() {
                return ((zzk) this.zza).zzav();
            }

            public final boolean zzae() {
                return ((zzk) this.zza).zzax();
            }

            public final int zzb() {
                return ((zzk) this.zza).zzb();
            }

            public final int zzc() {
                return ((zzk) this.zza).zze();
            }

            public final int zzd() {
                return ((zzk) this.zza).zzi();
            }

            public final long zze() {
                return ((zzk) this.zza).zzm();
            }

            public final long zzf() {
                return ((zzk) this.zza).zzq();
            }

            public final zza zzg() {
                return ((zzk) this.zza).zzu();
            }

            public final zza zzh() {
                zzak();
                zzk.zzb((zzk) this.zza);
                return this;
            }

            public final zza zzi() {
                zzak();
                zzk.zzc((zzk) this.zza);
                return this;
            }

            public final zza zzj() {
                zzak();
                zzk.zzd((zzk) this.zza);
                return this;
            }

            public final zza zzk() {
                zzak();
                zzk.zze((zzk) this.zza);
                return this;
            }

            public final zza zzl() {
                zzak();
                zzk.zzf((zzk) this.zza);
                return this;
            }

            public final zza zzm() {
                zzak();
                zzk.zzg((zzk) this.zza);
                return this;
            }

            public final zza zzn() {
                zzak();
                zzk.zzh((zzk) this.zza);
                return this;
            }

            public final zza zzo() {
                zzak();
                zzk.zzi((zzk) this.zza);
                return this;
            }

            public final zza zzp() {
                zzak();
                zzk.zzj((zzk) this.zza);
                return this;
            }

            public final zza zzq() {
                zzak();
                zzk.zzk((zzk) this.zza);
                return this;
            }

            public final zza zzr() {
                zzak();
                zzk.zzl((zzk) this.zza);
                return this;
            }

            public final zza zzs() {
                zzak();
                zzk.zzm((zzk) this.zza);
                return this;
            }

            public final String zzt() {
                return ((zzk) this.zza).zzz();
            }

            public final String zzu() {
                return ((zzk) this.zza).zzaa();
            }

            public final String zzv() {
                return ((zzk) this.zza).zzad();
            }

            public final String zzw() {
                return ((zzk) this.zza).zzaf();
            }

            public final String zzx() {
                return ((zzk) this.zza).zzaj();
            }

            public final String zzy() {
                return ((zzk) this.zza).zzal();
            }

            public final String zzz() {
                return ((zzk) this.zza).zzan();
            }

            private zza() {
                super(zzk.zzc);
            }

            public final zzf zza(int i4) {
                return ((zzk) this.zza).zza(i4);
            }

            public final zza zzb(Iterable<? extends zzf> iterable) {
                zzak();
                zzk.zzb((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends Integer> iterable) {
                zzak();
                zzk.zzc((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzd(Iterable<String> iterable) {
                zzak();
                zzk.zzd((zzk) this.zza, iterable);
                return this;
            }

            public final zza zze(Iterable<? extends zzo> iterable) {
                zzak();
                zzk.zze((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzf(int i4) {
                zzak();
                zzk.zze((zzk) this.zza, i4);
                return this;
            }

            public final zza zzg(String str) {
                zzak();
                zzk.zzg((zzk) this.zza, str);
                return this;
            }

            public final zza zza(Iterable<? extends zzd> iterable) {
                zzak();
                zzk.zza((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzh(String str) {
                zzak();
                zzk.zzh((zzk) this.zza, str);
                return this;
            }

            public final zza zzi(String str) {
                zzak();
                zzk.zzi((zzk) this.zza, str);
                return this;
            }

            public final zza zzj(String str) {
                zzak();
                zzk.zzj((zzk) this.zza, str);
                return this;
            }

            public final zza zzk(String str) {
                zzak();
                zzk.zzk((zzk) this.zza, str);
                return this;
            }

            public final zza zzl(String str) {
                zzak();
                zzk.zzl((zzk) this.zza, str);
                return this;
            }

            public final zza zzm(String str) {
                zzak();
                zzk.zzm((zzk) this.zza, str);
                return this;
            }

            public final zza zzn(String str) {
                zzak();
                zzk.zzn((zzk) this.zza, str);
                return this;
            }

            public final zza zzo(String str) {
                zzak();
                zzk.zzo((zzk) this.zza, str);
                return this;
            }

            public final zza zzp(String str) {
                zzak();
                zzk.zzp((zzk) this.zza, str);
                return this;
            }

            public final zza zzq(String str) {
                zzak();
                zzk.zzq((zzk) this.zza, str);
                return this;
            }

            public final zza zzr(String str) {
                zzak();
                zzk.zzr((zzk) this.zza, str);
                return this;
            }

            public final zza zzs(String str) {
                zzak();
                zzk.zzs((zzk) this.zza, str);
                return this;
            }

            public final zza zzb(int i4) {
                zzak();
                zzk.zza((zzk) this.zza, i4);
                return this;
            }

            public final zza zzc(int i4) {
                zzak();
                zzk.zzb((zzk) this.zza, i4);
                return this;
            }

            public final zza zzd(int i4) {
                zzak();
                zzk.zzc((zzk) this.zza, i4);
                return this;
            }

            public final zza zze(String str) {
                zzak();
                zzk.zze((zzk) this.zza, str);
                return this;
            }

            public final zza zzf(String str) {
                zzak();
                zzk.zzf((zzk) this.zza, str);
                return this;
            }

            public final zza zzg(int i4) {
                zzak();
                zzk.zzf((zzk) this.zza, i4);
                return this;
            }

            public final zza zza(zzf.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, (zzf) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zzh(long j4) {
                zzak();
                zzk.zzh((zzk) this.zza, j4);
                return this;
            }

            public final zza zzi(int i4) {
                zzak();
                zzk.zzh((zzk) this.zza, i4);
                return this;
            }

            public final zza zzj(long j4) {
                zzak();
                zzk.zzj((zzk) this.zza, j4);
                return this;
            }

            public final zza zzk(long j4) {
                zzak();
                zzk.zzk((zzk) this.zza, j4);
                return this;
            }

            public final zza zzl(long j4) {
                zzak();
                zzk.zzl((zzk) this.zza, j4);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzk.zzb((zzk) this.zza, str);
                return this;
            }

            public final zza zzc(String str) {
                zzak();
                zzk.zzc((zzk) this.zza, str);
                return this;
            }

            public final zza zzd(String str) {
                zzak();
                zzk.zzd((zzk) this.zza, str);
                return this;
            }

            public final zza zze(int i4) {
                zzak();
                zzk.zzd((zzk) this.zza, i4);
                return this;
            }

            public final zza zzf(long j4) {
                zzak();
                zzk.zzf((zzk) this.zza, j4);
                return this;
            }

            public final zza zzg(long j4) {
                zzak();
                zzk.zzg((zzk) this.zza, j4);
                return this;
            }

            public final zza zza(zzo.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, (zzo) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zzh(int i4) {
                zzak();
                zzk.zzg((zzk) this.zza, 1);
                return this;
            }

            public final zza zzi(long j4) {
                zzak();
                zzk.zzi((zzk) this.zza, j4);
                return this;
            }

            public final zza zzj(int i4) {
                zzak();
                zzk.zzi((zzk) this.zza, i4);
                return this;
            }

            public final zzo zzk(int i4) {
                return ((zzk) this.zza).zzb(i4);
            }

            public final zza zzb(long j4) {
                zzak();
                zzk.zzb((zzk) this.zza, j4);
                return this;
            }

            public final zza zzc(long j4) {
                zzak();
                zzk.zzc((zzk) this.zza, j4);
                return this;
            }

            public final zza zzd(long j4) {
                zzak();
                zzk.zzd((zzk) this.zza, j4);
                return this;
            }

            public final zza zze(long j4) {
                zzak();
                zzk.zze((zzk) this.zza, j4);
                return this;
            }

            public final zza zza(zzo zzoVar) {
                zzak();
                zzk.zza((zzk) this.zza, zzoVar);
                return this;
            }

            public final zza zzb(boolean z4) {
                zzak();
                zzk.zzb((zzk) this.zza, z4);
                return this;
            }

            public final zza zzc(boolean z4) {
                zzak();
                zzk.zzc((zzk) this.zza, z4);
                return this;
            }

            public final zza zzd(boolean z4) {
                zzak();
                zzk.zzd((zzk) this.zza, z4);
                return this;
            }

            public final zza zza(zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, zzaVar);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzk.zza((zzk) this.zza, str);
                return this;
            }

            public final zza zza(zzc zzcVar) {
                zzak();
                zzk.zza((zzk) this.zza, zzcVar);
                return this;
            }

            public final zza zza(long j4) {
                zzak();
                zzk.zza((zzk) this.zza, j4);
                return this;
            }

            public final zza zza(boolean z4) {
                zzak();
                zzk.zza((zzk) this.zza, z4);
                return this;
            }

            public final zza zza(int i4, zzf.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, i4, (zzf) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zza(int i4, zzf zzfVar) {
                zzak();
                zzk.zza((zzk) this.zza, i4, zzfVar);
                return this;
            }

            public final zza zza(zzl.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, (zzl) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final zza zza(int i4, zzo zzoVar) {
                zzak();
                zzk.zza((zzk) this.zza, i4, zzoVar);
                return this;
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzc = zzkVar;
            zzjt.zza((Class<zzk>) zzk.class, zzkVar);
        }

        private zzk() {
        }

        private final void zzcp() {
            zzkc<zzf> zzkcVar = this.zzh;
            if (zzkcVar.zzc()) {
                return;
            }
            this.zzh = zzjt.zza(zzkcVar);
        }

        private final void zzcq() {
            zzkc<zzo> zzkcVar = this.zzi;
            if (zzkcVar.zzc()) {
                return;
            }
            this.zzi = zzjt.zza(zzkcVar);
        }

        public static zza zzw() {
            return zzc.zzcc();
        }

        public final int zza() {
            return this.zzbl;
        }

        public final String zzaa() {
            return this.zzaa;
        }

        public final String zzab() {
            return this.zzt;
        }

        public final String zzac() {
            return this.zzv;
        }

        public final String zzad() {
            return this.zzbi;
        }

        public final String zzae() {
            return this.zzax;
        }

        public final String zzaf() {
            return this.zzbk;
        }

        public final String zzag() {
            return this.zzq;
        }

        public final String zzah() {
            return this.zzao;
        }

        public final String zzai() {
            return this.zzah;
        }

        public final String zzaj() {
            return this.zzae;
        }

        public final String zzak() {
            return this.zzad;
        }

        public final String zzal() {
            return this.zzp;
        }

        public final String zzam() {
            return this.zzo;
        }

        public final String zzan() {
            return this.zzy;
        }

        public final String zzao() {
            return this.zzbd;
        }

        public final String zzap() {
            return this.zzr;
        }

        public final List<zzd> zzaq() {
            return this.zzag;
        }

        public final List<zzf> zzar() {
            return this.zzh;
        }

        public final List<zzo> zzas() {
            return this.zzi;
        }

        public final boolean zzat() {
            return this.zzbh;
        }

        public final boolean zzau() {
            return this.zzbj;
        }

        public final boolean zzav() {
            return this.zzz;
        }

        public final boolean zzaw() {
            return this.zzaf;
        }

        public final boolean zzax() {
            return (this.zzf & 16777216) != 0;
        }

        public final boolean zzay() {
            return (this.zze & 33554432) != 0;
        }

        public final boolean zzaz() {
            return (this.zzf & 4194304) != 0;
        }

        public final int zzb() {
            return this.zzai;
        }

        public final boolean zzba() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean zzbb() {
            return (this.zze & 536870912) != 0;
        }

        public final boolean zzbc() {
            return (this.zzf & 131072) != 0;
        }

        public final boolean zzbd() {
            return (this.zzf & 128) != 0;
        }

        public final boolean zzbe() {
            return (this.zzf & 524288) != 0;
        }

        public final boolean zzbf() {
            return (this.zzf & 8388608) != 0;
        }

        public final boolean zzbg() {
            return (this.zze & 524288) != 0;
        }

        public final boolean zzbh() {
            return (this.zze & Integer.MIN_VALUE) != 0;
        }

        public final boolean zzbi() {
            return (this.zzf & 16) != 0;
        }

        public final boolean zzbj() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzbk() {
            return (this.zze & 16384) != 0;
        }

        public final boolean zzbl() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean zzbm() {
            return (this.zze & 131072) != 0;
        }

        public final boolean zzbn() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzbo() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzbp() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzbq() {
            return (this.zzf & 2) != 0;
        }

        public final boolean zzbr() {
            return (this.zze & 8388608) != 0;
        }

        public final boolean zzbs() {
            return (this.zzf & 8192) != 0;
        }

        public final boolean zzbt() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzbu() {
            return (this.zzf & 32768) != 0;
        }

        public final boolean zzbv() {
            return (this.zze & 1024) != 0;
        }

        public final boolean zzbw() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzbx() {
            return (this.zze & 32768) != 0;
        }

        public final int zzc() {
            return this.zzac;
        }

        public final int zzd() {
            return this.zzbo;
        }

        public final int zze() {
            return this.zzh.size();
        }

        public final int zzf() {
            return this.zzg;
        }

        public final int zzg() {
            return this.zzaq;
        }

        public final int zzh() {
            return this.zzs;
        }

        public final int zzi() {
            return this.zzi.size();
        }

        public final long zzj() {
            return this.zzam;
        }

        public final long zzk() {
            return this.zzab;
        }

        public final long zzl() {
            return this.zzau;
        }

        public final long zzm() {
            return this.zzl;
        }

        public final long zzn() {
            return this.zzw;
        }

        public final long zzo() {
            return this.zzn;
        }

        public final long zzp() {
            return this.zzm;
        }

        public final long zzq() {
            return this.zzk;
        }

        public final long zzr() {
            return this.zzbg;
        }

        public final long zzs() {
            return this.zzj;
        }

        public final long zzt() {
            return this.zzx;
        }

        public final zza zzu() {
            zza zzaVar = this.zzbp;
            return zzaVar == null ? zza.zze() : zzaVar;
        }

        public final zzc zzv() {
            zzc zzcVar = this.zzbn;
            return zzcVar == null ? zzc.zzc() : zzcVar;
        }

        public final String zzy() {
            return this.zzar;
        }

        public final String zzz() {
            return this.zzu;
        }

        static /* synthetic */ void zzc(zzk zzkVar, Iterable iterable) {
            zzka zzkaVar = zzkVar.zzat;
            if (!zzkaVar.zzc()) {
                zzkVar.zzat = zzkaVar.zza(zzkaVar.size() << 1);
            }
            zzib.zza(iterable, zzkVar.zzat);
        }

        static /* synthetic */ void zzd(zzk zzkVar, Iterable iterable) {
            zzkc<String> zzkcVar = zzkVar.zzbe;
            if (!zzkcVar.zzc()) {
                zzkVar.zzbe = zzjt.zza(zzkcVar);
            }
            zzib.zza(iterable, zzkVar.zzbe);
        }

        static /* synthetic */ void zze(zzk zzkVar, Iterable iterable) {
            zzkVar.zzcq();
            zzib.zza(iterable, zzkVar.zzi);
        }

        static /* synthetic */ void zzf(zzk zzkVar) {
            zzkVar.zzh = zzjt.zzch();
        }

        static /* synthetic */ void zzg(zzk zzkVar) {
            zzkVar.zze &= -2097153;
            zzkVar.zzad = zzc.zzad;
        }

        static /* synthetic */ void zzh(zzk zzkVar) {
            zzkVar.zze &= -131073;
            zzkVar.zzz = false;
        }

        static /* synthetic */ void zzi(zzk zzkVar) {
            zzkVar.zze &= -33;
            zzkVar.zzn = 0L;
        }

        static /* synthetic */ void zzj(zzk zzkVar) {
            zzkVar.zze &= -17;
            zzkVar.zzm = 0L;
        }

        static /* synthetic */ void zzk(zzk zzkVar) {
            zzkVar.zze &= -65537;
            zzkVar.zzy = zzc.zzy;
        }

        static /* synthetic */ void zzl(zzk zzkVar) {
            zzkVar.zzf &= -8193;
            zzkVar.zzbd = zzc.zzbd;
        }

        static /* synthetic */ void zzm(zzk zzkVar) {
            zzkVar.zze &= -268435457;
            zzkVar.zzal = zzc.zzal;
        }

        static /* synthetic */ void zzn(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 2097152;
            zzkVar.zzad = str;
        }

        static /* synthetic */ void zzo(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 128;
            zzkVar.zzp = str;
        }

        static /* synthetic */ void zzp(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 64;
            zzkVar.zzo = str;
        }

        static /* synthetic */ void zzq(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 65536;
            zzkVar.zzy = str;
        }

        static /* synthetic */ void zzr(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 8192;
            zzkVar.zzbd = str;
        }

        static /* synthetic */ void zzs(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 512;
            zzkVar.zzr = str;
        }

        public final zzf zza(int i4) {
            return this.zzh.get(i4);
        }

        public final zzo zzb(int i4) {
            return this.zzi.get(i4);
        }

        public static zza zza(zzk zzkVar) {
            return zzc.zza(zzkVar);
        }

        static /* synthetic */ void zzb(zzk zzkVar, Iterable iterable) {
            zzkVar.zzcp();
            zzib.zza(iterable, zzkVar.zzh);
        }

        static /* synthetic */ void zzf(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 131072;
            zzkVar.zzbi = str;
        }

        static /* synthetic */ void zze(zzk zzkVar) {
            zzkVar.zze &= Integer.MAX_VALUE;
            zzkVar.zzao = zzc.zzao;
        }

        static /* synthetic */ void zzh(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 524288;
            zzkVar.zzbk = str;
        }

        static /* synthetic */ void zzi(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 256;
            zzkVar.zzq = str;
        }

        static /* synthetic */ void zzj(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= Integer.MIN_VALUE;
            zzkVar.zzao = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, ProtectedSandApp.s("퐭"), new Object[]{ProtectedSandApp.s("포"), ProtectedSandApp.s("폭"), ProtectedSandApp.s("폮"), ProtectedSandApp.s("폯"), zzf.class, ProtectedSandApp.s("폰"), zzo.class, ProtectedSandApp.s("폱"), ProtectedSandApp.s("폲"), ProtectedSandApp.s("폳"), ProtectedSandApp.s("폴"), ProtectedSandApp.s("폵"), ProtectedSandApp.s("폶"), ProtectedSandApp.s("폷"), ProtectedSandApp.s("폸"), ProtectedSandApp.s("폹"), ProtectedSandApp.s("폺"), ProtectedSandApp.s("폻"), ProtectedSandApp.s("폼"), ProtectedSandApp.s("폽"), ProtectedSandApp.s("폾"), ProtectedSandApp.s("폿"), ProtectedSandApp.s("퐀"), ProtectedSandApp.s("퐁"), ProtectedSandApp.s("퐂"), ProtectedSandApp.s("퐃"), ProtectedSandApp.s("퐄"), ProtectedSandApp.s("퐅"), ProtectedSandApp.s("퐆"), ProtectedSandApp.s("퐇"), ProtectedSandApp.s("퐈"), zzd.class, ProtectedSandApp.s("퐉"), ProtectedSandApp.s("퐊"), ProtectedSandApp.s("퐋"), ProtectedSandApp.s("퐌"), ProtectedSandApp.s("퐍"), ProtectedSandApp.s("퐎"), ProtectedSandApp.s("퐏"), ProtectedSandApp.s("퐐"), ProtectedSandApp.s("퐑"), ProtectedSandApp.s("퐒"), ProtectedSandApp.s("퐓"), ProtectedSandApp.s("퐔"), ProtectedSandApp.s("퐕"), ProtectedSandApp.s("퐖"), ProtectedSandApp.s("퐗"), ProtectedSandApp.s("퐘"), ProtectedSandApp.s("퐙"), ProtectedSandApp.s("퐚"), zzga.zzb(), ProtectedSandApp.s("퐛"), ProtectedSandApp.s("퐜"), ProtectedSandApp.s("퐝"), ProtectedSandApp.s("퐞"), ProtectedSandApp.s("퐟"), ProtectedSandApp.s("퐠"), ProtectedSandApp.s("퐡"), ProtectedSandApp.s("퐢"), ProtectedSandApp.s("퐣"), ProtectedSandApp.s("퐤"), ProtectedSandApp.s("퐥"), ProtectedSandApp.s("퐦"), ProtectedSandApp.s("퐧"), ProtectedSandApp.s("퐨"), ProtectedSandApp.s("퐩"), ProtectedSandApp.s("퐪"), ProtectedSandApp.s("퐫"), ProtectedSandApp.s("퐬")});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzk> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzk.class) {
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

        static /* synthetic */ void zzb(zzk zzkVar) {
            zzkVar.zze &= -262145;
            zzkVar.zzaa = zzc.zzaa;
        }

        static /* synthetic */ void zzd(zzk zzkVar) {
            zzkVar.zze &= -257;
            zzkVar.zzq = zzc.zzq;
        }

        static /* synthetic */ void zzf(zzk zzkVar, int i4) {
            zzkVar.zzf |= 8388608;
            zzkVar.zzbo = i4;
        }

        static /* synthetic */ void zzg(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 128;
            zzkVar.zzax = str;
        }

        static /* synthetic */ void zzk(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 16384;
            zzkVar.zzbf = str;
        }

        static /* synthetic */ void zzl(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 16777216;
            zzkVar.zzah = str;
        }

        static /* synthetic */ void zzm(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 4194304;
            zzkVar.zzae = str;
        }

        static /* synthetic */ void zzh(zzk zzkVar, long j4) {
            zzkVar.zze |= 16;
            zzkVar.zzm = j4;
        }

        static /* synthetic */ void zzi(zzk zzkVar, long j4) {
            zzkVar.zze |= 4;
            zzkVar.zzk = j4;
        }

        static /* synthetic */ void zzj(zzk zzkVar, long j4) {
            zzkVar.zzf |= 32768;
            zzkVar.zzbg = j4;
        }

        static /* synthetic */ void zzc(zzk zzkVar) {
            zzkVar.zzag = zzjt.zzch();
        }

        static /* synthetic */ void zze(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 8192;
            zzkVar.zzv = str;
        }

        static /* synthetic */ void zzf(zzk zzkVar, long j4) {
            zzkVar.zze |= 16384;
            zzkVar.zzw = j4;
        }

        static /* synthetic */ void zzb(zzk zzkVar, int i4) {
            zzkVar.zzcq();
            zzkVar.zzi.remove(i4);
        }

        static /* synthetic */ void zzc(zzk zzkVar, int i4) {
            zzkVar.zzf |= 1048576;
            zzkVar.zzbl = i4;
        }

        static /* synthetic */ void zzg(zzk zzkVar, long j4) {
            zzkVar.zze |= 32;
            zzkVar.zzn = j4;
        }

        static /* synthetic */ void zzh(zzk zzkVar, int i4) {
            zzkVar.zzf |= 2;
            zzkVar.zzaq = i4;
        }

        static /* synthetic */ void zzi(zzk zzkVar, int i4) {
            zzkVar.zze |= 1024;
            zzkVar.zzs = i4;
        }

        static /* synthetic */ void zzk(zzk zzkVar, long j4) {
            zzkVar.zze |= 2;
            zzkVar.zzj = j4;
        }

        static /* synthetic */ void zzl(zzk zzkVar, long j4) {
            zzkVar.zze |= 32768;
            zzkVar.zzx = j4;
        }

        static /* synthetic */ void zzd(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 2048;
            zzkVar.zzt = str;
        }

        static /* synthetic */ void zzb(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 4096;
            zzkVar.zzu = str;
        }

        static /* synthetic */ void zzc(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 262144;
            zzkVar.zzaa = str;
        }

        static /* synthetic */ void zze(zzk zzkVar, int i4) {
            zzkVar.zze |= 1048576;
            zzkVar.zzac = i4;
        }

        static /* synthetic */ void zzg(zzk zzkVar, int i4) {
            zzkVar.zze |= 1;
            zzkVar.zzg = 1;
        }

        static /* synthetic */ void zzd(zzk zzkVar, int i4) {
            zzkVar.zze |= 33554432;
            zzkVar.zzai = i4;
        }

        static /* synthetic */ void zze(zzk zzkVar, long j4) {
            zzkVar.zze |= 8;
            zzkVar.zzl = j4;
        }

        static /* synthetic */ void zzb(zzk zzkVar, long j4) {
            zzkVar.zze |= 536870912;
            zzkVar.zzam = j4;
        }

        static /* synthetic */ void zzc(zzk zzkVar, long j4) {
            zzkVar.zze |= 524288;
            zzkVar.zzab = j4;
        }

        static /* synthetic */ void zzd(zzk zzkVar, long j4) {
            zzkVar.zzf |= 16;
            zzkVar.zzau = j4;
        }

        static /* synthetic */ void zzb(zzk zzkVar, boolean z4) {
            zzkVar.zzf |= 262144;
            zzkVar.zzbj = z4;
        }

        static /* synthetic */ void zzc(zzk zzkVar, boolean z4) {
            zzkVar.zze |= 131072;
            zzkVar.zzz = z4;
        }

        static /* synthetic */ void zzd(zzk zzkVar, boolean z4) {
            zzkVar.zze |= 8388608;
            zzkVar.zzaf = z4;
        }

        static /* synthetic */ void zza(zzk zzkVar, Iterable iterable) {
            zzkc<zzd> zzkcVar = zzkVar.zzag;
            if (!zzkcVar.zzc()) {
                zzkVar.zzag = zzjt.zza(zzkcVar);
            }
            zzib.zza(iterable, zzkVar.zzag);
        }

        static /* synthetic */ void zza(zzk zzkVar, zzf zzfVar) {
            zzfVar.getClass();
            zzkVar.zzcp();
            zzkVar.zzh.add(zzfVar);
        }

        static /* synthetic */ void zza(zzk zzkVar, zzo zzoVar) {
            zzoVar.getClass();
            zzkVar.zzcq();
            zzkVar.zzi.add(zzoVar);
        }

        static /* synthetic */ void zza(zzk zzkVar, int i4) {
            zzkVar.zzcp();
            zzkVar.zzh.remove(i4);
        }

        static /* synthetic */ void zza(zzk zzkVar, zza zzaVar) {
            zzaVar.getClass();
            zzkVar.zzbp = zzaVar;
            zzkVar.zzf |= 16777216;
        }

        static /* synthetic */ void zza(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 4;
            zzkVar.zzar = str;
        }

        static /* synthetic */ void zza(zzk zzkVar, zzc zzcVar) {
            zzcVar.getClass();
            zzkVar.zzbn = zzcVar;
            zzkVar.zzf |= 4194304;
        }

        static /* synthetic */ void zza(zzk zzkVar, long j4) {
            zzkVar.zzf |= 32;
            zzkVar.zzav = j4;
        }

        static /* synthetic */ void zza(zzk zzkVar, boolean z4) {
            zzkVar.zzf |= 65536;
            zzkVar.zzbh = z4;
        }

        static /* synthetic */ void zza(zzk zzkVar, int i4, zzf zzfVar) {
            zzfVar.getClass();
            zzkVar.zzcp();
            zzkVar.zzh.set(i4, zzfVar);
        }

        static /* synthetic */ void zza(zzk zzkVar, zzl zzlVar) {
            zzlVar.getClass();
            zzkVar.zzas = zzlVar;
            zzkVar.zzf |= 8;
        }

        static /* synthetic */ void zza(zzk zzkVar, int i4, zzo zzoVar) {
            zzoVar.getClass();
            zzkVar.zzcq();
            zzkVar.zzi.set(i4, zzoVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzl extends zzjt<zzl, zza> implements zzle {
        private static final zzl zzc;
        private static volatile zzll<zzl> zzd;
        private int zze;
        private int zzf = 1;
        private zzkc<zzg> zzg = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzl, zza> implements zzle {
            public final zza zza(zzg.zza zzaVar) {
                zzak();
                zzl.zza((zzl) this.zza, (zzg) ((zzjt) zzaVar.zzai()));
                return this;
            }

            private zza() {
                super(zzl.zzc);
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zzb implements zzjy {
            zza(1),
            zzb(2);

            private final int zzd;

            zzb(int i4) {
                this.zzd = i4;
            }

            public static zzjx zzb() {
                return zzgc.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return ProtectedSandApp.s("퐰") + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("퐱") + this.zzd + ProtectedSandApp.s("퐲") + name() + m0.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzd;
            }

            public static zzb zza(int i4) {
                if (i4 == 1) {
                    return zza;
                }
                if (i4 != 2) {
                    return null;
                }
                return zzb;
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzc = zzlVar;
            zzjt.zza((Class<zzl>) zzl.class, zzlVar);
        }

        private zzl() {
        }

        public static zza zza() {
            return zzc.zzcc();
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("퐳"), ProtectedSandApp.s("퐴"), zzb.zzb(), ProtectedSandApp.s("퐵"), zzg.class};
                    return zzjt.zza(zzc, ProtectedSandApp.s("퐶"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzl> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzl.class) {
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

        static /* synthetic */ void zza(zzl zzlVar, zzg zzgVar) {
            zzgVar.getClass();
            zzkc<zzg> zzkcVar = zzlVar.zzg;
            if (!zzkcVar.zzc()) {
                zzlVar.zzg = zzjt.zza(zzkcVar);
            }
            zzlVar.zzg.add(zzgVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzm extends zzjt<zzm, zza> implements zzle {
        private static final zzm zzc;
        private static volatile zzll<zzm> zzd;
        private zzjz zze = zzjt.zzcg();
        private zzjz zzf = zzjt.zzcg();
        private zzkc<zze> zzg = zzjt.zzch();
        private zzkc<zzn> zzh = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzm, zza> implements zzle {
            public final zza zza(Iterable<? extends zze> iterable) {
                zzak();
                zzm.zza((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzb(Iterable<? extends Long> iterable) {
                zzak();
                zzm.zzb((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends zzn> iterable) {
                zzak();
                zzm.zzc((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzd(Iterable<? extends Long> iterable) {
                zzak();
                zzm.zzd((zzm) this.zza, iterable);
                return this;
            }

            private zza() {
                super(zzm.zzc);
            }

            public final zza zza() {
                zzak();
                zzm.zza((zzm) this.zza);
                return this;
            }

            public final zza zzb() {
                zzak();
                zzm.zzb((zzm) this.zza);
                return this;
            }

            public final zza zzc() {
                zzak();
                zzm.zzc((zzm) this.zza);
                return this;
            }

            public final zza zzd() {
                zzak();
                zzm.zzd((zzm) this.zza);
                return this;
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzc = zzmVar;
            zzjt.zza((Class<zzm>) zzm.class, zzmVar);
        }

        private zzm() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static zzm zzg() {
            return zzc;
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final int zzc() {
            return this.zzh.size();
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final List<zze> zzh() {
            return this.zzg;
        }

        public final List<Long> zzi() {
            return this.zzf;
        }

        public final List<zzn> zzj() {
            return this.zzh;
        }

        public final List<Long> zzk() {
            return this.zze;
        }

        static /* synthetic */ void zzb(zzm zzmVar, Iterable iterable) {
            zzjz zzjzVar = zzmVar.zzf;
            if (!zzjzVar.zzc()) {
                zzmVar.zzf = zzjt.zza(zzjzVar);
            }
            zzib.zza(iterable, zzmVar.zzf);
        }

        static /* synthetic */ void zzc(zzm zzmVar, Iterable iterable) {
            zzkc<zzn> zzkcVar = zzmVar.zzh;
            if (!zzkcVar.zzc()) {
                zzmVar.zzh = zzjt.zza(zzkcVar);
            }
            zzib.zza(iterable, zzmVar.zzh);
        }

        static /* synthetic */ void zzd(zzm zzmVar, Iterable iterable) {
            zzjz zzjzVar = zzmVar.zze;
            if (!zzjzVar.zzc()) {
                zzmVar.zze = zzjt.zza(zzjzVar);
            }
            zzib.zza(iterable, zzmVar.zze);
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("퐷"), ProtectedSandApp.s("퐸"), ProtectedSandApp.s("퐹"), zze.class, ProtectedSandApp.s("퐺"), zzn.class};
                    return zzjt.zza(zzc, ProtectedSandApp.s("퐻"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzm> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzm.class) {
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

        static /* synthetic */ void zzb(zzm zzmVar) {
            zzmVar.zzf = zzjt.zzcg();
        }

        static /* synthetic */ void zzc(zzm zzmVar) {
            zzmVar.zzh = zzjt.zzch();
        }

        static /* synthetic */ void zzd(zzm zzmVar) {
            zzmVar.zze = zzjt.zzcg();
        }

        static /* synthetic */ void zza(zzm zzmVar, Iterable iterable) {
            zzkc<zze> zzkcVar = zzmVar.zzg;
            if (!zzkcVar.zzc()) {
                zzmVar.zzg = zzjt.zza(zzkcVar);
            }
            zzib.zza(iterable, zzmVar.zzg);
        }

        static /* synthetic */ void zza(zzm zzmVar) {
            zzmVar.zzg = zzjt.zzch();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzn extends zzjt<zzn, zza> implements zzle {
        private static final zzn zzc;
        private static volatile zzll<zzn> zzd;
        private int zze;
        private int zzf;
        private zzjz zzg = zzjt.zzcg();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzn, zza> implements zzle {
            public final zza zza(Iterable<? extends Long> iterable) {
                zzak();
                zzn.zza((zzn) this.zza, iterable);
                return this;
            }

            private zza() {
                super(zzn.zzc);
            }

            public final zza zza(int i4) {
                zzak();
                zzn.zza((zzn) this.zza, i4);
                return this;
            }
        }

        static {
            zzn zznVar = new zzn();
            zzc = zznVar;
            zzjt.zza((Class<zzn>) zzn.class, zznVar);
        }

        private zzn() {
        }

        public static zza zzc() {
            return zzc.zzcc();
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final List<Long> zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }

        public final long zza(int i4) {
            return this.zzg.zzb(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("퐼"), ProtectedSandApp.s("퐽"), ProtectedSandApp.s("퐾")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("퐿"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzn> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzn.class) {
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

        static /* synthetic */ void zza(zzn zznVar, Iterable iterable) {
            zzjz zzjzVar = zznVar.zzg;
            if (!zzjzVar.zzc()) {
                zznVar.zzg = zzjt.zza(zzjzVar);
            }
            zzib.zza(iterable, zznVar.zzg);
        }

        static /* synthetic */ void zza(zzn zznVar, int i4) {
            zznVar.zze |= 1;
            zznVar.zzf = i4;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public static final class zzo extends zzjt<zzo, zza> implements zzle {
        private static final zzo zzc;
        private static volatile zzll<zzo> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzo, zza> implements zzle {
            public final zza zza() {
                zzak();
                zzo.zza((zzo) this.zza);
                return this;
            }

            public final zza zzb() {
                zzak();
                zzo.zzb((zzo) this.zza);
                return this;
            }

            public final zza zzc() {
                zzak();
                zzo.zzc((zzo) this.zza);
                return this;
            }

            private zza() {
                super(zzo.zzc);
            }

            public final zza zza(double d5) {
                zzak();
                zzo.zza((zzo) this.zza, d5);
                return this;
            }

            public final zza zzb(long j4) {
                zzak();
                zzo.zzb((zzo) this.zza, j4);
                return this;
            }

            public final zza zza(long j4) {
                zzak();
                zzo.zza((zzo) this.zza, j4);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzo.zzb((zzo) this.zza, str);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzo.zza((zzo) this.zza, str);
                return this;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzc = zzoVar;
            zzjt.zza((Class<zzo>) zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public final double zza() {
            return this.zzk;
        }

        public final float zzb() {
            return this.zzj;
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzf;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzh;
        }

        public final boolean zzi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 4) != 0;
        }

        static /* synthetic */ void zzb(zzo zzoVar) {
            zzoVar.zze &= -9;
            zzoVar.zzi = 0L;
        }

        static /* synthetic */ void zzc(zzo zzoVar) {
            zzoVar.zze &= -5;
            zzoVar.zzh = zzc.zzh;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int i4, Object obj, Object obj2) {
            switch (zzfx.zza[i4 - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza();
                case 3:
                    Object[] objArr = {ProtectedSandApp.s("푀"), ProtectedSandApp.s("푁"), ProtectedSandApp.s("푂"), ProtectedSandApp.s("푃"), ProtectedSandApp.s("푄"), ProtectedSandApp.s("푅"), ProtectedSandApp.s("푆")};
                    return zzjt.zza(zzc, ProtectedSandApp.s("푇"), objArr);
                case 4:
                    return zzc;
                case 5:
                    zzll<zzo> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzo.class) {
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

        static /* synthetic */ void zzb(zzo zzoVar, long j4) {
            zzoVar.zze |= 1;
            zzoVar.zzf = j4;
        }

        static /* synthetic */ void zzb(zzo zzoVar, String str) {
            str.getClass();
            zzoVar.zze |= 4;
            zzoVar.zzh = str;
        }

        static /* synthetic */ void zza(zzo zzoVar) {
            zzoVar.zze &= -33;
            zzoVar.zzk = p.f60679p;
        }

        static /* synthetic */ void zza(zzo zzoVar, double d5) {
            zzoVar.zze |= 32;
            zzoVar.zzk = d5;
        }

        static /* synthetic */ void zza(zzo zzoVar, long j4) {
            zzoVar.zze |= 8;
            zzoVar.zzi = j4;
        }

        static /* synthetic */ void zza(zzo zzoVar, String str) {
            str.getClass();
            zzoVar.zze |= 2;
            zzoVar.zzg = str;
        }
    }
}
