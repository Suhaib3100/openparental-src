package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzfo implements zzfn {
    zzfo() {
    }

    @Override // com.google.android.gms.internal.fido.zzfn
    public final StackTraceElement zza(Class cls, int i4) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i5 = 3;
        boolean z4 = false;
        while (true) {
            if (i5 >= stackTrace.length) {
                i5 = -1;
                break;
            }
            if (stackTrace[i5].getClassName().equals(name)) {
                z4 = true;
            } else {
                if (z4) {
                    break;
                }
                z4 = false;
            }
            i5++;
        }
        if (i5 != -1) {
            return stackTrace[i5];
        }
        return null;
    }
}
