package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.i0;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: AndroidFontLoader.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/f;", "Landroidx/compose/ui/text/font/u0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/x;", "font", "Landroid/graphics/Typeface;", "d", "(Landroidx/compose/ui/text/font/x;)Landroid/graphics/Typeface;", "c", "(Landroidx/compose/ui/text/font/x;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes.dex */
public final class f implements u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20703c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object cacheKey;

    /* compiled from: AndroidFontLoader.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {57, 58}, m = "awaitLoad", n = {"this", "font"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f20706b;

        /* renamed from: c, reason: collision with root package name */
        Object f20707c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f20708d;

        /* renamed from: f, reason: collision with root package name */
        int f20710f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f20708d = obj;
            this.f20710f |= Integer.MIN_VALUE;
            return f.this.c(null, this);
        }
    }

    public f(@fg.l Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.u0
    @fg.m
    /* renamed from: b, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.ui.text.font.u0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@fg.l androidx.compose.ui.text.font.x r6, @fg.l kotlin.coroutines.d<? super android.graphics.Typeface> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.f.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.f$a r0 = (androidx.compose.ui.text.font.f.a) r0
            int r1 = r0.f20710f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20710f = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.f$a r0 = new androidx.compose.ui.text.font.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20708d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f20710f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f20707c
            androidx.compose.ui.text.font.x r6 = (androidx.compose.ui.text.font.x) r6
            java.lang.Object r0 = r0.f20706b
            androidx.compose.ui.text.font.f r0 = (androidx.compose.ui.text.font.f) r0
            kotlin.a1.n(r7)
            goto L6e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.a1.n(r7)
            goto L56
        L3e:
            kotlin.a1.n(r7)
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.d
            if (r7 == 0) goto L57
            androidx.compose.ui.text.font.d r6 = (androidx.compose.ui.text.font.d) r6
            androidx.compose.ui.text.font.d$a r7 = r6.getTypefaceLoader()
            android.content.Context r2 = r5.context
            r0.f20710f = r4
            java.lang.Object r7 = r7.a(r2, r6, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            return r7
        L57:
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.b1
            if (r7 == 0) goto L7d
            r7 = r6
            androidx.compose.ui.text.font.b1 r7 = (androidx.compose.ui.text.font.b1) r7
            android.content.Context r2 = r5.context
            r0.f20706b = r5
            r0.f20707c = r6
            r0.f20710f = r3
            java.lang.Object r7 = androidx.compose.ui.text.font.g.b(r7, r2, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r0 = r5
        L6e:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.b1 r6 = (androidx.compose.ui.text.font.b1) r6
            androidx.compose.ui.text.font.n0$e r6 = r6.getVariationSettings()
            android.content.Context r0 = r0.context
            android.graphics.Typeface r6 = androidx.compose.ui.text.font.a1.c(r7, r6, r0)
            return r6
        L7d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.f.c(androidx.compose.ui.text.font.x, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.u0
    @fg.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface a(@fg.l x font) {
        Object a5;
        Typeface typeface;
        if (font instanceof d) {
            d dVar = (d) font;
            return dVar.getTypefaceLoader().b(this.context, dVar);
        }
        if (!(font instanceof b1)) {
            return null;
        }
        b1 b1Var = (b1) font;
        int loadingStrategy = b1Var.getLoadingStrategy();
        i0.Companion companion = i0.INSTANCE;
        companion.getClass();
        if (i0.g(loadingStrategy, i0.f20743c)) {
            typeface = g.c((b1) font, this.context);
        } else {
            companion.getClass();
            if (!i0.g(loadingStrategy, i0.f20744d)) {
                companion.getClass();
                if (i0.g(loadingStrategy, i0.f20745e)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) i0.j(b1Var.getLoadingStrategy())));
            }
            try {
                z0.Companion companion2 = kotlin.z0.INSTANCE;
                a5 = g.c((b1) font, this.context);
            } catch (Throwable th) {
                z0.Companion companion3 = kotlin.z0.INSTANCE;
                a5 = kotlin.a1.a(th);
            }
            typeface = (Typeface) (kotlin.z0.i(a5) ? null : a5);
        }
        return a1.c(typeface, ((b1) font).getVariationSettings(), this.context);
    }
}
