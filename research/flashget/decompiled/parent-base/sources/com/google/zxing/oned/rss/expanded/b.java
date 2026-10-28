package com.google.zxing.oned.rss.expanded;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* compiled from: ExpandedPair.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.oned.rss.b f63083a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.zxing.oned.rss.b f63084b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.zxing.oned.rss.c f63085c;

    b(com.google.zxing.oned.rss.b bVar, com.google.zxing.oned.rss.b bVar2, com.google.zxing.oned.rss.c cVar) {
        this.f63083a = bVar;
        this.f63084b = bVar2;
        this.f63085c = cVar;
    }

    com.google.zxing.oned.rss.c a() {
        return this.f63085c;
    }

    com.google.zxing.oned.rss.b b() {
        return this.f63083a;
    }

    com.google.zxing.oned.rss.b c() {
        return this.f63084b;
    }

    boolean d() {
        return this.f63084b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f63083a, bVar.f63083a) && Objects.equals(this.f63084b, bVar.f63084b) && Objects.equals(this.f63085c, bVar.f63085c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f63083a) ^ Objects.hashCode(this.f63084b)) ^ Objects.hashCode(this.f63085c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("୪\u0001"));
        sb.append(this.f63083a);
        sb.append(ProtectedSandApp.s("୫\u0001"));
        sb.append(this.f63084b);
        sb.append(ProtectedSandApp.s("୬\u0001"));
        com.google.zxing.oned.rss.c cVar = this.f63085c;
        return i.a(sb, cVar == null ? ProtectedSandApp.s("୭\u0001") : Integer.valueOf(cVar.c()), ProtectedSandApp.s("୮\u0001"));
    }
}
