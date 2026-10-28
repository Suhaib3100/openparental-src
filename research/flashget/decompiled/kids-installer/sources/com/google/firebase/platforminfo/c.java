package com.google.firebase.platforminfo;

import com.google.firebase.components.r;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.n;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes3.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f17696a;

    /* renamed from: b, reason: collision with root package name */
    private final d f17697b;

    c(Set<f> set, d dVar) {
        this.f17696a = e(set);
        this.f17697b = dVar;
    }

    public static com.google.firebase.components.c<i> c() {
        return com.google.firebase.components.c.h(i.class).b(r.q(f.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.platforminfo.b
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                i d6;
                d6 = c.d(dVar);
                return d6;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(com.google.firebase.components.d dVar) {
        return new c(dVar.i(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append(n.f32060b);
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.i
    public String a() {
        if (this.f17697b.b().isEmpty()) {
            return this.f17696a;
        }
        return this.f17696a + ' ' + e(this.f17697b.b());
    }
}
