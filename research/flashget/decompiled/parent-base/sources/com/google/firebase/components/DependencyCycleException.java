package com.google.firebase.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: b, reason: collision with root package name */
    private final List<c<?>> f58407b;

    public DependencyCycleException(List<c<?>> list) {
        super(ProtectedSandApp.s("ﭞ") + Arrays.toString(list.toArray()));
        this.f58407b = list;
    }

    public List<c<?>> a() {
        return this.f58407b;
    }
}
