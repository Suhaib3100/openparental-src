package com.google.android.libraries.places.internal;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzkx implements zzkw {
    zzkx() {
    }

    @Override // com.google.android.libraries.places.internal.zzkw
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
