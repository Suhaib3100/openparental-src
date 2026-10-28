package org.minidns.dnsserverlookup;

import java.util.List;

/* compiled from: DnsServerLookupMechanism.java */
/* loaded from: classes.dex */
public interface d extends Comparable<d> {
    List<String> getDnsServerAddresses();

    String getName();

    int getPriority();

    boolean isAvailable();
}
