package com.github.mikephil.charting.highlight;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.k;

/* compiled from: Highlight.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private float f50432a;

    /* renamed from: b, reason: collision with root package name */
    private float f50433b;

    /* renamed from: c, reason: collision with root package name */
    private float f50434c;

    /* renamed from: d, reason: collision with root package name */
    private float f50435d;

    /* renamed from: e, reason: collision with root package name */
    private int f50436e;

    /* renamed from: f, reason: collision with root package name */
    private int f50437f;

    /* renamed from: g, reason: collision with root package name */
    private int f50438g;

    /* renamed from: h, reason: collision with root package name */
    private k.a f50439h;

    /* renamed from: i, reason: collision with root package name */
    private float f50440i;

    /* renamed from: j, reason: collision with root package name */
    private float f50441j;

    public d(float f4, float f5, int i4) {
        this.f50436e = -1;
        this.f50438g = -1;
        this.f50432a = f4;
        this.f50433b = f5;
        this.f50437f = i4;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f50437f == dVar.f50437f && this.f50432a == dVar.f50432a && this.f50438g == dVar.f50438g && this.f50436e == dVar.f50436e;
    }

    public k.a b() {
        return this.f50439h;
    }

    public int c() {
        return this.f50436e;
    }

    public int d() {
        return this.f50437f;
    }

    public float e() {
        return this.f50440i;
    }

    public float f() {
        return this.f50441j;
    }

    public int g() {
        return this.f50438g;
    }

    public float h() {
        return this.f50432a;
    }

    public float i() {
        return this.f50434c;
    }

    public float j() {
        return this.f50433b;
    }

    public float k() {
        return this.f50435d;
    }

    public boolean l() {
        return this.f50438g >= 0;
    }

    public void m(int i4) {
        this.f50436e = i4;
    }

    public void n(float f4, float f5) {
        this.f50440i = f4;
        this.f50441j = f5;
    }

    public String toString() {
        return ProtectedSandApp.s("쐾") + this.f50432a + ProtectedSandApp.s("쐿") + this.f50433b + ProtectedSandApp.s("쑀") + this.f50437f + ProtectedSandApp.s("쑁") + this.f50438g;
    }

    public d(float f4, int i4, int i5) {
        this(f4, Float.NaN, i4);
        this.f50438g = i5;
    }

    public d(float f4, float f5, float f6, float f7, int i4, k.a aVar) {
        this.f50436e = -1;
        this.f50438g = -1;
        this.f50432a = f4;
        this.f50433b = f5;
        this.f50434c = f6;
        this.f50435d = f7;
        this.f50437f = i4;
        this.f50439h = aVar;
    }

    public d(float f4, float f5, float f6, float f7, int i4, int i5, k.a aVar) {
        this(f4, f5, f6, f7, i4, aVar);
        this.f50438g = i5;
    }
}
