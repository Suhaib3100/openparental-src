package com.google.android.gms.maps.model;

import androidx.annotation.o0;
import androidx.appcompat.view.g;
import androidx.compose.foundation.shape.j;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class CustomCap extends Cap {

    @o0
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(@o0 BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    @Override // com.google.android.gms.maps.model.Cap
    @o0
    public String toString() {
        return j.a(g.a(ProtectedSandApp.s("\udacf"), String.valueOf(this.bitmapDescriptor), ProtectedSandApp.s("\udad0")), this.refWidth, ProtectedSandApp.s("\udad1"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CustomCap(@androidx.annotation.o0 com.google.android.gms.maps.model.BitmapDescriptor r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "\udacd"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.maps.model.BitmapDescriptor r0 = (com.google.android.gms.maps.model.BitmapDescriptor) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L19
            r2.<init>(r0, r4)
            r2.bitmapDescriptor = r3
            r2.refWidth = r4
            return
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "\udace"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CustomCap.<init>(com.google.android.gms.maps.model.BitmapDescriptor, float):void");
    }
}
