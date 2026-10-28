package androidx.content.preferences.core;

import androidx.content.core.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.k2;
import ld.p;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/a;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "transform", "a", "(Landroidx/datastore/core/e;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* compiled from: Preferences.kt */
    @f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/datastore/preferences/core/d;", "it", "<anonymous>", "(Landroidx/datastore/preferences/core/d;)Landroidx/datastore/preferences/core/d;"}, k = 3, mv = {1, 5, 1})
    static final class a extends o implements p<d, d<? super d>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28565b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28566c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<androidx.content.preferences.core.a, d<? super k2>, Object> f28567d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super androidx.content.preferences.core.a, ? super d<? super k2>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f28567d = pVar;
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
            a aVar = new a(this.f28567d, dVar);
            aVar.f28566c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f28565b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.content.preferences.core.a aVar2 = (androidx.content.preferences.core.a) this.f28566c;
                a1.n(obj);
                return aVar2;
            }
            a1.n(obj);
            androidx.content.preferences.core.a d5 = ((d) this.f28566c).d();
            p<androidx.content.preferences.core.a, d<? super k2>, Object> pVar = this.f28567d;
            this.f28566c = d5;
            this.f28565b = 1;
            return pVar.invoke(d5, this) == aVar ? aVar : d5;
        }
    }

    @m
    public static final Object a(@l e<d> eVar, @l p<? super androidx.content.preferences.core.a, ? super d<? super k2>, ? extends Object> pVar, @l d<? super d> dVar) {
        return eVar.a(new a(pVar, null), dVar);
    }
}
