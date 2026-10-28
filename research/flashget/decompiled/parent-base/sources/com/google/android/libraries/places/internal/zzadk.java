package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.internal.zzadh;
import com.google.android.libraries.places.internal.zzadk;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzadk<MessageType extends zzadk<MessageType, BuilderType>, BuilderType extends zzadh<MessageType, BuilderType>> extends zzacc<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzafu zzc = zzafu.zzc();
    protected int zzd = -1;

    protected static zzadq zzA() {
        return zzaeg.zze();
    }

    protected static zzadr zzB() {
        return zzafa.zzd();
    }

    protected static zzadr zzC(zzadr zzadrVar) {
        int size = zzadrVar.size();
        return zzadrVar.zzf(size == 0 ? 10 : size + size);
    }

    static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(ProtectedSandApp.s("\ue6aa"), e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(ProtectedSandApp.s("\ue6a9"), cause);
        }
    }

    protected static Object zzF(zzaer zzaerVar, String str, Object[] objArr) {
        return new zzafb(zzaerVar, str, objArr);
    }

    protected static void zzG(Class cls, zzadk zzadkVar) {
        zzb.put(cls, zzadkVar);
    }

    static zzadk zzy(Class cls) {
        Map map = zzb;
        zzadk zzadkVar = (zzadk) map.get(cls);
        if (zzadkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzadkVar = (zzadk) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(ProtectedSandApp.s("\ue6ab"), e4);
            }
        }
        if (zzadkVar == null) {
            zzadkVar = (zzadk) ((zzadk) zzagd.zze(cls)).zzb(6, null, null);
            if (zzadkVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzadkVar);
        }
        return zzadkVar;
    }

    protected static zzado zzz() {
        return zzadl.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaez.zza().zzb(getClass()).zze(this, (zzadk) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int zzb2 = zzaez.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzaet.zza(this, super.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzaer
    public final /* synthetic */ zzaeq zzD() {
        zzadh zzadhVar = (zzadh) zzb(5, null, null);
        zzadhVar.zzs(this);
        return zzadhVar;
    }

    @Override // com.google.android.libraries.places.internal.zzaer
    public final void zzH(zzacx zzacxVar) throws IOException {
        zzaez.zza().zzb(getClass()).zzi(this, zzacy.zza(zzacxVar));
    }

    protected abstract Object zzb(int i4, Object obj, Object obj2);

    @Override // com.google.android.libraries.places.internal.zzacc
    final int zzr() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzacc
    final void zzu(int i4) {
        this.zzd = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzaer
    public final int zzv() {
        int i4 = this.zzd;
        if (i4 != -1) {
            return i4;
        }
        int zza = zzaez.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzaes
    public final /* synthetic */ zzaer zzw() {
        return (zzadk) zzb(6, null, null);
    }

    protected final zzadh zzx() {
        return (zzadh) zzb(5, null, null);
    }
}
