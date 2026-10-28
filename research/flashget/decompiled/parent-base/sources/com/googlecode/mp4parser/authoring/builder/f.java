package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.h;
import java.util.Map;

/* compiled from: StaticFragmentIntersectionFinderImpl.java */
/* loaded from: classes6.dex */
public class f implements d {

    /* renamed from: a, reason: collision with root package name */
    Map<h, long[]> f63390a;

    public f(Map<h, long[]> map) {
        this.f63390a = map;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.d
    public long[] a(h hVar) {
        return this.f63390a.get(hVar);
    }
}
