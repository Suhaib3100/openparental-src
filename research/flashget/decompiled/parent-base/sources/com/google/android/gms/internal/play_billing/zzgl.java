package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzgl;
import com.google.android.gms.internal.play_billing.zzgp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public class zzgl<MessageType extends zzgp<MessageType, BuilderType>, BuilderType extends zzgl<MessageType, BuilderType>> extends zzez<MessageType, BuilderType> {
    protected zzgp zza;
    private final zzgp zzb;

    protected zzgl(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzF()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("흍"));
        }
        this.zza = messagetype.zzs();
    }

    private static void zza(Object obj, Object obj2) {
        zzhy.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzez
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgl clone() {
        zzgl zzglVar = (zzgl) this.zzb.zzd(5, null, null);
        zzglVar.zza = zzk();
        return zzglVar;
    }

    public final zzgl zzh(zzgp zzgpVar) {
        zzgp zzgpVar2 = this.zzb;
        if (!zzgpVar2.getClass().isInstance(zzgpVar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("흎"));
        }
        if (!zzgpVar2.equals(zzgpVar)) {
            if (!this.zza.zzF()) {
                zzn();
            }
            zza(this.zza, zzgpVar);
        }
        return this;
    }

    public final MessageType zzi() {
        MessageType zzk = zzk();
        if (zzk.zzo()) {
            return zzk;
        }
        throw new zzip(zzk);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhq
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzF()) {
            return (MessageType) this.zza;
        }
        this.zza.zzz();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhs
    public final /* bridge */ /* synthetic */ zzhr zzl() {
        throw null;
    }

    protected final void zzm() {
        if (this.zza.zzF()) {
            return;
        }
        zzn();
    }

    protected void zzn() {
        zzgp zzs = this.zzb.zzs();
        zza(zzs, this.zza);
        this.zza = zzs;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhs
    public final boolean zzo() {
        boolean zzc;
        zzc = zzgp.zzc(this.zza, false);
        return zzc;
    }
}
