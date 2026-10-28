package o8;

/* compiled from: Retries.java */
/* loaded from: classes5.dex */
public final class b {
    private b() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult a(int i4, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) throws Throwable {
        TResult apply;
        if (i4 < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i4--;
        } while (i4 >= 1);
        return apply;
    }
}
