package com.google.android.gms.auth.api;

import androidx.annotation.q0;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes5.dex */
public final class zbc {
    protected Boolean zba;

    @q0
    protected String zbb;

    public zbc() {
        this.zba = Boolean.FALSE;
    }

    @ShowFirstParty
    public final zbc zba(String str) {
        this.zbb = str;
        return this;
    }

    @ShowFirstParty
    public zbc(zbd zbdVar) {
        boolean z4;
        String str;
        this.zba = Boolean.FALSE;
        zbd.zbb(zbdVar);
        z4 = zbdVar.zbc;
        this.zba = Boolean.valueOf(z4);
        str = zbdVar.zbd;
        this.zbb = str;
    }
}
