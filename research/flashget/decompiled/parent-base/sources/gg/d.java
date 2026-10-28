package gg;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'xmpp_client' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: SrvType.java */
/* loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d xmpp_client;
    public static final d xmpp_server;
    public final a proto;
    public final b service;

    static {
        b bVar = b.xmpp_client;
        a aVar = a.tcp;
        d dVar = new d("xmpp_client", 0, bVar, aVar);
        xmpp_client = dVar;
        d dVar2 = new d("xmpp_server", 1, b.xmpp_server, aVar);
        xmpp_server = dVar2;
        $VALUES = new d[]{dVar, dVar2};
    }

    private d(String str, int i4, b bVar, a aVar) {
        this.service = bVar;
        this.proto = aVar;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
