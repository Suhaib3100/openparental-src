package org.mp4parser.aspectj.internal.lang.reflect;

import lg.a0;

/* compiled from: DeclareErrorOrWarningImpl.java */
/* loaded from: classes9.dex */
public class d implements lg.j {

    /* renamed from: a, reason: collision with root package name */
    private a0 f87629a;

    /* renamed from: b, reason: collision with root package name */
    private String f87630b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f87631c;

    /* renamed from: d, reason: collision with root package name */
    private lg.d f87632d;

    public d(String str, String str2, boolean z4, lg.d dVar) {
        this.f87629a = new n(str);
        this.f87630b = str2;
        this.f87631c = z4;
        this.f87632d = dVar;
    }

    @Override // lg.j
    public lg.d a() {
        return this.f87632d;
    }

    @Override // lg.j
    public a0 d() {
        return this.f87629a;
    }

    @Override // lg.j
    public String getMessage() {
        return this.f87630b;
    }

    @Override // lg.j
    public boolean isError() {
        return this.f87631c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("declare ");
        stringBuffer.append(isError() ? "error : " : "warning : ");
        stringBuffer.append(d().a());
        stringBuffer.append(" : \"");
        stringBuffer.append(getMessage());
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
