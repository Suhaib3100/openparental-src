package org.minidns.constants;

import com.android.internal.telephony.cdma.UserData;
import com.tencent.beacon.event.open.EventResult;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: DnsRootServer.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Character, Inet4Address> f87132a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Character, Inet6Address> f87133b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    protected static final Inet4Address[] f87134c = {e('a', 198, 41, 0, 4), e('b', 192, 228, 79, 201), e('c', 192, 33, 4, 12), e('d', EventResult.ERROR_CODE_OTHER, 7, 91, 13), e('e', 192, 203, 230, 10), e('f', 192, 5, 5, 241), e('g', 192, 112, 36, 4), e('h', 198, 97, 190, 53), e('i', 192, 36, 148, 17), e('j', 192, 58, 128, 30), e('k', 193, 0, 14, 129), e('l', EventResult.ERROR_CODE_OTHER, 7, 83, 42), e('m', 202, 12, 27, 33)};

    /* renamed from: d, reason: collision with root package name */
    protected static final Inet6Address[] f87135d = {f('a', 8193, 1283, 47678, 0, 0, 0, 2, 48), f('b', 8193, 1280, UserData.IS91_MSG_TYPE_CLI, 0, 0, 0, 0, 11), f('c', 8193, 1280, 2, 0, 0, 0, 0, 12), f('d', 8193, 1280, 45, 0, 0, 0, 0, 13), f('f', 8193, 1280, 47, 0, 0, 0, 0, 15), f('h', 8193, 1280, 1, 0, 0, 0, 0, 83), f('i', 8193, 2046, 0, 0, 0, 0, 0, 83), f('j', 8193, 1283, 3111, 0, 0, 0, 2, 48), f('l', 8193, 1280, 3, 0, 0, 0, 0, 66), f('m', 8193, 3523, 0, 0, 0, 0, 0, 53)};

    public static Inet4Address a(char c5) {
        return f87132a.get(Character.valueOf(c5));
    }

    public static Inet6Address b(char c5) {
        return f87133b.get(Character.valueOf(c5));
    }

    public static Inet4Address c(Random random) {
        Inet4Address[] inet4AddressArr = f87134c;
        return inet4AddressArr[random.nextInt(inet4AddressArr.length)];
    }

    public static Inet6Address d(Random random) {
        Inet6Address[] inet6AddressArr = f87135d;
        return inet6AddressArr[random.nextInt(inet6AddressArr.length)];
    }

    private static Inet4Address e(char c5, int i4, int i5, int i6, int i7) {
        try {
            Inet4Address inet4Address = (Inet4Address) InetAddress.getByAddress(c5 + ".root-servers.net", new byte[]{(byte) i4, (byte) i5, (byte) i6, (byte) i7});
            f87132a.put(Character.valueOf(c5), inet4Address);
            return inet4Address;
        } catch (UnknownHostException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Inet6Address f(char c5, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByAddress(c5 + ".root-servers.net", new byte[]{(byte) (i4 >> 8), (byte) i4, (byte) (i5 >> 8), (byte) i5, (byte) (i6 >> 8), (byte) i6, (byte) (i7 >> 8), (byte) i7, (byte) (i10 >> 8), (byte) i10, (byte) (i11 >> 8), (byte) i11, (byte) (i12 >> 8), (byte) i12, (byte) (i13 >> 8), (byte) i13});
            f87133b.put(Character.valueOf(c5), inet6Address);
            return inet6Address;
        } catch (UnknownHostException e4) {
            throw new RuntimeException(e4);
        }
    }
}
