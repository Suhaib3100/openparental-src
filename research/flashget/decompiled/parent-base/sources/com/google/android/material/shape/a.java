package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.o0;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes6.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f53845a;

    public a(float f4) {
        this.f53845a = f4;
    }

    @Override // com.google.android.material.shape.d
    public float a(@o0 RectF rectF) {
        return this.f53845a;
    }

    public float b() {
        return this.f53845a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f53845a == ((a) obj).f53845a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f53845a)});
    }
}
