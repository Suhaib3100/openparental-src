package android.content.preferences.core;

import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import q3.p;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/a;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "transform", "a", "(Landroidx/datastore/core/e;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class g {

    /* compiled from: Preferences.kt */
    @DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/d;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7111s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7112t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ p<android.content.preferences.core.a, Continuation<? super m2>, Object> f7113u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super android.content.preferences.core.a, ? super Continuation<? super m2>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7113u = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f7111s;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.content.preferences.core.a aVar = (android.content.preferences.core.a) this.f7112t;
                a1.n(obj);
                return aVar;
            }
            a1.n(obj);
            android.content.preferences.core.a d6 = ((d) this.f7112t).d();
            p<android.content.preferences.core.a, Continuation<? super m2>, Object> pVar = this.f7113u;
            this.f7112t = d6;
            this.f7111s = 1;
            return pVar.g0(d6, this) == coroutineSingletons ? coroutineSingletons : d6;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d d dVar, @e Continuation<? super d> continuation) {
            return ((a) c(dVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            a aVar = new a(this.f7113u, continuation);
            aVar.f7112t = obj;
            return aVar;
        }
    }

    @e
    public static final Object a(@d android.content.core.e<d> eVar, @d p<? super android.content.preferences.core.a, ? super Continuation<? super m2>, ? extends Object> pVar, @d Continuation<? super d> continuation) {
        return eVar.a(new a(pVar, null), continuation);
    }
}
