package com.google.common.escape;

import com.google.common.base.x;

/* compiled from: Escaper.java */
@f
@f9.f("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@d9.b
/* loaded from: classes6.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final x<String, String> f56700a = new x() { // from class: com.google.common.escape.g
        @Override // com.google.common.base.x
        public final Object apply(Object obj) {
            return h.this.b((String) obj);
        }
    };

    protected h() {
    }

    public final x<String, String> a() {
        return this.f56700a;
    }

    public abstract String b(String str);
}
