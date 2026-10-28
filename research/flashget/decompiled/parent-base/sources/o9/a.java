package o9;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes6.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f83748a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f83749b;

    /* renamed from: c, reason: collision with root package name */
    private final b f83750c;

    public a(int i4, d... dVarArr) {
        this.f83748a = i4;
        this.f83749b = dVarArr;
        this.f83750c = new b(i4);
    }

    @Override // o9.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f83748a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f83749b) {
            if (stackTraceElementArr2.length <= this.f83748a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f83748a ? this.f83750c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
