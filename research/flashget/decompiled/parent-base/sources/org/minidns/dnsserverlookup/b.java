package org.minidns.dnsserverlookup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import kotlin.text.m0;
import org.minidns.util.i;

/* compiled from: AndroidUsingExec.java */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f87301c = 999;

    /* renamed from: d, reason: collision with root package name */
    private static final String f87302d = "]: [";

    /* renamed from: b, reason: collision with root package name */
    public static final d f87300b = new b();

    private b() {
        super(b.class.getSimpleName(), 999);
    }

    protected static Set<String> a(BufferedReader bufferedReader, boolean z4) throws UnknownHostException, IOException {
        String hostAddress;
        HashSet hashSet = new HashSet(6);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return hashSet;
            }
            int indexOf = readLine.indexOf("]: [");
            if (indexOf != -1) {
                String substring = readLine.substring(1, indexOf);
                int i4 = indexOf + 4;
                int length = readLine.length() - 1;
                if (length >= i4) {
                    String substring2 = readLine.substring(i4, length);
                    if (!substring2.isEmpty() && (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4"))) {
                        InetAddress byName = InetAddress.getByName(substring2);
                        if (byName != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0) {
                            hashSet.add(hostAddress);
                        }
                    }
                } else if (z4) {
                    a.LOGGER.warning("Malformed property detected: \"" + readLine + m0.quote);
                }
            }
        }
    }

    @Override // org.minidns.dnsserverlookup.a, org.minidns.dnsserverlookup.d
    public List<String> getDnsServerAddresses() {
        try {
            Set<String> a5 = a(new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream(), StandardCharsets.UTF_8)), true);
            if (a5.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(a5.size());
            arrayList.addAll(a5);
            return arrayList;
        } catch (IOException e4) {
            a.LOGGER.log(Level.WARNING, "Exception in findDNSByExec", (Throwable) e4);
            return null;
        }
    }

    @Override // org.minidns.dnsserverlookup.d
    public boolean isAvailable() {
        return i.a();
    }
}
