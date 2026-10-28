package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyLayoutItemContentFactory.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@z0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0002\b\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0019R\u00020\u00000\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/q;", "", "Landroidx/compose/runtime/saveable/f;", "saveableStateHolder", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/s;", "itemProvider", "<init>", "(Landroidx/compose/runtime/saveable/f;Lld/a;)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "contentType", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "b", "(ILjava/lang/Object;Ljava/lang/Object;)Lld/p;", "a", "Landroidx/compose/runtime/saveable/f;", "Lld/a;", "d", "()Lld/a;", "", "Landroidx/compose/foundation/lazy/layout/q$a;", "Ljava/util/Map;", "lambdasCache", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6113d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.saveable.f saveableStateHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<s> itemProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Object, a> lambdasCache = new LinkedHashMap();

    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/q$a;", "", "", "index", "key", "contentType", "<init>", "(Landroidx/compose/foundation/lazy/layout/q;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "c", "()Lld/p;", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "e", "<set-?>", "I", "f", "()I", "d", "Lld/p;", "_content", "content", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
    private final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Object key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Object contentType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> _content;

        /* compiled from: LazyLayoutItemContentFactory.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,138:1\n169#2,9:139\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n*L\n100#1:139,9\n*E\n"})
        /* renamed from: androidx.compose.foundation.lazy.layout.q$a$a, reason: collision with other inner class name */
        static final class C0110a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f6122b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f6123c;

            /* compiled from: LazyLayoutItemContentFactory.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,138:1\n64#2,5:139\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n109#1:139,5\n*E\n"})
            /* renamed from: androidx.compose.foundation.lazy.layout.q$a$a$a, reason: collision with other inner class name */
            static final class C0111a extends kotlin.jvm.internal.n0 implements ld.l<w0, v0> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f6124b;

                /* compiled from: Effects.kt */
                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n1#1,497:1\n111#2,2:498\n*E\n"})
                /* renamed from: androidx.compose.foundation.lazy.layout.q$a$a$a$a, reason: collision with other inner class name */
                public static final class C0112a implements v0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f6125a;

                    public C0112a(a aVar) {
                        this.f6125a = aVar;
                    }

                    @Override // androidx.compose.runtime.v0
                    public void dispose() {
                        this.f6125a._content = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0111a(a aVar) {
                    super(1);
                    this.f6124b = aVar;
                }

                @Override // ld.l
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final v0 invoke(@fg.l w0 w0Var) {
                    return new C0112a(this.f6124b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0110a(q qVar, a aVar) {
                super(2);
                this.f6122b = qVar;
                this.f6123c = aVar;
            }

            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1403994769, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                s invoke = this.f6122b.d().invoke();
                int index = this.f6123c.getIndex();
                if ((index >= invoke.b() || !kotlin.jvm.internal.l0.g(invoke.d(index), this.f6123c.getKey())) && (index = invoke.c(this.f6123c.getKey())) != -1) {
                    this.f6123c.index = index;
                }
                int i5 = index;
                boolean z4 = i5 != -1;
                q qVar = this.f6122b;
                a aVar = this.f6123c;
                tVar.Z(207, Boolean.valueOf(z4));
                boolean b5 = tVar.b(z4);
                if (z4) {
                    r.a(invoke, qVar.saveableStateHolder, i5, aVar.getKey(), tVar, 0);
                } else {
                    tVar.m(b5);
                }
                tVar.O();
                a1.c(this.f6123c.getKey(), new C0111a(this.f6123c), tVar, 8);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        public a(int i4, @fg.l Object obj, @fg.m Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i4;
        }

        private final ld.p<androidx.compose.runtime.t, Integer, k2> c() {
            return new androidx.compose.runtime.internal.b(1403994769, true, new C0110a(q.this, this));
        }

        @fg.l
        public final ld.p<androidx.compose.runtime.t, Integer, k2> d() {
            ld.p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            ld.p<androidx.compose.runtime.t, Integer, k2> c5 = c();
            this._content = c5;
            return c5;
        }

        @fg.m
        /* renamed from: e, reason: from getter */
        public final Object getContentType() {
            return this.contentType;
        }

        /* renamed from: f, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final Object getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@fg.l androidx.compose.runtime.saveable.f fVar, @fg.l ld.a<? extends s> aVar) {
        this.saveableStateHolder = fVar;
        this.itemProvider = aVar;
    }

    @fg.l
    public final ld.p<androidx.compose.runtime.t, Integer, k2> b(int index, @fg.l Object key, @fg.m Object contentType) {
        a aVar = this.lambdasCache.get(key);
        if (aVar != null && aVar.getIndex() == index && kotlin.jvm.internal.l0.g(aVar.getContentType(), contentType)) {
            return aVar.d();
        }
        a aVar2 = new a(index, key, contentType);
        this.lambdasCache.put(key, aVar2);
        return aVar2.d();
    }

    @fg.m
    public final Object c(@fg.m Object key) {
        if (key == null) {
            return null;
        }
        a aVar = this.lambdasCache.get(key);
        if (aVar != null) {
            return aVar.getContentType();
        }
        s invoke = this.itemProvider.invoke();
        int c5 = invoke.c(key);
        if (c5 != -1) {
            return invoke.e(c5);
        }
        return null;
    }

    @fg.l
    public final ld.a<s> d() {
        return this.itemProvider;
    }
}
