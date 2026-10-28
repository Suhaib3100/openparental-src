package gg;

import org.minidns.dnslabel.DnsLabel;

/* compiled from: SrvService.java */
/* loaded from: classes9.dex */
public enum b {
    xmpp_client,
    xmpp_server,
    xmpps_client,
    xmpps_server;

    public final DnsLabel dnsLabel = DnsLabel.f("_" + name().replaceAll("_", "-"));

    b() {
    }
}
