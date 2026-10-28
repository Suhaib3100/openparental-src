package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<com.airbnb.lottie.model.content.n, Path>> f38826a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f38827b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.h> f38828c;

    public h(List<com.airbnb.lottie.model.content.h> list) {
        this.f38828c = list;
        this.f38826a = new ArrayList(list.size());
        this.f38827b = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f38826a.add(list.get(i4).b().p());
            this.f38827b.add(list.get(i4).c().p());
        }
    }

    public List<a<com.airbnb.lottie.model.content.n, Path>> a() {
        return this.f38826a;
    }

    public List<com.airbnb.lottie.model.content.h> b() {
        return this.f38828c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f38827b;
    }
}
