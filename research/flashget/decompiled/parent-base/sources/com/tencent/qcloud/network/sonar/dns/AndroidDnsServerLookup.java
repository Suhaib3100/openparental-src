package com.tencent.qcloud.network.sonar.dns;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import org.minidns.dnsserverlookup.a;
import org.minidns.util.i;

/* loaded from: classes7.dex */
public class AndroidDnsServerLookup extends a {
    public static final int PRIORITY = 1000;
    private final Context context;

    public AndroidDnsServerLookup(Context context) {
        super(ProtectedSandApp.s("嫱\u0001"), 1000);
        this.context = context.getApplicationContext();
    }

    @Override // org.minidns.dnsserverlookup.a, org.minidns.dnsserverlookup.d
    public List<String> getDnsServerAddresses() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService(ProtectedSandApp.s("嫲\u0001"));
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
            ArrayList arrayList = new ArrayList();
            Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getHostAddress());
            }
            return arrayList;
        } catch (Exception e4) {
            a.LOGGER.log(Level.WARNING, ProtectedSandApp.s("嫳\u0001"), (Throwable) e4);
            return null;
        }
    }

    @Override // org.minidns.dnsserverlookup.d
    public boolean isAvailable() {
        return i.a();
    }
}
