package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.v2;
import ld.p;

/* compiled from: RepeatOnLifecycle.kt */
@f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends o implements p<r0, d<? super k2>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f30185b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f30186c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1450w f30187d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC1450w.b f30188e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p<r0, d<? super k2>, Object> f30189f;

    /* compiled from: RepeatOnLifecycle.kt */
    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends o implements p<r0, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f30190b;

        /* renamed from: c, reason: collision with root package name */
        Object f30191c;

        /* renamed from: d, reason: collision with root package name */
        Object f30192d;

        /* renamed from: e, reason: collision with root package name */
        Object f30193e;

        /* renamed from: f, reason: collision with root package name */
        Object f30194f;

        /* renamed from: g, reason: collision with root package name */
        Object f30195g;

        /* renamed from: h, reason: collision with root package name */
        int f30196h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f30197i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w.b f30198j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ r0 f30199k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<r0, d<? super k2>, Object> f30200l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, r0 r0Var, p<? super r0, ? super d<? super k2>, ? extends Object> pVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.f30197i = abstractC1450w;
            this.f30198j = bVar;
            this.f30199k = r0Var;
            this.f30200l = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.f30197i, this.f30198j, this.f30199k, this.f30200l, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
            return ((AnonymousClass1) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, p<? super r0, ? super d<? super k2>, ? extends Object> pVar, d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.f30187d = abstractC1450w;
        this.f30188e = bVar;
        this.f30189f = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<k2> create(@m Object obj, @l d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f30187d, this.f30188e, this.f30189f, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f30186c = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i4 = this.f30185b;
        if (i4 == 0) {
            a1.n(obj);
            r0 r0Var = (r0) this.f30186c;
            v2 j12 = j1.e().j1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f30187d, this.f30188e, r0Var, this.f30189f, null);
            this.f30185b = 1;
            if (i.h(j12, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
        }
        return k2.f75408a;
    }

    @Override // ld.p
    @m
    public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
    }
}
