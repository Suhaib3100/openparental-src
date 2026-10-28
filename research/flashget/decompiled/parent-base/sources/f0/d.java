package f0;

import fg.l;
import kotlin.Metadata;
import kotlin.k2;
import ld.p;

/* compiled from: ForEachOneBit.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\b\u001a\u00020\u0006*\u00020\u000026\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "mask", "index", "Lkotlin/k2;", "body", "a", "(ILld/p;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final void a(int i4, @l p<? super Integer, ? super Integer, k2> pVar) {
        int i5 = 0;
        while (i4 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i4);
            pVar.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i5));
            i5++;
            i4 ^= lowestOneBit;
        }
    }
}
