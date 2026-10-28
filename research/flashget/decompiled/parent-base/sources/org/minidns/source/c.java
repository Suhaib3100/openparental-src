package org.minidns.source;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.MiniDnsException;
import org.minidns.dnsqueryresult.c;
import org.minidns.source.a;
import org.minidns.util.MultipleIoException;

/* compiled from: NetworkDataSource.java */
/* loaded from: classes9.dex */
public class c extends org.minidns.source.a {

    /* renamed from: e, reason: collision with root package name */
    protected static final Logger f87534e = Logger.getLogger(c.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f87535f = false;

    /* compiled from: NetworkDataSource.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87536a;

        static {
            int[] iArr = new int[a.EnumC1361a.values().length];
            f87536a = iArr;
            try {
                iArr[a.EnumC1361a.dontCare.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87536a[a.EnumC1361a.udpTcp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87536a[a.EnumC1361a.tcp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected DatagramSocket j() throws SocketException {
        return new DatagramSocket();
    }

    protected Socket k() {
        return new Socket();
    }

    @Override // org.minidns.source.a, org.minidns.source.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public org.minidns.dnsqueryresult.d a(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException {
        a.EnumC1361a g4 = g();
        int i5 = a.f87536a[g4.ordinal()];
        boolean z4 = true;
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                throw new IllegalStateException("Unsupported query mode: " + g4);
            }
            z4 = false;
        }
        ArrayList arrayList = new ArrayList(2);
        org.minidns.dnsmessage.a aVar2 = null;
        if (z4) {
            try {
                aVar2 = n(aVar, inetAddress, i4);
            } catch (IOException e4) {
                arrayList.add(e4);
            }
            org.minidns.dnsmessage.a aVar3 = aVar2;
            if (aVar3 != null && !aVar3.f87171f) {
                return new org.minidns.dnsqueryresult.d(inetAddress, i4, c.a.udp, aVar, aVar3);
            }
            f87534e.log(Level.FINE, "Fallback to TCP because {0}", new Object[]{aVar3 != null ? "response is truncated" : arrayList.get(0)});
            aVar2 = aVar3;
        }
        try {
            aVar2 = m(aVar, inetAddress, i4);
        } catch (IOException e5) {
            arrayList.add(e5);
            MultipleIoException.c(arrayList);
        }
        return new org.minidns.dnsqueryresult.d(inetAddress, i4, c.a.tcp, aVar, aVar2);
    }

    protected org.minidns.dnsmessage.a m(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException {
        Socket socket;
        try {
            socket = k();
        } catch (Throwable th) {
            th = th;
            socket = null;
        }
        try {
            socket.connect(new InetSocketAddress(inetAddress, i4), this.f87531b);
            socket.setSoTimeout(this.f87531b);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            aVar.D(dataOutputStream);
            dataOutputStream.flush();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            for (int i5 = 0; i5 < readUnsignedShort; i5 += dataInputStream.read(bArr, i5, readUnsignedShort - i5)) {
            }
            org.minidns.dnsmessage.a aVar2 = new org.minidns.dnsmessage.a(bArr);
            if (aVar2.f87166a != aVar.f87166a) {
                throw new MiniDnsException.IdMismatch(aVar, aVar2);
            }
            socket.close();
            return aVar2;
        } catch (Throwable th2) {
            th = th2;
            if (socket != null) {
                socket.close();
            }
            throw th;
        }
    }

    protected org.minidns.dnsmessage.a n(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException {
        DatagramSocket datagramSocket;
        DatagramPacket b5 = aVar.b(inetAddress, i4);
        int i5 = this.f87530a;
        byte[] bArr = new byte[i5];
        try {
            datagramSocket = j();
            try {
                datagramSocket.setSoTimeout(this.f87531b);
                datagramSocket.send(b5);
                DatagramPacket datagramPacket = new DatagramPacket(bArr, i5);
                datagramSocket.receive(datagramPacket);
                org.minidns.dnsmessage.a aVar2 = new org.minidns.dnsmessage.a(datagramPacket.getData());
                if (aVar2.f87166a != aVar.f87166a) {
                    throw new MiniDnsException.IdMismatch(aVar, aVar2);
                }
                datagramSocket.close();
                return aVar2;
            } catch (Throwable th) {
                th = th;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            datagramSocket = null;
        }
    }
}
