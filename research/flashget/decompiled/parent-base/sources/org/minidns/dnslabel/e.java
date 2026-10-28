package org.minidns.dnslabel;

/* compiled from: NonLdhLabel.java */
/* loaded from: classes4.dex */
public abstract class e extends DnsLabel {
    protected e(String str) {
        super(str);
    }

    protected static DnsLabel n(String str) {
        return i.o(str) ? new i(str) : d.o(str) ? new d(str) : new g(str);
    }
}
