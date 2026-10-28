package com.google.android.datatransport.runtime;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes3.dex */
final class t implements com.google.android.datatransport.i {

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.google.android.datatransport.c> f12757a;

    /* renamed from: b, reason: collision with root package name */
    private final s f12758b;

    /* renamed from: c, reason: collision with root package name */
    private final w f12759c;

    t(Set<com.google.android.datatransport.c> set, s sVar, w wVar) {
        this.f12757a = set;
        this.f12758b = sVar;
        this.f12759c = wVar;
    }

    @Override // com.google.android.datatransport.i
    public <T> com.google.android.datatransport.h<T> a(String str, Class<T> cls, com.google.android.datatransport.g<T, byte[]> gVar) {
        return b(str, cls, com.google.android.datatransport.c.b(ProtectedSandApp.s("\u20f8")), gVar);
    }

    @Override // com.google.android.datatransport.i
    public <T> com.google.android.datatransport.h<T> b(String str, Class<T> cls, com.google.android.datatransport.c cVar, com.google.android.datatransport.g<T, byte[]> gVar) {
        if (this.f12757a.contains(cVar)) {
            return new v(this.f12758b, str, cVar, gVar, this.f12759c);
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\u20f9"), cVar, this.f12757a));
    }
}
