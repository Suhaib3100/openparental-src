package t;

import android.content.core.CorruptionException;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: NoOpCorruptionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lt/a;", "T", "Landroidx/datastore/core/a;", "Landroidx/datastore/core/CorruptionException;", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a<T> implements android.content.core.a<T> {
    @Override // android.content.core.a
    @e
    public Object a(@d CorruptionException corruptionException, @d Continuation<? super T> continuation) throws CorruptionException {
        throw corruptionException;
    }
}
