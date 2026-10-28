package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0019\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/text/font/o;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/x;", "font", "Landroidx/compose/ui/text/font/u0;", "platformFontLoader", "result", "", "forever", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/u0;Ljava/lang/Object;Z)V", "Landroidx/compose/ui/text/font/o$a;", "d", "(Landroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/u0;)Landroidx/compose/ui/text/font/o$a;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "g", "(Landroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/u0;ZLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "h", "(Landroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/u0;Lld/a;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "PermanentFailure", "Landroidx/compose/ui/text/caches/b;", "Landroidx/compose/ui/text/font/o$b;", "b", "Landroidx/compose/ui/text/caches/b;", "resultCache", "Landroidx/compose/ui/text/caches/c;", "c", "Landroidx/compose/ui/text/caches/c;", "permanentCache", "Landroidx/compose/ui/text/platform/z;", "Landroidx/compose/ui/text/platform/z;", "cacheLock", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,432:1\n26#2:433\n26#2:434\n26#2:435\n26#2:436\n26#2:437\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n369#1:433\n380#1:434\n392#1:435\n399#1:436\n420#1:437\n*E\n"})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final int f20805e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object PermanentFailure = null;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.caches.b<b, a> resultCache = new androidx.compose.ui.text.caches.b<>(16);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.caches.c<b, a> permanentCache = new androidx.compose.ui.text.caches.c<>(0, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.platform.z cacheLock = new androidx.compose.ui.text.platform.z();

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kd.g
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/o$a;", "", "result", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "h", "(Ljava/lang/Object;)Ljava/lang/String;", "", "f", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Z", "isPermanentFailure", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Object result;

        private /* synthetic */ a(Object obj) {
            this.result = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        @fg.l
        public static Object b(@fg.m Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && kotlin.jvm.internal.l0.g(obj, ((a) obj2).result);
        }

        public static final boolean d(Object obj, Object obj2) {
            return kotlin.jvm.internal.l0.g(obj, obj2);
        }

        public static int f(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean g(Object obj) {
            return obj == null;
        }

        public static String h(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        @fg.m
        /* renamed from: e, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public boolean equals(Object obj) {
            return c(this.result, obj);
        }

        public int hashCode() {
            return f(this.result);
        }

        public final /* synthetic */ Object i() {
            return this.result;
        }

        public String toString() {
            return h(this.result);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/o$b;", "", "Landroidx/compose/ui/text/font/x;", "font", "loaderKey", "<init>", "(Landroidx/compose/ui/text/font/x;Ljava/lang/Object;)V", "a", "()Landroidx/compose/ui/text/font/x;", "b", "()Ljava/lang/Object;", "c", "(Landroidx/compose/ui/text/font/x;Ljava/lang/Object;)Landroidx/compose/ui/text/font/o$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/font/x;", "e", "Ljava/lang/Object;", "f", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f20811c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final x font;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Object loaderKey;

        public b(@fg.l x xVar, @fg.m Object obj) {
            this.font = xVar;
            this.loaderKey = obj;
        }

        public static b d(b bVar, x xVar, Object obj, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                xVar = bVar.font;
            }
            if ((i4 & 2) != 0) {
                obj = bVar.loaderKey;
            }
            bVar.getClass();
            return new b(xVar, obj);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final x getFont() {
            return this.font;
        }

        @fg.m
        /* renamed from: b, reason: from getter */
        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        @fg.l
        public final b c(@fg.l x font, @fg.m Object loaderKey) {
            return new b(font, loaderKey);
        }

        @fg.l
        public final x e() {
            return this.font;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.l0.g(this.font, bVar.font) && kotlin.jvm.internal.l0.g(this.loaderKey, bVar.loaderKey);
        }

        @fg.m
        public final Object f() {
            return this.loaderKey;
        }

        public int hashCode() {
            int hashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        @fg.l
        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {398}, m = "runCached", n = {"this", "key", "forever"}, s = {"L$0", "L$1", "Z$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f20814b;

        /* renamed from: c, reason: collision with root package name */
        Object f20815c;

        /* renamed from: d, reason: collision with root package name */
        boolean f20816d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f20817e;

        /* renamed from: g, reason: collision with root package name */
        int f20819g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f20817e = obj;
            this.f20819g |= Integer.MIN_VALUE;
            return o.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(o oVar, x xVar, u0 u0Var, Object obj, boolean z4, int i4, Object obj2) {
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        oVar.e(xVar, u0Var, obj, z4);
    }

    @fg.m
    public final a d(@fg.l x font, @fg.l u0 platformFontLoader) {
        a g4;
        b bVar = new b(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            g4 = this.resultCache.g(bVar);
            if (g4 == null) {
                g4 = this.permanentCache.e(bVar);
            }
        }
        return g4;
    }

    public final void e(@fg.l x font, @fg.l u0 platformFontLoader, @fg.m Object result, boolean forever) {
        b bVar = new b(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.n(bVar, a.a(this.PermanentFailure));
                } else if (forever) {
                    this.permanentCache.n(bVar, a.a(result));
                } else {
                    this.resultCache.k(bVar, a.a(result));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@fg.l androidx.compose.ui.text.font.x r6, @fg.l androidx.compose.ui.text.font.u0 r7, boolean r8, @fg.l ld.l<? super kotlin.coroutines.d<java.lang.Object>, ? extends java.lang.Object> r9, @fg.l kotlin.coroutines.d<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.o.c
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.o$c r0 = (androidx.compose.ui.text.font.o.c) r0
            int r1 = r0.f20819g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20819g = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.o$c r0 = new androidx.compose.ui.text.font.o$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20817e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f20819g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r8 = r0.f20816d
            java.lang.Object r6 = r0.f20815c
            androidx.compose.ui.text.font.o$b r6 = (androidx.compose.ui.text.font.o.b) r6
            java.lang.Object r7 = r0.f20814b
            androidx.compose.ui.text.font.o r7 = (androidx.compose.ui.text.font.o) r7
            kotlin.a1.n(r10)
            goto L7b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.a1.n(r10)
            androidx.compose.ui.text.font.o$b r10 = new androidx.compose.ui.text.font.o$b
            java.lang.Object r7 = r7.getCacheKey()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.z r6 = r5.cacheLock
            monitor-enter(r6)
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.o$b, androidx.compose.ui.text.font.o$a> r7 = r5.resultCache     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r7.g(r10)     // Catch: java.lang.Throwable -> L5b
            androidx.compose.ui.text.font.o$a r7 = (androidx.compose.ui.text.font.o.a) r7     // Catch: java.lang.Throwable -> L5b
            if (r7 != 0) goto L5d
            androidx.compose.ui.text.caches.c<androidx.compose.ui.text.font.o$b, androidx.compose.ui.text.font.o$a> r7 = r5.permanentCache     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r7.e(r10)     // Catch: java.lang.Throwable -> L5b
            androidx.compose.ui.text.font.o$a r7 = (androidx.compose.ui.text.font.o.a) r7     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r7 = move-exception
            goto La9
        L5d:
            if (r7 == 0) goto L65
            java.lang.Object r7 = r7.i()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r6)
            return r7
        L65:
            kotlin.k2 r7 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r6)
            r0.f20814b = r5
            r0.f20815c = r10
            r0.f20816d = r8
            r0.f20819g = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L77
            return r1
        L77:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7b:
            androidx.compose.ui.text.platform.z r9 = r7.cacheLock
            monitor-enter(r9)
            if (r10 != 0) goto L8e
            androidx.compose.ui.text.caches.c<androidx.compose.ui.text.font.o$b, androidx.compose.ui.text.font.o$a> r8 = r7.permanentCache     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r7 = r7.PermanentFailure     // Catch: java.lang.Throwable -> L8c
            androidx.compose.ui.text.font.o$a r7 = androidx.compose.ui.text.font.o.a.a(r7)     // Catch: java.lang.Throwable -> L8c
            r8.n(r6, r7)     // Catch: java.lang.Throwable -> L8c
            goto La3
        L8c:
            r6 = move-exception
            goto La7
        L8e:
            if (r8 == 0) goto L9a
            androidx.compose.ui.text.caches.c<androidx.compose.ui.text.font.o$b, androidx.compose.ui.text.font.o$a> r7 = r7.permanentCache     // Catch: java.lang.Throwable -> L8c
            androidx.compose.ui.text.font.o$a r8 = androidx.compose.ui.text.font.o.a.a(r10)     // Catch: java.lang.Throwable -> L8c
            r7.n(r6, r8)     // Catch: java.lang.Throwable -> L8c
            goto La3
        L9a:
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.o$b, androidx.compose.ui.text.font.o$a> r7 = r7.resultCache     // Catch: java.lang.Throwable -> L8c
            androidx.compose.ui.text.font.o$a r8 = androidx.compose.ui.text.font.o.a.a(r10)     // Catch: java.lang.Throwable -> L8c
            r7.k(r6, r8)     // Catch: java.lang.Throwable -> L8c
        La3:
            kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r9)
            return r10
        La7:
            monitor-exit(r9)
            throw r6
        La9:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.o.g(androidx.compose.ui.text.font.x, androidx.compose.ui.text.font.u0, boolean, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final Object h(@fg.l x font, @fg.l u0 platformFontLoader, @fg.l ld.a<? extends Object> block) {
        synchronized (this.cacheLock) {
            try {
                b bVar = new b(font, platformFontLoader.getCacheKey());
                a g4 = this.resultCache.g(bVar);
                if (g4 == null) {
                    g4 = this.permanentCache.e(bVar);
                }
                if (g4 != null) {
                    return g4.i();
                }
                k2 k2Var = k2.f75408a;
                Object invoke = block.invoke();
                f(this, font, platformFontLoader, invoke, false, 8, null);
                return invoke;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
