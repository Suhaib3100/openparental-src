package com.airbnb.lottie.model.content;

import androidx.annotation.q0;
import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MergePaths.java */
/* loaded from: classes3.dex */
public class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39020a;

    /* renamed from: b, reason: collision with root package name */
    private final a f39021b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39022c;

    /* compiled from: MergePaths.java */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i4) {
            return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public i(String str, a aVar, boolean z4) {
        this.f39020a = str;
        this.f39021b = aVar;
        this.f39022c = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    @q0
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        if (n0Var.K()) {
            return new com.airbnb.lottie.animation.content.l(this);
        }
        com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("Ķ"));
        return null;
    }

    public a b() {
        return this.f39021b;
    }

    public String c() {
        return this.f39020a;
    }

    public boolean d() {
        return this.f39022c;
    }

    public String toString() {
        return ProtectedSandApp.s("ķ") + this.f39021b + '}';
    }
}
