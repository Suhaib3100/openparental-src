package k1;

/* compiled from: Retries.java */
/* loaded from: classes2.dex */
public final class b {
    private b() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult a(int i5, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) throws Throwable {
        TResult apply;
        if (i5 < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i5--;
        } while (i5 >= 1);
        return apply;
    }
}
