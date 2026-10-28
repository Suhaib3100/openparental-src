package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.s1;
import com.android.internal.telephony.SmsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.k2;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.u3;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/font/g0;", "Landroidx/compose/ui/text/font/d0;", "Landroidx/compose/ui/text/font/o;", "asyncTypefaceCache", "Lkotlin/coroutines/g;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/o;Lkotlin/coroutines/g;)V", "Landroidx/compose/ui/text/font/y;", "family", "Landroidx/compose/ui/text/font/u0;", "resourceLoader", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/u0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/q1;", "typefaceRequest", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/s1$b;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/s1;", "a", "(Landroidx/compose/ui/text/font/q1;Landroidx/compose/ui/text/font/u0;Lld/l;Lld/l;)Landroidx/compose/ui/text/font/s1;", "Landroidx/compose/ui/text/font/o;", "Lkotlinx/coroutines/r0;", "b", "Lkotlinx/coroutines/r0;", "asyncLoadScope", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,432:1\n235#2,3:433\n33#2,4:436\n238#2,2:440\n38#2:442\n240#2:443\n151#2,3:444\n33#2,4:447\n154#2,2:451\n38#2:453\n156#2:454\n461#2,4:455\n33#2,4:459\n465#2,3:463\n38#2:466\n468#2:467\n33#2,6:468\n48#3,4:474\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n72#1:433,3\n72#1:436,4\n72#1:440,2\n72#1:442\n72#1:443\n73#1:444,3\n73#1:447,4\n73#1:451,2\n73#1:453\n73#1:454\n74#1:455,4\n74#1:459,4\n74#1:463,3\n74#1:466\n74#1:467\n78#1:468,6\n159#1:474,4\n*E\n"})
/* loaded from: classes.dex */
public final class g0 implements d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20717d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o asyncTypefaceCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private kotlinx.coroutines.r0 asyncLoadScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final j0 f20718e = new j0();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.n0 f20719f = new e((g.c<?>) kotlinx.coroutines.n0.INSTANCE);

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/g0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/j0;", "fontMatcher", "Landroidx/compose/ui/text/font/j0;", "b", "()Landroidx/compose/ui/text/font/j0;", "Lkotlinx/coroutines/n0;", "DropExceptionHandler", "Lkotlinx/coroutines/n0;", "a", "()Lkotlinx/coroutines/n0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.g0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final kotlinx.coroutines.n0 a() {
            return g0.f20719f;
        }

        @fg.l
        public final j0 b() {
            return g0.f20718e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/q1;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/font/q1;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<q1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20722b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l q1 q1Var) {
        }

        @Override // ld.l
        public k2 invoke(q1 q1Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n461#2,4:433\n33#2,4:437\n465#2,3:441\n38#2:444\n468#2:445\n151#2,3:446\n33#2,4:449\n154#2,2:453\n38#2:455\n156#2:456\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n*L\n104#1:433,4\n104#1:437,4\n104#1:441,3\n104#1:444\n104#1:445\n105#1:446,3\n105#1:449,4\n105#1:453,2\n105#1:455\n105#1:456\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f20723b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f20724c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<x> f20725d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g0 f20726e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0 f20727f;

        /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "", "<anonymous>", "(Lkotlinx/coroutines/r0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super Object>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f20728b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f20729c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ x f20730d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ u0 f20731e;

            /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.ui.text.font.g0$c$a$a, reason: collision with other inner class name */
            static final class C0370a extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super Object>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f20732b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ x f20733c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ u0 f20734d;

                /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "", "<anonymous>", "(Lkotlinx/coroutines/r0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.ui.text.font.g0$c$a$a$a, reason: collision with other inner class name */
                static final class C0371a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super Object>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f20735b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ u0 f20736c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ x f20737d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0371a(u0 u0Var, x xVar, kotlin.coroutines.d<? super C0371a> dVar) {
                        super(2, dVar);
                        this.f20736c = u0Var;
                        this.f20737d = xVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0371a(this.f20736c, this.f20737d, dVar);
                    }

                    @Override // ld.p
                    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.r0 r0Var, kotlin.coroutines.d<? super Object> dVar) {
                        return invoke2(r0Var, (kotlin.coroutines.d<Object>) dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f20735b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            u0 u0Var = this.f20736c;
                            x xVar = this.f20737d;
                            this.f20735b = 1;
                            obj = u0Var.c(xVar, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a1.n(obj);
                        }
                        return obj;
                    }

                    @fg.m
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<Object> dVar) {
                        return ((C0371a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0370a(x xVar, u0 u0Var, kotlin.coroutines.d<? super C0370a> dVar) {
                    super(1, dVar);
                    this.f20733c = xVar;
                    this.f20734d = u0Var;
                }

                @Override // ld.l
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.m kotlin.coroutines.d<Object> dVar) {
                    return ((C0370a) create(dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0370a(this.f20733c, this.f20734d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f20732b;
                    try {
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            C0371a c0371a = new C0371a(this.f20734d, this.f20733c, null);
                            this.f20732b = 1;
                            obj = u3.c(15000L, c0371a, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a1.n(obj);
                        }
                        if (obj != null) {
                            return obj;
                        }
                        throw new IllegalStateException("Unable to load font " + this.f20733c);
                    } catch (Exception e4) {
                        throw new IllegalStateException("Unable to load font " + this.f20733c, e4);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, x xVar, u0 u0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f20729c = g0Var;
                this.f20730d = xVar;
                this.f20731e = u0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f20729c, this.f20730d, this.f20731e, dVar);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.r0 r0Var, kotlin.coroutines.d<? super Object> dVar) {
                return invoke2(r0Var, (kotlin.coroutines.d<Object>) dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f20728b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    o oVar = this.f20729c.asyncTypefaceCache;
                    x xVar = this.f20730d;
                    u0 u0Var = this.f20731e;
                    C0370a c0370a = new C0370a(xVar, u0Var, null);
                    this.f20728b = 1;
                    obj = oVar.g(xVar, u0Var, true, c0370a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return obj;
            }

            @fg.m
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<Object> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<x> list, g0 g0Var, u0 u0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f20725d = list;
            this.f20726e = g0Var;
            this.f20727f = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f20725d, this.f20726e, this.f20727f, dVar);
            cVar.f20724c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.z0 b5;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f20723b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f20724c;
                List<x> list = this.f20725d;
                HashSet hashSet = new HashSet(list.size());
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    x xVar = list.get(i5);
                    if (hashSet.add(xVar)) {
                        arrayList.add(xVar);
                    }
                }
                g0 g0Var = this.f20726e;
                u0 u0Var = this.f20727f;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    b5 = kotlinx.coroutines.k.b(r0Var, null, null, new a(g0Var, (x) arrayList.get(i6), u0Var, null), 3, null);
                    arrayList2.add(b5);
                }
                this.f20723b = 1;
                if (kotlinx.coroutines.f.c(arrayList2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f20738b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f20739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f20739c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(this.f20739c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f20738b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                n nVar = this.f20739c;
                this.f20738b = 1;
                if (nVar.l(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/o0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/n0;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k2;", "N", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n1#1,110:1\n160#2:111\n*E\n"})
    public static final class e extends kotlin.coroutines.a implements kotlinx.coroutines.n0 {
        public e(n0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.n0
        public void N(@fg.l kotlin.coroutines.g context, @fg.l Throwable exception) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.text.font.d0
    @fg.m
    public s1 a(@fg.l q1 typefaceRequest, @fg.l u0 platformFontLoader, @fg.l ld.l<? super s1.b, k2> onAsyncCompletion, @fg.l ld.l<? super q1, ? extends Object> createDefaultTypeface) {
        kotlin.q0 b5;
        if (!(typefaceRequest.h() instanceof f0)) {
            return null;
        }
        b5 = h0.b(f20718e.e(((f0) typefaceRequest.h()).s(), typefaceRequest.k(), typefaceRequest.i()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
        List list = (List) b5.a();
        Object b6 = b5.b();
        if (list == null) {
            return new s1.b(b6, false, 2, null);
        }
        n nVar = new n(list, b6, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
        kotlinx.coroutines.k.f(this.asyncLoadScope, null, kotlinx.coroutines.t0.UNDISPATCHED, new d(nVar, null), 1, null);
        return new s1.a(nVar);
    }

    @fg.m
    public final Object e(@fg.l y yVar, @fg.l u0 u0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        kotlin.q0 b5;
        if (!(yVar instanceof f0)) {
            return k2.f75408a;
        }
        f0 f0Var = (f0) yVar;
        List<x> s4 = f0Var.s();
        List<x> s5 = f0Var.s();
        ArrayList arrayList = new ArrayList(s5.size());
        int size = s5.size();
        for (int i4 = 0; i4 < size; i4++) {
            x xVar = s5.get(i4);
            int loadingStrategy = xVar.getLoadingStrategy();
            i0.INSTANCE.getClass();
            if (i0.g(loadingStrategy, i0.f20745e)) {
                arrayList.add(xVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            x xVar2 = (x) arrayList.get(i5);
            arrayList2.add(new kotlin.q0(xVar2.getWeight(), k0.c(xVar2.getStyle())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Object obj = arrayList2.get(i6);
            if (hashSet.add((kotlin.q0) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        for (int i7 = 0; i7 < size4; i7++) {
            kotlin.q0 q0Var = (kotlin.q0) arrayList3.get(i7);
            o0 o0Var = (o0) q0Var.a();
            int j4 = ((k0) q0Var.b()).j();
            List<x> e4 = f20718e.e(s4, o0Var, j4);
            l0.INSTANCE.getClass();
            b5 = h0.b(e4, new q1(yVar, o0Var, j4, l0.f20760d, u0Var.getCacheKey(), null), this.asyncTypefaceCache, u0Var, b.f20722b);
            List list = (List) b5.a();
            if (list != null) {
                arrayList4.add(kotlin.collections.w.B2(list));
            }
        }
        Object g4 = kotlinx.coroutines.s0.g(new c(arrayList4, this, u0Var, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    public g0(@fg.l o oVar, @fg.l kotlin.coroutines.g gVar) {
        this.asyncTypefaceCache = oVar;
        this.asyncLoadScope = kotlinx.coroutines.s0.a(f20719f.O(androidx.compose.ui.text.platform.t.a()).O(gVar).O(k3.a((kotlinx.coroutines.k2) gVar.c(kotlinx.coroutines.k2.INSTANCE))));
    }

    public /* synthetic */ g0(o oVar, kotlin.coroutines.g gVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new o() : oVar, (i4 & 2) != 0 ? kotlin.coroutines.i.f75057b : gVar);
    }
}
