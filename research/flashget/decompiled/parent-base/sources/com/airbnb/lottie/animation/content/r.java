package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes3.dex */
public class r implements t, a.b {

    /* renamed from: e, reason: collision with root package name */
    private static final float f38776e = 0.5519f;

    /* renamed from: a, reason: collision with root package name */
    private final n0 f38777a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38778b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f38779c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.model.content.n f38780d;

    public r(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.m mVar) {
        this.f38777a = n0Var;
        this.f38778b = mVar.c();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p4 = mVar.b().p();
        this.f38779c = p4;
        bVar.i(p4);
        p4.a(this);
    }

    private static int d(int i4, int i5) {
        int i6 = i4 / i5;
        return ((i4 ^ i5) >= 0 || i5 * i6 == i4) ? i6 : i6 - 1;
    }

    private static int e(int i4, int i5) {
        return i4 - (d(i4, i5) * i5);
    }

    @o0
    private com.airbnb.lottie.model.content.n i(com.airbnb.lottie.model.content.n nVar) {
        List<com.airbnb.lottie.model.a> a5 = nVar.a();
        boolean d5 = nVar.d();
        int size = a5.size() - 1;
        int i4 = 0;
        while (size >= 0) {
            com.airbnb.lottie.model.a aVar = a5.get(size);
            com.airbnb.lottie.model.a aVar2 = a5.get(e(size - 1, a5.size()));
            PointF c5 = (size != 0 || d5) ? aVar2.c() : nVar.b();
            i4 = (((size != 0 || d5) ? aVar2.b() : c5).equals(c5) && aVar.a().equals(c5) && !(!nVar.d() && size == 0 && size == a5.size() - 1)) ? i4 + 2 : i4 + 1;
            size--;
        }
        com.airbnb.lottie.model.content.n nVar2 = this.f38780d;
        if (nVar2 == null || nVar2.a().size() != i4) {
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(new com.airbnb.lottie.model.a());
            }
            this.f38780d = new com.airbnb.lottie.model.content.n(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f38780d.e(d5);
        return this.f38780d;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f38777a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r7 == (r0.size() - 1)) goto L27;
     */
    @Override // com.airbnb.lottie.animation.content.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.airbnb.lottie.model.content.n c(com.airbnb.lottie.model.content.n r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.r.c(com.airbnb.lottie.model.content.n):com.airbnb.lottie.model.content.n");
    }

    public com.airbnb.lottie.animation.keyframe.a<Float, Float> g() {
        return this.f38779c;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38778b;
    }
}
