package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzjt.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzjt<MessageType extends zzjt<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzib<MessageType, BuilderType> {
    private static Map<Class<?>, zzjt<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzmj zzb = zzmj.zzc();

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    protected static class zza<T extends zzjt<T, ?>> extends zzif<T> {
        public zza(T t4) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    public static abstract class zzb<MessageType extends zzjt<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzid<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzco()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("팈"));
            }
            this.zza = (MessageType) messagetype.zzce();
        }

        private final BuilderType zzb(byte[] bArr, int i4, int i5, zzjg zzjgVar) throws zzkb {
            if (!this.zza.zzco()) {
                zzal();
            }
            try {
                zzlq.zza().zza((zzlq) this.zza).zza(this.zza, bArr, 0, i5, new zzij(zzjgVar));
                return this;
            } catch (zzkb e4) {
                throw e4;
            } catch (IOException e5) {
                throw new RuntimeException(ProtectedSandApp.s("팉"), e5);
            } catch (IndexOutOfBoundsException unused) {
                throw zzkb.zzi();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzid
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final BuilderType zzb(zziw zziwVar, zzjg zzjgVar) throws IOException {
            if (!this.zza.zzco()) {
                zzal();
            }
            try {
                zzlq.zza().zza((zzlq) this.zza).zza(this.zza, zzjb.zza(zziwVar), zzjgVar);
                return this;
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof IOException) {
                    throw ((IOException) e4.getCause());
                }
                throw e4;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzid
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzaj();
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzid
        /* renamed from: zza */
        public final /* synthetic */ zzid zzb(zziw zziwVar, zzjg zzjgVar) throws IOException {
            return (zzb) zzb(zziwVar, zzjgVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzid
        /* renamed from: zzaf */
        public final /* synthetic */ zzid clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzlb
        /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public final MessageType zzai() {
            MessageType messagetype = (MessageType) zzaj();
            if (zzjt.zza(messagetype, true)) {
                return messagetype;
            }
            throw new zzmh(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzlb
        /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public MessageType zzaj() {
            if (!this.zza.zzco()) {
                return this.zza;
            }
            this.zza.zzcl();
            return this.zza;
        }

        protected final void zzak() {
            if (this.zza.zzco()) {
                return;
            }
            zzal();
        }

        protected void zzal() {
            MessageType messagetype = (MessageType) this.zzb.zzce();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.zzle
        public final /* synthetic */ zzlc zzck() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.measurement.zzle
        public final boolean zzcn() {
            return zzjt.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzid
        public final /* synthetic */ zzid zza(byte[] bArr, int i4, int i5) throws zzkb {
            return zzb(bArr, 0, i5, zzjg.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzid
        public final /* synthetic */ zzid zza(byte[] bArr, int i4, int i5, zzjg zzjgVar) throws zzkb {
            return zzb(bArr, 0, i5, zzjgVar);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzco()) {
                zzal();
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzlq.zza().zza((zzlq) messagetype).zza(messagetype, messagetype2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    static final class zzc implements zzjo<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjo
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjo
        public final zzms zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjo
        public final zzmz zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjo
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjo
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjo
        public final zzlb zza(zzlb zzlbVar, zzlc zzlcVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjo
        public final zzlh zza(zzlh zzlhVar, zzlh zzlhVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzjt<MessageType, BuilderType> implements zzle {
        protected zzjm<zzc> zzc = zzjm.zzb();

        final zzjm<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzjm) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    public static class zzf<ContainingType extends zzlc, Type> extends zzjh<ContainingType, Type> {
    }

    private final int zza() {
        return zzlq.zza().zza((zzlq) this).zzb(this);
    }

    private final int zzb(zzlu<?> zzluVar) {
        return zzluVar == null ? zzlq.zza().zza((zzlq) this).zza(this) : zzluVar.zza(this);
    }

    protected static zzka zzcf() {
        return zzjw.zzd();
    }

    protected static zzjz zzcg() {
        return zzkn.zzd();
    }

    protected static <E> zzkc<E> zzch() {
        return zzlp.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlq.zza().zza((zzlq) this).zzb(this, (zzjt) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzco()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzld.zza(this, super.toString());
    }

    protected abstract Object zza(int i4, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.zzib
    final int zzby() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    final void zzc(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("판"), i4));
        }
        this.zzd = (i4 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int zzcb() {
        return zza((zzlu) null);
    }

    protected final <MessageType extends zzjt<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzcc() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzcd() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza((zzb) this);
    }

    final MessageType zzce() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final /* synthetic */ zzlb zzci() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final /* synthetic */ zzlb zzcj() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza((zzb) this);
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final /* synthetic */ zzlc zzck() {
        return (zzjt) zza(zze.zzf, (Object) null, (Object) null);
    }

    protected final void zzcl() {
        zzlq.zza().zza((zzlq) this).zzd(this);
        zzcm();
    }

    final void zzcm() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final boolean zzcn() {
        return zza(this, true);
    }

    final boolean zzco() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    final int zza(zzlu zzluVar) {
        if (zzco()) {
            int zzb2 = zzb(zzluVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("판"), zzb2));
        }
        if (zzby() != Integer.MAX_VALUE) {
            return zzby();
        }
        int zzb3 = zzb(zzluVar);
        zzc(zzb3);
        return zzb3;
    }

    protected final <MessageType extends zzjt<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zza(MessageType messagetype) {
        return (BuilderType) zzcc().zza(messagetype);
    }

    static <T extends zzjt<?, ?>> T zza(Class<T> cls) {
        zzjt<?, ?> zzjtVar = zzc.get(cls);
        if (zzjtVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjtVar = zzc.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(ProtectedSandApp.s("팍"), e4);
            }
        }
        if (zzjtVar == null) {
            zzjtVar = (T) ((zzjt) zzml.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzjtVar != null) {
                zzc.put(cls, zzjtVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzjtVar;
    }

    protected static zzjz zza(zzjz zzjzVar) {
        return zzjzVar.zza(zzjzVar.size() << 1);
    }

    protected static <E> zzkc<E> zza(zzkc<E> zzkcVar) {
        return zzkcVar.zza(zzkcVar.size() << 1);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(ProtectedSandApp.s("팏"), e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(ProtectedSandApp.s("팎"), cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static Object zza(zzlc zzlcVar, String str, Object[] objArr) {
        return new zzls(zzlcVar, str, objArr);
    }

    protected static <T extends zzjt<?, ?>> void zza(Class<T> cls, T t4) {
        t4.zzcm();
        zzc.put(cls, t4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void zza(zzjc zzjcVar) throws IOException {
        zzlq.zza().zza((zzlq) this).zza((zzlu) this, (zznb) zzjf.zza(zzjcVar));
    }

    protected static final <T extends zzjt<T, ?>> boolean zza(T t4, boolean z4) {
        byte byteValue = ((Byte) t4.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzlq.zza().zza((zzlq) t4).zze(t4);
        if (z4) {
            t4.zza(zze.zzb, zze2 ? t4 : null, null);
        }
        return zze2;
    }
}
