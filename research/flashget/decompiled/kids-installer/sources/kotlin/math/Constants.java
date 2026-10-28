package kotlin.math;

import kotlin.Metadata;
import p3.f;

/* compiled from: MathJVM.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/math/Constants;", "", "()V", "LN2", "", "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.math.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class Constants {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final Constants f23663a = new Constants();

    /* renamed from: b, reason: collision with root package name */
    @f
    public static final double f23664b = Math.log(2.0d);

    /* renamed from: c, reason: collision with root package name */
    @f
    public static final double f23665c;

    /* renamed from: d, reason: collision with root package name */
    @f
    public static final double f23666d;

    /* renamed from: e, reason: collision with root package name */
    @f
    public static final double f23667e;

    /* renamed from: f, reason: collision with root package name */
    @f
    public static final double f23668f;

    /* renamed from: g, reason: collision with root package name */
    @f
    public static final double f23669g;

    static {
        double ulp = Math.ulp(1.0d);
        f23665c = ulp;
        double sqrt = Math.sqrt(ulp);
        f23666d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f23667e = sqrt2;
        double d6 = 1;
        f23668f = d6 / sqrt;
        f23669g = d6 / sqrt2;
    }

    private Constants() {
    }
}
