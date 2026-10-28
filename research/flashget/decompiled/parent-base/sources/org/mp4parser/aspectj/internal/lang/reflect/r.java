package org.mp4parser.aspectj.internal.lang.reflect;

import lg.d0;
import lg.e0;
import lg.x;

/* compiled from: TypePatternBasedPerClauseImpl.java */
/* loaded from: classes9.dex */
public class r extends l implements e0 {

    /* renamed from: b, reason: collision with root package name */
    private d0 f87675b;

    public r(x xVar, String str) {
        super(xVar);
        this.f87675b = new s(str);
    }

    @Override // lg.e0
    public d0 c() {
        return this.f87675b;
    }

    @Override // org.mp4parser.aspectj.internal.lang.reflect.l
    public String toString() {
        return "pertypewithin(" + this.f87675b.a() + ")";
    }
}
