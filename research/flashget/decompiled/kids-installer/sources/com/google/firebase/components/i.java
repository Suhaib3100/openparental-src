package com.google.firebase.components;

import java.util.List;

/* compiled from: ComponentRegistrarProcessor.java */
/* loaded from: classes2.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f15368a = new i() { // from class: com.google.firebase.components.h
        @Override // com.google.firebase.components.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<c<?>> a(ComponentRegistrar componentRegistrar);
}
