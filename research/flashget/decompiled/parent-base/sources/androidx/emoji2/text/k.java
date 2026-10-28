package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.emoji2.text.g;
import androidx.emoji2.text.q;
import java.util.Arrays;
import java.util.Set;

/* compiled from: EmojiProcessor.java */
@androidx.annotation.d
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
final class k {

    /* renamed from: f, reason: collision with root package name */
    private static final int f29445f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f29446g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f29447h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final int f29448i = 16;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final g.m f29449a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final q f29450b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private g.f f29451c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29452d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final int[] f29453e;

    /* compiled from: EmojiProcessor.java */
    @x0(19)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f29454a = -1;

        private a() {
        }

        static int a(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z4 = false;
                while (i5 != 0) {
                    i4--;
                    if (i4 < 0) {
                        return z4 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i4);
                    if (z4) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i5--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i5--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z4 = true;
                    }
                }
                return i4;
            }
        }

        static int b(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z4 = false;
                while (i5 != 0) {
                    if (i4 >= length) {
                        if (z4) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i4);
                    if (z4) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i5--;
                        i4++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i5--;
                        i4++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i4++;
                        z4 = true;
                    }
                }
                return i4;
            }
        }
    }

    /* compiled from: EmojiProcessor.java */
    private static class b implements c<u> {

        /* renamed from: a, reason: collision with root package name */
        @q0
        public u f29455a;

        /* renamed from: b, reason: collision with root package name */
        private final g.m f29456b;

        b(@q0 u uVar, g.m mVar) {
            this.f29455a = uVar;
            this.f29456b = mVar;
        }

        @Override // androidx.emoji2.text.k.c
        public boolean b(@o0 CharSequence charSequence, int i4, int i5, s sVar) {
            if (sVar.m()) {
                return true;
            }
            if (this.f29455a == null) {
                this.f29455a = new u(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f29455a.setSpan(this.f29456b.a(sVar), i4, i5, 33);
            return true;
        }

        @Override // androidx.emoji2.text.k.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u a() {
            return this.f29455a;
        }
    }

    /* compiled from: EmojiProcessor.java */
    private interface c<T> {
        T a();

        boolean b(@o0 CharSequence charSequence, int i4, int i5, s sVar);
    }

    /* compiled from: EmojiProcessor.java */
    private static class d implements c<d> {

        /* renamed from: a, reason: collision with root package name */
        private final int f29457a;

        /* renamed from: b, reason: collision with root package name */
        public int f29458b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f29459c = -1;

        d(int i4) {
            this.f29457a = i4;
        }

        @Override // androidx.emoji2.text.k.c
        public boolean b(@o0 CharSequence charSequence, int i4, int i5, s sVar) {
            int i6 = this.f29457a;
            if (i4 > i6 || i6 >= i5) {
                return i5 <= i6;
            }
            this.f29458b = i4;
            this.f29459c = i5;
            return false;
        }

        @Override // androidx.emoji2.text.k.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    /* compiled from: EmojiProcessor.java */
    private static class e implements c<e> {

        /* renamed from: a, reason: collision with root package name */
        private final String f29460a;

        e(String str) {
            this.f29460a = str;
        }

        @Override // androidx.emoji2.text.k.c
        public boolean b(@o0 CharSequence charSequence, int i4, int i5, s sVar) {
            if (!TextUtils.equals(charSequence.subSequence(i4, i5), this.f29460a)) {
                return true;
            }
            sVar.o(true);
            return false;
        }

        @Override // androidx.emoji2.text.k.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a() {
            return this;
        }
    }

    /* compiled from: EmojiProcessor.java */
    static final class f {

        /* renamed from: i, reason: collision with root package name */
        private static final int f29461i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f29462j = 2;

        /* renamed from: a, reason: collision with root package name */
        private int f29463a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final q.a f29464b;

        /* renamed from: c, reason: collision with root package name */
        private q.a f29465c;

        /* renamed from: d, reason: collision with root package name */
        private q.a f29466d;

        /* renamed from: e, reason: collision with root package name */
        private int f29467e;

        /* renamed from: f, reason: collision with root package name */
        private int f29468f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f29469g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f29470h;

        f(q.a aVar, boolean z4, int[] iArr) {
            this.f29464b = aVar;
            this.f29465c = aVar;
            this.f29469g = z4;
            this.f29470h = iArr;
        }

        private static boolean d(int i4) {
            return i4 == 65039;
        }

        private static boolean f(int i4) {
            return i4 == 65038;
        }

        private int g() {
            this.f29463a = 1;
            this.f29465c = this.f29464b;
            this.f29468f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f29465c.b().l() || d(this.f29467e)) {
                return true;
            }
            if (this.f29469g) {
                if (this.f29470h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f29470h, this.f29465c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i4) {
            q.a a5 = this.f29465c.a(i4);
            int i5 = 2;
            if (this.f29463a != 2) {
                if (a5 == null) {
                    i5 = g();
                } else {
                    this.f29463a = 2;
                    this.f29465c = a5;
                    this.f29468f = 1;
                }
            } else if (a5 != null) {
                this.f29465c = a5;
                this.f29468f++;
            } else if (f(i4)) {
                i5 = g();
            } else if (!d(i4)) {
                if (this.f29465c.b() != null) {
                    i5 = 3;
                    if (this.f29468f != 1) {
                        this.f29466d = this.f29465c;
                        g();
                    } else if (h()) {
                        this.f29466d = this.f29465c;
                        g();
                    } else {
                        i5 = g();
                    }
                } else {
                    i5 = g();
                }
            }
            this.f29467e = i4;
            return i5;
        }

        s b() {
            return this.f29465c.b();
        }

        s c() {
            return this.f29466d.b();
        }

        boolean e() {
            return this.f29463a == 2 && this.f29465c.b() != null && (this.f29468f > 1 || h());
        }
    }

    k(@o0 q qVar, @o0 g.m mVar, @o0 g.f fVar, boolean z4, @q0 int[] iArr, @o0 Set<int[]> set) {
        this.f29449a = mVar;
        this.f29450b = qVar;
        this.f29451c = fVar;
        this.f29452d = z4;
        this.f29453e = iArr;
        k(set);
    }

    private static boolean a(@o0 Editable editable, @o0 KeyEvent keyEvent, boolean z4) {
        l[] lVarArr;
        if (j(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!i(selectionStart, selectionEnd) && (lVarArr = (l[]) editable.getSpans(selectionStart, selectionEnd, l.class)) != null && lVarArr.length > 0) {
            for (l lVar : lVarArr) {
                int spanStart = editable.getSpanStart(lVar);
                int spanEnd = editable.getSpanEnd(lVar);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean f(@o0 InputConnection inputConnection, @o0 Editable editable, @g0(from = 0) int i4, @g0(from = 0) int i5, boolean z4) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (i(selectionStart, selectionEnd)) {
                return false;
            }
            if (z4) {
                max = a.a(editable, selectionStart, Math.max(i4, 0));
                min = a.b(editable, selectionEnd, Math.max(i5, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i4, 0);
                min = Math.min(selectionEnd + i5, editable.length());
            }
            l[] lVarArr = (l[]) editable.getSpans(max, min, l.class);
            if (lVarArr != null && lVarArr.length > 0) {
                for (l lVar : lVarArr) {
                    int spanStart = editable.getSpanStart(lVar);
                    int spanEnd = editable.getSpanEnd(lVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean g(@o0 Editable editable, int i4, @o0 KeyEvent keyEvent) {
        if (!(i4 != 67 ? i4 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean h(CharSequence charSequence, int i4, int i5, s sVar) {
        if (sVar.e() == 0) {
            sVar.p(this.f29451c.a(charSequence, i4, i5, sVar.i()));
        }
        return sVar.e() == 2;
    }

    private static boolean i(int i4, int i5) {
        return i4 == -1 || i5 == -1 || i4 != i5;
    }

    private static boolean j(@o0 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void k(@o0 Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            m(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private <T> T m(@o0 CharSequence charSequence, @g0(from = 0) int i4, @g0(from = 0) int i5, @g0(from = 0) int i6, boolean z4, c<T> cVar) {
        int i7;
        f fVar = new f(this.f29450b.i(), this.f29452d, this.f29453e);
        int codePointAt = Character.codePointAt(charSequence, i4);
        int i10 = 0;
        boolean z5 = true;
        loop0: while (true) {
            int i11 = codePointAt;
            while (true) {
                i7 = i4;
                while (i4 < i5 && i10 < i6 && z5) {
                    int a5 = fVar.a(i11);
                    if (a5 == 1) {
                        i4 = Character.charCount(Character.codePointAt(charSequence, i7)) + i7;
                        if (i4 < i5) {
                            break;
                        }
                    } else if (a5 == 2) {
                        int charCount = Character.charCount(i11) + i4;
                        if (charCount < i5) {
                            i11 = Character.codePointAt(charSequence, charCount);
                        }
                        i4 = charCount;
                    } else if (a5 == 3) {
                        if (z4 || !h(charSequence, i7, i4, fVar.c())) {
                            z5 = cVar.b(charSequence, i7, i4, fVar.c());
                            i10++;
                        }
                    }
                }
            }
            codePointAt = Character.codePointAt(charSequence, i4);
        }
        if (fVar.e() && i10 < i6 && z5 && (z4 || !h(charSequence, i7, i4, fVar.b()))) {
            cVar.b(charSequence, i7, i4, fVar.b());
        }
        return cVar.a();
    }

    int b(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
        if (i4 < 0 || i4 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            l[] lVarArr = (l[]) spanned.getSpans(i4, i4 + 1, l.class);
            if (lVarArr.length > 0) {
                return spanned.getSpanEnd(lVarArr[0]);
            }
        }
        return ((d) m(charSequence, Math.max(0, i4 - 16), Math.min(charSequence.length(), i4 + 16), Integer.MAX_VALUE, true, new d(i4))).f29459c;
    }

    int c(@o0 CharSequence charSequence) {
        return d(charSequence, this.f29450b.h());
    }

    int d(@o0 CharSequence charSequence, int i4) {
        f fVar = new f(this.f29450b.i(), this.f29452d, this.f29453e);
        int length = charSequence.length();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            int codePointAt = Character.codePointAt(charSequence, i5);
            int a5 = fVar.a(codePointAt);
            s b5 = fVar.b();
            if (a5 == 1) {
                i5 += Character.charCount(codePointAt);
                i7 = 0;
            } else if (a5 == 2) {
                i5 += Character.charCount(codePointAt);
            } else if (a5 == 3) {
                b5 = fVar.c();
                if (b5.d() <= i4) {
                    i6++;
                }
            }
            if (b5 != null && b5.d() <= i4) {
                i7++;
            }
        }
        if (i6 != 0) {
            return 2;
        }
        if (!fVar.e() || fVar.b().d() > i4) {
            return i7 == 0 ? 0 : 2;
        }
        return 1;
    }

    int e(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
        if (i4 < 0 || i4 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            l[] lVarArr = (l[]) spanned.getSpans(i4, i4 + 1, l.class);
            if (lVarArr.length > 0) {
                return spanned.getSpanStart(lVarArr[0]);
            }
        }
        return ((d) m(charSequence, Math.max(0, i4 - 16), Math.min(charSequence.length(), i4 + 16), Integer.MAX_VALUE, true, new d(i4))).f29458b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence l(@androidx.annotation.o0 java.lang.CharSequence r11, @androidx.annotation.g0(from = 0) int r12, @androidx.annotation.g0(from = 0) int r13, @androidx.annotation.g0(from = 0) int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.r
            if (r0 == 0) goto La
            r1 = r11
            androidx.emoji2.text.r r1 = (androidx.emoji2.text.r) r1
            r1.a()
        La:
            java.lang.Class<androidx.emoji2.text.l> r1 = androidx.emoji2.text.l.class
            if (r0 != 0) goto L2f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L2f
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2d
            androidx.emoji2.text.u r2 = new androidx.emoji2.text.u     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r12 = move-exception
            goto Lb2
        L2d:
            r2 = 0
            goto L37
        L2f:
            androidx.emoji2.text.u r2 = new androidx.emoji2.text.u     // Catch: java.lang.Throwable -> L2a
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
        L37:
            r3 = 0
            if (r2 == 0) goto L63
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.l[] r4 = (androidx.emoji2.text.l[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L47:
            if (r6 >= r5) goto L63
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L58
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L58:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L47
        L63:
            r4 = r13
            if (r12 == r4) goto La9
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L2a
            if (r12 < r13) goto L6d
            goto La9
        L6d:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L80
            if (r2 == 0) goto L80
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.l[] r13 = (androidx.emoji2.text.l[]) r13     // Catch: java.lang.Throwable -> L2a
            int r13 = r13.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r13
        L80:
            r5 = r14
            androidx.emoji2.text.k$b r7 = new androidx.emoji2.text.k$b     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.g$m r13 = r10.f29449a     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r2, r13)     // Catch: java.lang.Throwable -> L2a
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.m(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.u r12 = (androidx.emoji2.text.u) r12     // Catch: java.lang.Throwable -> L2a
            if (r12 == 0) goto La0
            android.text.Spannable r12 = r12.e()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L9f
            androidx.emoji2.text.r r11 = (androidx.emoji2.text.r) r11
            r11.g()
        L9f:
            return r12
        La0:
            if (r0 == 0) goto La8
            r12 = r11
            androidx.emoji2.text.r r12 = (androidx.emoji2.text.r) r12
            r12.g()
        La8:
            return r11
        La9:
            if (r0 == 0) goto Lb1
            r12 = r11
            androidx.emoji2.text.r r12 = (androidx.emoji2.text.r) r12
            r12.g()
        Lb1:
            return r11
        Lb2:
            if (r0 == 0) goto Lb9
            androidx.emoji2.text.r r11 = (androidx.emoji2.text.r) r11
            r11.g()
        Lb9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.k.l(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
