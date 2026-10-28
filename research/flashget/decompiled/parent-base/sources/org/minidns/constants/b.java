package org.minidns.constants;

import java.util.HashMap;
import java.util.Map;

/* compiled from: DnssecConstants.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Byte, EnumC1350b> f87136a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Byte, a> f87137b = new HashMap();

    /* compiled from: DnssecConstants.java */
    public enum a {
        SHA1(1, "SHA-1"),
        SHA256(2, "SHA-256"),
        GOST(3, "GOST R 34.11-94"),
        SHA384(4, "SHA-384");

        public final String description;
        public final byte value;

        a(int i4, String str) {
            if (i4 < 0 || i4 > 255) {
                throw new IllegalArgumentException();
            }
            byte b5 = (byte) i4;
            this.value = b5;
            this.description = str;
            b.f87137b.put(Byte.valueOf(b5), this);
        }

        public static a forByte(byte b5) {
            return (a) b.f87137b.get(Byte.valueOf(b5));
        }
    }

    /* compiled from: DnssecConstants.java */
    /* renamed from: org.minidns.constants.b$b, reason: collision with other inner class name */
    public enum EnumC1350b {
        RSAMD5(1, "RSA/MD5"),
        DH(2, "Diffie-Hellman"),
        DSA(3, "DSA/SHA1"),
        RSASHA1(5, "RSA/SHA-1"),
        DSA_NSEC3_SHA1(6, "DSA_NSEC3-SHA1"),
        RSASHA1_NSEC3_SHA1(7, "RSASHA1-NSEC3-SHA1"),
        RSASHA256(8, "RSA/SHA-256"),
        RSASHA512(10, "RSA/SHA-512"),
        ECC_GOST(12, "GOST R 34.10-2001"),
        ECDSAP256SHA256(13, "ECDSA Curve P-256 with SHA-256"),
        ECDSAP384SHA384(14, "ECDSA Curve P-384 with SHA-384"),
        INDIRECT(252, "Reserved for Indirect Keys"),
        PRIVATEDNS(253, "private algorithm"),
        PRIVATEOID(254, "private algorithm oid");

        public final String description;
        public final byte number;

        EnumC1350b(int i4, String str) {
            if (i4 < 0 || i4 > 255) {
                throw new IllegalArgumentException();
            }
            byte b5 = (byte) i4;
            this.number = b5;
            this.description = str;
            b.f87136a.put(Byte.valueOf(b5), this);
        }

        public static EnumC1350b forByte(byte b5) {
            return (EnumC1350b) b.f87136a.get(Byte.valueOf(b5));
        }
    }

    private b() {
    }
}
