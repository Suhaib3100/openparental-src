package com.airbnb.lottie.model.animatable;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes3.dex */
abstract class n<V, O> implements m<V, O> {

    /* renamed from: a, reason: collision with root package name */
    final List<com.airbnb.lottie.value.a<V>> f38968a;

    n(V v4) {
        this(Collections.singletonList(new com.airbnb.lottie.value.a(v4)));
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean o() {
        if (this.f38968a.isEmpty()) {
            return true;
        }
        return this.f38968a.size() == 1 && this.f38968a.get(0).h();
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<V>> q() {
        return this.f38968a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f38968a.isEmpty()) {
            sb.append(ProtectedSandApp.s("ģ"));
            sb.append(Arrays.toString(this.f38968a.toArray()));
        }
        return sb.toString();
    }

    n(List<com.airbnb.lottie.value.a<V>> list) {
        this.f38968a = list;
    }
}
