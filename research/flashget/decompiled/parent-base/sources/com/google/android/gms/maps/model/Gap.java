package com.google.android.gms.maps.model;

import androidx.annotation.o0;
import androidx.compose.foundation.shape.j;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class Gap extends PatternItem {
    public final float length;

    public Gap(float f4) {
        super(2, Float.valueOf(Math.max(f4, 0.0f)));
        this.length = Math.max(f4, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    @o0
    public String toString() {
        return j.a(new StringBuilder(ProtectedSandApp.s("\udadb")), this.length, ProtectedSandApp.s("\udadc"));
    }
}
