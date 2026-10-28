package org.minidns.dnsname;

/* loaded from: classes4.dex */
public abstract class InvalidDnsNameException extends IllegalStateException {

    /* renamed from: c, reason: collision with root package name */
    private static final long f87212c = 1;

    /* renamed from: b, reason: collision with root package name */
    protected final String f87213b;

    public static class DNSNameTooLongException extends InvalidDnsNameException {

        /* renamed from: e, reason: collision with root package name */
        private static final long f87214e = 1;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f87215d;

        public DNSNameTooLongException(String str, byte[] bArr) {
            super(str);
            this.f87215d = bArr;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder("The DNS name '");
            sb.append(this.f87213b);
            sb.append("' exceeds the maximum name length of 255 octets by ");
            sb.append(this.f87215d.length - 255);
            sb.append(" octets.");
            return sb.toString();
        }
    }

    public static class LabelTooLongException extends InvalidDnsNameException {

        /* renamed from: e, reason: collision with root package name */
        private static final long f87216e = 1;

        /* renamed from: d, reason: collision with root package name */
        private final String f87217d;

        public LabelTooLongException(String str, String str2) {
            super(str);
            this.f87217d = str2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder("The DNS name '");
            sb.append(this.f87213b);
            sb.append("' contains the label '");
            sb.append(this.f87217d);
            sb.append("' which exceeds the maximum label length of 63 octets by ");
            sb.append(this.f87217d.length() - 63);
            sb.append(" octets.");
            return sb.toString();
        }
    }

    protected InvalidDnsNameException(String str) {
        this.f87213b = str;
    }
}
