package android.content.preferences.core;

import android.content.core.e;
import d5.d;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.flow.i;
import q3.p;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\n\u001a\u00020\u000221\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/datastore/preferences/core/b;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "t", "Lkotlin/coroutines/d;", "", "transform", "a", "(Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/datastore/core/e;", "delegate", "Lkotlinx/coroutines/flow/i;", "getData", "()Lkotlinx/coroutines/flow/i;", "data", "<init>", "(Landroidx/datastore/core/e;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class b implements e<d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final e<d> delegate;

    /* compiled from: PreferenceDataStoreFactory.kt */
    @DebugMetadata(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/d;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7103s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7104t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ p<d, Continuation<? super d>, Object> f7105u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super d, ? super Continuation<? super d>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7105u = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f7103s;
            if (i5 == 0) {
                a1.n(obj);
                d dVar = (d) this.f7104t;
                p<d, Continuation<? super d>, Object> pVar = this.f7105u;
                this.f7103s = 1;
                obj = pVar.g0(dVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            d dVar2 = (d) obj;
            ((android.content.preferences.core.a) dVar2).h();
            return dVar2;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d d dVar, @d5.e Continuation<? super d> continuation) {
            return ((a) c(dVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@d5.e Object obj, @d Continuation<?> continuation) {
            a aVar = new a(this.f7105u, continuation);
            aVar.f7104t = obj;
            return aVar;
        }
    }

    public b(@d e<d> delegate) {
        l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // android.content.core.e
    @d5.e
    public Object a(@d p<? super d, ? super Continuation<? super d>, ? extends Object> pVar, @d Continuation<? super d> continuation) {
        return this.delegate.a(new a(pVar, null), continuation);
    }

    @Override // android.content.core.e
    @d
    public i<d> getData() {
        return this.delegate.getData();
    }
}
