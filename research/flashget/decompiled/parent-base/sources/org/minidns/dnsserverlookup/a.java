package org.minidns.dnsserverlookup;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: AbstractDnsServerLookupMechanism.java */
/* loaded from: classes.dex */
public abstract class a implements d {
    protected static final Logger LOGGER = Logger.getLogger(a.class.getName());
    private final String name;
    private final int priority;

    protected a(String str, int i4) {
        this.name = str;
        this.priority = i4;
    }

    protected static List<String> toListOfStrings(Collection<? extends InetAddress> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends InetAddress> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getHostAddress());
        }
        return arrayList;
    }

    @Override // org.minidns.dnsserverlookup.d
    public abstract List<String> getDnsServerAddresses();

    @Override // org.minidns.dnsserverlookup.d
    public final String getName() {
        return this.name;
    }

    @Override // org.minidns.dnsserverlookup.d
    public final int getPriority() {
        return this.priority;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        return Integer.compare(getPriority(), dVar.getPriority());
    }
}
