package org.minidns.iterative;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.minidns.iterative.IterativeClientException;

/* compiled from: ResolutionState.java */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f87413d = false;

    /* renamed from: a, reason: collision with root package name */
    private final a f87414a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<InetAddress, Set<org.minidns.dnsmessage.b>> f87415b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private int f87416c;

    c(a aVar) {
        this.f87414a = aVar;
    }

    void a() {
        this.f87416c--;
    }

    void b(InetAddress inetAddress, org.minidns.dnsmessage.a aVar) throws IterativeClientException.LoopDetected, IterativeClientException.MaxIterativeStepsReached {
        org.minidns.dnsmessage.b y4 = aVar.y();
        if (!this.f87415b.containsKey(inetAddress)) {
            this.f87415b.put(inetAddress, new HashSet());
        } else if (this.f87415b.get(inetAddress).contains(y4)) {
            throw new IterativeClientException.LoopDetected(inetAddress, y4);
        }
        int i4 = this.f87416c + 1;
        this.f87416c = i4;
        if (i4 > this.f87414a.f87400j) {
            throw new IterativeClientException.MaxIterativeStepsReached();
        }
        this.f87415b.get(inetAddress).add(y4);
    }
}
