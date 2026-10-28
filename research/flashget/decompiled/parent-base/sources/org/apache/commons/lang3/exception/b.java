package org.apache.commons.lang3.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.tuple.e;

/* compiled from: DefaultExceptionContext.java */
/* loaded from: classes6.dex */
public class b implements c, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f85990c = 20110706;

    /* renamed from: b, reason: collision with root package name */
    private final List<e<String, Object>> f85991b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(String str, e eVar) {
        return b1.R(str, (CharSequence) eVar.c());
    }

    @Override // org.apache.commons.lang3.exception.c
    public Set<String> a() {
        HashSet hashSet = new HashSet();
        Iterator<e<String, Object>> it = this.f85991b.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        return hashSet;
    }

    @Override // org.apache.commons.lang3.exception.c
    public List<e<String, Object>> b() {
        return this.f85991b;
    }

    @Override // org.apache.commons.lang3.exception.c
    public String c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        if (!this.f85991b.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Exception Context:\n");
            int i4 = 0;
            for (e<String, Object> eVar : this.f85991b) {
                sb.append("\t[");
                i4++;
                sb.append(i4);
                sb.append(':');
                sb.append(eVar.c());
                sb.append("=");
                Object value = eVar.getValue();
                if (value == null) {
                    sb.append("null");
                } else {
                    try {
                        str2 = value.toString();
                    } catch (Exception e4) {
                        str2 = "Exception thrown on toString(): " + d.l(e4);
                    }
                    sb.append(str2);
                }
                sb.append("]\n");
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }

    @Override // org.apache.commons.lang3.exception.c
    public Object d(String str) {
        for (e<String, Object> eVar : this.f85991b) {
            if (b1.R(str, eVar.c())) {
                return eVar.getValue();
            }
        }
        return null;
    }

    @Override // org.apache.commons.lang3.exception.c
    public List<Object> f(String str) {
        ArrayList arrayList = new ArrayList();
        for (e<String, Object> eVar : this.f85991b) {
            if (b1.R(str, eVar.c())) {
                arrayList.add(eVar.getValue());
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.lang3.exception.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public b e(String str, Object obj) {
        this.f85991b.add(new org.apache.commons.lang3.tuple.a(str, obj));
        return this;
    }

    @Override // org.apache.commons.lang3.exception.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b g(final String str, Object obj) {
        this.f85991b.removeIf(new Predicate() { // from class: org.apache.commons.lang3.exception.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                boolean j4;
                j4 = b.j(str, (e) obj2);
                return j4;
            }
        });
        e(str, obj);
        return this;
    }
}
