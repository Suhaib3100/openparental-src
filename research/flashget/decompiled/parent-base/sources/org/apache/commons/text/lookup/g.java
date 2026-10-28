package org.apache.commons.text.lookup;

/* compiled from: DefaultStringLookup.java */
/* loaded from: classes3.dex */
public enum g {
    BASE64_DECODER("base64Decoder", b0.f86489b),
    BASE64_ENCODER("base64Encoder", b0.f86490c),
    CONST("const", e.f86516e),
    DATE("date", f.f86518c),
    DNS("dns", h.f86520c),
    ENVIRONMENT("env", b0.f86491d),
    FILE("file", i.f86521c),
    JAVA("java", o.f86531c),
    LOCAL_HOST("localhost", p.f86538c),
    PROPERTIES("properties", q.f86539c),
    RESOURCE_BUNDLE("resourceBundle", r.f86541d),
    SCRIPT("script", s.f86543c),
    SYSTEM_PROPERTIES("sys", b0.f86493f),
    URL("url", e0.f86517c),
    URL_DECODER("urlDecoder", c0.f86512c),
    URL_ENCODER("urlEncoder", d0.f86513c),
    XML("xml", f0.f86519c);

    private final String key;
    private final t lookup;

    static {
        b0 b0Var = b0.f86488a;
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
        b0Var.getClass();
    }

    g(String str, t tVar) {
        this.key = str;
        this.lookup = tVar;
    }

    public String getKey() {
        return this.key;
    }

    public t getStringLookup() {
        return this.lookup;
    }
}
