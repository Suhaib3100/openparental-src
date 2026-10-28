package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.solver.f;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmi {
    protected int zzb = 0;

    protected static void zzbw(Iterable iterable, List list) {
        byte[] bArr = zzlj.zzd;
        iterable.getClass();
        boolean z5 = iterable instanceof zzlq;
        String s5 = ProtectedSandApp.s("⍲");
        String s6 = ProtectedSandApp.s("⍳");
        if (z5) {
            List zzh = ((zzlq) iterable).zzh();
            zzlq zzlqVar = (zzlq) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String a6 = f.a(s6, zzlqVar.size() - size, s5);
                    int size2 = zzlqVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(a6);
                        }
                        zzlqVar.remove(size2);
                    }
                } else if (obj instanceof zzka) {
                    zzlqVar.zzi((zzka) obj);
                } else {
                    zzlqVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzmp) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String a7 = f.a(s6, list.size() - size3, s5);
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(a7);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    int zzbu(zzmt zzmtVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzka zzbv() {
        try {
            int zzbz = zzbz();
            zzka zzkaVar = zzka.zzb;
            byte[] bArr = new byte[zzbz];
            zzki zzz = zzki.zzz(bArr, 0, zzbz);
            zzbQ(zzz);
            zzz.zzA();
            return new zzjx(bArr);
        } catch (IOException e6) {
            throw new RuntimeException(e.a(ProtectedSandApp.s("⍴"), getClass().getName(), ProtectedSandApp.s("⍵")), e6);
        }
    }

    public final byte[] zzbx() {
        try {
            int zzbz = zzbz();
            byte[] bArr = new byte[zzbz];
            zzki zzz = zzki.zzz(bArr, 0, zzbz);
            zzbQ(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(e.a(ProtectedSandApp.s("⍶"), getClass().getName(), ProtectedSandApp.s("⍷")), e6);
        }
    }
}
