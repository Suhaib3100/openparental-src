package com.lyft.kronos.internal.ntp;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DnsResolver.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/lyft/kronos/internal/ntp/d;", "Lcom/lyft/kronos/internal/ntp/c;", "<init>", "()V", "", "host", "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)Ljava/net/InetAddress;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d implements c {
    @Override // com.lyft.kronos.internal.ntp.c
    @l
    public InetAddress a(@l String host) throws UnknownHostException {
        l0.p(host, ProtectedSandApp.s("ᠰ\u0001"));
        InetAddress byName = InetAddress.getByName(host);
        l0.o(byName, ProtectedSandApp.s("ᠱ\u0001"));
        return byName;
    }
}
