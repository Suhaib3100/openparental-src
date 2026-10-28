package com.google.android.datatransport.runtime;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes5.dex */
final class t implements com.google.android.datatransport.m {

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.google.android.datatransport.e> f52300a;

    /* renamed from: b, reason: collision with root package name */
    private final s f52301b;

    /* renamed from: c, reason: collision with root package name */
    private final w f52302c;

    t(Set<com.google.android.datatransport.e> set, s sVar, w wVar) {
        this.f52300a = set;
        this.f52301b = sVar;
        this.f52302c = wVar;
    }

    @Override // com.google.android.datatransport.m
    public <T> com.google.android.datatransport.l<T> a(String str, Class<T> cls, com.google.android.datatransport.k<T, byte[]> kVar) {
        return b(str, cls, com.google.android.datatransport.e.b(ProtectedSandApp.s("욦")), kVar);
    }

    @Override // com.google.android.datatransport.m
    public <T> com.google.android.datatransport.l<T> b(String str, Class<T> cls, com.google.android.datatransport.e eVar, com.google.android.datatransport.k<T, byte[]> kVar) {
        if (this.f52300a.contains(eVar)) {
            return new v(this.f52301b, str, eVar, kVar, this.f52302c);
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("욧"), eVar, this.f52300a));
    }
}
