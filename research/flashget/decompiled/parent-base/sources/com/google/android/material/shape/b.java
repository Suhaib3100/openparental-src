package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f53846a;

    /* renamed from: b, reason: collision with root package name */
    private final float f53847b;

    public b(float f4, @o0 d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f53846a;
            f4 += ((b) dVar).f53847b;
        }
        this.f53846a = dVar;
        this.f53847b = f4;
    }

    @Override // com.google.android.material.shape.d
    public float a(@o0 RectF rectF) {
        return Math.max(0.0f, this.f53846a.a(rectF) + this.f53847b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f53846a.equals(bVar.f53846a) && this.f53847b == bVar.f53847b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53846a, Float.valueOf(this.f53847b)});
    }
}
