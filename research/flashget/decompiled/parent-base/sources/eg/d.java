package eg;

/* compiled from: HandshakeImpl1Client.java */
/* loaded from: classes6.dex */
public class d extends g implements b {

    /* renamed from: c, reason: collision with root package name */
    private String f73773c = "*";

    @Override // eg.a
    public String d() {
        return this.f73773c;
    }

    @Override // eg.b
    public void h(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f73773c = str;
    }
}
