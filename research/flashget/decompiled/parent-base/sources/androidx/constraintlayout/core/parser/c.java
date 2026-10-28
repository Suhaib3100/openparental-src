package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CLContainer.java */
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: i, reason: collision with root package name */
    ArrayList<d> f22605i;

    public c(char[] cArr) {
        super(cArr);
        this.f22605i = new ArrayList<>();
    }

    public static d I(char[] cArr) {
        return new c(cArr);
    }

    public void H(d dVar) {
        this.f22605i.add(dVar);
        if (h.f22618d) {
            System.out.println("added element " + dVar + " to " + this);
        }
    }

    public boolean J(int i4) throws CLParsingException {
        d K = K(i4);
        if (K instanceof j) {
            return ((j) K).I();
        }
        throw new CLParsingException(android.support.v4.media.a.a("no boolean at index ", i4), this);
    }

    public d K(int i4) throws CLParsingException {
        if (i4 < 0 || i4 >= this.f22605i.size()) {
            throw new CLParsingException(android.support.v4.media.a.a("no element at index ", i4), this);
        }
        return this.f22605i.get(i4);
    }

    public d L(String str) throws CLParsingException {
        Iterator<d> it = this.f22605i.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.c().equals(str)) {
                return eVar.n0();
            }
        }
        throw new CLParsingException(android.support.v4.media.d.a("no element for key <", str, ">"), this);
    }

    public a O(int i4) throws CLParsingException {
        d K = K(i4);
        if (K instanceof a) {
            return (a) K;
        }
        throw new CLParsingException(android.support.v4.media.a.a("no array at index ", i4), this);
    }

    public a P(String str) throws CLParsingException {
        d L = L(str);
        if (L instanceof a) {
            return (a) L;
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("no array found for key <", str, ">, found [");
        a5.append(L.q());
        a5.append("] : ");
        a5.append(L);
        throw new CLParsingException(a5.toString(), this);
    }

    public a Q(String str) {
        d a02 = a0(str);
        if (a02 instanceof a) {
            return (a) a02;
        }
        return null;
    }

    public boolean R(String str) throws CLParsingException {
        d L = L(str);
        if (L instanceof j) {
            return ((j) L).I();
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("no boolean found for key <", str, ">, found [");
        a5.append(L.q());
        a5.append("] : ");
        a5.append(L);
        throw new CLParsingException(a5.toString(), this);
    }

    public float S(String str) throws CLParsingException {
        d L = L(str);
        if (L != null) {
            return L.j();
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("no float found for key <", str, ">, found [");
        a5.append(L.q());
        a5.append("] : ");
        a5.append(L);
        throw new CLParsingException(a5.toString(), this);
    }

    public float T(String str) {
        d a02 = a0(str);
        if (a02 instanceof f) {
            return a02.j();
        }
        return Float.NaN;
    }

    public int U(String str) throws CLParsingException {
        d L = L(str);
        if (L != null) {
            return L.l();
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("no int found for key <", str, ">, found [");
        a5.append(L.q());
        a5.append("] : ");
        a5.append(L);
        throw new CLParsingException(a5.toString(), this);
    }

    public g V(int i4) throws CLParsingException {
        d K = K(i4);
        if (K instanceof g) {
            return (g) K;
        }
        throw new CLParsingException(android.support.v4.media.a.a("no object at index ", i4), this);
    }

    public g W(String str) throws CLParsingException {
        d L = L(str);
        if (L instanceof g) {
            return (g) L;
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("no object found for key <", str, ">, found [");
        a5.append(L.q());
        a5.append("] : ");
        a5.append(L);
        throw new CLParsingException(a5.toString(), this);
    }

    public g X(String str) {
        d a02 = a0(str);
        if (a02 instanceof g) {
            return (g) a02;
        }
        return null;
    }

    public d Z(int i4) {
        if (i4 < 0 || i4 >= this.f22605i.size()) {
            return null;
        }
        return this.f22605i.get(i4);
    }

    public d a0(String str) {
        Iterator<d> it = this.f22605i.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.c().equals(str)) {
                return eVar.n0();
            }
        }
        return null;
    }

    public String b0(int i4) throws CLParsingException {
        d K = K(i4);
        if (K instanceof i) {
            return K.c();
        }
        throw new CLParsingException(android.support.v4.media.a.a("no string at index ", i4), this);
    }

    public String d0(String str) throws CLParsingException {
        d L = L(str);
        if (L instanceof i) {
            return L.c();
        }
        StringBuilder a5 = b.a("no string found for key <", str, ">, found [", L != null ? L.q() : null, "] : ");
        a5.append(L);
        throw new CLParsingException(a5.toString(), this);
    }

    public String e0(int i4) {
        d Z = Z(i4);
        if (Z instanceof i) {
            return Z.c();
        }
        return null;
    }

    public String f0(String str) {
        d a02 = a0(str);
        if (a02 instanceof i) {
            return a02.c();
        }
        return null;
    }

    public boolean g0(String str) {
        Iterator<d> it = this.f22605i.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if ((next instanceof e) && ((e) next).c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public float getFloat(int i4) throws CLParsingException {
        d K = K(i4);
        if (K != null) {
            return K.j();
        }
        throw new CLParsingException(android.support.v4.media.a.a("no float at index ", i4), this);
    }

    public int getInt(int i4) throws CLParsingException {
        d K = K(i4);
        if (K != null) {
            return K.l();
        }
        throw new CLParsingException(android.support.v4.media.a.a("no int at index ", i4), this);
    }

    public ArrayList<String> h0() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<d> it = this.f22605i.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof e) {
                arrayList.add(((e) next).c());
            }
        }
        return arrayList;
    }

    public void i0(String str, d dVar) {
        Iterator<d> it = this.f22605i.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.c().equals(str)) {
                eVar.p0(dVar);
                return;
            }
        }
        this.f22605i.add((e) e.l0(str, dVar));
    }

    public void j0(String str, float f4) {
        i0(str, new f(f4));
    }

    public void k0(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f22605i.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (((e) next).c().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f22605i.remove((d) it2.next());
        }
    }

    public int size() {
        return this.f22605i.size();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<d> it = this.f22605i.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }
}
