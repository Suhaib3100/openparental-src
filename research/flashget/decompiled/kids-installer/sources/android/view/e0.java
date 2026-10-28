package android.view;

import androidx.annotation.l0;
import d5.d;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.m2;
import q3.l;

/* compiled from: LiveData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/a0;", "owner", "Lkotlin/Function1;", "Lkotlin/m2;", "onChanged", "Landroidx/lifecycle/k0;", "a", "lifecycle-livedata-core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class e0 {

    /* compiled from: LiveData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n"}, d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a<T> implements k0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<T, m2> f8526a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super T, m2> lVar) {
            this.f8526a = lVar;
        }

        @Override // android.view.k0
        public final void a(T t5) {
            this.f8526a.N(t5);
        }
    }

    @Deprecated(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @l0
    @d
    public static final <T> k0<T> a(@d LiveData<T> liveData, @d a0 owner, @d l<? super T, m2> onChanged) {
        kotlin.jvm.internal.l0.p(liveData, "<this>");
        kotlin.jvm.internal.l0.p(owner, "owner");
        kotlin.jvm.internal.l0.p(onChanged, "onChanged");
        a aVar = new a(onChanged);
        liveData.j(owner, aVar);
        return aVar;
    }
}
