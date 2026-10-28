package com.google.android.libraries.places.internal;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.internal.zzacb;
import com.google.android.libraries.places.internal.zzacc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzacc<MessageType extends zzacc<MessageType, BuilderType>, BuilderType extends zzacb<MessageType, BuilderType>> implements zzaer {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void zzt(Iterable iterable, List list) {
        zzads.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                int size2 = list.size();
                StringBuilder a5 = androidx.fragment.app.a.a(37, ProtectedSandApp.s("\ue6a5"));
                a5.append(size2 - size);
                a5.append(ProtectedSandApp.s("\ue6a6"));
                String sb = a5.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(sb);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    int zzr() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzaer
    public final zzacp zzs() {
        try {
            int zzv = zzv();
            zzacp zzacpVar = zzacp.zzb;
            byte[] bArr = new byte[zzv];
            zzacx zzC = zzacx.zzC(bArr);
            zzH(zzC);
            zzC.zzD();
            return new zzacm(bArr);
        } catch (IOException e4) {
            String name = getClass().getName();
            throw new RuntimeException(k0.a(new StringBuilder(name.length() + 72), ProtectedSandApp.s("\ue6a7"), name, ProtectedSandApp.s("\ue6a8")), e4);
        }
    }

    void zzu(int i4) {
        throw null;
    }
}
