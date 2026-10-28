package o1;

import androidx.content.core.CorruptionException;
import fg.l;
import fg.m;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.l0;

/* compiled from: ReplaceFileCorruptionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lo1/b;", "T", "Landroidx/datastore/core/a;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(Lld/l;)V", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lld/l;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b<T> implements androidx.content.core.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l ld.l<? super CorruptionException, ? extends T> produceNewData) {
        l0.p(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // androidx.content.core.a
    @m
    public Object a(@l CorruptionException corruptionException, @l d<? super T> dVar) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
