package org.minidns;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class MiniDnsException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    private static final long f87088b = 1;

    public static class ErrorResponseException extends MiniDnsException {

        /* renamed from: e, reason: collision with root package name */
        private static final long f87089e = 1;

        /* renamed from: c, reason: collision with root package name */
        private final org.minidns.dnsmessage.a f87090c;

        /* renamed from: d, reason: collision with root package name */
        private final org.minidns.dnsqueryresult.c f87091d;

        public ErrorResponseException(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar) {
            super("Received " + cVar.f87242c.f87168c + " error response\n" + cVar);
            this.f87090c = aVar;
            this.f87091d = cVar;
        }

        public org.minidns.dnsmessage.a a() {
            return this.f87090c;
        }

        public org.minidns.dnsqueryresult.c b() {
            return this.f87091d;
        }
    }

    public static class IdMismatch extends MiniDnsException {

        /* renamed from: e, reason: collision with root package name */
        private static final long f87092e = 1;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f87093f = false;

        /* renamed from: c, reason: collision with root package name */
        private final org.minidns.dnsmessage.a f87094c;

        /* renamed from: d, reason: collision with root package name */
        private final org.minidns.dnsmessage.a f87095d;

        public IdMismatch(org.minidns.dnsmessage.a aVar, org.minidns.dnsmessage.a aVar2) {
            super(c(aVar, aVar2));
            this.f87094c = aVar;
            this.f87095d = aVar2;
        }

        private static String c(org.minidns.dnsmessage.a aVar, org.minidns.dnsmessage.a aVar2) {
            return "The response's ID doesn't matches the request ID. Request: " + aVar.f87166a + ". Response: " + aVar2.f87166a;
        }

        public org.minidns.dnsmessage.a a() {
            return this.f87094c;
        }

        public org.minidns.dnsmessage.a b() {
            return this.f87095d;
        }
    }

    public static class NoQueryPossibleException extends MiniDnsException {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87096d = 1;

        /* renamed from: c, reason: collision with root package name */
        private final org.minidns.dnsmessage.a f87097c;

        public NoQueryPossibleException(org.minidns.dnsmessage.a aVar) {
            super("No DNS server could be queried");
            this.f87097c = aVar;
        }

        public org.minidns.dnsmessage.a a() {
            return this.f87097c;
        }
    }

    public static class NullResultException extends MiniDnsException {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87098d = 1;

        /* renamed from: c, reason: collision with root package name */
        private final org.minidns.dnsmessage.a f87099c;

        public NullResultException(org.minidns.dnsmessage.a aVar) {
            super("The request yielded a 'null' result while resolving.");
            this.f87099c = aVar;
        }

        public org.minidns.dnsmessage.a a() {
            return this.f87099c;
        }
    }

    protected MiniDnsException(String str) {
        super(str);
    }
}
