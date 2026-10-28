package org.minidns.source;

import java.io.IOException;
import java.net.InetAddress;
import org.minidns.f;

/* compiled from: DnsDataSource.java */
/* loaded from: classes9.dex */
public interface b {

    /* compiled from: DnsDataSource.java */
    public interface a {
        void a(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar);
    }

    org.minidns.dnsqueryresult.c a(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException;

    f<org.minidns.dnsqueryresult.c, IOException> b(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4, a aVar2);

    int c();

    void d(int i4);

    int e();
}
