package com.google.android.gms.internal.measurement;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes4.dex */
public abstract class zzlb<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjk<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznl zzc = zznl.zzc();

    private final int zza(zzmt zzmtVar) {
        if (zzmtVar != null) {
            return zzmtVar.zza(this);
        }
        return zzmq.zza().zzb(getClass()).zza(this);
    }

    static zzlb zzbC(Class cls) {
        Map map = zza;
        zzlb zzlbVar = (zzlb) map.get(cls);
        if (zzlbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzlbVar = (zzlb) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException(ProtectedSandApp.s("\u2d7c"), e6);
            }
        }
        if (zzlbVar == null) {
            zzlbVar = (zzlb) ((zzlb) zznu.zze(cls)).zzl(6, null, null);
            if (zzlbVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzlbVar);
        }
        return zzlbVar;
    }

    protected static zzlg zzbE() {
        return zzlc.zzf();
    }

    protected static zzlh zzbF() {
        return zzlx.zzf();
    }

    protected static zzlh zzbG(zzlh zzlhVar) {
        int size = zzlhVar.size();
        return zzlhVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzli zzbH() {
        return zzmr.zze();
    }

    protected static zzli zzbI(zzli zzliVar) {
        int size = zzliVar.size();
        return zzliVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzbK(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(ProtectedSandApp.s("\u2d7e"), e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(ProtectedSandApp.s("\u2d7d"), cause);
        }
    }

    protected static Object zzbL(zzmi zzmiVar, String str, Object[] objArr) {
        return new zzms(zzmiVar, str, objArr);
    }

    protected static void zzbO(Class cls, zzlb zzlbVar) {
        zzlbVar.zzbN();
        zza.put(cls, zzlbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzmq.zza().zzb(getClass()).zzj(this, (zzlb) obj);
    }

    public final int hashCode() {
        if (zzbR()) {
            return zzby();
        }
        int i5 = this.zzb;
        if (i5 != 0) {
            return i5;
        }
        int zzby = zzby();
        this.zzb = zzby;
        return zzby;
    }

    public final String toString() {
        return zzmk.zza(this, super.toString());
    }

    protected final zzkx zzbA() {
        return (zzkx) zzl(5, null, null);
    }

    public final zzkx zzbB() {
        zzkx zzkxVar = (zzkx) zzl(5, null, null);
        zzkxVar.zzaB(this);
        return zzkxVar;
    }

    final zzlb zzbD() {
        return (zzlb) zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh zzbJ() {
        return (zzkx) zzl(5, null, null);
    }

    protected final void zzbM() {
        zzmq.zza().zzb(getClass()).zzf(this);
        zzbN();
    }

    final void zzbN() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzbP(int i5) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void zzbQ(zzki zzkiVar) throws IOException {
        zzmq.zza().zzb(getClass()).zzi(this, zzkj.zza(zzkiVar));
    }

    final boolean zzbR() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* synthetic */ zzmi zzbV() {
        return (zzlb) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzjk
    final int zzbu(zzmt zzmtVar) {
        boolean zzbR = zzbR();
        String s5 = ProtectedSandApp.s("⵿");
        if (zzbR) {
            int zza2 = zza(zzmtVar);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException(s.a(s5, zza2));
        }
        int i5 = this.zzd & Integer.MAX_VALUE;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int zza3 = zza(zzmtVar);
        if (zza3 < 0) {
            throw new IllegalStateException(s.a(s5, zza3));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza3;
        return zza3;
    }

    final int zzby() {
        return zzmq.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final int zzbz() {
        int i5;
        boolean zzbR = zzbR();
        String s5 = ProtectedSandApp.s("ⶀ");
        if (zzbR) {
            i5 = zza(null);
            if (i5 < 0) {
                throw new IllegalStateException(s.a(s5, i5));
            }
        } else {
            i5 = this.zzd & Integer.MAX_VALUE;
            if (i5 == Integer.MAX_VALUE) {
                i5 = zza(null);
                if (i5 < 0) {
                    throw new IllegalStateException(s.a(s5, i5));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i5;
            }
        }
        return i5;
    }

    protected abstract Object zzl(int i5, Object obj, Object obj2);
}
