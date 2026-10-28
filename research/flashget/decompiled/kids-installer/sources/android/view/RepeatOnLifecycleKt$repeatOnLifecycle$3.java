package android.view;

import android.view.t;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.y2;
import q3.p;

/* compiled from: RepeatOnLifecycle.kt */
@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes4.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

    /* renamed from: s, reason: collision with root package name */
    int f8437s;

    /* renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f8438t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ t f8439u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ t.c f8440v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ p<u0, Continuation<? super m2>, Object> f8441w;

    /* compiled from: RepeatOnLifecycle.kt */
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {
        final /* synthetic */ t.c A;
        final /* synthetic */ u0 B;
        final /* synthetic */ p<u0, Continuation<? super m2>, Object> C;

        /* renamed from: s, reason: collision with root package name */
        Object f8442s;

        /* renamed from: t, reason: collision with root package name */
        Object f8443t;

        /* renamed from: u, reason: collision with root package name */
        Object f8444u;

        /* renamed from: v, reason: collision with root package name */
        Object f8445v;

        /* renamed from: w, reason: collision with root package name */
        Object f8446w;

        /* renamed from: x, reason: collision with root package name */
        Object f8447x;

        /* renamed from: y, reason: collision with root package name */
        int f8448y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ t f8449z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(t tVar, t.c cVar, u0 u0Var, p<? super u0, ? super Continuation<? super m2>, ? extends Object> pVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f8449z = tVar;
            this.A = cVar;
            this.B = u0Var;
            this.C = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.view.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
            return ((AnonymousClass1) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            return new AnonymousClass1(this.f8449z, this.A, this.B, this.C, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(t tVar, t.c cVar, p<? super u0, ? super Continuation<? super m2>, ? extends Object> pVar, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.f8439u = tVar;
        this.f8440v = cVar;
        this.f8441w = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object A(@d Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.f8437s;
        if (i5 == 0) {
            a1.n(obj);
            u0 u0Var = (u0) this.f8438t;
            y2 J0 = m1.e().J0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8439u, this.f8440v, u0Var, this.f8441w, null);
            this.f8437s = 1;
            if (j.h(J0, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
        }
        return m2.f23662a;
    }

    @Override // q3.p
    @e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) c(u0Var, continuation)).A(m2.f23662a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @d
    public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f8439u, this.f8440v, this.f8441w, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f8438t = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }
}
