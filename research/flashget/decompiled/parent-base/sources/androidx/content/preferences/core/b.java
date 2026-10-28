package androidx.content.preferences.core;

import androidx.content.core.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.flow.i;
import ld.p;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\r\u001a\u00020\u000221\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/datastore/preferences/core/b;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "delegate", "<init>", "(Landroidx/datastore/core/e;)V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "t", "Lkotlin/coroutines/d;", "", "transform", "a", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/datastore/core/e;", "Lkotlinx/coroutines/flow/i;", "b", "()Lkotlinx/coroutines/flow/i;", "data", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements e<d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final e<d> delegate;

    /* compiled from: PreferenceDataStoreFactory.kt */
    @f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/datastore/preferences/core/d;", "it", "<anonymous>", "(Landroidx/datastore/preferences/core/d;)Landroidx/datastore/preferences/core/d;"}, k = 3, mv = {1, 5, 1})
    static final class a extends o implements p<d, d<? super d>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28557b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28558c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<d, d<? super d>, Object> f28559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super d, ? super d<? super d>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f28559d = pVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l d dVar, @m d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            a aVar = new a(this.f28559d, dVar);
            aVar.f28558c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f28557b;
            if (i4 == 0) {
                a1.n(obj);
                d dVar = (d) this.f28558c;
                p<d, d<? super d>, Object> pVar = this.f28559d;
                this.f28557b = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            d dVar2 = (d) obj;
            ((androidx.content.preferences.core.a) dVar2).h();
            return dVar2;
        }
    }

    public b(@l e<d> delegate) {
        l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.content.core.e
    @m
    public Object a(@l p<? super d, ? super d<? super d>, ? extends Object> pVar, @l d<? super d> dVar) {
        return this.delegate.a(new a(pVar, null), dVar);
    }

    @Override // androidx.content.core.e
    @l
    public i<d> b() {
        return this.delegate.b();
    }
}
