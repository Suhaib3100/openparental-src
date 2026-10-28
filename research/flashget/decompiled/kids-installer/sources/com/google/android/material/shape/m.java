package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.x;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes3.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f14038a;

    public m(@x(from = 0.0d, to = 1.0d) float f6) {
        this.f14038a = f6;
    }

    @Override // com.google.android.material.shape.d
    public float a(@o0 RectF rectF) {
        return rectF.height() * this.f14038a;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
    public float b() {
        return this.f14038a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f14038a == ((m) obj).f14038a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14038a)});
    }
}
