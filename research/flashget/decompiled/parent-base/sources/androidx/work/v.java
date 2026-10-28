package androidx.work;

import androidx.annotation.o0;
import androidx.work.u;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: OneTimeWorkRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/ListenableWorker;", "W", "Landroidx/work/u$a;", "a", "()Landroidx/work/u$a;", "Lkotlin/reflect/d;", "Landroidx/work/o;", "inputMerger", "b", "(Landroidx/work/u$a;Lkotlin/reflect/d;)Landroidx/work/u$a;", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class v {
    public static final <W extends ListenableWorker> u.a a() {
        l0.P();
        return new u.a(ListenableWorker.class);
    }

    @fg.l
    public static final u.a b(@fg.l u.a aVar, @fg.l @o0 kotlin.reflect.d<? extends o> inputMerger) {
        l0.p(aVar, "<this>");
        l0.p(inputMerger, "inputMerger");
        u.a t4 = aVar.t(kd.b.e(inputMerger));
        l0.o(t4, "setInputMerger(inputMerger.java)");
        return t4;
    }
}
