package androidx.view;

import androidx.annotation.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.k2;
import ld.l;

/* compiled from: LiveData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/e0;", "owner", "Lkotlin/Function1;", "Lkotlin/k2;", "onChanged", "Landroidx/lifecycle/p0;", "a", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/e0;Lld/l;)Landroidx/lifecycle/p0;", "lifecycle-livedata-core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1433j0 {

    /* compiled from: LiveData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "t", "Lkotlin/k2;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,55:1\n*E\n"})
    /* renamed from: androidx.lifecycle.j0$a */
    public static final class a<T> implements p0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T, k2> f30353b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super T, k2> lVar) {
            this.f30353b = lVar;
        }

        @Override // androidx.view.p0
        public final void onChanged(T t4) {
            this.f30353b.invoke(t4);
        }
    }

    @fg.l
    @k(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @l0
    public static final <T> p0<T> a(@fg.l LiveData<T> liveData, @fg.l InterfaceC1423e0 owner, @fg.l l<? super T, k2> onChanged) {
        kotlin.jvm.internal.l0.p(liveData, "<this>");
        kotlin.jvm.internal.l0.p(owner, "owner");
        kotlin.jvm.internal.l0.p(onChanged, "onChanged");
        a aVar = new a(onChanged);
        liveData.k(owner, aVar);
        return aVar;
    }
}
