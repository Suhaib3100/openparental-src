package androidx.work;

import androidx.work.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.q0;

/* compiled from: Data.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0003*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lkotlin/q0;", "", "", "pairs", "Landroidx/work/f;", "b", "([Lkotlin/q0;)Landroidx/work/f;", "T", "key", "", "a", "(Landroidx/work/f;Ljava/lang/String;)Z", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    public static final <T> boolean a(f fVar, String key) {
        l0.p(fVar, "<this>");
        l0.p(key, "key");
        l0.P();
        return fVar.C(key, Object.class);
    }

    @fg.l
    public static final f b(@fg.l q0<String, ? extends Object>... pairs) {
        l0.p(pairs, "pairs");
        f.a aVar = new f.a();
        int length = pairs.length;
        int i4 = 0;
        while (i4 < length) {
            q0<String, ? extends Object> q0Var = pairs[i4];
            i4++;
            aVar.b(q0Var.e(), q0Var.f());
        }
        f a5 = aVar.a();
        l0.o(a5, "dataBuilder.build()");
        return a5;
    }
}
