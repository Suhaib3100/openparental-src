package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: MembersInjectors.java */
/* loaded from: classes2.dex */
public final class n {

    /* compiled from: MembersInjectors.java */
    /* loaded from: classes3.dex */
    private enum a implements h1.g<Object> {
        INSTANCE;

        @Override // h1.g
        public void injectMembers(Object obj) {
            p.c(obj, ProtectedSandApp.s("⁑"));
        }
    }

    private n() {
    }

    public static <T> h1.g<T> a() {
        return a.INSTANCE;
    }
}
