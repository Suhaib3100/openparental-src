package com.google.android.gms.internal.measurement;

import a0.b0;
import androidx.collection.r2;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzid<MessageType extends zzib<MessageType, BuilderType>, BuilderType extends zzid<MessageType, BuilderType>> implements zzlb {
    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zziw zziwVar, zzjg zzjgVar) throws IOException;

    public BuilderType zza(byte[] bArr, int i4, int i5) throws zzkb {
        try {
            zziw zza = zziw.zza(bArr, 0, i5, false);
            zzb(zza, zzjg.zza);
            zza.zzc(0);
            return this;
        } catch (zzkb e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException(zza(ProtectedSandApp.s("팇")), e5);
        }
    }

    @Override // 
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i4, int i5, zzjg zzjgVar) throws zzkb {
        try {
            zziw zza = zziw.zza(bArr, 0, i5, false);
            zzb(zza, zzjgVar);
            zza.zzc(0);
            return this;
        } catch (zzkb e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException(zza(ProtectedSandApp.s("팇")), e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final /* synthetic */ zzlb zza(byte[] bArr) throws zzkb {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final /* synthetic */ zzlb zza(byte[] bArr, zzjg zzjgVar) throws zzkb {
        return zza(bArr, 0, bArr.length, zzjgVar);
    }

    private final String zza(String str) {
        return c.a(ProtectedSandApp.s("팂"), getClass().getName(), ProtectedSandApp.s("팃"), str, ProtectedSandApp.s("팄"));
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzjv.zza(iterable);
        if (iterable instanceof zzkj) {
            List<?> zza = ((zzkj) iterable).zza();
            zzkj zzkjVar = (zzkj) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String a5 = r2.a(ProtectedSandApp.s("팅"), zzkjVar.size() - size, ProtectedSandApp.s("팆"));
                    for (int size2 = zzkjVar.size() - 1; size2 >= size; size2--) {
                        zzkjVar.remove(size2);
                    }
                    throw new NullPointerException(a5);
                }
                if (obj instanceof zzik) {
                    zzkjVar.zza((zzik) obj);
                } else if (obj instanceof byte[]) {
                    zzkjVar.zza(zzik.zza((byte[]) obj));
                } else {
                    zzkjVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzlo) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof zzlp) {
                ((zzlp) list).zzb(list.size() + size3);
            }
        }
        int size4 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size5 = list2.size();
            for (int i4 = 0; i4 < size5; i4++) {
                b0 b0Var = (Object) list2.get(i4);
                if (b0Var == null) {
                    zza(list, size4);
                }
                list.add(b0Var);
            }
            return;
        }
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                zza(list, size4);
            }
            list.add(obj2);
        }
    }

    private static void zza(List<?> list, int i4) {
        String a5 = r2.a(ProtectedSandApp.s("팅"), list.size() - i4, ProtectedSandApp.s("팆"));
        for (int size = list.size() - 1; size >= i4; size--) {
            list.remove(size);
        }
        throw new NullPointerException(a5);
    }
}
