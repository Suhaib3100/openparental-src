package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: NewYearStrategy.java */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    static final o f83227d = new o(n.BEGIN_OF_JANUARY, Integer.MAX_VALUE);

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<o> f83228e = new b();

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f83229f = false;

    /* renamed from: a, reason: collision with root package name */
    private final List<o> f83230a;

    /* renamed from: b, reason: collision with root package name */
    private final n f83231b;

    /* renamed from: c, reason: collision with root package name */
    private final int f83232c;

    /* compiled from: NewYearStrategy.java */
    private static class b implements Comparator<o> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(o oVar, o oVar2) {
            if (oVar.f83232c < oVar2.f83232c) {
                return -1;
            }
            return oVar.f83232c > oVar2.f83232c ? 1 : 0;
        }

        b(a aVar) {
        }
    }

    o(n nVar, int i4) {
        this.f83230a = Collections.emptyList();
        this.f83231b = nVar;
        this.f83232c = i4;
    }

    static o e(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        if (readInt == 0) {
            n valueOf = n.valueOf(dataInput.readUTF());
            int readInt2 = dataInput.readInt();
            return (readInt2 == Integer.MAX_VALUE && valueOf == n.BEGIN_OF_JANUARY) ? f83227d : new o(valueOf, readInt2);
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(new o(n.valueOf(dataInput.readUTF()), dataInput.readInt()));
        }
        return new o(arrayList);
    }

    public o b(o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f83230a);
        if (arrayList.isEmpty()) {
            arrayList.add(this);
        }
        if (oVar.f83230a.isEmpty()) {
            arrayList.add(oVar);
        } else {
            arrayList.addAll(oVar.f83230a);
        }
        return new o(arrayList);
    }

    int c(h hVar) {
        int annoDomini = hVar.c().annoDomini(hVar.e());
        int size = this.f83230a.size();
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = this.f83230a.get(i5);
            if (annoDomini >= i4 && annoDomini < oVar.f83232c) {
                return oVar.f83231b.displayedYear(this, hVar);
            }
            i4 = oVar.f83232c;
        }
        return this.f83231b.displayedYear(this, hVar);
    }

    h d(j jVar, int i4) {
        return f(jVar, i4).newYear(jVar, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f83230a.equals(oVar.f83230a) && this.f83231b == oVar.f83231b && this.f83232c == oVar.f83232c;
    }

    n f(j jVar, int i4) {
        int annoDomini = jVar.annoDomini(i4);
        int size = this.f83230a.size();
        int i5 = Integer.MIN_VALUE;
        n nVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = this.f83230a.get(i6);
            if (annoDomini >= i5 && annoDomini < oVar.f83232c) {
                return oVar.f83231b;
            }
            i5 = oVar.f83232c;
            nVar = oVar.f83231b;
        }
        return (annoDomini == i5 && jVar == j.BYZANTINE && nVar == n.BEGIN_OF_SEPTEMBER) ? nVar : this.f83231b;
    }

    void g(DataOutput dataOutput) throws IOException {
        int size = this.f83230a.size();
        dataOutput.writeInt(size);
        if (size == 0) {
            dataOutput.writeUTF(this.f83231b.name());
            dataOutput.writeInt(this.f83232c);
            return;
        }
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = this.f83230a.get(i4);
            dataOutput.writeUTF(oVar.f83231b.name());
            dataOutput.writeInt(oVar.f83232c);
        }
    }

    public int hashCode() {
        return (this.f83231b.hashCode() * 37) + (this.f83230a.hashCode() * 17) + this.f83232c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = this.f83230a.isEmpty();
        String s4 = ProtectedSandApp.s("雂\u0001");
        if (isEmpty) {
            sb.append('[');
            sb.append(this.f83231b);
            if (this.f83232c != Integer.MAX_VALUE) {
                sb.append(s4);
                sb.append(this.f83232c);
            }
        } else {
            boolean z4 = true;
            for (o oVar : this.f83230a) {
                if (z4) {
                    sb.append('[');
                    z4 = false;
                } else {
                    sb.append(',');
                }
                sb.append(oVar.f83231b);
                sb.append(s4);
                sb.append(oVar.f83232c);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    o(List<o> list) {
        Collections.sort(list, f83228e);
        Iterator<o> it = list.iterator();
        o oVar = null;
        while (it.hasNext()) {
            o next = it.next();
            if (oVar == null || next.f83232c != oVar.f83232c) {
                oVar = next;
            } else if (next.f83231b == oVar.f83231b) {
                it.remove();
            } else {
                throw new IllegalArgumentException(ProtectedSandApp.s("雁\u0001") + list);
            }
        }
        this.f83230a = Collections.unmodifiableList(list);
        this.f83231b = n.BEGIN_OF_JANUARY;
        this.f83232c = Integer.MAX_VALUE;
    }
}
