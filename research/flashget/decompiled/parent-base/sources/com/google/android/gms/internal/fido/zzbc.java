package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzbc {
    public static final Appendable zza(Appendable appendable, Iterator it, zzbd zzbdVar, String str) throws IOException {
        String str2;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(zzbd.zzd(entry.getKey()));
            String s4 = ProtectedSandApp.s("퀀");
            appendable.append(s4);
            appendable.append(zzbd.zzd(entry.getValue()));
            while (it.hasNext()) {
                str2 = zzbdVar.zza;
                appendable.append(str2);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(zzbd.zzd(entry2.getKey()));
                appendable.append(s4);
                appendable.append(zzbd.zzd(entry2.getValue()));
            }
        }
        return appendable;
    }
}
