package com.lyft.kronos.internal.ntp;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DatagramFactory.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/lyft/kronos/internal/ntp/b;", "Lcom/lyft/kronos/internal/ntp/a;", "<init>", "()V", "Ljava/net/DatagramSocket;", "a", "()Ljava/net/DatagramSocket;", "", "buffer", "Ljava/net/DatagramPacket;", "b", "([B)Ljava/net/DatagramPacket;", "Ljava/net/InetAddress;", "address", "", "port", "c", "([BLjava/net/InetAddress;I)Ljava/net/DatagramPacket;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b implements a {
    @Override // com.lyft.kronos.internal.ntp.a
    @l
    public DatagramSocket a() throws SocketException {
        return new DatagramSocket();
    }

    @Override // com.lyft.kronos.internal.ntp.a
    @l
    public DatagramPacket b(@l byte[] buffer) {
        l0.p(buffer, ProtectedSandApp.s("ᠮ\u0001"));
        return new DatagramPacket(buffer, buffer.length);
    }

    @Override // com.lyft.kronos.internal.ntp.a
    @l
    public DatagramPacket c(@l byte[] buffer, @l InetAddress address, int port) {
        l0.p(buffer, ProtectedSandApp.s("ᠮ\u0001"));
        l0.p(address, ProtectedSandApp.s("ᠯ\u0001"));
        return new DatagramPacket(buffer, buffer.length, address, port);
    }
}
