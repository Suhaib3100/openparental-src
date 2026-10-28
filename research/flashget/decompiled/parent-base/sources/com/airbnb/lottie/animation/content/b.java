package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<v> f38665a = new ArrayList();

    void a(v vVar) {
        this.f38665a.add(vVar);
    }

    public void b(Path path) {
        for (int size = this.f38665a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.j.b(path, this.f38665a.get(size));
        }
    }
}
