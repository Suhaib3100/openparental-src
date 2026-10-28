package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzgl;
import com.google.android.gms.internal.play_billing.zzgp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzgp<MessageType extends zzgp<MessageType, BuilderType>, BuilderType extends zzgl<MessageType, BuilderType>> extends zzfa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzir zzc = zzir.zzc();

    protected static void zzB(Class cls, zzgp zzgpVar) {
        zzgpVar.zzA();
        zzb.put(cls, zzgpVar);
    }

    private final int zza(zzib zzibVar) {
        return zzhy.zza().zzb(getClass()).zza(this);
    }

    private static zzgp zzb(zzgp zzgpVar, byte[] bArr, int i4, int i5, zzgc zzgcVar) throws zzhb {
        if (i5 == 0) {
            return zzgpVar;
        }
        zzgp zzs = zzgpVar.zzs();
        try {
            zzib zzb2 = zzhy.zza().zzb(zzs.getClass());
            zzb2.zzh(zzs, bArr, 0, i5, new zzfd(zzgcVar));
            zzb2.zzf(zzs);
            return zzs;
        } catch (zzhb e4) {
            throw e4;
        } catch (zzip e5) {
            throw e5.zza();
        } catch (IOException e6) {
            if (e6.getCause() instanceof zzhb) {
                throw ((zzhb) e6.getCause());
            }
            throw new zzhb(e6);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhb(ProtectedSandApp.s("흔"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(zzgp zzgpVar, boolean z4) {
        byte byteValue = ((Byte) zzgpVar.zzd(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzhy.zza().zzb(zzgpVar.getClass()).zzk(zzgpVar);
        if (z4) {
            zzgpVar.zzd(2, true != zzk ? null : zzgpVar, null);
        }
        return zzk;
    }

    static zzgp zzr(Class cls) {
        Map map = zzb;
        zzgp zzgpVar = (zzgp) map.get(cls);
        if (zzgpVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgpVar = (zzgp) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(ProtectedSandApp.s("흕"), e4);
            }
        }
        if (zzgpVar == null) {
            zzgpVar = (zzgp) ((zzgp) zzix.zze(cls)).zzd(6, null, null);
            if (zzgpVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgpVar);
        }
        return zzgpVar;
    }

    protected static zzgp zzt(zzgp zzgpVar, byte[] bArr) throws zzhb {
        int length = bArr.length;
        int i4 = zzgc.zzb;
        int i5 = zzfc.zza;
        zzgp zzb2 = zzb(zzgpVar, bArr, 0, length, zzgc.zza);
        if (zzb2 == null || zzc(zzb2, true)) {
            return zzb2;
        }
        throw new zzip(zzb2).zza();
    }

    protected static zzgt zzu() {
        return zzgq.zzf();
    }

    protected static zzgu zzv() {
        return zzhz.zze();
    }

    static Object zzx(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(ProtectedSandApp.s("흗"), e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(ProtectedSandApp.s("흖"), cause);
        }
    }

    protected static Object zzy(zzhr zzhrVar, String str, Object[] objArr) {
        return new zzia(zzhrVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhy.zza().zzb(getClass()).zzj(this, (zzgp) obj);
    }

    public final int hashCode() {
        if (zzF()) {
            return zzm();
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final String toString() {
        return zzht.zza(this, super.toString());
    }

    final void zzA() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzC(int i4) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final void zzD(zzfx zzfxVar) throws IOException {
        zzhy.zza().zzb(getClass()).zzi(this, zzfy.zza(zzfxVar));
    }

    final boolean zzF() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object zzd(int i4, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzfa
    final int zzi(zzib zzibVar) {
        boolean zzF = zzF();
        String s4 = ProtectedSandApp.s("흘");
        if (zzF) {
            int zza = zzibVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(android.support.v4.media.a.a(s4, zza));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int zza2 = zzibVar.zza(this);
        if (zza2 < 0) {
            throw new IllegalStateException(android.support.v4.media.a.a(s4, zza2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
        return zza2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhs
    public final /* synthetic */ zzhr zzl() {
        return (zzgp) zzd(6, null, null);
    }

    final int zzm() {
        return zzhy.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final int zzn() {
        int i4;
        boolean zzF = zzF();
        String s4 = ProtectedSandApp.s("흘");
        if (zzF) {
            i4 = zza(null);
            if (i4 < 0) {
                throw new IllegalStateException(android.support.v4.media.a.a(s4, i4));
            }
        } else {
            i4 = this.zzd & Integer.MAX_VALUE;
            if (i4 == Integer.MAX_VALUE) {
                i4 = zza(null);
                if (i4 < 0) {
                    throw new IllegalStateException(android.support.v4.media.a.a(s4, i4));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i4;
            }
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhs
    public final boolean zzo() {
        return zzc(this, true);
    }

    protected final zzgl zzp() {
        return (zzgl) zzd(5, null, null);
    }

    public final zzgl zzq() {
        zzgl zzglVar = (zzgl) zzd(5, null, null);
        zzglVar.zzh(this);
        return zzglVar;
    }

    final zzgp zzs() {
        return (zzgp) zzd(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final /* synthetic */ zzhq zzw() {
        return (zzgl) zzd(5, null, null);
    }

    protected final void zzz() {
        zzhy.zza().zzb(getClass()).zzf(this);
        zzA();
    }
}
