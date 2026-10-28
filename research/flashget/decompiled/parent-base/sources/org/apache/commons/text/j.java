package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang3.k1;

/* compiled from: RandomStringGenerator.java */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f86457a;

    /* renamed from: b, reason: collision with root package name */
    private final int f86458b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<d> f86459c;

    /* renamed from: d, reason: collision with root package name */
    private final s f86460d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Character> f86461e;

    /* compiled from: RandomStringGenerator.java */
    public static class b implements org.apache.commons.text.b<j> {

        /* renamed from: g, reason: collision with root package name */
        public static final int f86462g = 1114111;

        /* renamed from: h, reason: collision with root package name */
        public static final int f86463h = 0;

        /* renamed from: i, reason: collision with root package name */
        public static final int f86464i = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f86465b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f86466c = f86462g;

        /* renamed from: d, reason: collision with root package name */
        private Set<d> f86467d;

        /* renamed from: e, reason: collision with root package name */
        private s f86468e;

        /* renamed from: f, reason: collision with root package name */
        private List<Character> f86469f;

        @Override // org.apache.commons.text.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a() {
            return new j(this.f86465b, this.f86466c, this.f86467d, this.f86468e, this.f86469f);
        }

        public b c(d... dVarArr) {
            if (org.apache.commons.lang3.e.n1(dVarArr)) {
                this.f86467d = null;
                return this;
            }
            Set<d> set = this.f86467d;
            if (set == null) {
                this.f86467d = new HashSet();
            } else {
                set.clear();
            }
            Collections.addAll(this.f86467d, dVarArr);
            return this;
        }

        public b d(char... cArr) {
            this.f86469f = new ArrayList();
            for (char c5 : cArr) {
                this.f86469f.add(Character.valueOf(c5));
            }
            return this;
        }

        public b e(s sVar) {
            this.f86468e = sVar;
            return this;
        }

        public b f(int i4, int i5) {
            k1.B(i4 <= i5, "Minimum code point %d is larger than maximum code point %d", Integer.valueOf(i4), Integer.valueOf(i5));
            k1.A(i4 >= 0, "Minimum code point %d is negative", i4);
            k1.A(i5 <= 1114111, "Value %d is larger than Character.MAX_CODE_POINT.", i5);
            this.f86465b = i4;
            this.f86466c = i5;
            return this;
        }

        public b g(char[]... cArr) {
            this.f86469f = new ArrayList();
            for (char[] cArr2 : cArr) {
                k1.B(cArr2.length == 2, "Each pair must contain minimum and maximum code point", new Object[0]);
                char c5 = cArr2[0];
                char c6 = cArr2[1];
                k1.B(c5 <= c6, "Minimum code point %d is larger than maximum code point %d", Integer.valueOf(c5), Integer.valueOf(c6));
                for (int i4 = c5; i4 <= c6; i4++) {
                    this.f86469f.add(Character.valueOf((char) i4));
                }
            }
            return this;
        }
    }

    private int c(int i4, int i5) {
        s sVar = this.f86460d;
        return sVar != null ? sVar.nextInt((i5 - i4) + 1) + i4 : ThreadLocalRandom.current().nextInt(i4, i5 + 1);
    }

    private int d(List<Character> list) {
        int size = list.size();
        s sVar = this.f86460d;
        return sVar != null ? String.valueOf(list.get(sVar.nextInt(size))).codePointAt(0) : String.valueOf(list.get(ThreadLocalRandom.current().nextInt(0, size))).codePointAt(0);
    }

    public String a(int i4) {
        if (i4 == 0) {
            return "";
        }
        long j4 = i4;
        k1.A(i4 > 0, "Length %d is smaller than zero.", j4);
        StringBuilder sb = new StringBuilder(i4);
        do {
            List<Character> list = this.f86461e;
            int c5 = (list == null || list.isEmpty()) ? c(this.f86457a, this.f86458b) : d(this.f86461e);
            int type = Character.getType(c5);
            if (type != 0 && type != 18 && type != 19) {
                Set<d> set = this.f86459c;
                if (set != null) {
                    Iterator<d> it = set.iterator();
                    while (it.hasNext()) {
                        if (it.next().test(c5)) {
                        }
                    }
                }
                sb.appendCodePoint(c5);
                j4--;
                break;
            }
        } while (j4 != 0);
        return sb.toString();
    }

    public String b(int i4, int i5) {
        k1.A(i4 >= 0, "Minimum length %d is smaller than zero.", i4);
        k1.B(i4 <= i5, "Maximum length %d is smaller than minimum length %d.", Integer.valueOf(i5), Integer.valueOf(i4));
        return a(c(i4, i5));
    }

    private j(int i4, int i5, Set<d> set, s sVar, List<Character> list) {
        this.f86457a = i4;
        this.f86458b = i5;
        this.f86459c = set;
        this.f86460d = sVar;
        this.f86461e = list;
    }
}
