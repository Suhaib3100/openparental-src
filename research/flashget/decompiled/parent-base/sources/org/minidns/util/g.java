package org.minidns.util;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* compiled from: InetAddressUtil.java */
/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f87566a = Pattern.compile("\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f87567b = Pattern.compile("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))");

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f87568c = false;

    public static InetAddress a(CharSequence charSequence) {
        if (!d(charSequence)) {
            return null;
        }
        try {
            return InetAddress.getByName(charSequence.toString());
        } catch (UnknownHostException e4) {
            throw new AssertionError(e4);
        }
    }

    public static Inet4Address b(CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet4Address) {
                return (Inet4Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (UnknownHostException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static Inet6Address c(CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet6Address) {
                return (Inet6Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (UnknownHostException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static boolean d(CharSequence charSequence) {
        return f(charSequence) || e(charSequence);
    }

    public static boolean e(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        return f87566a.matcher(charSequence).matches();
    }

    public static boolean f(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        return f87567b.matcher(charSequence).matches();
    }

    public static org.minidns.dnsname.a g(Inet4Address inet4Address) {
        return org.minidns.dnsname.a.l(inet4Address.getHostAddress().split("\\."));
    }

    public static org.minidns.dnsname.a h(Inet6Address inet6Address) {
        String[] split = inet6Address.getHostAddress().split(":");
        String[] strArr = new String[32];
        int i4 = 0;
        for (int length = split.length - 1; length >= 0; length--) {
            String str = split[length];
            int length2 = 4 - str.length();
            int i5 = 0;
            while (i5 < length2) {
                strArr[i4] = "0";
                i5++;
                i4++;
            }
            int i6 = 0;
            while (i6 < str.length()) {
                strArr[i4] = Character.toString(str.charAt(i6));
                i6++;
                i4++;
            }
        }
        return org.minidns.dnsname.a.l(strArr);
    }
}
