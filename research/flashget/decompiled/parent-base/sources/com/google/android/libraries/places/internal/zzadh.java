package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzadh;
import com.google.android.libraries.places.internal.zzadk;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public class zzadh<MessageType extends zzadk<MessageType, BuilderType>, BuilderType extends zzadh<MessageType, BuilderType>> extends zzacb<MessageType, BuilderType> {
    protected zzadk zza;
    protected boolean zzb = false;
    private final zzadk zzc;

    protected zzadh(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzadk) messagetype.zzb(4, null, null);
    }

    private static final void zza(zzadk zzadkVar, zzadk zzadkVar2) {
        zzaez.zza().zzb(zzadkVar.getClass()).zzd(zzadkVar, zzadkVar2);
    }

    @Override // com.google.android.libraries.places.internal.zzacb
    protected final /* synthetic */ zzacb zzp(zzacc zzaccVar) {
        zzs((zzadk) zzaccVar);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzacb
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzadh clone() {
        zzadh zzadhVar = (zzadh) this.zzc.zzb(5, null, null);
        zzadhVar.zzs(zzv());
        return zzadhVar;
    }

    public final zzadh zzs(zzadk zzadkVar) {
        if (this.zzb) {
            zzx();
            this.zzb = false;
        }
        zza(this.zza, zzadkVar);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType zzt() {
        /*
            r5 = this;
            com.google.android.libraries.places.internal.zzadk r0 = r5.zzv()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzb(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.libraries.places.internal.zzaez r3 = com.google.android.libraries.places.internal.zzaez.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.libraries.places.internal.zzafc r3 = r3.zzb(r4)
            boolean r3 = r3.zzf(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzb(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.libraries.places.internal.zzafs r1 = new com.google.android.libraries.places.internal.zzafs
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzadh.zzt():com.google.android.libraries.places.internal.zzadk");
    }

    @Override // com.google.android.libraries.places.internal.zzaeq
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public MessageType zzv() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzadk zzadkVar = this.zza;
        zzaez.zza().zzb(zzadkVar.getClass()).zzc(zzadkVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzaes
    public final /* synthetic */ zzaer zzw() {
        return this.zzc;
    }

    protected void zzx() {
        zzadk zzadkVar = (zzadk) this.zza.zzb(4, null, null);
        zza(zzadkVar, this.zza);
        this.zza = zzadkVar;
    }
}
