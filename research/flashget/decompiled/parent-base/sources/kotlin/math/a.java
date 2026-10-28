package kotlin.math;

import fg.l;
import kd.f;
import kotlin.Metadata;

/* compiled from: MathJVM.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, d2 = {"Lkotlin/math/a;", "", "<init>", "()V", "", "b", "D", "LN2", "c", "epsilon", "d", "taylor_2_bound", "e", "taylor_n_bound", "f", "upper_taylor_2_bound", "g", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f75414a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @f
    public static final double LN2 = Math.log(2.0d);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @f
    public static final double epsilon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @f
    public static final double taylor_2_bound;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @f
    public static final double taylor_n_bound;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @f
    public static final double upper_taylor_2_bound;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @f
    public static final double upper_taylor_n_bound;

    static {
        double ulp = Math.ulp(1.0d);
        epsilon = ulp;
        double sqrt = Math.sqrt(ulp);
        taylor_2_bound = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        taylor_n_bound = sqrt2;
        double d5 = 1;
        upper_taylor_2_bound = d5 / sqrt;
        upper_taylor_n_bound = d5 / sqrt2;
    }

    private a() {
    }
}
