package hg;

import java.net.IDN;

/* compiled from: DefaultIdnaTransformator.java */
/* loaded from: classes9.dex */
public class a implements b {
    @Override // hg.b
    public String a(String str) {
        return IDN.toUnicode(str);
    }

    @Override // hg.b
    public String b(String str) {
        org.minidns.dnsname.a aVar = org.minidns.dnsname.a.f87222q;
        return aVar.f87227b.equals(str) ? aVar.f87227b : IDN.toASCII(str);
    }
}
