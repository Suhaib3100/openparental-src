package androidx.compose.ui.text.font;

import androidx.compose.runtime.b5;
import androidx.compose.ui.text.font.s1;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FontFamilyResolver.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/font/r1;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/q1;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/s1;", "Lkotlin/k2;", "resolveTypeface", "Landroidx/compose/runtime/b5;", "f", "(Landroidx/compose/ui/text/font/q1;Lld/l;)Landroidx/compose/runtime/b5;", "", "typefaceRequests", "e", "(Ljava/util/List;Lld/l;)V", "b", "(Landroidx/compose/ui/text/font/q1;)Landroidx/compose/ui/text/font/s1;", "Landroidx/compose/ui/text/platform/z;", "a", "Landroidx/compose/ui/text/platform/z;", "c", "()Landroidx/compose/ui/text/platform/z;", "lock", "Landroidx/compose/ui/text/caches/b;", "Landroidx/compose/ui/text/caches/b;", "resultCache", "", "d", "()I", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,256:1\n26#2:257\n26#2:258\n26#2:259\n26#2:260\n26#2:261\n26#2:262\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n172#1:257\n209#1:258\n226#1:259\n239#1:260\n246#1:261\n252#1:262\n*E\n"})
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20866c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.platform.z lock = new androidx.compose.ui.text.platform.z();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.caches.b<q1, s1> resultCache = new androidx.compose.ui.text.caches.b<>(16);

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/s1;", "finalResult", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/font/s1;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,256:1\n26#2:257\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n198#1:257\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<s1, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1 f20870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q1 q1Var) {
            super(1);
            this.f20870c = q1Var;
        }

        public final void a(@fg.l s1 s1Var) {
            androidx.compose.ui.text.platform.z lock = r1.this.getLock();
            r1 r1Var = r1.this;
            q1 q1Var = this.f20870c;
            synchronized (lock) {
                try {
                    if (s1Var.getCacheable()) {
                        r1Var.resultCache.k(q1Var, s1Var);
                    } else {
                        r1Var.resultCache.m(q1Var);
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(s1 s1Var) {
            a(s1Var);
            return k2.f75408a;
        }
    }

    @fg.m
    public final s1 b(@fg.l q1 typefaceRequest) {
        s1 g4;
        synchronized (this.lock) {
            g4 = this.resultCache.g(typefaceRequest);
        }
        return g4;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.text.platform.z getLock() {
        return this.lock;
    }

    public final int d() {
        int p4;
        synchronized (this.lock) {
            p4 = this.resultCache.p();
        }
        return p4;
    }

    public final void e(@fg.l List<q1> typefaceRequests, @fg.l ld.l<? super q1, ? extends s1> resolveTypeface) {
        s1 g4;
        int size = typefaceRequests.size();
        for (int i4 = 0; i4 < size; i4++) {
            q1 q1Var = typefaceRequests.get(i4);
            synchronized (this.lock) {
                g4 = this.resultCache.g(q1Var);
            }
            if (g4 == null) {
                try {
                    s1 invoke = resolveTypeface.invoke(q1Var);
                    if (invoke instanceof s1.a) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.resultCache.k(q1Var, invoke);
                        }
                    }
                } catch (Exception e4) {
                    throw new IllegalStateException("Could not load font", e4);
                }
            }
        }
    }

    @fg.l
    public final b5<Object> f(@fg.l q1 typefaceRequest, @fg.l ld.l<? super ld.l<? super s1, k2>, ? extends s1> resolveTypeface) {
        synchronized (this.lock) {
            s1 g4 = this.resultCache.g(typefaceRequest);
            if (g4 != null) {
                if (g4.getCacheable()) {
                    return g4;
                }
                this.resultCache.m(typefaceRequest);
            }
            try {
                s1 invoke = resolveTypeface.invoke(new a(typefaceRequest));
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.g(typefaceRequest) == null && invoke.getCacheable()) {
                            this.resultCache.k(typefaceRequest, invoke);
                        }
                        k2 k2Var = k2.f75408a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return invoke;
            } catch (Exception e4) {
                throw new IllegalStateException("Could not load font", e4);
            }
        }
    }
}
