package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f13986a;

    /* renamed from: b, reason: collision with root package name */
    private final float f13987b;

    public b(float f6, @o0 d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f13986a;
            f6 += ((b) dVar).f13987b;
        }
        this.f13986a = dVar;
        this.f13987b = f6;
    }

    @Override // com.google.android.material.shape.d
    public float a(@o0 RectF rectF) {
        return Math.max(0.0f, this.f13986a.a(rectF) + this.f13987b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13986a.equals(bVar.f13986a) && this.f13987b == bVar.f13987b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13986a, Float.valueOf(this.f13987b)});
    }
}
