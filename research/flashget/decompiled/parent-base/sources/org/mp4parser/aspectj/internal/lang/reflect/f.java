package org.mp4parser.aspectj.internal.lang.reflect;

import java.util.StringTokenizer;
import lg.d0;

/* compiled from: DeclarePrecedenceImpl.java */
/* loaded from: classes9.dex */
public class f implements lg.l {

    /* renamed from: a, reason: collision with root package name */
    private lg.d<?> f87640a;

    /* renamed from: b, reason: collision with root package name */
    private d0[] f87641b;

    /* renamed from: c, reason: collision with root package name */
    private String f87642c;

    public f(String str, lg.d dVar) {
        this.f87640a = dVar;
        this.f87642c = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str.startsWith("(") ? androidx.core.content.f.a(str, 1, 1) : str, ",");
        this.f87641b = new d0[stringTokenizer.countTokens()];
        int i4 = 0;
        while (true) {
            d0[] d0VarArr = this.f87641b;
            if (i4 >= d0VarArr.length) {
                return;
            }
            d0VarArr[i4] = new s(stringTokenizer.nextToken().trim());
            i4++;
        }
    }

    @Override // lg.l
    public lg.d a() {
        return this.f87640a;
    }

    @Override // lg.l
    public d0[] b() {
        return this.f87641b;
    }

    public String toString() {
        return "declare precedence : " + this.f87642c;
    }
}
