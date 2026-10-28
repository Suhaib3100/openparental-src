package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private final String f22602b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22603c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22604d;

    public CLParsingException(String str, d dVar) {
        this.f22602b = str;
        if (dVar != null) {
            this.f22604d = dVar.q();
            this.f22603c = dVar.m();
        } else {
            this.f22604d = "unknown";
            this.f22603c = 0;
        }
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22602b);
        sb.append(" (");
        sb.append(this.f22604d);
        sb.append(" at line ");
        return android.support.v4.media.b.a(sb, this.f22603c, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
