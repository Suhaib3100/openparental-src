package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* compiled from: CLArray.java */
/* loaded from: classes.dex */
public class a extends c {
    public a(char[] cArr) {
        super(cArr);
    }

    public static d I(char[] cArr) {
        return new a(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String F(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        String G = G();
        if (i5 > 0 || G.length() + i4 >= d.f22606g) {
            sb.append("[\n");
            Iterator<d> it = this.f22605i.iterator();
            boolean z4 = true;
            while (it.hasNext()) {
                d next = it.next();
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(",\n");
                }
                b(sb, d.f22607h + i4);
                sb.append(next.F(d.f22607h + i4, i5 - 1));
            }
            sb.append("\n");
            b(sb, i4);
            sb.append("]");
        } else {
            sb.append(G);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String G() {
        StringBuilder sb = new StringBuilder(android.support.v4.media.c.a(new StringBuilder(), h(), "["));
        boolean z4 = true;
        for (int i4 = 0; i4 < this.f22605i.size(); i4++) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.f22605i.get(i4).G());
        }
        return ((Object) sb) + "]";
    }
}
