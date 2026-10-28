package org.apache.commons.text.diff;

/* compiled from: StringsComparator.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f86436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86437b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f86438c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f86439d;

    /* compiled from: StringsComparator.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f86440a;

        /* renamed from: b, reason: collision with root package name */
        private final int f86441b;

        /* renamed from: c, reason: collision with root package name */
        private final int f86442c;

        a(int i4, int i5, int i6) {
            this.f86440a = i4;
            this.f86441b = i5;
            this.f86442c = i6;
        }

        public int a() {
            return this.f86442c;
        }

        public int b() {
            return this.f86441b;
        }

        public int c() {
            return this.f86440a;
        }
    }

    public i(String str, String str2) {
        this.f86436a = str;
        this.f86437b = str2;
        int a5 = com.google.android.gms.common.stats.a.a(str2, str.length(), 2);
        this.f86438c = new int[a5];
        this.f86439d = new int[a5];
    }

    private void a(int i4, int i5, int i6, int i7, d<Character> dVar) {
        a c5 = c(i4, i5, i6, i7);
        if (c5 != null && ((c5.c() != i5 || c5.a() != i5 - i7) && (c5.b() != i4 || c5.a() != i4 - i6))) {
            a(i4, c5.c(), i6, c5.c() - c5.a(), dVar);
            for (int c6 = c5.c(); c6 < c5.b(); c6++) {
                dVar.c(new f<>(Character.valueOf(this.f86436a.charAt(c6))));
            }
            a(c5.b(), i5, c5.b() - c5.a(), i7, dVar);
            return;
        }
        int i10 = i4;
        int i11 = i6;
        while (true) {
            if (i10 >= i5 && i11 >= i7) {
                return;
            }
            if (i10 < i5 && i11 < i7 && this.f86436a.charAt(i10) == this.f86437b.charAt(i11)) {
                dVar.c(new f<>(Character.valueOf(this.f86436a.charAt(i10))));
                i10++;
            } else if (i5 - i4 > i7 - i6) {
                dVar.a(new b<>(Character.valueOf(this.f86436a.charAt(i10))));
                i10++;
            } else {
                dVar.b(new e<>(Character.valueOf(this.f86437b.charAt(i11))));
            }
            i11++;
        }
    }

    private a b(int i4, int i5, int i6, int i7) {
        int i10 = i4;
        while (true) {
            int i11 = i10 - i5;
            if (i11 >= i7 || i10 >= i6 || this.f86436a.charAt(i10) != this.f86437b.charAt(i11)) {
                break;
            }
            i10++;
        }
        return new a(i4, i10, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r6[r5 - 1] < r6[r5 + 1]) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ac, code lost:
    
        if (r6[r7 + 1] <= r6[r7 - 1]) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0105, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.apache.commons.text.diff.i.a c(int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.diff.i.c(int, int, int, int):org.apache.commons.text.diff.i$a");
    }

    public d<Character> d() {
        d<Character> dVar = new d<>();
        a(0, this.f86436a.length(), 0, this.f86437b.length(), dVar);
        return dVar;
    }
}
