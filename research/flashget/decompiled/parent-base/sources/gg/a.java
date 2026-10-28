package gg;

import org.minidns.dnslabel.DnsLabel;

/* compiled from: SrvProto.java */
/* loaded from: classes9.dex */
public enum a {
    tcp,
    udp;

    public final DnsLabel dnsLabel = DnsLabel.f("_" + name());

    a() {
    }
}
