package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

/* compiled from: CLKey.java */
/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: j, reason: collision with root package name */
    private static ArrayList<String> f22613j;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f22613j = arrayList;
        arrayList.add("ConstraintSets");
        f22613j.add("Variables");
        f22613j.add("Generate");
        f22613j.add("Transitions");
        f22613j.add("KeyFrames");
        f22613j.add("KeyAttributes");
        f22613j.add("KeyPositions");
        f22613j.add("KeyCycles");
    }

    public e(char[] cArr) {
        super(cArr);
    }

    public static d I(char[] cArr) {
        return new e(cArr);
    }

    public static d l0(String str, d dVar) {
        e eVar = new e(str.toCharArray());
        eVar.f22609c = 0L;
        eVar.x(str.length() - 1);
        eVar.p0(dVar);
        return eVar;
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String F(int i4, int i5) {
        StringBuilder sb = new StringBuilder(h());
        b(sb, i4);
        String c5 = c();
        if (this.f22605i.size() <= 0) {
            return androidx.compose.runtime.changelist.j.a(c5, ": <> ");
        }
        sb.append(c5);
        sb.append(": ");
        if (f22613j.contains(c5)) {
            i5 = 3;
        }
        if (i5 > 0) {
            sb.append(this.f22605i.get(0).F(i4, i5 - 1));
        } else {
            String G = this.f22605i.get(0).G();
            if (G.length() + i4 < d.f22606g) {
                sb.append(G);
            } else {
                sb.append(this.f22605i.get(0).F(i4, i5 - 1));
            }
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String G() {
        if (this.f22605i.size() <= 0) {
            return h() + c() + ": <> ";
        }
        return h() + c() + ": " + this.f22605i.get(0).G();
    }

    public String m0() {
        return c();
    }

    public d n0() {
        if (this.f22605i.size() > 0) {
            return this.f22605i.get(0);
        }
        return null;
    }

    public void p0(d dVar) {
        if (this.f22605i.size() > 0) {
            this.f22605i.set(0, dVar);
        } else {
            this.f22605i.add(dVar);
        }
    }
}
