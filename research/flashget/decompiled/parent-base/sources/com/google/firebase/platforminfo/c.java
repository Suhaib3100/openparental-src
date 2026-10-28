package com.google.firebase.platforminfo;

import com.google.firebase.components.r;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes6.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f60366a;

    /* renamed from: b, reason: collision with root package name */
    private final d f60367b;

    c(Set<f> set, d dVar) {
        this.f60366a = e(set);
        this.f60367b = dVar;
    }

    public static com.google.firebase.components.c<i> c() {
        return com.google.firebase.components.c.h(i.class).b(r.q(f.class)).f(new b()).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(com.google.firebase.components.d dVar) {
        return new c(dVar.h(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.i
    public String a() {
        if (this.f60367b.b().isEmpty()) {
            return this.f60366a;
        }
        return this.f60366a + ' ' + e(this.f60367b.b());
    }
}
