package com.google.firebase.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: o, reason: collision with root package name */
    private final List<c<?>> f15330o;

    public DependencyCycleException(List<c<?>> list) {
        super(ProtectedSandApp.s("⟊") + Arrays.toString(list.toArray()));
        this.f15330o = list;
    }

    public List<c<?>> a() {
        return this.f15330o;
    }
}
