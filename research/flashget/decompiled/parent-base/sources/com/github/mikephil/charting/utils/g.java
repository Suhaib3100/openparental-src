package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.h;
import java.util.List;

/* compiled from: MPPointF.java */
/* loaded from: classes5.dex */
public class g extends h.a {

    /* renamed from: f, reason: collision with root package name */
    private static h<g> f50634f;

    /* renamed from: g, reason: collision with root package name */
    public static final Parcelable.Creator<g> f50635g;

    /* renamed from: d, reason: collision with root package name */
    public float f50636d;

    /* renamed from: e, reason: collision with root package name */
    public float f50637e;

    /* compiled from: MPPointF.java */
    static class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            g gVar = new g(0.0f, 0.0f);
            gVar.g(parcel);
            return gVar;
        }

        public g[] b(int i4) {
            return new g[i4];
        }

        @Override // android.os.Parcelable.Creator
        public g[] newArray(int i4) {
            return new g[i4];
        }
    }

    static {
        h<g> a5 = h.a(32, new g(0.0f, 0.0f));
        f50634f = a5;
        a5.l(0.5f);
        f50635g = new a();
    }

    public g() {
    }

    public static g b() {
        return f50634f.b();
    }

    public static g c(float f4, float f5) {
        g b5 = f50634f.b();
        b5.f50636d = f4;
        b5.f50637e = f5;
        return b5;
    }

    public static g d(g gVar) {
        g b5 = f50634f.b();
        b5.f50636d = gVar.f50636d;
        b5.f50637e = gVar.f50637e;
        return b5;
    }

    public static void h(g gVar) {
        f50634f.g(gVar);
    }

    public static void i(List<g> list) {
        f50634f.h(list);
    }

    @Override // com.github.mikephil.charting.utils.h.a
    protected h.a a() {
        return new g(0.0f, 0.0f);
    }

    public float e() {
        return this.f50636d;
    }

    public float f() {
        return this.f50637e;
    }

    public void g(Parcel parcel) {
        this.f50636d = parcel.readFloat();
        this.f50637e = parcel.readFloat();
    }

    public g(float f4, float f5) {
        this.f50636d = f4;
        this.f50637e = f5;
    }
}
