package com.android.volley;

/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes3.dex */
public class g implements s {

    /* renamed from: e, reason: collision with root package name */
    public static final int f40879e = 2500;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40880f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final float f40881g = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    private int f40882a;

    /* renamed from: b, reason: collision with root package name */
    private int f40883b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40884c;

    /* renamed from: d, reason: collision with root package name */
    private final float f40885d;

    public g() {
        this(f40879e, 1, 1.0f);
    }

    @Override // com.android.volley.s
    public int a() {
        return this.f40883b;
    }

    @Override // com.android.volley.s
    public void b(VolleyError volleyError) throws VolleyError {
        this.f40883b++;
        int i4 = this.f40882a;
        this.f40882a = i4 + ((int) (i4 * this.f40885d));
        if (!e()) {
            throw volleyError;
        }
    }

    @Override // com.android.volley.s
    public int c() {
        return this.f40882a;
    }

    public float d() {
        return this.f40885d;
    }

    protected boolean e() {
        return this.f40883b <= this.f40884c;
    }

    public g(int i4, int i5, float f4) {
        this.f40882a = i4;
        this.f40884c = i5;
        this.f40885d = f4;
    }
}
