package bolts;

import bolts.h;

/* compiled from: UnobservedErrorNotifier.java */
/* loaded from: classes3.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private h<?> f36943a;

    public j(h<?> hVar) {
        this.f36943a = hVar;
    }

    public void a() {
        this.f36943a = null;
    }

    protected void finalize() throws Throwable {
        h.q G;
        try {
            h<?> hVar = this.f36943a;
            if (hVar != null && (G = h.G()) != null) {
                G.a(hVar, new UnobservedTaskException(hVar.E()));
            }
        } finally {
            super.finalize();
        }
    }
}
