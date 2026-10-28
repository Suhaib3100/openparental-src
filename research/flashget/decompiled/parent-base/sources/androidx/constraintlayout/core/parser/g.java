package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* compiled from: CLObject.java */
/* loaded from: classes.dex */
public class g extends c implements Iterable<e> {

    /* compiled from: CLObject.java */
    private class a implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        g f22615b;

        /* renamed from: c, reason: collision with root package name */
        int f22616c = 0;

        public a(g gVar) {
            this.f22615b = gVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22616c < this.f22615b.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            e eVar = (e) this.f22615b.f22605i.get(this.f22616c);
            this.f22616c++;
            return eVar;
        }
    }

    public g(char[] cArr) {
        super(cArr);
    }

    public static g l0(char[] cArr) {
        return new g(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String F(int i4, int i5) {
        StringBuilder sb = new StringBuilder(h());
        sb.append("{\n");
        Iterator<d> it = this.f22605i.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            d next = it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(",\n");
            }
            sb.append(next.F(d.f22607h + i4, i5 - 1));
        }
        sb.append("\n");
        b(sb, i4);
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String G() {
        StringBuilder sb = new StringBuilder(android.support.v4.media.c.a(new StringBuilder(), h(), "{ "));
        Iterator<d> it = this.f22605i.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            d next = it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(next.G());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<e> iterator() {
        return new a(this);
    }

    public String m0() {
        return F(0, 0);
    }
}
