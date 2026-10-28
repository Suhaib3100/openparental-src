package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.x;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes6.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f53911a;

    public m(@x(from = 0.0d, to = 1.0d) float f4) {
        this.f53911a = f4;
    }

    @Override // com.google.android.material.shape.d
    public float a(@o0 RectF rectF) {
        return rectF.height() * this.f53911a;
    }

    @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public float b() {
        return this.f53911a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f53911a == ((m) obj).f53911a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f53911a)});
    }
}
