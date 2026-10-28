package com.airbnb.lottie.model;

import androidx.annotation.c1;
import androidx.annotation.l;
import androidx.compose.foundation.text.modifiers.n;

/* compiled from: DocumentData.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f38969a;

    /* renamed from: b, reason: collision with root package name */
    public String f38970b;

    /* renamed from: c, reason: collision with root package name */
    public float f38971c;

    /* renamed from: d, reason: collision with root package name */
    public a f38972d;

    /* renamed from: e, reason: collision with root package name */
    public int f38973e;

    /* renamed from: f, reason: collision with root package name */
    public float f38974f;

    /* renamed from: g, reason: collision with root package name */
    public float f38975g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public int f38976h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public int f38977i;

    /* renamed from: j, reason: collision with root package name */
    public float f38978j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f38979k;

    /* compiled from: DocumentData.java */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f4, a aVar, int i4, float f5, float f6, @l int i5, @l int i6, float f7, boolean z4) {
        a(str, str2, f4, aVar, i4, f5, f6, i5, i6, f7, z4);
    }

    public void a(String str, String str2, float f4, a aVar, int i4, float f5, float f6, @l int i5, @l int i6, float f7, boolean z4) {
        this.f38969a = str;
        this.f38970b = str2;
        this.f38971c = f4;
        this.f38972d = aVar;
        this.f38973e = i4;
        this.f38974f = f5;
        this.f38975g = f6;
        this.f38976h = i5;
        this.f38977i = i6;
        this.f38978j = f7;
        this.f38979k = z4;
    }

    public int hashCode() {
        int ordinal = ((this.f38972d.ordinal() + (((int) (n.a(this.f38970b, this.f38969a.hashCode() * 31, 31) + this.f38971c)) * 31)) * 31) + this.f38973e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f38974f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f38976h;
    }

    public b() {
    }
}
