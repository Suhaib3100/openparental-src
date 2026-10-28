package t;

import android.content.core.CorruptionException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.l0;
import q3.l;

/* compiled from: ReplaceFileCorruptionHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lt/b;", "T", "Landroidx/datastore/core/a;", "Landroidx/datastore/core/CorruptionException;", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lq3/l;", "produceNewData", "<init>", "(Lq3/l;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class b<T> implements android.content.core.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final l<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@d l<? super CorruptionException, ? extends T> lVar) {
        l0.p(lVar, ProtectedSandApp.s("⯬"));
        this.produceNewData = lVar;
    }

    @Override // android.content.core.a
    @e
    public Object a(@d CorruptionException corruptionException, @d Continuation<? super T> continuation) throws IOException {
        return this.produceNewData.N(corruptionException);
    }
}
