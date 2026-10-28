package net.time4j.format.expert;

import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ZoneLabels.java */
/* loaded from: classes7.dex */
class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f82974a;

    /* compiled from: ZoneLabels.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final char f82975a;

        /* renamed from: b, reason: collision with root package name */
        private final b f82976b;

        /* renamed from: c, reason: collision with root package name */
        private final b f82977c;

        /* renamed from: d, reason: collision with root package name */
        private final b f82978d;

        /* renamed from: e, reason: collision with root package name */
        private final List<net.time4j.tz.k> f82979e;

        /* JADX INFO: Access modifiers changed from: private */
        public b j(net.time4j.tz.k kVar) {
            ArrayList arrayList = new ArrayList();
            List<net.time4j.tz.k> list = this.f82979e;
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(kVar);
            return new b(this.f82975a, this.f82976b, this.f82977c, this.f82978d, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b k(b bVar) {
            return new b(this.f82975a, bVar, this.f82977c, this.f82978d, this.f82979e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b l(b bVar) {
            return new b(this.f82975a, this.f82976b, bVar, this.f82978d, this.f82979e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b m(b bVar) {
            return new b(this.f82975a, this.f82976b, this.f82977c, bVar, this.f82979e);
        }

        private b(char c5) {
            this(c5, null, null, null, null);
        }

        private b(char c5, b bVar, b bVar2, b bVar3, List<net.time4j.tz.k> list) {
            this.f82975a = c5;
            this.f82976b = bVar;
            this.f82977c = bVar2;
            this.f82978d = bVar3;
            this.f82979e = list;
        }
    }

    l0(b bVar) {
        this.f82974a = bVar;
    }

    private void a(b bVar, StringBuilder sb, List<String> list) {
        if (bVar == null) {
            return;
        }
        a(bVar.f82976b, sb, list);
        if (bVar.f82979e != null) {
            list.add(sb.toString() + bVar.f82975a);
        }
        b bVar2 = bVar.f82977c;
        sb.append(bVar.f82975a);
        a(bVar2, sb, list);
        sb.deleteCharAt(sb.length() - 1);
        a(bVar.f82978d, sb, list);
    }

    private static b c(b bVar, String str, int i4) {
        if (bVar == null) {
            return null;
        }
        char charAt = str.charAt(i4);
        return charAt < bVar.f82975a ? c(bVar.f82976b, str, i4) : charAt > bVar.f82975a ? c(bVar.f82978d, str, i4) : i4 < str.length() + (-1) ? c(bVar.f82977c, str, i4 + 1) : bVar;
    }

    static b d(b bVar, String str, net.time4j.tz.k kVar) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("铼\u0001"));
        }
        if (kVar != null) {
            return e(bVar, str, kVar, 0);
        }
        throw new NullPointerException(ProtectedSandApp.s("铻\u0001"));
    }

    private static b e(b bVar, String str, net.time4j.tz.k kVar, int i4) {
        char charAt = str.charAt(i4);
        if (bVar == null) {
            bVar = new b(charAt);
        }
        return charAt < bVar.f82975a ? bVar.k(e(bVar.f82976b, str, kVar, i4)) : charAt > bVar.f82975a ? bVar.m(e(bVar.f82978d, str, kVar, i4)) : i4 < str.length() + (-1) ? bVar.l(e(bVar.f82977c, str, kVar, i4 + 1)) : bVar.j(kVar);
    }

    List<net.time4j.tz.k> b(String str) {
        if (str.isEmpty()) {
            return Collections.emptyList();
        }
        b c5 = c(this.f82974a, str, 0);
        return c5 == null ? Collections.emptyList() : Collections.unmodifiableList(c5.f82979e);
    }

    String f(CharSequence charSequence, int i4) {
        b bVar = this.f82974a;
        int length = charSequence.length();
        int i5 = i4;
        int i6 = i5;
        while (bVar != null && i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt < bVar.f82975a) {
                bVar = bVar.f82976b;
            } else if (charAt > bVar.f82975a) {
                bVar = bVar.f82978d;
            } else {
                i5++;
                if (bVar.f82979e != null) {
                    i6 = i5;
                }
                bVar = bVar.f82977c;
            }
        }
        return i4 >= i6 ? "" : charSequence.subSequence(i4, i6).toString();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        a(this.f82974a, new StringBuilder(), arrayList);
        StringBuilder a5 = j4.a(ProtectedSandApp.s("铽\u0001"));
        a5.append(arrayList.size());
        a5.append(ProtectedSandApp.s("链\u0001"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            a5.append(str);
            a5.append(ProtectedSandApp.s("铿\u0001"));
            a5.append(b(str));
            a5.append(',');
        }
        a5.deleteCharAt(a5.length() - 1).append('}');
        return a5.toString();
    }
}
