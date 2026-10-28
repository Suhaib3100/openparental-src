package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.view.C1434k;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import org.apache.commons.lang3.time.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzni implements zznj {
    private static final zzhj<Long> zza;
    private static final zzhj<String> zzaa;
    private static final zzhj<Long> zzab;
    private static final zzhj<Long> zzac;
    private static final zzhj<Long> zzad;
    private static final zzhj<String> zzae;
    private static final zzhj<Long> zzaf;
    private static final zzhj<String> zzag;
    private static final zzhj<Long> zzah;
    private static final zzhj<String> zzai;
    private static final zzhj<String> zzaj;
    private static final zzhj<String> zzak;
    private static final zzhj<Long> zzal;
    private static final zzhj<Long> zzam;
    private static final zzhj<Long> zzan;
    private static final zzhj<Long> zzao;
    private static final zzhj<Long> zzap;
    private static final zzhj<Long> zzaq;
    private static final zzhj<Long> zzar;
    private static final zzhj<Long> zzas;
    private static final zzhj<Long> zzat;
    private static final zzhj<Long> zzau;
    private static final zzhj<Long> zzav;
    private static final zzhj<Long> zzaw;
    private static final zzhj<Long> zzax;
    private static final zzhj<Long> zzay;
    private static final zzhj<Long> zzaz;
    private static final zzhj<Long> zzb;
    private static final zzhj<Long> zzba;
    private static final zzhj<Long> zzbb;
    private static final zzhj<String> zzbc;
    private static final zzhj<Long> zzbd;
    private static final zzhj<String> zzbe;
    private static final zzhj<Boolean> zzc;
    private static final zzhj<Long> zzd;
    private static final zzhj<Long> zze;
    private static final zzhj<String> zzf;
    private static final zzhj<String> zzg;
    private static final zzhj<Long> zzh;
    private static final zzhj<Long> zzi;
    private static final zzhj<String> zzj;
    private static final zzhj<Long> zzk;
    private static final zzhj<String> zzl;
    private static final zzhj<Long> zzm;
    private static final zzhj<Long> zzn;
    private static final zzhj<Long> zzo;
    private static final zzhj<Long> zzp;
    private static final zzhj<Long> zzq;
    private static final zzhj<Long> zzr;
    private static final zzhj<Long> zzs;
    private static final zzhj<Long> zzt;
    private static final zzhj<Long> zzu;
    private static final zzhj<Long> zzv;
    private static final zzhj<Long> zzw;
    private static final zzhj<Long> zzx;
    private static final zzhj<Long> zzy;
    private static final zzhj<Boolean> zzz;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("햘"))).zzb().zza();
        zza = zza2.zza(ProtectedSandApp.s("햙"), i0.f35991f);
        zzb = zza2.zza(ProtectedSandApp.s("햚"), e.f86241c);
        zzc = zza2.zza(ProtectedSandApp.s("햛"), true);
        zzd = zza2.zza(ProtectedSandApp.s("햜"), 100L);
        zze = zza2.zza(ProtectedSandApp.s("햝"), 86400000L);
        zza2.zza(ProtectedSandApp.s("햞"), ProtectedSandApp.s("햟"));
        zzf = zza2.zza(ProtectedSandApp.s("햠"), ProtectedSandApp.s("햡"));
        String s4 = ProtectedSandApp.s("햢");
        String s5 = ProtectedSandApp.s("햣");
        zzg = zza2.zza(s4, s5);
        zzh = zza2.zza(ProtectedSandApp.s("햤"), 1000L);
        zzi = zza2.zza(ProtectedSandApp.s("향"), e.f86241c);
        zzj = zza2.zza(ProtectedSandApp.s("햦"), ProtectedSandApp.s("햧"));
        zza2.zza(ProtectedSandApp.s("햨"), 0L);
        zzk = zza2.zza(ProtectedSandApp.s("햩"), 605000L);
        zzl = zza2.zza(ProtectedSandApp.s("햪"), ProtectedSandApp.s("햫"));
        zzm = zza2.zza(ProtectedSandApp.s("햬"), 4L);
        zzn = zza2.zza(ProtectedSandApp.s("햭"), 1L);
        zzo = zza2.zza(ProtectedSandApp.s("햮"), 500L);
        zzp = zza2.zza(ProtectedSandApp.s("햯"), 100000L);
        zzq = zza2.zza(ProtectedSandApp.s("햰"), 50L);
        zzr = zza2.zza(ProtectedSandApp.s("햱"), 200L);
        zzs = zza2.zza(ProtectedSandApp.s("햲"), 27L);
        zzt = zza2.zza(ProtectedSandApp.s("햳"), 0L);
        zzu = zza2.zza(ProtectedSandApp.s("햴"), 0L);
        zzv = zza2.zza(ProtectedSandApp.s("햵"), 7L);
        zzw = zza2.zza(ProtectedSandApp.s("햶"), 60000L);
        zzx = zza2.zza(ProtectedSandApp.s("햷"), 500L);
        zzy = zza2.zza(ProtectedSandApp.s("햸"), 86400000L);
        zzz = zza2.zza(ProtectedSandApp.s("햹"), true);
        zzaa = zza2.zza(ProtectedSandApp.s("햺"), ProtectedSandApp.s("햻"));
        zzab = zza2.zza(ProtectedSandApp.s("햼"), i0.f35991f);
        zzac = zza2.zza(ProtectedSandApp.s("햽"), 604800000L);
        zza2.zza(ProtectedSandApp.s("햾"), e.f86241c);
        zzad = zza2.zza(ProtectedSandApp.s("햿"), C1434k.f30360a);
        zza2.zza(ProtectedSandApp.s("헀"), ProtectedSandApp.s("헁"));
        zzae = zza2.zza(ProtectedSandApp.s("헂"), ProtectedSandApp.s("헃"));
        zzaf = zza2.zza(ProtectedSandApp.s("헄"), 86400000L);
        zzag = zza2.zza(ProtectedSandApp.s("헅"), ProtectedSandApp.s("헆"));
        zzah = zza2.zza(ProtectedSandApp.s("헇"), 1209600000L);
        zzai = zza2.zza(ProtectedSandApp.s("허"), ProtectedSandApp.s("헉"));
        zzaj = zza2.zza(ProtectedSandApp.s("헊"), "");
        zzak = zza2.zza(ProtectedSandApp.s("헋"), s5);
        zzal = zza2.zza(ProtectedSandApp.s("헌"), 604800000L);
        zzam = zza2.zza(ProtectedSandApp.s("헍"), 7200000L);
        zzan = zza2.zza(ProtectedSandApp.s("헎"), 43200000L);
        zzao = zza2.zza(ProtectedSandApp.s("헏"), 15000L);
        zzap = zza2.zza(ProtectedSandApp.s("헐"), e.f86241c);
        zzaq = zza2.zza(ProtectedSandApp.s("헑"), PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        zzar = zza2.zza(ProtectedSandApp.s("헒"), 100L);
        zzas = zza2.zza(ProtectedSandApp.s("헓"), 500L);
        zzat = zza2.zza(ProtectedSandApp.s("헔"), 1000L);
        zzau = zza2.zza(ProtectedSandApp.s("헕"), 1000L);
        zzav = zza2.zza(ProtectedSandApp.s("헖"), 100000L);
        zzaw = zza2.zza(ProtectedSandApp.s("헗"), 50000L);
        zzax = zza2.zza(ProtectedSandApp.s("험"), 518400000L);
        zzay = zza2.zza(ProtectedSandApp.s("헙"), 10L);
        zzaz = zza2.zza(ProtectedSandApp.s("헚"), PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        zzba = zza2.zza(ProtectedSandApp.s("헛"), 6L);
        zzbb = zza2.zza(ProtectedSandApp.s("헜"), 1800000L);
        zzbc = zza2.zza(ProtectedSandApp.s("헝"), ProtectedSandApp.s("헞"));
        zzbd = zza2.zza(ProtectedSandApp.s("헟"), e.f86241c);
        zzbe = zza2.zza(ProtectedSandApp.s("헠"), ProtectedSandApp.s("헡"));
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zza() {
        return zza.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzaa() {
        return zzam.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzab() {
        return zzan.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzac() {
        return zzao.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzad() {
        return zzap.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzae() {
        return zzaq.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzaf() {
        return zzar.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzag() {
        return zzas.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzah() {
        return zzat.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzai() {
        return zzau.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzaj() {
        return zzav.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzak() {
        return zzaw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzal() {
        return zzax.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzam() {
        return zzay.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzan() {
        return zzaz.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzao() {
        return zzba.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzap() {
        return zzbb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzaq() {
        return zzbd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzar() {
        return zzf.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzas() {
        return zzg.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzat() {
        return zzj.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzau() {
        return zzl.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzav() {
        return zzaa.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzaw() {
        return zzae.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzax() {
        return zzag.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzay() {
        return zzai.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzaz() {
        return zzaj.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzb() {
        return zzb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzba() {
        return zzak.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzbb() {
        return zzbc.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzbc() {
        return zzbe.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzbd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzbe() {
        return zzz.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzd() {
        return zze.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zze() {
        return zzh.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzf() {
        return zzi.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzg() {
        return zzk.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzh() {
        return zzm.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzi() {
        return zzn.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzj() {
        return zzo.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzk() {
        return zzp.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzl() {
        return zzq.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzm() {
        return zzr.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzn() {
        return zzs.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzo() {
        return zzt.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzp() {
        return zzu.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzq() {
        return zzv.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzr() {
        return zzw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzs() {
        return zzx.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzt() {
        return zzy.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzu() {
        return zzab.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzv() {
        return zzac.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzw() {
        return zzad.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzx() {
        return zzaf.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzy() {
        return zzah.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzz() {
        return zzal.zza().longValue();
    }
}
