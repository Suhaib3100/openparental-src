package com.google.android.gms.internal.play_billing;

import android.support.v4.media.d;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzez;
import com.google.android.gms.internal.play_billing.zzfa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzfa<MessageType extends zzfa<MessageType, BuilderType>, BuilderType extends zzez<MessageType, BuilderType>> implements zzhr {
    protected transient int zza = 0;

    protected static void zzk(Iterable iterable, List list) {
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzhz) {
            ((zzhz) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object obj = list2.get(i4);
            if (obj == null) {
                String a5 = r2.a(ProtectedSandApp.s("흏"), list.size() - size2, ProtectedSandApp.s("흐"));
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(a5);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] zzQ() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzfu zzfuVar = new zzfu(bArr, 0, zzn);
            zzD(zzfuVar);
            zzfuVar.zzA();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(d.a(ProtectedSandApp.s("흑"), getClass().getName(), ProtectedSandApp.s("흒")), e4);
        }
    }

    int zzi(zzib zzibVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final zzfp zzj() {
        try {
            int zzn = zzn();
            zzfp zzfpVar = zzfp.zza;
            byte[] bArr = new byte[zzn];
            zzfu zzfuVar = new zzfu(bArr, 0, zzn);
            zzD(zzfuVar);
            return zzfl.zza(zzfuVar, bArr);
        } catch (IOException e4) {
            throw new RuntimeException(d.a(ProtectedSandApp.s("흑"), getClass().getName(), ProtectedSandApp.s("흓")), e4);
        }
    }
}
