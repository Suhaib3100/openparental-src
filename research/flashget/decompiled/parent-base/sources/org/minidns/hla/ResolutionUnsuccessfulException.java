package org.minidns.hla;

import org.minidns.MiniDnsException;
import org.minidns.dnsmessage.a;

/* loaded from: classes9.dex */
public class ResolutionUnsuccessfulException extends MiniDnsException {

    /* renamed from: e, reason: collision with root package name */
    private static final long f87360e = 1;

    /* renamed from: c, reason: collision with root package name */
    public final org.minidns.dnsmessage.b f87361c;

    /* renamed from: d, reason: collision with root package name */
    public final a.d f87362d;

    public ResolutionUnsuccessfulException(org.minidns.dnsmessage.b bVar, a.d dVar) {
        super("Asking for " + bVar + " yielded an error response " + dVar);
        this.f87361c = bVar;
        this.f87362d = dVar;
    }
}
