package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.o0;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f13985a;

    public a(float f6) {
        this.f13985a = f6;
    }

    @Override // com.google.android.material.shape.d
    public float a(@o0 RectF rectF) {
        return this.f13985a;
    }

    public float b() {
        return this.f13985a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f13985a == ((a) obj).f13985a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f13985a)});
    }
}
