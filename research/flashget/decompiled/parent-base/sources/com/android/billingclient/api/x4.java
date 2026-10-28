package com.android.billingclient.api;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzka;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzko;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzkw;
import com.google.android.gms.internal.play_billing.zzld;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzlk;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class x4 implements j4 {

    /* renamed from: b, reason: collision with root package name */
    private zzkg f40774b;

    /* renamed from: c, reason: collision with root package name */
    private final z4 f40775c;

    x4(Context context, zzkg zzkgVar) {
        this.f40775c = new z4(context);
        this.f40774b = zzkgVar;
    }

    private final void o(@androidx.annotation.q0 zzjl zzjlVar, zzkg zzkgVar) {
        if (zzjlVar == null) {
            return;
        }
        try {
            zzku zza = zzkw.zza();
            zza.zzp(zzkgVar);
            zza.zza(zzjlVar);
            this.f40775c.a((zzkw) zza.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    private final void p(@androidx.annotation.q0 zzjp zzjpVar, zzkg zzkgVar) {
        if (zzjpVar == null) {
            return;
        }
        try {
            zzku zza = zzkw.zza();
            zza.zzp(zzkgVar);
            zza.zzb(zzjpVar);
            this.f40775c.a((zzkw) zza.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void a(zzlg zzlgVar) {
        try {
            z4 z4Var = this.f40775c;
            zzku zza = zzkw.zza();
            zza.zzp(this.f40774b);
            zza.zzq(zzlgVar);
            z4Var.a((zzkw) zza.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void b(zzjx zzjxVar) {
        try {
            zzku zza = zzkw.zza();
            zza.zzp(this.f40774b);
            zza.zzc(zzjxVar);
            this.f40775c.a((zzkw) zza.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void c(zzjp zzjpVar, long j4, boolean z4) {
        zzkg zzkgVar;
        try {
            zzjn zzjnVar = (zzjn) zzjpVar.zzq();
            zzko zzkoVar = (zzko) zzjpVar.zzc().zzq();
            zzkoVar.zza(z4);
            zzjnVar.zzc(zzkoVar);
            zzjp zzjpVar2 = (zzjp) zzjnVar.zzi();
            if (j4 == 0) {
                zzkgVar = this.f40774b;
            } else {
                zzke zzkeVar = (zzke) this.f40774b.zzq();
                zzkeVar.zze(j4);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            p(zzjpVar2, zzkgVar);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void d(@androidx.annotation.q0 zzlk zzlkVar) {
        if (zzlkVar == null) {
            return;
        }
        try {
            zzku zza = zzkw.zza();
            zza.zzp(this.f40774b);
            zza.zzr(zzlkVar);
            this.f40775c.a((zzkw) zza.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void e(@androidx.annotation.q0 y yVar, long j4) {
        zzkg zzkgVar;
        try {
            zzka zza = zzkd.zza();
            zza.zze(4);
            zza.zza(zzjz.zze);
            if (yVar != null) {
                zzjq zza2 = zzju.zza();
                zza2.zzp(yVar.c());
                zza2.zzb(yVar.a());
                zza.zzb(zza2);
            }
            zzku zza3 = zzkw.zza();
            if (j4 == 0) {
                zzkgVar = this.f40774b;
            } else {
                zzke zzkeVar = (zzke) this.f40774b.zzq();
                zzkeVar.zze(j4);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            zza3.zzp(zzkgVar);
            zza3.zzd(zza);
            this.f40775c.a((zzkw) zza3.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void f(zzjl zzjlVar, int i4, long j4, boolean z4) {
        zzkg zzkgVar;
        try {
            zzke zzkeVar = (zzke) this.f40774b.zzq();
            zzkeVar.zzc(i4);
            this.f40774b = (zzkg) zzkeVar.zzi();
            zzjj zzjjVar = (zzjj) zzjlVar.zzq();
            zzko zzkoVar = (zzko) zzjlVar.zze().zzq();
            zzkoVar.zza(z4);
            zzjjVar.zzd(zzkoVar);
            zzjl zzjlVar2 = (zzjl) zzjjVar.zzi();
            if (j4 == 0) {
                zzkgVar = this.f40774b;
            } else {
                zzke zzkeVar2 = (zzke) this.f40774b.zzq();
                zzkeVar2.zze(j4);
                zzkgVar = (zzkg) zzkeVar2.zzi();
            }
            o(zzjlVar2, zzkgVar);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void g(@androidx.annotation.q0 zzjp zzjpVar, int i4) {
        try {
            zzke zzkeVar = (zzke) this.f40774b.zzq();
            zzkeVar.zzc(i4);
            this.f40774b = (zzkg) zzkeVar.zzi();
            h(zzjpVar);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void h(@androidx.annotation.q0 zzjp zzjpVar) {
        try {
            p(zzjpVar, this.f40774b);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void i(zzjl zzjlVar, int i4, long j4) {
        try {
            zzke zzkeVar = (zzke) this.f40774b.zzq();
            zzkeVar.zzc(i4);
            zzkg zzkgVar = (zzkg) zzkeVar.zzi();
            this.f40774b = zzkgVar;
            if (j4 != 0) {
                zzke zzkeVar2 = (zzke) zzkgVar.zzq();
                zzkeVar2.zze(j4);
                zzkgVar = (zzkg) zzkeVar2.zzi();
            }
            o(zzjlVar, zzkgVar);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void j(long j4) {
        zzkg zzkgVar;
        try {
            zzka zza = zzkd.zza();
            zza.zze(4);
            zza.zza(zzjz.zzf);
            zzkd zzkdVar = (zzkd) zza.zzi();
            zzku zza2 = zzkw.zza();
            if (j4 == 0) {
                zzkgVar = this.f40774b;
            } else {
                zzke zzkeVar = (zzke) this.f40774b.zzq();
                zzkeVar.zze(j4);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            zza2.zzp(zzkgVar);
            zza2.zze(zzkdVar);
            this.f40775c.a((zzkw) zza2.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void k(zzld zzldVar) {
        try {
            zzku zza = zzkw.zza();
            zza.zzp(this.f40774b);
            zzka zza2 = zzkd.zza();
            zza2.zzc(ProtectedSandApp.s("\u0602"));
            zza2.zze(2);
            zza2.zzd(zzldVar);
            zza.zzd(zza2);
            this.f40775c.a((zzkw) zza.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void l(@androidx.annotation.q0 zzjl zzjlVar, int i4) {
        try {
            zzke zzkeVar = (zzke) this.f40774b.zzq();
            zzkeVar.zzc(i4);
            this.f40774b = (zzkg) zzkeVar.zzi();
            m(zzjlVar);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void m(@androidx.annotation.q0 zzjl zzjlVar) {
        try {
            o(zzjlVar, this.f40774b);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }

    @Override // com.android.billingclient.api.j4
    public final void n(zzjl zzjlVar, long j4, boolean z4) {
        zzkg zzkgVar;
        try {
            zzjj zzjjVar = (zzjj) zzjlVar.zzq();
            zzko zzkoVar = (zzko) zzjlVar.zze().zzq();
            zzkoVar.zza(z4);
            zzjjVar.zzd(zzkoVar);
            zzjl zzjlVar2 = (zzjl) zzjjVar.zzi();
            if (j4 == 0) {
                zzkgVar = this.f40774b;
            } else {
                zzke zzkeVar = (zzke) this.f40774b.zzq();
                zzkeVar.zze(j4);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            o(zzjlVar2, zzkgVar);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("\u0600"), ProtectedSandApp.s("\u0601"), th);
        }
    }
}
