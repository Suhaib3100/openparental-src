package e2;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f22536a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f22537b;

    /* renamed from: c, reason: collision with root package name */
    private final b f22538c;

    public a(int i5, d... dVarArr) {
        this.f22536a = i5;
        this.f22537b = dVarArr;
        this.f22538c = new b(i5);
    }

    @Override // e2.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f22536a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f22537b) {
            if (stackTraceElementArr2.length <= this.f22536a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f22536a ? this.f22538c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
