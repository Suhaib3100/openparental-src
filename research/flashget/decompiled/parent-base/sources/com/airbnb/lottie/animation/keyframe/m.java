package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.content.t;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class m extends a<com.airbnb.lottie.model.content.n, Path> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.n f38837i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f38838j;

    /* renamed from: k, reason: collision with root package name */
    private List<t> f38839k;

    public m(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.n>> list) {
        super(list);
        this.f38837i = new com.airbnb.lottie.model.content.n();
        this.f38838j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.n> aVar, float f4) {
        this.f38837i.c(aVar.f39405b, aVar.f39406c, f4);
        com.airbnb.lottie.model.content.n nVar = this.f38837i;
        List<t> list = this.f38839k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nVar = this.f38839k.get(size).c(nVar);
            }
        }
        com.airbnb.lottie.utils.i.i(nVar, this.f38838j);
        return this.f38838j;
    }

    public void q(@q0 List<t> list) {
        this.f38839k = list;
    }
}
