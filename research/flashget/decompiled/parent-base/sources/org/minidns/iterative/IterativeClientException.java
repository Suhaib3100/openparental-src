package org.minidns.iterative;

import java.net.InetAddress;
import org.minidns.MiniDnsException;

/* loaded from: classes9.dex */
public abstract class IterativeClientException extends MiniDnsException {

    /* renamed from: c, reason: collision with root package name */
    private static final long f87391c = 1;

    public static class LoopDetected extends IterativeClientException {

        /* renamed from: f, reason: collision with root package name */
        private static final long f87392f = 1;

        /* renamed from: d, reason: collision with root package name */
        public final InetAddress f87393d;

        /* renamed from: e, reason: collision with root package name */
        public final org.minidns.dnsmessage.b f87394e;

        public LoopDetected(InetAddress inetAddress, org.minidns.dnsmessage.b bVar) {
            super("Resolution loop detected: We already asked " + inetAddress + " about " + bVar);
            this.f87393d = inetAddress;
            this.f87394e = bVar;
        }
    }

    public static class MaxIterativeStepsReached extends IterativeClientException {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87395d = 1;

        public MaxIterativeStepsReached() {
            super("Maxmimum steps reached");
        }
    }

    public static class NotAuthoritativeNorGlueRrFound extends IterativeClientException {

        /* renamed from: g, reason: collision with root package name */
        private static final long f87396g = 1;

        /* renamed from: d, reason: collision with root package name */
        private final org.minidns.dnsmessage.a f87397d;

        /* renamed from: e, reason: collision with root package name */
        private final org.minidns.dnsqueryresult.c f87398e;

        /* renamed from: f, reason: collision with root package name */
        private final org.minidns.dnsname.a f87399f;

        public NotAuthoritativeNorGlueRrFound(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar, org.minidns.dnsname.a aVar2) {
            super("Did not receive an authoritative answer, nor did the result contain any glue records");
            this.f87397d = aVar;
            this.f87398e = cVar;
            this.f87399f = aVar2;
        }

        public org.minidns.dnsname.a a() {
            return this.f87399f;
        }

        public org.minidns.dnsmessage.a b() {
            return this.f87397d;
        }

        public org.minidns.dnsqueryresult.c c() {
            return this.f87398e;
        }
    }

    protected IterativeClientException(String str) {
        super(str);
    }
}
