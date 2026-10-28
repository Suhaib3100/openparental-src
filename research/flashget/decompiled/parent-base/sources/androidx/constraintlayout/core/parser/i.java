package androidx.constraintlayout.core.parser;

/* compiled from: CLString.java */
/* loaded from: classes.dex */
public class i extends d {
    public i(char[] cArr) {
        super(cArr);
    }

    public static d H(char[] cArr) {
        return new i(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String F(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        b(sb, i4);
        sb.append("'");
        sb.append(c());
        sb.append("'");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String G() {
        return "'" + c() + "'";
    }
}
