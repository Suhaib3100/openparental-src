package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final /* synthetic */ class zzcx {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j4, Object obj2, Object obj3) {
        while (!a.a(unsafe, obj, j4, obj2, obj3)) {
            if (unsafe.getObject(obj, j4) != obj2) {
                return false;
            }
        }
        return true;
    }
}
