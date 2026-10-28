package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l f16830a = new l();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static ld.p<t, Integer, kotlin.k2> f16831b = new androidx.compose.runtime.internal.b(954879418, false, a.f16833b);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static ld.p<t, Integer, kotlin.k2> f16832c = new androidx.compose.runtime.internal.b(1918065384, false, b.f16834b);

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f16833b = new a(2);

        a() {
            super(2);
        }

        @i
        public final void a(@fg.m t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(954879418, i4, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:607)");
            }
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f16834b = new b(2);

        b() {
            super(2);
        }

        @i
        public final void a(@fg.m t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(1918065384, i4, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:739)");
            }
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @fg.l
    public final ld.p<t, Integer, kotlin.k2> a() {
        return f16831b;
    }

    @fg.l
    public final ld.p<t, Integer, kotlin.k2> b() {
        return f16832c;
    }
}
