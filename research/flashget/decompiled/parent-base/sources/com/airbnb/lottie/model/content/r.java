package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.content.u;
import com.airbnb.lottie.n0;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes3.dex */
public class r implements com.airbnb.lottie.model.content.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39062a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.b f39063b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f39064c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.a f39065d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f39066e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39067f;

    /* renamed from: g, reason: collision with root package name */
    private final b f39068g;

    /* renamed from: h, reason: collision with root package name */
    private final c f39069h;

    /* renamed from: i, reason: collision with root package name */
    private final float f39070i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39071j;

    /* compiled from: ShapeStroke.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39072a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f39073b;

        static {
            int[] iArr = new int[c.values().length];
            f39073b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39073b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39073b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f39072a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39072a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39072a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i4 = a.f39072a[ordinal()];
            return i4 != 1 ? i4 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i4 = a.f39073b[ordinal()];
            if (i4 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i4 == 2) {
                return Paint.Join.MITER;
            }
            if (i4 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public r(String str, @q0 com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, b bVar3, c cVar, float f4, boolean z4) {
        this.f39062a = str;
        this.f39063b = bVar;
        this.f39064c = list;
        this.f39065d = aVar;
        this.f39066e = dVar;
        this.f39067f = bVar2;
        this.f39068g = bVar3;
        this.f39069h = cVar;
        this.f39070i = f4;
        this.f39071j = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new u(n0Var, bVar, this);
    }

    public b b() {
        return this.f39068g;
    }

    public com.airbnb.lottie.model.animatable.a c() {
        return this.f39065d;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f39063b;
    }

    public c e() {
        return this.f39069h;
    }

    public List<com.airbnb.lottie.model.animatable.b> f() {
        return this.f39064c;
    }

    public float g() {
        return this.f39070i;
    }

    public String h() {
        return this.f39062a;
    }

    public com.airbnb.lottie.model.animatable.d i() {
        return this.f39066e;
    }

    public com.airbnb.lottie.model.animatable.b j() {
        return this.f39067f;
    }

    public boolean k() {
        return this.f39071j;
    }
}
