package com.lyft.kronos.internal.ntp;

import fg.l;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import kotlin.Metadata;

/* compiled from: DatagramFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/lyft/kronos/internal/ntp/a;", "", "Ljava/net/DatagramSocket;", "a", "()Ljava/net/DatagramSocket;", "", "buffer", "Ljava/net/DatagramPacket;", "b", "([B)Ljava/net/DatagramPacket;", "Ljava/net/InetAddress;", "address", "", "port", "c", "([BLjava/net/InetAddress;I)Ljava/net/DatagramPacket;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface a {
    @l
    DatagramSocket a() throws SocketException;

    @l
    DatagramPacket b(@l byte[] buffer);

    @l
    DatagramPacket c(@l byte[] buffer, @l InetAddress address, int port);
}
