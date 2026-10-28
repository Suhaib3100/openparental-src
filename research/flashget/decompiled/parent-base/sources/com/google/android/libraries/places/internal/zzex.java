package com.google.android.libraries.places.internal;

import android.content.Context;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.f;
import com.google.android.datatransport.k;
import com.google.android.datatransport.l;
import com.google.android.datatransport.runtime.x;
import java.io.IOException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzex {
    private final l zza;

    public zzex(Context context) {
        x.f(context.getApplicationContext());
        this.zza = x.c().h(ProtectedSandApp.s("\ue964")).a(ProtectedSandApp.s("\ue965"), zzlg.class, new k() { // from class: com.google.android.libraries.places.internal.zzew
            @Override // com.google.android.datatransport.k
            public final Object apply(Object obj) {
                zzlg zzlgVar = (zzlg) obj;
                try {
                    byte[] bArr = new byte[zzlgVar.zzv()];
                    zzacx zzC = zzacx.zzC(bArr);
                    zzlgVar.zzH(zzC);
                    zzC.zzD();
                    return bArr;
                } catch (IOException e4) {
                    String name = zzlgVar.getClass().getName();
                    throw new RuntimeException(k0.a(new StringBuilder(name.length() + 72), ProtectedSandApp.s("\ue962"), name, ProtectedSandApp.s("\ue963")), e4);
                }
            }
        });
    }

    public final void zza(zzlg zzlgVar) {
        this.zza.b(f.j(zzlgVar));
    }
}
