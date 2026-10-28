package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.v;

/* compiled from: ContractBuilder.kt */
@f
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfd/c;", "", "Lfd/h;", "a", "()Lfd/h;", "value", "b", "(Ljava/lang/Object;)Lfd/h;", "Lfd/i;", "d", "()Lfd/i;", "R", "Lkotlin/v;", "lambda", "Lfd/g;", "kind", "Lfd/a;", "c", "(Lkotlin/v;Lfd/g;)Lfd/a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.internal.b
@c1(version = "1.3")
/* loaded from: classes7.dex */
public interface c {

    /* compiled from: ContractBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ kotlin.a a(c cVar, v vVar, g gVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("恅\u0001"));
            }
            if ((i4 & 2) != 0) {
                gVar = g.UNKNOWN;
            }
            return cVar.c(vVar, gVar);
        }
    }

    @fg.l
    @kotlin.internal.b
    h a();

    @fg.l
    @kotlin.internal.b
    h b(@fg.m Object value);

    @fg.l
    @kotlin.internal.b
    <R> kotlin.a c(@fg.l v<? extends R> lambda, @fg.l g kind);

    @fg.l
    @kotlin.internal.b
    i d();
}
